package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.EuroKt.*;
import static eu.sirotin.kotunil.specialunits.MetreDerivedNonSiUnitsKt.*;

public class  EuroJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(EUR, new Euro());
        Checker.check(EUR.times(12), new Euro(12.0));

        String s = EUR.unitSymbols();
        Checker.check("EUR", s);

        String s1 = EUR.categorySymbols();
        Checker.check("`€`", s1);
        
        Expression c = m3.times(23).div(EUR);
        Checker.check("m3/EUR", c.unitSymbols());
    }
}