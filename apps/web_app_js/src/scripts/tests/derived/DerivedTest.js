
import {testRadian} from './RadianTest.js';
import {testSteradian} from './SteradianTest.js';
import {testHertz} from './HertzTest.js';
import {testNewton} from './NewtonTest.js';
import {testPascal} from './PascalTest.js';
import {testJoule} from './JouleTest.js';
import {testWatt} from './WattTest.js';
import {testCoulomb} from './CoulombTest.js';
import {testVolt} from './VoltTest.js';
import {testFarad} from './FaradTest.js';
import {testOhm} from './OhmTest.js';
import {testSiemens} from './SiemensTest.js';
import {testWeber} from './WeberTest.js';
import {testTesla} from './TeslaTest.js';
import {testHenry} from './HenryTest.js';
import {testLumen} from './LumenTest.js';
import {testLux} from './LuxTest.js';
import {testBecquerel} from './BecquerelTest.js';
import {testGray} from './GrayTest.js';
import {testSievert} from './SievertTest.js';
import {testKatal} from './KatalTest.js';

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