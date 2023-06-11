package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.PoundSterlingKt.*;
import static eu.sirotin.kotunil.specialunits.MetreDerivedNonSiUnitsKt.*;

public class  PoundSterlingJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(GBP, new PoundSterling());
        Checker.check(GBP.times(12), new PoundSterling(12.0));

        String s = GBP.unitSymbols();
        Checker.check("GBP", s);

        String s1 = GBP.categorySymbols();
        Checker.check("`£`", s1);
        
        Expression c = m3.times(23).div(GBP);
        Checker.check("m3/GBP", c.unitSymbols());
    }
}