        
package eu.sirotin.kotunil.base;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.base.MetreKt.*;

public class  MetreJavaConsoleTest {

    public static void javaConsoleTest() {

       Checker.check(new Metre(1.0), m);
       Checker.check(m.times(1.3) , new Metre(1.3));
   
        
        double pow30 = Math.pow(10.0, 30);
        Checker.check(new Metre(1.0).times(pow30), Qm);
        Checker.check(Qm, quettametre);

   
        
        double pow27 = Math.pow(10.0, 27);
        Checker.check(new Metre(1.0).times(pow27), Rm);
        Checker.check(Rm, ronnametre);

   
        
        double pow24 = Math.pow(10.0, 24);
        Checker.check(new Metre(1.0).times(pow24), Ym);
        Checker.check(Ym, yottametre);

   
        
        double pow21 = Math.pow(10.0, 21);
        Checker.check(new Metre(1.0).times(pow21), Zm);
        Checker.check(Zm, zettametre);

   
        
        double pow18 = Math.pow(10.0, 18);
        Checker.check(new Metre(1.0).times(pow18), Em);
        Checker.check(Em, exametre);

   
        
        double pow15 = Math.pow(10.0, 15);
        Checker.check(new Metre(1.0).times(pow15), Pm);
        Checker.check(Pm, petametre);

   
        
        double pow12 = Math.pow(10.0, 12);
        Checker.check(new Metre(1.0).times(pow12), Tm);
        Checker.check(Tm, terametre);

   
        
        double pow9 = Math.pow(10.0, 9);
        Checker.check(new Metre(1.0).times(pow9), Gm);
        Checker.check(Gm, gigametre);

   
        
        double pow6 = Math.pow(10.0, 6);
        Checker.check(new Metre(1.0).times(pow6), Mm);
        Checker.check(Mm, megametre);

   
        
        double pow3 = Math.pow(10.0, 3);
        Checker.check(new Metre(1.0).times(pow3), km);
        Checker.check(km, kilometre);

   
        
        double pow2 = Math.pow(10.0, 2);
        Checker.check(new Metre(1.0).times(pow2), hm);
        Checker.check(hm, hectometre);

   
        
        double pow1 = Math.pow(10.0, 1);
        Checker.check(new Metre(1.0).times(pow1), dam);
        Checker.check(dam, decametre);

   
        
        double powM1 = Math.pow(10.0, -1);
        Checker.check(new Metre(1.0).times(powM1), dm);
        Checker.check(dm, decimetre);

   
        
        double powM2 = Math.pow(10.0, -2);
        Checker.check(new Metre(1.0).times(powM2), cm);
        Checker.check(cm, centimetre);

   
        
        double powM3 = Math.pow(10.0, -3);
        Checker.check(new Metre(1.0).times(powM3), mm);
        Checker.check(mm, millimetre);

   
        
        double powM6 = Math.pow(10.0, -6);
        Checker.check(new Metre(1.0).times(powM6), μm);
        Checker.check(μm, micrometre);

   
        
        double powM9 = Math.pow(10.0, -9);
        Checker.check(new Metre(1.0).times(powM9), nm);
        Checker.check(nm, nanometre);

   
        
        double powM12 = Math.pow(10.0, -12);
        Checker.check(new Metre(1.0).times(powM12), pm);
        Checker.check(pm, picometre);

   
        
        double powM15 = Math.pow(10.0, -15);
        Checker.check(new Metre(1.0).times(powM15), fm);
        Checker.check(fm, femtometre);

   
        
        double powM18 = Math.pow(10.0, -18);
        Checker.check(new Metre(1.0).times(powM18), am);
        Checker.check(am, attometre);

   
        
        double powM21 = Math.pow(10.0, -21);
        Checker.check(new Metre(1.0).times(powM21), zm);
        Checker.check(zm, zeptometre);

   
        
        double powM24 = Math.pow(10.0, -24);
        Checker.check(new Metre(1.0).times(powM24), ym);
        Checker.check(ym, yoctometre);

   
        
        double powM27 = Math.pow(10.0, -27);
        Checker.check(new Metre(1.0).times(powM27), rm);
        Checker.check(rm, rontometre);

   
        
        double powM30 = Math.pow(10.0, -30);
        Checker.check(new Metre(1.0).times(powM30), qm);
        Checker.check(qm, quectometre);
   }
}