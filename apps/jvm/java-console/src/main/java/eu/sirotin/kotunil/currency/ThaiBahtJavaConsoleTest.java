package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.ThaiBahtKt.*;
import static eu.sirotin.kotunil.specialunits.NonSiUnitsKt.*;

public class  ThaiBahtJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(THB, new ThaiBaht());
        Checker.check(THB.times(12), new ThaiBaht(12.0));

        String s = THB.unitSymbols();
        Checker.check("THB", s);

        String s1 = THB.categorySymbols();
        Checker.check("`฿`", s1);
        
        Expression c = m3.times(23).div(THB);
        Checker.check("m3/THB", c.unitSymbols());
    }
}