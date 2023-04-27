        
function testPascal() {
   console.log("-Start testPascal");      
    
    checkObjects(QPa, new Pascal(10**30));
    checkObjects(quettaPa, QPa);

    checkObjects(RPa, new Pascal(10**27));
    checkObjects(ronnaPa, RPa);

    checkObjects(YPa, new Pascal(10**24));
    checkObjects(yottaPa, YPa);

    checkObjects(ZPa, new Pascal(10**21));
    checkObjects(zettaPa, ZPa);

    checkObjects(EPa, new Pascal(10**18));
    checkObjects(exaPa, EPa);

    checkObjects(PPa, new Pascal(10**15));
    checkObjects(petaPa, PPa);

    checkObjects(TPa, new Pascal(10**12));
    checkObjects(teraPa, TPa);

    checkObjects(GPa, new Pascal(10**9));
    checkObjects(gigaPa, GPa);

    checkObjects(MPa, new Pascal(10**6));
    checkObjects(megaPa, MPa);

    checkObjects(kPa, new Pascal(10**3));
    checkObjects(kiloPa, kPa);

    checkObjects(hPa, new Pascal(10**2));
    checkObjects(hectoPa, hPa);

    checkObjects(daPa, new Pascal(10**1));
    checkObjects(decaPa, daPa);

    checkObjects(dPa, new Pascal(10**-1));
    checkObjects(deciPa, dPa);

    checkObjects(cPa, new Pascal(10**-2));
    checkObjects(centiPa, cPa);

    checkObjects(mPa, new Pascal(10**-3));
    checkObjects(milliPa, mPa);

    checkObjects(μPa, new Pascal(10**-6));
    checkObjects(microPa, μPa);

    checkObjects(nPa, new Pascal(10**-9));
    checkObjects(nanoPa, nPa);

    checkObjects(pPa, new Pascal(10**-12));
    checkObjects(picoPa, pPa);

    checkObjects(fPa, new Pascal(10**-15));
    checkObjects(femtoPa, fPa);

    checkObjects(aPa, new Pascal(10**-18));
    checkObjects(attoPa, aPa);

    checkObjects(zPa, new Pascal(10**-21));
    checkObjects(zeptoPa, zPa);

    checkObjects(yPa, new Pascal(10**-24));
    checkObjects(yoctoPa, yPa);

    checkObjects(rPa, new Pascal(10**-27));
    checkObjects(rontoPa, rPa);

    checkObjects(qPa, new Pascal(10**-30));
    checkObjects(quectoPa, qPa);
    console.log("-Fin testPascal");
}
