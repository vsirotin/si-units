        
function testWeber() {
   console.log("-Start testWeber");      
    
    checkObjects(QWb, new Weber(10**30));
    checkObjects(quettaWb, QWb);

    checkObjects(RWb, new Weber(10**27));
    checkObjects(ronnaWb, RWb);

    checkObjects(YWb, new Weber(10**24));
    checkObjects(yottaWb, YWb);

    checkObjects(ZWb, new Weber(10**21));
    checkObjects(zettaWb, ZWb);

    checkObjects(EWb, new Weber(10**18));
    checkObjects(exaWb, EWb);

    checkObjects(PWb, new Weber(10**15));
    checkObjects(petaWb, PWb);

    checkObjects(TWb, new Weber(10**12));
    checkObjects(teraWb, TWb);

    checkObjects(GWb, new Weber(10**9));
    checkObjects(gigaWb, GWb);

    checkObjects(MWb, new Weber(10**6));
    checkObjects(megaWb, MWb);

    checkObjects(kWb, new Weber(10**3));
    checkObjects(kiloWb, kWb);

    checkObjects(hWb, new Weber(10**2));
    checkObjects(hectoWb, hWb);

    checkObjects(daWb, new Weber(10**1));
    checkObjects(decaWb, daWb);

    checkObjects(dWb, new Weber(10**-1));
    checkObjects(deciWb, dWb);

    checkObjects(cWb, new Weber(10**-2));
    checkObjects(centiWb, cWb);

    checkObjects(mWb, new Weber(10**-3));
    checkObjects(milliWb, mWb);

    checkObjects(μWb, new Weber(10**-6));
    checkObjects(microWb, μWb);

    checkObjects(nWb, new Weber(10**-9));
    checkObjects(nanoWb, nWb);

    checkObjects(pWb, new Weber(10**-12));
    checkObjects(picoWb, pWb);

    checkObjects(fWb, new Weber(10**-15));
    checkObjects(femtoWb, fWb);

    checkObjects(aWb, new Weber(10**-18));
    checkObjects(attoWb, aWb);

    checkObjects(zWb, new Weber(10**-21));
    checkObjects(zeptoWb, zWb);

    checkObjects(yWb, new Weber(10**-24));
    checkObjects(yoctoWb, yWb);

    checkObjects(rWb, new Weber(10**-27));
    checkObjects(rontoWb, rWb);

    checkObjects(qWb, new Weber(10**-30));
    checkObjects(quectoWb, qWb);
    console.log("-Fin testWeber");
}
