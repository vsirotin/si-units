        
function testSecond() {
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

    checkObjects(ms, new Second(10**-3));
    checkObjects(millisecond, ms);

    checkObjects(μs, new Second(10**-6));
    checkObjects(microsecond, μs);

    checkObjects(ns, new Second(10**-9));
    checkObjects(nanosecond, ns);

    checkObjects(ps, new Second(10**-12));
    checkObjects(picosecond, ps);

    checkObjects(fs, new Second(10**-15));
    checkObjects(femtosecond, fs);

    checkObjects(as, new Second(10**-18));
    checkObjects(attosecond, as);

    checkObjects(zs, new Second(10**-21));
    checkObjects(zeptosecond, zs);

    checkObjects(ys, new Second(10**-24));
    checkObjects(yoctosecond, ys);

    checkObjects(rs, new Second(10**-27));
    checkObjects(rontosecond, rs);

    checkObjects(qs, new Second(10**-30));
    checkObjects(quectosecond, qs);
    console.log("-Fin testSecond");
}