        
package eu.sirotin.kotunil.derived;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.derived.SiemensKt.*;

public class  SiemensJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(S.plus(S), S.times(2));
              
        double pow30 = Math.pow(10.0, 30);
        Checker.check(S.times(pow30), QS);
        Checker.check(S.times(pow30), getQuettasiemens(1.0));
          
        double pow27 = Math.pow(10.0, 27);
        Checker.check(S.times(pow27), RS);
        Checker.check(S.times(pow27), getRonnasiemens(1.0));
          
        double pow24 = Math.pow(10.0, 24);
        Checker.check(S.times(pow24), YS);
        Checker.check(S.times(pow24), getYottasiemens(1.0));
          
        double pow21 = Math.pow(10.0, 21);
        Checker.check(S.times(pow21), ZS);
        Checker.check(S.times(pow21), getZettasiemens(1.0));
          
        double pow18 = Math.pow(10.0, 18);
        Checker.check(S.times(pow18), ES);
        Checker.check(S.times(pow18), getExasiemens(1.0));
          
        double pow15 = Math.pow(10.0, 15);
        Checker.check(S.times(pow15), PS);
        Checker.check(S.times(pow15), getPetasiemens(1.0));
          
        double pow12 = Math.pow(10.0, 12);
        Checker.check(S.times(pow12), TS);
        Checker.check(S.times(pow12), getTerasiemens(1.0));
          
        double pow9 = Math.pow(10.0, 9);
        Checker.check(S.times(pow9), GS);
        Checker.check(S.times(pow9), getGigasiemens(1.0));
          
        double pow6 = Math.pow(10.0, 6);
        Checker.check(S.times(pow6), MS);
        Checker.check(S.times(pow6), getMegasiemens(1.0));
          
        double pow3 = Math.pow(10.0, 3);
        Checker.check(S.times(pow3), kS);
        Checker.check(S.times(pow3), getKilosiemens(1.0));
          
        double pow2 = Math.pow(10.0, 2);
        Checker.check(S.times(pow2), hS);
        Checker.check(S.times(pow2), getHectosiemens(1.0));
          
        double pow1 = Math.pow(10.0, 1);
        Checker.check(S.times(pow1), daS);
        Checker.check(S.times(pow1), getDecasiemens(1.0));
          
        double powM1 = Math.pow(10.0, -1);
        Checker.check(S.times(powM1), dS);
        Checker.check(S.times(powM1), getDecisiemens(1.0));
          
        double powM2 = Math.pow(10.0, -2);
        Checker.check(S.times(powM2), cS);
        Checker.check(S.times(powM2), getCentisiemens(1.0));
          
        double powM3 = Math.pow(10.0, -3);
        Checker.check(S.times(powM3), mS);
        Checker.check(S.times(powM3), getMillisiemens(1.0));
          
        double powM6 = Math.pow(10.0, -6);
        Checker.check(S.times(powM6), μS);
        Checker.check(S.times(powM6), getMicrosiemens(1.0));
          
        double powM9 = Math.pow(10.0, -9);
        Checker.check(S.times(powM9), nS);
        Checker.check(S.times(powM9), getNanosiemens(1.0));
          
        double powM12 = Math.pow(10.0, -12);
        Checker.check(S.times(powM12), pS);
        Checker.check(S.times(powM12), getPicosiemens(1.0));
          
        double powM15 = Math.pow(10.0, -15);
        Checker.check(S.times(powM15), fS);
        Checker.check(S.times(powM15), getFemtosiemens(1.0));
          
        double powM18 = Math.pow(10.0, -18);
        Checker.check(S.times(powM18), aS);
        Checker.check(S.times(powM18), getAttosiemens(1.0));
          
        double powM21 = Math.pow(10.0, -21);
        Checker.check(S.times(powM21), zS);
        Checker.check(S.times(powM21), getZeptosiemens(1.0));
          
        double powM24 = Math.pow(10.0, -24);
        Checker.check(S.times(powM24), yS);
        Checker.check(S.times(powM24), getYoctosiemens(1.0));
          
        double powM27 = Math.pow(10.0, -27);
        Checker.check(S.times(powM27), rS);
        Checker.check(S.times(powM27), getRontosiemens(1.0));
          
        double powM30 = Math.pow(10.0, -30);
        Checker.check(S.times(powM30), qS);
        Checker.check(S.times(powM30), getQuectosiemens(1.0));   }
}