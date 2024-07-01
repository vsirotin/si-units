# KotUniL - Kotlin Console Demo Application


This demo demonstrate the use of **KotUniL** library in a Node.JS console application developed with TypeScript
and tests all available in library objects and functions.

**KotUniL** covers all units of **International System of Units** (SI)  
like meter, second etc. [(see Wikipedia)](https://en.wikipedia.org/wiki/International_System_of_Units)
as well as SI- Prefixes (micro, nano etc.) and some other common units like currencies, percentages etc.

You can learn about functions and objects of **KotUniL** library in central [.../si-units/README.md](https://github.com/vsirotin/si-units/blob/8a4c1406be962031dd32724470fd15367c230e5d/README.md).
You can learn examples of using the library in Kotlin-Console in [.../si-units/apps/jvm/kotlin-console/src/main/kotlin/eu/sirotin/kotunil/app/kotlin/TutorialTest.kt](https://github.com/vsirotin/si-units/blob/8a4c1406be962031dd32724470fd15367c230e5d/apps/jvm/kotlin-console/src/main/kotlin/eu/sirotin/kotunil/app/kotlin/TutorialTest.kt).

## How to start console application
You can start the test with a commnad:
```bash
./gradlew :apps:node_ts_app:startConsole
```

On success the application will show a list of test and table with expected and real data.
Compare number in lines of printed table.

## How to properly write KotUniL's formulas
KotUniL is a multiplatform library.
You can read about how to properly write physics and other formulas
using the objects and functions of the KotUniL library in document
["Rules for writing KotUniL formulas in different programming languages"](https://github.com/vsirotin/si-units/blob/c3f1b87c2fa4b35adc64b676318e27eae3e246e5/RulesWritingFormulas.md).