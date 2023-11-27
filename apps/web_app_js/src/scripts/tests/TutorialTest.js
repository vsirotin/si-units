import {checkObjects, checkValues, checkBoolean} from '/src/scripts/tests/checker.js';
////import {eu} from 'kotunil-js-lib';
const {sirotin: {kotunil: {base: {Metre, m, millimetre, km, μm, Second, s, Kilogram, kg, A} }}} = eu;
const {sirotin: {kotunil: {core: {ε} }}} = eu;
const {sirotin: {kotunil: {specialunits: {l, m2, m3, ha, t} }}} = eu;
const {sirotin: {kotunil: {derived: {T, Wb} }}} = eu;

const COMPATIBILITY_ERR_PREFIX = "Can't process objects with different dimensions:";
export function testTutorial() {

    testHappyGettingStarted1();
    testHappyGettingStarted2();
    testDimensionAnalysis()
    testCategorySymbols()
    testErrors()
    testCompareTheSameTypes()
    testCompareDifferentType()
    testBaseUnits()
    testDerivedUnits()
    testPrefixes()
    testNonSiUnits()
}

function testHappyGettingStarted1() {
    //Eva broke a glass in her aquarium and water flowed to the bottom.
    // In aquarium before the break was 20 liters of water.
    // Eva's room is 4 m. long and 5 tall.
    // How high in mm. is water now in Eva's room with assumption that it stayed there and did not flow away?

    //The solution in Kotlin can be written in one line.
    // For didactic reasons as introduce two auxiliary variables s and h.
    console.log("- Start testHappyGettingStarted1");
  //        val s = 4.m * 5.m
          var s = m.times(4).timesExp(m.times(5));
  //        val v = 20.l
          var v = l.times(20);
  //        val h = v / s
          var h = v.divExp(s);
  //        val z = h / mm
          var z = h.divExp(millimetre);
          checkValues(1.0, z.value)
    console.log("- Fin testHappyGettingStarted1");
}

function testHappyGettingStarted2() {
    //The same task as by testHappyGettingStarted1, but other solution.
    console.log("- Start testHappyGettingStarted2");
  //        val s = 4.m * 5.m
          var s = new Metre(4).timesExp(new Metre(5));
  //        val v = 20.l
          var v = l.times(20);
  //        val h = v / s
          var h = v.divExp(s);
  //        val z = h / millimetre
          var z = h.divExp(millimetre);
          checkValues(1.0, z.value)
    console.log("- Fin testHappyGettingStarted2");
}

function testDimensionAnalysis() {
    console.log("- Start testDimensionAnalysis");
    //With the help of the built-in function unitSymbols you can get the dimension of any object in terms of SI standard.

    var s1 = m.times(4).timesExp(m.times(5));
    checkValues("m2", s1.unitSymbols());
    var x = l.times(20);
    checkValues("m3", x.unitSymbols());
    var h = x.divExp(s1);
    checkValues("m", h.unitSymbols());

    var y = s.times(1.2);
    checkValues("s", y.unitSymbols());

    var z = x.divExp(y);
    checkValues("m3/s", z.unitSymbols());
    console.log("- Fin testDimensionAnalysis");
}

function testCategorySymbols() {
    console.log("- Start testCategorySymbols");
    //Using the built-in function categorySymbols() you can analyze dimensions
    // of physical units in "academic" manner.
    var s1 = m.times(4).timesExp(m.times(5));
    checkValues("L2", s1.categorySymbols());

    var x = l.times(20);
    checkValues("L3", x.categorySymbols());

    var h = x.divExp(s1);
    checkValues("L", h.categorySymbols());

    var y = s.times(1.2);
    checkValues("T", y.categorySymbols());

    var z = x.divExp(y);
    checkValues("L3T-1", z.categorySymbols());
    console.log("- Fin testCategorySymbols");
}

//---------------Type safety
//Physical units of the same dimension can be added, added,
//divided and compared.
//If you try to do this with units of different types,
//you will get either compilation errors (for simple units) or run-time errors for complicated units.
function testErrors() {
    console.log("- Start testErrors");
    //Simple errors will be found on compilation phase:
    //var x = varKt.plus(new Metre(1), 2); // compiler error

    //Complex errors will be found in runtime:
    try {
        m.times(4).plus(s.times(2));
    }catch (e) {
        if (e.message.startsWith(COMPATIBILITY_ERR_PREFIX)){
            console.log("- Fin testErrors");
            return;
        }
    }
    throw new Error("Should be mot called!");
}


//Comparison of objects---------
//
//Physical objects can be compared only if they have the same dimensions,
// otherwise you will get a run-time error.

function testCompareTheSameTypes() {
    console.log("- Start testCompareTheSameTypes");
    m.compare(m);
    checkBoolean(m.times(5).compare(m.times(4.1)) > 0);

    checkBoolean(m3.times(4.21).compare(
            m3.times( 4.2)) > 0);
    console.log("- Fin testCompareTheSameTypes");
}

function testCompareDifferentType() {
    console.log("- Start testCompareDifferentType");
    var v1 = m.times(2.4);
    var v2 = s.times(2.4);

    try {
        v1.compare(v2);
    }catch (e) {
        if (e.message.startsWith(COMPATIBILITY_ERR_PREFIX)){
           console.log("- Fin testCompareDifferentType");
           return;
        }
    }
    throw new Error("Should be mot called!");
}


function testBaseUnits() {
    console.log("- Start testBaseUnits");
    checkObjects(new Second(1.1), s.times(1.1));
    checkObjects(s.times(1.2), new Second(1.2));

    checkObjects(new Kilogram(1.3), kg.times(1.3));
   console.log("- Fin testBaseUnits");
}

function testDerivedUnits() {
    console.log("- Start testDerivedUnits");
    checkObjects(T ,kg.timesExp(s.pw(-2)).timesExp(A.pw(-1)));

    checkObjects(T, Wb.divExp(m2));
    console.log("- Fin testDerivedUnits");
}

function testPrefixes() {
    console.log("- Start testPrefixes");
    var d = km.minus(μm.times(Math.pow(10, 9)));
    checkBoolean(Math.abs(d.value) < ε);
    console.log("- Fin testPrefixes");
}

function testNonSiUnits() {
    console.log("- Start testNonSiUnits");
    //A city park has area 2.35 hectares. During a rain 1 mm of water had fallen from the sky.
    //If there was no rain, the park should be watered with water from car cisterns.
    // A car cistern can carry 4 tons of water.
    //How many cisterns are needed to achieve the same effect as in case of rain?
    //Reminder: density of watter is 1 kg/l
    var s = ha.times(2.35);
    var ω = s.timesExp(millimetre); //water volume
    var ρ = kg.divExp(l); //density of watter is 1 kg/l
    var τ = ω.timesExp(ρ); //common water weight of rain
    var n = τ.divExp(t.times(4));

    checkValues(5.875, n.value); //.getValue());
    console.log("- Fin testNonSiUnits");
}

