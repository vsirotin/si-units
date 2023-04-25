        
function testSievert() {
   console.log("-Start testSievert");      
    
    checkObjects(QSv, new Sievert(10**30));
    checkObjects(quettaSv, QSv);

    checkObjects(RSv, new Sievert(10**27));
    checkObjects(ronnaSv, RSv);

    checkObjects(YSv, new Sievert(10**24));
    checkObjects(yottaSv, YSv);

    checkObjects(ZSv, new Sievert(10**21));
    checkObjects(zettaSv, ZSv);

    checkObjects(ESv, new Sievert(10**18));
    checkObjects(exaSv, ESv);

    checkObjects(PSv, new Sievert(10**15));
    checkObjects(petaSv, PSv);

    checkObjects(TSv, new Sievert(10**12));
    checkObjects(teraSv, TSv);

    checkObjects(GSv, new Sievert(10**9));
    checkObjects(gigaSv, GSv);

    checkObjects(MSv, new Sievert(10**6));
    checkObjects(megaSv, MSv);

    checkObjects(kSv, new Sievert(10**3));
    checkObjects(kiloSv, kSv);

    checkObjects(hSv, new Sievert(10**2));
    checkObjects(hectoSv, hSv);

    checkObjects(daSv, new Sievert(10**1));
    checkObjects(decaSv, daSv);

    checkObjects(dSv, new Sievert(10**-1));
    checkObjects(deciSv, dSv);

    checkObjects(cSv, new Sievert(10**-2));
    checkObjects(centiSv, cSv);

    checkObjects(mSv, new Sievert(10**-3));
    checkObjects(milliSv, mSv);

    checkObjects(μSv, new Sievert(10**-6));
    checkObjects(microSv, μSv);

    checkObjects(nSv, new Sievert(10**-9));
    checkObjects(nanoSv, nSv);

    checkObjects(pSv, new Sievert(10**-12));
    checkObjects(picoSv, pSv);

    checkObjects(fSv, new Sievert(10**-15));
    checkObjects(femtoSv, fSv);

    checkObjects(aSv, new Sievert(10**-18));
    checkObjects(attoSv, aSv);

    checkObjects(zSv, new Sievert(10**-21));
    checkObjects(zeptoSv, zSv);

    checkObjects(ySv, new Sievert(10**-24));
    checkObjects(yoctoSv, ySv);

    checkObjects(rSv, new Sievert(10**-27));
    checkObjects(rontoSv, rSv);

    checkObjects(qSv, new Sievert(10**-30));
    checkObjects(quectoSv, qSv);
    console.log("-Fin testSievert");
}
