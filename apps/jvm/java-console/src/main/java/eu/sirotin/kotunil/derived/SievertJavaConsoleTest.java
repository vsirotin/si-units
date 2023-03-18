        
package eu.sirotin.kotunil.derived;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.derived.SievertKt.*;

public class  SievertJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(Sv.plus(Sv), Sv.times(2));

              
        double pow30 = Math.pow(10.0, 30);
        Checker.check(Sv.times(pow30), QSv);
        Checker.check(Sv.times(pow30), getQuettasievert(1.0));
          
        double pow27 = Math.pow(10.0, 27);
        Checker.check(Sv.times(pow27), RSv);
        Checker.check(Sv.times(pow27), getRonnasievert(1.0));
          
        double pow24 = Math.pow(10.0, 24);
        Checker.check(Sv.times(pow24), YSv);
        Checker.check(Sv.times(pow24), getYottasievert(1.0));
          
        double pow21 = Math.pow(10.0, 21);
        Checker.check(Sv.times(pow21), ZSv);
        Checker.check(Sv.times(pow21), getZettasievert(1.0));
          
        double pow18 = Math.pow(10.0, 18);
        Checker.check(Sv.times(pow18), ESv);
        Checker.check(Sv.times(pow18), getExasievert(1.0));
          
        double pow15 = Math.pow(10.0, 15);
        Checker.check(Sv.times(pow15), PSv);
        Checker.check(Sv.times(pow15), getPetasievert(1.0));
          
        double pow12 = Math.pow(10.0, 12);
        Checker.check(Sv.times(pow12), TSv);
        Checker.check(Sv.times(pow12), getTerasievert(1.0));
          
        double pow9 = Math.pow(10.0, 9);
        Checker.check(Sv.times(pow9), GSv);
        Checker.check(Sv.times(pow9), getGigasievert(1.0));
          
        double pow6 = Math.pow(10.0, 6);
        Checker.check(Sv.times(pow6), MSv);
        Checker.check(Sv.times(pow6), getMegasievert(1.0));
          
        double pow3 = Math.pow(10.0, 3);
        Checker.check(Sv.times(pow3), kSv);
        Checker.check(Sv.times(pow3), getKilosievert(1.0));
          
        double pow2 = Math.pow(10.0, 2);
        Checker.check(Sv.times(pow2), hSv);
        Checker.check(Sv.times(pow2), getHectosievert(1.0));
          
        double pow1 = Math.pow(10.0, 1);
        Checker.check(Sv.times(pow1), daSv);
        Checker.check(Sv.times(pow1), getDecasievert(1.0));
          
        double powM1 = Math.pow(10.0, -1);
        Checker.check(Sv.times(powM1), dSv);
        Checker.check(Sv.times(powM1), getDecisievert(1.0));
          
        double powM2 = Math.pow(10.0, -2);
        Checker.check(Sv.times(powM2), cSv);
        Checker.check(Sv.times(powM2), getCentisievert(1.0));
          
        double powM3 = Math.pow(10.0, -3);
        Checker.check(Sv.times(powM3), mSv);
        Checker.check(Sv.times(powM3), getMillisievert(1.0));
          
        double powM6 = Math.pow(10.0, -6);
        Checker.check(Sv.times(powM6), μSv);
        Checker.check(Sv.times(powM6), getMicrosievert(1.0));
          
        double powM9 = Math.pow(10.0, -9);
        Checker.check(Sv.times(powM9), nSv);
        Checker.check(Sv.times(powM9), getNanosievert(1.0));
          
        double powM12 = Math.pow(10.0, -12);
        Checker.check(Sv.times(powM12), pSv);
        Checker.check(Sv.times(powM12), getPicosievert(1.0));
          
        double powM15 = Math.pow(10.0, -15);
        Checker.check(Sv.times(powM15), fSv);
        Checker.check(Sv.times(powM15), getFemtosievert(1.0));
          
        double powM18 = Math.pow(10.0, -18);
        Checker.check(Sv.times(powM18), aSv);
        Checker.check(Sv.times(powM18), getAttosievert(1.0));
          
        double powM21 = Math.pow(10.0, -21);
        Checker.check(Sv.times(powM21), zSv);
        Checker.check(Sv.times(powM21), getZeptosievert(1.0));
          
        double powM24 = Math.pow(10.0, -24);
        Checker.check(Sv.times(powM24), ySv);
        Checker.check(Sv.times(powM24), getYoctosievert(1.0));
          
        double powM27 = Math.pow(10.0, -27);
        Checker.check(Sv.times(powM27), rSv);
        Checker.check(Sv.times(powM27), getRontosievert(1.0));
          
        double powM30 = Math.pow(10.0, -30);
        Checker.check(Sv.times(powM30), qSv);
        Checker.check(Sv.times(powM30), getQuectosievert(1.0));   }
}