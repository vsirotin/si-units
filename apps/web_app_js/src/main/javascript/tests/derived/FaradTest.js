        
function testFarad() {
   console.log("-Start testFarad");      
    
    checkObjects(QF, new Farad(10**30));
    checkObjects(quettaF, QF);

    checkObjects(RF, new Farad(10**27));
    checkObjects(ronnaF, RF);

    checkObjects(YF, new Farad(10**24));
    checkObjects(yottaF, YF);

    checkObjects(ZF, new Farad(10**21));
    checkObjects(zettaF, ZF);

    checkObjects(EF, new Farad(10**18));
    checkObjects(exaF, EF);

    checkObjects(PF, new Farad(10**15));
    checkObjects(petaF, PF);

    checkObjects(TF, new Farad(10**12));
    checkObjects(teraF, TF);

    checkObjects(GF, new Farad(10**9));
    checkObjects(gigaF, GF);

    checkObjects(MF, new Farad(10**6));
    checkObjects(megaF, MF);

    checkObjects(kF, new Farad(10**3));
    checkObjects(kiloF, kF);

    checkObjects(hF, new Farad(10**2));
    checkObjects(hectoF, hF);

    checkObjects(daF, new Farad(10**1));
    checkObjects(decaF, daF);

    checkObjects(dF, new Farad(10**-1));
    checkObjects(deciF, dF);

    checkObjects(cF, new Farad(10**-2));
    checkObjects(centiF, cF);

    checkObjects(mF, new Farad(10**-3));
    checkObjects(milliF, mF);

    checkObjects(μF, new Farad(10**-6));
    checkObjects(microF, μF);

    checkObjects(nF, new Farad(10**-9));
    checkObjects(nanoF, nF);

    checkObjects(pF, new Farad(10**-12));
    checkObjects(picoF, pF);

    checkObjects(fF, new Farad(10**-15));
    checkObjects(femtoF, fF);

    checkObjects(aF, new Farad(10**-18));
    checkObjects(attoF, aF);

    checkObjects(zF, new Farad(10**-21));
    checkObjects(zeptoF, zF);

    checkObjects(yF, new Farad(10**-24));
    checkObjects(yoctoF, yF);

    checkObjects(rF, new Farad(10**-27));
    checkObjects(rontoF, rF);

    checkObjects(qF, new Farad(10**-30));
    checkObjects(quectoF, qF);
    console.log("-Fin testFarad");
}
