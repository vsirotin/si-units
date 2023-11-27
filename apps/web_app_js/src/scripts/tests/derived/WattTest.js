    
import {checkObjects, checkValues, checkBoolean} from '/src/scripts/tests/checker.js';
 
const {sirotin: {kotunil: {derived: {Watt, quettawatt, QW, ronnawatt, RW, yottawatt, YW, zettawatt, ZW, exawatt, EW, petawatt, PW, terawatt, TW, gigawatt, GW, megawatt, MW, kilowatt, kW, hectowatt, hW, decawatt, daW, deciwatt, dW, centiwatt, cW, microwatt, μW, nanowatt, nW, femtowatt, fW, attowatt, aW }}}} = eu; 
        
export function testWatt() {
   console.log("-Start testWatt");      
    
    checkObjects(QW, new Watt(10**30));
    checkObjects(quettawatt, QW);

    checkObjects(RW, new Watt(10**27));
    checkObjects(ronnawatt, RW);

    checkObjects(YW, new Watt(10**24));
    checkObjects(yottawatt, YW);

    checkObjects(ZW, new Watt(10**21));
    checkObjects(zettawatt, ZW);

    checkObjects(EW, new Watt(10**18));
    checkObjects(exawatt, EW);

    checkObjects(PW, new Watt(10**15));
    checkObjects(petawatt, PW);

    checkObjects(TW, new Watt(10**12));
    checkObjects(terawatt, TW);

    checkObjects(GW, new Watt(10**9));
    checkObjects(gigawatt, GW);

    checkObjects(MW, new Watt(10**6));
    checkObjects(megawatt, MW);

    checkObjects(kW, new Watt(10**3));
    checkObjects(kilowatt, kW);

    checkObjects(hW, new Watt(10**2));
    checkObjects(hectowatt, hW);

    checkObjects(daW, new Watt(10**1));
    checkObjects(decawatt, daW);

    checkObjects(dW, new Watt(10**-1));
    checkObjects(deciwatt, dW);

    checkObjects(cW, new Watt(10**-2));
    checkObjects(centiwatt, cW);

    checkObjects(μW, new Watt(10**-6));
    checkObjects(microwatt, μW);

    checkObjects(nW, new Watt(10**-9));
    checkObjects(nanowatt, nW);

    checkObjects(fW, new Watt(10**-15));
    checkObjects(femtowatt, fW);

    checkObjects(aW, new Watt(10**-18));
    checkObjects(attowatt, aW);
    console.log("-Fin testWatt");
}
