        
function testOhm() {
   console.log("-Start testOhm");      
    
    checkObjects(QΩ, new Ohm(10**30));
    checkObjects(quettaΩ, QΩ);

    checkObjects(RΩ, new Ohm(10**27));
    checkObjects(ronnaΩ, RΩ);

    checkObjects(YΩ, new Ohm(10**24));
    checkObjects(yottaΩ, YΩ);

    checkObjects(ZΩ, new Ohm(10**21));
    checkObjects(zettaΩ, ZΩ);

    checkObjects(EΩ, new Ohm(10**18));
    checkObjects(exaΩ, EΩ);

    checkObjects(PΩ, new Ohm(10**15));
    checkObjects(petaΩ, PΩ);

    checkObjects(TΩ, new Ohm(10**12));
    checkObjects(teraΩ, TΩ);

    checkObjects(GΩ, new Ohm(10**9));
    checkObjects(gigaΩ, GΩ);

    checkObjects(MΩ, new Ohm(10**6));
    checkObjects(megaΩ, MΩ);

    checkObjects(kΩ, new Ohm(10**3));
    checkObjects(kiloΩ, kΩ);

    checkObjects(hΩ, new Ohm(10**2));
    checkObjects(hectoΩ, hΩ);

    checkObjects(daΩ, new Ohm(10**1));
    checkObjects(decaΩ, daΩ);

    checkObjects(dΩ, new Ohm(10**-1));
    checkObjects(deciΩ, dΩ);

    checkObjects(cΩ, new Ohm(10**-2));
    checkObjects(centiΩ, cΩ);

    checkObjects(mΩ, new Ohm(10**-3));
    checkObjects(milliΩ, mΩ);

    checkObjects(μΩ, new Ohm(10**-6));
    checkObjects(microΩ, μΩ);

    checkObjects(nΩ, new Ohm(10**-9));
    checkObjects(nanoΩ, nΩ);

    checkObjects(pΩ, new Ohm(10**-12));
    checkObjects(picoΩ, pΩ);

    checkObjects(fΩ, new Ohm(10**-15));
    checkObjects(femtoΩ, fΩ);

    checkObjects(aΩ, new Ohm(10**-18));
    checkObjects(attoΩ, aΩ);

    checkObjects(zΩ, new Ohm(10**-21));
    checkObjects(zeptoΩ, zΩ);

    checkObjects(yΩ, new Ohm(10**-24));
    checkObjects(yoctoΩ, yΩ);

    checkObjects(rΩ, new Ohm(10**-27));
    checkObjects(rontoΩ, rΩ);

    checkObjects(qΩ, new Ohm(10**-30));
    checkObjects(quectoΩ, qΩ);
    console.log("-Fin testOhm");
}
