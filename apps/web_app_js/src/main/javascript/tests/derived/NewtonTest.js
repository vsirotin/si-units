        
function testNewton() {
   console.log("-Start testNewton");      
    
    checkObjects(QN, new Newton(10**30));
    checkObjects(quettaN, QN);

    checkObjects(RN, new Newton(10**27));
    checkObjects(ronnaN, RN);

    checkObjects(YN, new Newton(10**24));
    checkObjects(yottaN, YN);

    checkObjects(ZN, new Newton(10**21));
    checkObjects(zettaN, ZN);

    checkObjects(EN, new Newton(10**18));
    checkObjects(exaN, EN);

    checkObjects(PN, new Newton(10**15));
    checkObjects(petaN, PN);

    checkObjects(TN, new Newton(10**12));
    checkObjects(teraN, TN);

    checkObjects(GN, new Newton(10**9));
    checkObjects(gigaN, GN);

    checkObjects(MN, new Newton(10**6));
    checkObjects(megaN, MN);

    checkObjects(kN, new Newton(10**3));
    checkObjects(kiloN, kN);

    checkObjects(hN, new Newton(10**2));
    checkObjects(hectoN, hN);

    checkObjects(daN, new Newton(10**1));
    checkObjects(decaN, daN);

    checkObjects(dN, new Newton(10**-1));
    checkObjects(deciN, dN);

    checkObjects(cN, new Newton(10**-2));
    checkObjects(centiN, cN);

    checkObjects(mN, new Newton(10**-3));
    checkObjects(milliN, mN);

    checkObjects(μN, new Newton(10**-6));
    checkObjects(microN, μN);

    checkObjects(nN, new Newton(10**-9));
    checkObjects(nanoN, nN);

    checkObjects(pN, new Newton(10**-12));
    checkObjects(picoN, pN);

    checkObjects(fN, new Newton(10**-15));
    checkObjects(femtoN, fN);

    checkObjects(aN, new Newton(10**-18));
    checkObjects(attoN, aN);

    checkObjects(zN, new Newton(10**-21));
    checkObjects(zeptoN, zN);

    checkObjects(yN, new Newton(10**-24));
    checkObjects(yoctoN, yN);

    checkObjects(rN, new Newton(10**-27));
    checkObjects(rontoN, rN);

    checkObjects(qN, new Newton(10**-30));
    checkObjects(quectoN, qN);
    console.log("-Fin testNewton");
}
