        
package eu.sirotin.kotunil.base;

import eu.sirotin.kotunil.app.java.Checker;
import static eu.sirotin.kotunil.base.SecondKt.*;

public class  SecondJavaConsoleTest {

        public static void javaConsoleTest() {

       Checker.check(new Second(1.0), s);
       Checker.check(s.times(1.3) , new Second(1.3));
   
        
        double pow30 = Math.pow(10.0, 30);
        Checker.check(new Second(1.0).times(pow30), Qs);
        Checker.check(new Second(1.0).times(pow30), getQuettasecond());
        Checker.check(Qs, getQuettasecond());

   
        
        double pow27 = Math.pow(10.0, 27);
        Checker.check(new Second(1.0).times(pow27), Rs);
        Checker.check(new Second(1.0).times(pow27), getRonnasecond());
        Checker.check(Rs, getRonnasecond());

   
        
        double pow24 = Math.pow(10.0, 24);
        Checker.check(new Second(1.0).times(pow24), Ys);
        Checker.check(new Second(1.0).times(pow24), getYottasecond());
        Checker.check(Ys, getYottasecond());

   
        
        double pow21 = Math.pow(10.0, 21);
        Checker.check(new Second(1.0).times(pow21), Zs);
        Checker.check(new Second(1.0).times(pow21), getZettasecond());
        Checker.check(Zs, getZettasecond());

   
        
        double pow18 = Math.pow(10.0, 18);
        Checker.check(new Second(1.0).times(pow18), Es);
        Checker.check(new Second(1.0).times(pow18), getExasecond());
        Checker.check(Es, getExasecond());

   
        
        double pow15 = Math.pow(10.0, 15);
        Checker.check(new Second(1.0).times(pow15), Ps);
        Checker.check(new Second(1.0).times(pow15), getPetasecond());
        Checker.check(Ps, getPetasecond());

   
        
        double pow12 = Math.pow(10.0, 12);
        Checker.check(new Second(1.0).times(pow12), Ts);
        Checker.check(new Second(1.0).times(pow12), getTerasecond());
        Checker.check(Ts, getTerasecond());

   
        
        double pow9 = Math.pow(10.0, 9);
        Checker.check(new Second(1.0).times(pow9), Gs);
        Checker.check(new Second(1.0).times(pow9), getGigasecond());
        Checker.check(Gs, getGigasecond());

   
        
        double pow6 = Math.pow(10.0, 6);
        Checker.check(new Second(1.0).times(pow6), Ms);
        Checker.check(new Second(1.0).times(pow6), getMegasecond());
        Checker.check(Ms, getMegasecond());

   
        
        double pow3 = Math.pow(10.0, 3);
        Checker.check(new Second(1.0).times(pow3), ks);
        Checker.check(new Second(1.0).times(pow3), getKilosecond());
        Checker.check(ks, getKilosecond());

   
        
        double pow2 = Math.pow(10.0, 2);
        Checker.check(new Second(1.0).times(pow2), hs);
        Checker.check(new Second(1.0).times(pow2), getHectosecond());
        Checker.check(hs, getHectosecond());

   
        
        double pow1 = Math.pow(10.0, 1);
        Checker.check(new Second(1.0).times(pow1), das);
        Checker.check(new Second(1.0).times(pow1), getDecasecond());
        Checker.check(das, getDecasecond());

   
        
        double powM1 = Math.pow(10.0, -1);
        Checker.check(new Second(1.0).times(powM1), ds);
        Checker.check(new Second(1.0).times(powM1), getDecisecond());
        Checker.check(ds, getDecisecond());

   
        
        double powM2 = Math.pow(10.0, -2);
        Checker.check(new Second(1.0).times(powM2), cs);
        Checker.check(new Second(1.0).times(powM2), getCentisecond());
        Checker.check(cs, getCentisecond());

   
        
        double powM3 = Math.pow(10.0, -3);
        Checker.check(new Second(1.0).times(powM3), ms);
        Checker.check(new Second(1.0).times(powM3), getMillisecond());
        Checker.check(ms, getMillisecond());

   
        
        double powM6 = Math.pow(10.0, -6);
        Checker.check(new Second(1.0).times(powM6), μs);
        Checker.check(new Second(1.0).times(powM6), getMicrosecond());
        Checker.check(μs, getMicrosecond());

   
        
        double powM9 = Math.pow(10.0, -9);
        Checker.check(new Second(1.0).times(powM9), ns);
        Checker.check(new Second(1.0).times(powM9), getNanosecond());
        Checker.check(ns, getNanosecond());

   
        
        double powM12 = Math.pow(10.0, -12);
        Checker.check(new Second(1.0).times(powM12), ps);
        Checker.check(new Second(1.0).times(powM12), getPicosecond());
        Checker.check(ps, getPicosecond());

   
        
        double powM15 = Math.pow(10.0, -15);
        Checker.check(new Second(1.0).times(powM15), fs);
        Checker.check(new Second(1.0).times(powM15), getFemtosecond());
        Checker.check(fs, getFemtosecond());


   
        
        double powM21 = Math.pow(10.0, -21);
        Checker.check(new Second(1.0).times(powM21), zs);
        Checker.check(new Second(1.0).times(powM21), getZeptosecond());
        Checker.check(zs, getZeptosecond());

   
        
        double powM24 = Math.pow(10.0, -24);
        Checker.check(new Second(1.0).times(powM24), ys);
        Checker.check(new Second(1.0).times(powM24), getYoctosecond());
        Checker.check(ys, getYoctosecond());

   
        
        double powM27 = Math.pow(10.0, -27);
        Checker.check(new Second(1.0).times(powM27), rs);
        Checker.check(new Second(1.0).times(powM27), getRontosecond());
        Checker.check(rs, getRontosecond());

   
        
        double powM30 = Math.pow(10.0, -30);
        Checker.check(new Second(1.0).times(powM30), qs);
        Checker.check(new Second(1.0).times(powM30), getQuectosecond());
        Checker.check(qs, getQuectosecond());
   }
}