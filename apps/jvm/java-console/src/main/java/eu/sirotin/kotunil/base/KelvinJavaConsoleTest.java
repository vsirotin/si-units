        
package eu.sirotin.kotunil.base;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.base.KelvinKt.*;

public class  KelvinJavaConsoleTest {

    public static void javaConsoleTest() {

       Checker.check(new Kelvin(1.0), K);
       Checker.check(K.times(1.3) , new Kelvin(1.3));
   
        
        double pow30 = Math.pow(10.0, 30);
        Checker.check(new Kelvin(1.0).times(pow30), QK);
        Checker.check(new Kelvin(1.0).times(pow30), getQuettakelvin());
        Checker.check(QK, getQuettakelvin());

   
        
        double pow27 = Math.pow(10.0, 27);
        Checker.check(new Kelvin(1.0).times(pow27), RK);
        Checker.check(new Kelvin(1.0).times(pow27), getRonnakelvin());
        Checker.check(RK, getRonnakelvin());

   
        
        double pow24 = Math.pow(10.0, 24);
        Checker.check(new Kelvin(1.0).times(pow24), YK);
        Checker.check(new Kelvin(1.0).times(pow24), getYottakelvin());
        Checker.check(YK, getYottakelvin());

   
        
        double pow21 = Math.pow(10.0, 21);
        Checker.check(new Kelvin(1.0).times(pow21), ZK);
        Checker.check(new Kelvin(1.0).times(pow21), getZettakelvin());
        Checker.check(ZK, getZettakelvin());

   
        
        double pow18 = Math.pow(10.0, 18);
        Checker.check(new Kelvin(1.0).times(pow18), EK);
        Checker.check(new Kelvin(1.0).times(pow18), getExakelvin());
        Checker.check(EK, getExakelvin());

   
        
        double pow15 = Math.pow(10.0, 15);
        Checker.check(new Kelvin(1.0).times(pow15), PK);
        Checker.check(new Kelvin(1.0).times(pow15), getPetakelvin());
        Checker.check(PK, getPetakelvin());

   
        
        double pow12 = Math.pow(10.0, 12);
        Checker.check(new Kelvin(1.0).times(pow12), TK);
        Checker.check(new Kelvin(1.0).times(pow12), getTerakelvin());
        Checker.check(TK, getTerakelvin());

   
        
        double pow9 = Math.pow(10.0, 9);
        Checker.check(new Kelvin(1.0).times(pow9), GK);
        Checker.check(new Kelvin(1.0).times(pow9), getGigakelvin());
        Checker.check(GK, getGigakelvin());

   
        
        double pow6 = Math.pow(10.0, 6);
        Checker.check(new Kelvin(1.0).times(pow6), MK);
        Checker.check(new Kelvin(1.0).times(pow6), getMegakelvin());
        Checker.check(MK, getMegakelvin());

   
        
        double pow3 = Math.pow(10.0, 3);
        Checker.check(new Kelvin(1.0).times(pow3), kK);
        Checker.check(new Kelvin(1.0).times(pow3), getKilokelvin());
        Checker.check(kK, getKilokelvin());

   
        
        double pow2 = Math.pow(10.0, 2);
        Checker.check(new Kelvin(1.0).times(pow2), hK);
        Checker.check(new Kelvin(1.0).times(pow2), getHectokelvin());
        Checker.check(hK, getHectokelvin());

   
        
        double pow1 = Math.pow(10.0, 1);
        Checker.check(new Kelvin(1.0).times(pow1), daK);
        Checker.check(new Kelvin(1.0).times(pow1), getDecakelvin());
        Checker.check(daK, getDecakelvin());

   
        
        double powM1 = Math.pow(10.0, -1);
        Checker.check(new Kelvin(1.0).times(powM1), dK);
        Checker.check(new Kelvin(1.0).times(powM1), getDecikelvin());
        Checker.check(dK, getDecikelvin());

   
        
        double powM2 = Math.pow(10.0, -2);
        Checker.check(new Kelvin(1.0).times(powM2), cK);
        Checker.check(new Kelvin(1.0).times(powM2), getCentikelvin());
        Checker.check(cK, getCentikelvin());

   
        
        double powM3 = Math.pow(10.0, -3);
        Checker.check(new Kelvin(1.0).times(powM3), mK);
        Checker.check(new Kelvin(1.0).times(powM3), getMillikelvin());
        Checker.check(mK, getMillikelvin());

   
        
        double powM6 = Math.pow(10.0, -6);
        Checker.check(new Kelvin(1.0).times(powM6), μK);
        Checker.check(new Kelvin(1.0).times(powM6), getMicrokelvin());
        Checker.check(μK, getMicrokelvin());

   
        
        double powM9 = Math.pow(10.0, -9);
        Checker.check(new Kelvin(1.0).times(powM9), nK);
        Checker.check(new Kelvin(1.0).times(powM9), getNanokelvin());
        Checker.check(nK, getNanokelvin());

   
        
        double powM12 = Math.pow(10.0, -12);
        Checker.check(new Kelvin(1.0).times(powM12), pK);
        Checker.check(new Kelvin(1.0).times(powM12), getPicokelvin());
        Checker.check(pK, getPicokelvin());

   
        
        double powM15 = Math.pow(10.0, -15);
        Checker.check(new Kelvin(1.0).times(powM15), fK);
        Checker.check(new Kelvin(1.0).times(powM15), getFemtokelvin());
        Checker.check(fK, getFemtokelvin());

   
        
        double powM18 = Math.pow(10.0, -18);
        Checker.check(new Kelvin(1.0).times(powM18), aK);
        Checker.check(new Kelvin(1.0).times(powM18), getAttokelvin());
        Checker.check(aK, getAttokelvin());

   
        
        double powM21 = Math.pow(10.0, -21);
        Checker.check(new Kelvin(1.0).times(powM21), zK);
        Checker.check(new Kelvin(1.0).times(powM21), getZeptokelvin());
        Checker.check(zK, getZeptokelvin());

   
        
        double powM24 = Math.pow(10.0, -24);
        Checker.check(new Kelvin(1.0).times(powM24), yK);
        Checker.check(new Kelvin(1.0).times(powM24), getYoctokelvin());
        Checker.check(yK, getYoctokelvin());

   
        
        double powM27 = Math.pow(10.0, -27);
        Checker.check(new Kelvin(1.0).times(powM27), rK);
        Checker.check(new Kelvin(1.0).times(powM27), getRontokelvin());
        Checker.check(rK, getRontokelvin());

   
        
        double powM30 = Math.pow(10.0, -30);
        Checker.check(new Kelvin(1.0).times(powM30), qK);
        Checker.check(new Kelvin(1.0).times(powM30), getQuectokelvin());
        Checker.check(qK, getQuectokelvin());
   }
}