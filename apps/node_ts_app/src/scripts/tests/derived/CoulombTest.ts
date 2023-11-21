    
import {checkObjects, checkValues, checkBoolean} from '../../checker';
import {eu} from 'kotunil-js-lib';
const {sirotin: {kotunil: {derived: {Coulomb, quettacoulomb, QC, ronnacoulomb, RC, yottacoulomb, YC, zettacoulomb, ZC, exacoulomb, EC, petacoulomb, PC, teracoulomb, TC, gigacoulomb, GC, megacoulomb, MC, kilocoulomb, kC, hectocoulomb, hC, decacoulomb, daC, decicoulomb, dC, centicoulomb, cC, microcoulomb, μC, nanocoulomb, nC, femtocoulomb, fC, attocoulomb, aC }}}} = eu; 
        
export function testCoulomb() {
   console.log("-Start testCoulomb");      
    
    checkObjects(QC, new Coulomb(10**30));
    checkObjects(quettacoulomb, QC);

    checkObjects(RC, new Coulomb(10**27));
    checkObjects(ronnacoulomb, RC);

    checkObjects(YC, new Coulomb(10**24));
    checkObjects(yottacoulomb, YC);

    checkObjects(ZC, new Coulomb(10**21));
    checkObjects(zettacoulomb, ZC);

    checkObjects(EC, new Coulomb(10**18));
    checkObjects(exacoulomb, EC);

    checkObjects(PC, new Coulomb(10**15));
    checkObjects(petacoulomb, PC);

    checkObjects(TC, new Coulomb(10**12));
    checkObjects(teracoulomb, TC);

    checkObjects(GC, new Coulomb(10**9));
    checkObjects(gigacoulomb, GC);

    checkObjects(MC, new Coulomb(10**6));
    checkObjects(megacoulomb, MC);

    checkObjects(kC, new Coulomb(10**3));
    checkObjects(kilocoulomb, kC);

    checkObjects(hC, new Coulomb(10**2));
    checkObjects(hectocoulomb, hC);

    checkObjects(daC, new Coulomb(10**1));
    checkObjects(decacoulomb, daC);

    checkObjects(dC, new Coulomb(10**-1));
    checkObjects(decicoulomb, dC);

    checkObjects(cC, new Coulomb(10**-2));
    checkObjects(centicoulomb, cC);

    checkObjects(μC, new Coulomb(10**-6));
    checkObjects(microcoulomb, μC);

    checkObjects(nC, new Coulomb(10**-9));
    checkObjects(nanocoulomb, nC);

    checkObjects(fC, new Coulomb(10**-15));
    checkObjects(femtocoulomb, fC);

    checkObjects(aC, new Coulomb(10**-18));
    checkObjects(attocoulomb, aC);
    console.log("-Fin testCoulomb");
}
