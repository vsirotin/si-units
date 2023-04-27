        
package eu.sirotin.kotunil.base;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.base.MoleKt.*;

public class  MoleJavaConsoleTest {

    public static void javaConsoleTest() {

       Checker.check(new Mole(1.0), mol);
       Checker.check(mol.times(1.3) , new Mole(1.3));
   
        
        double pow30 = Math.pow(10.0, 30);
        Checker.check(new Mole(1.0).times(pow30), Qmol);
        Checker.check(Qmol, quettamole);

   
        
        double pow27 = Math.pow(10.0, 27);
        Checker.check(new Mole(1.0).times(pow27), Rmol);
        Checker.check(Rmol, ronnamole);

   
        
        double pow24 = Math.pow(10.0, 24);
        Checker.check(new Mole(1.0).times(pow24), Ymol);
        Checker.check(Ymol, yottamole);

   
        
        double pow21 = Math.pow(10.0, 21);
        Checker.check(new Mole(1.0).times(pow21), Zmol);
        Checker.check(Zmol, zettamole);

   
        
        double pow18 = Math.pow(10.0, 18);
        Checker.check(new Mole(1.0).times(pow18), Emol);
        Checker.check(Emol, examole);

   
        
        double pow15 = Math.pow(10.0, 15);
        Checker.check(new Mole(1.0).times(pow15), Pmol);
        Checker.check(Pmol, petamole);

   
        
        double pow12 = Math.pow(10.0, 12);
        Checker.check(new Mole(1.0).times(pow12), Tmol);
        Checker.check(Tmol, teramole);

   
        
        double pow9 = Math.pow(10.0, 9);
        Checker.check(new Mole(1.0).times(pow9), Gmol);
        Checker.check(Gmol, gigamole);

   
        
        double pow6 = Math.pow(10.0, 6);
        Checker.check(new Mole(1.0).times(pow6), Mmol);
        Checker.check(Mmol, megamole);

   
        
        double pow3 = Math.pow(10.0, 3);
        Checker.check(new Mole(1.0).times(pow3), kmol);
        Checker.check(kmol, kilomole);

   
        
        double pow2 = Math.pow(10.0, 2);
        Checker.check(new Mole(1.0).times(pow2), hmol);
        Checker.check(hmol, hectomole);

   
        
        double pow1 = Math.pow(10.0, 1);
        Checker.check(new Mole(1.0).times(pow1), damol);
        Checker.check(damol, decamole);

   
        
        double powM1 = Math.pow(10.0, -1);
        Checker.check(new Mole(1.0).times(powM1), dmol);
        Checker.check(dmol, decimole);

   
        
        double powM2 = Math.pow(10.0, -2);
        Checker.check(new Mole(1.0).times(powM2), cmol);
        Checker.check(cmol, centimole);

   
        
        double powM3 = Math.pow(10.0, -3);
        Checker.check(new Mole(1.0).times(powM3), mmol);
        Checker.check(mmol, millimole);

   
        
        double powM6 = Math.pow(10.0, -6);
        Checker.check(new Mole(1.0).times(powM6), μmol);
        Checker.check(μmol, micromole);

   
        
        double powM9 = Math.pow(10.0, -9);
        Checker.check(new Mole(1.0).times(powM9), nmol);
        Checker.check(nmol, nanomole);

   
        
        double powM12 = Math.pow(10.0, -12);
        Checker.check(new Mole(1.0).times(powM12), pmol);
        Checker.check(pmol, picomole);

   
        
        double powM15 = Math.pow(10.0, -15);
        Checker.check(new Mole(1.0).times(powM15), fmol);
        Checker.check(fmol, femtomole);

   
        
        double powM18 = Math.pow(10.0, -18);
        Checker.check(new Mole(1.0).times(powM18), amol);
        Checker.check(amol, attomole);

   
        
        double powM21 = Math.pow(10.0, -21);
        Checker.check(new Mole(1.0).times(powM21), zmol);
        Checker.check(zmol, zeptomole);

   
        
        double powM24 = Math.pow(10.0, -24);
        Checker.check(new Mole(1.0).times(powM24), ymol);
        Checker.check(ymol, yoctomole);

   
        
        double powM27 = Math.pow(10.0, -27);
        Checker.check(new Mole(1.0).times(powM27), rmol);
        Checker.check(rmol, rontomole);

   
        
        double powM30 = Math.pow(10.0, -30);
        Checker.check(new Mole(1.0).times(powM30), qmol);
        Checker.check(qmol, quectomole);
   }
}