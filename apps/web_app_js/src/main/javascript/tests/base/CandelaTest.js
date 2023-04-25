        
function testCandela() {
   console.log("-Start testCandela");      
    
    checkObjects(Qcd, new Candela(10**30));
    checkObjects(quettacandela, Qcd);

    checkObjects(Rcd, new Candela(10**27));
    checkObjects(ronnacandela, Rcd);

    checkObjects(Ycd, new Candela(10**24));
    checkObjects(yottacandela, Ycd);

    checkObjects(Zcd, new Candela(10**21));
    checkObjects(zettacandela, Zcd);

    checkObjects(Ecd, new Candela(10**18));
    checkObjects(exacandela, Ecd);

    checkObjects(Pcd, new Candela(10**15));
    checkObjects(petacandela, Pcd);

    checkObjects(Tcd, new Candela(10**12));
    checkObjects(teracandela, Tcd);

    checkObjects(Gcd, new Candela(10**9));
    checkObjects(gigacandela, Gcd);

    checkObjects(Mcd, new Candela(10**6));
    checkObjects(megacandela, Mcd);

    checkObjects(kcd, new Candela(10**3));
    checkObjects(kilocandela, kcd);

    checkObjects(hcd, new Candela(10**2));
    checkObjects(hectocandela, hcd);

    checkObjects(dacd, new Candela(10**1));
    checkObjects(decacandela, dacd);

    checkObjects(dcd, new Candela(10**-1));
    checkObjects(decicandela, dcd);

    checkObjects(ccd, new Candela(10**-2));
    checkObjects(centicandela, ccd);

    checkObjects(mcd, new Candela(10**-3));
    checkObjects(millicandela, mcd);

    checkObjects(μcd, new Candela(10**-6));
    checkObjects(microcandela, μcd);

    checkObjects(ncd, new Candela(10**-9));
    checkObjects(nanocandela, ncd);

    checkObjects(pcd, new Candela(10**-12));
    checkObjects(picocandela, pcd);

    checkObjects(fcd, new Candela(10**-15));
    checkObjects(femtocandela, fcd);

    checkObjects(acd, new Candela(10**-18));
    checkObjects(attocandela, acd);

    checkObjects(zcd, new Candela(10**-21));
    checkObjects(zeptocandela, zcd);

    checkObjects(ycd, new Candela(10**-24));
    checkObjects(yoctocandela, ycd);

    checkObjects(rcd, new Candela(10**-27));
    checkObjects(rontocandela, rcd);

    checkObjects(qcd, new Candela(10**-30));
    checkObjects(quectocandela, qcd);
    console.log("-Fin testCandela");
}