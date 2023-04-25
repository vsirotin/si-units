        
function testHenry() {
   console.log("-Start testHenry");      
    
    checkObjects(QH, new Henry(10**30));
    checkObjects(quettaH, QH);

    checkObjects(RH, new Henry(10**27));
    checkObjects(ronnaH, RH);

    checkObjects(YH, new Henry(10**24));
    checkObjects(yottaH, YH);

    checkObjects(ZH, new Henry(10**21));
    checkObjects(zettaH, ZH);

    checkObjects(EH, new Henry(10**18));
    checkObjects(exaH, EH);

    checkObjects(PH, new Henry(10**15));
    checkObjects(petaH, PH);

    checkObjects(TH, new Henry(10**12));
    checkObjects(teraH, TH);

    checkObjects(GH, new Henry(10**9));
    checkObjects(gigaH, GH);

    checkObjects(MH, new Henry(10**6));
    checkObjects(megaH, MH);

    checkObjects(kH, new Henry(10**3));
    checkObjects(kiloH, kH);

    checkObjects(hH, new Henry(10**2));
    checkObjects(hectoH, hH);

    checkObjects(daH, new Henry(10**1));
    checkObjects(decaH, daH);

    checkObjects(dH, new Henry(10**-1));
    checkObjects(deciH, dH);

    checkObjects(cH, new Henry(10**-2));
    checkObjects(centiH, cH);

    checkObjects(mH, new Henry(10**-3));
    checkObjects(milliH, mH);

    checkObjects(μH, new Henry(10**-6));
    checkObjects(microH, μH);

    checkObjects(nH, new Henry(10**-9));
    checkObjects(nanoH, nH);

    checkObjects(pH, new Henry(10**-12));
    checkObjects(picoH, pH);

    checkObjects(fH, new Henry(10**-15));
    checkObjects(femtoH, fH);

    checkObjects(aH, new Henry(10**-18));
    checkObjects(attoH, aH);

    checkObjects(zH, new Henry(10**-21));
    checkObjects(zeptoH, zH);

    checkObjects(yH, new Henry(10**-24));
    checkObjects(yoctoH, yH);

    checkObjects(rH, new Henry(10**-27));
    checkObjects(rontoH, rH);

    checkObjects(qH, new Henry(10**-30));
    checkObjects(quectoH, qH);
    console.log("-Fin testHenry");
}
