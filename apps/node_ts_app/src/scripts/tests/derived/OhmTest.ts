    
import {checkObjects, checkValues, checkBoolean} from '../../checker';
import {eu} from 'kotunil-js-lib'; 
const {sirotin: {kotunil: {derived: {Ohm, quettaohm, QΩ, ronnaohm, RΩ, yottaohm, YΩ, zettaohm, ZΩ, exaohm, EΩ, petaohm, PΩ, teraohm, TΩ, gigaohm, GΩ, megaohm, MΩ, kiloohm, kΩ, hectoohm, hΩ, decaohm, daΩ, deciohm, dΩ, centiohm, cΩ, microohm, μΩ, nanoohm, nΩ, femtoohm, fΩ, attoohm, aΩ }}}} = eu; 
        
export function testOhm() {
   console.log("-Start testOhm");      
    
    checkObjects(QΩ, new Ohm(10**30));
    checkObjects(quettaohm, QΩ);

    checkObjects(RΩ, new Ohm(10**27));
    checkObjects(ronnaohm, RΩ);

    checkObjects(YΩ, new Ohm(10**24));
    checkObjects(yottaohm, YΩ);

    checkObjects(ZΩ, new Ohm(10**21));
    checkObjects(zettaohm, ZΩ);

    checkObjects(EΩ, new Ohm(10**18));
    checkObjects(exaohm, EΩ);

    checkObjects(PΩ, new Ohm(10**15));
    checkObjects(petaohm, PΩ);

    checkObjects(TΩ, new Ohm(10**12));
    checkObjects(teraohm, TΩ);

    checkObjects(GΩ, new Ohm(10**9));
    checkObjects(gigaohm, GΩ);

    checkObjects(MΩ, new Ohm(10**6));
    checkObjects(megaohm, MΩ);

    checkObjects(kΩ, new Ohm(10**3));
    checkObjects(kiloohm, kΩ);

    checkObjects(hΩ, new Ohm(10**2));
    checkObjects(hectoohm, hΩ);

    checkObjects(daΩ, new Ohm(10**1));
    checkObjects(decaohm, daΩ);

    checkObjects(dΩ, new Ohm(10**-1));
    checkObjects(deciohm, dΩ);

    checkObjects(cΩ, new Ohm(10**-2));
    checkObjects(centiohm, cΩ);

    checkObjects(μΩ, new Ohm(10**-6));
    checkObjects(microohm, μΩ);

    checkObjects(nΩ, new Ohm(10**-9));
    checkObjects(nanoohm, nΩ);

    checkObjects(fΩ, new Ohm(10**-15));
    checkObjects(femtoohm, fΩ);

    checkObjects(aΩ, new Ohm(10**-18));
    checkObjects(attoohm, aΩ);
    console.log("-Fin testOhm");
}
