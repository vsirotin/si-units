package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.UnitedStatesDollarKt.*;
import static eu.sirotin.kotunil.specialunits.MetreDerivedNonSiUnitsKt.*;

public class  UnitedStatesDollarJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(USD, new UnitedStatesDollar());
        Checker.check(USD.times(12), new UnitedStatesDollar(12.0));

        String s = USD.unitSymbols();
        Checker.check("USD", s);

        String s1 = USD.categorySymbols();
        Checker.check("`US$`", s1);
        
        Expression c = m3.times(23).div(USD);
        Checker.check("m3/USD", c.unitSymbols());
    }
}