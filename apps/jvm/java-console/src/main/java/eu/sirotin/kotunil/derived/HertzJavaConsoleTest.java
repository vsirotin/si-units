        
package eu.sirotin.kotunil.derived;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.derived.HertzKt.*;

public class  HertzJavaConsoleTest {

    public static void javaConsoleTest() {
        Checker.check(Hz.plus(Hz), Hz.times(2));
              
        double pow30 = Math.pow(10.0, 30);
        Checker.check(Hz.times(pow30), QHz);
        Checker.check(Hz.times(pow30), getQuettahertz(1.0));
          
        double pow27 = Math.pow(10.0, 27);
        Checker.check(Hz.times(pow27), RHz);
        Checker.check(Hz.times(pow27), getRonnahertz(1.0));
          
        double pow24 = Math.pow(10.0, 24);
        Checker.check(Hz.times(pow24), YHz);
        Checker.check(Hz.times(pow24), getYottahertz(1.0));
          
        double pow21 = Math.pow(10.0, 21);
        Checker.check(Hz.times(pow21), ZHz);
        Checker.check(Hz.times(pow21), getZettahertz(1.0));
          
        double pow18 = Math.pow(10.0, 18);
        Checker.check(Hz.times(pow18), EHz);
        Checker.check(Hz.times(pow18), getExahertz(1.0));
          
        double pow15 = Math.pow(10.0, 15);
        Checker.check(Hz.times(pow15), PHz);
        Checker.check(Hz.times(pow15), getPetahertz(1.0));
          
        double pow12 = Math.pow(10.0, 12);
        Checker.check(Hz.times(pow12), THz);
        Checker.check(Hz.times(pow12), getTerahertz(1.0));
          
        double pow9 = Math.pow(10.0, 9);
        Checker.check(Hz.times(pow9), GHz);
        Checker.check(Hz.times(pow9), getGigahertz(1.0));
          
        double pow6 = Math.pow(10.0, 6);
        Checker.check(Hz.times(pow6), MHz);
        Checker.check(Hz.times(pow6), getMegahertz(1.0));
          
        double pow3 = Math.pow(10.0, 3);
        Checker.check(Hz.times(pow3), kHz);
        Checker.check(Hz.times(pow3), getKilohertz(1.0));
          
        double pow2 = Math.pow(10.0, 2);
        Checker.check(Hz.times(pow2), hHz);
        Checker.check(Hz.times(pow2), getHectohertz(1.0));
          
        double pow1 = Math.pow(10.0, 1);
        Checker.check(Hz.times(pow1), daHz);
        Checker.check(Hz.times(pow1), getDecahertz(1.0));
          
        double powM1 = Math.pow(10.0, -1);
        Checker.check(Hz.times(powM1), dHz);
        Checker.check(Hz.times(powM1), getDecihertz(1.0));
          
        double powM2 = Math.pow(10.0, -2);
        Checker.check(Hz.times(powM2), cHz);
        Checker.check(Hz.times(powM2), getCentihertz(1.0));
          
        double powM3 = Math.pow(10.0, -3);
        Checker.check(Hz.times(powM3), mHz);
        Checker.check(Hz.times(powM3), getMillihertz(1.0));
          
        double powM6 = Math.pow(10.0, -6);
        Checker.check(Hz.times(powM6), μHz);
        Checker.check(Hz.times(powM6), getMicrohertz(1.0));
          
        double powM9 = Math.pow(10.0, -9);
        Checker.check(Hz.times(powM9), nHz);
        Checker.check(Hz.times(powM9), getNanohertz(1.0));
          
        double powM12 = Math.pow(10.0, -12);
        Checker.check(Hz.times(powM12), pHz);
        Checker.check(Hz.times(powM12), getPicohertz(1.0));
          
        double powM15 = Math.pow(10.0, -15);
        Checker.check(Hz.times(powM15), fHz);
        Checker.check(Hz.times(powM15), getFemtohertz(1.0));
          
        double powM18 = Math.pow(10.0, -18);
        Checker.check(Hz.times(powM18), aHz);
        Checker.check(Hz.times(powM18), getAttohertz(1.0));
          
        double powM21 = Math.pow(10.0, -21);
        Checker.check(Hz.times(powM21), zHz);
        Checker.check(Hz.times(powM21), getZeptohertz(1.0));
          
        double powM24 = Math.pow(10.0, -24);
        Checker.check(Hz.times(powM24), yHz);
        Checker.check(Hz.times(powM24), getYoctohertz(1.0));
          
        double powM27 = Math.pow(10.0, -27);
        Checker.check(Hz.times(powM27), rHz);
        Checker.check(Hz.times(powM27), getRontohertz(1.0));
          
        double powM30 = Math.pow(10.0, -30);
        Checker.check(Hz.times(powM30), qHz);
        Checker.check(Hz.times(powM30), getQuectohertz(1.0));   }
}