
package eu.sirotin.kotunil.physics

import eu.sirotin.kotunil.base.km
import eu.sirotin.kotunil.core.DerivedUnit
import eu.sirotin.kotunil.core.div
import eu.sirotin.kotunil.specialunits.h

private val formula =  km/h

/**
* Unit for speed in km/h.
*/
class KmH(value: Number): DerivedUnit(value, formula)

/**
 * Unit 1 km/h.
 */
val kmh = KmH(1.0)

/**
 * Transforms number in km/h.
 */
val Number.kmh : KmH
    get() = KmH(this.toDouble())
