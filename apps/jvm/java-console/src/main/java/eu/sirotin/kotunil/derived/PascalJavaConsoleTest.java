        
package eu.sirotin.kotunil.derived;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.derived.PascalKt.*;

public class  PascalJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(Pa.plus(Pa), Pa.times(2));
              
        double pow30 = Math.pow(10.0, 30);
        Checker.check(Pa.times(pow30), QPa);
        Checker.check(Pa.times(pow30), getQuettapascal(1.0));
          
        double pow27 = Math.pow(10.0, 27);
        Checker.check(Pa.times(pow27), RPa);
        Checker.check(Pa.times(pow27), getRonnapascal(1.0));
          
        double pow24 = Math.pow(10.0, 24);
        Checker.check(Pa.times(pow24), YPa);
        Checker.check(Pa.times(pow24), getYottapascal(1.0));
          
        double pow21 = Math.pow(10.0, 21);
        Checker.check(Pa.times(pow21), ZPa);
        Checker.check(Pa.times(pow21), getZettapascal(1.0));
          
        double pow18 = Math.pow(10.0, 18);
        Checker.check(Pa.times(pow18), EPa);
        Checker.check(Pa.times(pow18), getExapascal(1.0));
          
        double pow15 = Math.pow(10.0, 15);
        Checker.check(Pa.times(pow15), PPa);
        Checker.check(Pa.times(pow15), getPetapascal(1.0));
          
        double pow12 = Math.pow(10.0, 12);
        Checker.check(Pa.times(pow12), TPa);
        Checker.check(Pa.times(pow12), getTerapascal(1.0));
          
        double pow9 = Math.pow(10.0, 9);
        Checker.check(Pa.times(pow9), GPa);
        Checker.check(Pa.times(pow9), getGigapascal(1.0));
          
        double pow6 = Math.pow(10.0, 6);
        Checker.check(Pa.times(pow6), MPa);
        Checker.check(Pa.times(pow6), getMegapascal(1.0));
          
        double pow3 = Math.pow(10.0, 3);
        Checker.check(Pa.times(pow3), kPa);
        Checker.check(Pa.times(pow3), getKilopascal(1.0));
          
        double pow2 = Math.pow(10.0, 2);
        Checker.check(Pa.times(pow2), hPa);
        Checker.check(Pa.times(pow2), getHectopascal(1.0));
          
        double pow1 = Math.pow(10.0, 1);
        Checker.check(Pa.times(pow1), daPa);
        Checker.check(Pa.times(pow1), getDecapascal(1.0));
          
        double powM1 = Math.pow(10.0, -1);
        Checker.check(Pa.times(powM1), dPa);
        Checker.check(Pa.times(powM1), getDecipascal(1.0));
          
        double powM2 = Math.pow(10.0, -2);
        Checker.check(Pa.times(powM2), cPa);
        Checker.check(Pa.times(powM2), getCentipascal(1.0));
          
        double powM3 = Math.pow(10.0, -3);
        Checker.check(Pa.times(powM3), mPa);
        Checker.check(Pa.times(powM3), getMillipascal(1.0));
          
        double powM6 = Math.pow(10.0, -6);
        Checker.check(Pa.times(powM6), μPa);
        Checker.check(Pa.times(powM6), getMicropascal(1.0));
          
        double powM9 = Math.pow(10.0, -9);
        Checker.check(Pa.times(powM9), nPa);
        Checker.check(Pa.times(powM9), getNanopascal(1.0));
          
        double powM12 = Math.pow(10.0, -12);
        Checker.check(Pa.times(powM12), pPa);
        Checker.check(Pa.times(powM12), getPicopascal(1.0));
          
        double powM15 = Math.pow(10.0, -15);
        Checker.check(Pa.times(powM15), fPa);
        Checker.check(Pa.times(powM15), getFemtopascal(1.0));
          
        double powM18 = Math.pow(10.0, -18);
        Checker.check(Pa.times(powM18), aPa);
        Checker.check(Pa.times(powM18), getAttopascal(1.0));
          
        double powM21 = Math.pow(10.0, -21);
        Checker.check(Pa.times(powM21), zPa);
        Checker.check(Pa.times(powM21), getZeptopascal(1.0));
          
        double powM24 = Math.pow(10.0, -24);
        Checker.check(Pa.times(powM24), yPa);
        Checker.check(Pa.times(powM24), getYoctopascal(1.0));
          
        double powM27 = Math.pow(10.0, -27);
        Checker.check(Pa.times(powM27), rPa);
        Checker.check(Pa.times(powM27), getRontopascal(1.0));
          
        double powM30 = Math.pow(10.0, -30);
        Checker.check(Pa.times(powM30), qPa);
        Checker.check(Pa.times(powM30), getQuectopascal(1.0));   }
}