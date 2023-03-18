        
package eu.sirotin.kotunil.derived;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.derived.VoltKt.*;

public class  VoltJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(V.plus(V), V.times(2));

              
        double pow30 = Math.pow(10.0, 30);
        Checker.check(V.times(pow30), QV);
        Checker.check(V.times(pow30), getQuettavolt(1.0));
          
        double pow27 = Math.pow(10.0, 27);
        Checker.check(V.times(pow27), RV);
        Checker.check(V.times(pow27), getRonnavolt(1.0));
          
        double pow24 = Math.pow(10.0, 24);
        Checker.check(V.times(pow24), YV);
        Checker.check(V.times(pow24), getYottavolt(1.0));
          
        double pow21 = Math.pow(10.0, 21);
        Checker.check(V.times(pow21), ZV);
        Checker.check(V.times(pow21), getZettavolt(1.0));
          
        double pow18 = Math.pow(10.0, 18);
        Checker.check(V.times(pow18), EV);
        Checker.check(V.times(pow18), getExavolt(1.0));
          
        double pow15 = Math.pow(10.0, 15);
        Checker.check(V.times(pow15), PV);
        Checker.check(V.times(pow15), getPetavolt(1.0));
          
        double pow12 = Math.pow(10.0, 12);
        Checker.check(V.times(pow12), TV);
        Checker.check(V.times(pow12), getTeravolt(1.0));
          
        double pow9 = Math.pow(10.0, 9);
        Checker.check(V.times(pow9), GV);
        Checker.check(V.times(pow9), getGigavolt(1.0));
          
        double pow6 = Math.pow(10.0, 6);
        Checker.check(V.times(pow6), MV);
        Checker.check(V.times(pow6), getMegavolt(1.0));
          
        double pow3 = Math.pow(10.0, 3);
        Checker.check(V.times(pow3), kV);
        Checker.check(V.times(pow3), getKilovolt(1.0));
          
        double pow2 = Math.pow(10.0, 2);
        Checker.check(V.times(pow2), hV);
        Checker.check(V.times(pow2), getHectovolt(1.0));
          
        double pow1 = Math.pow(10.0, 1);
        Checker.check(V.times(pow1), daV);
        Checker.check(V.times(pow1), getDecavolt(1.0));
          
        double powM1 = Math.pow(10.0, -1);
        Checker.check(V.times(powM1), dV);
        Checker.check(V.times(powM1), getDecivolt(1.0));
          
        double powM2 = Math.pow(10.0, -2);
        Checker.check(V.times(powM2), cV);
        Checker.check(V.times(powM2), getCentivolt(1.0));
          
        double powM3 = Math.pow(10.0, -3);
        Checker.check(V.times(powM3), mV);
        Checker.check(V.times(powM3), getMillivolt(1.0));
          
        double powM6 = Math.pow(10.0, -6);
        Checker.check(V.times(powM6), μV);
        Checker.check(V.times(powM6), getMicrovolt(1.0));
          
        double powM9 = Math.pow(10.0, -9);
        Checker.check(V.times(powM9), nV);
        Checker.check(V.times(powM9), getNanovolt(1.0));
          
        double powM12 = Math.pow(10.0, -12);
        Checker.check(V.times(powM12), pV);
        Checker.check(V.times(powM12), getPicovolt(1.0));
          
        double powM15 = Math.pow(10.0, -15);
        Checker.check(V.times(powM15), fV);
        Checker.check(V.times(powM15), getFemtovolt(1.0));
          
        double powM18 = Math.pow(10.0, -18);
        Checker.check(V.times(powM18), aV);
        Checker.check(V.times(powM18), getAttovolt(1.0));
          
        double powM21 = Math.pow(10.0, -21);
        Checker.check(V.times(powM21), zV);
        Checker.check(V.times(powM21), getZeptovolt(1.0));
          
        double powM24 = Math.pow(10.0, -24);
        Checker.check(V.times(powM24), yV);
        Checker.check(V.times(powM24), getYoctovolt(1.0));
          
        double powM27 = Math.pow(10.0, -27);
        Checker.check(V.times(powM27), rV);
        Checker.check(V.times(powM27), getRontovolt(1.0));
          
        double powM30 = Math.pow(10.0, -30);
        Checker.check(V.times(powM30), qV);
        Checker.check(V.times(powM30), getQuectovolt(1.0));   }
}