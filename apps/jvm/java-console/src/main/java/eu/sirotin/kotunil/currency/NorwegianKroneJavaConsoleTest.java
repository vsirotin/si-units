package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.NorwegianKroneKt.*;
import static eu.sirotin.kotunil.specialunits.NonSiUnitsKt.*;

public class  NorwegianKroneJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(NOK, new NorwegianKrone());
        Checker.check(NOK.times(12), new NorwegianKrone(12.0));

        String s = NOK.unitSymbols();
        Checker.check("NOK", s);

        String s1 = NOK.categorySymbols();
        Checker.check("nkr", s1);
        
        Expression c = m3.times(23).div(NOK);
        Checker.check("m3/NOK", c.unitSymbols());
    }
}