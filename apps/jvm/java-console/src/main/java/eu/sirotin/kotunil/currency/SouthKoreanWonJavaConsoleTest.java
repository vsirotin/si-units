package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.SouthKoreanWonKt.*;
import static eu.sirotin.kotunil.specialunits.NonSiUnitsKt.*;

public class  SouthKoreanWonJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(KRW, new SouthKoreanWon());
        Checker.check(KRW.times(12), new SouthKoreanWon(12.0));

        String s = KRW.unitSymbols();
        Checker.check("KRW", s);

        String s1 = KRW.categorySymbols();
        Checker.check("`₩`", s1);
        
        Expression c = m3.times(23).div(KRW);
        Checker.check("m3/KRW", c.unitSymbols());
    }
}