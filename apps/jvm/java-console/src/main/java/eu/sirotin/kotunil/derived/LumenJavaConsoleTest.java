        
package eu.sirotin.kotunil.derived;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.derived.LumenKt.*;

public class  LumenJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(lm.plus(lm), lm.times(2));

              
        double pow30 = Math.pow(10.0, 30);
        Checker.check(lm.times(pow30), Qlm);
        Checker.check(lm.times(pow30), getQuettalumen(1.0));
          
        double pow27 = Math.pow(10.0, 27);
        Checker.check(lm.times(pow27), Rlm);
        Checker.check(lm.times(pow27), getRonnalumen(1.0));
          
        double pow24 = Math.pow(10.0, 24);
        Checker.check(lm.times(pow24), Ylm);
        Checker.check(lm.times(pow24), getYottalumen(1.0));
          
        double pow21 = Math.pow(10.0, 21);
        Checker.check(lm.times(pow21), Zlm);
        Checker.check(lm.times(pow21), getZettalumen(1.0));
          
        double pow18 = Math.pow(10.0, 18);
        Checker.check(lm.times(pow18), Elm);
        Checker.check(lm.times(pow18), getExalumen(1.0));
          
        double pow15 = Math.pow(10.0, 15);
        Checker.check(lm.times(pow15), Plm);
        Checker.check(lm.times(pow15), getPetalumen(1.0));
          
        double pow12 = Math.pow(10.0, 12);
        Checker.check(lm.times(pow12), Tlm);
        Checker.check(lm.times(pow12), getTeralumen(1.0));
          
        double pow9 = Math.pow(10.0, 9);
        Checker.check(lm.times(pow9), Glm);
        Checker.check(lm.times(pow9), getGigalumen(1.0));
          
        double pow6 = Math.pow(10.0, 6);
        Checker.check(lm.times(pow6), Mlm);
        Checker.check(lm.times(pow6), getMegalumen(1.0));
          
        double pow3 = Math.pow(10.0, 3);
        Checker.check(lm.times(pow3), klm);
        Checker.check(lm.times(pow3), getKilolumen(1.0));
          
        double pow2 = Math.pow(10.0, 2);
        Checker.check(lm.times(pow2), hlm);
        Checker.check(lm.times(pow2), getHectolumen(1.0));
          
        double pow1 = Math.pow(10.0, 1);
        Checker.check(lm.times(pow1), dalm);
        Checker.check(lm.times(pow1), getDecalumen(1.0));
          
        double powM1 = Math.pow(10.0, -1);
        Checker.check(lm.times(powM1), dlm);
        Checker.check(lm.times(powM1), getDecilumen(1.0));
          
        double powM2 = Math.pow(10.0, -2);
        Checker.check(lm.times(powM2), clm);
        Checker.check(lm.times(powM2), getCentilumen(1.0));
          
        double powM3 = Math.pow(10.0, -3);
        Checker.check(lm.times(powM3), mlm);
        Checker.check(lm.times(powM3), getMillilumen(1.0));
          
        double powM6 = Math.pow(10.0, -6);
        Checker.check(lm.times(powM6), μlm);
        Checker.check(lm.times(powM6), getMicrolumen(1.0));
          
        double powM9 = Math.pow(10.0, -9);
        Checker.check(lm.times(powM9), nlm);
        Checker.check(lm.times(powM9), getNanolumen(1.0));
          
        double powM12 = Math.pow(10.0, -12);
        Checker.check(lm.times(powM12), plm);
        Checker.check(lm.times(powM12), getPicolumen(1.0));
          
        double powM15 = Math.pow(10.0, -15);
        Checker.check(lm.times(powM15), flm);
        Checker.check(lm.times(powM15), getFemtolumen(1.0));
          
        double powM18 = Math.pow(10.0, -18);
        Checker.check(lm.times(powM18), alm);
        Checker.check(lm.times(powM18), getAttolumen(1.0));
          
        double powM21 = Math.pow(10.0, -21);
        Checker.check(lm.times(powM21), zlm);
        Checker.check(lm.times(powM21), getZeptolumen(1.0));
          
        double powM24 = Math.pow(10.0, -24);
        Checker.check(lm.times(powM24), ylm);
        Checker.check(lm.times(powM24), getYoctolumen(1.0));
          
        double powM27 = Math.pow(10.0, -27);
        Checker.check(lm.times(powM27), rlm);
        Checker.check(lm.times(powM27), getRontolumen(1.0));
          
        double powM30 = Math.pow(10.0, -30);
        Checker.check(lm.times(powM30), qlm);
        Checker.check(lm.times(powM30), getQuectolumen(1.0));   }
}