package eu.sirotin.kotunil.specialunits

import eu.sirotin.kotunil.derived.Joule
import kotlin.js.JsExport
import kotlin.jvm.JvmField
import kotlin.math.pow

/**
 * electron-volt
 */
val Number.eV: Joule
    /**
     * get electron-volt
     */
    get() = Joule(1.602176634 * (10.0.pow(-19)))


/**
 * electron-volt
 */
@JsExport
@JvmField
val eV = 1.eV
