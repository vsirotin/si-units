package eu.sirotin.kotunil.specialunits

import eu.sirotin.kotunil.core.Expression
import kotlin.js.JsExport

/**
 * Percentage
 */
@JsExport
const val percentage = 0.01

/**
 * Percentage
 */
val Number.percentage: Double
    /**
     * get Percentage
     */
  get()  = this.toDouble()*0.01


/**
 * Percentage as double
 */
val Expression.asPercentage : Double
    /**
     * get percentage as double
     */
    get()  = this.value*100.0