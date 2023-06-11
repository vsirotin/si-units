package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.MalaysianRinggitKt.*;
import static eu.sirotin.kotunil.specialunits.MetreDerivedNonSiUnitsKt.*;

public class  MalaysianRinggitJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(MYR, new MalaysianRinggit());
        Checker.check(MYR.times(12), new MalaysianRinggit(12.0));

        String s = MYR.unitSymbols();
        Checker.check("MYR", s);

        String s1 = MYR.categorySymbols();
        Checker.check("RM", s1);
        
        Expression c = m3.times(23).div(MYR);
        Checker.check("m3/MYR", c.unitSymbols());
    }
}