package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.MexicanPesoKt.*;
import static eu.sirotin.kotunil.specialunits.NonSiUnitsKt.*;

public class  MexicanPesoJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(MXN, new MexicanPeso());
        Checker.check(MXN.times(12), new MexicanPeso(12.0));

        String s = MXN.unitSymbols();
        Checker.check("MXN", s);

        String s1 = MXN.categorySymbols();
        Checker.check("`$`", s1);
        
        Expression c = m3.times(23).div(MXN);
        Checker.check("m3/MXN", c.unitSymbols());
    }
}