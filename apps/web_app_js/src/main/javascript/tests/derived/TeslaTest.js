        
function testTesla() {
   console.log("-Start testTesla");      
    
    checkObjects(QT, new Tesla(10**30));
    checkObjects(quettaT, QT);

    checkObjects(RT, new Tesla(10**27));
    checkObjects(ronnaT, RT);

    checkObjects(YT, new Tesla(10**24));
    checkObjects(yottaT, YT);

    checkObjects(ZT, new Tesla(10**21));
    checkObjects(zettaT, ZT);

    checkObjects(ET, new Tesla(10**18));
    checkObjects(exaT, ET);

    checkObjects(PT, new Tesla(10**15));
    checkObjects(petaT, PT);

    checkObjects(TT, new Tesla(10**12));
    checkObjects(teraT, TT);

    checkObjects(GT, new Tesla(10**9));
    checkObjects(gigaT, GT);

    checkObjects(MT, new Tesla(10**6));
    checkObjects(megaT, MT);

    checkObjects(kT, new Tesla(10**3));
    checkObjects(kiloT, kT);

    checkObjects(hT, new Tesla(10**2));
    checkObjects(hectoT, hT);

    checkObjects(daT, new Tesla(10**1));
    checkObjects(decaT, daT);

    checkObjects(dT, new Tesla(10**-1));
    checkObjects(deciT, dT);

    checkObjects(cT, new Tesla(10**-2));
    checkObjects(centiT, cT);

    checkObjects(mT, new Tesla(10**-3));
    checkObjects(milliT, mT);

    checkObjects(μT, new Tesla(10**-6));
    checkObjects(microT, μT);

    checkObjects(nT, new Tesla(10**-9));
    checkObjects(nanoT, nT);

    checkObjects(pT, new Tesla(10**-12));
    checkObjects(picoT, pT);

    checkObjects(fT, new Tesla(10**-15));
    checkObjects(femtoT, fT);

    checkObjects(aT, new Tesla(10**-18));
    checkObjects(attoT, aT);

    checkObjects(zT, new Tesla(10**-21));
    checkObjects(zeptoT, zT);

    checkObjects(yT, new Tesla(10**-24));
    checkObjects(yoctoT, yT);

    checkObjects(rT, new Tesla(10**-27));
    checkObjects(rontoT, rT);

    checkObjects(qT, new Tesla(10**-30));
    checkObjects(quectoT, qT);
    console.log("-Fin testTesla");
}
