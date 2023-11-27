    
import {checkObjects, checkValues, checkBoolean} from '/src/scripts/tests/checker.js';
 
const {sirotin: {kotunil: {derived: {Lumen, quettalumen, Qlm, ronnalumen, Rlm, yottalumen, Ylm, zettalumen, Zlm, exalumen, Elm, petalumen, Plm, teralumen, Tlm, gigalumen, Glm, megalumen, Mlm, kilolumen, klm, hectolumen, hlm, decalumen, dalm, decilumen, dlm, centilumen, clm, microlumen, μlm, nanolumen, nlm, femtolumen, flm, attolumen, alm }}}} = eu; 
        
export function testLumen() {
   console.log("-Start testLumen");      
    
    checkObjects(Qlm, new Lumen(10**30));
    checkObjects(quettalumen, Qlm);

    checkObjects(Rlm, new Lumen(10**27));
    checkObjects(ronnalumen, Rlm);

    checkObjects(Ylm, new Lumen(10**24));
    checkObjects(yottalumen, Ylm);

    checkObjects(Zlm, new Lumen(10**21));
    checkObjects(zettalumen, Zlm);

    checkObjects(Elm, new Lumen(10**18));
    checkObjects(exalumen, Elm);

    checkObjects(Plm, new Lumen(10**15));
    checkObjects(petalumen, Plm);

    checkObjects(Tlm, new Lumen(10**12));
    checkObjects(teralumen, Tlm);

    checkObjects(Glm, new Lumen(10**9));
    checkObjects(gigalumen, Glm);

    checkObjects(Mlm, new Lumen(10**6));
    checkObjects(megalumen, Mlm);

    checkObjects(klm, new Lumen(10**3));
    checkObjects(kilolumen, klm);

    checkObjects(hlm, new Lumen(10**2));
    checkObjects(hectolumen, hlm);

    checkObjects(dalm, new Lumen(10**1));
    checkObjects(decalumen, dalm);

    checkObjects(dlm, new Lumen(10**-1));
    checkObjects(decilumen, dlm);

    checkObjects(clm, new Lumen(10**-2));
    checkObjects(centilumen, clm);

    checkObjects(μlm, new Lumen(10**-6));
    checkObjects(microlumen, μlm);

    checkObjects(nlm, new Lumen(10**-9));
    checkObjects(nanolumen, nlm);

    checkObjects(flm, new Lumen(10**-15));
    checkObjects(femtolumen, flm);

    checkObjects(alm, new Lumen(10**-18));
    checkObjects(attolumen, alm);
    console.log("-Fin testLumen");
}
