    
import {checkObjects, checkValues, checkBoolean} from '/src/scripts/tests/checker.js';
 
const {sirotin: {kotunil: {derived: {Siemens, quettasiemens, QS, ronnasiemens, RS, yottasiemens, YS, zettasiemens, ZS, exasiemens, ES, petasiemens, PS, terasiemens, TS, gigasiemens, GS, megasiemens, MS, kilosiemens, kS, hectosiemens, hS, decasiemens, daS, decisiemens, dS, centisiemens, cS, microsiemens, μS, nanosiemens, nS, femtosiemens, fS, attosiemens, aS }}}} = eu; 
        
export function testSiemens() {
   console.log("-Start testSiemens");      
    
    checkObjects(QS, new Siemens(10**30));
    checkObjects(quettasiemens, QS);

    checkObjects(RS, new Siemens(10**27));
    checkObjects(ronnasiemens, RS);

    checkObjects(YS, new Siemens(10**24));
    checkObjects(yottasiemens, YS);

    checkObjects(ZS, new Siemens(10**21));
    checkObjects(zettasiemens, ZS);

    checkObjects(ES, new Siemens(10**18));
    checkObjects(exasiemens, ES);

    checkObjects(PS, new Siemens(10**15));
    checkObjects(petasiemens, PS);

    checkObjects(TS, new Siemens(10**12));
    checkObjects(terasiemens, TS);

    checkObjects(GS, new Siemens(10**9));
    checkObjects(gigasiemens, GS);

    checkObjects(MS, new Siemens(10**6));
    checkObjects(megasiemens, MS);

    checkObjects(kS, new Siemens(10**3));
    checkObjects(kilosiemens, kS);

    checkObjects(hS, new Siemens(10**2));
    checkObjects(hectosiemens, hS);

    checkObjects(daS, new Siemens(10**1));
    checkObjects(decasiemens, daS);

    checkObjects(dS, new Siemens(10**-1));
    checkObjects(decisiemens, dS);

    checkObjects(cS, new Siemens(10**-2));
    checkObjects(centisiemens, cS);

    checkObjects(μS, new Siemens(10**-6));
    checkObjects(microsiemens, μS);

    checkObjects(nS, new Siemens(10**-9));
    checkObjects(nanosiemens, nS);

    checkObjects(fS, new Siemens(10**-15));
    checkObjects(femtosiemens, fS);

    checkObjects(aS, new Siemens(10**-18));
    checkObjects(attosiemens, aS);
    console.log("-Fin testSiemens");
}
