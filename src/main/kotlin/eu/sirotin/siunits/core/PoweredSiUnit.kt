package eu.sirotin.siunits.core


data class PoweredSiUnit(var powerValue: Double = 1.0,
                    val description: SiUnitDescription<*>){
    constructor(siUnit: SiUnit,
                powerValue: Double = 1.0,
                description: SiUnitDescription<*> = siUnit.description) : this(powerValue, description)

}