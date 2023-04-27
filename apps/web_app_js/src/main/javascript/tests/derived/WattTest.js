        
function testWatt() {
   console.log("-Start testWatt");      
    
    checkObjects(QW, new Watt(10**30));
    checkObjects(quettaW, QW);

    checkObjects(RW, new Watt(10**27));
    checkObjects(ronnaW, RW);

    checkObjects(YW, new Watt(10**24));
    checkObjects(yottaW, YW);

    checkObjects(ZW, new Watt(10**21));
    checkObjects(zettaW, ZW);

    checkObjects(EW, new Watt(10**18));
    checkObjects(exaW, EW);

    checkObjects(PW, new Watt(10**15));
    checkObjects(petaW, PW);

    checkObjects(TW, new Watt(10**12));
    checkObjects(teraW, TW);

    checkObjects(GW, new Watt(10**9));
    checkObjects(gigaW, GW);

    checkObjects(MW, new Watt(10**6));
    checkObjects(megaW, MW);

    checkObjects(kW, new Watt(10**3));
    checkObjects(kiloW, kW);

    checkObjects(hW, new Watt(10**2));
    checkObjects(hectoW, hW);

    checkObjects(daW, new Watt(10**1));
    checkObjects(decaW, daW);

    checkObjects(dW, new Watt(10**-1));
    checkObjects(deciW, dW);

    checkObjects(cW, new Watt(10**-2));
    checkObjects(centiW, cW);

    checkObjects(mW, new Watt(10**-3));
    checkObjects(milliW, mW);

    checkObjects(μW, new Watt(10**-6));
    checkObjects(microW, μW);

    checkObjects(nW, new Watt(10**-9));
    checkObjects(nanoW, nW);

    checkObjects(pW, new Watt(10**-12));
    checkObjects(picoW, pW);

    checkObjects(fW, new Watt(10**-15));
    checkObjects(femtoW, fW);

    checkObjects(aW, new Watt(10**-18));
    checkObjects(attoW, aW);

    checkObjects(zW, new Watt(10**-21));
    checkObjects(zeptoW, zW);

    checkObjects(yW, new Watt(10**-24));
    checkObjects(yoctoW, yW);

    checkObjects(rW, new Watt(10**-27));
    checkObjects(rontoW, rW);

    checkObjects(qW, new Watt(10**-30));
    checkObjects(quectoW, qW);
    console.log("-Fin testWatt");
}
