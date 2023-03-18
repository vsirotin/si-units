        
package eu.sirotin.kotunil.base;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.base.KilogramKt.*;

public class  KilogramJavaConsoleTest {

    public static void javaConsoleTest() {

       Checker.check(new Kilogram(1.0), kg);
       Checker.check(kg.times(1.3) , new Kilogram(1.3));
   
        
        double pow27 = Math.pow(10.0, 27);
        Checker.check(new Kilogram(1.0).times(pow27), Qkg);
        Checker.check(new Kilogram(1.0).times(pow27), getQuettakilogram());
        Checker.check(Qkg, getQuettakilogram());

   
        
        double pow24 = Math.pow(10.0, 24);
        Checker.check(new Kilogram(1.0).times(pow24), Rkg);
        Checker.check(new Kilogram(1.0).times(pow24), getRonnakilogram());
        Checker.check(Rkg, getRonnakilogram());

   
        
        double pow21 = Math.pow(10.0, 21);
        Checker.check(new Kilogram(1.0).times(pow21), Ykg);
        Checker.check(new Kilogram(1.0).times(pow21), getYottakilogram());
        Checker.check(Ykg, getYottakilogram());

   
        
        double pow18 = Math.pow(10.0, 18);
        Checker.check(new Kilogram(1.0).times(pow18), Zkg);
        Checker.check(new Kilogram(1.0).times(pow18), getZettakilogram());
        Checker.check(Zkg, getZettakilogram());

   
        
        double pow15 = Math.pow(10.0, 15);
        Checker.check(new Kilogram(1.0).times(pow15), Ekg);
        Checker.check(new Kilogram(1.0).times(pow15), getExakilogram());
        Checker.check(Ekg, getExakilogram());

   
        
        double pow12 = Math.pow(10.0, 12);
        Checker.check(new Kilogram(1.0).times(pow12), Pkg);
        Checker.check(new Kilogram(1.0).times(pow12), getPetakilogram());
        Checker.check(Pkg, getPetakilogram());

   
        
        double pow9 = Math.pow(10.0, 9);
        Checker.check(new Kilogram(1.0).times(pow9), Tkg);
        Checker.check(new Kilogram(1.0).times(pow9), getTerakilogram());
        Checker.check(Tkg, getTerakilogram());

   
        
        double pow6 = Math.pow(10.0, 6);
        Checker.check(new Kilogram(1.0).times(pow6), Gkg);
        Checker.check(new Kilogram(1.0).times(pow6), getGigakilogram());
        Checker.check(Gkg, getGigakilogram());

   
        
        double pow3 = Math.pow(10.0, 3);
        Checker.check(new Kilogram(1.0).times(pow3), Mkg);
        Checker.check(new Kilogram(1.0).times(pow3), getMegakilogram());
        Checker.check(Mkg, getMegakilogram());

   
        
        double powM1 = Math.pow(10.0, -1);
        Checker.check(new Kilogram(1.0).times(powM1), hkg);
        Checker.check(new Kilogram(1.0).times(powM1), getHectokilogram());
        Checker.check(hkg, getHectokilogram());

   
        
        double powM2 = Math.pow(10.0, -2);
        Checker.check(new Kilogram(1.0).times(powM2), dakg);
        Checker.check(new Kilogram(1.0).times(powM2), getDecakilogram());
        Checker.check(dakg, getDecakilogram());

   
        
        double powM4 = Math.pow(10.0, -4);
        Checker.check(new Kilogram(1.0).times(powM4), dkg);
        Checker.check(new Kilogram(1.0).times(powM4), getDecikilogram());
        Checker.check(dkg, getDecikilogram());

   
        
        double powM5 = Math.pow(10.0, -5);
        Checker.check(new Kilogram(1.0).times(powM5), ckg);
        Checker.check(new Kilogram(1.0).times(powM5), getCentikilogram());
        Checker.check(ckg, getCentikilogram());

   
        
        double powM6 = Math.pow(10.0, -6);
        Checker.check(new Kilogram(1.0).times(powM6), mkg);
        Checker.check(new Kilogram(1.0).times(powM6), getMillikilogram());
        Checker.check(mkg, getMillikilogram());

   
        
        double powM9 = Math.pow(10.0, -9);
        Checker.check(new Kilogram(1.0).times(powM9), μkg);
        Checker.check(new Kilogram(1.0).times(powM9), getMicrokilogram());
        Checker.check(μkg, getMicrokilogram());

   
        
        double powM12 = Math.pow(10.0, -12);
        Checker.check(new Kilogram(1.0).times(powM12), nkg);
        Checker.check(new Kilogram(1.0).times(powM12), getNanokilogram());
        Checker.check(nkg, getNanokilogram());

   
        
        double powM15 = Math.pow(10.0, -15);
        Checker.check(new Kilogram(1.0).times(powM15), pkg);
        Checker.check(new Kilogram(1.0).times(powM15), getPicokilogram());
        Checker.check(pkg, getPicokilogram());

   
        
        double powM18 = Math.pow(10.0, -18);
        Checker.check(new Kilogram(1.0).times(powM18), fkg);
        Checker.check(new Kilogram(1.0).times(powM18), getFemtokilogram());
        Checker.check(fkg, getFemtokilogram());

   
        
        double powM21 = Math.pow(10.0, -21);
        Checker.check(new Kilogram(1.0).times(powM21), akg);
        Checker.check(new Kilogram(1.0).times(powM21), getAttokilogram());
        Checker.check(akg, getAttokilogram());

   
        
        double powM24 = Math.pow(10.0, -24);
        Checker.check(new Kilogram(1.0).times(powM24), zkg);
        Checker.check(new Kilogram(1.0).times(powM24), getZeptokilogram());
        Checker.check(zkg, getZeptokilogram());

   
        
        double powM27 = Math.pow(10.0, -27);
        Checker.check(new Kilogram(1.0).times(powM27), ykg);
        Checker.check(new Kilogram(1.0).times(powM27), getYoctokilogram());
        Checker.check(ykg, getYoctokilogram());

   
        
        double powM30 = Math.pow(10.0, -30);
        Checker.check(new Kilogram(1.0).times(powM30), rkg);
        Checker.check(new Kilogram(1.0).times(powM30), getRontokilogram());
        Checker.check(rkg, getRontokilogram());

   
        
        double powM33 = Math.pow(10.0, -33);
        Checker.check(new Kilogram(1.0).times(powM33), qkg);
        Checker.check(new Kilogram(1.0).times(powM33), getQuectokilogram());
        Checker.check(qkg, getQuectokilogram());
   }
}