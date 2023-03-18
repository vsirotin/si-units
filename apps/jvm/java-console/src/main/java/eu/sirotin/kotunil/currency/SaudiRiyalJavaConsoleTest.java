package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.SaudiRiyalKt.*;
import static eu.sirotin.kotunil.specialunits.NonSiUnitsKt.*;

public class  SaudiRiyalJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(SAR, new SaudiRiyal());
        Checker.check(SAR.times(12), new SaudiRiyal(12.0));

        String s = SAR.unitSymbols();
        Checker.check("SAR", s);

        String s1 = SAR.categorySymbols();
        Checker.check("`﷼ `", s1);
        
        Expression c = m3.times(23).div(SAR);
        Checker.check("m3/SAR", c.unitSymbols());
    }
}