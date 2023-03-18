        
package eu.sirotin.kotunil.derived;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.derived.FaradKt.*;

public class  FaradJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(F.plus(F), F.times(2));
              
        double pow30 = Math.pow(10.0, 30);
        Checker.check(F.times(pow30), QF);
        Checker.check(F.times(pow30), getQuettafarad(1.0));
          
        double pow27 = Math.pow(10.0, 27);
        Checker.check(F.times(pow27), RF);
        Checker.check(F.times(pow27), getRonnafarad(1.0));
          
        double pow24 = Math.pow(10.0, 24);
        Checker.check(F.times(pow24), YF);
        Checker.check(F.times(pow24), getYottafarad(1.0));
          
        double pow21 = Math.pow(10.0, 21);
        Checker.check(F.times(pow21), ZF);
        Checker.check(F.times(pow21), getZettafarad(1.0));
          
        double pow18 = Math.pow(10.0, 18);
        Checker.check(F.times(pow18), EF);
        Checker.check(F.times(pow18), getExafarad(1.0));
          
        double pow15 = Math.pow(10.0, 15);
        Checker.check(F.times(pow15), PF);
        Checker.check(F.times(pow15), getPetafarad(1.0));
          
        double pow12 = Math.pow(10.0, 12);
        Checker.check(F.times(pow12), TF);
        Checker.check(F.times(pow12), getTerafarad(1.0));
          
        double pow9 = Math.pow(10.0, 9);
        Checker.check(F.times(pow9), GF);
        Checker.check(F.times(pow9), getGigafarad(1.0));
          
        double pow6 = Math.pow(10.0, 6);
        Checker.check(F.times(pow6), MF);
        Checker.check(F.times(pow6), getMegafarad(1.0));
          
        double pow3 = Math.pow(10.0, 3);
        Checker.check(F.times(pow3), kF);
        Checker.check(F.times(pow3), getKilofarad(1.0));
          
        double pow2 = Math.pow(10.0, 2);
        Checker.check(F.times(pow2), hF);
        Checker.check(F.times(pow2), getHectofarad(1.0));
          
        double pow1 = Math.pow(10.0, 1);
        Checker.check(F.times(pow1), daF);
        Checker.check(F.times(pow1), getDecafarad(1.0));
          
        double powM1 = Math.pow(10.0, -1);
        Checker.check(F.times(powM1), dF);
        Checker.check(F.times(powM1), getDecifarad(1.0));
          
        double powM2 = Math.pow(10.0, -2);
        Checker.check(F.times(powM2), cF);
        Checker.check(F.times(powM2), getCentifarad(1.0));
          
        double powM3 = Math.pow(10.0, -3);
        Checker.check(F.times(powM3), mF);
        Checker.check(F.times(powM3), getMillifarad(1.0));
          
        double powM6 = Math.pow(10.0, -6);
        Checker.check(F.times(powM6), μF);
        Checker.check(F.times(powM6), getMicrofarad(1.0));
          
        double powM9 = Math.pow(10.0, -9);
        Checker.check(F.times(powM9), nF);
        Checker.check(F.times(powM9), getNanofarad(1.0));
          
        double powM12 = Math.pow(10.0, -12);
        Checker.check(F.times(powM12), pF);
        Checker.check(F.times(powM12), getPicofarad(1.0));
          
        double powM15 = Math.pow(10.0, -15);
        Checker.check(F.times(powM15), fF);
        Checker.check(F.times(powM15), getFemtofarad(1.0));
          
        double powM18 = Math.pow(10.0, -18);
        Checker.check(F.times(powM18), aF);
        Checker.check(F.times(powM18), getAttofarad(1.0));
          
        double powM21 = Math.pow(10.0, -21);
        Checker.check(F.times(powM21), zF);
        Checker.check(F.times(powM21), getZeptofarad(1.0));
          
        double powM24 = Math.pow(10.0, -24);
        Checker.check(F.times(powM24), yF);
        Checker.check(F.times(powM24), getYoctofarad(1.0));
          
        double powM27 = Math.pow(10.0, -27);
        Checker.check(F.times(powM27), rF);
        Checker.check(F.times(powM27), getRontofarad(1.0));
          
        double powM30 = Math.pow(10.0, -30);
        Checker.check(F.times(powM30), qF);
        Checker.check(F.times(powM30), getQuectofarad(1.0));   }
}