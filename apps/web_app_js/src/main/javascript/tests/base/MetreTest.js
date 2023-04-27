        
function testMetre() {
   console.log("-Start testMetre");      
    
    checkObjects(Qm, new Metre(10**30));
    checkObjects(quettametre, Qm);

    checkObjects(Rm, new Metre(10**27));
    checkObjects(ronnametre, Rm);

    checkObjects(Ym, new Metre(10**24));
    checkObjects(yottametre, Ym);

    checkObjects(Zm, new Metre(10**21));
    checkObjects(zettametre, Zm);

    checkObjects(Em, new Metre(10**18));
    checkObjects(exametre, Em);

    checkObjects(Pm, new Metre(10**15));
    checkObjects(petametre, Pm);

    checkObjects(Tm, new Metre(10**12));
    checkObjects(terametre, Tm);

    checkObjects(Gm, new Metre(10**9));
    checkObjects(gigametre, Gm);

    checkObjects(Mm, new Metre(10**6));
    checkObjects(megametre, Mm);

    checkObjects(km, new Metre(10**3));
    checkObjects(kilometre, km);

    checkObjects(hm, new Metre(10**2));
    checkObjects(hectometre, hm);

    checkObjects(dam, new Metre(10**1));
    checkObjects(decametre, dam);

    checkObjects(dm, new Metre(10**-1));
    checkObjects(decimetre, dm);

    checkObjects(cm, new Metre(10**-2));
    checkObjects(centimetre, cm);

    checkObjects(mm, new Metre(10**-3));
    checkObjects(millimetre, mm);

    checkObjects(μm, new Metre(10**-6));
    checkObjects(micrometre, μm);

    checkObjects(nm, new Metre(10**-9));
    checkObjects(nanometre, nm);

    checkObjects(pm, new Metre(10**-12));
    checkObjects(picometre, pm);

    checkObjects(fm, new Metre(10**-15));
    checkObjects(femtometre, fm);

    checkObjects(am, new Metre(10**-18));
    checkObjects(attometre, am);

    checkObjects(zm, new Metre(10**-21));
    checkObjects(zeptometre, zm);

    checkObjects(ym, new Metre(10**-24));
    checkObjects(yoctometre, ym);

    checkObjects(rm, new Metre(10**-27));
    checkObjects(rontometre, rm);

    checkObjects(qm, new Metre(10**-30));
    checkObjects(quectometre, qm);
    console.log("-Fin testMetre");
}