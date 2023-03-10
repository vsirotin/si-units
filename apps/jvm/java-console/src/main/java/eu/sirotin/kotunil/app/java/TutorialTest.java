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
import eu.sirotin.kotunil.derived.TeslaKt;
import eu.sirotin.kotunil.derived.WeberKt;
import eu.sirotin.kotunil.specialunits.NonSiUnitsKt;

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
        Expression s = ExpressionKt.times(new Metre(4), new Metre(5));
//        val x = 20.l
        Expression x = NonSiUnitsKt.getL(20);
//        val h = x / s
        Expression h = ExpressionKt.div(x,s);
//        val z = h / mm
        Expression z = ExpressionKt.div(h, MetreKt.mm);

        Checker.check(1.0, z.getValue());

//        //the same as statement
//        check(1.0, ((20.l / (4.m * 5.m)) / mm).value, ε)
        Checker.check(1.0,
                ExpressionKt.div(
                        ExpressionKt.div(
                                NonSiUnitsKt.getL(20),
                                ExpressionKt.times(new Metre(4), new Metre(5))),
                        MetreKt.mm)
                              .getValue());
   }


    private void testDimensionAnalysis() {
        //With the help of the built-in function unitSymbols you can get the dimension of any object in terms of SI standard.

        Expression s = ExpressionKt.times(new Metre(4), new Metre(5));
        Checker.check("m2", s.unitSymbols());
        Expression x = NonSiUnitsKt.getL(20);
        Checker.check("m3", x.unitSymbols());
        Expression h = ExpressionKt.div(x, s);
        Checker.check("m", h.unitSymbols());

        Expression y = ExpressionKt.times(new Second(1.0), 1.2);
        Checker.check("s", y.unitSymbols());

        Expression z = ExpressionKt.div(x, y);
        Checker.check("m3/s", z.unitSymbols());

    }

    private void testCategorySymbols() {
        //Using the built-in function categorySymbols() you can analyze dimensions
        // of physical units in "academic" manner.
        Expression s = ExpressionKt.times(new Metre(4), new Metre(5));
        Checker.check("L2", s.categorySymbols());

        Expression x = NonSiUnitsKt.getL(20);
        Checker.check("L3", x.categorySymbols());

        Expression h = ExpressionKt.div(x, s);
        Checker.check("L", h.categorySymbols());

        Expression y = ExpressionKt.times(new Second(1), 1.2);
        Checker.check("T", y.categorySymbols());

        Expression z = ExpressionKt.div(x, y);
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
            ExpressionKt.plus(new Metre(4), new Second(2));
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
        Checker.check(new Metre(5).compareTo(new Metre(4.1)) > 0);

        Checker.check(ExpressionKt.times(NonSiUnitsKt.getM3(),20.2).compareTo(
                ExpressionKt.times(NonSiUnitsKt.getM3(), 4.2)) > 0);

    }

    private void testCompareDifferentType() {
        Expression v1 = new Metre(2.4);
        Expression v2 = new Second(2.4);

        try {
            v1.compareTo(v2);
        }catch (IllegalArgumentException e) {
            if (e.getMessage().startsWith(ExpressionKt.COMPATIBILITY_ERR_PREFIX))return;
        }
        throw new IllegalStateException("Should be mot called!");
    }


    private void testBaseUnits() {
        Checker.check(new Second(1.1), SecondKt.getS(1.1));
        Checker.check(ExpressionKt.times(new Second(1.0), 1.2), new Second(1.2));

        Checker.check(new Kilogram(1.3), ExpressionKt.times(new Kilogram(1.0), 1.3));
    }

    private void testDerivedUnits() {
        Checker.check(TeslaKt.getT(),ExpressionKt.times(new Kilogram(1.0),
                ExpressionKt.times(
                        ExpressionKt.pow(new Second(1.0),-2),
                        ExpressionKt.pow(new Ampere(1.0), -1))
                                    )
                    );

        Checker.check(TeslaKt.getT(),	ExpressionKt.div(WeberKt.getWb(), NonSiUnitsKt.getM2()));
    }

    private void testPrefixes() {
        Expression d = ExpressionKt.minus(MetreKt.getKm(1), ExpressionKt.times(Math.pow(10, 9), MetreKt.getμm(1)));
        Checker.check(Math.abs(d.getValue()) < ExpressionKt.ε);
    }

    private void testNonSiUnits() {
        //A city park has area 2.35 hectares. During a rain 1 mm of water had fallen from the sky.
        //If there was no rain, the park should be watered with water from car cisterns.
        // A car cistern can carry 4 tons of water.
        //How many cisterns are needed to achieve the same effect as in case of rain?
        //Reminder: density of watter is 1 kg/l

        Expression s = NonSiUnitsKt.getHa(2.35);
        Expression ω = ExpressionKt.times(s, MetreKt.getMm(1.0)); //water volume
        Expression ρ = ExpressionKt.div(new Kilogram(1.0), NonSiUnitsKt.getL()); //density of watter is 1 kg/l
        Expression τ = ExpressionKt.times(ω , ρ); //common water weight of rain
        Expression n = ExpressionKt.div(τ, ExpressionKt.times(NonSiUnitsKt.getT(), 4));
        Checker.check(5.875, n.getValue());

    }
}
