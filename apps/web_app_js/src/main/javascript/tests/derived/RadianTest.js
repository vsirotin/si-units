        
function testRadian() {
   console.log("-Start testRadian");      
    
    checkObjects(Qrad, new Radian(10**30));
    checkObjects(quettarad, Qrad);

    checkObjects(Rrad, new Radian(10**27));
    checkObjects(ronnarad, Rrad);

    checkObjects(Yrad, new Radian(10**24));
    checkObjects(yottarad, Yrad);

    checkObjects(Zrad, new Radian(10**21));
    checkObjects(zettarad, Zrad);

    checkObjects(Erad, new Radian(10**18));
    checkObjects(exarad, Erad);

    checkObjects(Prad, new Radian(10**15));
    checkObjects(petarad, Prad);

    checkObjects(Trad, new Radian(10**12));
    checkObjects(terarad, Trad);

    checkObjects(Grad, new Radian(10**9));
    checkObjects(gigarad, Grad);

    checkObjects(Mrad, new Radian(10**6));
    checkObjects(megarad, Mrad);

    checkObjects(krad, new Radian(10**3));
    checkObjects(kilorad, krad);

    checkObjects(hrad, new Radian(10**2));
    checkObjects(hectorad, hrad);

    checkObjects(darad, new Radian(10**1));
    checkObjects(decarad, darad);

    checkObjects(drad, new Radian(10**-1));
    checkObjects(decirad, drad);

    checkObjects(crad, new Radian(10**-2));
    checkObjects(centirad, crad);

    checkObjects(mrad, new Radian(10**-3));
    checkObjects(millirad, mrad);

    checkObjects(μrad, new Radian(10**-6));
    checkObjects(microrad, μrad);

    checkObjects(nrad, new Radian(10**-9));
    checkObjects(nanorad, nrad);

    checkObjects(prad, new Radian(10**-12));
    checkObjects(picorad, prad);

    checkObjects(frad, new Radian(10**-15));
    checkObjects(femtorad, frad);

    checkObjects(arad, new Radian(10**-18));
    checkObjects(attorad, arad);

    checkObjects(zrad, new Radian(10**-21));
    checkObjects(zeptorad, zrad);

    checkObjects(yrad, new Radian(10**-24));
    checkObjects(yoctorad, yrad);

    checkObjects(rrad, new Radian(10**-27));
    checkObjects(rontorad, rrad);

    checkObjects(qrad, new Radian(10**-30));
    checkObjects(quectorad, qrad);
    console.log("-Fin testRadian");
}
