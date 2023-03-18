package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.BrazilianRealKt.*;
import static eu.sirotin.kotunil.specialunits.NonSiUnitsKt.*;

public class  BrazilianRealJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(BRL, new BrazilianReal());
        Checker.check(BRL.times(12), new BrazilianReal(12.0));

        String s = BRL.unitSymbols();
        Checker.check("BRL", s);

        String s1 = BRL.categorySymbols();
        Checker.check("`R$`", s1);
        
        Expression c = m3.times(23).div(BRL);
        Checker.check("m3/BRL", c.unitSymbols());
    }
}