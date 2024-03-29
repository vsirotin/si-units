        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.app.kotlin.check
import kotlin.math.pow

object LumenKotlinConsoleTest {

    fun kotlinConsoleTest() {
        check(1.lm , lm)
              
        val pow30 = 10.0.pow(30)
        check(1.Qlm.value, lm.value*pow30)
        check(1.quettalumen.value, lm.value*pow30)
        check(1.Qlm , Qlm)
        check(quettalumen, Qlm)
          
        val pow27 = 10.0.pow(27)
        check(1.Rlm.value, lm.value*pow27)
        check(1.ronnalumen.value, lm.value*pow27)
        check(1.Rlm , Rlm)
        check(ronnalumen, Rlm)
          
        val pow24 = 10.0.pow(24)
        check(1.Ylm.value, lm.value*pow24)
        check(1.yottalumen.value, lm.value*pow24)
        check(1.Ylm , Ylm)
        check(yottalumen, Ylm)
          
        val pow21 = 10.0.pow(21)
        check(1.Zlm.value, lm.value*pow21)
        check(1.zettalumen.value, lm.value*pow21)
        check(1.Zlm , Zlm)
        check(zettalumen, Zlm)
          
        val pow18 = 10.0.pow(18)
        check(1.Elm.value, lm.value*pow18)
        check(1.exalumen.value, lm.value*pow18)
        check(1.Elm , Elm)
        check(exalumen, Elm)
          
        val pow15 = 10.0.pow(15)
        check(1.Plm.value, lm.value*pow15)
        check(1.petalumen.value, lm.value*pow15)
        check(1.Plm , Plm)
        check(petalumen, Plm)
          
        val pow12 = 10.0.pow(12)
        check(1.Tlm.value, lm.value*pow12)
        check(1.teralumen.value, lm.value*pow12)
        check(1.Tlm , Tlm)
        check(teralumen, Tlm)
          
        val pow9 = 10.0.pow(9)
        check(1.Glm.value, lm.value*pow9)
        check(1.gigalumen.value, lm.value*pow9)
        check(1.Glm , Glm)
        check(gigalumen, Glm)
          
        val pow6 = 10.0.pow(6)
        check(1.Mlm.value, lm.value*pow6)
        check(1.megalumen.value, lm.value*pow6)
        check(1.Mlm , Mlm)
        check(megalumen, Mlm)
          
        val pow3 = 10.0.pow(3)
        check(1.klm.value, lm.value*pow3)
        check(1.kilolumen.value, lm.value*pow3)
        check(1.klm , klm)
        check(kilolumen, klm)
          
        val pow2 = 10.0.pow(2)
        check(1.hlm.value, lm.value*pow2)
        check(1.hectolumen.value, lm.value*pow2)
        check(1.hlm , hlm)
        check(hectolumen, hlm)
          
        val pow1 = 10.0.pow(1)
        check(1.dalm.value, lm.value*pow1)
        check(1.decalumen.value, lm.value*pow1)
        check(1.dalm , dalm)
        check(decalumen, dalm)
          
        val powM1 = 10.0.pow(-1)
        check(1.dlm.value, lm.value*powM1)
        check(1.decilumen.value, lm.value*powM1)
        check(1.dlm , dlm)
        check(decilumen, dlm)
          
        val powM2 = 10.0.pow(-2)
        check(1.clm.value, lm.value*powM2)
        check(1.centilumen.value, lm.value*powM2)
        check(1.clm , clm)
        check(centilumen, clm)
          
        val powM3 = 10.0.pow(-3)
        check(1.mlm.value, lm.value*powM3)
        check(1.millilumen.value, lm.value*powM3)
        check(1.mlm , mlm)
        check(millilumen, mlm)
          
        val powM6 = 10.0.pow(-6)
        check(1.μlm.value, lm.value*powM6)
        check(1.microlumen.value, lm.value*powM6)
        check(1.μlm , μlm)
        check(microlumen, μlm)
          
        val powM9 = 10.0.pow(-9)
        check(1.nlm.value, lm.value*powM9)
        check(1.nanolumen.value, lm.value*powM9)
        check(1.nlm , nlm)
        check(nanolumen, nlm)
          
        val powM12 = 10.0.pow(-12)
        check(1.plm.value, lm.value*powM12)
        check(1.picolumen.value, lm.value*powM12)
        check(1.plm , plm)
        check(picolumen, plm)
          
        val powM15 = 10.0.pow(-15)
        check(1.flm.value, lm.value*powM15)
        check(1.femtolumen.value, lm.value*powM15)
        check(1.flm , flm)
        check(femtolumen, flm)
          
        val powM18 = 10.0.pow(-18)
        check(1.alm.value, lm.value*powM18)
        check(1.attolumen.value, lm.value*powM18)
        check(1.alm , alm)
        check(attolumen, alm)
          
        val powM21 = 10.0.pow(-21)
        check(1.zlm.value, lm.value*powM21)
        check(1.zeptolumen.value, lm.value*powM21)
        check(1.zlm , zlm)
        check(zeptolumen, zlm)
          
        val powM24 = 10.0.pow(-24)
        check(1.ylm.value, lm.value*powM24)
        check(1.yoctolumen.value, lm.value*powM24)
        check(1.ylm , ylm)
        check(yoctolumen, ylm)
          
        val powM27 = 10.0.pow(-27)
        check(1.rlm.value, lm.value*powM27)
        check(1.rontolumen.value, lm.value*powM27)
        check(1.rlm , rlm)
        check(rontolumen, rlm)
          
        val powM30 = 10.0.pow(-30)
        check(1.qlm.value, lm.value*powM30)
        check(1.quectolumen.value, lm.value*powM30)
        check(1.qlm , qlm)
        check(quectolumen, qlm)   }
}