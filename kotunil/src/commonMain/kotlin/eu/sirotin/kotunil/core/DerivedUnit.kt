package eu.sirotin.kotunil.core

abstract class DerivedUnit(value: Number, formula: Expression)
    : Expression(value.toDouble()*formula.value, formula.dimensions)