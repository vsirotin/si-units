package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.PolishZłotyKt.*;
import static eu.sirotin.kotunil.specialunits.NonSiUnitsKt.*;

public class  PolishZłotyJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(PLN, new PolishZłoty());
        Checker.check(PLN.times(12), new PolishZłoty(12.0));

        String s = PLN.unitSymbols();
        Checker.check("PLN", s);

        String s1 = PLN.categorySymbols();
        Checker.check("`zł`", s1);
        
        Expression c = m3.times(23).div(PLN);
        Checker.check("m3/PLN", c.unitSymbols());
    }
}