(function (root, factory) {
  if (typeof define === 'function' && define.amd)
    define(['exports', './kotlin-kotlin-stdlib-js-ir.js'], factory);
  else if (typeof exports === 'object')
    factory(module.exports, require('./kotlin-kotlin-stdlib-js-ir.js'));
  else {
    if (typeof this['kotlin-kotlin-stdlib-js-ir'] === 'undefined') {
      throw new Error("Error loading module 'si-units-kotunil'. Its dependency 'kotlin-kotlin-stdlib-js-ir' was not found. Please, check whether 'kotlin-kotlin-stdlib-js-ir' is loaded prior to 'si-units-kotunil'.");
    }
    root['si-units-kotunil'] = factory(typeof this['si-units-kotunil'] === 'undefined' ? {} : this['si-units-kotunil'], this['kotlin-kotlin-stdlib-js-ir']);
  }
}(this, function (_, kotlin_kotlin) {
  'use strict';
  //region block: imports
  var imul = Math.imul;
  var numberToInt = kotlin_kotlin.$_$.t;
  var IllegalArgumentException_init_$Create$ = kotlin_kotlin.$_$.d;
  var sorted = kotlin_kotlin.$_$.j;
  var ArrayList_init_$Create$ = kotlin_kotlin.$_$.c;
  var Unit_getInstance = kotlin_kotlin.$_$.e;
  var charSequenceLength = kotlin_kotlin.$_$.l;
  var joinToString$default = kotlin_kotlin.$_$.a;
  var hashCode = kotlin_kotlin.$_$.r;
  var THROW_CCE = kotlin_kotlin.$_$.w;
  var equals = kotlin_kotlin.$_$.o;
  var classMeta = kotlin_kotlin.$_$.m;
  var setMetadataFor = kotlin_kotlin.$_$.u;
  var compareTo = kotlin_kotlin.$_$.n;
  var getNumberHashCode = kotlin_kotlin.$_$.p;
  var Comparable = kotlin_kotlin.$_$.v;
  var toSet = kotlin_kotlin.$_$.k;
  var collectionSizeOrDefault = kotlin_kotlin.$_$.f;
  var ArrayList_init_$Create$_0 = kotlin_kotlin.$_$.b;
  var intersect = kotlin_kotlin.$_$.g;
  var plus = kotlin_kotlin.$_$.h;
  var numberToDouble = kotlin_kotlin.$_$.s;
  var ensureNotNull = kotlin_kotlin.$_$.x;
  var setOf = kotlin_kotlin.$_$.i;
  var getStringHashCode = kotlin_kotlin.$_$.q;
  //endregion
  //region block: pre-declaration
  setMetadataFor(Dimensions, 'Dimensions', classMeta, undefined, undefined, undefined, undefined, []);
  setMetadataFor(Factor, 'Factor', classMeta, undefined, [Comparable], undefined, undefined, []);
  setMetadataFor(Expression, 'Expression', classMeta, undefined, [Comparable], undefined, undefined, []);
  setMetadataFor(UnitSpecification, 'UnitSpecification', classMeta, undefined, undefined, undefined, undefined, []);
  setMetadataFor(Thing, 'Thing', classMeta, Expression, undefined, undefined, undefined, []);
  //endregion
  function dimOf($this, p, invert) {
    var pv = invert ? -p.v5_1 : p.v5_1;
    return p.u5_1.w5_1 + tryFormatToIntNotOne($this, pv);
  }
  function dimOf$default($this, p, invert, $mask0, $handler) {
    if (!(($mask0 & 4) === 0))
      invert = false;
    return dimOf($this, p, invert);
  }
  function tryFormatToIntNotOne($this, v) {
    if (roundedToInt(v)) {
      var r = numberToInt(v);
      return r === 1 ? '' : r.toString();
    }
    return v.toString();
  }
  function Dimensions$categorySymbols$lambda(this$0) {
    return function (it) {
      return it.u5_1.x5_1 + tryFormatToIntNotOne(this$0, it.v5_1);
    };
  }
  function Dimensions(factors) {
    this.a6_1 = factors;
  }
  Dimensions.prototype.b6 = function (other) {
    if (!(this.c6() === other.c6()))
      throw IllegalArgumentException_init_$Create$(get_COMPATIBILITY_ERR_PREFIX() + " '" + this.c6() + "' and '" + other.c6() + "'");
  };
  Dimensions.prototype.c6 = function () {
    var top = '';
    // Inline function 'kotlin.collections.forEach' call
    var tmp$ret$2;
    // Inline function 'kotlin.collections.filter' call
    var tmp0_filter = sorted(this.a6_1);
    var tmp$ret$1;
    // Inline function 'kotlin.collections.filterTo' call
    var tmp0_filterTo = ArrayList_init_$Create$();
    var tmp0_iterator = tmp0_filter.d();
    while (tmp0_iterator.g()) {
      var element = tmp0_iterator.e();
      var tmp$ret$0;
      // Inline function 'eu.sirotin.kotunil.core.Dimensions.unitSymbols.<anonymous>' call
      tmp$ret$0 = element.v5_1 > 0.0;
      if (tmp$ret$0) {
        tmp0_filterTo.a(element);
      }
    }
    tmp$ret$1 = tmp0_filterTo;
    tmp$ret$2 = tmp$ret$1;
    var tmp1_forEach = tmp$ret$2;
    var tmp0_iterator_0 = tmp1_forEach.d();
    while (tmp0_iterator_0.g()) {
      var element_0 = tmp0_iterator_0.e();
      // Inline function 'eu.sirotin.kotunil.core.Dimensions.unitSymbols.<anonymous>' call
      var tmp = top;
      top = tmp + dimOf$default(this, element_0, false, 4, null);
    }
    var down = '';
    // Inline function 'kotlin.collections.forEach' call
    var tmp$ret$5;
    // Inline function 'kotlin.collections.filter' call
    var tmp2_filter = sorted(this.a6_1);
    var tmp$ret$4;
    // Inline function 'kotlin.collections.filterTo' call
    var tmp0_filterTo_0 = ArrayList_init_$Create$();
    var tmp0_iterator_1 = tmp2_filter.d();
    while (tmp0_iterator_1.g()) {
      var element_1 = tmp0_iterator_1.e();
      var tmp$ret$3;
      // Inline function 'eu.sirotin.kotunil.core.Dimensions.unitSymbols.<anonymous>' call
      tmp$ret$3 = element_1.v5_1 < 0.0;
      if (tmp$ret$3) {
        tmp0_filterTo_0.a(element_1);
      }
    }
    tmp$ret$4 = tmp0_filterTo_0;
    tmp$ret$5 = tmp$ret$4;
    var tmp3_forEach = tmp$ret$5;
    var tmp0_iterator_2 = tmp3_forEach.d();
    while (tmp0_iterator_2.g()) {
      var element_2 = tmp0_iterator_2.e();
      // Inline function 'eu.sirotin.kotunil.core.Dimensions.unitSymbols.<anonymous>' call
      down = down + dimOf(this, element_2, true);
    }
    var tmp_0;
    var tmp$ret$6;
    // Inline function 'kotlin.text.isEmpty' call
    var tmp4_isEmpty = top;
    tmp$ret$6 = charSequenceLength(tmp4_isEmpty) === 0;
    if (tmp$ret$6) {
      var tmp$ret$7;
      // Inline function 'kotlin.text.isNotEmpty' call
      var tmp5_isNotEmpty = down;
      tmp$ret$7 = charSequenceLength(tmp5_isNotEmpty) > 0;
      tmp_0 = tmp$ret$7;
    } else {
      tmp_0 = false;
    }
    if (tmp_0)
      top = '1';
    var tmp_1;
    var tmp$ret$8;
    // Inline function 'kotlin.text.isEmpty' call
    var tmp6_isEmpty = down;
    tmp$ret$8 = charSequenceLength(tmp6_isEmpty) === 0;
    if (tmp$ret$8) {
      tmp_1 = '';
    } else {
      tmp_1 = '/';
    }
    var mid = tmp_1;
    return top + mid + down;
  };
  Dimensions.prototype.d6 = function () {
    var tmp = sorted(this.a6_1);
    return joinToString$default(tmp, '', null, null, 0, null, Dimensions$categorySymbols$lambda(this), 30, null);
  };
  Dimensions.prototype.toString = function () {
    return 'Dimensions(factors=' + this.a6_1 + ')';
  };
  Dimensions.prototype.hashCode = function () {
    return hashCode(this.a6_1);
  };
  Dimensions.prototype.equals = function (other) {
    if (this === other)
      return true;
    if (!(other instanceof Dimensions))
      return false;
    var tmp0_other_with_cast = other instanceof Dimensions ? other : THROW_CCE();
    if (!equals(this.a6_1, tmp0_other_with_cast.a6_1))
      return false;
    return true;
  };
  function Factor_init_$Init$(specification, powerValue, $mask0, $marker, $this) {
    if (!(($mask0 & 2) === 0))
      powerValue = 1.0;
    Factor.call($this, specification, powerValue);
    return $this;
  }
  function Factor_init_$Create$(specification, powerValue, $mask0, $marker) {
    return Factor_init_$Init$(specification, powerValue, $mask0, $marker, Object.create(Factor.prototype));
  }
  function Factor(specification, powerValue) {
    this.u5_1 = specification;
    this.v5_1 = powerValue;
  }
  Factor.prototype.e6 = function (other) {
    return -compareTo(this.u5_1.y5_1, other.u5_1.y5_1) | 0;
  };
  Factor.prototype.t1 = function (other) {
    return this.e6(other instanceof Factor ? other : THROW_CCE());
  };
  Factor.prototype.toString = function () {
    return 'Factor(specification=' + this.u5_1 + ', powerValue=' + this.v5_1 + ')';
  };
  Factor.prototype.hashCode = function () {
    var result = this.u5_1.hashCode();
    result = imul(result, 31) + getNumberHashCode(this.v5_1) | 0;
    return result;
  };
  Factor.prototype.equals = function (other) {
    if (this === other)
      return true;
    if (!(other instanceof Factor))
      return false;
    var tmp0_other_with_cast = other instanceof Factor ? other : THROW_CCE();
    if (!this.u5_1.equals(tmp0_other_with_cast.u5_1))
      return false;
    if (!equals(this.v5_1, tmp0_other_with_cast.v5_1))
      return false;
    return true;
  };
  function plus_0(_this__u8e3s4, other) {
    _this__u8e3s4.b6(other);
    return new Dimensions(toSet(_this__u8e3s4.a6_1));
  }
  function times(_this__u8e3s4, other) {
    var tmp$ret$2;
    // Inline function 'kotlin.collections.map' call
    var tmp0_map = _this__u8e3s4.a6_1;
    var tmp$ret$1;
    // Inline function 'kotlin.collections.mapTo' call
    var tmp0_mapTo = ArrayList_init_$Create$_0(collectionSizeOrDefault(tmp0_map, 10));
    var tmp0_iterator = tmp0_map.d();
    while (tmp0_iterator.g()) {
      var item = tmp0_iterator.e();
      var tmp$ret$0;
      // Inline function 'eu.sirotin.kotunil.core.times.<anonymous>' call
      tmp$ret$0 = item.u5_1.x5_1;
      tmp0_mapTo.a(tmp$ret$0);
    }
    tmp$ret$1 = tmp0_mapTo;
    tmp$ret$2 = tmp$ret$1;
    var thisDimensionSymbols = toSet(tmp$ret$2);
    var tmp$ret$5;
    // Inline function 'kotlin.collections.map' call
    var tmp1_map = other.a6_1;
    var tmp$ret$4;
    // Inline function 'kotlin.collections.mapTo' call
    var tmp0_mapTo_0 = ArrayList_init_$Create$_0(collectionSizeOrDefault(tmp1_map, 10));
    var tmp0_iterator_0 = tmp1_map.d();
    while (tmp0_iterator_0.g()) {
      var item_0 = tmp0_iterator_0.e();
      var tmp$ret$3;
      // Inline function 'eu.sirotin.kotunil.core.times.<anonymous>' call
      tmp$ret$3 = item_0.u5_1.x5_1;
      tmp0_mapTo_0.a(tmp$ret$3);
    }
    tmp$ret$4 = tmp0_mapTo_0;
    tmp$ret$5 = tmp$ret$4;
    var otherDimensionSymbols = toSet(tmp$ret$5);
    var commonDimensionSymbols = intersect(thisDimensionSymbols, otherDimensionSymbols);
    var tmp$ret$8;
    // Inline function 'kotlin.collections.filter' call
    var tmp2_filter = _this__u8e3s4.a6_1;
    var tmp$ret$7;
    // Inline function 'kotlin.collections.filterTo' call
    var tmp0_filterTo = ArrayList_init_$Create$();
    var tmp0_iterator_1 = tmp2_filter.d();
    while (tmp0_iterator_1.g()) {
      var element = tmp0_iterator_1.e();
      var tmp$ret$6;
      // Inline function 'eu.sirotin.kotunil.core.times.<anonymous>' call
      tmp$ret$6 = commonDimensionSymbols.i(element.u5_1.x5_1);
      if (tmp$ret$6) {
        tmp0_filterTo.a(element);
      }
    }
    tmp$ret$7 = tmp0_filterTo;
    tmp$ret$8 = tmp$ret$7;
    var commonFactors = toSet(tmp$ret$8);
    var tmp$ret$12;
    // Inline function 'kotlin.collections.mapNotNull' call
    var tmp$ret$11;
    // Inline function 'kotlin.collections.mapNotNullTo' call
    var tmp0_mapNotNullTo = ArrayList_init_$Create$();
    // Inline function 'kotlin.collections.forEach' call
    var tmp0_iterator_2 = commonFactors.d();
    while (tmp0_iterator_2.g()) {
      var element_0 = tmp0_iterator_2.e();
      // Inline function 'kotlin.collections.mapNotNullTo.<anonymous>' call
      var tmp$ret$9;
      // Inline function 'eu.sirotin.kotunil.core.times.<anonymous>' call
      tmp$ret$9 = plusCommonFactors(element_0, _this__u8e3s4.a6_1, other.a6_1);
      var tmp0_safe_receiver = tmp$ret$9;
      if (tmp0_safe_receiver == null)
        null;
      else {
        var tmp$ret$10;
        // Inline function 'kotlin.let' call
        // Inline function 'kotlin.contracts.contract' call
        tmp0_mapNotNullTo.a(tmp0_safe_receiver);
        tmp$ret$10 = Unit_getInstance();
      }
    }
    tmp$ret$11 = tmp0_mapNotNullTo;
    tmp$ret$12 = tmp$ret$11;
    var newCommonFactors = toSet(tmp$ret$12);
    var tmp$ret$15;
    // Inline function 'kotlin.collections.filter' call
    var tmp3_filter = _this__u8e3s4.a6_1;
    var tmp$ret$14;
    // Inline function 'kotlin.collections.filterTo' call
    var tmp0_filterTo_0 = ArrayList_init_$Create$();
    var tmp0_iterator_3 = tmp3_filter.d();
    while (tmp0_iterator_3.g()) {
      var element_1 = tmp0_iterator_3.e();
      var tmp$ret$13;
      // Inline function 'eu.sirotin.kotunil.core.times.<anonymous>' call
      tmp$ret$13 = !commonDimensionSymbols.i(element_1.u5_1.x5_1);
      if (tmp$ret$13) {
        tmp0_filterTo_0.a(element_1);
      }
    }
    tmp$ret$14 = tmp0_filterTo_0;
    tmp$ret$15 = tmp$ret$14;
    var restThisFactors = toSet(tmp$ret$15);
    var tmp$ret$18;
    // Inline function 'kotlin.collections.filter' call
    var tmp4_filter = other.a6_1;
    var tmp$ret$17;
    // Inline function 'kotlin.collections.filterTo' call
    var tmp0_filterTo_1 = ArrayList_init_$Create$();
    var tmp0_iterator_4 = tmp4_filter.d();
    while (tmp0_iterator_4.g()) {
      var element_2 = tmp0_iterator_4.e();
      var tmp$ret$16;
      // Inline function 'eu.sirotin.kotunil.core.times.<anonymous>' call
      tmp$ret$16 = !commonDimensionSymbols.i(element_2.u5_1.x5_1);
      if (tmp$ret$16) {
        tmp0_filterTo_1.a(element_2);
      }
    }
    tmp$ret$17 = tmp0_filterTo_1;
    tmp$ret$18 = tmp$ret$17;
    var restOtherFactors = toSet(tmp$ret$18);
    var newFactors = plus(plus(newCommonFactors, restThisFactors), restOtherFactors);
    return new Dimensions(newFactors);
  }
  function pow(_this__u8e3s4, degree) {
    var tmp$ret$2;
    // Inline function 'kotlin.collections.map' call
    var tmp0_map = _this__u8e3s4.a6_1;
    var tmp$ret$1;
    // Inline function 'kotlin.collections.mapTo' call
    var tmp0_mapTo = ArrayList_init_$Create$_0(collectionSizeOrDefault(tmp0_map, 10));
    var tmp0_iterator = tmp0_map.d();
    while (tmp0_iterator.g()) {
      var item = tmp0_iterator.e();
      var tmp$ret$0;
      // Inline function 'eu.sirotin.kotunil.core.pow.<anonymous>' call
      tmp$ret$0 = new Factor(item.u5_1, item.v5_1 * numberToDouble(degree));
      tmp0_mapTo.a(tmp$ret$0);
    }
    tmp$ret$1 = tmp0_mapTo;
    tmp$ret$2 = tmp$ret$1;
    var resFactors = toSet(tmp$ret$2);
    return new Dimensions(resFactors);
  }
  function roundedToInt(v) {
    var tmp$ret$0;
    // Inline function 'kotlin.math.abs' call
    var tmp0_abs = numberToInt(v) - v;
    tmp$ret$0 = Math.abs(tmp0_abs);
    return tmp$ret$0 < get_ε();
  }
  function plusCommonFactors(f, set1, set2) {
    var tmp$ret$2;
    // Inline function 'kotlin.collections.find' call
    var tmp$ret$1;
    $l$block: {
      // Inline function 'kotlin.collections.firstOrNull' call
      var tmp0_iterator = set1.d();
      while (tmp0_iterator.g()) {
        var element = tmp0_iterator.e();
        var tmp$ret$0;
        // Inline function 'eu.sirotin.kotunil.core.plusCommonFactors.<anonymous>' call
        tmp$ret$0 = element.u5_1.equals(f.u5_1);
        if (tmp$ret$0) {
          tmp$ret$1 = element;
          break $l$block;
        }
      }
      tmp$ret$1 = null;
    }
    tmp$ret$2 = tmp$ret$1;
    var f1 = tmp$ret$2;
    var tmp$ret$5;
    // Inline function 'kotlin.collections.find' call
    var tmp$ret$4;
    $l$block_0: {
      // Inline function 'kotlin.collections.firstOrNull' call
      var tmp0_iterator_0 = set2.d();
      while (tmp0_iterator_0.g()) {
        var element_0 = tmp0_iterator_0.e();
        var tmp$ret$3;
        // Inline function 'eu.sirotin.kotunil.core.plusCommonFactors.<anonymous>' call
        tmp$ret$3 = element_0.u5_1.equals(f.u5_1);
        if (tmp$ret$3) {
          tmp$ret$4 = element_0;
          break $l$block_0;
        }
      }
      tmp$ret$4 = null;
    }
    tmp$ret$5 = tmp$ret$4;
    var f2 = tmp$ret$5;
    var powerValue = ensureNotNull(f1).v5_1 + ensureNotNull(f2).v5_1;
    var tmp;
    var tmp$ret$6;
    // Inline function 'kotlin.math.abs' call
    tmp$ret$6 = Math.abs(powerValue);
    if (tmp$ret$6 > get_ε()) {
      tmp = new Factor(f.u5_1, powerValue);
    } else {
      tmp = null;
    }
    return tmp;
  }
  function Expression_init_$Init$(value, description, $this) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression.call($this, value_0, new Dimensions(setOf(Factor_init_$Create$(description, 0.0, 2, null))));
    return $this;
  }
  function create(value, description) {
    return Expression_init_$Init$(value, description, Object.create(Expression.prototype));
  }
  function Expression_init_$Init$_0(value, description, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    Expression_init_$Init$(value, description, $this);
    return $this;
  }
  function Expression_init_$Create$(value, description, $mask0, $marker) {
    return Expression_init_$Init$_0(value, description, $mask0, $marker, Object.create(Expression.prototype));
  }
  function checkCompatibility($this, other) {
    if (!($this.c6() === other.c6()))
      throw IllegalArgumentException_init_$Create$("Can't process objects with different dimensions: '" + $this.c6() + "' and " + other.c6());
  }
  function Expression(value, dimensions) {
    this.value = value;
    this.dimensions = dimensions;
  }
  Expression.prototype.f6 = function (_set____db54di) {
    this.value = _set____db54di;
  };
  Expression.prototype.s = function () {
    return this.value;
  };
  Expression.prototype.g6 = function () {
    return this.dimensions;
  };
  Expression.prototype.h6 = function (other) {
    checkCompatibility(this, other);
    return compareTo(this.value, other.value);
  };
  Expression.prototype.t1 = function (other) {
    return this.h6(other instanceof Expression ? other : THROW_CCE());
  };
  Expression.prototype.c6 = function () {
    return this.dimensions.c6();
  };
  Expression.prototype.d6 = function () {
    return this.dimensions.d6();
  };
  Expression.prototype.toString = function () {
    return '' + this.value + ' ' + this.c6();
  };
  Expression.prototype.equals = function (other) {
    if (this === other)
      return true;
    try {
      if (other instanceof Expression)
        other;
      else
        THROW_CCE();
    } catch ($p) {
      if ($p instanceof Error) {
        return false;
      } else {
        throw $p;
      }
    }
    if (!(this.value === other.value))
      return false;
    if (!this.dimensions.equals(other.dimensions))
      return false;
    return true;
  };
  Expression.prototype.hashCode = function () {
    var result = getNumberHashCode(this.value);
    result = imul(31, result) + this.dimensions.hashCode() | 0;
    return result;
  };
  Expression.prototype.plus = function (other) {
    return plus_1(this, other);
  };
  Expression.prototype.minus = function (other) {
    return minus(this, other);
  };
  Expression.prototype.timesExp = function (other) {
    return times_0(this, other);
  };
  Expression.prototype.times = function (other) {
    return times_1(this, other);
  };
  Expression.prototype.divExp = function (other) {
    return div(this, other);
  };
  Expression.prototype.div = function (other) {
    return div_1(this, other);
  };
  Expression.prototype.numberDivOn = function (other) {
    return div_0(other, this);
  };
  Expression.prototype.pw = function (degree) {
    return pow_0(this, degree);
  };
  function get_COMPATIBILITY_ERR_PREFIX() {
    return COMPATIBILITY_ERR_PREFIX;
  }
  var COMPATIBILITY_ERR_PREFIX;
  function get_ε() {
    return ε;
  }
  var ε;
  function pow_0(_this__u8e3s4, degree) {
    var tmp$ret$0;
    // Inline function 'kotlin.math.pow' call
    var tmp0_pow = _this__u8e3s4.value;
    var tmp1_pow = numberToDouble(degree);
    tmp$ret$0 = Math.pow(tmp0_pow, tmp1_pow);
    return new Expression(tmp$ret$0, pow(_this__u8e3s4.dimensions, degree));
  }
  function plus_1(_this__u8e3s4, other) {
    return new Expression(_this__u8e3s4.value + other.value, plus_0(_this__u8e3s4.dimensions, other.dimensions));
  }
  function times_0(_this__u8e3s4, other) {
    return new Expression(_this__u8e3s4.value * other.value, times(_this__u8e3s4.dimensions, other.dimensions));
  }
  function times_1(_this__u8e3s4, multiplicative) {
    return new Expression(_this__u8e3s4.value * numberToDouble(multiplicative), _this__u8e3s4.dimensions);
  }
  function times_2(_this__u8e3s4, p) {
    return times_1(p, _this__u8e3s4);
  }
  function minus(_this__u8e3s4, p) {
    return plus_1(_this__u8e3s4, times_2(-1, p));
  }
  function div(_this__u8e3s4, p) {
    return times_0(_this__u8e3s4, pow_0(p, -1));
  }
  function div_0(_this__u8e3s4, p) {
    return times_2(numberToDouble(_this__u8e3s4), pow_0(p, -1));
  }
  function div_1(_this__u8e3s4, x) {
    return div_0(1, div_0(numberToDouble(x), _this__u8e3s4));
  }
  function UnitSpecification(unitSymbol, categorySymbol, presentationPriority, creator) {
    this.w5_1 = unitSymbol;
    this.x5_1 = categorySymbol;
    this.y5_1 = presentationPriority;
    this.z5_1 = creator;
  }
  UnitSpecification.prototype.toString = function () {
    return 'UnitSpecification(unitSymbol=' + this.w5_1 + ', categorySymbol=' + this.x5_1 + ', presentationPriority=' + this.y5_1 + ', creator=' + this.z5_1 + ')';
  };
  UnitSpecification.prototype.hashCode = function () {
    var result = getStringHashCode(this.w5_1);
    result = imul(result, 31) + getStringHashCode(this.x5_1) | 0;
    result = imul(result, 31) + this.y5_1 | 0;
    result = imul(result, 31) + hashCode(this.z5_1) | 0;
    return result;
  };
  UnitSpecification.prototype.equals = function (other) {
    if (this === other)
      return true;
    if (!(other instanceof UnitSpecification))
      return false;
    var tmp0_other_with_cast = other instanceof UnitSpecification ? other : THROW_CCE();
    if (!(this.w5_1 === tmp0_other_with_cast.w5_1))
      return false;
    if (!(this.x5_1 === tmp0_other_with_cast.x5_1))
      return false;
    if (!(this.y5_1 === tmp0_other_with_cast.y5_1))
      return false;
    if (!equals(this.z5_1, tmp0_other_with_cast.z5_1))
      return false;
    return true;
  };
  function get_descriptionThing() {
    init_properties_Thing_kt_bsn7zu();
    return descriptionThing;
  }
  var descriptionThing;
  function get_thing() {
    init_properties_Thing_kt_bsn7zu();
    return thing;
  }
  var thing;
  function Thing(value) {
    Expression_init_$Init$(value, get_descriptionThing(), this);
  }
  function descriptionThing$lambda(v) {
    init_properties_Thing_kt_bsn7zu();
    return new Thing(v);
  }
  var properties_initialized_Thing_kt_szrmce;
  function init_properties_Thing_kt_bsn7zu() {
    if (properties_initialized_Thing_kt_szrmce) {
    } else {
      properties_initialized_Thing_kt_szrmce = true;
      descriptionThing = new UnitSpecification('#', 'Thing', 90, descriptionThing$lambda);
      thing = new Thing(1.0);
    }
  }
  //region block: init
  COMPATIBILITY_ERR_PREFIX = "Can't process objects with different dimensions:";
  ε = 1.0E-12;
  //endregion
  //region block: exports
  function $jsExportAll$(_) {
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$core = $eu$sirotin$kotunil.core || ($eu$sirotin$kotunil.core = {});
    $eu$sirotin$kotunil$core.Expression = Expression;
    $eu$sirotin$kotunil$core.Expression.create = create;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$specialunits = $eu$sirotin$kotunil.specialunits || ($eu$sirotin$kotunil.specialunits = {});
    Object.defineProperty($eu$sirotin$kotunil$specialunits, 'thing', {
      configurable: true,
      get: get_thing
    });
    $eu$sirotin$kotunil$specialunits.Thing = Thing;
  }
  $jsExportAll$(_);
  //endregion
  return _;
}));

//# sourceMappingURL=si-units-kotunil.js.map
