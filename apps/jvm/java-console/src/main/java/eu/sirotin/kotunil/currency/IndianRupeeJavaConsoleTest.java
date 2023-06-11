package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.IndianRupeeKt.*;
import static eu.sirotin.kotunil.specialunits.MetreDerivedNonSiUnitsKt.*;

public class  IndianRupeeJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(INR, new IndianRupee());
        Checker.check(INR.times(12), new IndianRupee(12.0));

        String s = INR.unitSymbols();
        Checker.check("INR", s);

        String s1 = INR.categorySymbols();
        Checker.check("`₹`", s1);
        
        Expression c = m3.times(23).div(INR);
        Checker.check("m3/INR", c.unitSymbols());
    }
}