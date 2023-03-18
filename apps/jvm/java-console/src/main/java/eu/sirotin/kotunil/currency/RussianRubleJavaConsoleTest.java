package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.RussianRubleKt.*;
import static eu.sirotin.kotunil.specialunits.NonSiUnitsKt.*;

public class  RussianRubleJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(RUB, new RussianRuble());
        Checker.check(RUB.times(12), new RussianRuble(12.0));

        String s = RUB.unitSymbols();
        Checker.check("RUB", s);

        String s1 = RUB.categorySymbols();
        Checker.check("`₽`", s1);
        
        Expression c = m3.times(23).div(RUB);
        Checker.check("m3/RUB", c.unitSymbols());
    }
}