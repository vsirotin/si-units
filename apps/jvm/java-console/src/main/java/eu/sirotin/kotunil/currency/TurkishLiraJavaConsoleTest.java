package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.TurkishLiraKt.*;
import static eu.sirotin.kotunil.specialunits.NonSiUnitsKt.*;

public class  TurkishLiraJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(TRY, new TurkishLira());
        Checker.check(TRY.times(12), new TurkishLira(12.0));

        String s = TRY.unitSymbols();
        Checker.check("TRY", s);

        String s1 = TRY.categorySymbols();
        Checker.check("`₺`", s1);
        
        Expression c = m3.times(23).div(TRY);
        Checker.check("m3/TRY", c.unitSymbols());
    }
}