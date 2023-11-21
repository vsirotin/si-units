    
import {checkObjects, checkValues, checkBoolean} from '../../checker';
import {eu} from 'kotunil-js-lib';
const {sirotin: {kotunil: {derived: {Henry, quettahenry, QH, ronnahenry, RH, yottahenry, YH, zettahenry, ZH, exahenry, EH, petahenry, PH, terahenry, TH, gigahenry, GH, megahenry, MH, kilohenry, kH, hectohenry, hH, decahenry, daH, decihenry, dH, centihenry, cH, microhenry, μH, nanohenry, nH, femtohenry, fH, attohenry, aH }}}} = eu; 
        
export function testHenry() {
   console.log("-Start testHenry");      
    
    checkObjects(QH, new Henry(10**30));
    checkObjects(quettahenry, QH);

    checkObjects(RH, new Henry(10**27));
    checkObjects(ronnahenry, RH);

    checkObjects(YH, new Henry(10**24));
    checkObjects(yottahenry, YH);

    checkObjects(ZH, new Henry(10**21));
    checkObjects(zettahenry, ZH);

    checkObjects(EH, new Henry(10**18));
    checkObjects(exahenry, EH);

    checkObjects(PH, new Henry(10**15));
    checkObjects(petahenry, PH);

    checkObjects(TH, new Henry(10**12));
    checkObjects(terahenry, TH);

    checkObjects(GH, new Henry(10**9));
    checkObjects(gigahenry, GH);

    checkObjects(MH, new Henry(10**6));
    checkObjects(megahenry, MH);

    checkObjects(kH, new Henry(10**3));
    checkObjects(kilohenry, kH);

    checkObjects(hH, new Henry(10**2));
    checkObjects(hectohenry, hH);

    checkObjects(daH, new Henry(10**1));
    checkObjects(decahenry, daH);

    checkObjects(dH, new Henry(10**-1));
    checkObjects(decihenry, dH);

    checkObjects(cH, new Henry(10**-2));
    checkObjects(centihenry, cH);

    checkObjects(μH, new Henry(10**-6));
    checkObjects(microhenry, μH);

    checkObjects(nH, new Henry(10**-9));
    checkObjects(nanohenry, nH);

    checkObjects(fH, new Henry(10**-15));
    checkObjects(femtohenry, fH);

    checkObjects(aH, new Henry(10**-18));
    checkObjects(attohenry, aH);
    console.log("-Fin testHenry");
}
