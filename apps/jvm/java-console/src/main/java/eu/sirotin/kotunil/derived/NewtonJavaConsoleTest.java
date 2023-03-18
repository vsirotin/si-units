        
package eu.sirotin.kotunil.derived;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.derived.NewtonKt.*;

public class  NewtonJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(N.plus(N), N.times(2));

              
        double pow30 = Math.pow(10.0, 30);
        Checker.check(N.times(pow30), QN);
        Checker.check(N.times(pow30), getQuettanewton(1.0));
          
        double pow27 = Math.pow(10.0, 27);
        Checker.check(N.times(pow27), RN);
        Checker.check(N.times(pow27), getRonnanewton(1.0));
          
        double pow24 = Math.pow(10.0, 24);
        Checker.check(N.times(pow24), YN);
        Checker.check(N.times(pow24), getYottanewton(1.0));
          
        double pow21 = Math.pow(10.0, 21);
        Checker.check(N.times(pow21), ZN);
        Checker.check(N.times(pow21), getZettanewton(1.0));
          
        double pow18 = Math.pow(10.0, 18);
        Checker.check(N.times(pow18), EN);
        Checker.check(N.times(pow18), getExanewton(1.0));
          
        double pow15 = Math.pow(10.0, 15);
        Checker.check(N.times(pow15), PN);
        Checker.check(N.times(pow15), getPetanewton(1.0));
          
        double pow12 = Math.pow(10.0, 12);
        Checker.check(N.times(pow12), TN);
        Checker.check(N.times(pow12), getTeranewton(1.0));
          
        double pow9 = Math.pow(10.0, 9);
        Checker.check(N.times(pow9), GN);
        Checker.check(N.times(pow9), getGiganewton(1.0));
          
        double pow6 = Math.pow(10.0, 6);
        Checker.check(N.times(pow6), MN);
        Checker.check(N.times(pow6), getMeganewton(1.0));
          
        double pow3 = Math.pow(10.0, 3);
        Checker.check(N.times(pow3), kN);
        Checker.check(N.times(pow3), getKilonewton(1.0));
          
        double pow2 = Math.pow(10.0, 2);
        Checker.check(N.times(pow2), hN);
        Checker.check(N.times(pow2), getHectonewton(1.0));
          
        double pow1 = Math.pow(10.0, 1);
        Checker.check(N.times(pow1), daN);
        Checker.check(N.times(pow1), getDecanewton(1.0));
          
        double powM1 = Math.pow(10.0, -1);
        Checker.check(N.times(powM1), dN);
        Checker.check(N.times(powM1), getDecinewton(1.0));
          
        double powM2 = Math.pow(10.0, -2);
        Checker.check(N.times(powM2), cN);
        Checker.check(N.times(powM2), getCentinewton(1.0));
          
        double powM3 = Math.pow(10.0, -3);
        Checker.check(N.times(powM3), mN);
        Checker.check(N.times(powM3), getMillinewton(1.0));
          
        double powM6 = Math.pow(10.0, -6);
        Checker.check(N.times(powM6), μN);
        Checker.check(N.times(powM6), getMicronewton(1.0));
          
        double powM9 = Math.pow(10.0, -9);
        Checker.check(N.times(powM9), nN);
        Checker.check(N.times(powM9), getNanonewton(1.0));
          
        double powM12 = Math.pow(10.0, -12);
        Checker.check(N.times(powM12), pN);
        Checker.check(N.times(powM12), getPiconewton(1.0));
          
        double powM15 = Math.pow(10.0, -15);
        Checker.check(N.times(powM15), fN);
        Checker.check(N.times(powM15), getFemtonewton(1.0));
          
        double powM18 = Math.pow(10.0, -18);
        Checker.check(N.times(powM18), aN);
        Checker.check(N.times(powM18), getAttonewton(1.0));
          
        double powM21 = Math.pow(10.0, -21);
        Checker.check(N.times(powM21), zN);
        Checker.check(N.times(powM21), getZeptonewton(1.0));
          
        double powM24 = Math.pow(10.0, -24);
        Checker.check(N.times(powM24), yN);
        Checker.check(N.times(powM24), getYoctonewton(1.0));
          
        double powM27 = Math.pow(10.0, -27);
        Checker.check(N.times(powM27), rN);
        Checker.check(N.times(powM27), getRontonewton(1.0));
          
        double powM30 = Math.pow(10.0, -30);
        Checker.check(N.times(powM30), qN);
        Checker.check(N.times(powM30), getQuectonewton(1.0));   }
}