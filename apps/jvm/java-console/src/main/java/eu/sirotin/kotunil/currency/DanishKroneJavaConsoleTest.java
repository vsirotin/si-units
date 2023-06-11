package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.DanishKroneKt.*;
import static eu.sirotin.kotunil.specialunits.MetreDerivedNonSiUnitsKt.*;

public class  DanishKroneJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(DKK, new DanishKrone());
        Checker.check(DKK.times(12), new DanishKrone(12.0));

        String s = DKK.unitSymbols();
        Checker.check("DKK", s);

        String s1 = DKK.categorySymbols();
        Checker.check("dkr", s1);
        
        Expression c = m3.times(23).div(DKK);
        Checker.check("m3/DKK", c.unitSymbols());
    }
}