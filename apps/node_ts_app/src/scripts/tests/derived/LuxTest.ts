    
import {checkObjects, checkValues, checkBoolean} from '../../checker';
import {eu} from 'kotunil-js-lib';
const {sirotin: {kotunil: {derived: {Lux, quettalux, Qlx, ronnalux, Rlx, yottalux, Ylx, zettalux, Zlx, exalux, Elx, petalux, Plx, teralux, Tlx, gigalux, Glx, megalux, Mlx, kilolux, klx, hectolux, hlx, decalux, dalx, decilux, dlx, centilux, clx, microlux, μlx, nanolux, nlx, femtolux, flx, attolux, alx }}}} = eu; 
        
export function testLux() {
   console.log("-Start testLux");      
    
    checkObjects(Qlx, new Lux(10**30));
    checkObjects(quettalux, Qlx);

    checkObjects(Rlx, new Lux(10**27));
    checkObjects(ronnalux, Rlx);

    checkObjects(Ylx, new Lux(10**24));
    checkObjects(yottalux, Ylx);

    checkObjects(Zlx, new Lux(10**21));
    checkObjects(zettalux, Zlx);

    checkObjects(Elx, new Lux(10**18));
    checkObjects(exalux, Elx);

    checkObjects(Plx, new Lux(10**15));
    checkObjects(petalux, Plx);

    checkObjects(Tlx, new Lux(10**12));
    checkObjects(teralux, Tlx);

    checkObjects(Glx, new Lux(10**9));
    checkObjects(gigalux, Glx);

    checkObjects(Mlx, new Lux(10**6));
    checkObjects(megalux, Mlx);

    checkObjects(klx, new Lux(10**3));
    checkObjects(kilolux, klx);

    checkObjects(hlx, new Lux(10**2));
    checkObjects(hectolux, hlx);

    checkObjects(dalx, new Lux(10**1));
    checkObjects(decalux, dalx);

    checkObjects(dlx, new Lux(10**-1));
    checkObjects(decilux, dlx);

    checkObjects(clx, new Lux(10**-2));
    checkObjects(centilux, clx);

    checkObjects(μlx, new Lux(10**-6));
    checkObjects(microlux, μlx);

    checkObjects(nlx, new Lux(10**-9));
    checkObjects(nanolux, nlx);

    checkObjects(flx, new Lux(10**-15));
    checkObjects(femtolux, flx);

    checkObjects(alx, new Lux(10**-18));
    checkObjects(attolux, alx);
    console.log("-Fin testLux");
}
