    //var KotUniL = import("si-units-kotunil");
//     const KotUniL = this['si-units-kotunil']
//    console.log("KotUniL=" + KotUniL);
//    const Base = KotUniL.eu.sirotin.kotunil.base;
//    const Special = KotUniL.eu.sirotin.kotunil.specialunits;
//    console.log("Special=" + Special)
//    const m = Base.m;
//    console.log("m=" + m);
//    const l = Special.l;
//    console.log("l=" + l);
//
//    const au = Special.au;
//    console.log("au=" + au);



    function testTutorial() {
    console.log("Start testTutorial");
        testHappyGettingStarted();
//        testDimensionAnalysis()
//        testCategorySymbols()
//        testErrors1()
//        testErrors2()
//        testCompareTheSameTypes()
//        testCompareDifferentType1()
//        testCompareDifferentType2()
//        testBaseUnits()
//        testDerivedUnits()
//        testPrefixes()
        testSpecialUnits()
          console.log("Fin testTutorial");
    }

    function testHappyGettingStarted() {
        //Eva broke a glass in her aquarium and water flowed to the bottom.
        // In aquarium before the break was 20 liters of water.
        // Eva's room is 4 m. long and 5 tall.
        // How high in mm. is water now in Eva's room with assumption that it stayed there and did not flow away?

        //The solution in Kotlin can be written in one line.
        // For didactic reasons as introduce two auxiliary variables s and h.
        console.log("- Start testHappyGettingStarted");
      //        val s = 4.m * 5.m
              var s0 = m.times(5);
              var s1 = m.times(s0);
              var s = m.times(4).timesExp(m.times(5));
      //        val v = 20.l
              var v = l.times(20);
      //        val h = v / s
              var h = v.divExp(s);
      //        val z = h / mm
              var z = h.divExp(mm);
              checkValues(1.0, z.value)
        console.log("- Fin testHappyGettingStarted");
    }