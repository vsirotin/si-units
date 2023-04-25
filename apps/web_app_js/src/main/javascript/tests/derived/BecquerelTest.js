        
function testBecquerel() {
   console.log("-Start testBecquerel");      
    
    checkObjects(QBq, new Becquerel(10**30));
    checkObjects(quettaBq, QBq);

    checkObjects(RBq, new Becquerel(10**27));
    checkObjects(ronnaBq, RBq);

    checkObjects(YBq, new Becquerel(10**24));
    checkObjects(yottaBq, YBq);

    checkObjects(ZBq, new Becquerel(10**21));
    checkObjects(zettaBq, ZBq);

    checkObjects(EBq, new Becquerel(10**18));
    checkObjects(exaBq, EBq);

    checkObjects(PBq, new Becquerel(10**15));
    checkObjects(petaBq, PBq);

    checkObjects(TBq, new Becquerel(10**12));
    checkObjects(teraBq, TBq);

    checkObjects(GBq, new Becquerel(10**9));
    checkObjects(gigaBq, GBq);

    checkObjects(MBq, new Becquerel(10**6));
    checkObjects(megaBq, MBq);

    checkObjects(kBq, new Becquerel(10**3));
    checkObjects(kiloBq, kBq);

    checkObjects(hBq, new Becquerel(10**2));
    checkObjects(hectoBq, hBq);

    checkObjects(daBq, new Becquerel(10**1));
    checkObjects(decaBq, daBq);

    checkObjects(dBq, new Becquerel(10**-1));
    checkObjects(deciBq, dBq);

    checkObjects(cBq, new Becquerel(10**-2));
    checkObjects(centiBq, cBq);

    checkObjects(mBq, new Becquerel(10**-3));
    checkObjects(milliBq, mBq);

    checkObjects(μBq, new Becquerel(10**-6));
    checkObjects(microBq, μBq);

    checkObjects(nBq, new Becquerel(10**-9));
    checkObjects(nanoBq, nBq);

    checkObjects(pBq, new Becquerel(10**-12));
    checkObjects(picoBq, pBq);

    checkObjects(fBq, new Becquerel(10**-15));
    checkObjects(femtoBq, fBq);

    checkObjects(aBq, new Becquerel(10**-18));
    checkObjects(attoBq, aBq);

    checkObjects(zBq, new Becquerel(10**-21));
    checkObjects(zeptoBq, zBq);

    checkObjects(yBq, new Becquerel(10**-24));
    checkObjects(yoctoBq, yBq);

    checkObjects(rBq, new Becquerel(10**-27));
    checkObjects(rontoBq, rBq);

    checkObjects(qBq, new Becquerel(10**-30));
    checkObjects(quectoBq, qBq);
    console.log("-Fin testBecquerel");
}
