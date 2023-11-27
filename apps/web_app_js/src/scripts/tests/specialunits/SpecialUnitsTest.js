import {checkObjects, checkValues, checkBoolean} from '/src/scripts/tests/checker.js';
const {sirotin: {kotunil: {base: {Kilogram, Kelvin, m, Second, Metre}}}} = eu;
const {sirotin: {kotunil: {derived: {Joule}}}} = eu;
const {sirotin: {kotunil: {specialunits: {g, celsius, m2, m3, min, h, d, au, π, e, ha, l, t, Da, eV, percentage }}}} = eu;

export function testSpecialUnits() {
    console.log("Start testSpecialUnits");

    checkObjects(g, new Kilogram(0.001));

    checkObjects(celsius, new Kelvin(273.15));

    checkObjects(m2, m.timesExp(m));
    checkObjects(m3, m2.timesExp(m));

    checkObjects(min, new Second(60));
    checkObjects(h, min.times(60));
    checkObjects(d, h.times(24));
    
    //Astronomical unit 149597870700 metre
    checkObjects(au, new Metre(149597870700));
    
    
    //Mathematical constant (Archimedes' constant π). The numeric value of π is approximately 3.1415926536
    checkValues(π, 3.1415926536);
    //Euler's number e. The numeric value of e is approximately 2.7182818284
    checkValues(e, 2.7182818284);
    
    //hectare
    checkObjects(ha, m2.times(10000));
    
    //Litre
    checkObjects(l, m3.times(0.001));
    
    //tonne
    checkObjects(t, new Kilogram(1000));
    
    //dalton
    checkObjects(Da, new Kilogram(1.660539040 * (10**-27)));
    
    //electronvolt
    checkObjects(eV,  new Joule(1.602176634*(10**-19)));
    
    //Percentage
    checkValues(percentage, 0.01);

    console.log("Fin testSpecialUnits");
}