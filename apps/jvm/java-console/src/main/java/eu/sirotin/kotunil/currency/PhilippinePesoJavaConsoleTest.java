package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.PhilippinePesoKt.*;
import static eu.sirotin.kotunil.specialunits.NonSiUnitsKt.*;

public class  PhilippinePesoJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(PHP, new PhilippinePeso());
        Checker.check(PHP.times(12), new PhilippinePeso(12.0));

        String s = PHP.unitSymbols();
        Checker.check("PHP", s);

        String s1 = PHP.categorySymbols();
        Checker.check("`₱`", s1);
        
        Expression c = m3.times(23).div(PHP);
        Checker.check("m3/PHP", c.unitSymbols());
    }
}