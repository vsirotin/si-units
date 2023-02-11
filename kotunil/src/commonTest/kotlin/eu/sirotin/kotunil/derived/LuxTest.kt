        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.EPS
import kotlin.test.assertEquals
import kotlin.test.Test
import kotlin.math.pow

internal class LuxTest {

    @Test
    fun testLuxMainTest() {
        assertEquals(1.lx , lx)
    }
              
    @Test
    fun testLuxQlxTest() {
        val myPow = 10.0.pow(30)
        assertEquals(1.Qlx.value, lx.value*myPow, EPS)
        assertEquals(1.quettalux.value, lx.value*myPow)
        assertEquals(1.Qlx , Qlx)
        assertEquals(quettalux, Qlx)
    }    
    
          
    @Test
    fun testLuxRlxTest() {
        val myPow = 10.0.pow(27)
        assertEquals(1.Rlx.value, lx.value*myPow, EPS)
        assertEquals(1.ronnalux.value, lx.value*myPow)
        assertEquals(1.Rlx , Rlx)
        assertEquals(ronnalux, Rlx)
    }    
    
          
    @Test
    fun testLuxYlxTest() {
        val myPow = 10.0.pow(24)
        assertEquals(1.Ylx.value, lx.value*myPow, EPS)
        assertEquals(1.yottalux.value, lx.value*myPow)
        assertEquals(1.Ylx , Ylx)
        assertEquals(yottalux, Ylx)
    }    
    
          
    @Test
    fun testLuxZlxTest() {
        val myPow = 10.0.pow(21)
        assertEquals(1.Zlx.value, lx.value*myPow, EPS)
        assertEquals(1.zettalux.value, lx.value*myPow)
        assertEquals(1.Zlx , Zlx)
        assertEquals(zettalux, Zlx)
    }    
    
          
    @Test
    fun testLuxElxTest() {
        val myPow = 10.0.pow(18)
        assertEquals(1.Elx.value, lx.value*myPow, EPS)
        assertEquals(1.exalux.value, lx.value*myPow)
        assertEquals(1.Elx , Elx)
        assertEquals(exalux, Elx)
    }    
    
          
    @Test
    fun testLuxPlxTest() {
        val myPow = 10.0.pow(15)
        assertEquals(1.Plx.value, lx.value*myPow, EPS)
        assertEquals(1.petalux.value, lx.value*myPow)
        assertEquals(1.Plx , Plx)
        assertEquals(petalux, Plx)
    }    
    
          
    @Test
    fun testLuxTlxTest() {
        val myPow = 10.0.pow(12)
        assertEquals(1.Tlx.value, lx.value*myPow, EPS)
        assertEquals(1.teralux.value, lx.value*myPow)
        assertEquals(1.Tlx , Tlx)
        assertEquals(teralux, Tlx)
    }    
    
          
    @Test
    fun testLuxGlxTest() {
        val myPow = 10.0.pow(9)
        assertEquals(1.Glx.value, lx.value*myPow, EPS)
        assertEquals(1.gigalux.value, lx.value*myPow)
        assertEquals(1.Glx , Glx)
        assertEquals(gigalux, Glx)
    }    
    
          
    @Test
    fun testLuxMlxTest() {
        val myPow = 10.0.pow(6)
        assertEquals(1.Mlx.value, lx.value*myPow, EPS)
        assertEquals(1.megalux.value, lx.value*myPow)
        assertEquals(1.Mlx , Mlx)
        assertEquals(megalux, Mlx)
    }    
    
          
    @Test
    fun testLuxK1lxTest() {
        val myPow = 10.0.pow(3)
        assertEquals(1.klx.value, lx.value*myPow, EPS)
        assertEquals(1.kilolux.value, lx.value*myPow)
        assertEquals(1.klx , klx)
        assertEquals(kilolux, klx)
    }    
    
          
    @Test
    fun testLuxH1lxTest() {
        val myPow = 10.0.pow(2)
        assertEquals(1.hlx.value, lx.value*myPow, EPS)
        assertEquals(1.hectolux.value, lx.value*myPow)
        assertEquals(1.hlx , hlx)
        assertEquals(hectolux, hlx)
    }    
    
          
    @Test
    fun testLuxDA1lxTest() {
        val myPow = 10.0.pow(1)
        assertEquals(1.dalx.value, lx.value*myPow, EPS)
        assertEquals(1.decalux.value, lx.value*myPow)
        assertEquals(1.dalx , dalx)
        assertEquals(decalux, dalx)
    }    
    
          
    @Test
    fun testLuxD1lxTest() {
        val myPow = 10.0.pow(-1)
        assertEquals(1.dlx.value, lx.value*myPow, EPS)
        assertEquals(1.decilux.value, lx.value*myPow)
        assertEquals(1.dlx , dlx)
        assertEquals(decilux, dlx)
    }    
    
          
    @Test
    fun testLuxC1lxTest() {
        val myPow = 10.0.pow(-2)
        assertEquals(1.clx.value, lx.value*myPow, EPS)
        assertEquals(1.centilux.value, lx.value*myPow)
        assertEquals(1.clx , clx)
        assertEquals(centilux, clx)
    }    
    
          
    @Test
    fun testLuxM1lxTest() {
        val myPow = 10.0.pow(-3)
        assertEquals(1.mlx.value, lx.value*myPow, EPS)
        assertEquals(1.millilux.value, lx.value*myPow)
        assertEquals(1.mlx , mlx)
        assertEquals(millilux, mlx)
    }    
    
          
    @Test
    fun testLuxΜ1lxTest() {
        val myPow = 10.0.pow(-6)
        assertEquals(1.μlx.value, lx.value*myPow, EPS)
        assertEquals(1.microlux.value, lx.value*myPow)
        assertEquals(1.μlx , μlx)
        assertEquals(microlux, μlx)
    }    
    
          
    @Test
    fun testLuxN1lxTest() {
        val myPow = 10.0.pow(-9)
        assertEquals(1.nlx.value, lx.value*myPow, EPS)
        assertEquals(1.nanolux.value, lx.value*myPow)
        assertEquals(1.nlx , nlx)
        assertEquals(nanolux, nlx)
    }    
    
          
    @Test
    fun testLuxP1lxTest() {
        val myPow = 10.0.pow(-12)
        assertEquals(1.plx.value, lx.value*myPow, EPS)
        assertEquals(1.picolux.value, lx.value*myPow)
        assertEquals(1.plx , plx)
        assertEquals(picolux, plx)
    }    
    
          
    @Test
    fun testLuxF1lxTest() {
        val myPow = 10.0.pow(-15)
        assertEquals(1.flx.value, lx.value*myPow, EPS)
        assertEquals(1.femtolux.value, lx.value*myPow)
        assertEquals(1.flx , flx)
        assertEquals(femtolux, flx)
    }    
    
          
    @Test
    fun testLuxA1lxTest() {
        val myPow = 10.0.pow(-18)
        assertEquals(1.alx.value, lx.value*myPow, EPS)
        assertEquals(1.attolux.value, lx.value*myPow)
        assertEquals(1.alx , alx)
        assertEquals(attolux, alx)
    }    
    
          
    @Test
    fun testLuxZ1lxTest() {
        val myPow = 10.0.pow(-21)
        assertEquals(1.zlx.value, lx.value*myPow, EPS)
        assertEquals(1.zeptolux.value, lx.value*myPow)
        assertEquals(1.zlx , zlx)
        assertEquals(zeptolux, zlx)
    }    
    
          
    @Test
    fun testLuxY1lxTest() {
        val myPow = 10.0.pow(-24)
        assertEquals(1.ylx.value, lx.value*myPow, EPS)
        assertEquals(1.yoctolux.value, lx.value*myPow)
        assertEquals(1.ylx , ylx)
        assertEquals(yoctolux, ylx)
    }    
    
          
    @Test
    fun testLuxR1lxTest() {
        val myPow = 10.0.pow(-27)
        assertEquals(1.rlx.value, lx.value*myPow, EPS)
        assertEquals(1.rontolux.value, lx.value*myPow)
        assertEquals(1.rlx , rlx)
        assertEquals(rontolux, rlx)
    }    
    
          
    @Test
    fun testLuxQ1lxTest() {
        val myPow = 10.0.pow(-30)
        assertEquals(1.qlx.value, lx.value*myPow, EPS)
        assertEquals(1.quectolux.value, lx.value*myPow)
        assertEquals(1.qlx , qlx)
        assertEquals(quectolux, qlx)
    }    
    }