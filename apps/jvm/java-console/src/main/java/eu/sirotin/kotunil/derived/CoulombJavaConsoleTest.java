        
package eu.sirotin.kotunil.derived;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.derived.CoulombKt.*;

public class  CoulombJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(C.plus(C), C.times(2));
              
        double pow30 = Math.pow(10.0, 30);
        Checker.check(C.times(pow30), QC);
        Checker.check(C.times(pow30), getQuettacoulomb(1.0));
          
        double pow27 = Math.pow(10.0, 27);
        Checker.check(C.times(pow27), RC);
        Checker.check(C.times(pow27), getRonnacoulomb(1.0));
          
        double pow24 = Math.pow(10.0, 24);
        Checker.check(C.times(pow24), YC);
        Checker.check(C.times(pow24), getYottacoulomb(1.0));
          
        double pow21 = Math.pow(10.0, 21);
        Checker.check(C.times(pow21), ZC);
        Checker.check(C.times(pow21), getZettacoulomb(1.0));
          
        double pow18 = Math.pow(10.0, 18);
        Checker.check(C.times(pow18), EC);
        Checker.check(C.times(pow18), getExacoulomb(1.0));
          
        double pow15 = Math.pow(10.0, 15);
        Checker.check(C.times(pow15), PC);
        Checker.check(C.times(pow15), getPetacoulomb(1.0));
          
        double pow12 = Math.pow(10.0, 12);
        Checker.check(C.times(pow12), TC);
        Checker.check(C.times(pow12), getTeracoulomb(1.0));
          
        double pow9 = Math.pow(10.0, 9);
        Checker.check(C.times(pow9), GC);
        Checker.check(C.times(pow9), getGigacoulomb(1.0));
          
        double pow6 = Math.pow(10.0, 6);
        Checker.check(C.times(pow6), MC);
        Checker.check(C.times(pow6), getMegacoulomb(1.0));
          
        double pow3 = Math.pow(10.0, 3);
        Checker.check(C.times(pow3), kC);
        Checker.check(C.times(pow3), getKilocoulomb(1.0));
          
        double pow2 = Math.pow(10.0, 2);
        Checker.check(C.times(pow2), hC);
        Checker.check(C.times(pow2), getHectocoulomb(1.0));
          
        double pow1 = Math.pow(10.0, 1);
        Checker.check(C.times(pow1), daC);
        Checker.check(C.times(pow1), getDecacoulomb(1.0));
          
        double powM1 = Math.pow(10.0, -1);
        Checker.check(C.times(powM1), dC);
        Checker.check(C.times(powM1), getDecicoulomb(1.0));
          
        double powM2 = Math.pow(10.0, -2);
        Checker.check(C.times(powM2), cC);
        Checker.check(C.times(powM2), getCenticoulomb(1.0));
          
        double powM3 = Math.pow(10.0, -3);
        Checker.check(C.times(powM3), mC);
        Checker.check(C.times(powM3), getMillicoulomb(1.0));
          
        double powM6 = Math.pow(10.0, -6);
        Checker.check(C.times(powM6), μC);
        Checker.check(C.times(powM6), getMicrocoulomb(1.0));
          
        double powM9 = Math.pow(10.0, -9);
        Checker.check(C.times(powM9), nC);
        Checker.check(C.times(powM9), getNanocoulomb(1.0));
          
        double powM12 = Math.pow(10.0, -12);
        Checker.check(C.times(powM12), pC);
        Checker.check(C.times(powM12), getPicocoulomb(1.0));
          
        double powM15 = Math.pow(10.0, -15);
        Checker.check(C.times(powM15), fC);
        Checker.check(C.times(powM15), getFemtocoulomb(1.0));
          
        double powM18 = Math.pow(10.0, -18);
        Checker.check(C.times(powM18), aC);
        Checker.check(C.times(powM18), getAttocoulomb(1.0));
          
        double powM21 = Math.pow(10.0, -21);
        Checker.check(C.times(powM21), zC);
        Checker.check(C.times(powM21), getZeptocoulomb(1.0));
          
        double powM24 = Math.pow(10.0, -24);
        Checker.check(C.times(powM24), yC);
        Checker.check(C.times(powM24), getYoctocoulomb(1.0));
          
        double powM27 = Math.pow(10.0, -27);
        Checker.check(C.times(powM27), rC);
        Checker.check(C.times(powM27), getRontocoulomb(1.0));
          
        double powM30 = Math.pow(10.0, -30);
        Checker.check(C.times(powM30), qC);
        Checker.check(C.times(powM30), getQuectocoulomb(1.0));   }
}