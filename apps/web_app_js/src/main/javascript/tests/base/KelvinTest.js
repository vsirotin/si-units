        
function testKelvin() {
   console.log("-Start testKelvin");      
    
    checkObjects(QK, new Kelvin(10**30));
    checkObjects(quettakelvin, QK);

    checkObjects(RK, new Kelvin(10**27));
    checkObjects(ronnakelvin, RK);

    checkObjects(YK, new Kelvin(10**24));
    checkObjects(yottakelvin, YK);

    checkObjects(ZK, new Kelvin(10**21));
    checkObjects(zettakelvin, ZK);

    checkObjects(EK, new Kelvin(10**18));
    checkObjects(exakelvin, EK);

    checkObjects(PK, new Kelvin(10**15));
    checkObjects(petakelvin, PK);

    checkObjects(TK, new Kelvin(10**12));
    checkObjects(terakelvin, TK);

    checkObjects(GK, new Kelvin(10**9));
    checkObjects(gigakelvin, GK);

    checkObjects(MK, new Kelvin(10**6));
    checkObjects(megakelvin, MK);

    checkObjects(kK, new Kelvin(10**3));
    checkObjects(kilokelvin, kK);

    checkObjects(hK, new Kelvin(10**2));
    checkObjects(hectokelvin, hK);

    checkObjects(daK, new Kelvin(10**1));
    checkObjects(decakelvin, daK);

    checkObjects(dK, new Kelvin(10**-1));
    checkObjects(decikelvin, dK);

    checkObjects(cK, new Kelvin(10**-2));
    checkObjects(centikelvin, cK);

    checkObjects(mK, new Kelvin(10**-3));
    checkObjects(millikelvin, mK);

    checkObjects(μK, new Kelvin(10**-6));
    checkObjects(microkelvin, μK);

    checkObjects(nK, new Kelvin(10**-9));
    checkObjects(nanokelvin, nK);

    checkObjects(pK, new Kelvin(10**-12));
    checkObjects(picokelvin, pK);

    checkObjects(fK, new Kelvin(10**-15));
    checkObjects(femtokelvin, fK);

    checkObjects(aK, new Kelvin(10**-18));
    checkObjects(attokelvin, aK);

    checkObjects(zK, new Kelvin(10**-21));
    checkObjects(zeptokelvin, zK);

    checkObjects(yK, new Kelvin(10**-24));
    checkObjects(yoctokelvin, yK);

    checkObjects(rK, new Kelvin(10**-27));
    checkObjects(rontokelvin, rK);

    checkObjects(qK, new Kelvin(10**-30));
    checkObjects(quectokelvin, qK);
    console.log("-Fin testKelvin");
}