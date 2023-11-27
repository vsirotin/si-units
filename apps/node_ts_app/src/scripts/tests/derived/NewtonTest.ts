    
import {checkObjects, checkValues, checkBoolean} from '../../checker';
import {eu} from 'kotunil-js-lib'; 
const {sirotin: {kotunil: {derived: {Newton, quettanewton, QN, ronnanewton, RN, yottanewton, YN, zettanewton, ZN, exanewton, EN, petanewton, PN, teranewton, TN, giganewton, GN, meganewton, MN, kilonewton, kN, hectonewton, hN, decanewton, daN, decinewton, dN, centinewton, cN, micronewton, μN, nanonewton, nN, femtonewton, fN, attonewton, aN }}}} = eu; 
        
export function testNewton() {
   console.log("-Start testNewton");      
    
    checkObjects(QN, new Newton(10**30));
    checkObjects(quettanewton, QN);

    checkObjects(RN, new Newton(10**27));
    checkObjects(ronnanewton, RN);

    checkObjects(YN, new Newton(10**24));
    checkObjects(yottanewton, YN);

    checkObjects(ZN, new Newton(10**21));
    checkObjects(zettanewton, ZN);

    checkObjects(EN, new Newton(10**18));
    checkObjects(exanewton, EN);

    checkObjects(PN, new Newton(10**15));
    checkObjects(petanewton, PN);

    checkObjects(TN, new Newton(10**12));
    checkObjects(teranewton, TN);

    checkObjects(GN, new Newton(10**9));
    checkObjects(giganewton, GN);

    checkObjects(MN, new Newton(10**6));
    checkObjects(meganewton, MN);

    checkObjects(kN, new Newton(10**3));
    checkObjects(kilonewton, kN);

    checkObjects(hN, new Newton(10**2));
    checkObjects(hectonewton, hN);

    checkObjects(daN, new Newton(10**1));
    checkObjects(decanewton, daN);

    checkObjects(dN, new Newton(10**-1));
    checkObjects(decinewton, dN);

    checkObjects(cN, new Newton(10**-2));
    checkObjects(centinewton, cN);

    checkObjects(μN, new Newton(10**-6));
    checkObjects(micronewton, μN);

    checkObjects(nN, new Newton(10**-9));
    checkObjects(nanonewton, nN);

    checkObjects(fN, new Newton(10**-15));
    checkObjects(femtonewton, fN);

    checkObjects(aN, new Newton(10**-18));
    checkObjects(attonewton, aN);
    console.log("-Fin testNewton");
}
