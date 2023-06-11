package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.ChileanPesoKt.*;
import static eu.sirotin.kotunil.specialunits.MetreDerivedNonSiUnitsKt.*;

public class  ChileanPesoJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(CLP, new ChileanPeso());
        Checker.check(CLP.times(12), new ChileanPeso(12.0));

        String s = CLP.unitSymbols();
        Checker.check("CLP", s);

        String s1 = CLP.categorySymbols();
        Checker.check("`CLP$`", s1);
        
        Expression c = m3.times(23).div(CLP);
        Checker.check("m3/CLP", c.unitSymbols());
    }
}