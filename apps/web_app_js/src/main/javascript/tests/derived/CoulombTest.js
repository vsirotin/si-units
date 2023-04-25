        
function testCoulomb() {
   console.log("-Start testCoulomb");      
    
    checkObjects(QC, new Coulomb(10**30));
    checkObjects(quettaC, QC);

    checkObjects(RC, new Coulomb(10**27));
    checkObjects(ronnaC, RC);

    checkObjects(YC, new Coulomb(10**24));
    checkObjects(yottaC, YC);

    checkObjects(ZC, new Coulomb(10**21));
    checkObjects(zettaC, ZC);

    checkObjects(EC, new Coulomb(10**18));
    checkObjects(exaC, EC);

    checkObjects(PC, new Coulomb(10**15));
    checkObjects(petaC, PC);

    checkObjects(TC, new Coulomb(10**12));
    checkObjects(teraC, TC);

    checkObjects(GC, new Coulomb(10**9));
    checkObjects(gigaC, GC);

    checkObjects(MC, new Coulomb(10**6));
    checkObjects(megaC, MC);

    checkObjects(kC, new Coulomb(10**3));
    checkObjects(kiloC, kC);

    checkObjects(hC, new Coulomb(10**2));
    checkObjects(hectoC, hC);

    checkObjects(daC, new Coulomb(10**1));
    checkObjects(decaC, daC);

    checkObjects(dC, new Coulomb(10**-1));
    checkObjects(deciC, dC);

    checkObjects(cC, new Coulomb(10**-2));
    checkObjects(centiC, cC);

    checkObjects(mC, new Coulomb(10**-3));
    checkObjects(milliC, mC);

    checkObjects(μC, new Coulomb(10**-6));
    checkObjects(microC, μC);

    checkObjects(nC, new Coulomb(10**-9));
    checkObjects(nanoC, nC);

    checkObjects(pC, new Coulomb(10**-12));
    checkObjects(picoC, pC);

    checkObjects(fC, new Coulomb(10**-15));
    checkObjects(femtoC, fC);

    checkObjects(aC, new Coulomb(10**-18));
    checkObjects(attoC, aC);

    checkObjects(zC, new Coulomb(10**-21));
    checkObjects(zeptoC, zC);

    checkObjects(yC, new Coulomb(10**-24));
    checkObjects(yoctoC, yC);

    checkObjects(rC, new Coulomb(10**-27));
    checkObjects(rontoC, rC);

    checkObjects(qC, new Coulomb(10**-30));
    checkObjects(quectoC, qC);
    console.log("-Fin testCoulomb");
}
