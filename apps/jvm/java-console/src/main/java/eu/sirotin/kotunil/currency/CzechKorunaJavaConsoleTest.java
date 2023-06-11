package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.CzechKorunaKt.*;
import static eu.sirotin.kotunil.specialunits.MetreDerivedNonSiUnitsKt.*;

public class  CzechKorunaJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(CZK, new CzechKoruna());
        Checker.check(CZK.times(12), new CzechKoruna(12.0));

        String s = CZK.unitSymbols();
        Checker.check("CZK", s);

        String s1 = CZK.categorySymbols();
        Checker.check("`Kč`", s1);
        
        Expression c = m3.times(23).div(CZK);
        Checker.check("m3/CZK", c.unitSymbols());
    }
}