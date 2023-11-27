    
import {checkObjects, checkValues, checkBoolean} from '/src/scripts/tests/checker.js';
 
const {sirotin: {kotunil: {derived: {Joule, quettajoule, QJ, ronnajoule, RJ, yottajoule, YJ, zettajoule, ZJ, exajoule, EJ, petajoule, PJ, terajoule, TJ, gigajoule, GJ, megajoule, MJ, kilojoule, kJ, hectojoule, hJ, decajoule, daJ, decijoule, dJ, centijoule, cJ, microjoule, μJ, nanojoule, nJ, femtojoule, fJ, attojoule, aJ }}}} = eu; 
        
export function testJoule() {
   console.log("-Start testJoule");      
    
    checkObjects(QJ, new Joule(10**30));
    checkObjects(quettajoule, QJ);

    checkObjects(RJ, new Joule(10**27));
    checkObjects(ronnajoule, RJ);

    checkObjects(YJ, new Joule(10**24));
    checkObjects(yottajoule, YJ);

    checkObjects(ZJ, new Joule(10**21));
    checkObjects(zettajoule, ZJ);

    checkObjects(EJ, new Joule(10**18));
    checkObjects(exajoule, EJ);

    checkObjects(PJ, new Joule(10**15));
    checkObjects(petajoule, PJ);

    checkObjects(TJ, new Joule(10**12));
    checkObjects(terajoule, TJ);

    checkObjects(GJ, new Joule(10**9));
    checkObjects(gigajoule, GJ);

    checkObjects(MJ, new Joule(10**6));
    checkObjects(megajoule, MJ);

    checkObjects(kJ, new Joule(10**3));
    checkObjects(kilojoule, kJ);

    checkObjects(hJ, new Joule(10**2));
    checkObjects(hectojoule, hJ);

    checkObjects(daJ, new Joule(10**1));
    checkObjects(decajoule, daJ);

    checkObjects(dJ, new Joule(10**-1));
    checkObjects(decijoule, dJ);

    checkObjects(cJ, new Joule(10**-2));
    checkObjects(centijoule, cJ);

    checkObjects(μJ, new Joule(10**-6));
    checkObjects(microjoule, μJ);

    checkObjects(nJ, new Joule(10**-9));
    checkObjects(nanojoule, nJ);

    checkObjects(fJ, new Joule(10**-15));
    checkObjects(femtojoule, fJ);

    checkObjects(aJ, new Joule(10**-18));
    checkObjects(attojoule, aJ);
    console.log("-Fin testJoule");
}
