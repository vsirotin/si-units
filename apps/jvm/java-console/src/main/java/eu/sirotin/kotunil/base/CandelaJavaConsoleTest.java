        
package eu.sirotin.kotunil.base;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.base.CandelaKt.*;

public class  CandelaJavaConsoleTest {

    public static void javaConsoleTest() {

       Checker.check(new Candela(1.0), cd);
       Checker.check(cd.times(1.3) , new Candela(1.3));
   
        
        double pow30 = Math.pow(10.0, 30);
        Checker.check(new Candela(1.0).times(pow30), Qcd);
        Checker.check(new Candela(1.0).times(pow30), getQuettacandela());
        Checker.check(Qcd, getQuettacandela());

   
        
        double pow27 = Math.pow(10.0, 27);
        Checker.check(new Candela(1.0).times(pow27), Rcd);
        Checker.check(new Candela(1.0).times(pow27), getRonnacandela());
        Checker.check(Rcd, getRonnacandela());

   
        
        double pow24 = Math.pow(10.0, 24);
        Checker.check(new Candela(1.0).times(pow24), Ycd);
        Checker.check(new Candela(1.0).times(pow24), getYottacandela());
        Checker.check(Ycd, getYottacandela());

   
        
        double pow21 = Math.pow(10.0, 21);
        Checker.check(new Candela(1.0).times(pow21), Zcd);
        Checker.check(new Candela(1.0).times(pow21), getZettacandela());
        Checker.check(Zcd, getZettacandela());

   
        
        double pow18 = Math.pow(10.0, 18);
        Checker.check(new Candela(1.0).times(pow18), Ecd);
        Checker.check(new Candela(1.0).times(pow18), getExacandela());
        Checker.check(Ecd, getExacandela());

   
        
        double pow15 = Math.pow(10.0, 15);
        Checker.check(new Candela(1.0).times(pow15), Pcd);
        Checker.check(new Candela(1.0).times(pow15), getPetacandela());
        Checker.check(Pcd, getPetacandela());

   
        
        double pow12 = Math.pow(10.0, 12);
        Checker.check(new Candela(1.0).times(pow12), Tcd);
        Checker.check(new Candela(1.0).times(pow12), getTeracandela());
        Checker.check(Tcd, getTeracandela());

   
        
        double pow9 = Math.pow(10.0, 9);
        Checker.check(new Candela(1.0).times(pow9), Gcd);
        Checker.check(new Candela(1.0).times(pow9), getGigacandela());
        Checker.check(Gcd, getGigacandela());

   
        
        double pow6 = Math.pow(10.0, 6);
        Checker.check(new Candela(1.0).times(pow6), Mcd);
        Checker.check(new Candela(1.0).times(pow6), getMegacandela());
        Checker.check(Mcd, getMegacandela());

   
        
        double pow3 = Math.pow(10.0, 3);
        Checker.check(new Candela(1.0).times(pow3), kcd);
        Checker.check(new Candela(1.0).times(pow3), getKilocandela());
        Checker.check(kcd, getKilocandela());

   
        
        double pow2 = Math.pow(10.0, 2);
        Checker.check(new Candela(1.0).times(pow2), hcd);
        Checker.check(new Candela(1.0).times(pow2), getHectocandela());
        Checker.check(hcd, getHectocandela());

   
        
        double pow1 = Math.pow(10.0, 1);
        Checker.check(new Candela(1.0).times(pow1), dacd);
        Checker.check(new Candela(1.0).times(pow1), getDecacandela());
        Checker.check(dacd, getDecacandela());

   
        
        double powM1 = Math.pow(10.0, -1);
        Checker.check(new Candela(1.0).times(powM1), dcd);
        Checker.check(new Candela(1.0).times(powM1), getDecicandela());
        Checker.check(dcd, getDecicandela());

   
        
        double powM2 = Math.pow(10.0, -2);
        Checker.check(new Candela(1.0).times(powM2), ccd);
        Checker.check(new Candela(1.0).times(powM2), getCenticandela());
        Checker.check(ccd, getCenticandela());

   
        
        double powM3 = Math.pow(10.0, -3);
        Checker.check(new Candela(1.0).times(powM3), mcd);
        Checker.check(new Candela(1.0).times(powM3), getMillicandela());
        Checker.check(mcd, getMillicandela());

   
        
        double powM6 = Math.pow(10.0, -6);
        Checker.check(new Candela(1.0).times(powM6), μcd);
        Checker.check(new Candela(1.0).times(powM6), getMicrocandela());
        Checker.check(μcd, getMicrocandela());

   
        
        double powM9 = Math.pow(10.0, -9);
        Checker.check(new Candela(1.0).times(powM9), ncd);
        Checker.check(new Candela(1.0).times(powM9), getNanocandela());
        Checker.check(ncd, getNanocandela());

   
        
        double powM12 = Math.pow(10.0, -12);
        Checker.check(new Candela(1.0).times(powM12), pcd);
        Checker.check(new Candela(1.0).times(powM12), getPicocandela());
        Checker.check(pcd, getPicocandela());

   
        
        double powM15 = Math.pow(10.0, -15);
        Checker.check(new Candela(1.0).times(powM15), fcd);
        Checker.check(new Candela(1.0).times(powM15), getFemtocandela());
        Checker.check(fcd, getFemtocandela());

   
        
        double powM18 = Math.pow(10.0, -18);
        Checker.check(new Candela(1.0).times(powM18), acd);
        Checker.check(new Candela(1.0).times(powM18), getAttocandela());
        Checker.check(acd, getAttocandela());

   
        
        double powM21 = Math.pow(10.0, -21);
        Checker.check(new Candela(1.0).times(powM21), zcd);
        Checker.check(new Candela(1.0).times(powM21), getZeptocandela());
        Checker.check(zcd, getZeptocandela());

   
        
        double powM24 = Math.pow(10.0, -24);
        Checker.check(new Candela(1.0).times(powM24), ycd);
        Checker.check(new Candela(1.0).times(powM24), getYoctocandela());
        Checker.check(ycd, getYoctocandela());

   
        
        double powM27 = Math.pow(10.0, -27);
        Checker.check(new Candela(1.0).times(powM27), rcd);
        Checker.check(new Candela(1.0).times(powM27), getRontocandela());
        Checker.check(rcd, getRontocandela());

   
        
        double powM30 = Math.pow(10.0, -30);
        Checker.check(new Candela(1.0).times(powM30), qcd);
        Checker.check(new Candela(1.0).times(powM30), getQuectocandela());
        Checker.check(qcd, getQuectocandela());
   }
}