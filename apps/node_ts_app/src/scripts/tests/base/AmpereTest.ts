  
import {checkObjects, checkValues, checkBoolean} from '../../checker';
import {eu} from 'kotunil-js-lib';  
const {sirotin: {kotunil: {base: {Ampere, quettaampere, QA, ronnaampere, RA, yottaampere, YA, zettaampere, ZA, exaampere, EA, petaampere, PA, teraampere, TA, gigaampere, GA, megaampere, MA, kiloampere, kA, hectoampere, hA, decaampere, daA, deciampere, dA, centiampere, cA, microampere, μA, nanoampere, nA, femtoampere, fA, attoampere, aA }}}} = eu;            
export function testAmpere() {
   console.log("-Start testAmpere");      
    
    checkObjects(QA, new Ampere(10**30));
    checkObjects(quettaampere, QA);

    checkObjects(RA, new Ampere(10**27));
    checkObjects(ronnaampere, RA);

    checkObjects(YA, new Ampere(10**24));
    checkObjects(yottaampere, YA);

    checkObjects(ZA, new Ampere(10**21));
    checkObjects(zettaampere, ZA);

    checkObjects(EA, new Ampere(10**18));
    checkObjects(exaampere, EA);

    checkObjects(PA, new Ampere(10**15));
    checkObjects(petaampere, PA);

    checkObjects(TA, new Ampere(10**12));
    checkObjects(teraampere, TA);

    checkObjects(GA, new Ampere(10**9));
    checkObjects(gigaampere, GA);

    checkObjects(MA, new Ampere(10**6));
    checkObjects(megaampere, MA);

    checkObjects(kA, new Ampere(10**3));
    checkObjects(kiloampere, kA);

    checkObjects(hA, new Ampere(10**2));
    checkObjects(hectoampere, hA);

    checkObjects(daA, new Ampere(10**1));
    checkObjects(decaampere, daA);

    checkObjects(dA, new Ampere(10**-1));
    checkObjects(deciampere, dA);

    checkObjects(cA, new Ampere(10**-2));
    checkObjects(centiampere, cA);

    checkObjects(μA, new Ampere(10**-6));
    checkObjects(microampere, μA);

    checkObjects(nA, new Ampere(10**-9));
    checkObjects(nanoampere, nA);

    checkObjects(fA, new Ampere(10**-15));
    checkObjects(femtoampere, fA);

    checkObjects(aA, new Ampere(10**-18));
    checkObjects(attoampere, aA);
    console.log("-Fin testAmpere");
}