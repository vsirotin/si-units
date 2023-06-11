package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.SwedishKronaKt.*;
import static eu.sirotin.kotunil.specialunits.MetreDerivedNonSiUnitsKt.*;

public class  SwedishKronaJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(SEK, new SwedishKrona());
        Checker.check(SEK.times(12), new SwedishKrona(12.0));

        String s = SEK.unitSymbols();
        Checker.check("SEK", s);

        String s1 = SEK.categorySymbols();
        Checker.check("skr", s1);
        
        Expression c = m3.times(23).div(SEK);
        Checker.check("m3/SEK", c.unitSymbols());
    }
}