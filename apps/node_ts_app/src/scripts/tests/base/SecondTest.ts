  
import {checkObjects, checkValues, checkBoolean} from '../../checker';
import {eu} from 'kotunil-js-lib';  
const {sirotin: {kotunil: {base: {Second, s, quettasecond, Qs, ronnasecond, Rs, yottasecond, Ys, zettasecond, Zs, exasecond, Es, petasecond, Ps, terasecond, Ts, gigasecond, Gs, megasecond, Ms, kilosecond, ks, hectosecond, hs, decasecond, das, decisecond, ds, centisecond, cs, microsecond, μs, nanosecond, ns, femtosecond, fs, attosecond, as }}}} = eu;            
export function testSecond() {
   console.log("-Start testSecond");      
    
    checkObjects(Qs, new Second(10**30));
    checkObjects(quettasecond, Qs);

    checkObjects(Rs, new Second(10**27));
    checkObjects(ronnasecond, Rs);

    checkObjects(Ys, new Second(10**24));
    checkObjects(yottasecond, Ys);

    checkObjects(Zs, new Second(10**21));
    checkObjects(zettasecond, Zs);

    checkObjects(Es, new Second(10**18));
    checkObjects(exasecond, Es);

    checkObjects(Ps, new Second(10**15));
    checkObjects(petasecond, Ps);

    checkObjects(Ts, new Second(10**12));
    checkObjects(terasecond, Ts);

    checkObjects(Gs, new Second(10**9));
    checkObjects(gigasecond, Gs);

    checkObjects(Ms, new Second(10**6));
    checkObjects(megasecond, Ms);

    checkObjects(ks, new Second(10**3));
    checkObjects(kilosecond, ks);

    checkObjects(hs, new Second(10**2));
    checkObjects(hectosecond, hs);

    checkObjects(das, new Second(10**1));
    checkObjects(decasecond, das);

    checkObjects(ds, new Second(10**-1));
    checkObjects(decisecond, ds);

    checkObjects(cs, new Second(10**-2));
    checkObjects(centisecond, cs);

    checkObjects(μs, new Second(10**-6));
    checkObjects(microsecond, μs);

    checkObjects(ns, new Second(10**-9));
    checkObjects(nanosecond, ns);

    checkObjects(fs, new Second(10**-15));
    checkObjects(femtosecond, fs);

    checkObjects(as, new Second(10**-18));
    checkObjects(attosecond, as);
    console.log("-Fin testSecond");
}