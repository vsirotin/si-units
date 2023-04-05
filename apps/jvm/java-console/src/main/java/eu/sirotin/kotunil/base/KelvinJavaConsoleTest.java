        
package eu.sirotin.kotunil.base;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.base.KelvinKt.*;

public class  KelvinJavaConsoleTest {

    public static void javaConsoleTest() {

       Checker.check(new Kelvin(1.0), K);
       Checker.check(K.times(1.3) , new Kelvin(1.3));
   
        
        double pow30 = Math.pow(10.0, 30);
        Checker.check(new Kelvin(1.0).times(pow30), QK);
        Checker.check(QK, quettakelvin);

   
        
        double pow27 = Math.pow(10.0, 27);
        Checker.check(new Kelvin(1.0).times(pow27), RK);
        Checker.check(RK, ronnakelvin);

   
        
        double pow24 = Math.pow(10.0, 24);
        Checker.check(new Kelvin(1.0).times(pow24), YK);
        Checker.check(YK, yottakelvin);

   
        
        double pow21 = Math.pow(10.0, 21);
        Checker.check(new Kelvin(1.0).times(pow21), ZK);
        Checker.check(ZK, zettakelvin);

   
        
        double pow18 = Math.pow(10.0, 18);
        Checker.check(new Kelvin(1.0).times(pow18), EK);
        Checker.check(EK, exakelvin);

   
        
        double pow15 = Math.pow(10.0, 15);
        Checker.check(new Kelvin(1.0).times(pow15), PK);
        Checker.check(PK, petakelvin);

   
        
        double pow12 = Math.pow(10.0, 12);
        Checker.check(new Kelvin(1.0).times(pow12), TK);
        Checker.check(TK, terakelvin);

   
        
        double pow9 = Math.pow(10.0, 9);
        Checker.check(new Kelvin(1.0).times(pow9), GK);
        Checker.check(GK, gigakelvin);

   
        
        double pow6 = Math.pow(10.0, 6);
        Checker.check(new Kelvin(1.0).times(pow6), MK);
        Checker.check(MK, megakelvin);

   
        
        double pow3 = Math.pow(10.0, 3);
        Checker.check(new Kelvin(1.0).times(pow3), kK);
        Checker.check(kK, kilokelvin);

   
        
        double pow2 = Math.pow(10.0, 2);
        Checker.check(new Kelvin(1.0).times(pow2), hK);
        Checker.check(hK, hectokelvin);

   
        
        double pow1 = Math.pow(10.0, 1);
        Checker.check(new Kelvin(1.0).times(pow1), daK);
        Checker.check(daK, decakelvin);

   
        
        double powM1 = Math.pow(10.0, -1);
        Checker.check(new Kelvin(1.0).times(powM1), dK);
        Checker.check(dK, decikelvin);

   
        
        double powM2 = Math.pow(10.0, -2);
        Checker.check(new Kelvin(1.0).times(powM2), cK);
        Checker.check(cK, centikelvin);

   
        
        double powM3 = Math.pow(10.0, -3);
        Checker.check(new Kelvin(1.0).times(powM3), mK);
        Checker.check(mK, millikelvin);

   
        
        double powM6 = Math.pow(10.0, -6);
        Checker.check(new Kelvin(1.0).times(powM6), μK);
        Checker.check(μK, microkelvin);

   
        
        double powM9 = Math.pow(10.0, -9);
        Checker.check(new Kelvin(1.0).times(powM9), nK);
        Checker.check(nK, nanokelvin);

   
        
        double powM12 = Math.pow(10.0, -12);
        Checker.check(new Kelvin(1.0).times(powM12), pK);
        Checker.check(pK, picokelvin);

   
        
        double powM15 = Math.pow(10.0, -15);
        Checker.check(new Kelvin(1.0).times(powM15), fK);
        Checker.check(fK, femtokelvin);

   
        
        double powM18 = Math.pow(10.0, -18);
        Checker.check(new Kelvin(1.0).times(powM18), aK);
        Checker.check(aK, attokelvin);

   
        
        double powM21 = Math.pow(10.0, -21);
        Checker.check(new Kelvin(1.0).times(powM21), zK);
        Checker.check(zK, zeptokelvin);

   
        
        double powM24 = Math.pow(10.0, -24);
        Checker.check(new Kelvin(1.0).times(powM24), yK);
        Checker.check(yK, yoctokelvin);

   
        
        double powM27 = Math.pow(10.0, -27);
        Checker.check(new Kelvin(1.0).times(powM27), rK);
        Checker.check(rK, rontokelvin);

   
        
        double powM30 = Math.pow(10.0, -30);
        Checker.check(new Kelvin(1.0).times(powM30), qK);
        Checker.check(qK, quectokelvin);
   }
}