package eu.sirotin.siunits.core

data class SiUnitDescription<T>(val unitName: String,
            val unitSymbol: String,
            val dimensionSymbol: String,
            val quantitySymbol: String,
            val creator: (v : Double) -> T) {
}