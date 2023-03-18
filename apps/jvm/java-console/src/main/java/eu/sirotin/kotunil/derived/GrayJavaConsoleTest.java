        
package eu.sirotin.kotunil.derived;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.derived.GrayKt.*;

public class  GrayJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(Gy.plus(Gy), Gy.times(2));

              
        double pow30 = Math.pow(10.0, 30);
        Checker.check(Gy.times(pow30), QGy);
        Checker.check(Gy.times(pow30), getQuettagray(1.0));
          
        double pow27 = Math.pow(10.0, 27);
        Checker.check(Gy.times(pow27), RGy);
        Checker.check(Gy.times(pow27), getRonnagray(1.0));
          
        double pow24 = Math.pow(10.0, 24);
        Checker.check(Gy.times(pow24), YGy);
        Checker.check(Gy.times(pow24), getYottagray(1.0));
          
        double pow21 = Math.pow(10.0, 21);
        Checker.check(Gy.times(pow21), ZGy);
        Checker.check(Gy.times(pow21), getZettagray(1.0));
          
        double pow18 = Math.pow(10.0, 18);
        Checker.check(Gy.times(pow18), EGy);
        Checker.check(Gy.times(pow18), getExagray(1.0));
          
        double pow15 = Math.pow(10.0, 15);
        Checker.check(Gy.times(pow15), PGy);
        Checker.check(Gy.times(pow15), getPetagray(1.0));
          
        double pow12 = Math.pow(10.0, 12);
        Checker.check(Gy.times(pow12), TGy);
        Checker.check(Gy.times(pow12), getTeragray(1.0));
          
        double pow9 = Math.pow(10.0, 9);
        Checker.check(Gy.times(pow9), GGy);
        Checker.check(Gy.times(pow9), getGigagray(1.0));
          
        double pow6 = Math.pow(10.0, 6);
        Checker.check(Gy.times(pow6), MGy);
        Checker.check(Gy.times(pow6), getMegagray(1.0));
          
        double pow3 = Math.pow(10.0, 3);
        Checker.check(Gy.times(pow3), kGy);
        Checker.check(Gy.times(pow3), getKilogray(1.0));
          
        double pow2 = Math.pow(10.0, 2);
        Checker.check(Gy.times(pow2), hGy);
        Checker.check(Gy.times(pow2), getHectogray(1.0));
          
        double pow1 = Math.pow(10.0, 1);
        Checker.check(Gy.times(pow1), daGy);
        Checker.check(Gy.times(pow1), getDecagray(1.0));
          
        double powM1 = Math.pow(10.0, -1);
        Checker.check(Gy.times(powM1), dGy);
        Checker.check(Gy.times(powM1), getDecigray(1.0));
          
        double powM2 = Math.pow(10.0, -2);
        Checker.check(Gy.times(powM2), cGy);
        Checker.check(Gy.times(powM2), getCentigray(1.0));
          
        double powM3 = Math.pow(10.0, -3);
        Checker.check(Gy.times(powM3), mGy);
        Checker.check(Gy.times(powM3), getMilligray(1.0));
          
        double powM6 = Math.pow(10.0, -6);
        Checker.check(Gy.times(powM6), μGy);
        Checker.check(Gy.times(powM6), getMicrogray(1.0));
          
        double powM9 = Math.pow(10.0, -9);
        Checker.check(Gy.times(powM9), nGy);
        Checker.check(Gy.times(powM9), getNanogray(1.0));
          
        double powM12 = Math.pow(10.0, -12);
        Checker.check(Gy.times(powM12), pGy);
        Checker.check(Gy.times(powM12), getPicogray(1.0));
          
        double powM15 = Math.pow(10.0, -15);
        Checker.check(Gy.times(powM15), fGy);
        Checker.check(Gy.times(powM15), getFemtogray(1.0));
          
        double powM18 = Math.pow(10.0, -18);
        Checker.check(Gy.times(powM18), aGy);
        Checker.check(Gy.times(powM18), getAttogray(1.0));
          
        double powM21 = Math.pow(10.0, -21);
        Checker.check(Gy.times(powM21), zGy);
        Checker.check(Gy.times(powM21), getZeptogray(1.0));
          
        double powM24 = Math.pow(10.0, -24);
        Checker.check(Gy.times(powM24), yGy);
        Checker.check(Gy.times(powM24), getYoctogray(1.0));
          
        double powM27 = Math.pow(10.0, -27);
        Checker.check(Gy.times(powM27), rGy);
        Checker.check(Gy.times(powM27), getRontogray(1.0));
          
        double powM30 = Math.pow(10.0, -30);
        Checker.check(Gy.times(powM30), qGy);
        Checker.check(Gy.times(powM30), getQuectogray(1.0));   }
}