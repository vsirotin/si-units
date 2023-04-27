        
function testSiemens() {
   console.log("-Start testSiemens");      
    
    checkObjects(QS, new Siemens(10**30));
    checkObjects(quettaS, QS);

    checkObjects(RS, new Siemens(10**27));
    checkObjects(ronnaS, RS);

    checkObjects(YS, new Siemens(10**24));
    checkObjects(yottaS, YS);

    checkObjects(ZS, new Siemens(10**21));
    checkObjects(zettaS, ZS);

    checkObjects(ES, new Siemens(10**18));
    checkObjects(exaS, ES);

    checkObjects(PS, new Siemens(10**15));
    checkObjects(petaS, PS);

    checkObjects(TS, new Siemens(10**12));
    checkObjects(teraS, TS);

    checkObjects(GS, new Siemens(10**9));
    checkObjects(gigaS, GS);

    checkObjects(MS, new Siemens(10**6));
    checkObjects(megaS, MS);

    checkObjects(kS, new Siemens(10**3));
    checkObjects(kiloS, kS);

    checkObjects(hS, new Siemens(10**2));
    checkObjects(hectoS, hS);

    checkObjects(daS, new Siemens(10**1));
    checkObjects(decaS, daS);

    checkObjects(dS, new Siemens(10**-1));
    checkObjects(deciS, dS);

    checkObjects(cS, new Siemens(10**-2));
    checkObjects(centiS, cS);

    checkObjects(mS, new Siemens(10**-3));
    checkObjects(milliS, mS);

    checkObjects(μS, new Siemens(10**-6));
    checkObjects(microS, μS);

    checkObjects(nS, new Siemens(10**-9));
    checkObjects(nanoS, nS);

    checkObjects(pS, new Siemens(10**-12));
    checkObjects(picoS, pS);

    checkObjects(fS, new Siemens(10**-15));
    checkObjects(femtoS, fS);

    checkObjects(aS, new Siemens(10**-18));
    checkObjects(attoS, aS);

    checkObjects(zS, new Siemens(10**-21));
    checkObjects(zeptoS, zS);

    checkObjects(yS, new Siemens(10**-24));
    checkObjects(yoctoS, yS);

    checkObjects(rS, new Siemens(10**-27));
    checkObjects(rontoS, rS);

    checkObjects(qS, new Siemens(10**-30));
    checkObjects(quectoS, qS);
    console.log("-Fin testSiemens");
}
