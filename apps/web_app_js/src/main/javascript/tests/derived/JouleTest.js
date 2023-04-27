        
function testJoule() {
   console.log("-Start testJoule");      
    
    checkObjects(QJ, new Joule(10**30));
    checkObjects(quettaJ, QJ);

    checkObjects(RJ, new Joule(10**27));
    checkObjects(ronnaJ, RJ);

    checkObjects(YJ, new Joule(10**24));
    checkObjects(yottaJ, YJ);

    checkObjects(ZJ, new Joule(10**21));
    checkObjects(zettaJ, ZJ);

    checkObjects(EJ, new Joule(10**18));
    checkObjects(exaJ, EJ);

    checkObjects(PJ, new Joule(10**15));
    checkObjects(petaJ, PJ);

    checkObjects(TJ, new Joule(10**12));
    checkObjects(teraJ, TJ);

    checkObjects(GJ, new Joule(10**9));
    checkObjects(gigaJ, GJ);

    checkObjects(MJ, new Joule(10**6));
    checkObjects(megaJ, MJ);

    checkObjects(kJ, new Joule(10**3));
    checkObjects(kiloJ, kJ);

    checkObjects(hJ, new Joule(10**2));
    checkObjects(hectoJ, hJ);

    checkObjects(daJ, new Joule(10**1));
    checkObjects(decaJ, daJ);

    checkObjects(dJ, new Joule(10**-1));
    checkObjects(deciJ, dJ);

    checkObjects(cJ, new Joule(10**-2));
    checkObjects(centiJ, cJ);

    checkObjects(mJ, new Joule(10**-3));
    checkObjects(milliJ, mJ);

    checkObjects(μJ, new Joule(10**-6));
    checkObjects(microJ, μJ);

    checkObjects(nJ, new Joule(10**-9));
    checkObjects(nanoJ, nJ);

    checkObjects(pJ, new Joule(10**-12));
    checkObjects(picoJ, pJ);

    checkObjects(fJ, new Joule(10**-15));
    checkObjects(femtoJ, fJ);

    checkObjects(aJ, new Joule(10**-18));
    checkObjects(attoJ, aJ);

    checkObjects(zJ, new Joule(10**-21));
    checkObjects(zeptoJ, zJ);

    checkObjects(yJ, new Joule(10**-24));
    checkObjects(yoctoJ, yJ);

    checkObjects(rJ, new Joule(10**-27));
    checkObjects(rontoJ, rJ);

    checkObjects(qJ, new Joule(10**-30));
    checkObjects(quectoJ, qJ);
    console.log("-Fin testJoule");
}
