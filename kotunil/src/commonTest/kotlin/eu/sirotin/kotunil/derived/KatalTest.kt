        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.EPS
import kotlin.test.assertEquals
import kotlin.test.Test
import kotlin.math.pow

internal class KatalTest {

    @Test
    fun testKatalMainTest1() {
        assertEquals(1.kat , kat)
    }
    
     @Test
    fun testKatalMainTest2() {
        assertEquals(12.3.kat , Katal(12.3))
    }
              
    @Test
    fun testKatalQkatTest() {
        val myPow = 10.0.pow(30)
        assertEquals(1.Qkat.value, kat.value*myPow, EPS)
        assertEquals(1.quettakatal.value, kat.value*myPow)
        assertEquals(1.Qkat , Qkat)
        assertEquals(quettakatal, Qkat)
    }    
    
          
    @Test
    fun testKatalRkatTest() {
        val myPow = 10.0.pow(27)
        assertEquals(1.Rkat.value, kat.value*myPow, EPS)
        assertEquals(1.ronnakatal.value, kat.value*myPow)
        assertEquals(1.Rkat , Rkat)
        assertEquals(ronnakatal, Rkat)
    }    
    
          
    @Test
    fun testKatalYkatTest() {
        val myPow = 10.0.pow(24)
        assertEquals(1.Ykat.value, kat.value*myPow, EPS)
        assertEquals(1.yottakatal.value, kat.value*myPow)
        assertEquals(1.Ykat , Ykat)
        assertEquals(yottakatal, Ykat)
    }    
    
          
    @Test
    fun testKatalZkatTest() {
        val myPow = 10.0.pow(21)
        assertEquals(1.Zkat.value, kat.value*myPow, EPS)
        assertEquals(1.zettakatal.value, kat.value*myPow)
        assertEquals(1.Zkat , Zkat)
        assertEquals(zettakatal, Zkat)
    }    
    
          
    @Test
    fun testKatalEkatTest() {
        val myPow = 10.0.pow(18)
        assertEquals(1.Ekat.value, kat.value*myPow, EPS)
        assertEquals(1.exakatal.value, kat.value*myPow)
        assertEquals(1.Ekat , Ekat)
        assertEquals(exakatal, Ekat)
    }    
    
          
    @Test
    fun testKatalPkatTest() {
        val myPow = 10.0.pow(15)
        assertEquals(1.Pkat.value, kat.value*myPow, EPS)
        assertEquals(1.petakatal.value, kat.value*myPow)
        assertEquals(1.Pkat , Pkat)
        assertEquals(petakatal, Pkat)
    }    
    
          
    @Test
    fun testKatalTkatTest() {
        val myPow = 10.0.pow(12)
        assertEquals(1.Tkat.value, kat.value*myPow, EPS)
        assertEquals(1.terakatal.value, kat.value*myPow)
        assertEquals(1.Tkat , Tkat)
        assertEquals(terakatal, Tkat)
    }    
    
          
    @Test
    fun testKatalGkatTest() {
        val myPow = 10.0.pow(9)
        assertEquals(1.Gkat.value, kat.value*myPow, EPS)
        assertEquals(1.gigakatal.value, kat.value*myPow)
        assertEquals(1.Gkat , Gkat)
        assertEquals(gigakatal, Gkat)
    }    
    
          
    @Test
    fun testKatalMkatTest() {
        val myPow = 10.0.pow(6)
        assertEquals(1.Mkat.value, kat.value*myPow, EPS)
        assertEquals(1.megakatal.value, kat.value*myPow)
        assertEquals(1.Mkat , Mkat)
        assertEquals(megakatal, Mkat)
    }    
    
          
    @Test
    fun testKatalK1katTest() {
        val myPow = 10.0.pow(3)
        assertEquals(1.kkat.value, kat.value*myPow, EPS)
        assertEquals(1.kilokatal.value, kat.value*myPow)
        assertEquals(1.kkat , kkat)
        assertEquals(kilokatal, kkat)
    }    
    
          
    @Test
    fun testKatalH1katTest() {
        val myPow = 10.0.pow(2)
        assertEquals(1.hkat.value, kat.value*myPow, EPS)
        assertEquals(1.hectokatal.value, kat.value*myPow)
        assertEquals(1.hkat , hkat)
        assertEquals(hectokatal, hkat)
    }    
    
          
    @Test
    fun testKatalDA1katTest() {
        val myPow = 10.0.pow(1)
        assertEquals(1.dakat.value, kat.value*myPow, EPS)
        assertEquals(1.decakatal.value, kat.value*myPow)
        assertEquals(1.dakat , dakat)
        assertEquals(decakatal, dakat)
    }    
    
          
    @Test
    fun testKatalD1katTest() {
        val myPow = 10.0.pow(-1)
        assertEquals(1.dkat.value, kat.value*myPow, EPS)
        assertEquals(1.decikatal.value, kat.value*myPow)
        assertEquals(1.dkat , dkat)
        assertEquals(decikatal, dkat)
    }    
    
          
    @Test
    fun testKatalC1katTest() {
        val myPow = 10.0.pow(-2)
        assertEquals(1.ckat.value, kat.value*myPow, EPS)
        assertEquals(1.centikatal.value, kat.value*myPow)
        assertEquals(1.ckat , ckat)
        assertEquals(centikatal, ckat)
    }    
    
          
    @Test
    fun testKatalM1katTest() {
        val myPow = 10.0.pow(-3)
        assertEquals(1.mkat.value, kat.value*myPow, EPS)
        assertEquals(1.millikatal.value, kat.value*myPow)
        assertEquals(1.mkat , mkat)
        assertEquals(millikatal, mkat)
    }    
    
          
    @Test
    fun testKatalΜ1katTest() {
        val myPow = 10.0.pow(-6)
        assertEquals(1.μkat.value, kat.value*myPow, EPS)
        assertEquals(1.microkatal.value, kat.value*myPow)
        assertEquals(1.μkat , μkat)
        assertEquals(microkatal, μkat)
    }    
    
          
    @Test
    fun testKatalN1katTest() {
        val myPow = 10.0.pow(-9)
        assertEquals(1.nkat.value, kat.value*myPow, EPS)
        assertEquals(1.nanokatal.value, kat.value*myPow)
        assertEquals(1.nkat , nkat)
        assertEquals(nanokatal, nkat)
    }    
    
          
    @Test
    fun testKatalP1katTest() {
        val myPow = 10.0.pow(-12)
        assertEquals(1.pkat.value, kat.value*myPow, EPS)
        assertEquals(1.picokatal.value, kat.value*myPow)
        assertEquals(1.pkat , pkat)
        assertEquals(picokatal, pkat)
    }    
    
          
    @Test
    fun testKatalF1katTest() {
        val myPow = 10.0.pow(-15)
        assertEquals(1.fkat.value, kat.value*myPow, EPS)
        assertEquals(1.femtokatal.value, kat.value*myPow)
        assertEquals(1.fkat , fkat)
        assertEquals(femtokatal, fkat)
    }    
    
          
    @Test
    fun testKatalA1katTest() {
        val myPow = 10.0.pow(-18)
        assertEquals(1.akat.value, kat.value*myPow, EPS)
        assertEquals(1.attokatal.value, kat.value*myPow)
        assertEquals(1.akat , akat)
        assertEquals(attokatal, akat)
    }    
    
          
    @Test
    fun testKatalZ1katTest() {
        val myPow = 10.0.pow(-21)
        assertEquals(1.zkat.value, kat.value*myPow, EPS)
        assertEquals(1.zeptokatal.value, kat.value*myPow)
        assertEquals(1.zkat , zkat)
        assertEquals(zeptokatal, zkat)
    }    
    
          
    @Test
    fun testKatalY1katTest() {
        val myPow = 10.0.pow(-24)
        assertEquals(1.ykat.value, kat.value*myPow, EPS)
        assertEquals(1.yoctokatal.value, kat.value*myPow)
        assertEquals(1.ykat , ykat)
        assertEquals(yoctokatal, ykat)
    }    
    
          
    @Test
    fun testKatalR1katTest() {
        val myPow = 10.0.pow(-27)
        assertEquals(1.rkat.value, kat.value*myPow, EPS)
        assertEquals(1.rontokatal.value, kat.value*myPow)
        assertEquals(1.rkat , rkat)
        assertEquals(rontokatal, rkat)
    }    
    
          
    @Test
    fun testKatalQ1katTest() {
        val myPow = 10.0.pow(-30)
        assertEquals(1.qkat.value, kat.value*myPow, EPS)
        assertEquals(1.quectokatal.value, kat.value*myPow)
        assertEquals(1.qkat , qkat)
        assertEquals(quectokatal, qkat)
    }    
    }