        
package eu.sirotin.kotunil.base;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.base.AmpereKt.*;

public class  AmpereJavaConsoleTest {

    public static void javaConsoleTest() {

       Checker.check(new Ampere(1.0), A);
       Checker.check(A.times(1.3) , new Ampere(1.3));
   
        
        double pow30 = Math.pow(10.0, 30);
        Checker.check(new Ampere(1.0).times(pow30), QA);
        Checker.check(QA, quettaampere);

   
        
        double pow27 = Math.pow(10.0, 27);
        Checker.check(new Ampere(1.0).times(pow27), RA);
        Checker.check(RA, ronnaampere);

   
        
        double pow24 = Math.pow(10.0, 24);
        Checker.check(new Ampere(1.0).times(pow24), YA);
        Checker.check(YA, yottaampere);

   
        
        double pow21 = Math.pow(10.0, 21);
        Checker.check(new Ampere(1.0).times(pow21), ZA);
        Checker.check(ZA, zettaampere);

   
        
        double pow18 = Math.pow(10.0, 18);
        Checker.check(new Ampere(1.0).times(pow18), EA);
        Checker.check(EA, exaampere);

   
        
        double pow15 = Math.pow(10.0, 15);
        Checker.check(new Ampere(1.0).times(pow15), PA);
        Checker.check(PA, petaampere);

   
        
        double pow12 = Math.pow(10.0, 12);
        Checker.check(new Ampere(1.0).times(pow12), TA);
        Checker.check(TA, teraampere);

   
        
        double pow9 = Math.pow(10.0, 9);
        Checker.check(new Ampere(1.0).times(pow9), GA);
        Checker.check(GA, gigaampere);

   
        
        double pow6 = Math.pow(10.0, 6);
        Checker.check(new Ampere(1.0).times(pow6), MA);
        Checker.check(MA, megaampere);

   
        
        double pow3 = Math.pow(10.0, 3);
        Checker.check(new Ampere(1.0).times(pow3), kA);
        Checker.check(kA, kiloampere);

   
        
        double pow2 = Math.pow(10.0, 2);
        Checker.check(new Ampere(1.0).times(pow2), hA);
        Checker.check(hA, hectoampere);

   
        
        double pow1 = Math.pow(10.0, 1);
        Checker.check(new Ampere(1.0).times(pow1), daA);
        Checker.check(daA, decaampere);

   
        
        double powM1 = Math.pow(10.0, -1);
        Checker.check(new Ampere(1.0).times(powM1), dA);
        Checker.check(dA, deciampere);

   
        
        double powM2 = Math.pow(10.0, -2);
        Checker.check(new Ampere(1.0).times(powM2), cA);
        Checker.check(cA, centiampere);

   
        
        double powM3 = Math.pow(10.0, -3);
        Checker.check(new Ampere(1.0).times(powM3), mA);
        Checker.check(mA, milliampere);

   
        
        double powM6 = Math.pow(10.0, -6);
        Checker.check(new Ampere(1.0).times(powM6), μA);
        Checker.check(μA, microampere);

   
        
        double powM9 = Math.pow(10.0, -9);
        Checker.check(new Ampere(1.0).times(powM9), nA);
        Checker.check(nA, nanoampere);

   
        
        double powM12 = Math.pow(10.0, -12);
        Checker.check(new Ampere(1.0).times(powM12), pA);
        Checker.check(pA, picoampere);

   
        
        double powM15 = Math.pow(10.0, -15);
        Checker.check(new Ampere(1.0).times(powM15), fA);
        Checker.check(fA, femtoampere);

   
        
        double powM18 = Math.pow(10.0, -18);
        Checker.check(new Ampere(1.0).times(powM18), aA);
        Checker.check(aA, attoampere);

   
        
        double powM21 = Math.pow(10.0, -21);
        Checker.check(new Ampere(1.0).times(powM21), zA);
        Checker.check(zA, zeptoampere);

   
        
        double powM24 = Math.pow(10.0, -24);
        Checker.check(new Ampere(1.0).times(powM24), yA);
        Checker.check(yA, yoctoampere);

   
        
        double powM27 = Math.pow(10.0, -27);
        Checker.check(new Ampere(1.0).times(powM27), rA);
        Checker.check(rA, rontoampere);

   
        
        double powM30 = Math.pow(10.0, -30);
        Checker.check(new Ampere(1.0).times(powM30), qA);
        Checker.check(qA, quectoampere);
   }
}