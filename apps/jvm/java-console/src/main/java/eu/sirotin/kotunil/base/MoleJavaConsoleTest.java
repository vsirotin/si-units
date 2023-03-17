        
package eu.sirotin.kotunil.base;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.base.MoleKt.*;

public class  MoleJavaConsoleTest {

        public static void javaConsoleTest() {

       Checker.check(new Mole(1.0), mol);
       Checker.check(mol.times(1.3) , new Mole(1.3));
   
        
        double pow30 = Math.pow(10.0, 30);
        Checker.check(new Mole(1.0).times(pow30), Qmol);
        Checker.check(new Mole(1.0).times(pow30), getQuettamole());
        Checker.check(Qmol, getQuettamole());

   
        
        double pow27 = Math.pow(10.0, 27);
        Checker.check(new Mole(1.0).times(pow27), Rmol);
        Checker.check(new Mole(1.0).times(pow27), getRonnamole());
        Checker.check(Rmol, getRonnamole());

   
        
        double pow24 = Math.pow(10.0, 24);
        Checker.check(new Mole(1.0).times(pow24), Ymol);
        Checker.check(new Mole(1.0).times(pow24), getYottamole());
        Checker.check(Ymol, getYottamole());

   
        
        double pow21 = Math.pow(10.0, 21);
        Checker.check(new Mole(1.0).times(pow21), Zmol);
        Checker.check(new Mole(1.0).times(pow21), getZettamole());
        Checker.check(Zmol, getZettamole());

   
        
        double pow18 = Math.pow(10.0, 18);
        Checker.check(new Mole(1.0).times(pow18), Emol);
        Checker.check(new Mole(1.0).times(pow18), getExamole());
        Checker.check(Emol, getExamole());

   
        
        double pow15 = Math.pow(10.0, 15);
        Checker.check(new Mole(1.0).times(pow15), Pmol);
        Checker.check(new Mole(1.0).times(pow15), getPetamole());
        Checker.check(Pmol, getPetamole());

   
        
        double pow12 = Math.pow(10.0, 12);
        Checker.check(new Mole(1.0).times(pow12), Tmol);
        Checker.check(new Mole(1.0).times(pow12), getTeramole());
        Checker.check(Tmol, getTeramole());

   
        
        double pow9 = Math.pow(10.0, 9);
        Checker.check(new Mole(1.0).times(pow9), Gmol);
        Checker.check(new Mole(1.0).times(pow9), getGigamole());
        Checker.check(Gmol, getGigamole());

   
        
        double pow6 = Math.pow(10.0, 6);
        Checker.check(new Mole(1.0).times(pow6), Mmol);
        Checker.check(new Mole(1.0).times(pow6), getMegamole());
        Checker.check(Mmol, getMegamole());

   
        
        double pow3 = Math.pow(10.0, 3);
        Checker.check(new Mole(1.0).times(pow3), kmol);
        Checker.check(new Mole(1.0).times(pow3), getKilomole());
        Checker.check(kmol, getKilomole());

   
        
        double pow2 = Math.pow(10.0, 2);
        Checker.check(new Mole(1.0).times(pow2), hmol);
        Checker.check(new Mole(1.0).times(pow2), getHectomole());
        Checker.check(hmol, getHectomole());

   
        
        double pow1 = Math.pow(10.0, 1);
        Checker.check(new Mole(1.0).times(pow1), damol);
        Checker.check(new Mole(1.0).times(pow1), getDecamole());
        Checker.check(damol, getDecamole());

   
        
        double powM1 = Math.pow(10.0, -1);
        Checker.check(new Mole(1.0).times(powM1), dmol);
        Checker.check(new Mole(1.0).times(powM1), getDecimole());
        Checker.check(dmol, getDecimole());

   
        
        double powM2 = Math.pow(10.0, -2);
        Checker.check(new Mole(1.0).times(powM2), cmol);
        Checker.check(new Mole(1.0).times(powM2), getCentimole());
        Checker.check(cmol, getCentimole());

   
        
        double powM3 = Math.pow(10.0, -3);
        Checker.check(new Mole(1.0).times(powM3), mmol);
        Checker.check(new Mole(1.0).times(powM3), getMillimole());
        Checker.check(mmol, getMillimole());

   
        
        double powM6 = Math.pow(10.0, -6);
        Checker.check(new Mole(1.0).times(powM6), μmol);
        Checker.check(new Mole(1.0).times(powM6), getMicromole());
        Checker.check(μmol, getMicromole());

   
        
        double powM9 = Math.pow(10.0, -9);
        Checker.check(new Mole(1.0).times(powM9), nmol);
        Checker.check(new Mole(1.0).times(powM9), getNanomole());
        Checker.check(nmol, getNanomole());

   
        
        double powM12 = Math.pow(10.0, -12);
        Checker.check(new Mole(1.0).times(powM12), pmol);
        Checker.check(new Mole(1.0).times(powM12), getPicomole());
        Checker.check(pmol, getPicomole());

   
        
        double powM15 = Math.pow(10.0, -15);
        Checker.check(new Mole(1.0).times(powM15), fmol);
        Checker.check(new Mole(1.0).times(powM15), getFemtomole());
        Checker.check(fmol, getFemtomole());

   
        
        double powM18 = Math.pow(10.0, -18);
        Checker.check(new Mole(1.0).times(powM18), amol);
        Checker.check(new Mole(1.0).times(powM18), getAttomole());
        Checker.check(amol, getAttomole());

   
        
        double powM21 = Math.pow(10.0, -21);
        Checker.check(new Mole(1.0).times(powM21), zmol);
        Checker.check(new Mole(1.0).times(powM21), getZeptomole());
        Checker.check(zmol, getZeptomole());

   
        
        double powM24 = Math.pow(10.0, -24);
        Checker.check(new Mole(1.0).times(powM24), ymol);
        Checker.check(new Mole(1.0).times(powM24), getYoctomole());
        Checker.check(ymol, getYoctomole());

   
        
        double powM27 = Math.pow(10.0, -27);
        Checker.check(new Mole(1.0).times(powM27), rmol);
        Checker.check(new Mole(1.0).times(powM27), getRontomole());
        Checker.check(rmol, getRontomole());

   
        
        double powM30 = Math.pow(10.0, -30);
        Checker.check(new Mole(1.0).times(powM30), qmol);
        Checker.check(new Mole(1.0).times(powM30), getQuectomole());
        Checker.check(qmol, getQuectomole());
   }
}