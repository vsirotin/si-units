        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.app.kotlin.check
import kotlin.math.pow

object LuxKotlinConsoleTest {

    fun kotlinConsoleTest() {
        check(1.lx , lx)
              
        val pow30 = 10.0.pow(30)
        check(1.Qlx.value, lx.value*pow30)
        check(1.quettalux.value, lx.value*pow30)
        check(1.Qlx , Qlx)
        check(quettalux, Qlx)
          
        val pow27 = 10.0.pow(27)
        check(1.Rlx.value, lx.value*pow27)
        check(1.ronnalux.value, lx.value*pow27)
        check(1.Rlx , Rlx)
        check(ronnalux, Rlx)
          
        val pow24 = 10.0.pow(24)
        check(1.Ylx.value, lx.value*pow24)
        check(1.yottalux.value, lx.value*pow24)
        check(1.Ylx , Ylx)
        check(yottalux, Ylx)
          
        val pow21 = 10.0.pow(21)
        check(1.Zlx.value, lx.value*pow21)
        check(1.zettalux.value, lx.value*pow21)
        check(1.Zlx , Zlx)
        check(zettalux, Zlx)
          
        val pow18 = 10.0.pow(18)
        check(1.Elx.value, lx.value*pow18)
        check(1.exalux.value, lx.value*pow18)
        check(1.Elx , Elx)
        check(exalux, Elx)
          
        val pow15 = 10.0.pow(15)
        check(1.Plx.value, lx.value*pow15)
        check(1.petalux.value, lx.value*pow15)
        check(1.Plx , Plx)
        check(petalux, Plx)
          
        val pow12 = 10.0.pow(12)
        check(1.Tlx.value, lx.value*pow12)
        check(1.teralux.value, lx.value*pow12)
        check(1.Tlx , Tlx)
        check(teralux, Tlx)
          
        val pow9 = 10.0.pow(9)
        check(1.Glx.value, lx.value*pow9)
        check(1.gigalux.value, lx.value*pow9)
        check(1.Glx , Glx)
        check(gigalux, Glx)
          
        val pow6 = 10.0.pow(6)
        check(1.Mlx.value, lx.value*pow6)
        check(1.megalux.value, lx.value*pow6)
        check(1.Mlx , Mlx)
        check(megalux, Mlx)
          
        val pow3 = 10.0.pow(3)
        check(1.klx.value, lx.value*pow3)
        check(1.kilolux.value, lx.value*pow3)
        check(1.klx , klx)
        check(kilolux, klx)
          
        val pow2 = 10.0.pow(2)
        check(1.hlx.value, lx.value*pow2)
        check(1.hectolux.value, lx.value*pow2)
        check(1.hlx , hlx)
        check(hectolux, hlx)
          
        val pow1 = 10.0.pow(1)
        check(1.dalx.value, lx.value*pow1)
        check(1.decalux.value, lx.value*pow1)
        check(1.dalx , dalx)
        check(decalux, dalx)
          
        val powM1 = 10.0.pow(-1)
        check(1.dlx.value, lx.value*powM1)
        check(1.decilux.value, lx.value*powM1)
        check(1.dlx , dlx)
        check(decilux, dlx)
          
        val powM2 = 10.0.pow(-2)
        check(1.clx.value, lx.value*powM2)
        check(1.centilux.value, lx.value*powM2)
        check(1.clx , clx)
        check(centilux, clx)
          
        val powM3 = 10.0.pow(-3)
        check(1.mlx.value, lx.value*powM3)
        check(1.millilux.value, lx.value*powM3)
        check(1.mlx , mlx)
        check(millilux, mlx)
          
        val powM6 = 10.0.pow(-6)
        check(1.μlx.value, lx.value*powM6)
        check(1.microlux.value, lx.value*powM6)
        check(1.μlx , μlx)
        check(microlux, μlx)
          
        val powM9 = 10.0.pow(-9)
        check(1.nlx.value, lx.value*powM9)
        check(1.nanolux.value, lx.value*powM9)
        check(1.nlx , nlx)
        check(nanolux, nlx)
          
        val powM12 = 10.0.pow(-12)
        check(1.plx.value, lx.value*powM12)
        check(1.picolux.value, lx.value*powM12)
        check(1.plx , plx)
        check(picolux, plx)
          
        val powM15 = 10.0.pow(-15)
        check(1.flx.value, lx.value*powM15)
        check(1.femtolux.value, lx.value*powM15)
        check(1.flx , flx)
        check(femtolux, flx)
          
        val powM18 = 10.0.pow(-18)
        check(1.alx.value, lx.value*powM18)
        check(1.attolux.value, lx.value*powM18)
        check(1.alx , alx)
        check(attolux, alx)
          
        val powM21 = 10.0.pow(-21)
        check(1.zlx.value, lx.value*powM21)
        check(1.zeptolux.value, lx.value*powM21)
        check(1.zlx , zlx)
        check(zeptolux, zlx)
          
        val powM24 = 10.0.pow(-24)
        check(1.ylx.value, lx.value*powM24)
        check(1.yoctolux.value, lx.value*powM24)
        check(1.ylx , ylx)
        check(yoctolux, ylx)
          
        val powM27 = 10.0.pow(-27)
        check(1.rlx.value, lx.value*powM27)
        check(1.rontolux.value, lx.value*powM27)
        check(1.rlx , rlx)
        check(rontolux, rlx)
          
        val powM30 = 10.0.pow(-30)
        check(1.qlx.value, lx.value*powM30)
        check(1.quectolux.value, lx.value*powM30)
        check(1.qlx , qlx)
        check(quectolux, qlx)   }
}