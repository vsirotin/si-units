        
function testMole() {
   console.log("-Start testMole");      
    
    checkObjects(Qmol, new Mole(10**30));
    checkObjects(quettamole, Qmol);

    checkObjects(Rmol, new Mole(10**27));
    checkObjects(ronnamole, Rmol);

    checkObjects(Ymol, new Mole(10**24));
    checkObjects(yottamole, Ymol);

    checkObjects(Zmol, new Mole(10**21));
    checkObjects(zettamole, Zmol);

    checkObjects(Emol, new Mole(10**18));
    checkObjects(examole, Emol);

    checkObjects(Pmol, new Mole(10**15));
    checkObjects(petamole, Pmol);

    checkObjects(Tmol, new Mole(10**12));
    checkObjects(teramole, Tmol);

    checkObjects(Gmol, new Mole(10**9));
    checkObjects(gigamole, Gmol);

    checkObjects(Mmol, new Mole(10**6));
    checkObjects(megamole, Mmol);

    checkObjects(kmol, new Mole(10**3));
    checkObjects(kilomole, kmol);

    checkObjects(hmol, new Mole(10**2));
    checkObjects(hectomole, hmol);

    checkObjects(damol, new Mole(10**1));
    checkObjects(decamole, damol);

    checkObjects(dmol, new Mole(10**-1));
    checkObjects(decimole, dmol);

    checkObjects(cmol, new Mole(10**-2));
    checkObjects(centimole, cmol);

    checkObjects(mmol, new Mole(10**-3));
    checkObjects(millimole, mmol);

    checkObjects(μmol, new Mole(10**-6));
    checkObjects(micromole, μmol);

    checkObjects(nmol, new Mole(10**-9));
    checkObjects(nanomole, nmol);

    checkObjects(pmol, new Mole(10**-12));
    checkObjects(picomole, pmol);

    checkObjects(fmol, new Mole(10**-15));
    checkObjects(femtomole, fmol);

    checkObjects(amol, new Mole(10**-18));
    checkObjects(attomole, amol);

    checkObjects(zmol, new Mole(10**-21));
    checkObjects(zeptomole, zmol);

    checkObjects(ymol, new Mole(10**-24));
    checkObjects(yoctomole, ymol);

    checkObjects(rmol, new Mole(10**-27));
    checkObjects(rontomole, rmol);

    checkObjects(qmol, new Mole(10**-30));
    checkObjects(quectomole, qmol);
    console.log("-Fin testMole");
}