  
import {checkObjects, checkValues, checkBoolean} from '/src/scripts/tests/checker.js';
 
const {sirotin: {kotunil: {base: {Metre, quettametre, Qm, ronnametre, Rm, yottametre, Ym, zettametre, Zm, exametre, Em, petametre, Pm, terametre, Tm, gigametre, Gm, megametre, Mm, kilometre, km, hectometre, hm, decametre, dam, decimetre, dm, centimetre, cm, micrometre, μm, nanometre, nm, femtometre, fm, attometre, am }}}} = eu;            
export function testMetre() {
   console.log("-Start testMetre");      
    
    checkObjects(Qm, new Metre(10**30));
    checkObjects(quettametre, Qm);

    checkObjects(Rm, new Metre(10**27));
    checkObjects(ronnametre, Rm);

    checkObjects(Ym, new Metre(10**24));
    checkObjects(yottametre, Ym);

    checkObjects(Zm, new Metre(10**21));
    checkObjects(zettametre, Zm);

    checkObjects(Em, new Metre(10**18));
    checkObjects(exametre, Em);

    checkObjects(Pm, new Metre(10**15));
    checkObjects(petametre, Pm);

    checkObjects(Tm, new Metre(10**12));
    checkObjects(terametre, Tm);

    checkObjects(Gm, new Metre(10**9));
    checkObjects(gigametre, Gm);

    checkObjects(Mm, new Metre(10**6));
    checkObjects(megametre, Mm);

    checkObjects(km, new Metre(10**3));
    checkObjects(kilometre, km);

    checkObjects(hm, new Metre(10**2));
    checkObjects(hectometre, hm);

    checkObjects(dam, new Metre(10**1));
    checkObjects(decametre, dam);

    checkObjects(dm, new Metre(10**-1));
    checkObjects(decimetre, dm);

    checkObjects(cm, new Metre(10**-2));
    checkObjects(centimetre, cm);

    checkObjects(μm, new Metre(10**-6));
    checkObjects(micrometre, μm);

    checkObjects(nm, new Metre(10**-9));
    checkObjects(nanometre, nm);

    checkObjects(fm, new Metre(10**-15));
    checkObjects(femtometre, fm);

    checkObjects(am, new Metre(10**-18));
    checkObjects(attometre, am);
    console.log("-Fin testMetre");
}