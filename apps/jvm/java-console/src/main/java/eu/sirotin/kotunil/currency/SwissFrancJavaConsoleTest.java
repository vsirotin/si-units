package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.SwissFrancKt.*;
import static eu.sirotin.kotunil.specialunits.NonSiUnitsKt.*;

public class  SwissFrancJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(CHF, new SwissFranc());
        Checker.check(CHF.times(12), new SwissFranc(12.0));

        String s = CHF.unitSymbols();
        Checker.check("CHF", s);

        String s1 = CHF.categorySymbols();
        Checker.check("SCHF", s1);
        
        Expression c = m3.times(23).div(CHF);
        Checker.check("m3/CHF", c.unitSymbols());
    }
}