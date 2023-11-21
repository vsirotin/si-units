    
import {checkObjects, checkValues, checkBoolean} from '../../checker';
import {eu} from 'kotunil-js-lib';
const {sirotin: {kotunil: {derived: {Becquerel, quettabecquerel, QBq, ronnabecquerel, RBq, yottabecquerel, YBq, zettabecquerel, ZBq, exabecquerel, EBq, petabecquerel, PBq, terabecquerel, TBq, gigabecquerel, GBq, megabecquerel, MBq, kilobecquerel, kBq, hectobecquerel, hBq, decabecquerel, daBq, decibecquerel, dBq, centibecquerel, cBq, microbecquerel, μBq, nanobecquerel, nBq, femtobecquerel, fBq, attobecquerel, aBq }}}} = eu; 
        
export function testBecquerel() {
   console.log("-Start testBecquerel");      
    
    checkObjects(QBq, new Becquerel(10**30));
    checkObjects(quettabecquerel, QBq);

    checkObjects(RBq, new Becquerel(10**27));
    checkObjects(ronnabecquerel, RBq);

    checkObjects(YBq, new Becquerel(10**24));
    checkObjects(yottabecquerel, YBq);

    checkObjects(ZBq, new Becquerel(10**21));
    checkObjects(zettabecquerel, ZBq);

    checkObjects(EBq, new Becquerel(10**18));
    checkObjects(exabecquerel, EBq);

    checkObjects(PBq, new Becquerel(10**15));
    checkObjects(petabecquerel, PBq);

    checkObjects(TBq, new Becquerel(10**12));
    checkObjects(terabecquerel, TBq);

    checkObjects(GBq, new Becquerel(10**9));
    checkObjects(gigabecquerel, GBq);

    checkObjects(MBq, new Becquerel(10**6));
    checkObjects(megabecquerel, MBq);

    checkObjects(kBq, new Becquerel(10**3));
    checkObjects(kilobecquerel, kBq);

    checkObjects(hBq, new Becquerel(10**2));
    checkObjects(hectobecquerel, hBq);

    checkObjects(daBq, new Becquerel(10**1));
    checkObjects(decabecquerel, daBq);

    checkObjects(dBq, new Becquerel(10**-1));
    checkObjects(decibecquerel, dBq);

    checkObjects(cBq, new Becquerel(10**-2));
    checkObjects(centibecquerel, cBq);

    checkObjects(μBq, new Becquerel(10**-6));
    checkObjects(microbecquerel, μBq);

    checkObjects(nBq, new Becquerel(10**-9));
    checkObjects(nanobecquerel, nBq);

    checkObjects(fBq, new Becquerel(10**-15));
    checkObjects(femtobecquerel, fBq);

    checkObjects(aBq, new Becquerel(10**-18));
    checkObjects(attobecquerel, aBq);
    console.log("-Fin testBecquerel");
}
