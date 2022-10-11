package eu.sirotin.siunits.core
//
//private val descriptionA = SiUnitDescription("a", "a", "A", "a-unit")
//class A(value: Double) : SiUnit(value, descriptionA){
//
////    override val symbol: String
////        get() = "a"
////
////    override fun <T : SiUnit> newInstance(value: Double): T {
////        @Suppress("UNCHECKED_CAST")
////        return A(value) as T
////    }
//
//}
//val Number.a : A
//    get() = A(this.toDouble())
//
//
//operator fun A.plus(x: A): A = A(this.value + x.value)
//operator fun A.minus(x: A): A = A(this.value - x.value)
//
//operator fun A.unaryPlus(): A = A(this.value)
//operator fun A.unaryMinus(): A = A(-this.value)