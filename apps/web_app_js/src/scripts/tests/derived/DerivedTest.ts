
import {testRadian} from './RadianTest';
import {testSteradian} from './SteradianTest';
import {testHertz} from './HertzTest';
import {testNewton} from './NewtonTest';
import {testPascal} from './PascalTest';
import {testJoule} from './JouleTest';
import {testWatt} from './WattTest';
import {testCoulomb} from './CoulombTest';
import {testVolt} from './VoltTest';
import {testFarad} from './FaradTest';
import {testOhm} from './OhmTest';
import {testSiemens} from './SiemensTest';
import {testWeber} from './WeberTest';
import {testTesla} from './TeslaTest';
import {testHenry} from './HenryTest';
import {testLumen} from './LumenTest';
import {testLux} from './LuxTest';
import {testBecquerel} from './BecquerelTest';
import {testGray} from './GrayTest';
import {testSievert} from './SievertTest';
import {testKatal} from './KatalTest';

export function testDerived() {
   console.log("Start testDerived")
   testRadian()
   testSteradian()
   testHertz()
   testNewton()
   testPascal()
   testJoule()
   testWatt()
   testCoulomb()
   testVolt()
   testFarad()
   testOhm()
   testSiemens()
   testWeber()
   testTesla()
   testHenry()
   testLumen()
   testLux()
   testBecquerel()
   testGray()
   testSievert()
   testKatal()
   console.log("Fin testDerived")
}