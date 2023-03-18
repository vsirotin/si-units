        
package eu.sirotin.kotunil.base;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.base.MetreKt.*;

public class  MetreJavaConsoleTest {

    public static void javaConsoleTest() {

       Checker.check(new Metre(1.0), m);
       Checker.check(m.times(1.3) , new Metre(1.3));
   
        
        double pow30 = Math.pow(10.0, 30);
        Checker.check(new Metre(1.0).times(pow30), Qm);
        Checker.check(new Metre(1.0).times(pow30), getQuettametre());
        Checker.check(Qm, getQuettametre());

   
        
        double pow27 = Math.pow(10.0, 27);
        Checker.check(new Metre(1.0).times(pow27), Rm);
        Checker.check(new Metre(1.0).times(pow27), getRonnametre());
        Checker.check(Rm, getRonnametre());

   
        
        double pow24 = Math.pow(10.0, 24);
        Checker.check(new Metre(1.0).times(pow24), Ym);
        Checker.check(new Metre(1.0).times(pow24), getYottametre());
        Checker.check(Ym, getYottametre());

   
        
        double pow21 = Math.pow(10.0, 21);
        Checker.check(new Metre(1.0).times(pow21), Zm);
        Checker.check(new Metre(1.0).times(pow21), getZettametre());
        Checker.check(Zm, getZettametre());

   
        
        double pow18 = Math.pow(10.0, 18);
        Checker.check(new Metre(1.0).times(pow18), Em);
        Checker.check(new Metre(1.0).times(pow18), getExametre());
        Checker.check(Em, getExametre());

   
        
        double pow15 = Math.pow(10.0, 15);
        Checker.check(new Metre(1.0).times(pow15), Pm);
        Checker.check(new Metre(1.0).times(pow15), getPetametre());
        Checker.check(Pm, getPetametre());

   
        
        double pow12 = Math.pow(10.0, 12);
        Checker.check(new Metre(1.0).times(pow12), Tm);
        Checker.check(new Metre(1.0).times(pow12), getTerametre());
        Checker.check(Tm, getTerametre());

   
        
        double pow9 = Math.pow(10.0, 9);
        Checker.check(new Metre(1.0).times(pow9), Gm);
        Checker.check(new Metre(1.0).times(pow9), getGigametre());
        Checker.check(Gm, getGigametre());

   
        
        double pow6 = Math.pow(10.0, 6);
        Checker.check(new Metre(1.0).times(pow6), Mm);
        Checker.check(new Metre(1.0).times(pow6), getMegametre());
        Checker.check(Mm, getMegametre());

   
        
        double pow3 = Math.pow(10.0, 3);
        Checker.check(new Metre(1.0).times(pow3), km);
        Checker.check(new Metre(1.0).times(pow3), getKilometre());
        Checker.check(km, getKilometre());

   
        
        double pow2 = Math.pow(10.0, 2);
        Checker.check(new Metre(1.0).times(pow2), hm);
        Checker.check(new Metre(1.0).times(pow2), getHectometre());
        Checker.check(hm, getHectometre());

   
        
        double pow1 = Math.pow(10.0, 1);
        Checker.check(new Metre(1.0).times(pow1), dam);
        Checker.check(new Metre(1.0).times(pow1), getDecametre());
        Checker.check(dam, getDecametre());

   
        
        double powM1 = Math.pow(10.0, -1);
        Checker.check(new Metre(1.0).times(powM1), dm);
        Checker.check(new Metre(1.0).times(powM1), getDecimetre());
        Checker.check(dm, getDecimetre());

   
        
        double powM2 = Math.pow(10.0, -2);
        Checker.check(new Metre(1.0).times(powM2), cm);
        Checker.check(new Metre(1.0).times(powM2), getCentimetre());
        Checker.check(cm, getCentimetre());

   
        
        double powM3 = Math.pow(10.0, -3);
        Checker.check(new Metre(1.0).times(powM3), mm);
        Checker.check(new Metre(1.0).times(powM3), getMillimetre());
        Checker.check(mm, getMillimetre());

   
        
        double powM6 = Math.pow(10.0, -6);
        Checker.check(new Metre(1.0).times(powM6), μm);
        Checker.check(new Metre(1.0).times(powM6), getMicrometre());
        Checker.check(μm, getMicrometre());

   
        
        double powM9 = Math.pow(10.0, -9);
        Checker.check(new Metre(1.0).times(powM9), nm);
        Checker.check(new Metre(1.0).times(powM9), getNanometre());
        Checker.check(nm, getNanometre());

   
        
        double powM12 = Math.pow(10.0, -12);
        Checker.check(new Metre(1.0).times(powM12), pm);
        Checker.check(new Metre(1.0).times(powM12), getPicometre());
        Checker.check(pm, getPicometre());

   
        
        double powM15 = Math.pow(10.0, -15);
        Checker.check(new Metre(1.0).times(powM15), fm);
        Checker.check(new Metre(1.0).times(powM15), getFemtometre());
        Checker.check(fm, getFemtometre());

   
        
        double powM18 = Math.pow(10.0, -18);
        Checker.check(new Metre(1.0).times(powM18), am);
        Checker.check(new Metre(1.0).times(powM18), getAttometre());
        Checker.check(am, getAttometre());

   
        
        double powM21 = Math.pow(10.0, -21);
        Checker.check(new Metre(1.0).times(powM21), zm);
        Checker.check(new Metre(1.0).times(powM21), getZeptometre());
        Checker.check(zm, getZeptometre());

   
        
        double powM24 = Math.pow(10.0, -24);
        Checker.check(new Metre(1.0).times(powM24), ym);
        Checker.check(new Metre(1.0).times(powM24), getYoctometre());
        Checker.check(ym, getYoctometre());

   
        
        double powM27 = Math.pow(10.0, -27);
        Checker.check(new Metre(1.0).times(powM27), rm);
        Checker.check(new Metre(1.0).times(powM27), getRontometre());
        Checker.check(rm, getRontometre());

   
        
        double powM30 = Math.pow(10.0, -30);
        Checker.check(new Metre(1.0).times(powM30), qm);
        Checker.check(new Metre(1.0).times(powM30), getQuectometre());
        Checker.check(qm, getQuectometre());
   }
}