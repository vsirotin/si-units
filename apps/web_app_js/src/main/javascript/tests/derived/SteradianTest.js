        
function testSteradian() {
   console.log("-Start testSteradian");      
    
    checkObjects(Qsr, new Steradian(10**30));
    checkObjects(quettasr, Qsr);

    checkObjects(Rsr, new Steradian(10**27));
    checkObjects(ronnasr, Rsr);

    checkObjects(Ysr, new Steradian(10**24));
    checkObjects(yottasr, Ysr);

    checkObjects(Zsr, new Steradian(10**21));
    checkObjects(zettasr, Zsr);

    checkObjects(Esr, new Steradian(10**18));
    checkObjects(exasr, Esr);

    checkObjects(Psr, new Steradian(10**15));
    checkObjects(petasr, Psr);

    checkObjects(Tsr, new Steradian(10**12));
    checkObjects(terasr, Tsr);

    checkObjects(Gsr, new Steradian(10**9));
    checkObjects(gigasr, Gsr);

    checkObjects(Msr, new Steradian(10**6));
    checkObjects(megasr, Msr);

    checkObjects(ksr, new Steradian(10**3));
    checkObjects(kilosr, ksr);

    checkObjects(hsr, new Steradian(10**2));
    checkObjects(hectosr, hsr);

    checkObjects(dasr, new Steradian(10**1));
    checkObjects(decasr, dasr);

    checkObjects(dsr, new Steradian(10**-1));
    checkObjects(decisr, dsr);

    checkObjects(csr, new Steradian(10**-2));
    checkObjects(centisr, csr);

    checkObjects(msr, new Steradian(10**-3));
    checkObjects(millisr, msr);

    checkObjects(μsr, new Steradian(10**-6));
    checkObjects(microsr, μsr);

    checkObjects(nsr, new Steradian(10**-9));
    checkObjects(nanosr, nsr);

    checkObjects(psr, new Steradian(10**-12));
    checkObjects(picosr, psr);

    checkObjects(fsr, new Steradian(10**-15));
    checkObjects(femtosr, fsr);

    checkObjects(asr, new Steradian(10**-18));
    checkObjects(attosr, asr);

    checkObjects(zsr, new Steradian(10**-21));
    checkObjects(zeptosr, zsr);

    checkObjects(ysr, new Steradian(10**-24));
    checkObjects(yoctosr, ysr);

    checkObjects(rsr, new Steradian(10**-27));
    checkObjects(rontosr, rsr);

    checkObjects(qsr, new Steradian(10**-30));
    checkObjects(quectosr, qsr);
    console.log("-Fin testSteradian");
}
