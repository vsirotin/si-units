  
import {checkObjects, checkValues, checkBoolean} from '/src/scripts/tests/checker.js';
 
const {sirotin: {kotunil: {base: {Kilogram, quettakilogram, Qkg, ronnakilogram, Rkg, yottakilogram, Ykg, zettakilogram, Zkg, exakilogram, Ekg, petakilogram, Pkg, terakilogram, Tkg, gigakilogram, Gkg, megakilogram, Mkg, hectokilogram, hkg, decakilogram, dakg, decikilogram, dkg, centikilogram, ckg, microkilogram, μkg, nanokilogram, nkg, femtokilogram, fkg, attokilogram, akg }}}} = eu;            
export function testKilogram() {
   console.log("-Start testKilogram");      
    
    checkObjects(Qkg, new Kilogram(10**27));
    checkObjects(quettakilogram, Qkg);

    checkObjects(Rkg, new Kilogram(10**24));
    checkObjects(ronnakilogram, Rkg);

    checkObjects(Ykg, new Kilogram(10**21));
    checkObjects(yottakilogram, Ykg);

    checkObjects(Zkg, new Kilogram(10**18));
    checkObjects(zettakilogram, Zkg);

    checkObjects(Ekg, new Kilogram(10**15));
    checkObjects(exakilogram, Ekg);

    checkObjects(Pkg, new Kilogram(10**12));
    checkObjects(petakilogram, Pkg);

    checkObjects(Tkg, new Kilogram(10**9));
    checkObjects(terakilogram, Tkg);

    checkObjects(Gkg, new Kilogram(10**6));
    checkObjects(gigakilogram, Gkg);

    checkObjects(Mkg, new Kilogram(10**3));
    checkObjects(megakilogram, Mkg);

    checkObjects(hkg, new Kilogram(10**-1));
    checkObjects(hectokilogram, hkg);

    checkObjects(dakg, new Kilogram(10**-2));
    checkObjects(decakilogram, dakg);

    checkObjects(dkg, new Kilogram(10**-4));
    checkObjects(decikilogram, dkg);

    checkObjects(ckg, new Kilogram(10**-5));
    checkObjects(centikilogram, ckg);

    checkObjects(μkg, new Kilogram(10**-9));
    checkObjects(microkilogram, μkg);

    checkObjects(nkg, new Kilogram(10**-12));
    checkObjects(nanokilogram, nkg);

    checkObjects(fkg, new Kilogram(10**-18));
    checkObjects(femtokilogram, fkg);

    checkObjects(akg, new Kilogram(10**-21));
    checkObjects(attokilogram, akg);
    console.log("-Fin testKilogram");
}