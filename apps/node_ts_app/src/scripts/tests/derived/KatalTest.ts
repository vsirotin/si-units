    
import {checkObjects, checkValues, checkBoolean} from '../../checker';
import {eu} from 'kotunil-js-lib';
const {sirotin: {kotunil: {derived: {Katal, quettakatal, Qkat, ronnakatal, Rkat, yottakatal, Ykat, zettakatal, Zkat, exakatal, Ekat, petakatal, Pkat, terakatal, Tkat, gigakatal, Gkat, megakatal, Mkat, kilokatal, kkat, hectokatal, hkat, decakatal, dakat, decikatal, dkat, centikatal, ckat, microkatal, μkat, nanokatal, nkat, femtokatal, fkat, attokatal, akat }}}} = eu; 
        
export function testKatal() {
   console.log("-Start testKatal");      
    
    checkObjects(Qkat, new Katal(10**30));
    checkObjects(quettakatal, Qkat);

    checkObjects(Rkat, new Katal(10**27));
    checkObjects(ronnakatal, Rkat);

    checkObjects(Ykat, new Katal(10**24));
    checkObjects(yottakatal, Ykat);

    checkObjects(Zkat, new Katal(10**21));
    checkObjects(zettakatal, Zkat);

    checkObjects(Ekat, new Katal(10**18));
    checkObjects(exakatal, Ekat);

    checkObjects(Pkat, new Katal(10**15));
    checkObjects(petakatal, Pkat);

    checkObjects(Tkat, new Katal(10**12));
    checkObjects(terakatal, Tkat);

    checkObjects(Gkat, new Katal(10**9));
    checkObjects(gigakatal, Gkat);

    checkObjects(Mkat, new Katal(10**6));
    checkObjects(megakatal, Mkat);

    checkObjects(kkat, new Katal(10**3));
    checkObjects(kilokatal, kkat);

    checkObjects(hkat, new Katal(10**2));
    checkObjects(hectokatal, hkat);

    checkObjects(dakat, new Katal(10**1));
    checkObjects(decakatal, dakat);

    checkObjects(dkat, new Katal(10**-1));
    checkObjects(decikatal, dkat);

    checkObjects(ckat, new Katal(10**-2));
    checkObjects(centikatal, ckat);

    checkObjects(μkat, new Katal(10**-6));
    checkObjects(microkatal, μkat);

    checkObjects(nkat, new Katal(10**-9));
    checkObjects(nanokatal, nkat);

    checkObjects(fkat, new Katal(10**-15));
    checkObjects(femtokatal, fkat);

    checkObjects(akat, new Katal(10**-18));
    checkObjects(attokatal, akat);
    console.log("-Fin testKatal");
}
