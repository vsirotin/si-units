        
package eu.sirotin.kotunil.derived;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.derived.HenryKt.*;

public class  HenryJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(H.plus(H), H.times(2));

              
        double pow30 = Math.pow(10.0, 30);
        Checker.check(H.times(pow30), QH);
        Checker.check(H.times(pow30), getQuettahenry(1.0));
          
        double pow27 = Math.pow(10.0, 27);
        Checker.check(H.times(pow27), RH);
        Checker.check(H.times(pow27), getRonnahenry(1.0));
          
        double pow24 = Math.pow(10.0, 24);
        Checker.check(H.times(pow24), YH);
        Checker.check(H.times(pow24), getYottahenry(1.0));
          
        double pow21 = Math.pow(10.0, 21);
        Checker.check(H.times(pow21), ZH);
        Checker.check(H.times(pow21), getZettahenry(1.0));
          
        double pow18 = Math.pow(10.0, 18);
        Checker.check(H.times(pow18), EH);
        Checker.check(H.times(pow18), getExahenry(1.0));
          
        double pow15 = Math.pow(10.0, 15);
        Checker.check(H.times(pow15), PH);
        Checker.check(H.times(pow15), getPetahenry(1.0));
          
        double pow12 = Math.pow(10.0, 12);
        Checker.check(H.times(pow12), TH);
        Checker.check(H.times(pow12), getTerahenry(1.0));
          
        double pow9 = Math.pow(10.0, 9);
        Checker.check(H.times(pow9), GH);
        Checker.check(H.times(pow9), getGigahenry(1.0));
          
        double pow6 = Math.pow(10.0, 6);
        Checker.check(H.times(pow6), MH);
        Checker.check(H.times(pow6), getMegahenry(1.0));
          
        double pow3 = Math.pow(10.0, 3);
        Checker.check(H.times(pow3), kH);
        Checker.check(H.times(pow3), getKilohenry(1.0));
          
        double pow2 = Math.pow(10.0, 2);
        Checker.check(H.times(pow2), hH);
        Checker.check(H.times(pow2), getHectohenry(1.0));
          
        double pow1 = Math.pow(10.0, 1);
        Checker.check(H.times(pow1), daH);
        Checker.check(H.times(pow1), getDecahenry(1.0));
          
        double powM1 = Math.pow(10.0, -1);
        Checker.check(H.times(powM1), dH);
        Checker.check(H.times(powM1), getDecihenry(1.0));
          
        double powM2 = Math.pow(10.0, -2);
        Checker.check(H.times(powM2), cH);
        Checker.check(H.times(powM2), getCentihenry(1.0));
          
        double powM3 = Math.pow(10.0, -3);
        Checker.check(H.times(powM3), mH);
        Checker.check(H.times(powM3), getMillihenry(1.0));
          
        double powM6 = Math.pow(10.0, -6);
        Checker.check(H.times(powM6), μH);
        Checker.check(H.times(powM6), getMicrohenry(1.0));
          
        double powM9 = Math.pow(10.0, -9);
        Checker.check(H.times(powM9), nH);
        Checker.check(H.times(powM9), getNanohenry(1.0));
          
        double powM12 = Math.pow(10.0, -12);
        Checker.check(H.times(powM12), pH);
        Checker.check(H.times(powM12), getPicohenry(1.0));
          
        double powM15 = Math.pow(10.0, -15);
        Checker.check(H.times(powM15), fH);
        Checker.check(H.times(powM15), getFemtohenry(1.0));
          
        double powM18 = Math.pow(10.0, -18);
        Checker.check(H.times(powM18), aH);
        Checker.check(H.times(powM18), getAttohenry(1.0));
          
        double powM21 = Math.pow(10.0, -21);
        Checker.check(H.times(powM21), zH);
        Checker.check(H.times(powM21), getZeptohenry(1.0));
          
        double powM24 = Math.pow(10.0, -24);
        Checker.check(H.times(powM24), yH);
        Checker.check(H.times(powM24), getYoctohenry(1.0));
          
        double powM27 = Math.pow(10.0, -27);
        Checker.check(H.times(powM27), rH);
        Checker.check(H.times(powM27), getRontohenry(1.0));
          
        double powM30 = Math.pow(10.0, -30);
        Checker.check(H.times(powM30), qH);
        Checker.check(H.times(powM30), getQuectohenry(1.0));   }
}