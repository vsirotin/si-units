package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.SouthAfricanRandKt.*;
import static eu.sirotin.kotunil.specialunits.MetreDerivedNonSiUnitsKt.*;

public class  SouthAfricanRandJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(ZAR, new SouthAfricanRand());
        Checker.check(ZAR.times(12), new SouthAfricanRand(12.0));

        String s = ZAR.unitSymbols();
        Checker.check("ZAR", s);

        String s1 = ZAR.categorySymbols();
        Checker.check("R", s1);
        
        Expression c = m3.times(23).div(ZAR);
        Checker.check("m3/ZAR", c.unitSymbols());
    }
}