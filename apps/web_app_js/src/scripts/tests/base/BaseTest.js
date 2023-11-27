
import {testSecond} from './SecondTest.js'
import {testMetre} from './MetreTest.js'
import {testKilogram} from './KilogramTest.js'
import {testAmpere} from './AmpereTest.js'
import {testKelvin} from './KelvinTest.js'
import {testMole} from './MoleTest.js'
import {testCandela} from './CandelaTest.js'

export function testBase() {
   console.log("Start testBase")
   testSecond()
   testMetre()
   testKilogram()
   testAmpere()
   testKelvin()
   testMole()
   testCandela()
   console.log("Fin testBase")
}