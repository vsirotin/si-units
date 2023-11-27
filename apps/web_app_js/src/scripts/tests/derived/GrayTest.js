    
import {checkObjects, checkValues, checkBoolean} from '/src/scripts/tests/checker.js';
 
const {sirotin: {kotunil: {derived: {Gray, quettagray, QGy, ronnagray, RGy, yottagray, YGy, zettagray, ZGy, exagray, EGy, petagray, PGy, teragray, TGy, gigagray, GGy, megagray, MGy, kilogray, kGy, hectogray, hGy, decagray, daGy, decigray, dGy, centigray, cGy, microgray, μGy, nanogray, nGy, femtogray, fGy, attogray, aGy }}}} = eu; 
        
export function testGray() {
   console.log("-Start testGray");      
    
    checkObjects(QGy, new Gray(10**30));
    checkObjects(quettagray, QGy);

    checkObjects(RGy, new Gray(10**27));
    checkObjects(ronnagray, RGy);

    checkObjects(YGy, new Gray(10**24));
    checkObjects(yottagray, YGy);

    checkObjects(ZGy, new Gray(10**21));
    checkObjects(zettagray, ZGy);

    checkObjects(EGy, new Gray(10**18));
    checkObjects(exagray, EGy);

    checkObjects(PGy, new Gray(10**15));
    checkObjects(petagray, PGy);

    checkObjects(TGy, new Gray(10**12));
    checkObjects(teragray, TGy);

    checkObjects(GGy, new Gray(10**9));
    checkObjects(gigagray, GGy);

    checkObjects(MGy, new Gray(10**6));
    checkObjects(megagray, MGy);

    checkObjects(kGy, new Gray(10**3));
    checkObjects(kilogray, kGy);

    checkObjects(hGy, new Gray(10**2));
    checkObjects(hectogray, hGy);

    checkObjects(daGy, new Gray(10**1));
    checkObjects(decagray, daGy);

    checkObjects(dGy, new Gray(10**-1));
    checkObjects(decigray, dGy);

    checkObjects(cGy, new Gray(10**-2));
    checkObjects(centigray, cGy);

    checkObjects(μGy, new Gray(10**-6));
    checkObjects(microgray, μGy);

    checkObjects(nGy, new Gray(10**-9));
    checkObjects(nanogray, nGy);

    checkObjects(fGy, new Gray(10**-15));
    checkObjects(femtogray, fGy);

    checkObjects(aGy, new Gray(10**-18));
    checkObjects(attogray, aGy);
    console.log("-Fin testGray");
}
