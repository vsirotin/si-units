import {numberChecks, numberErrors, getNumberCheckedObjects} from './checker'
import {testTutorial} from './tests/TutorialTest'
import {testBase} from './tests/base/BaseTest'
import {testDerived} from './tests/derived/DerivedTest'
import {testSpecialUnits} from './tests/specialunits/SpecialUnitsTest'
import {testCurrencies} from './tests/currency/CurrenciesTest'

testTutorial()
testBase()
testDerived()
testSpecialUnits()
testCurrencies()

console.log("-------------------------------------------------------------------------------------------------")
console.log("|             |Test number|Number tested KotUniL's objects|Number errors                        |")
console.log("-------------------------------------------------------------------------------------------------")
console.log("|Expectation: |     1078  |          61                   |          0                          |")
console.log("-------------------------------------------------------------------------------------------------")
console.log("|Test results:|    ", numberChecks, " |         ", getNumberCheckedObjects(), "                  |         ", numberErrors, "                         |")
console.log("-------------------------------------------------------------------------------------------------")


