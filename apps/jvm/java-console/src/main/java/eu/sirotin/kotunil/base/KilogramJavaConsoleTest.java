        
package eu.sirotin.kotunil.base;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.base.KilogramKt.*;

public class  KilogramJavaConsoleTest {

    public static void javaConsoleTest() {

       Checker.check(new Kilogram(1.0), kg);
       Checker.check(kg.times(1.3) , new Kilogram(1.3));
   
        
        double pow27 = Math.pow(10.0, 27);
        Checker.check(new Kilogram(1.0).times(pow27), Qkg);
        Checker.check(Qkg, quettakilogram);

   
        
        double pow24 = Math.pow(10.0, 24);
        Checker.check(new Kilogram(1.0).times(pow24), Rkg);
        Checker.check(Rkg, ronnakilogram);

   
        
        double pow21 = Math.pow(10.0, 21);
        Checker.check(new Kilogram(1.0).times(pow21), Ykg);
        Checker.check(Ykg, yottakilogram);

   
        
        double pow18 = Math.pow(10.0, 18);
        Checker.check(new Kilogram(1.0).times(pow18), Zkg);
        Checker.check(Zkg, zettakilogram);

   
        
        double pow15 = Math.pow(10.0, 15);
        Checker.check(new Kilogram(1.0).times(pow15), Ekg);
        Checker.check(Ekg, exakilogram);

   
        
        double pow12 = Math.pow(10.0, 12);
        Checker.check(new Kilogram(1.0).times(pow12), Pkg);
        Checker.check(Pkg, petakilogram);

   
        
        double pow9 = Math.pow(10.0, 9);
        Checker.check(new Kilogram(1.0).times(pow9), Tkg);
        Checker.check(Tkg, terakilogram);

   
        
        double pow6 = Math.pow(10.0, 6);
        Checker.check(new Kilogram(1.0).times(pow6), Gkg);
        Checker.check(Gkg, gigakilogram);

   
        
        double pow3 = Math.pow(10.0, 3);
        Checker.check(new Kilogram(1.0).times(pow3), Mkg);
        Checker.check(Mkg, megakilogram);

   
        
        double powM1 = Math.pow(10.0, -1);
        Checker.check(new Kilogram(1.0).times(powM1), hkg);
        Checker.check(hkg, hectokilogram);

   
        
        double powM2 = Math.pow(10.0, -2);
        Checker.check(new Kilogram(1.0).times(powM2), dakg);
        Checker.check(dakg, decakilogram);

   
        
        double powM4 = Math.pow(10.0, -4);
        Checker.check(new Kilogram(1.0).times(powM4), dkg);
        Checker.check(dkg, decikilogram);

   
        
        double powM5 = Math.pow(10.0, -5);
        Checker.check(new Kilogram(1.0).times(powM5), ckg);
        Checker.check(ckg, centikilogram);

   
        
        double powM6 = Math.pow(10.0, -6);
        Checker.check(new Kilogram(1.0).times(powM6), mkg);
        Checker.check(mkg, millikilogram);

   
        
        double powM9 = Math.pow(10.0, -9);
        Checker.check(new Kilogram(1.0).times(powM9), μkg);
        Checker.check(μkg, microkilogram);

   
        
        double powM12 = Math.pow(10.0, -12);
        Checker.check(new Kilogram(1.0).times(powM12), nkg);
        Checker.check(nkg, nanokilogram);

   
        
        double powM15 = Math.pow(10.0, -15);
        Checker.check(new Kilogram(1.0).times(powM15), pkg);
        Checker.check(pkg, picokilogram);

   
        
        double powM18 = Math.pow(10.0, -18);
        Checker.check(new Kilogram(1.0).times(powM18), fkg);
        Checker.check(fkg, femtokilogram);

   
        
        double powM21 = Math.pow(10.0, -21);
        Checker.check(new Kilogram(1.0).times(powM21), akg);
        Checker.check(akg, attokilogram);

   
        
        double powM24 = Math.pow(10.0, -24);
        Checker.check(new Kilogram(1.0).times(powM24), zkg);
        Checker.check(zkg, zeptokilogram);

   
        
        double powM27 = Math.pow(10.0, -27);
        Checker.check(new Kilogram(1.0).times(powM27), ykg);
        Checker.check(ykg, yoctokilogram);

   
        
        double powM30 = Math.pow(10.0, -30);
        Checker.check(new Kilogram(1.0).times(powM30), rkg);
        Checker.check(rkg, rontokilogram);

   
        
        double powM33 = Math.pow(10.0, -33);
        Checker.check(new Kilogram(1.0).times(powM33), qkg);
        Checker.check(qkg, quectokilogram);
   }
}