        
package eu.sirotin.kotunil.derived

import eu.sirotin.kotunil.app.kotlin.check
import kotlin.math.pow

object CoulombKotlinConsoleTest {

    fun kotlinConsoleTest() {
        check(1.C , C)
              
        val pow30 = 10.0.pow(30)
        check(1.QC.value, C.value*pow30)
        check(1.quettacoulomb.value, C.value*pow30)
        check(1.QC , QC)
        check(quettacoulomb, QC)
          
        val pow27 = 10.0.pow(27)
        check(1.RC.value, C.value*pow27)
        check(1.ronnacoulomb.value, C.value*pow27)
        check(1.RC , RC)
        check(ronnacoulomb, RC)
          
        val pow24 = 10.0.pow(24)
        check(1.YC.value, C.value*pow24)
        check(1.yottacoulomb.value, C.value*pow24)
        check(1.YC , YC)
        check(yottacoulomb, YC)
          
        val pow21 = 10.0.pow(21)
        check(1.ZC.value, C.value*pow21)
        check(1.zettacoulomb.value, C.value*pow21)
        check(1.ZC , ZC)
        check(zettacoulomb, ZC)
          
        val pow18 = 10.0.pow(18)
        check(1.EC.value, C.value*pow18)
        check(1.exacoulomb.value, C.value*pow18)
        check(1.EC , EC)
        check(exacoulomb, EC)
          
        val pow15 = 10.0.pow(15)
        check(1.PC.value, C.value*pow15)
        check(1.petacoulomb.value, C.value*pow15)
        check(1.PC , PC)
        check(petacoulomb, PC)
          
        val pow12 = 10.0.pow(12)
        check(1.TC.value, C.value*pow12)
        check(1.teracoulomb.value, C.value*pow12)
        check(1.TC , TC)
        check(teracoulomb, TC)
          
        val pow9 = 10.0.pow(9)
        check(1.GC.value, C.value*pow9)
        check(1.gigacoulomb.value, C.value*pow9)
        check(1.GC , GC)
        check(gigacoulomb, GC)
          
        val pow6 = 10.0.pow(6)
        check(1.MC.value, C.value*pow6)
        check(1.megacoulomb.value, C.value*pow6)
        check(1.MC , MC)
        check(megacoulomb, MC)
          
        val pow3 = 10.0.pow(3)
        check(1.kC.value, C.value*pow3)
        check(1.kilocoulomb.value, C.value*pow3)
        check(1.kC , kC)
        check(kilocoulomb, kC)
          
        val pow2 = 10.0.pow(2)
        check(1.hC.value, C.value*pow2)
        check(1.hectocoulomb.value, C.value*pow2)
        check(1.hC , hC)
        check(hectocoulomb, hC)
          
        val pow1 = 10.0.pow(1)
        check(1.daC.value, C.value*pow1)
        check(1.decacoulomb.value, C.value*pow1)
        check(1.daC , daC)
        check(decacoulomb, daC)
          
        val powM1 = 10.0.pow(-1)
        check(1.dC.value, C.value*powM1)
        check(1.decicoulomb.value, C.value*powM1)
        check(1.dC , dC)
        check(decicoulomb, dC)
          
        val powM2 = 10.0.pow(-2)
        check(1.cC.value, C.value*powM2)
        check(1.centicoulomb.value, C.value*powM2)
        check(1.cC , cC)
        check(centicoulomb, cC)
          
        val powM3 = 10.0.pow(-3)
        check(1.mC.value, C.value*powM3)
        check(1.millicoulomb.value, C.value*powM3)
        check(1.mC , mC)
        check(millicoulomb, mC)
          
        val powM6 = 10.0.pow(-6)
        check(1.μC.value, C.value*powM6)
        check(1.microcoulomb.value, C.value*powM6)
        check(1.μC , μC)
        check(microcoulomb, μC)
          
        val powM9 = 10.0.pow(-9)
        check(1.nC.value, C.value*powM9)
        check(1.nanocoulomb.value, C.value*powM9)
        check(1.nC , nC)
        check(nanocoulomb, nC)
          
        val powM12 = 10.0.pow(-12)
        check(1.pC.value, C.value*powM12)
        check(1.picocoulomb.value, C.value*powM12)
        check(1.pC , pC)
        check(picocoulomb, pC)
          
        val powM15 = 10.0.pow(-15)
        check(1.fC.value, C.value*powM15)
        check(1.femtocoulomb.value, C.value*powM15)
        check(1.fC , fC)
        check(femtocoulomb, fC)
          
        val powM18 = 10.0.pow(-18)
        check(1.aC.value, C.value*powM18)
        check(1.attocoulomb.value, C.value*powM18)
        check(1.aC , aC)
        check(attocoulomb, aC)
          
        val powM21 = 10.0.pow(-21)
        check(1.zC.value, C.value*powM21)
        check(1.zeptocoulomb.value, C.value*powM21)
        check(1.zC , zC)
        check(zeptocoulomb, zC)
          
        val powM24 = 10.0.pow(-24)
        check(1.yC.value, C.value*powM24)
        check(1.yoctocoulomb.value, C.value*powM24)
        check(1.yC , yC)
        check(yoctocoulomb, yC)
          
        val powM27 = 10.0.pow(-27)
        check(1.rC.value, C.value*powM27)
        check(1.rontocoulomb.value, C.value*powM27)
        check(1.rC , rC)
        check(rontocoulomb, rC)
          
        val powM30 = 10.0.pow(-30)
        check(1.qC.value, C.value*powM30)
        check(1.quectocoulomb.value, C.value*powM30)
        check(1.qC , qC)
        check(quectocoulomb, qC)   }
}