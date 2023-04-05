        
package eu.sirotin.kotunil.base;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.base.CandelaKt.*;

public class  CandelaJavaConsoleTest {

    public static void javaConsoleTest() {

       Checker.check(new Candela(1.0), cd);
       Checker.check(cd.times(1.3) , new Candela(1.3));
   
        
        double pow30 = Math.pow(10.0, 30);
        Checker.check(new Candela(1.0).times(pow30), Qcd);
        Checker.check(Qcd, quettacandela);

   
        
        double pow27 = Math.pow(10.0, 27);
        Checker.check(new Candela(1.0).times(pow27), Rcd);
        Checker.check(Rcd, ronnacandela);

   
        
        double pow24 = Math.pow(10.0, 24);
        Checker.check(new Candela(1.0).times(pow24), Ycd);
        Checker.check(Ycd, yottacandela);

   
        
        double pow21 = Math.pow(10.0, 21);
        Checker.check(new Candela(1.0).times(pow21), Zcd);
        Checker.check(Zcd, zettacandela);

   
        
        double pow18 = Math.pow(10.0, 18);
        Checker.check(new Candela(1.0).times(pow18), Ecd);
        Checker.check(Ecd, exacandela);

   
        
        double pow15 = Math.pow(10.0, 15);
        Checker.check(new Candela(1.0).times(pow15), Pcd);
        Checker.check(Pcd, petacandela);

   
        
        double pow12 = Math.pow(10.0, 12);
        Checker.check(new Candela(1.0).times(pow12), Tcd);
        Checker.check(Tcd, teracandela);

   
        
        double pow9 = Math.pow(10.0, 9);
        Checker.check(new Candela(1.0).times(pow9), Gcd);
        Checker.check(Gcd, gigacandela);

   
        
        double pow6 = Math.pow(10.0, 6);
        Checker.check(new Candela(1.0).times(pow6), Mcd);
        Checker.check(Mcd, megacandela);

   
        
        double pow3 = Math.pow(10.0, 3);
        Checker.check(new Candela(1.0).times(pow3), kcd);
        Checker.check(kcd, kilocandela);

   
        
        double pow2 = Math.pow(10.0, 2);
        Checker.check(new Candela(1.0).times(pow2), hcd);
        Checker.check(hcd, hectocandela);

   
        
        double pow1 = Math.pow(10.0, 1);
        Checker.check(new Candela(1.0).times(pow1), dacd);
        Checker.check(dacd, decacandela);

   
        
        double powM1 = Math.pow(10.0, -1);
        Checker.check(new Candela(1.0).times(powM1), dcd);
        Checker.check(dcd, decicandela);

   
        
        double powM2 = Math.pow(10.0, -2);
        Checker.check(new Candela(1.0).times(powM2), ccd);
        Checker.check(ccd, centicandela);

   
        
        double powM3 = Math.pow(10.0, -3);
        Checker.check(new Candela(1.0).times(powM3), mcd);
        Checker.check(mcd, millicandela);

   
        
        double powM6 = Math.pow(10.0, -6);
        Checker.check(new Candela(1.0).times(powM6), μcd);
        Checker.check(μcd, microcandela);

   
        
        double powM9 = Math.pow(10.0, -9);
        Checker.check(new Candela(1.0).times(powM9), ncd);
        Checker.check(ncd, nanocandela);

   
        
        double powM12 = Math.pow(10.0, -12);
        Checker.check(new Candela(1.0).times(powM12), pcd);
        Checker.check(pcd, picocandela);

   
        
        double powM15 = Math.pow(10.0, -15);
        Checker.check(new Candela(1.0).times(powM15), fcd);
        Checker.check(fcd, femtocandela);

   
        
        double powM18 = Math.pow(10.0, -18);
        Checker.check(new Candela(1.0).times(powM18), acd);
        Checker.check(acd, attocandela);

   
        
        double powM21 = Math.pow(10.0, -21);
        Checker.check(new Candela(1.0).times(powM21), zcd);
        Checker.check(zcd, zeptocandela);

   
        
        double powM24 = Math.pow(10.0, -24);
        Checker.check(new Candela(1.0).times(powM24), ycd);
        Checker.check(ycd, yoctocandela);

   
        
        double powM27 = Math.pow(10.0, -27);
        Checker.check(new Candela(1.0).times(powM27), rcd);
        Checker.check(rcd, rontocandela);

   
        
        double powM30 = Math.pow(10.0, -30);
        Checker.check(new Candela(1.0).times(powM30), qcd);
        Checker.check(qcd, quectocandela);
   }
}