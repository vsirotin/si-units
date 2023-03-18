        
package eu.sirotin.kotunil.derived;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.derived.KatalKt.*;

public class  KatalJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(kat.plus(kat), kat.times(2));
              
        double pow30 = Math.pow(10.0, 30);
        Checker.check(kat.times(pow30), Qkat);
        Checker.check(kat.times(pow30), getQuettakatal(1.0));
          
        double pow27 = Math.pow(10.0, 27);
        Checker.check(kat.times(pow27), Rkat);
        Checker.check(kat.times(pow27), getRonnakatal(1.0));
          
        double pow24 = Math.pow(10.0, 24);
        Checker.check(kat.times(pow24), Ykat);
        Checker.check(kat.times(pow24), getYottakatal(1.0));
          
        double pow21 = Math.pow(10.0, 21);
        Checker.check(kat.times(pow21), Zkat);
        Checker.check(kat.times(pow21), getZettakatal(1.0));
          
        double pow18 = Math.pow(10.0, 18);
        Checker.check(kat.times(pow18), Ekat);
        Checker.check(kat.times(pow18), getExakatal(1.0));
          
        double pow15 = Math.pow(10.0, 15);
        Checker.check(kat.times(pow15), Pkat);
        Checker.check(kat.times(pow15), getPetakatal(1.0));
          
        double pow12 = Math.pow(10.0, 12);
        Checker.check(kat.times(pow12), Tkat);
        Checker.check(kat.times(pow12), getTerakatal(1.0));
          
        double pow9 = Math.pow(10.0, 9);
        Checker.check(kat.times(pow9), Gkat);
        Checker.check(kat.times(pow9), getGigakatal(1.0));
          
        double pow6 = Math.pow(10.0, 6);
        Checker.check(kat.times(pow6), Mkat);
        Checker.check(kat.times(pow6), getMegakatal(1.0));
          
        double pow3 = Math.pow(10.0, 3);
        Checker.check(kat.times(pow3), kkat);
        Checker.check(kat.times(pow3), getKilokatal(1.0));
          
        double pow2 = Math.pow(10.0, 2);
        Checker.check(kat.times(pow2), hkat);
        Checker.check(kat.times(pow2), getHectokatal(1.0));
          
        double pow1 = Math.pow(10.0, 1);
        Checker.check(kat.times(pow1), dakat);
        Checker.check(kat.times(pow1), getDecakatal(1.0));
          
        double powM1 = Math.pow(10.0, -1);
        Checker.check(kat.times(powM1), dkat);
        Checker.check(kat.times(powM1), getDecikatal(1.0));
          
        double powM2 = Math.pow(10.0, -2);
        Checker.check(kat.times(powM2), ckat);
        Checker.check(kat.times(powM2), getCentikatal(1.0));
          
        double powM3 = Math.pow(10.0, -3);
        Checker.check(kat.times(powM3), mkat);
        Checker.check(kat.times(powM3), getMillikatal(1.0));
          
        double powM6 = Math.pow(10.0, -6);
        Checker.check(kat.times(powM6), μkat);
        Checker.check(kat.times(powM6), getMicrokatal(1.0));
          
        double powM9 = Math.pow(10.0, -9);
        Checker.check(kat.times(powM9), nkat);
        Checker.check(kat.times(powM9), getNanokatal(1.0));
          
        double powM12 = Math.pow(10.0, -12);
        Checker.check(kat.times(powM12), pkat);
        Checker.check(kat.times(powM12), getPicokatal(1.0));
          
        double powM15 = Math.pow(10.0, -15);
        Checker.check(kat.times(powM15), fkat);
        Checker.check(kat.times(powM15), getFemtokatal(1.0));
          
        double powM18 = Math.pow(10.0, -18);
        Checker.check(kat.times(powM18), akat);
        Checker.check(kat.times(powM18), getAttokatal(1.0));
          
        double powM21 = Math.pow(10.0, -21);
        Checker.check(kat.times(powM21), zkat);
        Checker.check(kat.times(powM21), getZeptokatal(1.0));
          
        double powM24 = Math.pow(10.0, -24);
        Checker.check(kat.times(powM24), ykat);
        Checker.check(kat.times(powM24), getYoctokatal(1.0));
          
        double powM27 = Math.pow(10.0, -27);
        Checker.check(kat.times(powM27), rkat);
        Checker.check(kat.times(powM27), getRontokatal(1.0));
          
        double powM30 = Math.pow(10.0, -30);
        Checker.check(kat.times(powM30), qkat);
        Checker.check(kat.times(powM30), getQuectokatal(1.0));   }
}