        
function testGray() {
   console.log("-Start testGray");      
    
    checkObjects(QGy, new Gray(10**30));
    checkObjects(quettaGy, QGy);

    checkObjects(RGy, new Gray(10**27));
    checkObjects(ronnaGy, RGy);

    checkObjects(YGy, new Gray(10**24));
    checkObjects(yottaGy, YGy);

    checkObjects(ZGy, new Gray(10**21));
    checkObjects(zettaGy, ZGy);

    checkObjects(EGy, new Gray(10**18));
    checkObjects(exaGy, EGy);

    checkObjects(PGy, new Gray(10**15));
    checkObjects(petaGy, PGy);

    checkObjects(TGy, new Gray(10**12));
    checkObjects(teraGy, TGy);

    checkObjects(GGy, new Gray(10**9));
    checkObjects(gigaGy, GGy);

    checkObjects(MGy, new Gray(10**6));
    checkObjects(megaGy, MGy);

    checkObjects(kGy, new Gray(10**3));
    checkObjects(kiloGy, kGy);

    checkObjects(hGy, new Gray(10**2));
    checkObjects(hectoGy, hGy);

    checkObjects(daGy, new Gray(10**1));
    checkObjects(decaGy, daGy);

    checkObjects(dGy, new Gray(10**-1));
    checkObjects(deciGy, dGy);

    checkObjects(cGy, new Gray(10**-2));
    checkObjects(centiGy, cGy);

    checkObjects(mGy, new Gray(10**-3));
    checkObjects(milliGy, mGy);

    checkObjects(μGy, new Gray(10**-6));
    checkObjects(microGy, μGy);

    checkObjects(nGy, new Gray(10**-9));
    checkObjects(nanoGy, nGy);

    checkObjects(pGy, new Gray(10**-12));
    checkObjects(picoGy, pGy);

    checkObjects(fGy, new Gray(10**-15));
    checkObjects(femtoGy, fGy);

    checkObjects(aGy, new Gray(10**-18));
    checkObjects(attoGy, aGy);

    checkObjects(zGy, new Gray(10**-21));
    checkObjects(zeptoGy, zGy);

    checkObjects(yGy, new Gray(10**-24));
    checkObjects(yoctoGy, yGy);

    checkObjects(rGy, new Gray(10**-27));
    checkObjects(rontoGy, rGy);

    checkObjects(qGy, new Gray(10**-30));
    checkObjects(quectoGy, qGy);
    console.log("-Fin testGray");
}
