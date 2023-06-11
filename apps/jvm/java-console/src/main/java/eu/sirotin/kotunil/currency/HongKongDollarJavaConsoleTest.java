package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.HongKongDollarKt.*;
import static eu.sirotin.kotunil.specialunits.MetreDerivedNonSiUnitsKt.*;

public class  HongKongDollarJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(HKD, new HongKongDollar());
        Checker.check(HKD.times(12), new HongKongDollar(12.0));

        String s = HKD.unitSymbols();
        Checker.check("HKD", s);

        String s1 = HKD.categorySymbols();
        Checker.check("`HK$`", s1);
        
        Expression c = m3.times(23).div(HKD);
        Checker.check("m3/HKD", c.unitSymbols());
    }
}