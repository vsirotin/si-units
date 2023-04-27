        
package eu.sirotin.kotunil.base;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.base.SecondKt.*;

public class  SecondJavaConsoleTest {

    public static void javaConsoleTest() {

       Checker.check(new Second(1.0), s);
       Checker.check(s.times(1.3) , new Second(1.3));
   
        
        double pow30 = Math.pow(10.0, 30);
        Checker.check(new Second(1.0).times(pow30), Qs);
        Checker.check(Qs, quettasecond);

   
        
        double pow27 = Math.pow(10.0, 27);
        Checker.check(new Second(1.0).times(pow27), Rs);
        Checker.check(Rs, ronnasecond);

   
        
        double pow24 = Math.pow(10.0, 24);
        Checker.check(new Second(1.0).times(pow24), Ys);
        Checker.check(Ys, yottasecond);

   
        
        double pow21 = Math.pow(10.0, 21);
        Checker.check(new Second(1.0).times(pow21), Zs);
        Checker.check(Zs, zettasecond);

   
        
        double pow18 = Math.pow(10.0, 18);
        Checker.check(new Second(1.0).times(pow18), Es);
        Checker.check(Es, exasecond);

   
        
        double pow15 = Math.pow(10.0, 15);
        Checker.check(new Second(1.0).times(pow15), Ps);
        Checker.check(Ps, petasecond);

   
        
        double pow12 = Math.pow(10.0, 12);
        Checker.check(new Second(1.0).times(pow12), Ts);
        Checker.check(Ts, terasecond);

   
        
        double pow9 = Math.pow(10.0, 9);
        Checker.check(new Second(1.0).times(pow9), Gs);
        Checker.check(Gs, gigasecond);

   
        
        double pow6 = Math.pow(10.0, 6);
        Checker.check(new Second(1.0).times(pow6), Ms);
        Checker.check(Ms, megasecond);

   
        
        double pow3 = Math.pow(10.0, 3);
        Checker.check(new Second(1.0).times(pow3), ks);
        Checker.check(ks, kilosecond);

   
        
        double pow2 = Math.pow(10.0, 2);
        Checker.check(new Second(1.0).times(pow2), hs);
        Checker.check(hs, hectosecond);

   
        
        double pow1 = Math.pow(10.0, 1);
        Checker.check(new Second(1.0).times(pow1), das);
        Checker.check(das, decasecond);

   
        
        double powM1 = Math.pow(10.0, -1);
        Checker.check(new Second(1.0).times(powM1), ds);
        Checker.check(ds, decisecond);

   
        
        double powM2 = Math.pow(10.0, -2);
        Checker.check(new Second(1.0).times(powM2), cs);
        Checker.check(cs, centisecond);

   
        
        double powM3 = Math.pow(10.0, -3);
        Checker.check(new Second(1.0).times(powM3), ms);
        Checker.check(ms, millisecond);

   
        
        double powM6 = Math.pow(10.0, -6);
        Checker.check(new Second(1.0).times(powM6), μs);
        Checker.check(μs, microsecond);

   
        
        double powM9 = Math.pow(10.0, -9);
        Checker.check(new Second(1.0).times(powM9), ns);
        Checker.check(ns, nanosecond);

   
        
        double powM12 = Math.pow(10.0, -12);
        Checker.check(new Second(1.0).times(powM12), ps);
        Checker.check(ps, picosecond);

   
        
        double powM15 = Math.pow(10.0, -15);
        Checker.check(new Second(1.0).times(powM15), fs);
        Checker.check(fs, femtosecond);


   
        
        double powM21 = Math.pow(10.0, -21);
        Checker.check(new Second(1.0).times(powM21), zs);
        Checker.check(zs, zeptosecond);

   
        
        double powM24 = Math.pow(10.0, -24);
        Checker.check(new Second(1.0).times(powM24), ys);
        Checker.check(ys, yoctosecond);

   
        
        double powM27 = Math.pow(10.0, -27);
        Checker.check(new Second(1.0).times(powM27), rs);
        Checker.check(rs, rontosecond);

   
        
        double powM30 = Math.pow(10.0, -30);
        Checker.check(new Second(1.0).times(powM30), qs);
        Checker.check(qs, quectosecond);
   }
}