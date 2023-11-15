//import * as eu1 from 'kotunil-js-lib/si-units-kotunil.js'
import {eu} from 'kotunil-js-lib'
//import * as s1  from 'kotunil-js-lib'
import {checkObjects, numberChecks, numberErrors, getNumberCheckedObjects} from './checker'

console.log("eu=" + eu.sirotin.kotunil.base)
const Base = eu.sirotin.kotunil.base
const a = Base.A
const b = Base.Tcd

console.log("In TS  a=" + JSON.stringify(a));
console.log("In TS  a.constructor.name =" +  a.constructor.name);
console.log("In TS  b=" + JSON.stringify(b));
console.log("In TS  b.constructor.name =" +  b.constructor.name);

const c = a.timesExp(b);
console.log("In TS  c.constructor.name =" +  c.constructor.name);
console.log("In TS c=" + JSON.stringify(c));
console.log("In TS c.unitSymbols=" + JSON.stringify(c.unitSymbols()));



checkObjects(a, b);

 console.log("Number tested objects=" + getNumberCheckedObjects() )
 console.log("Number errors=" +  numberErrors )
// console.log("s1=" + JSON.stringify(s1) )

