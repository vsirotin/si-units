        
package eu.sirotin.kotunil.base;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.base.AmpereKt.*;

public class  AmpereJavaConsoleTest {

        public static void javaConsoleTest() {

       Checker.check(new Ampere(1.0), A);
       Checker.check(A.times(1.3) , new Ampere(1.3));
   
        
        double pow30 = Math.pow(10.0, 30);
        Checker.check(new Ampere(1.0).times(pow30), QA);
        Checker.check(new Ampere(1.0).times(pow30), getQuettaampere());
        Checker.check(QA, getQuettaampere());

   
        
        double pow27 = Math.pow(10.0, 27);
        Checker.check(new Ampere(1.0).times(pow27), RA);
        Checker.check(new Ampere(1.0).times(pow27), getRonnaampere());
        Checker.check(RA, getRonnaampere());

   
        
        double pow24 = Math.pow(10.0, 24);
        Checker.check(new Ampere(1.0).times(pow24), YA);
        Checker.check(new Ampere(1.0).times(pow24), getYottaampere());
        Checker.check(YA, getYottaampere());

   
        
        double pow21 = Math.pow(10.0, 21);
        Checker.check(new Ampere(1.0).times(pow21), ZA);
        Checker.check(new Ampere(1.0).times(pow21), getZettaampere());
        Checker.check(ZA, getZettaampere());

   
        
        double pow18 = Math.pow(10.0, 18);
        Checker.check(new Ampere(1.0).times(pow18), EA);
        Checker.check(new Ampere(1.0).times(pow18), getExaampere());
        Checker.check(EA, getExaampere());

   
        
        double pow15 = Math.pow(10.0, 15);
        Checker.check(new Ampere(1.0).times(pow15), PA);
        Checker.check(new Ampere(1.0).times(pow15), getPetaampere());
        Checker.check(PA, getPetaampere());

   
        
        double pow12 = Math.pow(10.0, 12);
        Checker.check(new Ampere(1.0).times(pow12), TA);
        Checker.check(new Ampere(1.0).times(pow12), getTeraampere());
        Checker.check(TA, getTeraampere());

   
        
        double pow9 = Math.pow(10.0, 9);
        Checker.check(new Ampere(1.0).times(pow9), GA);
        Checker.check(new Ampere(1.0).times(pow9), getGigaampere());
        Checker.check(GA, getGigaampere());

   
        
        double pow6 = Math.pow(10.0, 6);
        Checker.check(new Ampere(1.0).times(pow6), MA);
        Checker.check(new Ampere(1.0).times(pow6), getMegaampere());
        Checker.check(MA, getMegaampere());

   
        
        double pow3 = Math.pow(10.0, 3);
        Checker.check(new Ampere(1.0).times(pow3), kA);
        Checker.check(new Ampere(1.0).times(pow3), getKiloampere());
        Checker.check(kA, getKiloampere());

   
        
        double pow2 = Math.pow(10.0, 2);
        Checker.check(new Ampere(1.0).times(pow2), hA);
        Checker.check(new Ampere(1.0).times(pow2), getHectoampere());
        Checker.check(hA, getHectoampere());

   
        
        double pow1 = Math.pow(10.0, 1);
        Checker.check(new Ampere(1.0).times(pow1), daA);
        Checker.check(new Ampere(1.0).times(pow1), getDecaampere());
        Checker.check(daA, getDecaampere());

   
        
        double powM1 = Math.pow(10.0, -1);
        Checker.check(new Ampere(1.0).times(powM1), dA);
        Checker.check(new Ampere(1.0).times(powM1), getDeciampere());
        Checker.check(dA, getDeciampere());

   
        
        double powM2 = Math.pow(10.0, -2);
        Checker.check(new Ampere(1.0).times(powM2), cA);
        Checker.check(new Ampere(1.0).times(powM2), getCentiampere());
        Checker.check(cA, getCentiampere());

   
        
        double powM3 = Math.pow(10.0, -3);
        Checker.check(new Ampere(1.0).times(powM3), mA);
        Checker.check(new Ampere(1.0).times(powM3), getMilliampere());
        Checker.check(mA, getMilliampere());

   
        
        double powM6 = Math.pow(10.0, -6);
        Checker.check(new Ampere(1.0).times(powM6), μA);
        Checker.check(new Ampere(1.0).times(powM6), getMicroampere());
        Checker.check(μA, getMicroampere());

   
        
        double powM9 = Math.pow(10.0, -9);
        Checker.check(new Ampere(1.0).times(powM9), nA);
        Checker.check(new Ampere(1.0).times(powM9), getNanoampere());
        Checker.check(nA, getNanoampere());

   
        
        double powM12 = Math.pow(10.0, -12);
        Checker.check(new Ampere(1.0).times(powM12), pA);
        Checker.check(new Ampere(1.0).times(powM12), getPicoampere());
        Checker.check(pA, getPicoampere());

   
        
        double powM15 = Math.pow(10.0, -15);
        Checker.check(new Ampere(1.0).times(powM15), fA);
        Checker.check(new Ampere(1.0).times(powM15), getFemtoampere());
        Checker.check(fA, getFemtoampere());

   
        
        double powM18 = Math.pow(10.0, -18);
        Checker.check(new Ampere(1.0).times(powM18), aA);
        Checker.check(new Ampere(1.0).times(powM18), getAttoampere());
        Checker.check(aA, getAttoampere());

   
        
        double powM21 = Math.pow(10.0, -21);
        Checker.check(new Ampere(1.0).times(powM21), zA);
        Checker.check(new Ampere(1.0).times(powM21), getZeptoampere());
        Checker.check(zA, getZeptoampere());

   
        
        double powM24 = Math.pow(10.0, -24);
        Checker.check(new Ampere(1.0).times(powM24), yA);
        Checker.check(new Ampere(1.0).times(powM24), getYoctoampere());
        Checker.check(yA, getYoctoampere());

   
        
        double powM27 = Math.pow(10.0, -27);
        Checker.check(new Ampere(1.0).times(powM27), rA);
        Checker.check(new Ampere(1.0).times(powM27), getRontoampere());
        Checker.check(rA, getRontoampere());

   
        
        double powM30 = Math.pow(10.0, -30);
        Checker.check(new Ampere(1.0).times(powM30), qA);
        Checker.check(new Ampere(1.0).times(powM30), getQuectoampere());
        Checker.check(qA, getQuectoampere());
   }
}