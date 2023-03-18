package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.UAEDirhamKt.*;
import static eu.sirotin.kotunil.specialunits.NonSiUnitsKt.*;

public class  UAEDirhamJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(AED, new UAEDirham());
        Checker.check(AED.times(12), new UAEDirham(12.0));

        String s = AED.unitSymbols();
        Checker.check("AED", s);

        String s1 = AED.categorySymbols();
        Checker.check("Dh", s1);
        
        Expression c = m3.times(23).div(AED);
        Checker.check("m3/AED", c.unitSymbols());
    }
}