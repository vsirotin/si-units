        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.EPS
import kotlin.test.assertEquals
import kotlin.test.Test
import kotlin.math.pow

internal class SiemensTest {

    @Test
    fun testSiemensMainTest1() {
        assertEquals(1.S , S)
    }
    
    @Test
    fun testSiemensMainTest2() {
        assertEquals(12.3.S , Siemens(12.3))
    }
    
    @Test
    fun testSiemensMainTest3() {
        val x: Siemens = 12.3.S
        assertEquals(x , Siemens(12.3))
    }
    
    @Test
    fun testSiemensMainTest4() {
        val x: Siemens = S
        assertEquals(x , Siemens(1.0))
    }
              
    @Test
    fun testSiemensQSTest() {
        val myPow = 10.0.pow(30)
        assertEquals(1.QS.value, S.value*myPow, EPS)
        assertEquals(1.quettasiemens.value, S.value*myPow)
        assertEquals(1.QS , QS)
        assertEquals(quettasiemens, QS)
    }    
    
          
    @Test
    fun testSiemensRSTest() {
        val myPow = 10.0.pow(27)
        assertEquals(1.RS.value, S.value*myPow, EPS)
        assertEquals(1.ronnasiemens.value, S.value*myPow)
        assertEquals(1.RS , RS)
        assertEquals(ronnasiemens, RS)
    }    
    
          
    @Test
    fun testSiemensYSTest() {
        val myPow = 10.0.pow(24)
        assertEquals(1.YS.value, S.value*myPow, EPS)
        assertEquals(1.yottasiemens.value, S.value*myPow)
        assertEquals(1.YS , YS)
        assertEquals(yottasiemens, YS)
    }    
    
          
    @Test
    fun testSiemensZSTest() {
        val myPow = 10.0.pow(21)
        assertEquals(1.ZS.value, S.value*myPow, EPS)
        assertEquals(1.zettasiemens.value, S.value*myPow)
        assertEquals(1.ZS , ZS)
        assertEquals(zettasiemens, ZS)
    }    
    
          
    @Test
    fun testSiemensESTest() {
        val myPow = 10.0.pow(18)
        assertEquals(1.ES.value, S.value*myPow, EPS)
        assertEquals(1.exasiemens.value, S.value*myPow)
        assertEquals(1.ES , ES)
        assertEquals(exasiemens, ES)
    }    
    
          
    @Test
    fun testSiemensPSTest() {
        val myPow = 10.0.pow(15)
        assertEquals(1.PS.value, S.value*myPow, EPS)
        assertEquals(1.petasiemens.value, S.value*myPow)
        assertEquals(1.PS , PS)
        assertEquals(petasiemens, PS)
    }    
    
          
    @Test
    fun testSiemensTSTest() {
        val myPow = 10.0.pow(12)
        assertEquals(1.TS.value, S.value*myPow, EPS)
        assertEquals(1.terasiemens.value, S.value*myPow)
        assertEquals(1.TS , TS)
        assertEquals(terasiemens, TS)
    }    
    
          
    @Test
    fun testSiemensGSTest() {
        val myPow = 10.0.pow(9)
        assertEquals(1.GS.value, S.value*myPow, EPS)
        assertEquals(1.gigasiemens.value, S.value*myPow)
        assertEquals(1.GS , GS)
        assertEquals(gigasiemens, GS)
    }    
    
          
    @Test
    fun testSiemensMSTest() {
        val myPow = 10.0.pow(6)
        assertEquals(1.MS.value, S.value*myPow, EPS)
        assertEquals(1.megasiemens.value, S.value*myPow)
        assertEquals(1.MS , MS)
        assertEquals(megasiemens, MS)
    }    
    
          
    @Test
    fun testSiemensK1STest() {
        val myPow = 10.0.pow(3)
        assertEquals(1.kS.value, S.value*myPow, EPS)
        assertEquals(1.kilosiemens.value, S.value*myPow)
        assertEquals(1.kS , kS)
        assertEquals(kilosiemens, kS)
    }    
    
          
    @Test
    fun testSiemensH1STest() {
        val myPow = 10.0.pow(2)
        assertEquals(1.hS.value, S.value*myPow, EPS)
        assertEquals(1.hectosiemens.value, S.value*myPow)
        assertEquals(1.hS , hS)
        assertEquals(hectosiemens, hS)
    }    
    
          
    @Test
    fun testSiemensDA1STest() {
        val myPow = 10.0.pow(1)
        assertEquals(1.daS.value, S.value*myPow, EPS)
        assertEquals(1.decasiemens.value, S.value*myPow)
        assertEquals(1.daS , daS)
        assertEquals(decasiemens, daS)
    }    
    
          
    @Test
    fun testSiemensD1STest() {
        val myPow = 10.0.pow(-1)
        assertEquals(1.dS.value, S.value*myPow, EPS)
        assertEquals(1.decisiemens.value, S.value*myPow)
        assertEquals(1.dS , dS)
        assertEquals(decisiemens, dS)
    }    
    
          
    @Test
    fun testSiemensC1STest() {
        val myPow = 10.0.pow(-2)
        assertEquals(1.cS.value, S.value*myPow, EPS)
        assertEquals(1.centisiemens.value, S.value*myPow)
        assertEquals(1.cS , cS)
        assertEquals(centisiemens, cS)
    }    
    
          
    @Test
    fun testSiemensM1STest() {
        val myPow = 10.0.pow(-3)
        assertEquals(1.mS.value, S.value*myPow, EPS)
        assertEquals(1.millisiemens.value, S.value*myPow)
        assertEquals(1.mS , mS)
        assertEquals(millisiemens, mS)
    }    
    
          
    @Test
    fun testSiemensΜ1STest() {
        val myPow = 10.0.pow(-6)
        assertEquals(1.μS.value, S.value*myPow, EPS)
        assertEquals(1.microsiemens.value, S.value*myPow)
        assertEquals(1.μS , μS)
        assertEquals(microsiemens, μS)
    }    
    
          
    @Test
    fun testSiemensN1STest() {
        val myPow = 10.0.pow(-9)
        assertEquals(1.nS.value, S.value*myPow, EPS)
        assertEquals(1.nanosiemens.value, S.value*myPow)
        assertEquals(1.nS , nS)
        assertEquals(nanosiemens, nS)
    }    
    
          
    @Test
    fun testSiemensP1STest() {
        val myPow = 10.0.pow(-12)
        assertEquals(1.pS.value, S.value*myPow, EPS)
        assertEquals(1.picosiemens.value, S.value*myPow)
        assertEquals(1.pS , pS)
        assertEquals(picosiemens, pS)
    }    
    
          
    @Test
    fun testSiemensF1STest() {
        val myPow = 10.0.pow(-15)
        assertEquals(1.fS.value, S.value*myPow, EPS)
        assertEquals(1.femtosiemens.value, S.value*myPow)
        assertEquals(1.fS , fS)
        assertEquals(femtosiemens, fS)
    }    
    
          
    @Test
    fun testSiemensA1STest() {
        val myPow = 10.0.pow(-18)
        assertEquals(1.aS.value, S.value*myPow, EPS)
        assertEquals(1.attosiemens.value, S.value*myPow)
        assertEquals(1.aS , aS)
        assertEquals(attosiemens, aS)
    }    
    
          
    @Test
    fun testSiemensZ1STest() {
        val myPow = 10.0.pow(-21)
        assertEquals(1.zS.value, S.value*myPow, EPS)
        assertEquals(1.zeptosiemens.value, S.value*myPow)
        assertEquals(1.zS , zS)
        assertEquals(zeptosiemens, zS)
    }    
    
          
    @Test
    fun testSiemensY1STest() {
        val myPow = 10.0.pow(-24)
        assertEquals(1.yS.value, S.value*myPow, EPS)
        assertEquals(1.yoctosiemens.value, S.value*myPow)
        assertEquals(1.yS , yS)
        assertEquals(yoctosiemens, yS)
    }    
    
          
    @Test
    fun testSiemensR1STest() {
        val myPow = 10.0.pow(-27)
        assertEquals(1.rS.value, S.value*myPow, EPS)
        assertEquals(1.rontosiemens.value, S.value*myPow)
        assertEquals(1.rS , rS)
        assertEquals(rontosiemens, rS)
    }    
    
          
    @Test
    fun testSiemensQ1STest() {
        val myPow = 10.0.pow(-30)
        assertEquals(1.qS.value, S.value*myPow, EPS)
        assertEquals(1.quectosiemens.value, S.value*myPow)
        assertEquals(1.qS , qS)
        assertEquals(quectosiemens, qS)
    }    
    }