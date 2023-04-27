        
function testHertz() {
   console.log("-Start testHertz");      
    
    checkObjects(QHz, new Hertz(10**30));
    checkObjects(quettaHz, QHz);

    checkObjects(RHz, new Hertz(10**27));
    checkObjects(ronnaHz, RHz);

    checkObjects(YHz, new Hertz(10**24));
    checkObjects(yottaHz, YHz);

    checkObjects(ZHz, new Hertz(10**21));
    checkObjects(zettaHz, ZHz);

    checkObjects(EHz, new Hertz(10**18));
    checkObjects(exaHz, EHz);

    checkObjects(PHz, new Hertz(10**15));
    checkObjects(petaHz, PHz);

    checkObjects(THz, new Hertz(10**12));
    checkObjects(teraHz, THz);

    checkObjects(GHz, new Hertz(10**9));
    checkObjects(gigaHz, GHz);

    checkObjects(MHz, new Hertz(10**6));
    checkObjects(megaHz, MHz);

    checkObjects(kHz, new Hertz(10**3));
    checkObjects(kiloHz, kHz);

    checkObjects(hHz, new Hertz(10**2));
    checkObjects(hectoHz, hHz);

    checkObjects(daHz, new Hertz(10**1));
    checkObjects(decaHz, daHz);

    checkObjects(dHz, new Hertz(10**-1));
    checkObjects(deciHz, dHz);

    checkObjects(cHz, new Hertz(10**-2));
    checkObjects(centiHz, cHz);

    checkObjects(mHz, new Hertz(10**-3));
    checkObjects(milliHz, mHz);

    checkObjects(μHz, new Hertz(10**-6));
    checkObjects(microHz, μHz);

    checkObjects(nHz, new Hertz(10**-9));
    checkObjects(nanoHz, nHz);

    checkObjects(pHz, new Hertz(10**-12));
    checkObjects(picoHz, pHz);

    checkObjects(fHz, new Hertz(10**-15));
    checkObjects(femtoHz, fHz);

    checkObjects(aHz, new Hertz(10**-18));
    checkObjects(attoHz, aHz);

    checkObjects(zHz, new Hertz(10**-21));
    checkObjects(zeptoHz, zHz);

    checkObjects(yHz, new Hertz(10**-24));
    checkObjects(yoctoHz, yHz);

    checkObjects(rHz, new Hertz(10**-27));
    checkObjects(rontoHz, rHz);

    checkObjects(qHz, new Hertz(10**-30));
    checkObjects(quectoHz, qHz);
    console.log("-Fin testHertz");
}
