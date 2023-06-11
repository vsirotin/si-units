/*
 * Copyright (c) 2022.  Viktor Sirotin
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

package eu.sirotin.kotunil.app.java;

import eu.sirotin.kotunil.base.*;
import eu.sirotin.kotunil.core.Expression;
import eu.sirotin.kotunil.core.ExpressionKt;
import static eu.sirotin.kotunil.base.AmpereKt.*;
import static eu.sirotin.kotunil.base.MetreKt.*;
import static eu.sirotin.kotunil.base.SecondKt.*;
import static eu.sirotin.kotunil.base.KilogramKt.*;
import static eu.sirotin.kotunil.specialunits.MetreDerivedNonSiUnitsKt.*;
import static eu.sirotin.kotunil.specialunits.KilogramDerivedNonSiUnitsKt.*;
import static eu.sirotin.kotunil.derived.TeslaKt.*;
import static eu.sirotin.kotunil.derived.WeberKt.*;
import static eu.sirotin.kotunil.core.ExpressionKt.*;

public class TutorialTest {

    public void testTutorial() {
        testHappyGettingStarted();
        testDimensionAnalysis();
        testCategorySymbols();
        testErrors();
        testCompareTheSameTypes();
        testCompareDifferentType();
        testBaseUnits();
        testDerivedUnits();
        testPrefixes();
        testNonSiUnits();
    }


    private void testHappyGettingStarted() {
        //Eva broke a glass in her aquarium and water flowed to the bottom.
        // In aquarium before the break was 20 liters of water.
        // Eva's room is 4 m. long and 5 tall.
        // How high in mm. is water now in Eva's room with assumption that it stayed there and did not flow away?

        //The solution in Kotlin can be written in one line.
        // For didactic reasons as introduce two auxiliary variables s and h.
        //Below commented related lines from Kotlin's tutorial.

//        val s = 4.m * 5.m
        Expression s = m.times(4).times(m.times(5));
//        val v = 20.l
        Expression v = L.times(20);
//        val h = v / s
        Expression h = v.div(s);
//        val z = h / mm
        Expression z = h.div(mm);

        Checker.check(1.0, z.getValue());

//        //the same as statement
//        check(1.0, ((20.l / (4.m * 5.m)) / mm).value, ε)
        Checker.check(1.0,
                        L.times(20)
                                .div(
                                        (m.times(4).times(m.times(5)))).div(mm)

                              .getValue());
   }


    private void testDimensionAnalysis() {
        //With the help of the built-in function unitSymbols you can get the dimension of any object in terms of SI standard.

        Expression s1 = m.times(4).times(m.times(5));
        Checker.check("m2", s1.unitSymbols());
        Expression x = L.times(20);
        Checker.check("m3", x.unitSymbols());
        Expression h = x.div(s1);
        Checker.check("m", h.unitSymbols());

        Expression y = s.times(1.2);
        Checker.check("s", y.unitSymbols());

        Expression z = x.div(y);
        Checker.check("m3/s", z.unitSymbols());

    }

    private void testCategorySymbols() {
        //Using the built-in function categorySymbols() you can analyze dimensions
        // of physical units in "academic" manner.
        Expression s1 = m.times(4).times(m.times(5));
        Checker.check("L2", s1.categorySymbols());

        Expression x = L.times(20);
        Checker.check("L3", x.categorySymbols());

        Expression h = x.div(s1);
        Checker.check("L", h.categorySymbols());

        Expression y = s.times(1.2);
        Checker.check("T", y.categorySymbols());

        Expression z = x.div(y);
        Checker.check("L3T-1", z.categorySymbols());

    }

//---------------Type safety
//Physical units of the same dimension can be added, added,
//divided and compared.
//If you try to do this with units of different types,
//you will get either compilation errors (for simple units) or run-time errors for complicated units.
    private void testErrors() {
        //Simple errors will be found on compilation phase:
        //Expression x = ExpressionKt.plus(new Metre(1), 2); // compiler error

        //Complex errors will be found in runtime:
        try {
            m.times(4).plus(s.times(2));
        }catch (IllegalArgumentException e) {
            if (e.getMessage().startsWith(ExpressionKt.COMPATIBILITY_ERR_PREFIX))return;
        }
        throw new IllegalStateException("Should be mot called!");
    }


    //Comparison of objects---------
    //
    //Physical objects can be compared only if they have the same dimensions,
    // otherwise you will get a run-time error.

    private void testCompareTheSameTypes() {
        Checker.check(m.times(5).compareTo(m.times(4.1)) > 0);

        Checker.check(m3.times(4.21).compareTo(
                m3.times( 4.2)) > 0);

    }

    private void testCompareDifferentType() {
        Expression v1 = m.times(2.4);
        Expression v2 = s.times(2.4);

        try {
            v1.compareTo(v2);
        }catch (IllegalArgumentException e) {
            if (e.getMessage().startsWith(ExpressionKt.COMPATIBILITY_ERR_PREFIX))return;
        }
        throw new IllegalStateException("Should be mot called!");
    }


    private void testBaseUnits() {
        Checker.check(new Second(1.1), s.times(1.1));
        Checker.check(s.times(1.2), new Second(1.2));

        Checker.check(new Kilogram(1.3), kg.times(1.3));
    }

    private void testDerivedUnits() {
        Checker.check(T ,kg.times(s.pw(-2)).times(A.pw(-1)));

        Checker.check(T, Wb.div(m2));
    }

    private void testPrefixes() {
        Expression d = km.minus(μm.times(Math.pow(10, 9)));
        Checker.check(Math.abs(d.getValue()) < ε);
    }

    private void testNonSiUnits() {
        //A city park has area 2.35 hectares. During a rain 1 mm of water had fallen from the sky.
        //If there was no rain, the park should be watered with water from car cisterns.
        // A car cistern can carry 4 tons of water.
        //How many cisterns are needed to achieve the same effect as in case of rain?
        //Reminder: density of watter is 1 kg/l
        Expression s = ha.times(2.35);
        Expression ω = s.times(mm); //water volume
        Expression ρ = kg.div(L); //density of watter is 1 kg/l
        Expression τ = ω.times(ρ); //common water weight of rain
        Expression n = τ.div(t.times(4));

        Checker.check(5.875, n.getValue());

    }
}
