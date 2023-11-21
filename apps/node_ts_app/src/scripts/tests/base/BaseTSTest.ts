
import {testSecond} from './SecondTest';
import {testMetre} from './MetreTest';
import {testKilogram} from './KilogramTest';
import {testAmpere} from './AmpereTest';
import {testKelvin} from './KelvinTest';
import {testMole} from './MoleTest';
import {testCandela} from './CandelaTest';

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