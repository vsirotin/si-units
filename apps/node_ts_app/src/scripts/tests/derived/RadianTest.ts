    
import {checkObjects, checkValues, checkBoolean} from '../../checker';
import {eu} from 'kotunil-js-lib';
const {sirotin: {kotunil: {derived: {Radian, quettaradian, Qrad, ronnaradian, Rrad, yottaradian, Yrad, zettaradian, Zrad, exaradian, Erad, petaradian, Prad, teraradian, Trad, gigaradian, Grad, megaradian, Mrad, kiloradian, krad, hectoradian, hrad, decaradian, darad, deciradian, drad, centiradian, crad, microradian, μrad, nanoradian, nrad, femtoradian, frad, attoradian, arad }}}} = eu; 
        
export function testRadian() {
   console.log("-Start testRadian");      
    
    checkObjects(Qrad, new Radian(10**30));
    checkObjects(quettaradian, Qrad);

    checkObjects(Rrad, new Radian(10**27));
    checkObjects(ronnaradian, Rrad);

    checkObjects(Yrad, new Radian(10**24));
    checkObjects(yottaradian, Yrad);

    checkObjects(Zrad, new Radian(10**21));
    checkObjects(zettaradian, Zrad);

    checkObjects(Erad, new Radian(10**18));
    checkObjects(exaradian, Erad);

    checkObjects(Prad, new Radian(10**15));
    checkObjects(petaradian, Prad);

    checkObjects(Trad, new Radian(10**12));
    checkObjects(teraradian, Trad);

    checkObjects(Grad, new Radian(10**9));
    checkObjects(gigaradian, Grad);

    checkObjects(Mrad, new Radian(10**6));
    checkObjects(megaradian, Mrad);

    checkObjects(krad, new Radian(10**3));
    checkObjects(kiloradian, krad);

    checkObjects(hrad, new Radian(10**2));
    checkObjects(hectoradian, hrad);

    checkObjects(darad, new Radian(10**1));
    checkObjects(decaradian, darad);

    checkObjects(drad, new Radian(10**-1));
    checkObjects(deciradian, drad);

    checkObjects(crad, new Radian(10**-2));
    checkObjects(centiradian, crad);

    checkObjects(μrad, new Radian(10**-6));
    checkObjects(microradian, μrad);

    checkObjects(nrad, new Radian(10**-9));
    checkObjects(nanoradian, nrad);

    checkObjects(frad, new Radian(10**-15));
    checkObjects(femtoradian, frad);

    checkObjects(arad, new Radian(10**-18));
    checkObjects(attoradian, arad);
    console.log("-Fin testRadian");
}
