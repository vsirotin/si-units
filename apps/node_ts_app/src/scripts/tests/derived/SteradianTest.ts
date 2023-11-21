    
import {checkObjects, checkValues, checkBoolean} from '../../checker';
import {eu} from 'kotunil-js-lib';
const {sirotin: {kotunil: {derived: {Steradian, quettasteradian, Qsr, ronnasteradian, Rsr, yottasteradian, Ysr, zettasteradian, Zsr, exasteradian, Esr, petasteradian, Psr, terasteradian, Tsr, gigasteradian, Gsr, megasteradian, Msr, kilosteradian, ksr, hectosteradian, hsr, decasteradian, dasr, decisteradian, dsr, centisteradian, csr, microsteradian, μsr, nanosteradian, nsr, femtosteradian, fsr, attosteradian, asr }}}} = eu; 
        
export function testSteradian() {
   console.log("-Start testSteradian");      
    
    checkObjects(Qsr, new Steradian(10**30));
    checkObjects(quettasteradian, Qsr);

    checkObjects(Rsr, new Steradian(10**27));
    checkObjects(ronnasteradian, Rsr);

    checkObjects(Ysr, new Steradian(10**24));
    checkObjects(yottasteradian, Ysr);

    checkObjects(Zsr, new Steradian(10**21));
    checkObjects(zettasteradian, Zsr);

    checkObjects(Esr, new Steradian(10**18));
    checkObjects(exasteradian, Esr);

    checkObjects(Psr, new Steradian(10**15));
    checkObjects(petasteradian, Psr);

    checkObjects(Tsr, new Steradian(10**12));
    checkObjects(terasteradian, Tsr);

    checkObjects(Gsr, new Steradian(10**9));
    checkObjects(gigasteradian, Gsr);

    checkObjects(Msr, new Steradian(10**6));
    checkObjects(megasteradian, Msr);

    checkObjects(ksr, new Steradian(10**3));
    checkObjects(kilosteradian, ksr);

    checkObjects(hsr, new Steradian(10**2));
    checkObjects(hectosteradian, hsr);

    checkObjects(dasr, new Steradian(10**1));
    checkObjects(decasteradian, dasr);

    checkObjects(dsr, new Steradian(10**-1));
    checkObjects(decisteradian, dsr);

    checkObjects(csr, new Steradian(10**-2));
    checkObjects(centisteradian, csr);

    checkObjects(μsr, new Steradian(10**-6));
    checkObjects(microsteradian, μsr);

    checkObjects(nsr, new Steradian(10**-9));
    checkObjects(nanosteradian, nsr);

    checkObjects(fsr, new Steradian(10**-15));
    checkObjects(femtosteradian, fsr);

    checkObjects(asr, new Steradian(10**-18));
    checkObjects(attosteradian, asr);
    console.log("-Fin testSteradian");
}
