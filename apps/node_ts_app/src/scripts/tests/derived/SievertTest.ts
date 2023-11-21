    
import {checkObjects, checkValues, checkBoolean} from '../../checker';
import {eu} from 'kotunil-js-lib';
const {sirotin: {kotunil: {derived: {Sievert, quettasievert, QSv, ronnasievert, RSv, yottasievert, YSv, zettasievert, ZSv, exasievert, ESv, petasievert, PSv, terasievert, TSv, gigasievert, GSv, megasievert, MSv, kilosievert, kSv, hectosievert, hSv, decasievert, daSv, decisievert, dSv, centisievert, cSv, microsievert, μSv, nanosievert, nSv, femtosievert, fSv, attosievert, aSv }}}} = eu; 
        
export function testSievert() {
   console.log("-Start testSievert");      
    
    checkObjects(QSv, new Sievert(10**30));
    checkObjects(quettasievert, QSv);

    checkObjects(RSv, new Sievert(10**27));
    checkObjects(ronnasievert, RSv);

    checkObjects(YSv, new Sievert(10**24));
    checkObjects(yottasievert, YSv);

    checkObjects(ZSv, new Sievert(10**21));
    checkObjects(zettasievert, ZSv);

    checkObjects(ESv, new Sievert(10**18));
    checkObjects(exasievert, ESv);

    checkObjects(PSv, new Sievert(10**15));
    checkObjects(petasievert, PSv);

    checkObjects(TSv, new Sievert(10**12));
    checkObjects(terasievert, TSv);

    checkObjects(GSv, new Sievert(10**9));
    checkObjects(gigasievert, GSv);

    checkObjects(MSv, new Sievert(10**6));
    checkObjects(megasievert, MSv);

    checkObjects(kSv, new Sievert(10**3));
    checkObjects(kilosievert, kSv);

    checkObjects(hSv, new Sievert(10**2));
    checkObjects(hectosievert, hSv);

    checkObjects(daSv, new Sievert(10**1));
    checkObjects(decasievert, daSv);

    checkObjects(dSv, new Sievert(10**-1));
    checkObjects(decisievert, dSv);

    checkObjects(cSv, new Sievert(10**-2));
    checkObjects(centisievert, cSv);

    checkObjects(μSv, new Sievert(10**-6));
    checkObjects(microsievert, μSv);

    checkObjects(nSv, new Sievert(10**-9));
    checkObjects(nanosievert, nSv);

    checkObjects(fSv, new Sievert(10**-15));
    checkObjects(femtosievert, fSv);

    checkObjects(aSv, new Sievert(10**-18));
    checkObjects(attosievert, aSv);
    console.log("-Fin testSievert");
}
