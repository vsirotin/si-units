        
function testKilogram() {
   console.log("-Start testKilogram");      
    
    checkObjects(Qkg, new Kilogram(10**27));
    checkObjects(quettakilogram, Qkg);

    checkObjects(Rkg, new Kilogram(10**24));
    checkObjects(ronnakilogram, Rkg);

    checkObjects(Ykg, new Kilogram(10**21));
    checkObjects(yottakilogram, Ykg);

    checkObjects(Zkg, new Kilogram(10**18));
    checkObjects(zettakilogram, Zkg);

    checkObjects(Ekg, new Kilogram(10**15));
    checkObjects(exakilogram, Ekg);

    checkObjects(Pkg, new Kilogram(10**12));
    checkObjects(petakilogram, Pkg);

    checkObjects(Tkg, new Kilogram(10**9));
    checkObjects(terakilogram, Tkg);

    checkObjects(Gkg, new Kilogram(10**6));
    checkObjects(gigakilogram, Gkg);

    checkObjects(Mkg, new Kilogram(10**3));
    checkObjects(megakilogram, Mkg);

    checkObjects(hkg, new Kilogram(10**-1));
    checkObjects(hectokilogram, hkg);

    checkObjects(dakg, new Kilogram(10**-2));
    checkObjects(decakilogram, dakg);

    checkObjects(dkg, new Kilogram(10**-4));
    checkObjects(decikilogram, dkg);

    checkObjects(ckg, new Kilogram(10**-5));
    checkObjects(centikilogram, ckg);

    checkObjects(mkg, new Kilogram(10**-6));
    checkObjects(millikilogram, mkg);

    checkObjects(μkg, new Kilogram(10**-9));
    checkObjects(microkilogram, μkg);

    checkObjects(nkg, new Kilogram(10**-12));
    checkObjects(nanokilogram, nkg);

    checkObjects(pkg, new Kilogram(10**-15));
    checkObjects(picokilogram, pkg);

    checkObjects(fkg, new Kilogram(10**-18));
    checkObjects(femtokilogram, fkg);

    checkObjects(akg, new Kilogram(10**-21));
    checkObjects(attokilogram, akg);

    checkObjects(zkg, new Kilogram(10**-24));
    checkObjects(zeptokilogram, zkg);

    checkObjects(ykg, new Kilogram(10**-27));
    checkObjects(yoctokilogram, ykg);

    checkObjects(rkg, new Kilogram(10**-30));
    checkObjects(rontokilogram, rkg);

    checkObjects(qkg, new Kilogram(10**-33));
    checkObjects(quectokilogram, qkg);
    console.log("-Fin testKilogram");
}