

package eu.sirotin.generator

val siPrefixes: List<SiPrefix> = listOf(
    SiPrefix("yotta", "Y", 24),
    SiPrefix("zetta", "Z", 21),
    SiPrefix("exa", "E", 18),
    SiPrefix("peta", "P", 15),
    SiPrefix("tera", "T", 12),
    SiPrefix("giga", "G", 9),
    SiPrefix("mega", "M", 6),
    SiPrefix("kilo", "k", 3),
    SiPrefix("hecto", "h", 2),
    SiPrefix("deca", "da", 1),
    SiPrefix("deci", "d", -1),
    SiPrefix("centi", "c", -2),
    SiPrefix("milli", "m", -3),
    SiPrefix("micro", "μ", -6),
    SiPrefix("nano", "n", -9),
    SiPrefix("pico", "p", -12),
    SiPrefix("femto", "f", -15),
    SiPrefix("atto", "a", -18),
    SiPrefix("zepto", "z", -21),
    SiPrefix("yocto", "y", -24)
)


data class SiPrefix(val name: String, val symbol: String, val degree: Int)