        
package eu.sirotin.kotunil.derived;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.derived.LuxKt.*;

public class  LuxJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(lx.plus(lx), lx.times(2));
              
        double pow30 = Math.pow(10.0, 30);
        Checker.check(lx.times(pow30), Qlx);
        Checker.check(lx.times(pow30), getQuettalux(1.0));
          
        double pow27 = Math.pow(10.0, 27);
        Checker.check(lx.times(pow27), Rlx);
        Checker.check(lx.times(pow27), getRonnalux(1.0));
          
        double pow24 = Math.pow(10.0, 24);
        Checker.check(lx.times(pow24), Ylx);
        Checker.check(lx.times(pow24), getYottalux(1.0));
          
        double pow21 = Math.pow(10.0, 21);
        Checker.check(lx.times(pow21), Zlx);
        Checker.check(lx.times(pow21), getZettalux(1.0));
          
        double pow18 = Math.pow(10.0, 18);
        Checker.check(lx.times(pow18), Elx);
        Checker.check(lx.times(pow18), getExalux(1.0));
          
        double pow15 = Math.pow(10.0, 15);
        Checker.check(lx.times(pow15), Plx);
        Checker.check(lx.times(pow15), getPetalux(1.0));
          
        double pow12 = Math.pow(10.0, 12);
        Checker.check(lx.times(pow12), Tlx);
        Checker.check(lx.times(pow12), getTeralux(1.0));
          
        double pow9 = Math.pow(10.0, 9);
        Checker.check(lx.times(pow9), Glx);
        Checker.check(lx.times(pow9), getGigalux(1.0));
          
        double pow6 = Math.pow(10.0, 6);
        Checker.check(lx.times(pow6), Mlx);
        Checker.check(lx.times(pow6), getMegalux(1.0));
          
        double pow3 = Math.pow(10.0, 3);
        Checker.check(lx.times(pow3), klx);
        Checker.check(lx.times(pow3), getKilolux(1.0));
          
        double pow2 = Math.pow(10.0, 2);
        Checker.check(lx.times(pow2), hlx);
        Checker.check(lx.times(pow2), getHectolux(1.0));
          
        double pow1 = Math.pow(10.0, 1);
        Checker.check(lx.times(pow1), dalx);
        Checker.check(lx.times(pow1), getDecalux(1.0));
          
        double powM1 = Math.pow(10.0, -1);
        Checker.check(lx.times(powM1), dlx);
        Checker.check(lx.times(powM1), getDecilux(1.0));
          
        double powM2 = Math.pow(10.0, -2);
        Checker.check(lx.times(powM2), clx);
        Checker.check(lx.times(powM2), getCentilux(1.0));
          
        double powM3 = Math.pow(10.0, -3);
        Checker.check(lx.times(powM3), mlx);
        Checker.check(lx.times(powM3), getMillilux(1.0));
          
        double powM6 = Math.pow(10.0, -6);
        Checker.check(lx.times(powM6), μlx);
        Checker.check(lx.times(powM6), getMicrolux(1.0));
          
        double powM9 = Math.pow(10.0, -9);
        Checker.check(lx.times(powM9), nlx);
        Checker.check(lx.times(powM9), getNanolux(1.0));
          
        double powM12 = Math.pow(10.0, -12);
        Checker.check(lx.times(powM12), plx);
        Checker.check(lx.times(powM12), getPicolux(1.0));
          
        double powM15 = Math.pow(10.0, -15);
        Checker.check(lx.times(powM15), flx);
        Checker.check(lx.times(powM15), getFemtolux(1.0));
          
        double powM18 = Math.pow(10.0, -18);
        Checker.check(lx.times(powM18), alx);
        Checker.check(lx.times(powM18), getAttolux(1.0));
          
        double powM21 = Math.pow(10.0, -21);
        Checker.check(lx.times(powM21), zlx);
        Checker.check(lx.times(powM21), getZeptolux(1.0));
          
        double powM24 = Math.pow(10.0, -24);
        Checker.check(lx.times(powM24), ylx);
        Checker.check(lx.times(powM24), getYoctolux(1.0));
          
        double powM27 = Math.pow(10.0, -27);
        Checker.check(lx.times(powM27), rlx);
        Checker.check(lx.times(powM27), getRontolux(1.0));
          
        double powM30 = Math.pow(10.0, -30);
        Checker.check(lx.times(powM30), qlx);
        Checker.check(lx.times(powM30), getQuectolux(1.0));   }
}