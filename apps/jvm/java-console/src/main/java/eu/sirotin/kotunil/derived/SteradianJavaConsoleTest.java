        
package eu.sirotin.kotunil.derived;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.derived.SteradianKt.*;

public class  SteradianJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(sr.plus(sr), sr.times(2));

              
        double pow30 = Math.pow(10.0, 30);
        Checker.check(sr.times(pow30), Qsr);
        Checker.check(sr.times(pow30), getQuettasteradian(1.0));
          
        double pow27 = Math.pow(10.0, 27);
        Checker.check(sr.times(pow27), Rsr);
        Checker.check(sr.times(pow27), getRonnasteradian(1.0));
          
        double pow24 = Math.pow(10.0, 24);
        Checker.check(sr.times(pow24), Ysr);
        Checker.check(sr.times(pow24), getYottasteradian(1.0));
          
        double pow21 = Math.pow(10.0, 21);
        Checker.check(sr.times(pow21), Zsr);
        Checker.check(sr.times(pow21), getZettasteradian(1.0));
          
        double pow18 = Math.pow(10.0, 18);
        Checker.check(sr.times(pow18), Esr);
        Checker.check(sr.times(pow18), getExasteradian(1.0));
          
        double pow15 = Math.pow(10.0, 15);
        Checker.check(sr.times(pow15), Psr);
        Checker.check(sr.times(pow15), getPetasteradian(1.0));
          
        double pow12 = Math.pow(10.0, 12);
        Checker.check(sr.times(pow12), Tsr);
        Checker.check(sr.times(pow12), getTerasteradian(1.0));
          
        double pow9 = Math.pow(10.0, 9);
        Checker.check(sr.times(pow9), Gsr);
        Checker.check(sr.times(pow9), getGigasteradian(1.0));
          
        double pow6 = Math.pow(10.0, 6);
        Checker.check(sr.times(pow6), Msr);
        Checker.check(sr.times(pow6), getMegasteradian(1.0));
          
        double pow3 = Math.pow(10.0, 3);
        Checker.check(sr.times(pow3), ksr);
        Checker.check(sr.times(pow3), getKilosteradian(1.0));
          
        double pow2 = Math.pow(10.0, 2);
        Checker.check(sr.times(pow2), hsr);
        Checker.check(sr.times(pow2), getHectosteradian(1.0));
          
        double pow1 = Math.pow(10.0, 1);
        Checker.check(sr.times(pow1), dasr);
        Checker.check(sr.times(pow1), getDecasteradian(1.0));
          
        double powM1 = Math.pow(10.0, -1);
        Checker.check(sr.times(powM1), dsr);
        Checker.check(sr.times(powM1), getDecisteradian(1.0));
          
        double powM2 = Math.pow(10.0, -2);
        Checker.check(sr.times(powM2), csr);
        Checker.check(sr.times(powM2), getCentisteradian(1.0));
          
        double powM3 = Math.pow(10.0, -3);
        Checker.check(sr.times(powM3), msr);
        Checker.check(sr.times(powM3), getMillisteradian(1.0));
          
        double powM6 = Math.pow(10.0, -6);
        Checker.check(sr.times(powM6), μsr);
        Checker.check(sr.times(powM6), getMicrosteradian(1.0));
          
        double powM9 = Math.pow(10.0, -9);
        Checker.check(sr.times(powM9), nsr);
        Checker.check(sr.times(powM9), getNanosteradian(1.0));
          
        double powM12 = Math.pow(10.0, -12);
        Checker.check(sr.times(powM12), psr);
        Checker.check(sr.times(powM12), getPicosteradian(1.0));
          
        double powM15 = Math.pow(10.0, -15);
        Checker.check(sr.times(powM15), fsr);
        Checker.check(sr.times(powM15), getFemtosteradian(1.0));
          
        double powM18 = Math.pow(10.0, -18);
        Checker.check(sr.times(powM18), asr);
        Checker.check(sr.times(powM18), getAttosteradian(1.0));
          
        double powM21 = Math.pow(10.0, -21);
        Checker.check(sr.times(powM21), zsr);
        Checker.check(sr.times(powM21), getZeptosteradian(1.0));
          
        double powM24 = Math.pow(10.0, -24);
        Checker.check(sr.times(powM24), ysr);
        Checker.check(sr.times(powM24), getYoctosteradian(1.0));
          
        double powM27 = Math.pow(10.0, -27);
        Checker.check(sr.times(powM27), rsr);
        Checker.check(sr.times(powM27), getRontosteradian(1.0));
          
        double powM30 = Math.pow(10.0, -30);
        Checker.check(sr.times(powM30), qsr);
        Checker.check(sr.times(powM30), getQuectosteradian(1.0));   }
}