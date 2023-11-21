    
import {checkObjects, checkValues, checkBoolean} from '../../checker';
import {eu} from 'kotunil-js-lib';
const {sirotin: {kotunil: {derived: {Hertz, quettahertz, QHz, ronnahertz, RHz, yottahertz, YHz, zettahertz, ZHz, exahertz, EHz, petahertz, PHz, terahertz, THz, gigahertz, GHz, megahertz, MHz, kilohertz, kHz, hectohertz, hHz, decahertz, daHz, decihertz, dHz, centihertz, cHz, microhertz, μHz, nanohertz, nHz, femtohertz, fHz, attohertz, aHz }}}} = eu; 
        
export function testHertz() {
   console.log("-Start testHertz");      
    
    checkObjects(QHz, new Hertz(10**30));
    checkObjects(quettahertz, QHz);

    checkObjects(RHz, new Hertz(10**27));
    checkObjects(ronnahertz, RHz);

    checkObjects(YHz, new Hertz(10**24));
    checkObjects(yottahertz, YHz);

    checkObjects(ZHz, new Hertz(10**21));
    checkObjects(zettahertz, ZHz);

    checkObjects(EHz, new Hertz(10**18));
    checkObjects(exahertz, EHz);

    checkObjects(PHz, new Hertz(10**15));
    checkObjects(petahertz, PHz);

    checkObjects(THz, new Hertz(10**12));
    checkObjects(terahertz, THz);

    checkObjects(GHz, new Hertz(10**9));
    checkObjects(gigahertz, GHz);

    checkObjects(MHz, new Hertz(10**6));
    checkObjects(megahertz, MHz);

    checkObjects(kHz, new Hertz(10**3));
    checkObjects(kilohertz, kHz);

    checkObjects(hHz, new Hertz(10**2));
    checkObjects(hectohertz, hHz);

    checkObjects(daHz, new Hertz(10**1));
    checkObjects(decahertz, daHz);

    checkObjects(dHz, new Hertz(10**-1));
    checkObjects(decihertz, dHz);

    checkObjects(cHz, new Hertz(10**-2));
    checkObjects(centihertz, cHz);

    checkObjects(μHz, new Hertz(10**-6));
    checkObjects(microhertz, μHz);

    checkObjects(nHz, new Hertz(10**-9));
    checkObjects(nanohertz, nHz);

    checkObjects(fHz, new Hertz(10**-15));
    checkObjects(femtohertz, fHz);

    checkObjects(aHz, new Hertz(10**-18));
    checkObjects(attohertz, aHz);
    console.log("-Fin testHertz");
}
