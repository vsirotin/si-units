package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.RenminbiKt.*;
import static eu.sirotin.kotunil.specialunits.NonSiUnitsKt.*;

public class  RenminbiJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(CNY, new Renminbi());
        Checker.check(CNY.times(12), new Renminbi(12.0));

        String s = CNY.unitSymbols();
        Checker.check("CNY", s);

        String s1 = CNY.categorySymbols();
        Checker.check("`人民币`", s1);
        
        Expression c = m3.times(23).div(CNY);
        Checker.check("m3/CNY", c.unitSymbols());
    }
}