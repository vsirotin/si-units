//import {eu} from 'kotunil-js-lib'
import {checkObjects, numberChecks, numberErrors, getNumberCheckedObjects} from './checker'
import {testTutorial} from './tests/TutorialTest'
import {testBase} from './tests/base/BaseTSTest'

// console.log("eu=" + JSON.stringify(eu))
// const Base = eu.sirotin.kotunil.base
// const a = Base.A
// const b = Base.Tcd
//
// console.log("In TS  a=" + JSON.stringify(a));
// console.log("In TS  a.constructor.name =" +  a.constructor.name);
// console.log("In TS  b=" + JSON.stringify(b));
// console.log("In TS  b.constructor.name =" +  b.constructor.name);
//
// const c = a.timesExp(b);
// console.log("In TS  c.constructor.name =" +  c.constructor.name);
// console.log("In TS c=" + JSON.stringify(c));
// console.log("In TS c.unitSymbols=" + JSON.stringify(c.unitSymbols()));
//
//
//
// checkObjects(a, b);

testTutorial();
testBase();

console.log("Number checks=" + numberChecks )
console.log("Number tested objects=" + getNumberCheckedObjects() )
console.log("Number errors=" +  numberErrors )
// console.log("s1=" + JSON.stringify(s1) )

