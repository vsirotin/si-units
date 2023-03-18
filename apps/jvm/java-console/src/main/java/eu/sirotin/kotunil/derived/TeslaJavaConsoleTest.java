        
package eu.sirotin.kotunil.derived;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.derived.TeslaKt.*;

public class  TeslaJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(T.plus(T), T.times(2));

              
        double pow30 = Math.pow(10.0, 30);
        Checker.check(T.times(pow30), QT);
        Checker.check(T.times(pow30), getQuettatesla(1.0));
          
        double pow27 = Math.pow(10.0, 27);
        Checker.check(T.times(pow27), RT);
        Checker.check(T.times(pow27), getRonnatesla(1.0));
          
        double pow24 = Math.pow(10.0, 24);
        Checker.check(T.times(pow24), YT);
        Checker.check(T.times(pow24), getYottatesla(1.0));
          
        double pow21 = Math.pow(10.0, 21);
        Checker.check(T.times(pow21), ZT);
        Checker.check(T.times(pow21), getZettatesla(1.0));
          
        double pow18 = Math.pow(10.0, 18);
        Checker.check(T.times(pow18), ET);
        Checker.check(T.times(pow18), getExatesla(1.0));
          
        double pow15 = Math.pow(10.0, 15);
        Checker.check(T.times(pow15), PT);
        Checker.check(T.times(pow15), getPetatesla(1.0));
          
        double pow12 = Math.pow(10.0, 12);
        Checker.check(T.times(pow12), TT);
        Checker.check(T.times(pow12), getTeratesla(1.0));
          
        double pow9 = Math.pow(10.0, 9);
        Checker.check(T.times(pow9), GT);
        Checker.check(T.times(pow9), getGigatesla(1.0));
          
        double pow6 = Math.pow(10.0, 6);
        Checker.check(T.times(pow6), MT);
        Checker.check(T.times(pow6), getMegatesla(1.0));
          
        double pow3 = Math.pow(10.0, 3);
        Checker.check(T.times(pow3), kT);
        Checker.check(T.times(pow3), getKilotesla(1.0));
          
        double pow2 = Math.pow(10.0, 2);
        Checker.check(T.times(pow2), hT);
        Checker.check(T.times(pow2), getHectotesla(1.0));
          
        double pow1 = Math.pow(10.0, 1);
        Checker.check(T.times(pow1), daT);
        Checker.check(T.times(pow1), getDecatesla(1.0));
          
        double powM1 = Math.pow(10.0, -1);
        Checker.check(T.times(powM1), dT);
        Checker.check(T.times(powM1), getDecitesla(1.0));
          
        double powM2 = Math.pow(10.0, -2);
        Checker.check(T.times(powM2), cT);
        Checker.check(T.times(powM2), getCentitesla(1.0));
          
        double powM3 = Math.pow(10.0, -3);
        Checker.check(T.times(powM3), mT);
        Checker.check(T.times(powM3), getMillitesla(1.0));
          
        double powM6 = Math.pow(10.0, -6);
        Checker.check(T.times(powM6), μT);
        Checker.check(T.times(powM6), getMicrotesla(1.0));
          
        double powM9 = Math.pow(10.0, -9);
        Checker.check(T.times(powM9), nT);
        Checker.check(T.times(powM9), getNanotesla(1.0));
          
        double powM12 = Math.pow(10.0, -12);
        Checker.check(T.times(powM12), pT);
        Checker.check(T.times(powM12), getPicotesla(1.0));
          
        double powM15 = Math.pow(10.0, -15);
        Checker.check(T.times(powM15), fT);
        Checker.check(T.times(powM15), getFemtotesla(1.0));
          
        double powM18 = Math.pow(10.0, -18);
        Checker.check(T.times(powM18), aT);
        Checker.check(T.times(powM18), getAttotesla(1.0));
          
        double powM21 = Math.pow(10.0, -21);
        Checker.check(T.times(powM21), zT);
        Checker.check(T.times(powM21), getZeptotesla(1.0));
          
        double powM24 = Math.pow(10.0, -24);
        Checker.check(T.times(powM24), yT);
        Checker.check(T.times(powM24), getYoctotesla(1.0));
          
        double powM27 = Math.pow(10.0, -27);
        Checker.check(T.times(powM27), rT);
        Checker.check(T.times(powM27), getRontotesla(1.0));
          
        double powM30 = Math.pow(10.0, -30);
        Checker.check(T.times(powM30), qT);
        Checker.check(T.times(powM30), getQuectotesla(1.0));   }
}