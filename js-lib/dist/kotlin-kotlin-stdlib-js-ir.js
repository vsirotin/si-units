//region block: polyfills
if (typeof ArrayBuffer.isView === 'undefined') {
  ArrayBuffer.isView = function (a) {
    return a != null && a.__proto__ != null && a.__proto__.__proto__ === Int8Array.prototype.__proto__;
  };
}
if (typeof Math.imul === 'undefined') {
  Math.imul = function imul(a, b) {
    return (a & 4.29490176E9) * (b & 65535) + (a & 65535) * (b | 0) | 0;
  };
}
//endregion
(function (root, factory) {
  if (typeof define === 'function' && define.amd)
    define(['exports'], factory);
  else if (typeof exports === 'object')
    factory(module.exports);
  else
    root['kotlin-kotlin-stdlib-js-ir'] = factory(typeof this['kotlin-kotlin-stdlib-js-ir'] === 'undefined' ? {} : this['kotlin-kotlin-stdlib-js-ir']);
}(this, function (_) {
  'use strict';
  //region block: imports
  var imul = Math.imul;
  var isView = ArrayBuffer.isView;
  //endregion
  //region block: pre-declaration
  setMetadataFor(Collection, 'Collection', interfaceMeta, undefined, undefined, undefined, undefined, []);
  setMetadataFor(AbstractCollection, 'AbstractCollection', classMeta, undefined, [Collection], undefined, undefined, []);
  setMetadataFor(Companion, 'Companion', objectMeta, undefined, undefined, undefined, undefined, []);
  setMetadataFor(Companion_0, 'Companion', objectMeta, undefined, undefined, undefined, undefined, []);
  setMetadataFor(Map, 'Map', interfaceMeta, undefined, undefined, undefined, undefined, []);
  setMetadataFor(AbstractMap, 'AbstractMap', classMeta, undefined, [Map], undefined, undefined, []);
  setMetadataFor(Companion_1, 'Companion', objectMeta, undefined, undefined, undefined, undefined, []);
  setMetadataFor(EmptyIterator, 'EmptyIterator', objectMeta, undefined, undefined, undefined, undefined, []);
  setMetadataFor(List, 'List', interfaceMeta, undefined, [Collection], undefined, undefined, []);
  setMetadataFor(RandomAccess, 'RandomAccess', interfaceMeta, undefined, undefined, undefined, undefined, []);
  setMetadataFor(EmptyList, 'EmptyList', objectMeta, undefined, [List, RandomAccess], undefined, undefined, []);
  setMetadataFor(ArrayAsCollection, 'ArrayAsCollection', classMeta, undefined, [Collection], undefined, undefined, []);
  setMetadataFor(Set, 'Set', interfaceMeta, undefined, [Collection], undefined, undefined, []);
  setMetadataFor(EmptySet, 'EmptySet', objectMeta, undefined, [Set], undefined, undefined, []);
  setMetadataFor(Comparator, 'Comparator', interfaceMeta, undefined, undefined, undefined, undefined, []);
  setMetadataFor(NaturalOrderComparator, 'NaturalOrderComparator', objectMeta, undefined, [Comparator], undefined, undefined, []);
  setMetadataFor(CharSequence, 'CharSequence', interfaceMeta, undefined, undefined, undefined, undefined, []);
  setMetadataFor(Comparable, 'Comparable', interfaceMeta, undefined, undefined, undefined, undefined, []);
  setMetadataFor(Number_0, 'Number', classMeta, undefined, undefined, undefined, undefined, []);
  setMetadataFor(Unit, 'Unit', objectMeta, undefined, undefined, undefined, undefined, []);
  setMetadataFor(MutableIterable, 'MutableIterable', interfaceMeta, undefined, undefined, undefined, undefined, []);
  setMetadataFor(AbstractMutableCollection, 'AbstractMutableCollection', classMeta, AbstractCollection, [AbstractCollection, Collection, MutableIterable], undefined, undefined, []);
  setMetadataFor(IteratorImpl, 'IteratorImpl', classMeta, undefined, undefined, undefined, undefined, []);
  setMetadataFor(AbstractMutableList, 'AbstractMutableList', classMeta, AbstractMutableCollection, [AbstractMutableCollection, List, Collection, MutableIterable], undefined, undefined, []);
  setMetadataFor(AbstractMutableMap$keys$1$iterator$1, undefined, classMeta, undefined, undefined, undefined, undefined, []);
  setMetadataFor(Entry, 'Entry', interfaceMeta, undefined, undefined, undefined, undefined, []);
  setMetadataFor(MutableEntry, 'MutableEntry', interfaceMeta, undefined, [Entry], undefined, undefined, []);
  setMetadataFor(SimpleEntry, 'SimpleEntry', classMeta, undefined, [MutableEntry], undefined, undefined, []);
  setMetadataFor(AbstractMutableSet, 'AbstractMutableSet', classMeta, AbstractMutableCollection, [AbstractMutableCollection, Set, Collection, MutableIterable], undefined, undefined, []);
  setMetadataFor(AbstractEntrySet, 'AbstractEntrySet', classMeta, AbstractMutableSet, undefined, undefined, undefined, []);
  setMetadataFor(AbstractMutableMap$keys$1, undefined, classMeta, AbstractMutableSet, undefined, undefined, undefined, []);
  setMetadataFor(AbstractMutableMap, 'AbstractMutableMap', classMeta, AbstractMap, [AbstractMap, Map], undefined, undefined, []);
  setMetadataFor(ArrayList, 'ArrayList', classMeta, AbstractMutableList, [AbstractMutableList, List, Collection, MutableIterable, RandomAccess], undefined, undefined, []);
  setMetadataFor(HashCode, 'HashCode', objectMeta, undefined, undefined, undefined, undefined, []);
  setMetadataFor(EntrySet, 'EntrySet', classMeta, AbstractEntrySet, undefined, undefined, undefined, []);
  setMetadataFor(HashMap, 'HashMap', classMeta, AbstractMutableMap, [AbstractMutableMap, Map], undefined, undefined, []);
  setMetadataFor(HashSet, 'HashSet', classMeta, AbstractMutableSet, [AbstractMutableSet, Set, Collection, MutableIterable], undefined, undefined, []);
  setMetadataFor(InternalHashCodeMap$iterator$1, undefined, classMeta, undefined, undefined, undefined, undefined, []);
  function createJsMap() {
    var result = Object.create(null);
    result['foo'] = 1;
    jsDeleteProperty(result, 'foo');
    return result;
  }
  setMetadataFor(InternalMap, 'InternalMap', interfaceMeta, undefined, [MutableIterable], undefined, undefined, []);
  setMetadataFor(InternalHashCodeMap, 'InternalHashCodeMap', classMeta, undefined, [InternalMap], undefined, undefined, []);
  setMetadataFor(EntryIterator, 'EntryIterator', classMeta, undefined, undefined, undefined, undefined, []);
  setMetadataFor(ChainEntry, 'ChainEntry', classMeta, SimpleEntry, undefined, undefined, undefined, []);
  setMetadataFor(EntrySet_0, 'EntrySet', classMeta, AbstractEntrySet, undefined, undefined, undefined, []);
  setMetadataFor(LinkedHashMap, 'LinkedHashMap', classMeta, HashMap, [HashMap, Map], undefined, undefined, []);
  setMetadataFor(LinkedHashSet, 'LinkedHashSet', classMeta, HashSet, [HashSet, Set, Collection, MutableIterable], undefined, undefined, []);
  setMetadataFor(StringBuilder, 'StringBuilder', classMeta, undefined, [CharSequence], undefined, undefined, []);
  setMetadataFor(Companion_2, 'Companion', objectMeta, undefined, undefined, undefined, undefined, []);
  setMetadataFor(Char, 'Char', classMeta, undefined, [Comparable], undefined, undefined, []);
  setMetadataFor(BitMask, 'BitMask', classMeta, undefined, undefined, undefined, undefined, []);
  setMetadataFor(arrayIterator$1, undefined, classMeta, undefined, undefined, undefined, undefined, []);
  setMetadataFor(Companion_3, 'Companion', objectMeta, undefined, undefined, undefined, undefined, []);
  setMetadataFor(Long, 'Long', classMeta, Number_0, [Number_0, Comparable], undefined, undefined, []);
  setMetadataFor(InterfaceIdService, 'InterfaceIdService', objectMeta, undefined, undefined, undefined, undefined, []);
  setMetadataFor(Exception, 'Exception', classMeta, Error, undefined, undefined, undefined, []);
  setMetadataFor(RuntimeException, 'RuntimeException', classMeta, Exception, undefined, undefined, undefined, []);
  setMetadataFor(IllegalArgumentException, 'IllegalArgumentException', classMeta, RuntimeException, undefined, undefined, undefined, []);
  setMetadataFor(IllegalStateException, 'IllegalStateException', classMeta, RuntimeException, undefined, undefined, undefined, []);
  setMetadataFor(NoSuchElementException, 'NoSuchElementException', classMeta, RuntimeException, undefined, undefined, undefined, []);
  setMetadataFor(UnsupportedOperationException, 'UnsupportedOperationException', classMeta, RuntimeException, undefined, undefined, undefined, []);
  setMetadataFor(IndexOutOfBoundsException, 'IndexOutOfBoundsException', classMeta, RuntimeException, undefined, undefined, undefined, []);
  setMetadataFor(NullPointerException, 'NullPointerException', classMeta, RuntimeException, undefined, undefined, undefined, []);
  setMetadataFor(ClassCastException, 'ClassCastException', classMeta, RuntimeException, undefined, undefined, undefined, []);
  //endregion
  function indexOf(_this__u8e3s4, element) {
    if (element == null) {
      var inductionVariable = 0;
      var last = _this__u8e3s4.length - 1 | 0;
      if (inductionVariable <= last)
        do {
          var index = inductionVariable;
          inductionVariable = inductionVariable + 1 | 0;
          if (_this__u8e3s4[index] == null) {
            return index;
          }
        }
         while (inductionVariable <= last);
    } else {
      var inductionVariable_0 = 0;
      var last_0 = _this__u8e3s4.length - 1 | 0;
      if (inductionVariable_0 <= last_0)
        do {
          var index_0 = inductionVariable_0;
          inductionVariable_0 = inductionVariable_0 + 1 | 0;
          if (equals(element, _this__u8e3s4[index_0])) {
            return index_0;
          }
        }
         while (inductionVariable_0 <= last_0);
    }
    return -1;
  }
  function toCollection(_this__u8e3s4, destination) {
    var indexedObject = _this__u8e3s4;
    var inductionVariable = 0;
    var last = indexedObject.length;
    while (inductionVariable < last) {
      var item = indexedObject[inductionVariable];
      inductionVariable = inductionVariable + 1 | 0;
      destination.a(item);
    }
    return destination;
  }
  function contains(_this__u8e3s4, element) {
    return indexOf(_this__u8e3s4, element) >= 0;
  }
  function get_lastIndex(_this__u8e3s4) {
    return _this__u8e3s4.length - 1 | 0;
  }
  function joinToString(_this__u8e3s4, separator, prefix, postfix, limit, truncated, transform) {
    return joinTo(_this__u8e3s4, StringBuilder_init_$Create$(), separator, prefix, postfix, limit, truncated, transform).toString();
  }
  function joinToString$default(_this__u8e3s4, separator, prefix, postfix, limit, truncated, transform, $mask0, $handler) {
    if (!(($mask0 & 1) === 0))
      separator = ', ';
    if (!(($mask0 & 2) === 0))
      prefix = '';
    if (!(($mask0 & 4) === 0))
      postfix = '';
    if (!(($mask0 & 8) === 0))
      limit = -1;
    if (!(($mask0 & 16) === 0))
      truncated = '...';
    if (!(($mask0 & 32) === 0))
      transform = null;
    return joinToString(_this__u8e3s4, separator, prefix, postfix, limit, truncated, transform);
  }
  function joinTo(_this__u8e3s4, buffer, separator, prefix, postfix, limit, truncated, transform) {
    buffer.b(prefix);
    var count = 0;
    var indexedObject = _this__u8e3s4;
    var inductionVariable = 0;
    var last = indexedObject.length;
    $l$loop: while (inductionVariable < last) {
      var element = indexedObject[inductionVariable];
      inductionVariable = inductionVariable + 1 | 0;
      count = count + 1 | 0;
      if (count > 1) {
        buffer.b(separator);
      }
      if (limit < 0 ? true : count <= limit) {
        appendElement(buffer, element, transform);
      } else
        break $l$loop;
    }
    if (limit >= 0 ? count > limit : false) {
      buffer.b(truncated);
    }
    buffer.b(postfix);
    return buffer;
  }
  function sorted(_this__u8e3s4) {
    if (isInterface(_this__u8e3s4, Collection)) {
      if (_this__u8e3s4.c() <= 1)
        return toList(_this__u8e3s4);
      var tmp$ret$1;
      // Inline function 'kotlin.apply' call
      var tmp$ret$0;
      // Inline function 'kotlin.collections.toTypedArray' call
      var tmp0_toTypedArray = _this__u8e3s4;
      tmp$ret$0 = copyToArray(tmp0_toTypedArray);
      var tmp = tmp$ret$0;
      var tmp1_apply = isArray(tmp) ? tmp : THROW_CCE();
      // Inline function 'kotlin.contracts.contract' call
      // Inline function 'kotlin.collections.sorted.<anonymous>' call
      sort_0(tmp1_apply);
      tmp$ret$1 = tmp1_apply;
      return asList(tmp$ret$1);
    }
    var tmp$ret$2;
    // Inline function 'kotlin.apply' call
    var tmp2_apply = toMutableList(_this__u8e3s4);
    // Inline function 'kotlin.contracts.contract' call
    // Inline function 'kotlin.collections.sorted.<anonymous>' call
    sort(tmp2_apply);
    tmp$ret$2 = tmp2_apply;
    return tmp$ret$2;
  }
  function joinToString_0(_this__u8e3s4, separator, prefix, postfix, limit, truncated, transform) {
    return joinTo_0(_this__u8e3s4, StringBuilder_init_$Create$(), separator, prefix, postfix, limit, truncated, transform).toString();
  }
  function joinToString$default_0(_this__u8e3s4, separator, prefix, postfix, limit, truncated, transform, $mask0, $handler) {
    if (!(($mask0 & 1) === 0))
      separator = ', ';
    if (!(($mask0 & 2) === 0))
      prefix = '';
    if (!(($mask0 & 4) === 0))
      postfix = '';
    if (!(($mask0 & 8) === 0))
      limit = -1;
    if (!(($mask0 & 16) === 0))
      truncated = '...';
    if (!(($mask0 & 32) === 0))
      transform = null;
    return joinToString_0(_this__u8e3s4, separator, prefix, postfix, limit, truncated, transform);
  }
  function toSet(_this__u8e3s4) {
    if (isInterface(_this__u8e3s4, Collection)) {
      var tmp0_subject = _this__u8e3s4.c();
      var tmp;
      switch (tmp0_subject) {
        case 0:
          tmp = emptySet();
          break;
        case 1:
          var tmp_0;
          if (isInterface(_this__u8e3s4, List)) {
            tmp_0 = _this__u8e3s4.f(0);
          } else {
            tmp_0 = _this__u8e3s4.d().e();
          }

          tmp = setOf(tmp_0);
          break;
        default:
          tmp = toCollection_0(_this__u8e3s4, LinkedHashSet_init_$Create$_1(mapCapacity(_this__u8e3s4.c())));
          break;
      }
      return tmp;
    }
    return optimizeReadOnlySet(toCollection_0(_this__u8e3s4, LinkedHashSet_init_$Create$()));
  }
  function intersect(_this__u8e3s4, other) {
    var set = toMutableSet(_this__u8e3s4);
    retainAll(set, other);
    return set;
  }
  function toList(_this__u8e3s4) {
    if (isInterface(_this__u8e3s4, Collection)) {
      var tmp0_subject = _this__u8e3s4.c();
      var tmp;
      switch (tmp0_subject) {
        case 0:
          tmp = emptyList();
          break;
        case 1:
          var tmp_0;
          if (isInterface(_this__u8e3s4, List)) {
            tmp_0 = _this__u8e3s4.f(0);
          } else {
            tmp_0 = _this__u8e3s4.d().e();
          }

          tmp = listOf(tmp_0);
          break;
        default:
          tmp = toMutableList_0(_this__u8e3s4);
          break;
      }
      return tmp;
    }
    return optimizeReadOnlyList(toMutableList(_this__u8e3s4));
  }
  function toMutableList(_this__u8e3s4) {
    if (isInterface(_this__u8e3s4, Collection))
      return toMutableList_0(_this__u8e3s4);
    return toCollection_0(_this__u8e3s4, ArrayList_init_$Create$());
  }
  function joinTo_0(_this__u8e3s4, buffer, separator, prefix, postfix, limit, truncated, transform) {
    buffer.b(prefix);
    var count = 0;
    var tmp0_iterator = _this__u8e3s4.d();
    $l$loop: while (tmp0_iterator.g()) {
      var element = tmp0_iterator.e();
      count = count + 1 | 0;
      if (count > 1) {
        buffer.b(separator);
      }
      if (limit < 0 ? true : count <= limit) {
        appendElement(buffer, element, transform);
      } else
        break $l$loop;
    }
    if (limit >= 0 ? count > limit : false) {
      buffer.b(truncated);
    }
    buffer.b(postfix);
    return buffer;
  }
  function toCollection_0(_this__u8e3s4, destination) {
    var tmp0_iterator = _this__u8e3s4.d();
    while (tmp0_iterator.g()) {
      var item = tmp0_iterator.e();
      destination.a(item);
    }
    return destination;
  }
  function toMutableSet(_this__u8e3s4) {
    var tmp0_subject = _this__u8e3s4;
    var tmp;
    if (isInterface(tmp0_subject, Collection)) {
      tmp = LinkedHashSet_init_$Create$_0(_this__u8e3s4);
    } else {
      tmp = toCollection_0(_this__u8e3s4, LinkedHashSet_init_$Create$());
    }
    return tmp;
  }
  function toMutableList_0(_this__u8e3s4) {
    return ArrayList_init_$Create$_1(_this__u8e3s4);
  }
  function plus(_this__u8e3s4, elements) {
    var tmp0_safe_receiver = collectionSizeOrNull(elements);
    var tmp;
    if (tmp0_safe_receiver == null) {
      tmp = null;
    } else {
      var tmp$ret$1;
      // Inline function 'kotlin.let' call
      // Inline function 'kotlin.contracts.contract' call
      var tmp$ret$0;
      // Inline function 'kotlin.collections.plus.<anonymous>' call
      tmp$ret$0 = _this__u8e3s4.c() + tmp0_safe_receiver | 0;
      tmp$ret$1 = tmp$ret$0;
      tmp = tmp$ret$1;
    }
    var tmp1_elvis_lhs = tmp;
    var result = LinkedHashSet_init_$Create$_1(mapCapacity(tmp1_elvis_lhs == null ? imul(_this__u8e3s4.c(), 2) : tmp1_elvis_lhs));
    result.h(_this__u8e3s4);
    addAll(result, elements);
    return result;
  }
  function AbstractCollection$toString$lambda(this$0) {
    return function (it) {
      return it === this$0 ? '(this Collection)' : toString_1(it);
    };
  }
  function AbstractCollection() {
  }
  AbstractCollection.prototype.i = function (element) {
    var tmp$ret$0;
    $l$block_0: {
      // Inline function 'kotlin.collections.any' call
      var tmp;
      if (isInterface(this, Collection)) {
        tmp = this.j();
      } else {
        tmp = false;
      }
      if (tmp) {
        tmp$ret$0 = false;
        break $l$block_0;
      }
      var tmp0_iterator = this.d();
      while (tmp0_iterator.g()) {
        var element_0 = tmp0_iterator.e();
        var tmp$ret$1;
        // Inline function 'kotlin.collections.AbstractCollection.contains.<anonymous>' call
        tmp$ret$1 = equals(element_0, element);
        if (tmp$ret$1) {
          tmp$ret$0 = true;
          break $l$block_0;
        }
      }
      tmp$ret$0 = false;
    }
    return tmp$ret$0;
  };
  AbstractCollection.prototype.k = function (elements) {
    var tmp$ret$0;
    $l$block_0: {
      // Inline function 'kotlin.collections.all' call
      var tmp;
      if (isInterface(elements, Collection)) {
        tmp = elements.j();
      } else {
        tmp = false;
      }
      if (tmp) {
        tmp$ret$0 = true;
        break $l$block_0;
      }
      var tmp0_iterator = elements.d();
      while (tmp0_iterator.g()) {
        var element = tmp0_iterator.e();
        var tmp$ret$1;
        // Inline function 'kotlin.collections.AbstractCollection.containsAll.<anonymous>' call
        tmp$ret$1 = this.i(element);
        if (!tmp$ret$1) {
          tmp$ret$0 = false;
          break $l$block_0;
        }
      }
      tmp$ret$0 = true;
    }
    return tmp$ret$0;
  };
  AbstractCollection.prototype.j = function () {
    return this.c() === 0;
  };
  AbstractCollection.prototype.toString = function () {
    return joinToString$default_0(this, ', ', '[', ']', 0, null, AbstractCollection$toString$lambda(this), 24, null);
  };
  AbstractCollection.prototype.toArray = function () {
    return copyToArrayImpl(this);
  };
  function Companion() {
    Companion_instance = this;
  }
  Companion.prototype.l = function (index, size) {
    if (index < 0 ? true : index >= size) {
      throw IndexOutOfBoundsException_init_$Create$('index: ' + index + ', size: ' + size);
    }
  };
  Companion.prototype.m = function (index, size) {
    if (index < 0 ? true : index > size) {
      throw IndexOutOfBoundsException_init_$Create$('index: ' + index + ', size: ' + size);
    }
  };
  Companion.prototype.n = function (c) {
    var hashCode_0 = 1;
    var tmp0_iterator = c.d();
    while (tmp0_iterator.g()) {
      var e = tmp0_iterator.e();
      var tmp = imul(31, hashCode_0);
      var tmp1_safe_receiver = e;
      var tmp2_elvis_lhs = tmp1_safe_receiver == null ? null : hashCode(tmp1_safe_receiver);
      hashCode_0 = tmp + (tmp2_elvis_lhs == null ? 0 : tmp2_elvis_lhs) | 0;
    }
    return hashCode_0;
  };
  Companion.prototype.o = function (c, other) {
    if (!(c.c() === other.c()))
      return false;
    var otherIterator = other.d();
    var tmp0_iterator = c.d();
    while (tmp0_iterator.g()) {
      var elem = tmp0_iterator.e();
      var elemOther = otherIterator.e();
      if (!equals(elem, elemOther)) {
        return false;
      }
    }
    return true;
  };
  var Companion_instance;
  function Companion_getInstance() {
    if (Companion_instance == null)
      new Companion();
    return Companion_instance;
  }
  function toString($this, o) {
    return o === $this ? '(this Map)' : toString_1(o);
  }
  function implFindEntry($this, key) {
    var tmp$ret$1;
    $l$block: {
      // Inline function 'kotlin.collections.firstOrNull' call
      var tmp0_firstOrNull = $this.p();
      var tmp0_iterator = tmp0_firstOrNull.d();
      while (tmp0_iterator.g()) {
        var element = tmp0_iterator.e();
        var tmp$ret$0;
        // Inline function 'kotlin.collections.AbstractMap.implFindEntry.<anonymous>' call
        tmp$ret$0 = equals(element.q(), key);
        if (tmp$ret$0) {
          tmp$ret$1 = element;
          break $l$block;
        }
      }
      tmp$ret$1 = null;
    }
    return tmp$ret$1;
  }
  function Companion_0() {
    Companion_instance_0 = this;
  }
  Companion_0.prototype.r = function (e) {
    var tmp$ret$1;
    // Inline function 'kotlin.with' call
    // Inline function 'kotlin.contracts.contract' call
    var tmp$ret$0;
    // Inline function 'kotlin.collections.Companion.entryHashCode.<anonymous>' call
    var tmp2_safe_receiver = e.q();
    var tmp3_elvis_lhs = tmp2_safe_receiver == null ? null : hashCode(tmp2_safe_receiver);
    var tmp = tmp3_elvis_lhs == null ? 0 : tmp3_elvis_lhs;
    var tmp0_safe_receiver = e.s();
    var tmp1_elvis_lhs = tmp0_safe_receiver == null ? null : hashCode(tmp0_safe_receiver);
    tmp$ret$0 = tmp ^ (tmp1_elvis_lhs == null ? 0 : tmp1_elvis_lhs);
    tmp$ret$1 = tmp$ret$0;
    return tmp$ret$1;
  };
  Companion_0.prototype.t = function (e) {
    var tmp$ret$1;
    // Inline function 'kotlin.with' call
    // Inline function 'kotlin.contracts.contract' call
    var tmp$ret$0;
    // Inline function 'kotlin.collections.Companion.entryToString.<anonymous>' call
    tmp$ret$0 = toString_1(e.q()) + '=' + toString_1(e.s());
    tmp$ret$1 = tmp$ret$0;
    return tmp$ret$1;
  };
  Companion_0.prototype.u = function (e, other) {
    if (!(!(other == null) ? isInterface(other, Entry) : false))
      return false;
    return equals(e.q(), other.q()) ? equals(e.s(), other.s()) : false;
  };
  var Companion_instance_0;
  function Companion_getInstance_0() {
    if (Companion_instance_0 == null)
      new Companion_0();
    return Companion_instance_0;
  }
  function AbstractMap$toString$lambda(this$0) {
    return function (it) {
      return this$0.x(it);
    };
  }
  function AbstractMap() {
    Companion_getInstance_0();
    this.v_1 = null;
    this.w_1 = null;
  }
  AbstractMap.prototype.y = function (key) {
    return !(implFindEntry(this, key) == null);
  };
  AbstractMap.prototype.z = function (entry) {
    if (!(!(entry == null) ? isInterface(entry, Entry) : false))
      return false;
    var key = entry.q();
    var value = entry.s();
    var tmp$ret$0;
    // Inline function 'kotlin.collections.get' call
    tmp$ret$0 = (isInterface(this, Map) ? this : THROW_CCE()).a1(key);
    var ourValue = tmp$ret$0;
    if (!equals(value, ourValue)) {
      return false;
    }
    var tmp;
    if (ourValue == null) {
      var tmp$ret$1;
      // Inline function 'kotlin.collections.containsKey' call
      tmp$ret$1 = (isInterface(this, Map) ? this : THROW_CCE()).y(key);
      tmp = !tmp$ret$1;
    } else {
      tmp = false;
    }
    if (tmp) {
      return false;
    }
    return true;
  };
  AbstractMap.prototype.equals = function (other) {
    if (other === this)
      return true;
    if (!(!(other == null) ? isInterface(other, Map) : false))
      return false;
    if (!(this.c() === other.c()))
      return false;
    var tmp$ret$0;
    $l$block_0: {
      // Inline function 'kotlin.collections.all' call
      var tmp0_all = other.p();
      var tmp;
      if (isInterface(tmp0_all, Collection)) {
        tmp = tmp0_all.j();
      } else {
        tmp = false;
      }
      if (tmp) {
        tmp$ret$0 = true;
        break $l$block_0;
      }
      var tmp0_iterator = tmp0_all.d();
      while (tmp0_iterator.g()) {
        var element = tmp0_iterator.e();
        var tmp$ret$1;
        // Inline function 'kotlin.collections.AbstractMap.equals.<anonymous>' call
        tmp$ret$1 = this.z(element);
        if (!tmp$ret$1) {
          tmp$ret$0 = false;
          break $l$block_0;
        }
      }
      tmp$ret$0 = true;
    }
    return tmp$ret$0;
  };
  AbstractMap.prototype.a1 = function (key) {
    var tmp0_safe_receiver = implFindEntry(this, key);
    return tmp0_safe_receiver == null ? null : tmp0_safe_receiver.s();
  };
  AbstractMap.prototype.hashCode = function () {
    return hashCode(this.p());
  };
  AbstractMap.prototype.j = function () {
    return this.c() === 0;
  };
  AbstractMap.prototype.c = function () {
    return this.p().c();
  };
  AbstractMap.prototype.toString = function () {
    var tmp = this.p();
    return joinToString$default_0(tmp, ', ', '{', '}', 0, null, AbstractMap$toString$lambda(this), 24, null);
  };
  AbstractMap.prototype.x = function (entry) {
    return toString(this, entry.q()) + '=' + toString(this, entry.s());
  };
  function Companion_1() {
    Companion_instance_1 = this;
  }
  Companion_1.prototype.b1 = function (c) {
    var hashCode_0 = 0;
    var tmp0_iterator = c.d();
    while (tmp0_iterator.g()) {
      var element = tmp0_iterator.e();
      var tmp = hashCode_0;
      var tmp1_safe_receiver = element;
      var tmp2_elvis_lhs = tmp1_safe_receiver == null ? null : hashCode(tmp1_safe_receiver);
      hashCode_0 = tmp + (tmp2_elvis_lhs == null ? 0 : tmp2_elvis_lhs) | 0;
    }
    return hashCode_0;
  };
  Companion_1.prototype.c1 = function (c, other) {
    if (!(c.c() === other.c()))
      return false;
    var tmp$ret$0;
    // Inline function 'kotlin.collections.containsAll' call
    tmp$ret$0 = c.k(other);
    return tmp$ret$0;
  };
  var Companion_instance_1;
  function Companion_getInstance_1() {
    if (Companion_instance_1 == null)
      new Companion_1();
    return Companion_instance_1;
  }
  function emptyList() {
    return EmptyList_getInstance();
  }
  function optimizeReadOnlyList(_this__u8e3s4) {
    var tmp0_subject = _this__u8e3s4.c();
    switch (tmp0_subject) {
      case 0:
        return emptyList();
      case 1:
        return listOf(_this__u8e3s4.f(0));
      default:
        return _this__u8e3s4;
    }
  }
  function arrayListOf(elements) {
    return elements.length === 0 ? ArrayList_init_$Create$() : ArrayList_init_$Create$_1(new ArrayAsCollection(elements, true));
  }
  function get_lastIndex_0(_this__u8e3s4) {
    return _this__u8e3s4.c() - 1 | 0;
  }
  function EmptyIterator() {
    EmptyIterator_instance = this;
  }
  EmptyIterator.prototype.g = function () {
    return false;
  };
  EmptyIterator.prototype.e = function () {
    throw NoSuchElementException_init_$Create$();
  };
  var EmptyIterator_instance;
  function EmptyIterator_getInstance() {
    if (EmptyIterator_instance == null)
      new EmptyIterator();
    return EmptyIterator_instance;
  }
  function EmptyList() {
    EmptyList_instance = this;
    this.d1_1 = new Long(-1478467534, -1720727600);
  }
  EmptyList.prototype.equals = function (other) {
    var tmp;
    if (!(other == null) ? isInterface(other, List) : false) {
      tmp = other.j();
    } else {
      tmp = false;
    }
    return tmp;
  };
  EmptyList.prototype.hashCode = function () {
    return 1;
  };
  EmptyList.prototype.toString = function () {
    return '[]';
  };
  EmptyList.prototype.c = function () {
    return 0;
  };
  EmptyList.prototype.j = function () {
    return true;
  };
  EmptyList.prototype.e1 = function (element) {
    return false;
  };
  EmptyList.prototype.i = function (element) {
    if (!false)
      return false;
    var tmp;
    if (false) {
      tmp = element;
    } else {
      tmp = THROW_CCE();
    }
    return this.e1(tmp);
  };
  EmptyList.prototype.f1 = function (elements) {
    return elements.j();
  };
  EmptyList.prototype.k = function (elements) {
    return this.f1(elements);
  };
  EmptyList.prototype.f = function (index) {
    throw IndexOutOfBoundsException_init_$Create$("Empty list doesn't contain element at index " + index + '.');
  };
  EmptyList.prototype.d = function () {
    return EmptyIterator_getInstance();
  };
  var EmptyList_instance;
  function EmptyList_getInstance() {
    if (EmptyList_instance == null)
      new EmptyList();
    return EmptyList_instance;
  }
  function ArrayAsCollection(values, isVarargs) {
    this.g1_1 = values;
    this.h1_1 = isVarargs;
  }
  ArrayAsCollection.prototype.c = function () {
    return this.g1_1.length;
  };
  ArrayAsCollection.prototype.j = function () {
    var tmp$ret$0;
    // Inline function 'kotlin.collections.isEmpty' call
    var tmp0_isEmpty = this.g1_1;
    tmp$ret$0 = tmp0_isEmpty.length === 0;
    return tmp$ret$0;
  };
  ArrayAsCollection.prototype.i1 = function (element) {
    return contains(this.g1_1, element);
  };
  ArrayAsCollection.prototype.i = function (element) {
    if (!(element == null ? true : isObject(element)))
      return false;
    return this.i1((element == null ? true : isObject(element)) ? element : THROW_CCE());
  };
  ArrayAsCollection.prototype.j1 = function (elements) {
    var tmp$ret$0;
    $l$block_0: {
      // Inline function 'kotlin.collections.all' call
      var tmp;
      if (isInterface(elements, Collection)) {
        tmp = elements.j();
      } else {
        tmp = false;
      }
      if (tmp) {
        tmp$ret$0 = true;
        break $l$block_0;
      }
      var tmp0_iterator = elements.d();
      while (tmp0_iterator.g()) {
        var element = tmp0_iterator.e();
        var tmp$ret$1;
        // Inline function 'kotlin.collections.ArrayAsCollection.containsAll.<anonymous>' call
        tmp$ret$1 = this.i1(element);
        if (!tmp$ret$1) {
          tmp$ret$0 = false;
          break $l$block_0;
        }
      }
      tmp$ret$0 = true;
    }
    return tmp$ret$0;
  };
  ArrayAsCollection.prototype.k = function (elements) {
    return this.j1(elements);
  };
  ArrayAsCollection.prototype.d = function () {
    return arrayIterator(this.g1_1);
  };
  function collectionSizeOrDefault(_this__u8e3s4, default_0) {
    var tmp;
    if (isInterface(_this__u8e3s4, Collection)) {
      tmp = _this__u8e3s4.c();
    } else {
      tmp = default_0;
    }
    return tmp;
  }
  function collectionSizeOrNull(_this__u8e3s4) {
    var tmp;
    if (isInterface(_this__u8e3s4, Collection)) {
      tmp = _this__u8e3s4.c();
    } else {
      tmp = null;
    }
    return tmp;
  }
  function retainAll(_this__u8e3s4, elements) {
    return _this__u8e3s4.k1(convertToListIfNotCollection(elements));
  }
  function addAll(_this__u8e3s4, elements) {
    var tmp0_subject = elements;
    if (isInterface(tmp0_subject, Collection))
      return _this__u8e3s4.h(elements);
    else {
      var result = false;
      var tmp1_iterator = elements.d();
      while (tmp1_iterator.g()) {
        var item = tmp1_iterator.e();
        if (_this__u8e3s4.a(item))
          result = true;
      }
      return result;
    }
  }
  function convertToListIfNotCollection(_this__u8e3s4) {
    var tmp;
    if (isInterface(_this__u8e3s4, Collection)) {
      tmp = _this__u8e3s4;
    } else {
      tmp = toList(_this__u8e3s4);
    }
    return tmp;
  }
  function removeAll(_this__u8e3s4, predicate) {
    return filterInPlace(_this__u8e3s4, predicate, true);
  }
  function removeAll_0(_this__u8e3s4, predicate) {
    return filterInPlace_0(_this__u8e3s4, predicate, true);
  }
  function filterInPlace(_this__u8e3s4, predicate, predicateResultToRemove) {
    if (!isInterface(_this__u8e3s4, RandomAccess)) {
      return filterInPlace_0(isInterface(_this__u8e3s4, MutableIterable) ? _this__u8e3s4 : THROW_CCE(), predicate, predicateResultToRemove);
    }
    var writeIndex = 0;
    var inductionVariable = 0;
    var last = get_lastIndex_0(_this__u8e3s4);
    if (inductionVariable <= last)
      $l$loop: do {
        var readIndex = inductionVariable;
        inductionVariable = inductionVariable + 1 | 0;
        var element = _this__u8e3s4.f(readIndex);
        if (predicate(element) === predicateResultToRemove)
          continue $l$loop;
        if (!(writeIndex === readIndex)) {
          _this__u8e3s4.l1(writeIndex, element);
        }
        var tmp1 = writeIndex;
        writeIndex = tmp1 + 1 | 0;
      }
       while (!(readIndex === last));
    if (writeIndex < _this__u8e3s4.c()) {
      var inductionVariable_0 = get_lastIndex_0(_this__u8e3s4);
      var last_0 = writeIndex;
      if (last_0 <= inductionVariable_0)
        do {
          var removeIndex = inductionVariable_0;
          inductionVariable_0 = inductionVariable_0 + -1 | 0;
          _this__u8e3s4.m1(removeIndex);
        }
         while (!(removeIndex === last_0));
      return true;
    } else {
      return false;
    }
  }
  function filterInPlace_0(_this__u8e3s4, predicate, predicateResultToRemove) {
    var result = false;
    var tmp$ret$0;
    // Inline function 'kotlin.with' call
    var tmp0_with = _this__u8e3s4.d();
    // Inline function 'kotlin.contracts.contract' call
    while (tmp0_with.g())
      if (predicate(tmp0_with.e()) === predicateResultToRemove) {
        tmp0_with.n1();
        result = true;
      }
    tmp$ret$0 = Unit_getInstance();
    return result;
  }
  function emptySet() {
    return EmptySet_getInstance();
  }
  function optimizeReadOnlySet(_this__u8e3s4) {
    var tmp0_subject = _this__u8e3s4.c();
    switch (tmp0_subject) {
      case 0:
        return emptySet();
      case 1:
        return setOf(_this__u8e3s4.d().e());
      default:
        return _this__u8e3s4;
    }
  }
  function hashSetOf(elements) {
    return toCollection(elements, HashSet_init_$Create$(mapCapacity(elements.length)));
  }
  function EmptySet() {
    EmptySet_instance = this;
    this.o1_1 = new Long(1993859828, 793161749);
  }
  EmptySet.prototype.equals = function (other) {
    var tmp;
    if (!(other == null) ? isInterface(other, Set) : false) {
      tmp = other.j();
    } else {
      tmp = false;
    }
    return tmp;
  };
  EmptySet.prototype.hashCode = function () {
    return 0;
  };
  EmptySet.prototype.toString = function () {
    return '[]';
  };
  EmptySet.prototype.c = function () {
    return 0;
  };
  EmptySet.prototype.j = function () {
    return true;
  };
  EmptySet.prototype.e1 = function (element) {
    return false;
  };
  EmptySet.prototype.i = function (element) {
    if (!false)
      return false;
    var tmp;
    if (false) {
      tmp = element;
    } else {
      tmp = THROW_CCE();
    }
    return this.e1(tmp);
  };
  EmptySet.prototype.f1 = function (elements) {
    return elements.j();
  };
  EmptySet.prototype.k = function (elements) {
    return this.f1(elements);
  };
  EmptySet.prototype.d = function () {
    return EmptyIterator_getInstance();
  };
  var EmptySet_instance;
  function EmptySet_getInstance() {
    if (EmptySet_instance == null)
      new EmptySet();
    return EmptySet_instance;
  }
  function naturalOrder() {
    var tmp = NaturalOrderComparator_getInstance();
    return isInterface(tmp, Comparator) ? tmp : THROW_CCE();
  }
  function NaturalOrderComparator() {
    NaturalOrderComparator_instance = this;
  }
  NaturalOrderComparator.prototype.p1 = function (a, b) {
    return compareTo(a, b);
  };
  NaturalOrderComparator.prototype.compare = function (a, b) {
    var tmp = (!(a == null) ? isComparable(a) : false) ? a : THROW_CCE();
    return this.p1(tmp, (!(b == null) ? isComparable(b) : false) ? b : THROW_CCE());
  };
  var NaturalOrderComparator_instance;
  function NaturalOrderComparator_getInstance() {
    if (NaturalOrderComparator_instance == null)
      new NaturalOrderComparator();
    return NaturalOrderComparator_instance;
  }
  function appendElement(_this__u8e3s4, element, transform) {
    if (!(transform == null)) {
      _this__u8e3s4.b(transform(element));
    } else {
      if (element == null ? true : isCharSequence(element)) {
        _this__u8e3s4.b(element);
      } else {
        if (element instanceof Char) {
          _this__u8e3s4.r1(element.q1_1);
        } else {
          _this__u8e3s4.b(toString_1(element));
        }
      }
    }
  }
  function CharSequence() {
  }
  function Comparable() {
  }
  function Number_0() {
  }
  function Unit() {
    Unit_instance = this;
  }
  Unit.prototype.toString = function () {
    return 'kotlin.Unit';
  };
  var Unit_instance;
  function Unit_getInstance() {
    if (Unit_instance == null)
      new Unit();
    return Unit_instance;
  }
  function Comparator() {
  }
  function setOf(element) {
    return hashSetOf([element]);
  }
  function sort(_this__u8e3s4) {
    collectionsSort(_this__u8e3s4, naturalOrder());
  }
  function mapCapacity(expectedSize) {
    return expectedSize;
  }
  function listOf(element) {
    return arrayListOf([element]);
  }
  function copyToArray(collection) {
    var tmp;
    var tmp$ret$0;
    // Inline function 'kotlin.js.asDynamic' call
    tmp$ret$0 = collection;
    if (tmp$ret$0.toArray !== undefined) {
      var tmp$ret$2;
      // Inline function 'kotlin.js.unsafeCast' call
      var tmp$ret$1;
      // Inline function 'kotlin.js.asDynamic' call
      tmp$ret$1 = collection;
      var tmp0_unsafeCast = tmp$ret$1.toArray();
      tmp$ret$2 = tmp0_unsafeCast;
      tmp = tmp$ret$2;
    } else {
      var tmp$ret$4;
      // Inline function 'kotlin.js.unsafeCast' call
      var tmp1_unsafeCast = copyToArrayImpl(collection);
      var tmp$ret$3;
      // Inline function 'kotlin.js.asDynamic' call
      tmp$ret$3 = tmp1_unsafeCast;
      tmp$ret$4 = tmp$ret$3;
      tmp = tmp$ret$4;
    }
    return tmp;
  }
  function collectionsSort(list, comparator) {
    if (list.c() <= 1)
      return Unit_getInstance();
    var array = copyToArray(list);
    sortArrayWith(array, comparator);
    var inductionVariable = 0;
    var last = array.length;
    if (inductionVariable < last)
      do {
        var i = inductionVariable;
        inductionVariable = inductionVariable + 1 | 0;
        list.l1(i, array[i]);
      }
       while (inductionVariable < last);
  }
  function copyToArrayImpl(collection) {
    var tmp$ret$0;
    // Inline function 'kotlin.emptyArray' call
    tmp$ret$0 = [];
    var array = tmp$ret$0;
    var iterator = collection.d();
    while (iterator.g()) {
      var tmp$ret$1;
      // Inline function 'kotlin.js.asDynamic' call
      tmp$ret$1 = array;
      tmp$ret$1.push(iterator.e());
    }
    return array;
  }
  function AbstractMutableCollection$retainAll$lambda($elements) {
    return function (it) {
      return !$elements.i(it);
    };
  }
  function AbstractMutableCollection() {
    AbstractCollection.call(this);
  }
  AbstractMutableCollection.prototype.h = function (elements) {
    this.u1();
    var modified = false;
    var tmp0_iterator = elements.d();
    while (tmp0_iterator.g()) {
      var element = tmp0_iterator.e();
      if (this.a(element))
        modified = true;
    }
    return modified;
  };
  AbstractMutableCollection.prototype.k1 = function (elements) {
    this.u1();
    var tmp = isInterface(this, MutableIterable) ? this : THROW_CCE();
    return removeAll_0(tmp, AbstractMutableCollection$retainAll$lambda(elements));
  };
  AbstractMutableCollection.prototype.toJSON = function () {
    return this.toArray();
  };
  AbstractMutableCollection.prototype.u1 = function () {
  };
  function IteratorImpl($outer) {
    this.x1_1 = $outer;
    this.v1_1 = 0;
    this.w1_1 = -1;
  }
  IteratorImpl.prototype.g = function () {
    return this.v1_1 < this.x1_1.c();
  };
  IteratorImpl.prototype.e = function () {
    if (!this.g())
      throw NoSuchElementException_init_$Create$();
    var tmp = this;
    var tmp0_this = this;
    var tmp1 = tmp0_this.v1_1;
    tmp0_this.v1_1 = tmp1 + 1 | 0;
    tmp.w1_1 = tmp1;
    return this.x1_1.f(this.w1_1);
  };
  IteratorImpl.prototype.n1 = function () {
    // Inline function 'kotlin.check' call
    var tmp0_check = !(this.w1_1 === -1);
    // Inline function 'kotlin.contracts.contract' call
    if (!tmp0_check) {
      var tmp$ret$0;
      // Inline function 'kotlin.collections.IteratorImpl.remove.<anonymous>' call
      tmp$ret$0 = 'Call next() or previous() before removing element from the iterator.';
      var message = tmp$ret$0;
      throw IllegalStateException_init_$Create$(toString_2(message));
    }
    this.x1_1.m1(this.w1_1);
    this.v1_1 = this.w1_1;
    this.w1_1 = -1;
  };
  function AbstractMutableList$retainAll$lambda($elements) {
    return function (it) {
      return !$elements.i(it);
    };
  }
  function AbstractMutableList() {
    AbstractMutableCollection.call(this);
    this.y1_1 = 0;
  }
  AbstractMutableList.prototype.a = function (element) {
    this.u1();
    this.z1(this.c(), element);
    return true;
  };
  AbstractMutableList.prototype.k1 = function (elements) {
    this.u1();
    return removeAll(this, AbstractMutableList$retainAll$lambda(elements));
  };
  AbstractMutableList.prototype.d = function () {
    return new IteratorImpl(this);
  };
  AbstractMutableList.prototype.i = function (element) {
    return this.a2(element) >= 0;
  };
  AbstractMutableList.prototype.a2 = function (element) {
    var inductionVariable = 0;
    var last = get_lastIndex_0(this);
    if (inductionVariable <= last)
      do {
        var index = inductionVariable;
        inductionVariable = inductionVariable + 1 | 0;
        if (equals(this.f(index), element)) {
          return index;
        }
      }
       while (!(index === last));
    return -1;
  };
  AbstractMutableList.prototype.equals = function (other) {
    if (other === this)
      return true;
    if (!(!(other == null) ? isInterface(other, List) : false))
      return false;
    return Companion_getInstance().o(this, other);
  };
  AbstractMutableList.prototype.hashCode = function () {
    return Companion_getInstance().n(this);
  };
  function AbstractMutableMap$keys$1$iterator$1($entryIterator) {
    this.b2_1 = $entryIterator;
  }
  AbstractMutableMap$keys$1$iterator$1.prototype.g = function () {
    return this.b2_1.g();
  };
  AbstractMutableMap$keys$1$iterator$1.prototype.e = function () {
    return this.b2_1.e().q();
  };
  AbstractMutableMap$keys$1$iterator$1.prototype.n1 = function () {
    return this.b2_1.n1();
  };
  function SimpleEntry(key, value) {
    this.c2_1 = key;
    this.d2_1 = value;
  }
  SimpleEntry.prototype.q = function () {
    return this.c2_1;
  };
  SimpleEntry.prototype.s = function () {
    return this.d2_1;
  };
  SimpleEntry.prototype.e2 = function (newValue) {
    var oldValue = this.d2_1;
    this.d2_1 = newValue;
    return oldValue;
  };
  SimpleEntry.prototype.hashCode = function () {
    return Companion_getInstance_0().r(this);
  };
  SimpleEntry.prototype.toString = function () {
    return Companion_getInstance_0().t(this);
  };
  SimpleEntry.prototype.equals = function (other) {
    return Companion_getInstance_0().u(this, other);
  };
  function AbstractEntrySet() {
    AbstractMutableSet.call(this);
  }
  AbstractEntrySet.prototype.i = function (element) {
    return this.f2(element);
  };
  function AbstractMutableMap$keys$1(this$0) {
    this.g2_1 = this$0;
    AbstractMutableSet.call(this);
  }
  AbstractMutableMap$keys$1.prototype.h2 = function (element) {
    throw UnsupportedOperationException_init_$Create$_0('Add is not supported on keys');
  };
  AbstractMutableMap$keys$1.prototype.a = function (element) {
    return this.h2((element == null ? true : isObject(element)) ? element : THROW_CCE());
  };
  AbstractMutableMap$keys$1.prototype.i2 = function (element) {
    return this.g2_1.y(element);
  };
  AbstractMutableMap$keys$1.prototype.i = function (element) {
    if (!(element == null ? true : isObject(element)))
      return false;
    return this.i2((element == null ? true : isObject(element)) ? element : THROW_CCE());
  };
  AbstractMutableMap$keys$1.prototype.d = function () {
    var entryIterator = this.g2_1.p().d();
    return new AbstractMutableMap$keys$1$iterator$1(entryIterator);
  };
  AbstractMutableMap$keys$1.prototype.c = function () {
    return this.g2_1.c();
  };
  AbstractMutableMap$keys$1.prototype.u1 = function () {
    return this.g2_1.u1();
  };
  function AbstractMutableMap() {
    AbstractMap.call(this);
    this.l2_1 = null;
    this.m2_1 = null;
  }
  AbstractMutableMap.prototype.n2 = function () {
    if (this.l2_1 == null) {
      var tmp = this;
      tmp.l2_1 = new AbstractMutableMap$keys$1(this);
    }
    return ensureNotNull(this.l2_1);
  };
  AbstractMutableMap.prototype.u1 = function () {
  };
  function AbstractMutableSet() {
    AbstractMutableCollection.call(this);
  }
  AbstractMutableSet.prototype.equals = function (other) {
    if (other === this)
      return true;
    if (!(!(other == null) ? isInterface(other, Set) : false))
      return false;
    return Companion_getInstance_1().c1(this, other);
  };
  AbstractMutableSet.prototype.hashCode = function () {
    return Companion_getInstance_1().b1(this);
  };
  function ArrayList_init_$Init$($this) {
    var tmp$ret$0;
    // Inline function 'kotlin.emptyArray' call
    tmp$ret$0 = [];
    ArrayList.call($this, tmp$ret$0);
    return $this;
  }
  function ArrayList_init_$Create$() {
    return ArrayList_init_$Init$(Object.create(ArrayList.prototype));
  }
  function ArrayList_init_$Init$_0(initialCapacity, $this) {
    var tmp$ret$0;
    // Inline function 'kotlin.emptyArray' call
    tmp$ret$0 = [];
    ArrayList.call($this, tmp$ret$0);
    return $this;
  }
  function ArrayList_init_$Create$_0(initialCapacity) {
    return ArrayList_init_$Init$_0(initialCapacity, Object.create(ArrayList.prototype));
  }
  function ArrayList_init_$Init$_1(elements, $this) {
    var tmp$ret$0;
    // Inline function 'kotlin.collections.toTypedArray' call
    tmp$ret$0 = copyToArray(elements);
    ArrayList.call($this, tmp$ret$0);
    return $this;
  }
  function ArrayList_init_$Create$_1(elements) {
    return ArrayList_init_$Init$_1(elements, Object.create(ArrayList.prototype));
  }
  function rangeCheck($this, index) {
    var tmp$ret$0;
    // Inline function 'kotlin.apply' call
    // Inline function 'kotlin.contracts.contract' call
    // Inline function 'kotlin.collections.ArrayList.rangeCheck.<anonymous>' call
    Companion_getInstance().l(index, $this.c());
    tmp$ret$0 = index;
    return tmp$ret$0;
  }
  function insertionRangeCheck($this, index) {
    var tmp$ret$0;
    // Inline function 'kotlin.apply' call
    // Inline function 'kotlin.contracts.contract' call
    // Inline function 'kotlin.collections.ArrayList.insertionRangeCheck.<anonymous>' call
    Companion_getInstance().m(index, $this.c());
    tmp$ret$0 = index;
    return tmp$ret$0;
  }
  function ArrayList(array) {
    AbstractMutableList.call(this);
    this.p2_1 = array;
    this.q2_1 = false;
  }
  ArrayList.prototype.c = function () {
    return this.p2_1.length;
  };
  ArrayList.prototype.f = function (index) {
    var tmp = this.p2_1[rangeCheck(this, index)];
    return (tmp == null ? true : isObject(tmp)) ? tmp : THROW_CCE();
  };
  ArrayList.prototype.l1 = function (index, element) {
    this.u1();
    rangeCheck(this, index);
    var tmp$ret$0;
    // Inline function 'kotlin.apply' call
    var tmp0_apply = this.p2_1[index];
    // Inline function 'kotlin.contracts.contract' call
    // Inline function 'kotlin.collections.ArrayList.set.<anonymous>' call
    this.p2_1[index] = element;
    tmp$ret$0 = tmp0_apply;
    var tmp = tmp$ret$0;
    return (tmp == null ? true : isObject(tmp)) ? tmp : THROW_CCE();
  };
  ArrayList.prototype.a = function (element) {
    this.u1();
    var tmp$ret$0;
    // Inline function 'kotlin.js.asDynamic' call
    var tmp0_asDynamic = this.p2_1;
    tmp$ret$0 = tmp0_asDynamic;
    tmp$ret$0.push(element);
    var tmp0_this = this;
    var tmp1 = tmp0_this.y1_1;
    tmp0_this.y1_1 = tmp1 + 1 | 0;
    return true;
  };
  ArrayList.prototype.z1 = function (index, element) {
    this.u1();
    var tmp$ret$0;
    // Inline function 'kotlin.js.asDynamic' call
    var tmp0_asDynamic = this.p2_1;
    tmp$ret$0 = tmp0_asDynamic;
    tmp$ret$0.splice(insertionRangeCheck(this, index), 0, element);
    var tmp0_this = this;
    var tmp1 = tmp0_this.y1_1;
    tmp0_this.y1_1 = tmp1 + 1 | 0;
  };
  ArrayList.prototype.h = function (elements) {
    this.u1();
    if (elements.j())
      return false;
    var tmp0_this = this;
    var tmp = tmp0_this;
    var tmp$ret$2;
    // Inline function 'kotlin.collections.plus' call
    var tmp0_plus = tmp0_this.p2_1;
    var tmp$ret$0;
    // Inline function 'kotlin.collections.toTypedArray' call
    tmp$ret$0 = copyToArray(elements);
    var tmp1_plus = tmp$ret$0;
    var tmp$ret$1;
    // Inline function 'kotlin.js.asDynamic' call
    tmp$ret$1 = tmp0_plus;
    tmp$ret$2 = tmp$ret$1.concat(tmp1_plus);
    tmp.p2_1 = tmp$ret$2;
    var tmp1_this = this;
    var tmp2 = tmp1_this.y1_1;
    tmp1_this.y1_1 = tmp2 + 1 | 0;
    return true;
  };
  ArrayList.prototype.m1 = function (index) {
    this.u1();
    rangeCheck(this, index);
    var tmp0_this = this;
    var tmp1 = tmp0_this.y1_1;
    tmp0_this.y1_1 = tmp1 + 1 | 0;
    var tmp;
    if (index === get_lastIndex_0(this)) {
      var tmp$ret$0;
      // Inline function 'kotlin.js.asDynamic' call
      var tmp0_asDynamic = this.p2_1;
      tmp$ret$0 = tmp0_asDynamic;
      tmp = tmp$ret$0.pop();
    } else {
      var tmp$ret$1;
      // Inline function 'kotlin.js.asDynamic' call
      var tmp1_asDynamic = this.p2_1;
      tmp$ret$1 = tmp1_asDynamic;
      tmp = tmp$ret$1.splice(index, 1)[0];
    }
    return tmp;
  };
  ArrayList.prototype.a2 = function (element) {
    return indexOf(this.p2_1, element);
  };
  ArrayList.prototype.toString = function () {
    return arrayToString(this.p2_1);
  };
  ArrayList.prototype.r2 = function () {
    return [].slice.call(this.p2_1);
  };
  ArrayList.prototype.toArray = function () {
    return this.r2();
  };
  ArrayList.prototype.u1 = function () {
    if (this.q2_1)
      throw UnsupportedOperationException_init_$Create$();
  };
  var _stableSortingIsSupported;
  function sortArrayWith(array, comparator) {
    if (getStableSortingIsSupported()) {
      var comparison = sortArrayWith$lambda(comparator);
      var tmp$ret$0;
      // Inline function 'kotlin.js.asDynamic' call
      tmp$ret$0 = array;
      tmp$ret$0.sort(comparison);
    } else {
      var tmp$ret$2;
      // Inline function 'kotlin.js.unsafeCast' call
      var tmp$ret$1;
      // Inline function 'kotlin.js.asDynamic' call
      tmp$ret$1 = array;
      tmp$ret$2 = tmp$ret$1;
      mergeSort(tmp$ret$2, 0, get_lastIndex(array), comparator);
    }
  }
  function sortArray(array) {
    if (getStableSortingIsSupported()) {
      var comparison = sortArray$lambda;
      var tmp$ret$0;
      // Inline function 'kotlin.js.asDynamic' call
      tmp$ret$0 = array;
      tmp$ret$0.sort(comparison);
    } else {
      var tmp$ret$2;
      // Inline function 'kotlin.js.unsafeCast' call
      var tmp$ret$1;
      // Inline function 'kotlin.js.asDynamic' call
      tmp$ret$1 = array;
      tmp$ret$2 = tmp$ret$1;
      mergeSort(tmp$ret$2, 0, get_lastIndex(array), naturalOrder());
    }
  }
  function getStableSortingIsSupported() {
    var tmp0_safe_receiver = _stableSortingIsSupported;
    if (tmp0_safe_receiver == null)
      null;
    else {
      var tmp$ret$0;
      // Inline function 'kotlin.let' call
      // Inline function 'kotlin.contracts.contract' call
      return tmp0_safe_receiver;
    }
    _stableSortingIsSupported = false;
    var tmp$ret$1;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp0_unsafeCast = [];
    tmp$ret$1 = tmp0_unsafeCast;
    var array = tmp$ret$1;
    var inductionVariable = 0;
    if (inductionVariable < 600)
      do {
        var index = inductionVariable;
        inductionVariable = inductionVariable + 1 | 0;
        var tmp$ret$2;
        // Inline function 'kotlin.js.asDynamic' call
        tmp$ret$2 = array;
        tmp$ret$2.push(index);
      }
       while (inductionVariable < 600);
    var comparison = getStableSortingIsSupported$lambda;
    var tmp$ret$3;
    // Inline function 'kotlin.js.asDynamic' call
    tmp$ret$3 = array;
    tmp$ret$3.sort(comparison);
    var inductionVariable_0 = 1;
    var last = array.length;
    if (inductionVariable_0 < last)
      do {
        var index_0 = inductionVariable_0;
        inductionVariable_0 = inductionVariable_0 + 1 | 0;
        var a = array[index_0 - 1 | 0];
        var b = array[index_0];
        if ((a & 3) === (b & 3) ? a >= b : false)
          return false;
      }
       while (inductionVariable_0 < last);
    _stableSortingIsSupported = true;
    return true;
  }
  function mergeSort(array, start, endInclusive, comparator) {
    var tmp$ret$2;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp$ret$0;
    // Inline function 'kotlin.arrayOfNulls' call
    var tmp0_arrayOfNulls = array.length;
    tmp$ret$0 = fillArrayVal(Array(tmp0_arrayOfNulls), null);
    var tmp1_unsafeCast = tmp$ret$0;
    var tmp$ret$1;
    // Inline function 'kotlin.js.asDynamic' call
    tmp$ret$1 = tmp1_unsafeCast;
    tmp$ret$2 = tmp$ret$1;
    var buffer = tmp$ret$2;
    var result = mergeSort_0(array, buffer, start, endInclusive, comparator);
    if (!(result === array)) {
      var inductionVariable = start;
      if (inductionVariable <= endInclusive)
        do {
          var i = inductionVariable;
          inductionVariable = inductionVariable + 1 | 0;
          array[i] = result[i];
        }
         while (!(i === endInclusive));
    }
  }
  function mergeSort_0(array, buffer, start, end, comparator) {
    if (start === end) {
      return array;
    }
    var median = (start + end | 0) / 2 | 0;
    var left = mergeSort_0(array, buffer, start, median, comparator);
    var right = mergeSort_0(array, buffer, median + 1 | 0, end, comparator);
    var target = left === buffer ? array : buffer;
    var leftIndex = start;
    var rightIndex = median + 1 | 0;
    var inductionVariable = start;
    if (inductionVariable <= end)
      do {
        var i = inductionVariable;
        inductionVariable = inductionVariable + 1 | 0;
        if (leftIndex <= median ? rightIndex <= end : false) {
          var leftValue = left[leftIndex];
          var rightValue = right[rightIndex];
          if (comparator.compare(leftValue, rightValue) <= 0) {
            target[i] = leftValue;
            var tmp1 = leftIndex;
            leftIndex = tmp1 + 1 | 0;
          } else {
            target[i] = rightValue;
            var tmp2 = rightIndex;
            rightIndex = tmp2 + 1 | 0;
          }
        } else if (leftIndex <= median) {
          target[i] = left[leftIndex];
          var tmp3 = leftIndex;
          leftIndex = tmp3 + 1 | 0;
        } else {
          target[i] = right[rightIndex];
          var tmp4 = rightIndex;
          rightIndex = tmp4 + 1 | 0;
        }
      }
       while (!(i === end));
    return target;
  }
  function sortArrayWith$lambda($comparator) {
    return function (a, b) {
      return $comparator.compare(a, b);
    };
  }
  function sortArray$lambda(a, b) {
    return compareTo(a, b);
  }
  function getStableSortingIsSupported$lambda(a, b) {
    return (a & 3) - (b & 3) | 0;
  }
  function HashCode() {
    HashCode_instance = this;
  }
  HashCode.prototype.s2 = function (value1, value2) {
    return equals(value1, value2);
  };
  HashCode.prototype.t2 = function (value) {
    var tmp0_safe_receiver = value;
    var tmp1_elvis_lhs = tmp0_safe_receiver == null ? null : hashCode(tmp0_safe_receiver);
    return tmp1_elvis_lhs == null ? 0 : tmp1_elvis_lhs;
  };
  var HashCode_instance;
  function HashCode_getInstance() {
    if (HashCode_instance == null)
      new HashCode();
    return HashCode_instance;
  }
  function EntrySet($outer) {
    this.u2_1 = $outer;
    AbstractEntrySet.call(this);
  }
  EntrySet.prototype.v2 = function (element) {
    throw UnsupportedOperationException_init_$Create$_0('Add is not supported on entries');
  };
  EntrySet.prototype.a = function (element) {
    return this.v2((!(element == null) ? isInterface(element, MutableEntry) : false) ? element : THROW_CCE());
  };
  EntrySet.prototype.f2 = function (element) {
    return this.u2_1.z(element);
  };
  EntrySet.prototype.d = function () {
    return this.u2_1.a3_1.d();
  };
  EntrySet.prototype.c = function () {
    return this.u2_1.c();
  };
  function HashMap_init_$Init$(internalMap, $this) {
    AbstractMutableMap.call($this);
    HashMap.call($this);
    $this.a3_1 = internalMap;
    $this.b3_1 = internalMap.d3();
    return $this;
  }
  function HashMap_init_$Init$_0($this) {
    HashMap_init_$Init$(new InternalHashCodeMap(HashCode_getInstance()), $this);
    return $this;
  }
  function HashMap_init_$Create$() {
    return HashMap_init_$Init$_0(Object.create(HashMap.prototype));
  }
  function HashMap_init_$Init$_1(initialCapacity, loadFactor, $this) {
    HashMap_init_$Init$_0($this);
    // Inline function 'kotlin.require' call
    var tmp0_require = initialCapacity >= 0;
    // Inline function 'kotlin.contracts.contract' call
    if (!tmp0_require) {
      var tmp$ret$0;
      // Inline function 'kotlin.collections.HashMap.<init>.<anonymous>' call
      tmp$ret$0 = 'Negative initial capacity: ' + initialCapacity;
      var message = tmp$ret$0;
      throw IllegalArgumentException_init_$Create$(toString_2(message));
    }
    // Inline function 'kotlin.require' call
    var tmp1_require = loadFactor >= 0;
    // Inline function 'kotlin.contracts.contract' call
    if (!tmp1_require) {
      var tmp$ret$1;
      // Inline function 'kotlin.collections.HashMap.<init>.<anonymous>' call
      tmp$ret$1 = 'Non-positive load factor: ' + loadFactor;
      var message_0 = tmp$ret$1;
      throw IllegalArgumentException_init_$Create$(toString_2(message_0));
    }
    return $this;
  }
  function HashMap_init_$Create$_0(initialCapacity, loadFactor) {
    return HashMap_init_$Init$_1(initialCapacity, loadFactor, Object.create(HashMap.prototype));
  }
  HashMap.prototype.y = function (key) {
    return this.a3_1.i2(key);
  };
  HashMap.prototype.p = function () {
    if (this.c3_1 == null) {
      this.c3_1 = this.e3();
    }
    return ensureNotNull(this.c3_1);
  };
  HashMap.prototype.e3 = function () {
    return new EntrySet(this);
  };
  HashMap.prototype.a1 = function (key) {
    return this.a3_1.a1(key);
  };
  HashMap.prototype.f3 = function (key, value) {
    return this.a3_1.f3(key, value);
  };
  HashMap.prototype.g3 = function (key) {
    return this.a3_1.g3(key);
  };
  HashMap.prototype.c = function () {
    return this.a3_1.c();
  };
  function HashMap() {
    this.c3_1 = null;
  }
  function HashSet_init_$Init$(initialCapacity, loadFactor, $this) {
    AbstractMutableSet.call($this);
    HashSet.call($this);
    $this.h3_1 = HashMap_init_$Create$_0(initialCapacity, loadFactor);
    return $this;
  }
  function HashSet_init_$Init$_0(initialCapacity, $this) {
    HashSet_init_$Init$(initialCapacity, 0.0, $this);
    return $this;
  }
  function HashSet_init_$Create$(initialCapacity) {
    return HashSet_init_$Init$_0(initialCapacity, Object.create(HashSet.prototype));
  }
  function HashSet_init_$Init$_1(map, $this) {
    AbstractMutableSet.call($this);
    HashSet.call($this);
    $this.h3_1 = map;
    return $this;
  }
  HashSet.prototype.a = function (element) {
    var old = this.h3_1.f3(element, this);
    return old == null;
  };
  HashSet.prototype.i = function (element) {
    return this.h3_1.y(element);
  };
  HashSet.prototype.j = function () {
    return this.h3_1.j();
  };
  HashSet.prototype.d = function () {
    return this.h3_1.n2().d();
  };
  HashSet.prototype.c = function () {
    return this.h3_1.c();
  };
  function HashSet() {
  }
  function computeNext($this) {
    if ($this.l3_1 != null ? $this.m3_1 : false) {
      var tmp$ret$0;
      // Inline function 'kotlin.js.unsafeCast' call
      var tmp0_unsafeCast = $this.l3_1;
      tmp$ret$0 = tmp0_unsafeCast;
      var chainSize = tmp$ret$0.length;
      var tmp0_this = $this;
      tmp0_this.n3_1 = tmp0_this.n3_1 + 1 | 0;
      if (tmp0_this.n3_1 < chainSize)
        return 0;
    }
    var tmp1_this = $this;
    tmp1_this.k3_1 = tmp1_this.k3_1 + 1 | 0;
    if (tmp1_this.k3_1 < $this.j3_1.length) {
      $this.l3_1 = $this.p3_1.r3_1[$this.j3_1[$this.k3_1]];
      var tmp = $this;
      var tmp_0 = $this.l3_1;
      tmp.m3_1 = !(tmp_0 == null) ? isArray(tmp_0) : false;
      $this.n3_1 = 0;
      return 0;
    } else {
      $this.l3_1 = null;
      return 1;
    }
  }
  function getEntry($this, key) {
    var tmp0_elvis_lhs = getChainOrEntryOrNull($this, $this.q3_1.t2(key));
    var tmp;
    if (tmp0_elvis_lhs == null) {
      return null;
    } else {
      tmp = tmp0_elvis_lhs;
    }
    var chainOrEntry = tmp;
    if (!(!(chainOrEntry == null) ? isArray(chainOrEntry) : false)) {
      var entry = chainOrEntry;
      if ($this.q3_1.s2(entry.q(), key)) {
        return entry;
      } else {
        return null;
      }
    } else {
      var chain = chainOrEntry;
      return findEntryInChain(chain, $this, key);
    }
  }
  function findEntryInChain(_this__u8e3s4, $this, key) {
    var tmp$ret$1;
    $l$block: {
      // Inline function 'kotlin.collections.firstOrNull' call
      var indexedObject = _this__u8e3s4;
      var inductionVariable = 0;
      var last = indexedObject.length;
      while (inductionVariable < last) {
        var element = indexedObject[inductionVariable];
        inductionVariable = inductionVariable + 1 | 0;
        var tmp$ret$0;
        // Inline function 'kotlin.collections.InternalHashCodeMap.findEntryInChain.<anonymous>' call
        tmp$ret$0 = $this.q3_1.s2(element.q(), key);
        if (tmp$ret$0) {
          tmp$ret$1 = element;
          break $l$block;
        }
      }
      tmp$ret$1 = null;
    }
    return tmp$ret$1;
  }
  function getChainOrEntryOrNull($this, hashCode) {
    var chainOrEntry = $this.r3_1[hashCode];
    return chainOrEntry === undefined ? null : chainOrEntry;
  }
  function InternalHashCodeMap$iterator$1(this$0) {
    this.p3_1 = this$0;
    this.i3_1 = -1;
    this.j3_1 = Object.keys(this$0.r3_1);
    this.k3_1 = -1;
    this.l3_1 = null;
    this.m3_1 = false;
    this.n3_1 = -1;
    this.o3_1 = null;
  }
  InternalHashCodeMap$iterator$1.prototype.g = function () {
    if (this.i3_1 === -1)
      this.i3_1 = computeNext(this);
    return this.i3_1 === 0;
  };
  InternalHashCodeMap$iterator$1.prototype.e = function () {
    if (!this.g())
      throw NoSuchElementException_init_$Create$();
    var tmp;
    if (this.m3_1) {
      var tmp$ret$0;
      // Inline function 'kotlin.js.unsafeCast' call
      var tmp0_unsafeCast = this.l3_1;
      tmp$ret$0 = tmp0_unsafeCast;
      tmp = tmp$ret$0[this.n3_1];
    } else {
      var tmp$ret$1;
      // Inline function 'kotlin.js.unsafeCast' call
      var tmp1_unsafeCast = this.l3_1;
      tmp$ret$1 = tmp1_unsafeCast;
      tmp = tmp$ret$1;
    }
    var lastEntry = tmp;
    this.o3_1 = lastEntry;
    this.i3_1 = -1;
    return lastEntry;
  };
  InternalHashCodeMap$iterator$1.prototype.n1 = function () {
    var tmp$ret$2;
    // Inline function 'kotlin.checkNotNull' call
    var tmp0_checkNotNull = this.o3_1;
    // Inline function 'kotlin.contracts.contract' call
    var tmp$ret$1;
    $l$block: {
      // Inline function 'kotlin.checkNotNull' call
      // Inline function 'kotlin.contracts.contract' call
      if (tmp0_checkNotNull == null) {
        var tmp$ret$0;
        // Inline function 'kotlin.checkNotNull.<anonymous>' call
        tmp$ret$0 = 'Required value was null.';
        var message = tmp$ret$0;
        throw IllegalStateException_init_$Create$(toString_2(message));
      } else {
        tmp$ret$1 = tmp0_checkNotNull;
        break $l$block;
      }
    }
    tmp$ret$2 = tmp$ret$1;
    this.p3_1.g3(ensureNotNull(this.o3_1).q());
    this.o3_1 = null;
    var tmp0_this = this;
    var tmp1 = tmp0_this.n3_1;
    tmp0_this.n3_1 = tmp1 - 1 | 0;
  };
  function InternalHashCodeMap(equality) {
    this.q3_1 = equality;
    this.r3_1 = this.t3();
    this.s3_1 = 0;
  }
  InternalHashCodeMap.prototype.d3 = function () {
    return this.q3_1;
  };
  InternalHashCodeMap.prototype.c = function () {
    return this.s3_1;
  };
  InternalHashCodeMap.prototype.f3 = function (key, value) {
    var hashCode = this.q3_1.t2(key);
    var chainOrEntry = getChainOrEntryOrNull(this, hashCode);
    if (chainOrEntry == null) {
      this.r3_1[hashCode] = new SimpleEntry(key, value);
    } else {
      if (!(!(chainOrEntry == null) ? isArray(chainOrEntry) : false)) {
        var entry = chainOrEntry;
        if (this.q3_1.s2(entry.q(), key)) {
          return entry.e2(value);
        } else {
          var tmp$ret$2;
          // Inline function 'kotlin.arrayOf' call
          var tmp0_arrayOf = [entry, new SimpleEntry(key, value)];
          var tmp$ret$1;
          // Inline function 'kotlin.js.unsafeCast' call
          var tmp$ret$0;
          // Inline function 'kotlin.js.asDynamic' call
          tmp$ret$0 = tmp0_arrayOf;
          tmp$ret$1 = tmp$ret$0;
          tmp$ret$2 = tmp$ret$1;
          this.r3_1[hashCode] = tmp$ret$2;
          var tmp0_this = this;
          var tmp1 = tmp0_this.s3_1;
          tmp0_this.s3_1 = tmp1 + 1 | 0;
          return null;
        }
      } else {
        var chain = chainOrEntry;
        var entry_0 = findEntryInChain(chain, this, key);
        if (!(entry_0 == null)) {
          return entry_0.e2(value);
        }
        var tmp$ret$3;
        // Inline function 'kotlin.js.asDynamic' call
        tmp$ret$3 = chain;
        tmp$ret$3.push(new SimpleEntry(key, value));
      }
    }
    var tmp2_this = this;
    var tmp3 = tmp2_this.s3_1;
    tmp2_this.s3_1 = tmp3 + 1 | 0;
    return null;
  };
  InternalHashCodeMap.prototype.g3 = function (key) {
    var hashCode = this.q3_1.t2(key);
    var tmp0_elvis_lhs = getChainOrEntryOrNull(this, hashCode);
    var tmp;
    if (tmp0_elvis_lhs == null) {
      return null;
    } else {
      tmp = tmp0_elvis_lhs;
    }
    var chainOrEntry = tmp;
    if (!(!(chainOrEntry == null) ? isArray(chainOrEntry) : false)) {
      var entry = chainOrEntry;
      if (this.q3_1.s2(entry.q(), key)) {
        jsDeleteProperty(this.r3_1, hashCode);
        var tmp1_this = this;
        var tmp2 = tmp1_this.s3_1;
        tmp1_this.s3_1 = tmp2 - 1 | 0;
        return entry.s();
      } else {
        return null;
      }
    } else {
      var chain = chainOrEntry;
      var inductionVariable = 0;
      var last = chain.length - 1 | 0;
      if (inductionVariable <= last)
        do {
          var index = inductionVariable;
          inductionVariable = inductionVariable + 1 | 0;
          var entry_0 = chain[index];
          if (this.q3_1.s2(key, entry_0.q())) {
            if (chain.length === 1) {
              var tmp$ret$0;
              // Inline function 'kotlin.js.asDynamic' call
              tmp$ret$0 = chain;
              tmp$ret$0.length = 0;
              jsDeleteProperty(this.r3_1, hashCode);
            } else {
              var tmp$ret$1;
              // Inline function 'kotlin.js.asDynamic' call
              tmp$ret$1 = chain;
              tmp$ret$1.splice(index, 1);
            }
            var tmp4_this = this;
            var tmp5 = tmp4_this.s3_1;
            tmp4_this.s3_1 = tmp5 - 1 | 0;
            return entry_0.s();
          }
        }
         while (inductionVariable <= last);
    }
    return null;
  };
  InternalHashCodeMap.prototype.i2 = function (key) {
    return !(getEntry(this, key) == null);
  };
  InternalHashCodeMap.prototype.a1 = function (key) {
    var tmp0_safe_receiver = getEntry(this, key);
    return tmp0_safe_receiver == null ? null : tmp0_safe_receiver.s();
  };
  InternalHashCodeMap.prototype.d = function () {
    return new InternalHashCodeMap$iterator$1(this);
  };
  function InternalMap() {
  }
  function EntryIterator($outer) {
    this.w3_1 = $outer;
    this.u3_1 = null;
    this.v3_1 = null;
    this.v3_1 = this.w3_1.h4_1.e4_1;
  }
  EntryIterator.prototype.g = function () {
    return !(this.v3_1 === null);
  };
  EntryIterator.prototype.e = function () {
    if (!this.g())
      throw NoSuchElementException_init_$Create$();
    var current = ensureNotNull(this.v3_1);
    this.u3_1 = current;
    var tmp = this;
    var tmp$ret$1;
    // Inline function 'kotlin.takeIf' call
    var tmp0_takeIf = current.k4_1;
    // Inline function 'kotlin.contracts.contract' call
    var tmp_0;
    var tmp$ret$0;
    // Inline function 'kotlin.collections.EntryIterator.next.<anonymous>' call
    tmp$ret$0 = !(tmp0_takeIf === this.w3_1.h4_1.e4_1);
    if (tmp$ret$0) {
      tmp_0 = tmp0_takeIf;
    } else {
      tmp_0 = null;
    }
    tmp$ret$1 = tmp_0;
    tmp.v3_1 = tmp$ret$1;
    return current;
  };
  EntryIterator.prototype.n1 = function () {
    // Inline function 'kotlin.check' call
    var tmp0_check = !(this.u3_1 == null);
    // Inline function 'kotlin.contracts.contract' call
    // Inline function 'kotlin.check' call
    // Inline function 'kotlin.contracts.contract' call
    if (!tmp0_check) {
      var tmp$ret$0;
      // Inline function 'kotlin.check.<anonymous>' call
      tmp$ret$0 = 'Check failed.';
      var message = tmp$ret$0;
      throw IllegalStateException_init_$Create$(toString_2(message));
    }
    this.w3_1.u1();
    remove(ensureNotNull(this.u3_1), this.w3_1.h4_1);
    this.w3_1.h4_1.f4_1.g3(ensureNotNull(this.u3_1).q());
    this.u3_1 = null;
  };
  function ChainEntry($outer, key, value) {
    this.m4_1 = $outer;
    SimpleEntry.call(this, key, value);
    this.k4_1 = null;
    this.l4_1 = null;
  }
  ChainEntry.prototype.e2 = function (newValue) {
    this.m4_1.u1();
    return SimpleEntry.prototype.e2.call(this, newValue);
  };
  function EntrySet_0($outer) {
    this.h4_1 = $outer;
    AbstractEntrySet.call(this);
  }
  EntrySet_0.prototype.v2 = function (element) {
    throw UnsupportedOperationException_init_$Create$_0('Add is not supported on entries');
  };
  EntrySet_0.prototype.a = function (element) {
    return this.v2((!(element == null) ? isInterface(element, MutableEntry) : false) ? element : THROW_CCE());
  };
  EntrySet_0.prototype.f2 = function (element) {
    return this.h4_1.z(element);
  };
  EntrySet_0.prototype.d = function () {
    return new EntryIterator(this);
  };
  EntrySet_0.prototype.c = function () {
    return this.h4_1.c();
  };
  EntrySet_0.prototype.u1 = function () {
    return this.h4_1.u1();
  };
  function addToEnd(_this__u8e3s4, $this) {
    // Inline function 'kotlin.check' call
    var tmp0_check = _this__u8e3s4.k4_1 == null ? _this__u8e3s4.l4_1 == null : false;
    // Inline function 'kotlin.contracts.contract' call
    // Inline function 'kotlin.check' call
    // Inline function 'kotlin.contracts.contract' call
    if (!tmp0_check) {
      var tmp$ret$0;
      // Inline function 'kotlin.check.<anonymous>' call
      tmp$ret$0 = 'Check failed.';
      var message = tmp$ret$0;
      throw IllegalStateException_init_$Create$(toString_2(message));
    }
    var _head = $this.e4_1;
    if (_head == null) {
      $this.e4_1 = _this__u8e3s4;
      _this__u8e3s4.k4_1 = _this__u8e3s4;
      _this__u8e3s4.l4_1 = _this__u8e3s4;
    } else {
      var tmp$ret$3;
      // Inline function 'kotlin.checkNotNull' call
      var tmp1_checkNotNull = _head.l4_1;
      // Inline function 'kotlin.contracts.contract' call
      var tmp$ret$2;
      $l$block: {
        // Inline function 'kotlin.checkNotNull' call
        // Inline function 'kotlin.contracts.contract' call
        if (tmp1_checkNotNull == null) {
          var tmp$ret$1;
          // Inline function 'kotlin.checkNotNull.<anonymous>' call
          tmp$ret$1 = 'Required value was null.';
          var message_0 = tmp$ret$1;
          throw IllegalStateException_init_$Create$(toString_2(message_0));
        } else {
          tmp$ret$2 = tmp1_checkNotNull;
          break $l$block;
        }
      }
      tmp$ret$3 = tmp$ret$2;
      var _tail = tmp$ret$3;
      _this__u8e3s4.l4_1 = _tail;
      _this__u8e3s4.k4_1 = _head;
      _head.l4_1 = _this__u8e3s4;
      _tail.k4_1 = _this__u8e3s4;
    }
  }
  function remove(_this__u8e3s4, $this) {
    if (_this__u8e3s4.k4_1 === _this__u8e3s4) {
      $this.e4_1 = null;
    } else {
      if ($this.e4_1 === _this__u8e3s4) {
        $this.e4_1 = _this__u8e3s4.k4_1;
      }
      ensureNotNull(_this__u8e3s4.k4_1).l4_1 = _this__u8e3s4.l4_1;
      ensureNotNull(_this__u8e3s4.l4_1).k4_1 = _this__u8e3s4.k4_1;
    }
    _this__u8e3s4.k4_1 = null;
    _this__u8e3s4.l4_1 = null;
  }
  function LinkedHashMap_init_$Init$($this) {
    HashMap_init_$Init$_0($this);
    LinkedHashMap.call($this);
    $this.f4_1 = HashMap_init_$Create$();
    return $this;
  }
  function LinkedHashMap_init_$Create$() {
    return LinkedHashMap_init_$Init$(Object.create(LinkedHashMap.prototype));
  }
  function LinkedHashMap_init_$Init$_0(initialCapacity, loadFactor, $this) {
    HashMap_init_$Init$_1(initialCapacity, loadFactor, $this);
    LinkedHashMap.call($this);
    $this.f4_1 = HashMap_init_$Create$();
    return $this;
  }
  function LinkedHashMap_init_$Create$_0(initialCapacity, loadFactor) {
    return LinkedHashMap_init_$Init$_0(initialCapacity, loadFactor, Object.create(LinkedHashMap.prototype));
  }
  LinkedHashMap.prototype.y = function (key) {
    return this.f4_1.y(key);
  };
  LinkedHashMap.prototype.e3 = function () {
    return new EntrySet_0(this);
  };
  LinkedHashMap.prototype.a1 = function (key) {
    var tmp0_safe_receiver = this.f4_1.a1(key);
    return tmp0_safe_receiver == null ? null : tmp0_safe_receiver.s();
  };
  LinkedHashMap.prototype.f3 = function (key, value) {
    this.u1();
    var old = this.f4_1.a1(key);
    if (old == null) {
      var newEntry = new ChainEntry(this, key, value);
      this.f4_1.f3(key, newEntry);
      addToEnd(newEntry, this);
      return null;
    } else {
      return old.e2(value);
    }
  };
  LinkedHashMap.prototype.g3 = function (key) {
    this.u1();
    var entry = this.f4_1.g3(key);
    if (!(entry == null)) {
      remove(entry, this);
      return entry.s();
    }
    return null;
  };
  LinkedHashMap.prototype.c = function () {
    return this.f4_1.c();
  };
  LinkedHashMap.prototype.u1 = function () {
    if (this.g4_1)
      throw UnsupportedOperationException_init_$Create$();
  };
  function LinkedHashMap() {
    this.e4_1 = null;
    this.g4_1 = false;
  }
  function LinkedHashSet_init_$Init$($this) {
    HashSet_init_$Init$_1(LinkedHashMap_init_$Create$(), $this);
    LinkedHashSet.call($this);
    return $this;
  }
  function LinkedHashSet_init_$Create$() {
    return LinkedHashSet_init_$Init$(Object.create(LinkedHashSet.prototype));
  }
  function LinkedHashSet_init_$Init$_0(elements, $this) {
    HashSet_init_$Init$_1(LinkedHashMap_init_$Create$(), $this);
    LinkedHashSet.call($this);
    $this.h(elements);
    return $this;
  }
  function LinkedHashSet_init_$Create$_0(elements) {
    return LinkedHashSet_init_$Init$_0(elements, Object.create(LinkedHashSet.prototype));
  }
  function LinkedHashSet_init_$Init$_1(initialCapacity, loadFactor, $this) {
    HashSet_init_$Init$_1(LinkedHashMap_init_$Create$_0(initialCapacity, loadFactor), $this);
    LinkedHashSet.call($this);
    return $this;
  }
  function LinkedHashSet_init_$Init$_2(initialCapacity, $this) {
    LinkedHashSet_init_$Init$_1(initialCapacity, 0.0, $this);
    return $this;
  }
  function LinkedHashSet_init_$Create$_1(initialCapacity) {
    return LinkedHashSet_init_$Init$_2(initialCapacity, Object.create(LinkedHashSet.prototype));
  }
  LinkedHashSet.prototype.u1 = function () {
    return this.h3_1.u1();
  };
  function LinkedHashSet() {
  }
  function RandomAccess() {
  }
  function isNaN_0(_this__u8e3s4) {
    return !(_this__u8e3s4 === _this__u8e3s4);
  }
  function StringBuilder_init_$Init$($this) {
    StringBuilder.call($this, '');
    return $this;
  }
  function StringBuilder_init_$Create$() {
    return StringBuilder_init_$Init$(Object.create(StringBuilder.prototype));
  }
  function StringBuilder(content) {
    this.o4_1 = !(content === undefined) ? content : '';
  }
  StringBuilder.prototype.s1 = function () {
    var tmp$ret$0;
    // Inline function 'kotlin.js.asDynamic' call
    var tmp0_asDynamic = this.o4_1;
    tmp$ret$0 = tmp0_asDynamic;
    return tmp$ret$0.length;
  };
  StringBuilder.prototype.r1 = function (value) {
    var tmp0_this = this;
    tmp0_this.o4_1 = tmp0_this.o4_1 + new Char(value);
    return this;
  };
  StringBuilder.prototype.b = function (value) {
    var tmp0_this = this;
    tmp0_this.o4_1 = tmp0_this.o4_1 + toString_1(value);
    return this;
  };
  StringBuilder.prototype.toString = function () {
    return this.o4_1;
  };
  function _Char___init__impl__6a9atx(value) {
    return value;
  }
  function _get_value__a43j40($this) {
    return $this;
  }
  function Char__compareTo_impl_ypi4mb($this, other) {
    return _get_value__a43j40($this) - _get_value__a43j40(other) | 0;
  }
  function Char__compareTo_impl_ypi4mb_0($this, other) {
    var tmp = $this.q1_1;
    return Char__compareTo_impl_ypi4mb(tmp, other instanceof Char ? other.q1_1 : THROW_CCE());
  }
  function Char__equals_impl_x6719k($this, other) {
    if (!(other instanceof Char))
      return false;
    return _get_value__a43j40($this) === _get_value__a43j40(other.q1_1);
  }
  function Char__hashCode_impl_otmys($this) {
    return _get_value__a43j40($this);
  }
  function toString_0($this) {
    var tmp$ret$0;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp0_unsafeCast = String.fromCharCode(_get_value__a43j40($this));
    tmp$ret$0 = tmp0_unsafeCast;
    return tmp$ret$0;
  }
  function Companion_2() {
    Companion_instance_2 = this;
    this.p4_1 = _Char___init__impl__6a9atx(0);
    this.q4_1 = _Char___init__impl__6a9atx(65535);
    this.r4_1 = _Char___init__impl__6a9atx(55296);
    this.s4_1 = _Char___init__impl__6a9atx(56319);
    this.t4_1 = _Char___init__impl__6a9atx(56320);
    this.u4_1 = _Char___init__impl__6a9atx(57343);
    this.v4_1 = _Char___init__impl__6a9atx(55296);
    this.w4_1 = _Char___init__impl__6a9atx(57343);
    this.x4_1 = 2;
    this.y4_1 = 16;
  }
  var Companion_instance_2;
  function Companion_getInstance_2() {
    if (Companion_instance_2 == null)
      new Companion_2();
    return Companion_instance_2;
  }
  function Char(value) {
    Companion_getInstance_2();
    this.q1_1 = value;
  }
  Char.prototype.z4 = function (other) {
    return Char__compareTo_impl_ypi4mb(this.q1_1, other);
  };
  Char.prototype.t1 = function (other) {
    return Char__compareTo_impl_ypi4mb_0(this, other);
  };
  Char.prototype.equals = function (other) {
    return Char__equals_impl_x6719k(this.q1_1, other);
  };
  Char.prototype.hashCode = function () {
    return Char__hashCode_impl_otmys(this.q1_1);
  };
  Char.prototype.toString = function () {
    return toString_0(this.q1_1);
  };
  function Set() {
  }
  function List() {
  }
  function Collection() {
  }
  function MutableIterable() {
  }
  function Entry() {
  }
  function Map() {
  }
  function MutableEntry() {
  }
  function toString_1(_this__u8e3s4) {
    var tmp0_safe_receiver = _this__u8e3s4;
    var tmp1_elvis_lhs = tmp0_safe_receiver == null ? null : toString_2(tmp0_safe_receiver);
    return tmp1_elvis_lhs == null ? 'null' : tmp1_elvis_lhs;
  }
  function implement(interfaces) {
    var maxSize = 1;
    var masks = [];
    var indexedObject = interfaces;
    var inductionVariable = 0;
    var last = indexedObject.length;
    while (inductionVariable < last) {
      var i = indexedObject[inductionVariable];
      inductionVariable = inductionVariable + 1 | 0;
      var currentSize = maxSize;
      var tmp1_elvis_lhs = i.prototype.$imask$;
      var imask = tmp1_elvis_lhs == null ? i.$imask$ : tmp1_elvis_lhs;
      if (!(imask == null)) {
        masks.push(imask);
        currentSize = imask.a5_1.length;
      }
      var iid = i.$metadata$.iid;
      var tmp2_safe_receiver = iid;
      var tmp;
      if (tmp2_safe_receiver == null) {
        tmp = null;
      } else {
        var tmp$ret$4;
        // Inline function 'kotlin.let' call
        // Inline function 'kotlin.contracts.contract' call
        var tmp$ret$3;
        // Inline function 'kotlin.js.implement.<anonymous>' call
        var tmp$ret$2;
        // Inline function 'kotlin.arrayOf' call
        var tmp$ret$1;
        // Inline function 'kotlin.js.unsafeCast' call
        var tmp$ret$0;
        // Inline function 'kotlin.js.asDynamic' call
        tmp$ret$0 = [tmp2_safe_receiver];
        tmp$ret$1 = tmp$ret$0;
        tmp$ret$2 = tmp$ret$1;
        tmp$ret$3 = new BitMask(tmp$ret$2);
        tmp$ret$4 = tmp$ret$3;
        tmp = tmp$ret$4;
      }
      var iidImask = tmp;
      if (!(iidImask == null)) {
        masks.push(iidImask);
        currentSize = Math.max(currentSize, iidImask.a5_1.length);
      }
      if (currentSize > maxSize) {
        maxSize = currentSize;
      }
    }
    var tmp_0 = 0;
    var tmp_1 = maxSize;
    var tmp_2 = new Int32Array(tmp_1);
    while (tmp_0 < tmp_1) {
      var tmp_3 = tmp_0;
      var tmp$ret$5;
      // Inline function 'kotlin.js.implement.<anonymous>' call
      tmp$ret$5 = masks.reduce(implement$lambda(tmp_3), 0);
      tmp_2[tmp_3] = tmp$ret$5;
      tmp_0 = tmp_0 + 1 | 0;
    }
    var resultIntArray = tmp_2;
    var tmp$ret$6;
    // Inline function 'kotlin.emptyArray' call
    tmp$ret$6 = [];
    var result = new BitMask(tmp$ret$6);
    result.a5_1 = resultIntArray;
    return result;
  }
  function BitMask(activeBits) {
    var tmp = this;
    var tmp$ret$2;
    // Inline function 'kotlin.run' call
    // Inline function 'kotlin.contracts.contract' call
    var tmp$ret$1;
    // Inline function 'kotlin.js.BitMask.intArray.<anonymous>' call
    var tmp_0;
    if (activeBits.length === 0) {
      tmp_0 = new Int32Array(0);
    } else {
      var tmp$ret$0;
      // Inline function 'kotlin.js.asDynamic' call
      var tmp0_asDynamic = Math;
      tmp$ret$0 = tmp0_asDynamic;
      var max = tmp$ret$0.max.apply(null, activeBits);
      var intArray = new Int32Array((max >> 5) + 1 | 0);
      var indexedObject = activeBits;
      var inductionVariable = 0;
      var last = indexedObject.length;
      while (inductionVariable < last) {
        var activeBit = indexedObject[inductionVariable];
        inductionVariable = inductionVariable + 1 | 0;
        var numberIndex = activeBit >> 5;
        var positionInNumber = activeBit & 31;
        var numberWithSettledBit = 1 << positionInNumber;
        intArray[numberIndex] = intArray[numberIndex] | numberWithSettledBit;
      }
      tmp_0 = intArray;
    }
    tmp$ret$1 = tmp_0;
    tmp$ret$2 = tmp$ret$1;
    tmp.a5_1 = tmp$ret$2;
  }
  BitMask.prototype.b5 = function (possibleActiveBit) {
    var numberIndex = possibleActiveBit >> 5;
    if (numberIndex > this.a5_1.length)
      return false;
    var positionInNumber = possibleActiveBit & 31;
    var numberWithSettledBit = 1 << positionInNumber;
    return !((this.a5_1[numberIndex] & numberWithSettledBit) === 0);
  };
  function implement$lambda($tmp) {
    return function (acc, it) {
      return $tmp >= it.a5_1.length ? acc : acc | it.a5_1[$tmp];
    };
  }
  function fillArrayVal(array, initValue) {
    var inductionVariable = 0;
    var last = array.length - 1 | 0;
    if (inductionVariable <= last)
      do {
        var i = inductionVariable;
        inductionVariable = inductionVariable + 1 | 0;
        array[i] = initValue;
      }
       while (!(i === last));
    return array;
  }
  function arrayIterator(array) {
    return new arrayIterator$1(array);
  }
  function arrayIterator$1($array) {
    this.d5_1 = $array;
    this.c5_1 = 0;
  }
  arrayIterator$1.prototype.g = function () {
    return !(this.c5_1 === this.d5_1.length);
  };
  arrayIterator$1.prototype.e = function () {
    var tmp;
    if (!(this.c5_1 === this.d5_1.length)) {
      var tmp0_this = this;
      var tmp1 = tmp0_this.c5_1;
      tmp0_this.c5_1 = tmp1 + 1 | 0;
      tmp = this.d5_1[tmp1];
    } else {
      throw NoSuchElementException_init_$Create$_0('' + this.c5_1);
    }
    return tmp;
  };
  function get_buf() {
    init_properties_bitUtils_kt_cxtw9i();
    return buf;
  }
  var buf;
  function get_bufFloat64() {
    init_properties_bitUtils_kt_cxtw9i();
    return bufFloat64;
  }
  var bufFloat64;
  var bufFloat32;
  function get_bufInt32() {
    init_properties_bitUtils_kt_cxtw9i();
    return bufInt32;
  }
  var bufInt32;
  function get_lowIndex() {
    init_properties_bitUtils_kt_cxtw9i();
    return lowIndex;
  }
  var lowIndex;
  function get_highIndex() {
    init_properties_bitUtils_kt_cxtw9i();
    return highIndex;
  }
  var highIndex;
  function getNumberHashCode(obj) {
    init_properties_bitUtils_kt_cxtw9i();
    var tmp$ret$1;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp0_unsafeCast = jsBitwiseOr(obj, 0);
    var tmp$ret$0;
    // Inline function 'kotlin.js.asDynamic' call
    tmp$ret$0 = tmp0_unsafeCast;
    tmp$ret$1 = tmp$ret$0;
    if (tmp$ret$1 === obj) {
      return numberToInt(obj);
    }
    get_bufFloat64()[0] = obj;
    return imul(get_bufInt32()[get_highIndex()], 31) + get_bufInt32()[get_lowIndex()] | 0;
  }
  var properties_initialized_bitUtils_kt_i2bo3e;
  function init_properties_bitUtils_kt_cxtw9i() {
    if (properties_initialized_bitUtils_kt_i2bo3e) {
    } else {
      properties_initialized_bitUtils_kt_i2bo3e = true;
      buf = new ArrayBuffer(8);
      var tmp$ret$1;
      // Inline function 'kotlin.js.unsafeCast' call
      var tmp0_unsafeCast = new Float64Array(get_buf());
      var tmp$ret$0;
      // Inline function 'kotlin.js.asDynamic' call
      tmp$ret$0 = tmp0_unsafeCast;
      tmp$ret$1 = tmp$ret$0;
      bufFloat64 = tmp$ret$1;
      var tmp$ret$1_0;
      // Inline function 'kotlin.js.unsafeCast' call
      var tmp0_unsafeCast_0 = new Float32Array(get_buf());
      var tmp$ret$0_0;
      // Inline function 'kotlin.js.asDynamic' call
      tmp$ret$0_0 = tmp0_unsafeCast_0;
      tmp$ret$1_0 = tmp$ret$0_0;
      bufFloat32 = tmp$ret$1_0;
      var tmp$ret$1_1;
      // Inline function 'kotlin.js.unsafeCast' call
      var tmp0_unsafeCast_1 = new Int32Array(get_buf());
      var tmp$ret$0_1;
      // Inline function 'kotlin.js.asDynamic' call
      tmp$ret$0_1 = tmp0_unsafeCast_1;
      tmp$ret$1_1 = tmp$ret$0_1;
      bufInt32 = tmp$ret$1_1;
      var tmp$ret$1_2;
      // Inline function 'kotlin.run' call
      // Inline function 'kotlin.contracts.contract' call
      var tmp$ret$0_2;
      // Inline function 'kotlin.js.lowIndex.<anonymous>' call
      get_bufFloat64()[0] = -1.0;
      tmp$ret$0_2 = !(get_bufInt32()[0] === 0) ? 1 : 0;
      tmp$ret$1_2 = tmp$ret$0_2;
      lowIndex = tmp$ret$1_2;
      highIndex = 1 - get_lowIndex() | 0;
    }
  }
  function isString(a) {
    return typeof a === 'string';
  }
  function charSequenceLength(a) {
    var tmp;
    if (isString(a)) {
      var tmp$ret$1;
      // Inline function 'kotlin.js.unsafeCast' call
      var tmp$ret$0;
      // Inline function 'kotlin.js.asDynamic' call
      tmp$ret$0 = a;
      var tmp0_unsafeCast = tmp$ret$0.length;
      tmp$ret$1 = tmp0_unsafeCast;
      tmp = tmp$ret$1;
    } else {
      tmp = a.s1();
    }
    return tmp;
  }
  function arrayToString(array) {
    return joinToString$default(array, ', ', '[', ']', 0, null, arrayToString$lambda, 24, null);
  }
  function arrayToString$lambda(it) {
    return toString_2(it);
  }
  function compareTo(a, b) {
    var tmp0_subject = typeof a;
    var tmp;
    switch (tmp0_subject) {
      case 'number':
        var tmp_0;
        if (typeof b === 'number') {
          tmp_0 = doubleCompareTo(a, b);
        } else {
          if (b instanceof Long) {
            tmp_0 = doubleCompareTo(a, b.g5());
          } else {
            tmp_0 = primitiveCompareTo(a, b);
          }
        }

        tmp = tmp_0;
        break;
      case 'string':
      case 'boolean':
        tmp = primitiveCompareTo(a, b);
        break;
      default:
        tmp = compareToDoNotIntrinsicify(a, b);
        break;
    }
    return tmp;
  }
  function doubleCompareTo(a, b) {
    var tmp;
    if (a < b) {
      tmp = -1;
    } else if (a > b) {
      tmp = 1;
    } else if (a === b) {
      var tmp_0;
      if (a !== 0) {
        tmp_0 = 0;
      } else {
        var tmp$ret$0;
        // Inline function 'kotlin.js.asDynamic' call
        tmp$ret$0 = 1;
        var ia = tmp$ret$0 / a;
        var tmp_1;
        var tmp$ret$1;
        // Inline function 'kotlin.js.asDynamic' call
        tmp$ret$1 = 1;
        if (ia === tmp$ret$1 / b) {
          tmp_1 = 0;
        } else {
          if (ia < 0) {
            tmp_1 = -1;
          } else {
            tmp_1 = 1;
          }
        }
        tmp_0 = tmp_1;
      }
      tmp = tmp_0;
    } else if (a !== a) {
      tmp = b !== b ? 0 : 1;
    } else {
      tmp = -1;
    }
    return tmp;
  }
  function primitiveCompareTo(a, b) {
    return a < b ? -1 : a > b ? 1 : 0;
  }
  function compareToDoNotIntrinsicify(a, b) {
    return a.t1(b);
  }
  function getObjectHashCode(obj) {
    if (!jsIn('kotlinHashCodeValue$', obj)) {
      var hash = jsBitwiseOr(Math.random() * 4.294967296E9, 0);
      var descriptor = new Object();
      descriptor.value = hash;
      descriptor.enumerable = false;
      Object.defineProperty(obj, 'kotlinHashCodeValue$', descriptor);
    }
    var tmp$ret$0;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp0_unsafeCast = obj['kotlinHashCodeValue$'];
    tmp$ret$0 = tmp0_unsafeCast;
    return tmp$ret$0;
  }
  function toString_2(o) {
    var tmp;
    if (o == null) {
      tmp = 'null';
    } else if (isArrayish(o)) {
      tmp = '[...]';
    } else {
      var tmp$ret$0;
      // Inline function 'kotlin.js.unsafeCast' call
      var tmp0_unsafeCast = o.toString();
      tmp$ret$0 = tmp0_unsafeCast;
      tmp = tmp$ret$0;
    }
    return tmp;
  }
  function hashCode(obj) {
    if (obj == null)
      return 0;
    var tmp0_subject = typeof obj;
    var tmp;
    switch (tmp0_subject) {
      case 'object':
        tmp = 'function' === typeof obj.hashCode ? obj.hashCode() : getObjectHashCode(obj);
        break;
      case 'function':
        tmp = getObjectHashCode(obj);
        break;
      case 'number':
        tmp = getNumberHashCode(obj);
        break;
      case 'boolean':
        var tmp_0;
        var tmp$ret$0;
        // Inline function 'kotlin.js.unsafeCast' call
        tmp$ret$0 = obj;

        if (tmp$ret$0) {
          tmp_0 = 1;
        } else {
          tmp_0 = 0;
        }

        tmp = tmp_0;
        break;
      default:
        tmp = getStringHashCode(String(obj));
        break;
    }
    return tmp;
  }
  function getStringHashCode(str) {
    var hash = 0;
    var length = str.length;
    var inductionVariable = 0;
    var last = length - 1 | 0;
    if (inductionVariable <= last)
      do {
        var i = inductionVariable;
        inductionVariable = inductionVariable + 1 | 0;
        var tmp$ret$0;
        // Inline function 'kotlin.js.asDynamic' call
        tmp$ret$0 = str;
        var code = tmp$ret$0.charCodeAt(i);
        hash = imul(hash, 31) + code | 0;
      }
       while (!(i === last));
    return hash;
  }
  function equals(obj1, obj2) {
    if (obj1 == null) {
      return obj2 == null;
    }
    if (obj2 == null) {
      return false;
    }
    if (typeof obj1 === 'object' ? typeof obj1.equals === 'function' : false) {
      return obj1.equals(obj2);
    }
    if (obj1 !== obj1) {
      return obj2 !== obj2;
    }
    if (typeof obj1 === 'number' ? typeof obj2 === 'number' : false) {
      var tmp;
      if (obj1 === obj2) {
        var tmp_0;
        if (obj1 !== 0) {
          tmp_0 = true;
        } else {
          var tmp$ret$0;
          // Inline function 'kotlin.js.asDynamic' call
          tmp$ret$0 = 1;
          var tmp_1 = tmp$ret$0 / obj1;
          var tmp$ret$1;
          // Inline function 'kotlin.js.asDynamic' call
          tmp$ret$1 = 1;
          tmp_0 = tmp_1 === tmp$ret$1 / obj2;
        }
        tmp = tmp_0;
      } else {
        tmp = false;
      }
      return tmp;
    }
    return obj1 === obj2;
  }
  function boxIntrinsic(x) {
    throw IllegalStateException_init_$Create$('Should be lowered');
  }
  function unboxIntrinsic(x) {
    throw IllegalStateException_init_$Create$('Should be lowered');
  }
  function captureStack(instance, constructorFunction) {
    if (Error.captureStackTrace != null) {
      Error.captureStackTrace(instance, constructorFunction);
    } else {
      var tmp$ret$0;
      // Inline function 'kotlin.js.asDynamic' call
      tmp$ret$0 = instance;
      tmp$ret$0.stack = (new Error()).stack;
    }
  }
  function extendThrowable(this_, message, cause) {
    Error.call(this_);
    setPropertiesToThrowableInstance(this_, message, cause);
  }
  function setPropertiesToThrowableInstance(this_, message, cause) {
    if (!hasOwnPrototypeProperty(this_, 'message')) {
      var tmp;
      if (message == null) {
        var tmp_0;
        if (!(message === null)) {
          var tmp0_safe_receiver = cause;
          var tmp1_elvis_lhs = tmp0_safe_receiver == null ? null : tmp0_safe_receiver.toString();
          tmp_0 = tmp1_elvis_lhs == null ? undefined : tmp1_elvis_lhs;
        } else {
          tmp_0 = undefined;
        }
        tmp = tmp_0;
      } else {
        tmp = message;
      }
      this_.message = tmp;
    }
    if (!hasOwnPrototypeProperty(this_, 'cause')) {
      this_.cause = cause;
    }
    this_.name = Object.getPrototypeOf(this_).constructor.name;
  }
  function hasOwnPrototypeProperty(o, name) {
    var tmp$ret$0;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp0_unsafeCast = Object.getPrototypeOf(o).hasOwnProperty(name);
    tmp$ret$0 = tmp0_unsafeCast;
    return tmp$ret$0;
  }
  function ensureNotNull(v) {
    var tmp;
    if (v == null) {
      THROW_NPE();
    } else {
      tmp = v;
    }
    return tmp;
  }
  function THROW_NPE() {
    throw NullPointerException_init_$Create$();
  }
  function THROW_CCE() {
    throw ClassCastException_init_$Create$();
  }
  function Companion_3() {
    Companion_instance_3 = this;
    this.h5_1 = new Long(0, -2147483648);
    this.i5_1 = new Long(-1, 2147483647);
    this.j5_1 = 8;
    this.k5_1 = 64;
  }
  var Companion_instance_3;
  function Companion_getInstance_3() {
    if (Companion_instance_3 == null)
      new Companion_3();
    return Companion_instance_3;
  }
  function Long(low, high) {
    Companion_getInstance_3();
    Number_0.call(this);
    this.e5_1 = low;
    this.f5_1 = high;
  }
  Long.prototype.l5 = function (other) {
    return compare(this, other);
  };
  Long.prototype.t1 = function (other) {
    return this.l5(other instanceof Long ? other : THROW_CCE());
  };
  Long.prototype.m5 = function (other) {
    return add(this, other);
  };
  Long.prototype.n5 = function (other) {
    return divide(this, other);
  };
  Long.prototype.o5 = function () {
    return this.p5().m5(new Long(1, 0));
  };
  Long.prototype.p5 = function () {
    return new Long(~this.e5_1, ~this.f5_1);
  };
  Long.prototype.q5 = function () {
    return this.e5_1;
  };
  Long.prototype.g5 = function () {
    return toNumber(this);
  };
  Long.prototype.valueOf = function () {
    return this.g5();
  };
  Long.prototype.equals = function (other) {
    var tmp;
    if (other instanceof Long) {
      tmp = equalsLong(this, other);
    } else {
      tmp = false;
    }
    return tmp;
  };
  Long.prototype.hashCode = function () {
    return hashCode_0(this);
  };
  Long.prototype.toString = function () {
    return toStringImpl(this, 10);
  };
  function get_ZERO() {
    init_properties_longjs_kt_ttk8rv();
    return ZERO;
  }
  var ZERO;
  function get_ONE() {
    init_properties_longjs_kt_ttk8rv();
    return ONE;
  }
  var ONE;
  function get_NEG_ONE() {
    init_properties_longjs_kt_ttk8rv();
    return NEG_ONE;
  }
  var NEG_ONE;
  function get_MAX_VALUE() {
    init_properties_longjs_kt_ttk8rv();
    return MAX_VALUE;
  }
  var MAX_VALUE;
  function get_MIN_VALUE() {
    init_properties_longjs_kt_ttk8rv();
    return MIN_VALUE;
  }
  var MIN_VALUE;
  function get_TWO_PWR_24_() {
    init_properties_longjs_kt_ttk8rv();
    return TWO_PWR_24_;
  }
  var TWO_PWR_24_;
  function compare(_this__u8e3s4, other) {
    init_properties_longjs_kt_ttk8rv();
    if (equalsLong(_this__u8e3s4, other)) {
      return 0;
    }
    var thisNeg = isNegative(_this__u8e3s4);
    var otherNeg = isNegative(other);
    return (thisNeg ? !otherNeg : false) ? -1 : (!thisNeg ? otherNeg : false) ? 1 : isNegative(subtract(_this__u8e3s4, other)) ? -1 : 1;
  }
  function add(_this__u8e3s4, other) {
    init_properties_longjs_kt_ttk8rv();
    var a48 = _this__u8e3s4.f5_1 >>> 16 | 0;
    var a32 = _this__u8e3s4.f5_1 & 65535;
    var a16 = _this__u8e3s4.e5_1 >>> 16 | 0;
    var a00 = _this__u8e3s4.e5_1 & 65535;
    var b48 = other.f5_1 >>> 16 | 0;
    var b32 = other.f5_1 & 65535;
    var b16 = other.e5_1 >>> 16 | 0;
    var b00 = other.e5_1 & 65535;
    var c48 = 0;
    var c32 = 0;
    var c16 = 0;
    var c00 = 0;
    c00 = c00 + (a00 + b00 | 0) | 0;
    c16 = c16 + (c00 >>> 16 | 0) | 0;
    c00 = c00 & 65535;
    c16 = c16 + (a16 + b16 | 0) | 0;
    c32 = c32 + (c16 >>> 16 | 0) | 0;
    c16 = c16 & 65535;
    c32 = c32 + (a32 + b32 | 0) | 0;
    c48 = c48 + (c32 >>> 16 | 0) | 0;
    c32 = c32 & 65535;
    c48 = c48 + (a48 + b48 | 0) | 0;
    c48 = c48 & 65535;
    return new Long(c16 << 16 | c00, c48 << 16 | c32);
  }
  function subtract(_this__u8e3s4, other) {
    init_properties_longjs_kt_ttk8rv();
    return add(_this__u8e3s4, other.o5());
  }
  function multiply(_this__u8e3s4, other) {
    init_properties_longjs_kt_ttk8rv();
    if (isZero(_this__u8e3s4)) {
      return get_ZERO();
    } else if (isZero(other)) {
      return get_ZERO();
    }
    if (equalsLong(_this__u8e3s4, get_MIN_VALUE())) {
      return isOdd(other) ? get_MIN_VALUE() : get_ZERO();
    } else if (equalsLong(other, get_MIN_VALUE())) {
      return isOdd(_this__u8e3s4) ? get_MIN_VALUE() : get_ZERO();
    }
    if (isNegative(_this__u8e3s4)) {
      var tmp;
      if (isNegative(other)) {
        tmp = multiply(negate(_this__u8e3s4), negate(other));
      } else {
        tmp = negate(multiply(negate(_this__u8e3s4), other));
      }
      return tmp;
    } else if (isNegative(other)) {
      return negate(multiply(_this__u8e3s4, negate(other)));
    }
    if (lessThan(_this__u8e3s4, get_TWO_PWR_24_()) ? lessThan(other, get_TWO_PWR_24_()) : false) {
      return fromNumber(toNumber(_this__u8e3s4) * toNumber(other));
    }
    var a48 = _this__u8e3s4.f5_1 >>> 16 | 0;
    var a32 = _this__u8e3s4.f5_1 & 65535;
    var a16 = _this__u8e3s4.e5_1 >>> 16 | 0;
    var a00 = _this__u8e3s4.e5_1 & 65535;
    var b48 = other.f5_1 >>> 16 | 0;
    var b32 = other.f5_1 & 65535;
    var b16 = other.e5_1 >>> 16 | 0;
    var b00 = other.e5_1 & 65535;
    var c48 = 0;
    var c32 = 0;
    var c16 = 0;
    var c00 = 0;
    c00 = c00 + imul(a00, b00) | 0;
    c16 = c16 + (c00 >>> 16 | 0) | 0;
    c00 = c00 & 65535;
    c16 = c16 + imul(a16, b00) | 0;
    c32 = c32 + (c16 >>> 16 | 0) | 0;
    c16 = c16 & 65535;
    c16 = c16 + imul(a00, b16) | 0;
    c32 = c32 + (c16 >>> 16 | 0) | 0;
    c16 = c16 & 65535;
    c32 = c32 + imul(a32, b00) | 0;
    c48 = c48 + (c32 >>> 16 | 0) | 0;
    c32 = c32 & 65535;
    c32 = c32 + imul(a16, b16) | 0;
    c48 = c48 + (c32 >>> 16 | 0) | 0;
    c32 = c32 & 65535;
    c32 = c32 + imul(a00, b32) | 0;
    c48 = c48 + (c32 >>> 16 | 0) | 0;
    c32 = c32 & 65535;
    c48 = c48 + (((imul(a48, b00) + imul(a32, b16) | 0) + imul(a16, b32) | 0) + imul(a00, b48) | 0) | 0;
    c48 = c48 & 65535;
    return new Long(c16 << 16 | c00, c48 << 16 | c32);
  }
  function divide(_this__u8e3s4, other) {
    init_properties_longjs_kt_ttk8rv();
    if (isZero(other)) {
      throw Exception_init_$Create$('division by zero');
    } else if (isZero(_this__u8e3s4)) {
      return get_ZERO();
    }
    if (equalsLong(_this__u8e3s4, get_MIN_VALUE())) {
      if (equalsLong(other, get_ONE()) ? true : equalsLong(other, get_NEG_ONE())) {
        return get_MIN_VALUE();
      } else if (equalsLong(other, get_MIN_VALUE())) {
        return get_ONE();
      } else {
        var halfThis = shiftRight(_this__u8e3s4, 1);
        var approx = shiftLeft(halfThis.n5(other), 1);
        if (equalsLong(approx, get_ZERO())) {
          return isNegative(other) ? get_ONE() : get_NEG_ONE();
        } else {
          var rem = subtract(_this__u8e3s4, multiply(other, approx));
          return add(approx, rem.n5(other));
        }
      }
    } else if (equalsLong(other, get_MIN_VALUE())) {
      return get_ZERO();
    }
    if (isNegative(_this__u8e3s4)) {
      var tmp;
      if (isNegative(other)) {
        tmp = negate(_this__u8e3s4).n5(negate(other));
      } else {
        tmp = negate(negate(_this__u8e3s4).n5(other));
      }
      return tmp;
    } else if (isNegative(other)) {
      return negate(_this__u8e3s4.n5(negate(other)));
    }
    var res = get_ZERO();
    var rem_0 = _this__u8e3s4;
    while (greaterThanOrEqual(rem_0, other)) {
      var approxDouble = toNumber(rem_0) / toNumber(other);
      var approx2 = Math.max(1.0, Math.floor(approxDouble));
      var log2 = Math.ceil(Math.log(approx2) / Math.LN2);
      var delta = log2 <= 48.0 ? 1.0 : Math.pow(2.0, log2 - 48);
      var approxRes = fromNumber(approx2);
      var approxRem = multiply(approxRes, other);
      while (isNegative(approxRem) ? true : greaterThan(approxRem, rem_0)) {
        approx2 = approx2 - delta;
        approxRes = fromNumber(approx2);
        approxRem = multiply(approxRes, other);
      }
      if (isZero(approxRes)) {
        approxRes = get_ONE();
      }
      res = add(res, approxRes);
      rem_0 = subtract(rem_0, approxRem);
    }
    return res;
  }
  function shiftLeft(_this__u8e3s4, numBits) {
    init_properties_longjs_kt_ttk8rv();
    var numBits_0 = numBits & 63;
    if (numBits_0 === 0) {
      return _this__u8e3s4;
    } else {
      if (numBits_0 < 32) {
        return new Long(_this__u8e3s4.e5_1 << numBits_0, _this__u8e3s4.f5_1 << numBits_0 | (_this__u8e3s4.e5_1 >>> (32 - numBits_0 | 0) | 0));
      } else {
        return new Long(0, _this__u8e3s4.e5_1 << (numBits_0 - 32 | 0));
      }
    }
  }
  function shiftRight(_this__u8e3s4, numBits) {
    init_properties_longjs_kt_ttk8rv();
    var numBits_0 = numBits & 63;
    if (numBits_0 === 0) {
      return _this__u8e3s4;
    } else {
      if (numBits_0 < 32) {
        return new Long(_this__u8e3s4.e5_1 >>> numBits_0 | 0 | _this__u8e3s4.f5_1 << (32 - numBits_0 | 0), _this__u8e3s4.f5_1 >> numBits_0);
      } else {
        return new Long(_this__u8e3s4.f5_1 >> (numBits_0 - 32 | 0), _this__u8e3s4.f5_1 >= 0 ? 0 : -1);
      }
    }
  }
  function toNumber(_this__u8e3s4) {
    init_properties_longjs_kt_ttk8rv();
    return _this__u8e3s4.f5_1 * 4.294967296E9 + getLowBitsUnsigned(_this__u8e3s4);
  }
  function equalsLong(_this__u8e3s4, other) {
    init_properties_longjs_kt_ttk8rv();
    return _this__u8e3s4.f5_1 === other.f5_1 ? _this__u8e3s4.e5_1 === other.e5_1 : false;
  }
  function hashCode_0(l) {
    init_properties_longjs_kt_ttk8rv();
    return l.e5_1 ^ l.f5_1;
  }
  function toStringImpl(_this__u8e3s4, radix) {
    init_properties_longjs_kt_ttk8rv();
    if (radix < 2 ? true : 36 < radix) {
      throw Exception_init_$Create$('radix out of range: ' + radix);
    }
    if (isZero(_this__u8e3s4)) {
      return '0';
    }
    if (isNegative(_this__u8e3s4)) {
      if (equalsLong(_this__u8e3s4, get_MIN_VALUE())) {
        var radixLong = fromInt(radix);
        var div = _this__u8e3s4.n5(radixLong);
        var rem = subtract(multiply(div, radixLong), _this__u8e3s4).q5();
        var tmp = toStringImpl(div, radix);
        var tmp$ret$1;
        // Inline function 'kotlin.js.unsafeCast' call
        var tmp$ret$0;
        // Inline function 'kotlin.js.asDynamic' call
        tmp$ret$0 = rem;
        var tmp0_unsafeCast = tmp$ret$0.toString(radix);
        tmp$ret$1 = tmp0_unsafeCast;
        return tmp + tmp$ret$1;
      } else {
        return '-' + toStringImpl(negate(_this__u8e3s4), radix);
      }
    }
    var digitsPerTime = radix === 2 ? 31 : radix <= 10 ? 9 : radix <= 21 ? 7 : radix <= 35 ? 6 : 5;
    var radixToPower = fromNumber(Math.pow(radix, digitsPerTime));
    var rem_0 = _this__u8e3s4;
    var result = '';
    while (true) {
      var remDiv = rem_0.n5(radixToPower);
      var intval = subtract(rem_0, multiply(remDiv, radixToPower)).q5();
      var tmp$ret$3;
      // Inline function 'kotlin.js.unsafeCast' call
      var tmp$ret$2;
      // Inline function 'kotlin.js.asDynamic' call
      tmp$ret$2 = intval;
      var tmp1_unsafeCast = tmp$ret$2.toString(radix);
      tmp$ret$3 = tmp1_unsafeCast;
      var digits = tmp$ret$3;
      rem_0 = remDiv;
      if (isZero(rem_0)) {
        return digits + result;
      } else {
        while (digits.length < digitsPerTime) {
          digits = '0' + digits;
        }
        result = digits + result;
      }
    }
  }
  function fromInt(value) {
    init_properties_longjs_kt_ttk8rv();
    return new Long(value, value < 0 ? -1 : 0);
  }
  function isNegative(_this__u8e3s4) {
    init_properties_longjs_kt_ttk8rv();
    return _this__u8e3s4.f5_1 < 0;
  }
  function isZero(_this__u8e3s4) {
    init_properties_longjs_kt_ttk8rv();
    return _this__u8e3s4.f5_1 === 0 ? _this__u8e3s4.e5_1 === 0 : false;
  }
  function isOdd(_this__u8e3s4) {
    init_properties_longjs_kt_ttk8rv();
    return (_this__u8e3s4.e5_1 & 1) === 1;
  }
  function negate(_this__u8e3s4) {
    init_properties_longjs_kt_ttk8rv();
    return _this__u8e3s4.o5();
  }
  function lessThan(_this__u8e3s4, other) {
    init_properties_longjs_kt_ttk8rv();
    return compare(_this__u8e3s4, other) < 0;
  }
  function fromNumber(value) {
    init_properties_longjs_kt_ttk8rv();
    if (isNaN_0(value)) {
      return get_ZERO();
    } else if (value <= -9.223372036854776E18) {
      return get_MIN_VALUE();
    } else if (value + 1 >= 9.223372036854776E18) {
      return get_MAX_VALUE();
    } else if (value < 0.0) {
      return negate(fromNumber(-value));
    } else {
      var twoPwr32 = 4.294967296E9;
      return new Long(jsBitwiseOr(value % twoPwr32, 0), jsBitwiseOr(value / twoPwr32, 0));
    }
  }
  function greaterThan(_this__u8e3s4, other) {
    init_properties_longjs_kt_ttk8rv();
    return compare(_this__u8e3s4, other) > 0;
  }
  function greaterThanOrEqual(_this__u8e3s4, other) {
    init_properties_longjs_kt_ttk8rv();
    return compare(_this__u8e3s4, other) >= 0;
  }
  function getLowBitsUnsigned(_this__u8e3s4) {
    init_properties_longjs_kt_ttk8rv();
    return _this__u8e3s4.e5_1 >= 0 ? _this__u8e3s4.e5_1 : 4.294967296E9 + _this__u8e3s4.e5_1;
  }
  var properties_initialized_longjs_kt_5aju7t;
  function init_properties_longjs_kt_ttk8rv() {
    if (properties_initialized_longjs_kt_5aju7t) {
    } else {
      properties_initialized_longjs_kt_5aju7t = true;
      ZERO = fromInt(0);
      ONE = fromInt(1);
      NEG_ONE = fromInt(-1);
      MAX_VALUE = new Long(-1, 2147483647);
      MIN_VALUE = new Long(0, -2147483648);
      TWO_PWR_24_ = fromInt(16777216);
    }
  }
  function numberToInt(a) {
    var tmp;
    if (a instanceof Long) {
      tmp = a.q5();
    } else {
      tmp = doubleToInt(a);
    }
    return tmp;
  }
  function doubleToInt(a) {
    return a > 2.147483647E9 ? 2147483647 : a < -2.147483648E9 ? -2147483648 : jsBitwiseOr(a, 0);
  }
  function numberToDouble(a) {
    var tmp$ret$0;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp0_unsafeCast = +a;
    tmp$ret$0 = tmp0_unsafeCast;
    return tmp$ret$0;
  }
  function classMeta(name, associatedObjectKey, associatedObjects, suspendArity) {
    return createMetadata('class', name, associatedObjectKey, associatedObjects, suspendArity, null);
  }
  function createMetadata(kind, name, associatedObjectKey, associatedObjects, suspendArity, iid) {
    return {kind: kind, simpleName: name, associatedObjectKey: associatedObjectKey, associatedObjects: associatedObjects, suspendArity: suspendArity, $kClass$: undefined, iid: iid};
  }
  function isArrayish(o) {
    return isJsArray(o) ? true : isView(o);
  }
  function isJsArray(obj) {
    var tmp$ret$0;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp0_unsafeCast = Array.isArray(obj);
    tmp$ret$0 = tmp0_unsafeCast;
    return tmp$ret$0;
  }
  function setMetadataFor(ctor, name, metadataConstructor, parent, interfaces, associatedObjectKey, associatedObjects, suspendArity) {
    if (!(parent == null)) {
      ctor.prototype = Object.create(parent.prototype);
      ctor.prototype.constructor = ctor;
    }
    var metadata = metadataConstructor(name, associatedObjectKey, associatedObjects, suspendArity);
    ctor.$metadata$ = metadata;
    if (!(interfaces == null)) {
      var receiver = !(metadata.iid == null) ? ctor : ctor.prototype;
      receiver.$imask$ = implement(interfaces.slice());
    }
  }
  function isInterface(obj, iface) {
    var tmp;
    if (obj.$imask$ != null) {
      tmp = isInterfaceImpl(obj, iface.$metadata$.iid);
    } else {
      tmp = verySlowIsInterfaceImpl(obj, iface);
    }
    return tmp;
  }
  function isInterfaceImpl(obj, iface) {
    var tmp$ret$0;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp0_unsafeCast = obj.$imask$;
    tmp$ret$0 = tmp0_unsafeCast;
    var tmp0_elvis_lhs = tmp$ret$0;
    var tmp;
    if (tmp0_elvis_lhs == null) {
      return false;
    } else {
      tmp = tmp0_elvis_lhs;
    }
    var mask = tmp;
    return mask.b5(iface);
  }
  function verySlowIsInterfaceImpl(obj, iface) {
    var tmp0_elvis_lhs = searchForMetadata(obj);
    var tmp;
    if (tmp0_elvis_lhs == null) {
      return false;
    } else {
      tmp = tmp0_elvis_lhs;
    }
    var metadata = tmp;
    var tmp$ret$0;
    // Inline function 'kotlin.js.asDynamic' call
    tmp$ret$0 = metadata;
    var interfaces = tmp$ret$0.associatedObjectKey;
    var tmp_0;
    if (interfaces != null) {
      var tmp_1;
      if (interfaces.indexOf(iface) != -1) {
        tmp_1 = true;
      } else {
        tmp_1 = interfaces.some(verySlowIsInterfaceImpl$lambda(iface));
      }
      tmp_0 = tmp_1;
    } else {
      tmp_0 = false;
    }
    if (tmp_0) {
      return true;
    }
    return verySlowIsInterfaceImpl(getPrototypeOf(obj), iface);
  }
  function searchForMetadata(obj) {
    if (obj == null) {
      return null;
    }
    var metadata = obj.$metadata$;
    var currentObject = getPrototypeOf(obj);
    while (metadata == null ? currentObject != null : false) {
      var currentConstructor = currentObject.constructor;
      metadata = currentConstructor.$metadata$;
      currentObject = getPrototypeOf(currentObject);
    }
    return metadata;
  }
  function getPrototypeOf(obj) {
    return Object.getPrototypeOf(obj);
  }
  function isArray(obj) {
    var tmp;
    if (isJsArray(obj)) {
      var tmp$ret$0;
      // Inline function 'kotlin.js.asDynamic' call
      tmp$ret$0 = obj;
      tmp = !tmp$ret$0.$type$;
    } else {
      tmp = false;
    }
    return tmp;
  }
  function isObject(obj) {
    var objTypeOf = typeof obj;
    var tmp0_subject = objTypeOf;
    switch (tmp0_subject) {
      case 'string':
        return true;
      case 'number':
        return true;
      case 'boolean':
        return true;
      case 'function':
        return true;
      default:
        return jsInstanceOf(obj, Object);
    }
  }
  function isNumber(a) {
    var tmp;
    if (typeof a === 'number') {
      tmp = true;
    } else {
      tmp = a instanceof Long;
    }
    return tmp;
  }
  function isComparable(value) {
    var type = typeof value;
    return ((type === 'string' ? true : type === 'boolean') ? true : isNumber(value)) ? true : isInterface(value, Comparable);
  }
  function isCharSequence(value) {
    return typeof value === 'string' ? true : isInterface(value, CharSequence);
  }
  function interfaceMeta(name, associatedObjectKey, associatedObjects, suspendArity) {
    return createMetadata('interface', name, associatedObjectKey, associatedObjects, suspendArity, generateInterfaceId(InterfaceIdService_getInstance()));
  }
  function generateInterfaceId(_this__u8e3s4) {
    var tmp0_this = _this__u8e3s4;
    tmp0_this.r5_1 = tmp0_this.r5_1 + 1 | 0;
    return _this__u8e3s4.r5_1;
  }
  function InterfaceIdService() {
    InterfaceIdService_instance = this;
    this.r5_1 = 0;
  }
  var InterfaceIdService_instance;
  function InterfaceIdService_getInstance() {
    if (InterfaceIdService_instance == null)
      new InterfaceIdService();
    return InterfaceIdService_instance;
  }
  function objectMeta(name, associatedObjectKey, associatedObjects, suspendArity) {
    return createMetadata('object', name, associatedObjectKey, associatedObjects, suspendArity, null);
  }
  function verySlowIsInterfaceImpl$lambda($iface) {
    return function (x) {
      return verySlowIsInterfaceImpl(x, $iface);
    };
  }
  function asList(_this__u8e3s4) {
    var tmp$ret$1;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp$ret$0;
    // Inline function 'kotlin.js.asDynamic' call
    tmp$ret$0 = _this__u8e3s4;
    tmp$ret$1 = tmp$ret$0;
    return new ArrayList(tmp$ret$1);
  }
  function sort_0(_this__u8e3s4) {
    if (_this__u8e3s4.length > 1) {
      sortArray(_this__u8e3s4);
    }
  }
  function Exception_init_$Init$($this) {
    extendThrowable($this, void 1, void 1);
    Exception.call($this);
    return $this;
  }
  function Exception_init_$Init$_0(message, $this) {
    extendThrowable($this, message, void 1);
    Exception.call($this);
    return $this;
  }
  function Exception_init_$Create$(message) {
    var tmp = Exception_init_$Init$_0(message, Object.create(Exception.prototype));
    captureStack(tmp, Exception_init_$Create$);
    return tmp;
  }
  function Exception() {
    captureStack(this, Exception);
  }
  function IllegalArgumentException_init_$Init$(message, $this) {
    RuntimeException_init_$Init$_0(message, $this);
    IllegalArgumentException.call($this);
    return $this;
  }
  function IllegalArgumentException_init_$Create$(message) {
    var tmp = IllegalArgumentException_init_$Init$(message, Object.create(IllegalArgumentException.prototype));
    captureStack(tmp, IllegalArgumentException_init_$Create$);
    return tmp;
  }
  function IllegalArgumentException() {
    captureStack(this, IllegalArgumentException);
  }
  function IllegalStateException_init_$Init$(message, $this) {
    RuntimeException_init_$Init$_0(message, $this);
    IllegalStateException.call($this);
    return $this;
  }
  function IllegalStateException_init_$Create$(message) {
    var tmp = IllegalStateException_init_$Init$(message, Object.create(IllegalStateException.prototype));
    captureStack(tmp, IllegalStateException_init_$Create$);
    return tmp;
  }
  function IllegalStateException() {
    captureStack(this, IllegalStateException);
  }
  function NoSuchElementException_init_$Init$($this) {
    RuntimeException_init_$Init$($this);
    NoSuchElementException.call($this);
    return $this;
  }
  function NoSuchElementException_init_$Create$() {
    var tmp = NoSuchElementException_init_$Init$(Object.create(NoSuchElementException.prototype));
    captureStack(tmp, NoSuchElementException_init_$Create$);
    return tmp;
  }
  function NoSuchElementException_init_$Init$_0(message, $this) {
    RuntimeException_init_$Init$_0(message, $this);
    NoSuchElementException.call($this);
    return $this;
  }
  function NoSuchElementException_init_$Create$_0(message) {
    var tmp = NoSuchElementException_init_$Init$_0(message, Object.create(NoSuchElementException.prototype));
    captureStack(tmp, NoSuchElementException_init_$Create$_0);
    return tmp;
  }
  function NoSuchElementException() {
    captureStack(this, NoSuchElementException);
  }
  function RuntimeException_init_$Init$($this) {
    Exception_init_$Init$($this);
    RuntimeException.call($this);
    return $this;
  }
  function RuntimeException_init_$Init$_0(message, $this) {
    Exception_init_$Init$_0(message, $this);
    RuntimeException.call($this);
    return $this;
  }
  function RuntimeException() {
    captureStack(this, RuntimeException);
  }
  function UnsupportedOperationException_init_$Init$($this) {
    RuntimeException_init_$Init$($this);
    UnsupportedOperationException.call($this);
    return $this;
  }
  function UnsupportedOperationException_init_$Create$() {
    var tmp = UnsupportedOperationException_init_$Init$(Object.create(UnsupportedOperationException.prototype));
    captureStack(tmp, UnsupportedOperationException_init_$Create$);
    return tmp;
  }
  function UnsupportedOperationException_init_$Init$_0(message, $this) {
    RuntimeException_init_$Init$_0(message, $this);
    UnsupportedOperationException.call($this);
    return $this;
  }
  function UnsupportedOperationException_init_$Create$_0(message) {
    var tmp = UnsupportedOperationException_init_$Init$_0(message, Object.create(UnsupportedOperationException.prototype));
    captureStack(tmp, UnsupportedOperationException_init_$Create$_0);
    return tmp;
  }
  function UnsupportedOperationException() {
    captureStack(this, UnsupportedOperationException);
  }
  function IndexOutOfBoundsException_init_$Init$(message, $this) {
    RuntimeException_init_$Init$_0(message, $this);
    IndexOutOfBoundsException.call($this);
    return $this;
  }
  function IndexOutOfBoundsException_init_$Create$(message) {
    var tmp = IndexOutOfBoundsException_init_$Init$(message, Object.create(IndexOutOfBoundsException.prototype));
    captureStack(tmp, IndexOutOfBoundsException_init_$Create$);
    return tmp;
  }
  function IndexOutOfBoundsException() {
    captureStack(this, IndexOutOfBoundsException);
  }
  function NullPointerException_init_$Init$($this) {
    RuntimeException_init_$Init$($this);
    NullPointerException.call($this);
    return $this;
  }
  function NullPointerException_init_$Create$() {
    var tmp = NullPointerException_init_$Init$(Object.create(NullPointerException.prototype));
    captureStack(tmp, NullPointerException_init_$Create$);
    return tmp;
  }
  function NullPointerException() {
    captureStack(this, NullPointerException);
  }
  function ClassCastException_init_$Init$($this) {
    RuntimeException_init_$Init$($this);
    ClassCastException.call($this);
    return $this;
  }
  function ClassCastException_init_$Create$() {
    var tmp = ClassCastException_init_$Init$(Object.create(ClassCastException.prototype));
    captureStack(tmp, ClassCastException_init_$Create$);
    return tmp;
  }
  function ClassCastException() {
    captureStack(this, ClassCastException);
  }
  function jsIn(lhs_hack, rhs_hack) {
    var tmp$ret$0;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp0_unsafeCast = lhs_hack in rhs_hack;
    tmp$ret$0 = tmp0_unsafeCast;
    return tmp$ret$0;
  }
  function jsBitwiseOr(lhs_hack, rhs_hack) {
    var tmp$ret$0;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp0_unsafeCast = lhs_hack | rhs_hack;
    tmp$ret$0 = tmp0_unsafeCast;
    return tmp$ret$0;
  }
  function jsDeleteProperty(obj_hack, property_hack) {
    delete obj_hack[property_hack];
  }
  function jsTypeOf(value_hack) {
    var tmp$ret$0;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp0_unsafeCast = typeof value_hack;
    tmp$ret$0 = tmp0_unsafeCast;
    return tmp$ret$0;
  }
  function jsInstanceOf(obj_hack, jsClass_hack) {
    var tmp$ret$0;
    // Inline function 'kotlin.js.unsafeCast' call
    var tmp0_unsafeCast = obj_hack instanceof jsClass_hack;
    tmp$ret$0 = tmp0_unsafeCast;
    return tmp$ret$0;
  }
  //region block: post-declaration
  InternalHashCodeMap.prototype.t3 = createJsMap;
  //endregion
  //region block: init
  _stableSortingIsSupported = null;
  //endregion
  //region block: exports
  _.$_$ = _.$_$ || {};
  _.$_$.a = joinToString$default_0;
  _.$_$.b = ArrayList_init_$Create$_0;
  _.$_$.c = ArrayList_init_$Create$;
  _.$_$.d = IllegalArgumentException_init_$Create$;
  _.$_$.e = Unit_getInstance;
  _.$_$.f = collectionSizeOrDefault;
  _.$_$.g = intersect;
  _.$_$.h = plus;
  _.$_$.i = setOf;
  _.$_$.j = sorted;
  _.$_$.k = toSet;
  _.$_$.l = charSequenceLength;
  _.$_$.m = classMeta;
  _.$_$.n = compareTo;
  _.$_$.o = equals;
  _.$_$.p = getNumberHashCode;
  _.$_$.q = getStringHashCode;
  _.$_$.r = hashCode;
  _.$_$.s = numberToDouble;
  _.$_$.t = numberToInt;
  _.$_$.u = setMetadataFor;
  _.$_$.v = Comparable;
  _.$_$.w = THROW_CCE;
  //endregion
  return _;
}));

//# sourceMappingURL=kotlin-kotlin-stdlib-js-ir.js.map
