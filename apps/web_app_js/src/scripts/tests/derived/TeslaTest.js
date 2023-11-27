    
import {checkObjects, checkValues, checkBoolean} from '/src/scripts/tests/checker.js';
 
const {sirotin: {kotunil: {derived: {Tesla, quettatesla, QT, ronnatesla, RT, yottatesla, YT, zettatesla, ZT, exatesla, ET, petatesla, PT, teratesla, TT, gigatesla, GT, megatesla, MT, kilotesla, kT, hectotesla, hT, decatesla, daT, decitesla, dT, centitesla, cT, microtesla, μT, nanotesla, nT, femtotesla, fT, attotesla, aT }}}} = eu; 
        
export function testTesla() {
   console.log("-Start testTesla");      
    
    checkObjects(QT, new Tesla(10**30));
    checkObjects(quettatesla, QT);

    checkObjects(RT, new Tesla(10**27));
    checkObjects(ronnatesla, RT);

    checkObjects(YT, new Tesla(10**24));
    checkObjects(yottatesla, YT);

    checkObjects(ZT, new Tesla(10**21));
    checkObjects(zettatesla, ZT);

    checkObjects(ET, new Tesla(10**18));
    checkObjects(exatesla, ET);

    checkObjects(PT, new Tesla(10**15));
    checkObjects(petatesla, PT);

    checkObjects(TT, new Tesla(10**12));
    checkObjects(teratesla, TT);

    checkObjects(GT, new Tesla(10**9));
    checkObjects(gigatesla, GT);

    checkObjects(MT, new Tesla(10**6));
    checkObjects(megatesla, MT);

    checkObjects(kT, new Tesla(10**3));
    checkObjects(kilotesla, kT);

    checkObjects(hT, new Tesla(10**2));
    checkObjects(hectotesla, hT);

    checkObjects(daT, new Tesla(10**1));
    checkObjects(decatesla, daT);

    checkObjects(dT, new Tesla(10**-1));
    checkObjects(decitesla, dT);

    checkObjects(cT, new Tesla(10**-2));
    checkObjects(centitesla, cT);

    checkObjects(μT, new Tesla(10**-6));
    checkObjects(microtesla, μT);

    checkObjects(nT, new Tesla(10**-9));
    checkObjects(nanotesla, nT);

    checkObjects(fT, new Tesla(10**-15));
    checkObjects(femtotesla, fT);

    checkObjects(aT, new Tesla(10**-18));
    checkObjects(attotesla, aT);
    console.log("-Fin testTesla");
}
