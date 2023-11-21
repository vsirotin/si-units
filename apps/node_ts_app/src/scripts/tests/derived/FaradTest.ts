    
import {checkObjects, checkValues, checkBoolean} from '../../checker';
import {eu} from 'kotunil-js-lib';
const {sirotin: {kotunil: {derived: {Farad, quettafarad, QF, ronnafarad, RF, yottafarad, YF, zettafarad, ZF, exafarad, EF, petafarad, PF, terafarad, TF, gigafarad, GF, megafarad, MF, kilofarad, kF, hectofarad, hF, decafarad, daF, decifarad, dF, centifarad, cF, microfarad, μF, nanofarad, nF, femtofarad, fF, attofarad, aF }}}} = eu; 
        
export function testFarad() {
   console.log("-Start testFarad");      
    
    checkObjects(QF, new Farad(10**30));
    checkObjects(quettafarad, QF);

    checkObjects(RF, new Farad(10**27));
    checkObjects(ronnafarad, RF);

    checkObjects(YF, new Farad(10**24));
    checkObjects(yottafarad, YF);

    checkObjects(ZF, new Farad(10**21));
    checkObjects(zettafarad, ZF);

    checkObjects(EF, new Farad(10**18));
    checkObjects(exafarad, EF);

    checkObjects(PF, new Farad(10**15));
    checkObjects(petafarad, PF);

    checkObjects(TF, new Farad(10**12));
    checkObjects(terafarad, TF);

    checkObjects(GF, new Farad(10**9));
    checkObjects(gigafarad, GF);

    checkObjects(MF, new Farad(10**6));
    checkObjects(megafarad, MF);

    checkObjects(kF, new Farad(10**3));
    checkObjects(kilofarad, kF);

    checkObjects(hF, new Farad(10**2));
    checkObjects(hectofarad, hF);

    checkObjects(daF, new Farad(10**1));
    checkObjects(decafarad, daF);

    checkObjects(dF, new Farad(10**-1));
    checkObjects(decifarad, dF);

    checkObjects(cF, new Farad(10**-2));
    checkObjects(centifarad, cF);

    checkObjects(μF, new Farad(10**-6));
    checkObjects(microfarad, μF);

    checkObjects(nF, new Farad(10**-9));
    checkObjects(nanofarad, nF);

    checkObjects(fF, new Farad(10**-15));
    checkObjects(femtofarad, fF);

    checkObjects(aF, new Farad(10**-18));
    checkObjects(attofarad, aF);
    console.log("-Fin testFarad");
}
