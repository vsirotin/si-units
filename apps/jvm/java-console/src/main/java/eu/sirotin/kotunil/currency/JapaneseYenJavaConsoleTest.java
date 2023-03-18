package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.JapaneseYenKt.*;
import static eu.sirotin.kotunil.specialunits.NonSiUnitsKt.*;

public class  JapaneseYenJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(JPY, new JapaneseYen());
        Checker.check(JPY.times(12), new JapaneseYen(12.0));

        String s = JPY.unitSymbols();
        Checker.check("JPY", s);

        String s1 = JPY.categorySymbols();
        Checker.check("`¥`", s1);
        
        Expression c = m3.times(23).div(JPY);
        Checker.check("m3/JPY", c.unitSymbols());
    }
}