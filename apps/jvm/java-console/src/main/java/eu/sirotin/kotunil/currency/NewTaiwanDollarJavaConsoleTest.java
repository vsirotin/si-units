package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.NewTaiwanDollarKt.*;
import static eu.sirotin.kotunil.specialunits.MetreDerivedNonSiUnitsKt.*;

public class  NewTaiwanDollarJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(TWD, new NewTaiwanDollar());
        Checker.check(TWD.times(12), new NewTaiwanDollar(12.0));

        String s = TWD.unitSymbols();
        Checker.check("TWD", s);

        String s1 = TWD.categorySymbols();
        Checker.check("`NT$`", s1);
        
        Expression c = m3.times(23).div(TWD);
        Checker.check("m3/TWD", c.unitSymbols());
    }
}