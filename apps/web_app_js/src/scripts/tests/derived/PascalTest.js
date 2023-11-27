    
import {checkObjects, checkValues, checkBoolean} from '/src/scripts/tests/checker.js';
 
const {sirotin: {kotunil: {derived: {Pascal, quettapascal, QPa, ronnapascal, RPa, yottapascal, YPa, zettapascal, ZPa, exapascal, EPa, petapascal, PPa, terapascal, TPa, gigapascal, GPa, megapascal, MPa, kilopascal, kPa, hectopascal, hPa, decapascal, daPa, decipascal, dPa, centipascal, cPa, micropascal, μPa, nanopascal, nPa, femtopascal, fPa, attopascal, aPa }}}} = eu; 
        
export function testPascal() {
   console.log("-Start testPascal");      
    
    checkObjects(QPa, new Pascal(10**30));
    checkObjects(quettapascal, QPa);

    checkObjects(RPa, new Pascal(10**27));
    checkObjects(ronnapascal, RPa);

    checkObjects(YPa, new Pascal(10**24));
    checkObjects(yottapascal, YPa);

    checkObjects(ZPa, new Pascal(10**21));
    checkObjects(zettapascal, ZPa);

    checkObjects(EPa, new Pascal(10**18));
    checkObjects(exapascal, EPa);

    checkObjects(PPa, new Pascal(10**15));
    checkObjects(petapascal, PPa);

    checkObjects(TPa, new Pascal(10**12));
    checkObjects(terapascal, TPa);

    checkObjects(GPa, new Pascal(10**9));
    checkObjects(gigapascal, GPa);

    checkObjects(MPa, new Pascal(10**6));
    checkObjects(megapascal, MPa);

    checkObjects(kPa, new Pascal(10**3));
    checkObjects(kilopascal, kPa);

    checkObjects(hPa, new Pascal(10**2));
    checkObjects(hectopascal, hPa);

    checkObjects(daPa, new Pascal(10**1));
    checkObjects(decapascal, daPa);

    checkObjects(dPa, new Pascal(10**-1));
    checkObjects(decipascal, dPa);

    checkObjects(cPa, new Pascal(10**-2));
    checkObjects(centipascal, cPa);

    checkObjects(μPa, new Pascal(10**-6));
    checkObjects(micropascal, μPa);

    checkObjects(nPa, new Pascal(10**-9));
    checkObjects(nanopascal, nPa);

    checkObjects(fPa, new Pascal(10**-15));
    checkObjects(femtopascal, fPa);

    checkObjects(aPa, new Pascal(10**-18));
    checkObjects(attopascal, aPa);
    console.log("-Fin testPascal");
}
