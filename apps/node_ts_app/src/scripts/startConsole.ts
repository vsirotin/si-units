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

console.log("Number checks=" + numberChecks )
console.log("Number tested objects=" + getNumberCheckedObjects() )
console.log("Number errors=" +  numberErrors )


