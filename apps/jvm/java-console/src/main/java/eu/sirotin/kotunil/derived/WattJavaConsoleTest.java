        
package eu.sirotin.kotunil.derived;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.derived.WattKt.*;

public class  WattJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(W.plus(W), W.times(2));
              
        double pow30 = Math.pow(10.0, 30);
        Checker.check(W.times(pow30), QW);
        Checker.check(W.times(pow30), getQuettawatt(1.0));
          
        double pow27 = Math.pow(10.0, 27);
        Checker.check(W.times(pow27), RW);
        Checker.check(W.times(pow27), getRonnawatt(1.0));
          
        double pow24 = Math.pow(10.0, 24);
        Checker.check(W.times(pow24), YW);
        Checker.check(W.times(pow24), getYottawatt(1.0));
          
        double pow21 = Math.pow(10.0, 21);
        Checker.check(W.times(pow21), ZW);
        Checker.check(W.times(pow21), getZettawatt(1.0));
          
        double pow18 = Math.pow(10.0, 18);
        Checker.check(W.times(pow18), EW);
        Checker.check(W.times(pow18), getExawatt(1.0));
          
        double pow15 = Math.pow(10.0, 15);
        Checker.check(W.times(pow15), PW);
        Checker.check(W.times(pow15), getPetawatt(1.0));
          
        double pow12 = Math.pow(10.0, 12);
        Checker.check(W.times(pow12), TW);
        Checker.check(W.times(pow12), getTerawatt(1.0));
          
        double pow9 = Math.pow(10.0, 9);
        Checker.check(W.times(pow9), GW);
        Checker.check(W.times(pow9), getGigawatt(1.0));
          
        double pow6 = Math.pow(10.0, 6);
        Checker.check(W.times(pow6), MW);
        Checker.check(W.times(pow6), getMegawatt(1.0));
          
        double pow3 = Math.pow(10.0, 3);
        Checker.check(W.times(pow3), kW);
        Checker.check(W.times(pow3), getKilowatt(1.0));
          
        double pow2 = Math.pow(10.0, 2);
        Checker.check(W.times(pow2), hW);
        Checker.check(W.times(pow2), getHectowatt(1.0));
          
        double pow1 = Math.pow(10.0, 1);
        Checker.check(W.times(pow1), daW);
        Checker.check(W.times(pow1), getDecawatt(1.0));
          
        double powM1 = Math.pow(10.0, -1);
        Checker.check(W.times(powM1), dW);
        Checker.check(W.times(powM1), getDeciwatt(1.0));
          
        double powM2 = Math.pow(10.0, -2);
        Checker.check(W.times(powM2), cW);
        Checker.check(W.times(powM2), getCentiwatt(1.0));
          
        double powM3 = Math.pow(10.0, -3);
        Checker.check(W.times(powM3), mW);
        Checker.check(W.times(powM3), getMilliwatt(1.0));
          
        double powM6 = Math.pow(10.0, -6);
        Checker.check(W.times(powM6), μW);
        Checker.check(W.times(powM6), getMicrowatt(1.0));
          
        double powM9 = Math.pow(10.0, -9);
        Checker.check(W.times(powM9), nW);
        Checker.check(W.times(powM9), getNanowatt(1.0));
          
        double powM12 = Math.pow(10.0, -12);
        Checker.check(W.times(powM12), pW);
        Checker.check(W.times(powM12), getPicowatt(1.0));
          
        double powM15 = Math.pow(10.0, -15);
        Checker.check(W.times(powM15), fW);
        Checker.check(W.times(powM15), getFemtowatt(1.0));
          
        double powM18 = Math.pow(10.0, -18);
        Checker.check(W.times(powM18), aW);
        Checker.check(W.times(powM18), getAttowatt(1.0));
          
        double powM21 = Math.pow(10.0, -21);
        Checker.check(W.times(powM21), zW);
        Checker.check(W.times(powM21), getZeptowatt(1.0));
          
        double powM24 = Math.pow(10.0, -24);
        Checker.check(W.times(powM24), yW);
        Checker.check(W.times(powM24), getYoctowatt(1.0));
          
        double powM27 = Math.pow(10.0, -27);
        Checker.check(W.times(powM27), rW);
        Checker.check(W.times(powM27), getRontowatt(1.0));
          
        double powM30 = Math.pow(10.0, -30);
        Checker.check(W.times(powM30), qW);
        Checker.check(W.times(powM30), getQuectowatt(1.0));   }
}