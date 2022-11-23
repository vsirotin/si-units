        
package eu.sirotin.siunits.base

import eu.sirotin.siunits.EPS
import eu.sirotin.siunits.core.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.pow

internal class MetreTest {

    @Test
    fun testMetreMainTest() {
        assertEquals(Metre(1.0), m)
        assertEquals(1.m , m)
    }
              
    @Test
    fun testMetreQmTest() {
        val myPow = 10.0.pow(30)
        assertEquals(myPow * Metre(1.0), 1.Qm)
        assertEquals(myPow * Metre(1.0), 1.quettametre)
        assertEquals(1.m.Qm , m.value/myPow, EPS)
        assertEquals(1.m.quettametre , m.value/myPow, EPS)
        assertEquals(1.Qm , Qm)
        assertEquals(quettametre , Qm)
    }    
    
          
    @Test
    fun testMetreRmTest() {
        val myPow = 10.0.pow(27)
        assertEquals(myPow * Metre(1.0), 1.Rm)
        assertEquals(myPow * Metre(1.0), 1.ronnametre)
        assertEquals(1.m.Rm , m.value/myPow, EPS)
        assertEquals(1.m.ronnametre , m.value/myPow, EPS)
        assertEquals(1.Rm , Rm)
        assertEquals(ronnametre , Rm)
    }    
    
          
    @Test
    fun testMetreYmTest() {
        val myPow = 10.0.pow(24)
        assertEquals(myPow * Metre(1.0), 1.Ym)
        assertEquals(myPow * Metre(1.0), 1.yottametre)
        assertEquals(1.m.Ym , m.value/myPow, EPS)
        assertEquals(1.m.yottametre , m.value/myPow, EPS)
        assertEquals(1.Ym , Ym)
        assertEquals(yottametre , Ym)
    }    
    
          
    @Test
    fun testMetreZmTest() {
        val myPow = 10.0.pow(21)
        assertEquals(myPow * Metre(1.0), 1.Zm)
        assertEquals(myPow * Metre(1.0), 1.zettametre)
        assertEquals(1.m.Zm , m.value/myPow, EPS)
        assertEquals(1.m.zettametre , m.value/myPow, EPS)
        assertEquals(1.Zm , Zm)
        assertEquals(zettametre , Zm)
    }    
    
          
    @Test
    fun testMetreEmTest() {
        val myPow = 10.0.pow(18)
        assertEquals(myPow * Metre(1.0), 1.Em)
        assertEquals(myPow * Metre(1.0), 1.exametre)
        assertEquals(1.m.Em , m.value/myPow, EPS)
        assertEquals(1.m.exametre , m.value/myPow, EPS)
        assertEquals(1.Em , Em)
        assertEquals(exametre , Em)
    }    
    
          
    @Test
    fun testMetrePmTest() {
        val myPow = 10.0.pow(15)
        assertEquals(myPow * Metre(1.0), 1.Pm)
        assertEquals(myPow * Metre(1.0), 1.petametre)
        assertEquals(1.m.Pm , m.value/myPow, EPS)
        assertEquals(1.m.petametre , m.value/myPow, EPS)
        assertEquals(1.Pm , Pm)
        assertEquals(petametre , Pm)
    }    
    
          
    @Test
    fun testMetreTmTest() {
        val myPow = 10.0.pow(12)
        assertEquals(myPow * Metre(1.0), 1.Tm)
        assertEquals(myPow * Metre(1.0), 1.terametre)
        assertEquals(1.m.Tm , m.value/myPow, EPS)
        assertEquals(1.m.terametre , m.value/myPow, EPS)
        assertEquals(1.Tm , Tm)
        assertEquals(terametre , Tm)
    }    
    
          
    @Test
    fun testMetreGmTest() {
        val myPow = 10.0.pow(9)
        assertEquals(myPow * Metre(1.0), 1.Gm)
        assertEquals(myPow * Metre(1.0), 1.gigametre)
        assertEquals(1.m.Gm , m.value/myPow, EPS)
        assertEquals(1.m.gigametre , m.value/myPow, EPS)
        assertEquals(1.Gm , Gm)
        assertEquals(gigametre , Gm)
    }    
    
          
    @Test
    fun testMetreMmTest() {
        val myPow = 10.0.pow(6)
        assertEquals(myPow * Metre(1.0), 1.Mm)
        assertEquals(myPow * Metre(1.0), 1.megametre)
        assertEquals(1.m.Mm , m.value/myPow, EPS)
        assertEquals(1.m.megametre , m.value/myPow, EPS)
        assertEquals(1.Mm , Mm)
        assertEquals(megametre , Mm)
    }    
    
          
    @Test
    fun testMetreK1mTest() {
        val myPow = 10.0.pow(3)
        assertEquals(myPow * Metre(1.0), 1.km)
        assertEquals(myPow * Metre(1.0), 1.kilometre)
        assertEquals(1.m.km , m.value/myPow, EPS)
        assertEquals(1.m.kilometre , m.value/myPow, EPS)
        assertEquals(1.km , km)
        assertEquals(kilometre , km)
    }    
    
          
    @Test
    fun testMetreH1mTest() {
        val myPow = 10.0.pow(2)
        assertEquals(myPow * Metre(1.0), 1.hm)
        assertEquals(myPow * Metre(1.0), 1.hectometre)
        assertEquals(1.m.hm , m.value/myPow, EPS)
        assertEquals(1.m.hectometre , m.value/myPow, EPS)
        assertEquals(1.hm , hm)
        assertEquals(hectometre , hm)
    }    
    
          
    @Test
    fun testMetreDA1mTest() {
        val myPow = 10.0.pow(1)
        assertEquals(myPow * Metre(1.0), 1.dam)
        assertEquals(myPow * Metre(1.0), 1.decametre)
        assertEquals(1.m.dam , m.value/myPow, EPS)
        assertEquals(1.m.decametre , m.value/myPow, EPS)
        assertEquals(1.dam , dam)
        assertEquals(decametre , dam)
    }    
    
          
    @Test
    fun testMetreD1mTest() {
        val myPow = 10.0.pow(-1)
        assertEquals(myPow * Metre(1.0), 1.dm)
        assertEquals(myPow * Metre(1.0), 1.decimetre)
        assertEquals(1.m.dm , m.value/myPow, EPS)
        assertEquals(1.m.decimetre , m.value/myPow, EPS)
        assertEquals(1.dm , dm)
        assertEquals(decimetre , dm)
    }    
    
          
    @Test
    fun testMetreC1mTest() {
        val myPow = 10.0.pow(-2)
        assertEquals(myPow * Metre(1.0), 1.cm)
        assertEquals(myPow * Metre(1.0), 1.centimetre)
        assertEquals(1.m.cm , m.value/myPow, EPS)
        assertEquals(1.m.centimetre , m.value/myPow, EPS)
        assertEquals(1.cm , cm)
        assertEquals(centimetre , cm)
    }    
    
          
    @Test
    fun testMetreM1mTest() {
        val myPow = 10.0.pow(-3)
        assertEquals(myPow * Metre(1.0), 1.mm)
        assertEquals(myPow * Metre(1.0), 1.millimetre)
        assertEquals(1.m.mm , m.value/myPow, EPS)
        assertEquals(1.m.millimetre , m.value/myPow, EPS)
        assertEquals(1.mm , mm)
        assertEquals(millimetre , mm)
    }    
    
          
    @Test
    fun testMetreΜ1mTest() {
        val myPow = 10.0.pow(-6)
        assertEquals(myPow * Metre(1.0), 1.μm)
        assertEquals(myPow * Metre(1.0), 1.micrometre)
        assertEquals(1.m.μm , m.value/myPow, EPS)
        assertEquals(1.m.micrometre , m.value/myPow, EPS)
        assertEquals(1.μm , μm)
        assertEquals(micrometre , μm)
    }    
    
          
    @Test
    fun testMetreN1mTest() {
        val myPow = 10.0.pow(-9)
        assertEquals(myPow * Metre(1.0), 1.nm)
        assertEquals(myPow * Metre(1.0), 1.nanometre)
        assertEquals(1.m.nm , m.value/myPow, EPS)
        assertEquals(1.m.nanometre , m.value/myPow, EPS)
        assertEquals(1.nm , nm)
        assertEquals(nanometre , nm)
    }    
    
          
    @Test
    fun testMetreP1mTest() {
        val myPow = 10.0.pow(-12)
        assertEquals(myPow * Metre(1.0), 1.pm)
        assertEquals(myPow * Metre(1.0), 1.picometre)
        assertEquals(1.m.pm , m.value/myPow, EPS)
        assertEquals(1.m.picometre , m.value/myPow, EPS)
        assertEquals(1.pm , pm)
        assertEquals(picometre , pm)
    }    
    
          
    @Test
    fun testMetreF1mTest() {
        val myPow = 10.0.pow(-15)
        assertEquals(myPow * Metre(1.0), 1.fm)
        assertEquals(myPow * Metre(1.0), 1.femtometre)
        assertEquals(1.m.fm , m.value/myPow, EPS)
        assertEquals(1.m.femtometre , m.value/myPow, EPS)
        assertEquals(1.fm , fm)
        assertEquals(femtometre , fm)
    }    
    
          
    @Test
    fun testMetreA1mTest() {
        val myPow = 10.0.pow(-18)
        assertEquals(myPow * Metre(1.0), 1.am)
        assertEquals(myPow * Metre(1.0), 1.attometre)
        assertEquals(1.m.am , m.value/myPow, EPS)
        assertEquals(1.m.attometre , m.value/myPow, EPS)
        assertEquals(1.am , am)
        assertEquals(attometre , am)
    }    
    
          
    @Test
    fun testMetreZ1mTest() {
        val myPow = 10.0.pow(-21)
        assertEquals(myPow * Metre(1.0), 1.zm)
        assertEquals(myPow * Metre(1.0), 1.zeptometre)
        assertEquals(1.m.zm , m.value/myPow, EPS)
        assertEquals(1.m.zeptometre , m.value/myPow, EPS)
        assertEquals(1.zm , zm)
        assertEquals(zeptometre , zm)
    }    
    
          
    @Test
    fun testMetreY1mTest() {
        val myPow = 10.0.pow(-24)
        assertEquals(myPow * Metre(1.0), 1.ym)
        assertEquals(myPow * Metre(1.0), 1.yoctometre)
        assertEquals(1.m.ym , m.value/myPow, EPS)
        assertEquals(1.m.yoctometre , m.value/myPow, EPS)
        assertEquals(1.ym , ym)
        assertEquals(yoctometre , ym)
    }    
    
          
    @Test
    fun testMetreR1mTest() {
        val myPow = 10.0.pow(-27)
        assertEquals(myPow * Metre(1.0), 1.rm)
        assertEquals(myPow * Metre(1.0), 1.rontometre)
        assertEquals(1.m.rm , m.value/myPow, EPS)
        assertEquals(1.m.rontometre , m.value/myPow, EPS)
        assertEquals(1.rm , rm)
        assertEquals(rontometre , rm)
    }    
    
          
    @Test
    fun testMetreQ1mTest() {
        val myPow = 10.0.pow(-30)
        assertEquals(myPow * Metre(1.0), 1.qm)
        assertEquals(myPow * Metre(1.0), 1.quectometre)
        assertEquals(1.m.qm , m.value/myPow, EPS)
        assertEquals(1.m.quectometre , m.value/myPow, EPS)
        assertEquals(1.qm , qm)
        assertEquals(quectometre , qm)
    }    
    }