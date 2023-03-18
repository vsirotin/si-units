        
package eu.sirotin.kotunil.derived;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.derived.OhmKt.*;

public class  OhmJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(Ω.plus(Ω), Ω.times(2));

              
        double pow30 = Math.pow(10.0, 30);
        Checker.check(Ω.times(pow30), QΩ);
        Checker.check(Ω.times(pow30), getQuettaohm(1.0));
          
        double pow27 = Math.pow(10.0, 27);
        Checker.check(Ω.times(pow27), RΩ);
        Checker.check(Ω.times(pow27), getRonnaohm(1.0));
          
        double pow24 = Math.pow(10.0, 24);
        Checker.check(Ω.times(pow24), YΩ);
        Checker.check(Ω.times(pow24), getYottaohm(1.0));
          
        double pow21 = Math.pow(10.0, 21);
        Checker.check(Ω.times(pow21), ZΩ);
        Checker.check(Ω.times(pow21), getZettaohm(1.0));
          
        double pow18 = Math.pow(10.0, 18);
        Checker.check(Ω.times(pow18), EΩ);
        Checker.check(Ω.times(pow18), getExaohm(1.0));
          
        double pow15 = Math.pow(10.0, 15);
        Checker.check(Ω.times(pow15), PΩ);
        Checker.check(Ω.times(pow15), getPetaohm(1.0));
          
        double pow12 = Math.pow(10.0, 12);
        Checker.check(Ω.times(pow12), TΩ);
        Checker.check(Ω.times(pow12), getTeraohm(1.0));
          
        double pow9 = Math.pow(10.0, 9);
        Checker.check(Ω.times(pow9), GΩ);
        Checker.check(Ω.times(pow9), getGigaohm(1.0));
          
        double pow6 = Math.pow(10.0, 6);
        Checker.check(Ω.times(pow6), MΩ);
        Checker.check(Ω.times(pow6), getMegaohm(1.0));
          
        double pow3 = Math.pow(10.0, 3);
        Checker.check(Ω.times(pow3), kΩ);
        Checker.check(Ω.times(pow3), getKiloohm(1.0));
          
        double pow2 = Math.pow(10.0, 2);
        Checker.check(Ω.times(pow2), hΩ);
        Checker.check(Ω.times(pow2), getHectoohm(1.0));
          
        double pow1 = Math.pow(10.0, 1);
        Checker.check(Ω.times(pow1), daΩ);
        Checker.check(Ω.times(pow1), getDecaohm(1.0));
          
        double powM1 = Math.pow(10.0, -1);
        Checker.check(Ω.times(powM1), dΩ);
        Checker.check(Ω.times(powM1), getDeciohm(1.0));
          
        double powM2 = Math.pow(10.0, -2);
        Checker.check(Ω.times(powM2), cΩ);
        Checker.check(Ω.times(powM2), getCentiohm(1.0));
          
        double powM3 = Math.pow(10.0, -3);
        Checker.check(Ω.times(powM3), mΩ);
        Checker.check(Ω.times(powM3), getMilliohm(1.0));
          
        double powM6 = Math.pow(10.0, -6);
        Checker.check(Ω.times(powM6), μΩ);
        Checker.check(Ω.times(powM6), getMicroohm(1.0));
          
        double powM9 = Math.pow(10.0, -9);
        Checker.check(Ω.times(powM9), nΩ);
        Checker.check(Ω.times(powM9), getNanoohm(1.0));
          
        double powM12 = Math.pow(10.0, -12);
        Checker.check(Ω.times(powM12), pΩ);
        Checker.check(Ω.times(powM12), getPicoohm(1.0));
          
        double powM15 = Math.pow(10.0, -15);
        Checker.check(Ω.times(powM15), fΩ);
        Checker.check(Ω.times(powM15), getFemtoohm(1.0));
          
        double powM18 = Math.pow(10.0, -18);
        Checker.check(Ω.times(powM18), aΩ);
        Checker.check(Ω.times(powM18), getAttoohm(1.0));
          
        double powM21 = Math.pow(10.0, -21);
        Checker.check(Ω.times(powM21), zΩ);
        Checker.check(Ω.times(powM21), getZeptoohm(1.0));
          
        double powM24 = Math.pow(10.0, -24);
        Checker.check(Ω.times(powM24), yΩ);
        Checker.check(Ω.times(powM24), getYoctoohm(1.0));
          
        double powM27 = Math.pow(10.0, -27);
        Checker.check(Ω.times(powM27), rΩ);
        Checker.check(Ω.times(powM27), getRontoohm(1.0));
          
        double powM30 = Math.pow(10.0, -30);
        Checker.check(Ω.times(powM30), qΩ);
        Checker.check(Ω.times(powM30), getQuectoohm(1.0));   }
}