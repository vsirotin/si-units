    
import {checkObjects, checkValues, checkBoolean} from '../../checker';
import {eu} from 'kotunil-js-lib'; 
const {sirotin: {kotunil: {derived: {Volt, quettavolt, QV, ronnavolt, RV, yottavolt, YV, zettavolt, ZV, exavolt, EV, petavolt, PV, teravolt, TV, gigavolt, GV, megavolt, MV, kilovolt, kV, hectovolt, hV, decavolt, daV, decivolt, dV, centivolt, cV, microvolt, μV, nanovolt, nV, femtovolt, fV, attovolt, aV }}}} = eu; 
        
export function testVolt() {
   console.log("-Start testVolt");      
    
    checkObjects(QV, new Volt(10**30));
    checkObjects(quettavolt, QV);

    checkObjects(RV, new Volt(10**27));
    checkObjects(ronnavolt, RV);

    checkObjects(YV, new Volt(10**24));
    checkObjects(yottavolt, YV);

    checkObjects(ZV, new Volt(10**21));
    checkObjects(zettavolt, ZV);

    checkObjects(EV, new Volt(10**18));
    checkObjects(exavolt, EV);

    checkObjects(PV, new Volt(10**15));
    checkObjects(petavolt, PV);

    checkObjects(TV, new Volt(10**12));
    checkObjects(teravolt, TV);

    checkObjects(GV, new Volt(10**9));
    checkObjects(gigavolt, GV);

    checkObjects(MV, new Volt(10**6));
    checkObjects(megavolt, MV);

    checkObjects(kV, new Volt(10**3));
    checkObjects(kilovolt, kV);

    checkObjects(hV, new Volt(10**2));
    checkObjects(hectovolt, hV);

    checkObjects(daV, new Volt(10**1));
    checkObjects(decavolt, daV);

    checkObjects(dV, new Volt(10**-1));
    checkObjects(decivolt, dV);

    checkObjects(cV, new Volt(10**-2));
    checkObjects(centivolt, cV);

    checkObjects(μV, new Volt(10**-6));
    checkObjects(microvolt, μV);

    checkObjects(nV, new Volt(10**-9));
    checkObjects(nanovolt, nV);

    checkObjects(fV, new Volt(10**-15));
    checkObjects(femtovolt, fV);

    checkObjects(aV, new Volt(10**-18));
    checkObjects(attovolt, aV);
    console.log("-Fin testVolt");
}
