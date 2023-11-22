import {checkObjects, numberChecks, numberErrors, getNumberCheckedObjects} from './checker'
import {testTutorial} from './tests/TutorialTest'
import {testBase} from './tests/base/BaseTSTest'
import {testDerived} from './tests/derived/DerivedTSTest'
import {testSpecialUnits} from './tests/specialunits/SpecialUnitsTest'

testTutorial();
testBase();
testDerived();
testSpecialUnits();

console.log("Number checks=" + numberChecks )
console.log("Number tested objects=" + getNumberCheckedObjects() )
console.log("Number errors=" +  numberErrors )


