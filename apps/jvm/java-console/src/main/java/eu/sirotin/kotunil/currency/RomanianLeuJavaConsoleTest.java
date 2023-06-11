package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.RomanianLeuKt.*;
import static eu.sirotin.kotunil.specialunits.MetreDerivedNonSiUnitsKt.*;

public class  RomanianLeuJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(RON, new RomanianLeu());
        Checker.check(RON.times(12), new RomanianLeu(12.0));

        String s = RON.unitSymbols();
        Checker.check("RON", s);

        String s1 = RON.categorySymbols();
        Checker.check("RL", s1);
        
        Expression c = m3.times(23).div(RON);
        Checker.check("m3/RON", c.unitSymbols());
    }
}