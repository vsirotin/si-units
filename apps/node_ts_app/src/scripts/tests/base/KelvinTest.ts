  
import {checkObjects, checkValues, checkBoolean} from '../../checker';
import {eu} from 'kotunil-js-lib';  
const {sirotin: {kotunil: {base: {Kelvin, quettakelvin, QK, ronnakelvin, RK, yottakelvin, YK, zettakelvin, ZK, exakelvin, EK, petakelvin, PK, terakelvin, TK, gigakelvin, GK, megakelvin, MK, kilokelvin, kK, hectokelvin, hK, decakelvin, daK, decikelvin, dK, centikelvin, cK, microkelvin, μK, nanokelvin, nK, femtokelvin, fK, attokelvin, aK }}}} = eu;            
export function testKelvin() {
   console.log("-Start testKelvin");      
    
    checkObjects(QK, new Kelvin(10**30));
    checkObjects(quettakelvin, QK);

    checkObjects(RK, new Kelvin(10**27));
    checkObjects(ronnakelvin, RK);

    checkObjects(YK, new Kelvin(10**24));
    checkObjects(yottakelvin, YK);

    checkObjects(ZK, new Kelvin(10**21));
    checkObjects(zettakelvin, ZK);

    checkObjects(EK, new Kelvin(10**18));
    checkObjects(exakelvin, EK);

    checkObjects(PK, new Kelvin(10**15));
    checkObjects(petakelvin, PK);

    checkObjects(TK, new Kelvin(10**12));
    checkObjects(terakelvin, TK);

    checkObjects(GK, new Kelvin(10**9));
    checkObjects(gigakelvin, GK);

    checkObjects(MK, new Kelvin(10**6));
    checkObjects(megakelvin, MK);

    checkObjects(kK, new Kelvin(10**3));
    checkObjects(kilokelvin, kK);

    checkObjects(hK, new Kelvin(10**2));
    checkObjects(hectokelvin, hK);

    checkObjects(daK, new Kelvin(10**1));
    checkObjects(decakelvin, daK);

    checkObjects(dK, new Kelvin(10**-1));
    checkObjects(decikelvin, dK);

    checkObjects(cK, new Kelvin(10**-2));
    checkObjects(centikelvin, cK);

    checkObjects(μK, new Kelvin(10**-6));
    checkObjects(microkelvin, μK);

    checkObjects(nK, new Kelvin(10**-9));
    checkObjects(nanokelvin, nK);

    checkObjects(fK, new Kelvin(10**-15));
    checkObjects(femtokelvin, fK);

    checkObjects(aK, new Kelvin(10**-18));
    checkObjects(attokelvin, aK);
    console.log("-Fin testKelvin");
}