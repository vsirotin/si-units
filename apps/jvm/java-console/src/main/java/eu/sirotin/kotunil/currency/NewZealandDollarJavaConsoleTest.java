package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.NewZealandDollarKt.*;
import static eu.sirotin.kotunil.specialunits.MetreDerivedNonSiUnitsKt.*;

public class  NewZealandDollarJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(NZD, new NewZealandDollar());
        Checker.check(NZD.times(12), new NewZealandDollar(12.0));

        String s = NZD.unitSymbols();
        Checker.check("NZD", s);

        String s1 = NZD.categorySymbols();
        Checker.check("`NZ$`", s1);
        
        Expression c = m3.times(23).div(NZD);
        Checker.check("m3/NZD", c.unitSymbols());
    }
}