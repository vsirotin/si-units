/*
 * Copyright (c) 2023.  Viktor Sirotin
 *
 *  *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  * of this software and associated documentation files (the "Software"), to deal
 *  * in the Software without restriction, including without limitation the rights
 *  * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  * copies of the Software, and to permit persons to whom the Software is
 *  *  furnished to do so, subject to the following conditions:
 *  *  This Copyright header should still in file if you use it file without changes or
 *  * with changes or if you copy essential part of this file in some new file.
 *  *  *
 *  * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 *  * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  * THE SOFTWARE.
 *
 */

package eu.sirotin.kotunil.generator.apps.jvm.java

import eu.sirotin.kotunil.generator.SiPrefix
import eu.sirotin.kotunil.generator.SiUnitDescription
import eu.sirotin.kotunil.generator.generateSiUnitBaseTestFiles
import eu.sirotin.kotunil.generator.getDerivedClassName
import java.io.File
import java.nio.file.Files
import kotlin.math.abs


private val testClasses = mutableListOf<String>()
fun generateSiUnitsBaseClassesTests() {
    //Generate tester classes
    generateSiUnitBaseTestFiles("${ROOT_JAVA_CONSOLE_PATH}base",
        "JavaConsoleTest.java",
        ::generateTestClassHeadPart,
        ::generateTestPartForPrefix,
        "   }${System.lineSeparator()}}"
    )

    generateCaller("${ROOT_JAVA_CONSOLE_PATH}base",
        "BaseJavaConsoleTest.java",
        testClasses,
        ::generateJavaConsoleTestCaller
    )
}

fun generateJavaConsoleTestCaller(testClassNames: List<String>, typeName: String): String {
    val capitalizedName = capitalizeFirst(typeName)
    return """
package eu.sirotin.kotunil.$typeName;

public class ${capitalizedName}JavaConsoleTest {
     public static void javaConsoleTests() {
""" +
    testClassNames.joinToString(System.lineSeparator()) { "         ${it}JavaConsoleTest.javaConsoleTest();" } +
"${System.lineSeparator()}   }${System.lineSeparator()}}";
}

fun generateCaller(dirPath: String,
        fileName: String,
        testClassNames: List<String>,
        generator: (List<String>, String) -> String,
        typeName: String = "base"
) {
    val dir = File(dirPath)
    if (!dir.exists()) Files.createDirectories(dir.toPath())
    val file = dir.resolve(fileName)
    file.delete()
    val classText = generator(testClassNames, typeName)

    file.writeText(classText)
}

private fun generateTestClassHeadPart(
    siUnitDescription: SiUnitDescription): String {
    val className = getDerivedClassName(siUnitDescription)
    testClasses += className
    val unitSymbol = siUnitDescription.unitSymbol
    return """        
package eu.sirotin.kotunil.base;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.base.${className}Kt.*;

public class  ${className}JavaConsoleTest {

        public static void javaConsoleTest() {

       Checker.check(new ${className}(1.0), $unitSymbol);
       Checker.check($unitSymbol.times(1.3) , new ${className}(1.3));
"""
}

val EXCLUDED_ABBREVIATIONS = listOf("as", "kkg") //Name conflicts
private fun generateTestPartForPrefix( siPrefix: SiPrefix,
                                       siUnitDescription: SiUnitDescription): String {
    val className = getDerivedClassName(siUnitDescription)
    val name = siUnitDescription.name
    val unitSymbol = siUnitDescription.unitSymbol

    if("${siPrefix.symbol}$unitSymbol" in  EXCLUDED_ABBREVIATIONS)return "" //Special case with kilogram

    val powName = generatePowName(siPrefix.degree)
    return """   
        
        double $powName = Math.pow(10.0, ${siPrefix.degree});
        Checker.check(new $className(1.0).times($powName), ${siPrefix.symbol}$unitSymbol);
        Checker.check(new $className(1.0).times($powName), get${capitalizeFirst(siPrefix.name)}$name());
        Checker.check(${siPrefix.symbol}$unitSymbol, get${capitalizeFirst(siPrefix.name)}$name());
"""
}
fun capitalizeFirst(s: String): String {
    return s.replaceFirstChar { it.uppercase() }
}

fun generatePowName(degree: Int): String {
    return "pow" + if(degree >= 0) degree else "M${abs(degree)}"
}
