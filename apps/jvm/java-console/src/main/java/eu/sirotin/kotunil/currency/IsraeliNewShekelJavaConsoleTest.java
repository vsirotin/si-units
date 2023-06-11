package eu.sirotin.kotunil.currency;
   

import eu.sirotin.kotunil.app.java.Checker;
import eu.sirotin.kotunil.core.Expression;
import static eu.sirotin.kotunil.currency.IsraeliNewShekelKt.*;
import static eu.sirotin.kotunil.specialunits.MetreDerivedNonSiUnitsKt.*;

public class  IsraeliNewShekelJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(ILS, new IsraeliNewShekel());
        Checker.check(ILS.times(12), new IsraeliNewShekel(12.0));

        String s = ILS.unitSymbols();
        Checker.check("ILS", s);

        String s1 = ILS.categorySymbols();
        Checker.check("`₪`", s1);
        
        Expression c = m3.times(23).div(ILS);
        Checker.check("m3/ILS", c.unitSymbols());
    }
}