        
package eu.sirotin.kotunil.derived;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.derived.BecquerelKt.*;

public class  BecquerelJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(Bq.plus(Bq), Bq.times(2));

              
        double pow30 = Math.pow(10.0, 30);
        Checker.check(Bq.times(pow30), QBq);
        Checker.check(Bq.times(pow30), getQuettabecquerel(1.0));
          
        double pow27 = Math.pow(10.0, 27);
        Checker.check(Bq.times(pow27), RBq);
        Checker.check(Bq.times(pow27), getRonnabecquerel(1.0));
          
        double pow24 = Math.pow(10.0, 24);
        Checker.check(Bq.times(pow24), YBq);
        Checker.check(Bq.times(pow24), getYottabecquerel(1.0));
          
        double pow21 = Math.pow(10.0, 21);
        Checker.check(Bq.times(pow21), ZBq);
        Checker.check(Bq.times(pow21), getZettabecquerel(1.0));
          
        double pow18 = Math.pow(10.0, 18);
        Checker.check(Bq.times(pow18), EBq);
        Checker.check(Bq.times(pow18), getExabecquerel(1.0));
          
        double pow15 = Math.pow(10.0, 15);
        Checker.check(Bq.times(pow15), PBq);
        Checker.check(Bq.times(pow15), getPetabecquerel(1.0));
          
        double pow12 = Math.pow(10.0, 12);
        Checker.check(Bq.times(pow12), TBq);
        Checker.check(Bq.times(pow12), getTerabecquerel(1.0));
          
        double pow9 = Math.pow(10.0, 9);
        Checker.check(Bq.times(pow9), GBq);
        Checker.check(Bq.times(pow9), getGigabecquerel(1.0));
          
        double pow6 = Math.pow(10.0, 6);
        Checker.check(Bq.times(pow6), MBq);
        Checker.check(Bq.times(pow6), getMegabecquerel(1.0));
          
        double pow3 = Math.pow(10.0, 3);
        Checker.check(Bq.times(pow3), kBq);
        Checker.check(Bq.times(pow3), getKilobecquerel(1.0));
          
        double pow2 = Math.pow(10.0, 2);
        Checker.check(Bq.times(pow2), hBq);
        Checker.check(Bq.times(pow2), getHectobecquerel(1.0));
          
        double pow1 = Math.pow(10.0, 1);
        Checker.check(Bq.times(pow1), daBq);
        Checker.check(Bq.times(pow1), getDecabecquerel(1.0));
          
        double powM1 = Math.pow(10.0, -1);
        Checker.check(Bq.times(powM1), dBq);
        Checker.check(Bq.times(powM1), getDecibecquerel(1.0));
          
        double powM2 = Math.pow(10.0, -2);
        Checker.check(Bq.times(powM2), cBq);
        Checker.check(Bq.times(powM2), getCentibecquerel(1.0));
          
        double powM3 = Math.pow(10.0, -3);
        Checker.check(Bq.times(powM3), mBq);
        Checker.check(Bq.times(powM3), getMillibecquerel(1.0));
          
        double powM6 = Math.pow(10.0, -6);
        Checker.check(Bq.times(powM6), μBq);
        Checker.check(Bq.times(powM6), getMicrobecquerel(1.0));
          
        double powM9 = Math.pow(10.0, -9);
        Checker.check(Bq.times(powM9), nBq);
        Checker.check(Bq.times(powM9), getNanobecquerel(1.0));
          
        double powM12 = Math.pow(10.0, -12);
        Checker.check(Bq.times(powM12), pBq);
        Checker.check(Bq.times(powM12), getPicobecquerel(1.0));
          
        double powM15 = Math.pow(10.0, -15);
        Checker.check(Bq.times(powM15), fBq);
        Checker.check(Bq.times(powM15), getFemtobecquerel(1.0));
          
        double powM18 = Math.pow(10.0, -18);
        Checker.check(Bq.times(powM18), aBq);
        Checker.check(Bq.times(powM18), getAttobecquerel(1.0));
          
        double powM21 = Math.pow(10.0, -21);
        Checker.check(Bq.times(powM21), zBq);
        Checker.check(Bq.times(powM21), getZeptobecquerel(1.0));
          
        double powM24 = Math.pow(10.0, -24);
        Checker.check(Bq.times(powM24), yBq);
        Checker.check(Bq.times(powM24), getYoctobecquerel(1.0));
          
        double powM27 = Math.pow(10.0, -27);
        Checker.check(Bq.times(powM27), rBq);
        Checker.check(Bq.times(powM27), getRontobecquerel(1.0));
          
        double powM30 = Math.pow(10.0, -30);
        Checker.check(Bq.times(powM30), qBq);
        Checker.check(Bq.times(powM30), getQuectobecquerel(1.0));   }
}