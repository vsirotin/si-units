        
function testVolt() {
   console.log("-Start testVolt");      
    
    checkObjects(QV, new Volt(10**30));
    checkObjects(quettaV, QV);

    checkObjects(RV, new Volt(10**27));
    checkObjects(ronnaV, RV);

    checkObjects(YV, new Volt(10**24));
    checkObjects(yottaV, YV);

    checkObjects(ZV, new Volt(10**21));
    checkObjects(zettaV, ZV);

    checkObjects(EV, new Volt(10**18));
    checkObjects(exaV, EV);

    checkObjects(PV, new Volt(10**15));
    checkObjects(petaV, PV);

    checkObjects(TV, new Volt(10**12));
    checkObjects(teraV, TV);

    checkObjects(GV, new Volt(10**9));
    checkObjects(gigaV, GV);

    checkObjects(MV, new Volt(10**6));
    checkObjects(megaV, MV);

    checkObjects(kV, new Volt(10**3));
    checkObjects(kiloV, kV);

    checkObjects(hV, new Volt(10**2));
    checkObjects(hectoV, hV);

    checkObjects(daV, new Volt(10**1));
    checkObjects(decaV, daV);

    checkObjects(dV, new Volt(10**-1));
    checkObjects(deciV, dV);

    checkObjects(cV, new Volt(10**-2));
    checkObjects(centiV, cV);

    checkObjects(mV, new Volt(10**-3));
    checkObjects(milliV, mV);

    checkObjects(μV, new Volt(10**-6));
    checkObjects(microV, μV);

    checkObjects(nV, new Volt(10**-9));
    checkObjects(nanoV, nV);

    checkObjects(pV, new Volt(10**-12));
    checkObjects(picoV, pV);

    checkObjects(fV, new Volt(10**-15));
    checkObjects(femtoV, fV);

    checkObjects(aV, new Volt(10**-18));
    checkObjects(attoV, aV);

    checkObjects(zV, new Volt(10**-21));
    checkObjects(zeptoV, zV);

    checkObjects(yV, new Volt(10**-24));
    checkObjects(yoctoV, yV);

    checkObjects(rV, new Volt(10**-27));
    checkObjects(rontoV, rV);

    checkObjects(qV, new Volt(10**-30));
    checkObjects(quectoV, qV);
    console.log("-Fin testVolt");
}
