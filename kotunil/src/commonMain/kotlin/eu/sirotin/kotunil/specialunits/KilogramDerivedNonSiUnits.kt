package eu.sirotin.kotunil.specialunits

import eu.sirotin.kotunil.base.Kilogram
import kotlin.js.JsExport
import kotlin.js.JsName
import kotlin.jvm.JvmField
import kotlin.math.pow

/**
 * Creates a gram object
 */
val Number.g: Kilogram
    /**
     * Returns a gram object
     */
    get()  = Kilogram(this.toDouble()*0.001)

/**
 * A gram object
 */
@JsExport
@JsName("g")
@JvmField()
val g = Kilogram(0.001)

/**
 * tonne
 */
@JsExport
@JvmField
val t = Kilogram(1000.0)

/**
 * tonne
 */
val Number.t: Kilogram
    /**
     * get tonne
     */
    get() = Kilogram(this.toDouble()*1000.0)

/**
 * dalton
 */
val Number.Da: Kilogram
    /**
     * get dalton
     */
    get() = Kilogram(this.toDouble() * 1.660539040 * (10.0.pow(-27)))

/**
 * dalton
 */
@JsExport
@JvmField
val Da = 1.Da