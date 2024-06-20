package eu.sirotin.kotunil.app.java;

import eu.sirotin.kotunil.base.BaseJavaConsoleTest;
import eu.sirotin.kotunil.currency.CurrencyJavaConsoleTest;
import eu.sirotin.kotunil.derived.DerivedJavaConsoleTest;

import static java.lang.System.exit;


public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome in KotUniL console test!");
        try {
            testAll();
        } catch (Throwable e) {
            System.err.println("Test failed with Throwable e=" + e.getMessage());
            e.printStackTrace(System.err);
            exit(1);
        }
        System.out.println("Test successfully completed!");

        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("|             |Test number|Number tested KotUniL's objects|Number tested KotUniL's objects types|");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("|Expectation: |     1593  |          705                  |          60                         |");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("|Test results:|     " + Checker.numberTests + "  |          " + Checker.getNumberTestedObjects() + "                  |          " + Checker.getNumberTestedObjectTypes() +"                         |");
        System.out.println("-------------------------------------------------------------------------------------------------");
    }

    private static void testAll() {
        new TutorialTest().testTutorial();
        new TutorialTestLong().testTutorialLong();
        BaseJavaConsoleTest.javaConsoleTests();
        DerivedJavaConsoleTest.javaConsoleTests();
        CurrencyJavaConsoleTest.javaConsoleTests();
        new DerivedAbstractTest().testDerivedAbstract();
    }

}
