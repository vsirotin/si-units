package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.SingaporeDollarKt.*;
import static eu.sirotin.kotunil.specialunits.NonSiUnitsKt.*;

public class  SingaporeDollarJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(SGD, new SingaporeDollar());
        Checker.check(SGD.times(12), new SingaporeDollar(12.0));

        String s = SGD.unitSymbols();
        Checker.check("SGD", s);

        String s1 = SGD.categorySymbols();
        Checker.check("`S$`", s1);
        
        Expression c = m3.times(23).div(SGD);
        Checker.check("m3/SGD", c.unitSymbols());
    }
}