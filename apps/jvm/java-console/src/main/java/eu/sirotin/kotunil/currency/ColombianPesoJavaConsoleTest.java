package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.ColombianPesoKt.*;
import static eu.sirotin.kotunil.specialunits.MetreDerivedNonSiUnitsKt.*;

public class  ColombianPesoJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(COP, new ColombianPeso());
        Checker.check(COP.times(12), new ColombianPeso(12.0));

        String s = COP.unitSymbols();
        Checker.check("COP", s);

        String s1 = COP.categorySymbols();
        Checker.check("`COL$`", s1);
        
        Expression c = m3.times(23).div(COP);
        Checker.check("m3/COP", c.unitSymbols());
    }
}