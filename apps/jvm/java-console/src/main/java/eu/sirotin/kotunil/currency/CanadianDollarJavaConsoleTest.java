package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.CanadianDollarKt.*;
import static eu.sirotin.kotunil.specialunits.NonSiUnitsKt.*;

public class  CanadianDollarJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(CAD, new CanadianDollar());
        Checker.check(CAD.times(12), new CanadianDollar(12.0));

        String s = CAD.unitSymbols();
        Checker.check("CAD", s);

        String s1 = CAD.categorySymbols();
        Checker.check("`C$`", s1);
        
        Expression c = m3.times(23).div(CAD);
        Checker.check("m3/CAD", c.unitSymbols());
    }
}