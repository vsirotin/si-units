        
package eu.sirotin.kotunil.derived;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.derived.RadianKt.*;

public class  RadianJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(rad.plus(rad), rad.times(2));
              
        double pow30 = Math.pow(10.0, 30);
        Checker.check(rad.times(pow30), Qrad);
        Checker.check(rad.times(pow30), getQuettaradian(1.0));
          
        double pow27 = Math.pow(10.0, 27);
        Checker.check(rad.times(pow27), Rrad);
        Checker.check(rad.times(pow27), getRonnaradian(1.0));
          
        double pow24 = Math.pow(10.0, 24);
        Checker.check(rad.times(pow24), Yrad);
        Checker.check(rad.times(pow24), getYottaradian(1.0));
          
        double pow21 = Math.pow(10.0, 21);
        Checker.check(rad.times(pow21), Zrad);
        Checker.check(rad.times(pow21), getZettaradian(1.0));
          
        double pow18 = Math.pow(10.0, 18);
        Checker.check(rad.times(pow18), Erad);
        Checker.check(rad.times(pow18), getExaradian(1.0));
          
        double pow15 = Math.pow(10.0, 15);
        Checker.check(rad.times(pow15), Prad);
        Checker.check(rad.times(pow15), getPetaradian(1.0));
          
        double pow12 = Math.pow(10.0, 12);
        Checker.check(rad.times(pow12), Trad);
        Checker.check(rad.times(pow12), getTeraradian(1.0));
          
        double pow9 = Math.pow(10.0, 9);
        Checker.check(rad.times(pow9), Grad);
        Checker.check(rad.times(pow9), getGigaradian(1.0));
          
        double pow6 = Math.pow(10.0, 6);
        Checker.check(rad.times(pow6), Mrad);
        Checker.check(rad.times(pow6), getMegaradian(1.0));
          
        double pow3 = Math.pow(10.0, 3);
        Checker.check(rad.times(pow3), krad);
        Checker.check(rad.times(pow3), getKiloradian(1.0));
          
        double pow2 = Math.pow(10.0, 2);
        Checker.check(rad.times(pow2), hrad);
        Checker.check(rad.times(pow2), getHectoradian(1.0));
          
        double pow1 = Math.pow(10.0, 1);
        Checker.check(rad.times(pow1), darad);
        Checker.check(rad.times(pow1), getDecaradian(1.0));
          
        double powM1 = Math.pow(10.0, -1);
        Checker.check(rad.times(powM1), drad);
        Checker.check(rad.times(powM1), getDeciradian(1.0));
          
        double powM2 = Math.pow(10.0, -2);
        Checker.check(rad.times(powM2), crad);
        Checker.check(rad.times(powM2), getCentiradian(1.0));
          
        double powM3 = Math.pow(10.0, -3);
        Checker.check(rad.times(powM3), mrad);
        Checker.check(rad.times(powM3), getMilliradian(1.0));
          
        double powM6 = Math.pow(10.0, -6);
        Checker.check(rad.times(powM6), μrad);
        Checker.check(rad.times(powM6), getMicroradian(1.0));
          
        double powM9 = Math.pow(10.0, -9);
        Checker.check(rad.times(powM9), nrad);
        Checker.check(rad.times(powM9), getNanoradian(1.0));
          
        double powM12 = Math.pow(10.0, -12);
        Checker.check(rad.times(powM12), prad);
        Checker.check(rad.times(powM12), getPicoradian(1.0));
          
        double powM15 = Math.pow(10.0, -15);
        Checker.check(rad.times(powM15), frad);
        Checker.check(rad.times(powM15), getFemtoradian(1.0));
          
        double powM18 = Math.pow(10.0, -18);
        Checker.check(rad.times(powM18), arad);
        Checker.check(rad.times(powM18), getAttoradian(1.0));
          
        double powM21 = Math.pow(10.0, -21);
        Checker.check(rad.times(powM21), zrad);
        Checker.check(rad.times(powM21), getZeptoradian(1.0));
          
        double powM24 = Math.pow(10.0, -24);
        Checker.check(rad.times(powM24), yrad);
        Checker.check(rad.times(powM24), getYoctoradian(1.0));
          
        double powM27 = Math.pow(10.0, -27);
        Checker.check(rad.times(powM27), rrad);
        Checker.check(rad.times(powM27), getRontoradian(1.0));
          
        double powM30 = Math.pow(10.0, -30);
        Checker.check(rad.times(powM30), qrad);
        Checker.check(rad.times(powM30), getQuectoradian(1.0));   }
}