package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.IndonesianRupiahKt.*;
import static eu.sirotin.kotunil.specialunits.NonSiUnitsKt.*;

public class  IndonesianRupiahJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(IDR, new IndonesianRupiah());
        Checker.check(IDR.times(12), new IndonesianRupiah(12.0));

        String s = IDR.unitSymbols();
        Checker.check("IDR", s);

        String s1 = IDR.categorySymbols();
        Checker.check("Rp", s1);
        
        Expression c = m3.times(23).div(IDR);
        Checker.check("m3/IDR", c.unitSymbols());
    }
}