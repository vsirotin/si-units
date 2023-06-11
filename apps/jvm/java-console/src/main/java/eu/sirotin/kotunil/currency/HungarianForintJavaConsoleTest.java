package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.HungarianForintKt.*;
import static eu.sirotin.kotunil.specialunits.MetreDerivedNonSiUnitsKt.*;

public class  HungarianForintJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(HUF, new HungarianForint());
        Checker.check(HUF.times(12), new HungarianForint(12.0));

        String s = HUF.unitSymbols();
        Checker.check("HUF", s);

        String s1 = HUF.categorySymbols();
        Checker.check("Ft", s1);
        
        Expression c = m3.times(23).div(HUF);
        Checker.check("m3/HUF", c.unitSymbols());
    }
}