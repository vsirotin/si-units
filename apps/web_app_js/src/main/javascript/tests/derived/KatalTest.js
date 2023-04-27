        
function testKatal() {
   console.log("-Start testKatal");      
    
    checkObjects(Qkat, new Katal(10**30));
    checkObjects(quettakat, Qkat);

    checkObjects(Rkat, new Katal(10**27));
    checkObjects(ronnakat, Rkat);

    checkObjects(Ykat, new Katal(10**24));
    checkObjects(yottakat, Ykat);

    checkObjects(Zkat, new Katal(10**21));
    checkObjects(zettakat, Zkat);

    checkObjects(Ekat, new Katal(10**18));
    checkObjects(exakat, Ekat);

    checkObjects(Pkat, new Katal(10**15));
    checkObjects(petakat, Pkat);

    checkObjects(Tkat, new Katal(10**12));
    checkObjects(terakat, Tkat);

    checkObjects(Gkat, new Katal(10**9));
    checkObjects(gigakat, Gkat);

    checkObjects(Mkat, new Katal(10**6));
    checkObjects(megakat, Mkat);

    checkObjects(kkat, new Katal(10**3));
    checkObjects(kilokat, kkat);

    checkObjects(hkat, new Katal(10**2));
    checkObjects(hectokat, hkat);

    checkObjects(dakat, new Katal(10**1));
    checkObjects(decakat, dakat);

    checkObjects(dkat, new Katal(10**-1));
    checkObjects(decikat, dkat);

    checkObjects(ckat, new Katal(10**-2));
    checkObjects(centikat, ckat);

    checkObjects(mkat, new Katal(10**-3));
    checkObjects(millikat, mkat);

    checkObjects(μkat, new Katal(10**-6));
    checkObjects(microkat, μkat);

    checkObjects(nkat, new Katal(10**-9));
    checkObjects(nanokat, nkat);

    checkObjects(pkat, new Katal(10**-12));
    checkObjects(picokat, pkat);

    checkObjects(fkat, new Katal(10**-15));
    checkObjects(femtokat, fkat);

    checkObjects(akat, new Katal(10**-18));
    checkObjects(attokat, akat);

    checkObjects(zkat, new Katal(10**-21));
    checkObjects(zeptokat, zkat);

    checkObjects(ykat, new Katal(10**-24));
    checkObjects(yoctokat, ykat);

    checkObjects(rkat, new Katal(10**-27));
    checkObjects(rontokat, rkat);

    checkObjects(qkat, new Katal(10**-30));
    checkObjects(quectokat, qkat);
    console.log("-Fin testKatal");
}
