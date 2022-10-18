package eu.sirotin.siunits.core

data class DimensionSpecification<T : TermUnit>(val unitName: String,
                                                val unitSymbol: String,
                                                val dimensionSymbol: String,
                                                val quantitySymbol: String,
                                                val presentationPriority: Int = 0,
                                                val creator: (v : Double) -> T) {
}

interface DimensionsPresentation {
    fun units() : String
    fun dimensions(): String
    fun quantities(): String
    fun show(format: String) : String
}