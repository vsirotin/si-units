        
package eu.sirotin.kotunil.derived;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.derived.JouleKt.*;

public class  JouleJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(J.plus(J), J.times(2));

              
        double pow30 = Math.pow(10.0, 30);
        Checker.check(J.times(pow30), QJ);
        Checker.check(J.times(pow30), getQuettajoule(1.0));
          
        double pow27 = Math.pow(10.0, 27);
        Checker.check(J.times(pow27), RJ);
        Checker.check(J.times(pow27), getRonnajoule(1.0));
          
        double pow24 = Math.pow(10.0, 24);
        Checker.check(J.times(pow24), YJ);
        Checker.check(J.times(pow24), getYottajoule(1.0));
          
        double pow21 = Math.pow(10.0, 21);
        Checker.check(J.times(pow21), ZJ);
        Checker.check(J.times(pow21), getZettajoule(1.0));
          
        double pow18 = Math.pow(10.0, 18);
        Checker.check(J.times(pow18), EJ);
        Checker.check(J.times(pow18), getExajoule(1.0));
          
        double pow15 = Math.pow(10.0, 15);
        Checker.check(J.times(pow15), PJ);
        Checker.check(J.times(pow15), getPetajoule(1.0));
          
        double pow12 = Math.pow(10.0, 12);
        Checker.check(J.times(pow12), TJ);
        Checker.check(J.times(pow12), getTerajoule(1.0));
          
        double pow9 = Math.pow(10.0, 9);
        Checker.check(J.times(pow9), GJ);
        Checker.check(J.times(pow9), getGigajoule(1.0));
          
        double pow6 = Math.pow(10.0, 6);
        Checker.check(J.times(pow6), MJ);
        Checker.check(J.times(pow6), getMegajoule(1.0));
          
        double pow3 = Math.pow(10.0, 3);
        Checker.check(J.times(pow3), kJ);
        Checker.check(J.times(pow3), getKilojoule(1.0));
          
        double pow2 = Math.pow(10.0, 2);
        Checker.check(J.times(pow2), hJ);
        Checker.check(J.times(pow2), getHectojoule(1.0));
          
        double pow1 = Math.pow(10.0, 1);
        Checker.check(J.times(pow1), daJ);
        Checker.check(J.times(pow1), getDecajoule(1.0));
          
        double powM1 = Math.pow(10.0, -1);
        Checker.check(J.times(powM1), dJ);
        Checker.check(J.times(powM1), getDecijoule(1.0));
          
        double powM2 = Math.pow(10.0, -2);
        Checker.check(J.times(powM2), cJ);
        Checker.check(J.times(powM2), getCentijoule(1.0));
          
        double powM3 = Math.pow(10.0, -3);
        Checker.check(J.times(powM3), mJ);
        Checker.check(J.times(powM3), getMillijoule(1.0));
          
        double powM6 = Math.pow(10.0, -6);
        Checker.check(J.times(powM6), μJ);
        Checker.check(J.times(powM6), getMicrojoule(1.0));
          
        double powM9 = Math.pow(10.0, -9);
        Checker.check(J.times(powM9), nJ);
        Checker.check(J.times(powM9), getNanojoule(1.0));
          
        double powM12 = Math.pow(10.0, -12);
        Checker.check(J.times(powM12), pJ);
        Checker.check(J.times(powM12), getPicojoule(1.0));
          
        double powM15 = Math.pow(10.0, -15);
        Checker.check(J.times(powM15), fJ);
        Checker.check(J.times(powM15), getFemtojoule(1.0));
          
        double powM18 = Math.pow(10.0, -18);
        Checker.check(J.times(powM18), aJ);
        Checker.check(J.times(powM18), getAttojoule(1.0));
          
        double powM21 = Math.pow(10.0, -21);
        Checker.check(J.times(powM21), zJ);
        Checker.check(J.times(powM21), getZeptojoule(1.0));
          
        double powM24 = Math.pow(10.0, -24);
        Checker.check(J.times(powM24), yJ);
        Checker.check(J.times(powM24), getYoctojoule(1.0));
          
        double powM27 = Math.pow(10.0, -27);
        Checker.check(J.times(powM27), rJ);
        Checker.check(J.times(powM27), getRontojoule(1.0));
          
        double powM30 = Math.pow(10.0, -30);
        Checker.check(J.times(powM30), qJ);
        Checker.check(J.times(powM30), getQuectojoule(1.0));   }
}