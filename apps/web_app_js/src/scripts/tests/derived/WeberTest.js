    
import {checkObjects, checkValues, checkBoolean} from '/src/scripts/tests/checker.js';
 
const {sirotin: {kotunil: {derived: {Weber, quettaweber, QWb, ronnaweber, RWb, yottaweber, YWb, zettaweber, ZWb, exaweber, EWb, petaweber, PWb, teraweber, TWb, gigaweber, GWb, megaweber, MWb, kiloweber, kWb, hectoweber, hWb, decaweber, daWb, deciweber, dWb, centiweber, cWb, microweber, μWb, nanoweber, nWb, femtoweber, fWb, attoweber, aWb }}}} = eu; 
        
export function testWeber() {
   console.log("-Start testWeber");      
    
    checkObjects(QWb, new Weber(10**30));
    checkObjects(quettaweber, QWb);

    checkObjects(RWb, new Weber(10**27));
    checkObjects(ronnaweber, RWb);

    checkObjects(YWb, new Weber(10**24));
    checkObjects(yottaweber, YWb);

    checkObjects(ZWb, new Weber(10**21));
    checkObjects(zettaweber, ZWb);

    checkObjects(EWb, new Weber(10**18));
    checkObjects(exaweber, EWb);

    checkObjects(PWb, new Weber(10**15));
    checkObjects(petaweber, PWb);

    checkObjects(TWb, new Weber(10**12));
    checkObjects(teraweber, TWb);

    checkObjects(GWb, new Weber(10**9));
    checkObjects(gigaweber, GWb);

    checkObjects(MWb, new Weber(10**6));
    checkObjects(megaweber, MWb);

    checkObjects(kWb, new Weber(10**3));
    checkObjects(kiloweber, kWb);

    checkObjects(hWb, new Weber(10**2));
    checkObjects(hectoweber, hWb);

    checkObjects(daWb, new Weber(10**1));
    checkObjects(decaweber, daWb);

    checkObjects(dWb, new Weber(10**-1));
    checkObjects(deciweber, dWb);

    checkObjects(cWb, new Weber(10**-2));
    checkObjects(centiweber, cWb);

    checkObjects(μWb, new Weber(10**-6));
    checkObjects(microweber, μWb);

    checkObjects(nWb, new Weber(10**-9));
    checkObjects(nanoweber, nWb);

    checkObjects(fWb, new Weber(10**-15));
    checkObjects(femtoweber, fWb);

    checkObjects(aWb, new Weber(10**-18));
    checkObjects(attoweber, aWb);
    console.log("-Fin testWeber");
}
