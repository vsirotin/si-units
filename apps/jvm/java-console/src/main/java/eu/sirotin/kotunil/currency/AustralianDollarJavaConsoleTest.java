package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.AustralianDollarKt.*;
import static eu.sirotin.kotunil.specialunits.MetreDerivedNonSiUnitsKt.*;

public class  AustralianDollarJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(AUD, new AustralianDollar());
        Checker.check(AUD.times(12), new AustralianDollar(12.0));

        String s = AUD.unitSymbols();
        Checker.check("AUD", s);

        String s1 = AUD.categorySymbols();
        Checker.check("`A$`", s1);
        
        Expression c = m3.times(23).div(AUD);
        Checker.check("m3/AUD", c.unitSymbols());
    }
}