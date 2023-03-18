        
package eu.sirotin.kotunil.derived;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.derived.WeberKt.*;

public class  WeberJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(Wb.plus(Wb), Wb.times(2));

              
        double pow30 = Math.pow(10.0, 30);
        Checker.check(Wb.times(pow30), QWb);
        Checker.check(Wb.times(pow30), getQuettaweber(1.0));
          
        double pow27 = Math.pow(10.0, 27);
        Checker.check(Wb.times(pow27), RWb);
        Checker.check(Wb.times(pow27), getRonnaweber(1.0));
          
        double pow24 = Math.pow(10.0, 24);
        Checker.check(Wb.times(pow24), YWb);
        Checker.check(Wb.times(pow24), getYottaweber(1.0));
          
        double pow21 = Math.pow(10.0, 21);
        Checker.check(Wb.times(pow21), ZWb);
        Checker.check(Wb.times(pow21), getZettaweber(1.0));
          
        double pow18 = Math.pow(10.0, 18);
        Checker.check(Wb.times(pow18), EWb);
        Checker.check(Wb.times(pow18), getExaweber(1.0));
          
        double pow15 = Math.pow(10.0, 15);
        Checker.check(Wb.times(pow15), PWb);
        Checker.check(Wb.times(pow15), getPetaweber(1.0));
          
        double pow12 = Math.pow(10.0, 12);
        Checker.check(Wb.times(pow12), TWb);
        Checker.check(Wb.times(pow12), getTeraweber(1.0));
          
        double pow9 = Math.pow(10.0, 9);
        Checker.check(Wb.times(pow9), GWb);
        Checker.check(Wb.times(pow9), getGigaweber(1.0));
          
        double pow6 = Math.pow(10.0, 6);
        Checker.check(Wb.times(pow6), MWb);
        Checker.check(Wb.times(pow6), getMegaweber(1.0));
          
        double pow3 = Math.pow(10.0, 3);
        Checker.check(Wb.times(pow3), kWb);
        Checker.check(Wb.times(pow3), getKiloweber(1.0));
          
        double pow2 = Math.pow(10.0, 2);
        Checker.check(Wb.times(pow2), hWb);
        Checker.check(Wb.times(pow2), getHectoweber(1.0));
          
        double pow1 = Math.pow(10.0, 1);
        Checker.check(Wb.times(pow1), daWb);
        Checker.check(Wb.times(pow1), getDecaweber(1.0));
          
        double powM1 = Math.pow(10.0, -1);
        Checker.check(Wb.times(powM1), dWb);
        Checker.check(Wb.times(powM1), getDeciweber(1.0));
          
        double powM2 = Math.pow(10.0, -2);
        Checker.check(Wb.times(powM2), cWb);
        Checker.check(Wb.times(powM2), getCentiweber(1.0));
          
        double powM3 = Math.pow(10.0, -3);
        Checker.check(Wb.times(powM3), mWb);
        Checker.check(Wb.times(powM3), getMilliweber(1.0));
          
        double powM6 = Math.pow(10.0, -6);
        Checker.check(Wb.times(powM6), μWb);
        Checker.check(Wb.times(powM6), getMicroweber(1.0));
          
        double powM9 = Math.pow(10.0, -9);
        Checker.check(Wb.times(powM9), nWb);
        Checker.check(Wb.times(powM9), getNanoweber(1.0));
          
        double powM12 = Math.pow(10.0, -12);
        Checker.check(Wb.times(powM12), pWb);
        Checker.check(Wb.times(powM12), getPicoweber(1.0));
          
        double powM15 = Math.pow(10.0, -15);
        Checker.check(Wb.times(powM15), fWb);
        Checker.check(Wb.times(powM15), getFemtoweber(1.0));
          
        double powM18 = Math.pow(10.0, -18);
        Checker.check(Wb.times(powM18), aWb);
        Checker.check(Wb.times(powM18), getAttoweber(1.0));
          
        double powM21 = Math.pow(10.0, -21);
        Checker.check(Wb.times(powM21), zWb);
        Checker.check(Wb.times(powM21), getZeptoweber(1.0));
          
        double powM24 = Math.pow(10.0, -24);
        Checker.check(Wb.times(powM24), yWb);
        Checker.check(Wb.times(powM24), getYoctoweber(1.0));
          
        double powM27 = Math.pow(10.0, -27);
        Checker.check(Wb.times(powM27), rWb);
        Checker.check(Wb.times(powM27), getRontoweber(1.0));
          
        double powM30 = Math.pow(10.0, -30);
        Checker.check(Wb.times(powM30), qWb);
        Checker.check(Wb.times(powM30), getQuectoweber(1.0));   }
}