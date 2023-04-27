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
  var classMeta = kotlin_kotlin.$_$.m;
  var setMetadataFor = kotlin_kotlin.$_$.u;
  var Unit_getInstance = kotlin_kotlin.$_$.e;
  var numberToDouble = kotlin_kotlin.$_$.s;
  var numberToInt = kotlin_kotlin.$_$.t;
  var IllegalArgumentException_init_$Create$ = kotlin_kotlin.$_$.d;
  var sorted = kotlin_kotlin.$_$.j;
  var ArrayList_init_$Create$ = kotlin_kotlin.$_$.c;
  var charSequenceLength = kotlin_kotlin.$_$.l;
  var joinToString$default = kotlin_kotlin.$_$.a;
  var hashCode = kotlin_kotlin.$_$.r;
  var THROW_CCE = kotlin_kotlin.$_$.w;
  var equals = kotlin_kotlin.$_$.o;
  var compareTo = kotlin_kotlin.$_$.n;
  var getNumberHashCode = kotlin_kotlin.$_$.p;
  var Comparable = kotlin_kotlin.$_$.v;
  var toSet = kotlin_kotlin.$_$.k;
  var collectionSizeOrDefault = kotlin_kotlin.$_$.f;
  var ArrayList_init_$Create$_0 = kotlin_kotlin.$_$.b;
  var intersect = kotlin_kotlin.$_$.g;
  var plus = kotlin_kotlin.$_$.h;
  var setOf = kotlin_kotlin.$_$.i;
  var getStringHashCode = kotlin_kotlin.$_$.q;
  //endregion
  //region block: pre-declaration
  setMetadataFor(Expression, 'Expression', classMeta, undefined, [Comparable], undefined, undefined, []);
  setMetadataFor(Ampere, 'Ampere', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(Candela, 'Candela', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(Kelvin, 'Kelvin', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(Kilogram, 'Kilogram', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(Metre, 'Metre', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(Mole, 'Mole', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(Second, 'Second', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(DerivedUnit, 'DerivedUnit', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(Dimensions, 'Dimensions', classMeta, undefined, undefined, undefined, undefined, []);
  setMetadataFor(Factor, 'Factor', classMeta, undefined, [Comparable], undefined, undefined, []);
  setMetadataFor(UnitSpecification, 'UnitSpecification', classMeta, undefined, undefined, undefined, undefined, []);
  setMetadataFor(AustralianDollar, 'AustralianDollar', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(BrazilianReal, 'BrazilianReal', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(CanadianDollar, 'CanadianDollar', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(ChileanPeso, 'ChileanPeso', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(ColombianPeso, 'ColombianPeso', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(CzechKoruna, 'CzechKoruna', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(DanishKrone, 'DanishKrone', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(Euro, 'Euro', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(HongKongDollar, 'HongKongDollar', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(HungarianForint, 'HungarianForint', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(IndianRupee, 'IndianRupee', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(IndonesianRupiah, 'IndonesianRupiah', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(IsraeliNewShekel, 'IsraeliNewShekel', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(JapaneseYen, 'JapaneseYen', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(MalaysianRinggit, 'MalaysianRinggit', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(MexicanPeso, 'MexicanPeso', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(NewTaiwanDollar, 'NewTaiwanDollar', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(NewZealandDollar, 'NewZealandDollar', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(NorwegianKrone, 'NorwegianKrone', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(PhilippinePeso, 'PhilippinePeso', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(PolishZłoty, 'PolishZ\u0142oty', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(PoundSterling, 'PoundSterling', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(Renminbi, 'Renminbi', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(RomanianLeu, 'RomanianLeu', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(RussianRuble, 'RussianRuble', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(SaudiRiyal, 'SaudiRiyal', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(SingaporeDollar, 'SingaporeDollar', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(SouthAfricanRand, 'SouthAfricanRand', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(SouthKoreanWon, 'SouthKoreanWon', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(SwedishKrona, 'SwedishKrona', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(SwissFranc, 'SwissFranc', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(ThaiBaht, 'ThaiBaht', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(TurkishLira, 'TurkishLira', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(UAEDirham, 'UAEDirham', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(UnitedStatesDollar, 'UnitedStatesDollar', classMeta, Expression, undefined, undefined, undefined, []);
  setMetadataFor(Becquerel, 'Becquerel', classMeta, DerivedUnit, undefined, undefined, undefined, []);
  setMetadataFor(Coulomb, 'Coulomb', classMeta, DerivedUnit, undefined, undefined, undefined, []);
  setMetadataFor(Farad, 'Farad', classMeta, DerivedUnit, undefined, undefined, undefined, []);
  setMetadataFor(Gray, 'Gray', classMeta, DerivedUnit, undefined, undefined, undefined, []);
  setMetadataFor(Henry, 'Henry', classMeta, DerivedUnit, undefined, undefined, undefined, []);
  setMetadataFor(Hertz, 'Hertz', classMeta, DerivedUnit, undefined, undefined, undefined, []);
  setMetadataFor(Joule, 'Joule', classMeta, DerivedUnit, undefined, undefined, undefined, []);
  setMetadataFor(Katal, 'Katal', classMeta, DerivedUnit, undefined, undefined, undefined, []);
  setMetadataFor(Lumen, 'Lumen', classMeta, DerivedUnit, undefined, undefined, undefined, []);
  setMetadataFor(Lux, 'Lux', classMeta, DerivedUnit, undefined, undefined, undefined, []);
  setMetadataFor(Newton, 'Newton', classMeta, DerivedUnit, undefined, undefined, undefined, []);
  setMetadataFor(Ohm, 'Ohm', classMeta, DerivedUnit, undefined, undefined, undefined, []);
  setMetadataFor(Pascal, 'Pascal', classMeta, DerivedUnit, undefined, undefined, undefined, []);
  setMetadataFor(Radian, 'Radian', classMeta, DerivedUnit, undefined, undefined, undefined, []);
  setMetadataFor(Siemens, 'Siemens', classMeta, DerivedUnit, undefined, undefined, undefined, []);
  setMetadataFor(Sievert, 'Sievert', classMeta, DerivedUnit, undefined, undefined, undefined, []);
  setMetadataFor(Steradian, 'Steradian', classMeta, DerivedUnit, undefined, undefined, undefined, []);
  setMetadataFor(Tesla, 'Tesla', classMeta, DerivedUnit, undefined, undefined, undefined, []);
  setMetadataFor(Volt, 'Volt', classMeta, DerivedUnit, undefined, undefined, undefined, []);
  setMetadataFor(Watt, 'Watt', classMeta, DerivedUnit, undefined, undefined, undefined, []);
  setMetadataFor(Weber, 'Weber', classMeta, DerivedUnit, undefined, undefined, undefined, []);
  setMetadataFor(Thing, 'Thing', classMeta, Expression, undefined, undefined, undefined, []);
  //endregion
  function get_descriptionAmpere() {
    init_properties_Ampere_kt_ivxk1y();
    return descriptionAmpere;
  }
  var descriptionAmpere;
  function get_A() {
    init_properties_Ampere_kt_ivxk1y();
    return A;
  }
  var A;
  function get_QA() {
    init_properties_Ampere_kt_ivxk1y();
    return QA;
  }
  var QA;
  function get_quettaampere() {
    init_properties_Ampere_kt_ivxk1y();
    return quettaampere;
  }
  var quettaampere;
  function get_RA() {
    init_properties_Ampere_kt_ivxk1y();
    return RA;
  }
  var RA;
  function get_ronnaampere() {
    init_properties_Ampere_kt_ivxk1y();
    return ronnaampere;
  }
  var ronnaampere;
  function get_YA() {
    init_properties_Ampere_kt_ivxk1y();
    return YA;
  }
  var YA;
  function get_yottaampere() {
    init_properties_Ampere_kt_ivxk1y();
    return yottaampere;
  }
  var yottaampere;
  function get_ZA() {
    init_properties_Ampere_kt_ivxk1y();
    return ZA;
  }
  var ZA;
  function get_zettaampere() {
    init_properties_Ampere_kt_ivxk1y();
    return zettaampere;
  }
  var zettaampere;
  function get_EA() {
    init_properties_Ampere_kt_ivxk1y();
    return EA;
  }
  var EA;
  function get_exaampere() {
    init_properties_Ampere_kt_ivxk1y();
    return exaampere;
  }
  var exaampere;
  function get_PA() {
    init_properties_Ampere_kt_ivxk1y();
    return PA;
  }
  var PA;
  function get_petaampere() {
    init_properties_Ampere_kt_ivxk1y();
    return petaampere;
  }
  var petaampere;
  function get_TA() {
    init_properties_Ampere_kt_ivxk1y();
    return TA;
  }
  var TA;
  function get_teraampere() {
    init_properties_Ampere_kt_ivxk1y();
    return teraampere;
  }
  var teraampere;
  function get_GA() {
    init_properties_Ampere_kt_ivxk1y();
    return GA;
  }
  var GA;
  function get_gigaampere() {
    init_properties_Ampere_kt_ivxk1y();
    return gigaampere;
  }
  var gigaampere;
  function get_MA() {
    init_properties_Ampere_kt_ivxk1y();
    return MA;
  }
  var MA;
  function get_megaampere() {
    init_properties_Ampere_kt_ivxk1y();
    return megaampere;
  }
  var megaampere;
  function get_kA() {
    init_properties_Ampere_kt_ivxk1y();
    return kA;
  }
  var kA;
  function get_kiloampere() {
    init_properties_Ampere_kt_ivxk1y();
    return kiloampere;
  }
  var kiloampere;
  function get_hA() {
    init_properties_Ampere_kt_ivxk1y();
    return hA;
  }
  var hA;
  function get_hectoampere() {
    init_properties_Ampere_kt_ivxk1y();
    return hectoampere;
  }
  var hectoampere;
  function get_daA() {
    init_properties_Ampere_kt_ivxk1y();
    return daA;
  }
  var daA;
  function get_decaampere() {
    init_properties_Ampere_kt_ivxk1y();
    return decaampere;
  }
  var decaampere;
  function get_dA() {
    init_properties_Ampere_kt_ivxk1y();
    return dA;
  }
  var dA;
  function get_deciampere() {
    init_properties_Ampere_kt_ivxk1y();
    return deciampere;
  }
  var deciampere;
  function get_cA() {
    init_properties_Ampere_kt_ivxk1y();
    return cA;
  }
  var cA;
  function get_centiampere() {
    init_properties_Ampere_kt_ivxk1y();
    return centiampere;
  }
  var centiampere;
  function get_mA() {
    init_properties_Ampere_kt_ivxk1y();
    return mA;
  }
  var mA;
  function get_milliampere() {
    init_properties_Ampere_kt_ivxk1y();
    return milliampere;
  }
  var milliampere;
  function get_μA() {
    init_properties_Ampere_kt_ivxk1y();
    return μA;
  }
  var μA;
  function get_microampere() {
    init_properties_Ampere_kt_ivxk1y();
    return microampere;
  }
  var microampere;
  function get_nA() {
    init_properties_Ampere_kt_ivxk1y();
    return nA;
  }
  var nA;
  function get_nanoampere() {
    init_properties_Ampere_kt_ivxk1y();
    return nanoampere;
  }
  var nanoampere;
  function get_pA() {
    init_properties_Ampere_kt_ivxk1y();
    return pA;
  }
  var pA;
  function get_picoampere() {
    init_properties_Ampere_kt_ivxk1y();
    return picoampere;
  }
  var picoampere;
  function get_fA() {
    init_properties_Ampere_kt_ivxk1y();
    return fA;
  }
  var fA;
  function get_femtoampere() {
    init_properties_Ampere_kt_ivxk1y();
    return femtoampere;
  }
  var femtoampere;
  function get_aA() {
    init_properties_Ampere_kt_ivxk1y();
    return aA;
  }
  var aA;
  function get_attoampere() {
    init_properties_Ampere_kt_ivxk1y();
    return attoampere;
  }
  var attoampere;
  function get_zA() {
    init_properties_Ampere_kt_ivxk1y();
    return zA;
  }
  var zA;
  function get_zeptoampere() {
    init_properties_Ampere_kt_ivxk1y();
    return zeptoampere;
  }
  var zeptoampere;
  function get_yA() {
    init_properties_Ampere_kt_ivxk1y();
    return yA;
  }
  var yA;
  function get_yoctoampere() {
    init_properties_Ampere_kt_ivxk1y();
    return yoctoampere;
  }
  var yoctoampere;
  function get_rA() {
    init_properties_Ampere_kt_ivxk1y();
    return rA;
  }
  var rA;
  function get_rontoampere() {
    init_properties_Ampere_kt_ivxk1y();
    return rontoampere;
  }
  var rontoampere;
  function get_qA() {
    init_properties_Ampere_kt_ivxk1y();
    return qA;
  }
  var qA;
  function get_quectoampere() {
    init_properties_Ampere_kt_ivxk1y();
    return quectoampere;
  }
  var quectoampere;
  function Ampere(value) {
    Expression_init_$Init$(value, get_descriptionAmpere(), this);
  }
  function descriptionAmpere$lambda(v) {
    init_properties_Ampere_kt_ivxk1y();
    return new Ampere(v);
  }
  var properties_initialized_Ampere_kt_h12exi;
  function init_properties_Ampere_kt_ivxk1y() {
    if (properties_initialized_Ampere_kt_h12exi) {
    } else {
      properties_initialized_Ampere_kt_h12exi = true;
      descriptionAmpere = new UnitSpecification('A', 'I', 70, descriptionAmpere$lambda);
      A = new Ampere(1.0);
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 30.0);
      QA = new Ampere(tmp$ret$0);
      quettaampere = get_QA();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 27.0);
      RA = new Ampere(tmp$ret$0_0);
      ronnaampere = get_RA();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 24.0);
      YA = new Ampere(tmp$ret$0_1);
      yottaampere = get_YA();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 21.0);
      ZA = new Ampere(tmp$ret$0_2);
      zettaampere = get_ZA();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 18.0);
      EA = new Ampere(tmp$ret$0_3);
      exaampere = get_EA();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 15.0);
      PA = new Ampere(tmp$ret$0_4);
      petaampere = get_PA();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 12.0);
      TA = new Ampere(tmp$ret$0_5);
      teraampere = get_TA();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 9.0);
      GA = new Ampere(tmp$ret$0_6);
      gigaampere = get_GA();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 6.0);
      MA = new Ampere(tmp$ret$0_7);
      megaampere = get_MA();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, 3.0);
      kA = new Ampere(tmp$ret$0_8);
      kiloampere = get_kA();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, 2.0);
      hA = new Ampere(tmp$ret$0_9);
      hectoampere = get_hA();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, 1.0);
      daA = new Ampere(tmp$ret$0_10);
      decaampere = get_daA();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -1.0);
      dA = new Ampere(tmp$ret$0_11);
      deciampere = get_dA();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -2.0);
      cA = new Ampere(tmp$ret$0_12);
      centiampere = get_cA();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -3.0);
      mA = new Ampere(tmp$ret$0_13);
      milliampere = get_mA();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -6.0);
      μA = new Ampere(tmp$ret$0_14);
      microampere = get_μA();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -9.0);
      nA = new Ampere(tmp$ret$0_15);
      nanoampere = get_nA();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -12.0);
      pA = new Ampere(tmp$ret$0_16);
      picoampere = get_pA();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -15.0);
      fA = new Ampere(tmp$ret$0_17);
      femtoampere = get_fA();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -18.0);
      aA = new Ampere(tmp$ret$0_18);
      attoampere = get_aA();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -21.0);
      zA = new Ampere(tmp$ret$0_19);
      zeptoampere = get_zA();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -24.0);
      yA = new Ampere(tmp$ret$0_20);
      yoctoampere = get_yA();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -27.0);
      rA = new Ampere(tmp$ret$0_21);
      rontoampere = get_rA();
      var tmp$ret$0_22;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_22 = Math.pow(10.0, -30.0);
      qA = new Ampere(tmp$ret$0_22);
      quectoampere = get_qA();
    }
  }
  function get_descriptionCandela() {
    init_properties_Candela_kt_6zdhim();
    return descriptionCandela;
  }
  var descriptionCandela;
  function get_cd() {
    init_properties_Candela_kt_6zdhim();
    return cd;
  }
  var cd;
  function get_Qcd() {
    init_properties_Candela_kt_6zdhim();
    return Qcd;
  }
  var Qcd;
  function get_quettacandela() {
    init_properties_Candela_kt_6zdhim();
    return quettacandela;
  }
  var quettacandela;
  function get_Rcd() {
    init_properties_Candela_kt_6zdhim();
    return Rcd;
  }
  var Rcd;
  function get_ronnacandela() {
    init_properties_Candela_kt_6zdhim();
    return ronnacandela;
  }
  var ronnacandela;
  function get_Ycd() {
    init_properties_Candela_kt_6zdhim();
    return Ycd;
  }
  var Ycd;
  function get_yottacandela() {
    init_properties_Candela_kt_6zdhim();
    return yottacandela;
  }
  var yottacandela;
  function get_Zcd() {
    init_properties_Candela_kt_6zdhim();
    return Zcd;
  }
  var Zcd;
  function get_zettacandela() {
    init_properties_Candela_kt_6zdhim();
    return zettacandela;
  }
  var zettacandela;
  function get_Ecd() {
    init_properties_Candela_kt_6zdhim();
    return Ecd;
  }
  var Ecd;
  function get_exacandela() {
    init_properties_Candela_kt_6zdhim();
    return exacandela;
  }
  var exacandela;
  function get_Pcd() {
    init_properties_Candela_kt_6zdhim();
    return Pcd;
  }
  var Pcd;
  function get_petacandela() {
    init_properties_Candela_kt_6zdhim();
    return petacandela;
  }
  var petacandela;
  function get_Tcd() {
    init_properties_Candela_kt_6zdhim();
    return Tcd;
  }
  var Tcd;
  function get_teracandela() {
    init_properties_Candela_kt_6zdhim();
    return teracandela;
  }
  var teracandela;
  function get_Gcd() {
    init_properties_Candela_kt_6zdhim();
    return Gcd;
  }
  var Gcd;
  function get_gigacandela() {
    init_properties_Candela_kt_6zdhim();
    return gigacandela;
  }
  var gigacandela;
  function get_Mcd() {
    init_properties_Candela_kt_6zdhim();
    return Mcd;
  }
  var Mcd;
  function get_megacandela() {
    init_properties_Candela_kt_6zdhim();
    return megacandela;
  }
  var megacandela;
  function get_kcd() {
    init_properties_Candela_kt_6zdhim();
    return kcd;
  }
  var kcd;
  function get_kilocandela() {
    init_properties_Candela_kt_6zdhim();
    return kilocandela;
  }
  var kilocandela;
  function get_hcd() {
    init_properties_Candela_kt_6zdhim();
    return hcd;
  }
  var hcd;
  function get_hectocandela() {
    init_properties_Candela_kt_6zdhim();
    return hectocandela;
  }
  var hectocandela;
  function get_dacd() {
    init_properties_Candela_kt_6zdhim();
    return dacd;
  }
  var dacd;
  function get_decacandela() {
    init_properties_Candela_kt_6zdhim();
    return decacandela;
  }
  var decacandela;
  function get_dcd() {
    init_properties_Candela_kt_6zdhim();
    return dcd;
  }
  var dcd;
  function get_decicandela() {
    init_properties_Candela_kt_6zdhim();
    return decicandela;
  }
  var decicandela;
  function get_ccd() {
    init_properties_Candela_kt_6zdhim();
    return ccd;
  }
  var ccd;
  function get_centicandela() {
    init_properties_Candela_kt_6zdhim();
    return centicandela;
  }
  var centicandela;
  function get_mcd() {
    init_properties_Candela_kt_6zdhim();
    return mcd;
  }
  var mcd;
  function get_millicandela() {
    init_properties_Candela_kt_6zdhim();
    return millicandela;
  }
  var millicandela;
  function get_μcd() {
    init_properties_Candela_kt_6zdhim();
    return μcd;
  }
  var μcd;
  function get_microcandela() {
    init_properties_Candela_kt_6zdhim();
    return microcandela;
  }
  var microcandela;
  function get_ncd() {
    init_properties_Candela_kt_6zdhim();
    return ncd;
  }
  var ncd;
  function get_nanocandela() {
    init_properties_Candela_kt_6zdhim();
    return nanocandela;
  }
  var nanocandela;
  function get_pcd() {
    init_properties_Candela_kt_6zdhim();
    return pcd;
  }
  var pcd;
  function get_picocandela() {
    init_properties_Candela_kt_6zdhim();
    return picocandela;
  }
  var picocandela;
  function get_fcd() {
    init_properties_Candela_kt_6zdhim();
    return fcd;
  }
  var fcd;
  function get_femtocandela() {
    init_properties_Candela_kt_6zdhim();
    return femtocandela;
  }
  var femtocandela;
  function get_acd() {
    init_properties_Candela_kt_6zdhim();
    return acd;
  }
  var acd;
  function get_attocandela() {
    init_properties_Candela_kt_6zdhim();
    return attocandela;
  }
  var attocandela;
  function get_zcd() {
    init_properties_Candela_kt_6zdhim();
    return zcd;
  }
  var zcd;
  function get_zeptocandela() {
    init_properties_Candela_kt_6zdhim();
    return zeptocandela;
  }
  var zeptocandela;
  function get_ycd() {
    init_properties_Candela_kt_6zdhim();
    return ycd;
  }
  var ycd;
  function get_yoctocandela() {
    init_properties_Candela_kt_6zdhim();
    return yoctocandela;
  }
  var yoctocandela;
  function get_rcd() {
    init_properties_Candela_kt_6zdhim();
    return rcd;
  }
  var rcd;
  function get_rontocandela() {
    init_properties_Candela_kt_6zdhim();
    return rontocandela;
  }
  var rontocandela;
  function get_qcd() {
    init_properties_Candela_kt_6zdhim();
    return qcd;
  }
  var qcd;
  function get_quectocandela() {
    init_properties_Candela_kt_6zdhim();
    return quectocandela;
  }
  var quectocandela;
  function Candela(value) {
    Expression_init_$Init$(value, get_descriptionCandela(), this);
  }
  function descriptionCandela$lambda(v) {
    init_properties_Candela_kt_6zdhim();
    return new Candela(v);
  }
  var properties_initialized_Candela_kt_u278lm;
  function init_properties_Candela_kt_6zdhim() {
    if (properties_initialized_Candela_kt_u278lm) {
    } else {
      properties_initialized_Candela_kt_u278lm = true;
      descriptionCandela = new UnitSpecification('cd', 'J', 40, descriptionCandela$lambda);
      cd = new Candela(1.0);
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 30.0);
      Qcd = new Candela(tmp$ret$0);
      quettacandela = get_Qcd();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 27.0);
      Rcd = new Candela(tmp$ret$0_0);
      ronnacandela = get_Rcd();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 24.0);
      Ycd = new Candela(tmp$ret$0_1);
      yottacandela = get_Ycd();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 21.0);
      Zcd = new Candela(tmp$ret$0_2);
      zettacandela = get_Zcd();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 18.0);
      Ecd = new Candela(tmp$ret$0_3);
      exacandela = get_Ecd();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 15.0);
      Pcd = new Candela(tmp$ret$0_4);
      petacandela = get_Pcd();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 12.0);
      Tcd = new Candela(tmp$ret$0_5);
      teracandela = get_Tcd();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 9.0);
      Gcd = new Candela(tmp$ret$0_6);
      gigacandela = get_Gcd();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 6.0);
      Mcd = new Candela(tmp$ret$0_7);
      megacandela = get_Mcd();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, 3.0);
      kcd = new Candela(tmp$ret$0_8);
      kilocandela = get_kcd();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, 2.0);
      hcd = new Candela(tmp$ret$0_9);
      hectocandela = get_hcd();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, 1.0);
      dacd = new Candela(tmp$ret$0_10);
      decacandela = get_dacd();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -1.0);
      dcd = new Candela(tmp$ret$0_11);
      decicandela = get_dcd();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -2.0);
      ccd = new Candela(tmp$ret$0_12);
      centicandela = get_ccd();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -3.0);
      mcd = new Candela(tmp$ret$0_13);
      millicandela = get_mcd();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -6.0);
      μcd = new Candela(tmp$ret$0_14);
      microcandela = get_μcd();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -9.0);
      ncd = new Candela(tmp$ret$0_15);
      nanocandela = get_ncd();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -12.0);
      pcd = new Candela(tmp$ret$0_16);
      picocandela = get_pcd();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -15.0);
      fcd = new Candela(tmp$ret$0_17);
      femtocandela = get_fcd();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -18.0);
      acd = new Candela(tmp$ret$0_18);
      attocandela = get_acd();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -21.0);
      zcd = new Candela(tmp$ret$0_19);
      zeptocandela = get_zcd();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -24.0);
      ycd = new Candela(tmp$ret$0_20);
      yoctocandela = get_ycd();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -27.0);
      rcd = new Candela(tmp$ret$0_21);
      rontocandela = get_rcd();
      var tmp$ret$0_22;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_22 = Math.pow(10.0, -30.0);
      qcd = new Candela(tmp$ret$0_22);
      quectocandela = get_qcd();
    }
  }
  function get_descriptionKelvin() {
    init_properties_Kelvin_kt_6u40tt();
    return descriptionKelvin;
  }
  var descriptionKelvin;
  function get_K() {
    init_properties_Kelvin_kt_6u40tt();
    return K;
  }
  var K;
  function get_QK() {
    init_properties_Kelvin_kt_6u40tt();
    return QK;
  }
  var QK;
  function get_quettakelvin() {
    init_properties_Kelvin_kt_6u40tt();
    return quettakelvin;
  }
  var quettakelvin;
  function get_RK() {
    init_properties_Kelvin_kt_6u40tt();
    return RK;
  }
  var RK;
  function get_ronnakelvin() {
    init_properties_Kelvin_kt_6u40tt();
    return ronnakelvin;
  }
  var ronnakelvin;
  function get_YK() {
    init_properties_Kelvin_kt_6u40tt();
    return YK;
  }
  var YK;
  function get_yottakelvin() {
    init_properties_Kelvin_kt_6u40tt();
    return yottakelvin;
  }
  var yottakelvin;
  function get_ZK() {
    init_properties_Kelvin_kt_6u40tt();
    return ZK;
  }
  var ZK;
  function get_zettakelvin() {
    init_properties_Kelvin_kt_6u40tt();
    return zettakelvin;
  }
  var zettakelvin;
  function get_EK() {
    init_properties_Kelvin_kt_6u40tt();
    return EK;
  }
  var EK;
  function get_exakelvin() {
    init_properties_Kelvin_kt_6u40tt();
    return exakelvin;
  }
  var exakelvin;
  function get_PK() {
    init_properties_Kelvin_kt_6u40tt();
    return PK;
  }
  var PK;
  function get_petakelvin() {
    init_properties_Kelvin_kt_6u40tt();
    return petakelvin;
  }
  var petakelvin;
  function get_TK() {
    init_properties_Kelvin_kt_6u40tt();
    return TK;
  }
  var TK;
  function get_terakelvin() {
    init_properties_Kelvin_kt_6u40tt();
    return terakelvin;
  }
  var terakelvin;
  function get_GK() {
    init_properties_Kelvin_kt_6u40tt();
    return GK;
  }
  var GK;
  function get_gigakelvin() {
    init_properties_Kelvin_kt_6u40tt();
    return gigakelvin;
  }
  var gigakelvin;
  function get_MK() {
    init_properties_Kelvin_kt_6u40tt();
    return MK;
  }
  var MK;
  function get_megakelvin() {
    init_properties_Kelvin_kt_6u40tt();
    return megakelvin;
  }
  var megakelvin;
  function get_kK() {
    init_properties_Kelvin_kt_6u40tt();
    return kK;
  }
  var kK;
  function get_kilokelvin() {
    init_properties_Kelvin_kt_6u40tt();
    return kilokelvin;
  }
  var kilokelvin;
  function get_hK() {
    init_properties_Kelvin_kt_6u40tt();
    return hK;
  }
  var hK;
  function get_hectokelvin() {
    init_properties_Kelvin_kt_6u40tt();
    return hectokelvin;
  }
  var hectokelvin;
  function get_daK() {
    init_properties_Kelvin_kt_6u40tt();
    return daK;
  }
  var daK;
  function get_decakelvin() {
    init_properties_Kelvin_kt_6u40tt();
    return decakelvin;
  }
  var decakelvin;
  function get_dK() {
    init_properties_Kelvin_kt_6u40tt();
    return dK;
  }
  var dK;
  function get_decikelvin() {
    init_properties_Kelvin_kt_6u40tt();
    return decikelvin;
  }
  var decikelvin;
  function get_cK() {
    init_properties_Kelvin_kt_6u40tt();
    return cK;
  }
  var cK;
  function get_centikelvin() {
    init_properties_Kelvin_kt_6u40tt();
    return centikelvin;
  }
  var centikelvin;
  function get_mK() {
    init_properties_Kelvin_kt_6u40tt();
    return mK;
  }
  var mK;
  function get_millikelvin() {
    init_properties_Kelvin_kt_6u40tt();
    return millikelvin;
  }
  var millikelvin;
  function get_μK() {
    init_properties_Kelvin_kt_6u40tt();
    return μK;
  }
  var μK;
  function get_microkelvin() {
    init_properties_Kelvin_kt_6u40tt();
    return microkelvin;
  }
  var microkelvin;
  function get_nK() {
    init_properties_Kelvin_kt_6u40tt();
    return nK;
  }
  var nK;
  function get_nanokelvin() {
    init_properties_Kelvin_kt_6u40tt();
    return nanokelvin;
  }
  var nanokelvin;
  function get_pK() {
    init_properties_Kelvin_kt_6u40tt();
    return pK;
  }
  var pK;
  function get_picokelvin() {
    init_properties_Kelvin_kt_6u40tt();
    return picokelvin;
  }
  var picokelvin;
  function get_fK() {
    init_properties_Kelvin_kt_6u40tt();
    return fK;
  }
  var fK;
  function get_femtokelvin() {
    init_properties_Kelvin_kt_6u40tt();
    return femtokelvin;
  }
  var femtokelvin;
  function get_aK() {
    init_properties_Kelvin_kt_6u40tt();
    return aK;
  }
  var aK;
  function get_attokelvin() {
    init_properties_Kelvin_kt_6u40tt();
    return attokelvin;
  }
  var attokelvin;
  function get_zK() {
    init_properties_Kelvin_kt_6u40tt();
    return zK;
  }
  var zK;
  function get_zeptokelvin() {
    init_properties_Kelvin_kt_6u40tt();
    return zeptokelvin;
  }
  var zeptokelvin;
  function get_yK() {
    init_properties_Kelvin_kt_6u40tt();
    return yK;
  }
  var yK;
  function get_yoctokelvin() {
    init_properties_Kelvin_kt_6u40tt();
    return yoctokelvin;
  }
  var yoctokelvin;
  function get_rK() {
    init_properties_Kelvin_kt_6u40tt();
    return rK;
  }
  var rK;
  function get_rontokelvin() {
    init_properties_Kelvin_kt_6u40tt();
    return rontokelvin;
  }
  var rontokelvin;
  function get_qK() {
    init_properties_Kelvin_kt_6u40tt();
    return qK;
  }
  var qK;
  function get_quectokelvin() {
    init_properties_Kelvin_kt_6u40tt();
    return quectokelvin;
  }
  var quectokelvin;
  function Kelvin(value) {
    Expression_init_$Init$(value, get_descriptionKelvin(), this);
  }
  function descriptionKelvin$lambda(v) {
    init_properties_Kelvin_kt_6u40tt();
    return new Kelvin(v);
  }
  var properties_initialized_Kelvin_kt_t2vy5n;
  function init_properties_Kelvin_kt_6u40tt() {
    if (properties_initialized_Kelvin_kt_t2vy5n) {
    } else {
      properties_initialized_Kelvin_kt_t2vy5n = true;
      descriptionKelvin = new UnitSpecification('K', '\u0398', 60, descriptionKelvin$lambda);
      K = new Kelvin(1.0);
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 30.0);
      QK = new Kelvin(tmp$ret$0);
      quettakelvin = get_QK();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 27.0);
      RK = new Kelvin(tmp$ret$0_0);
      ronnakelvin = get_RK();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 24.0);
      YK = new Kelvin(tmp$ret$0_1);
      yottakelvin = get_YK();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 21.0);
      ZK = new Kelvin(tmp$ret$0_2);
      zettakelvin = get_ZK();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 18.0);
      EK = new Kelvin(tmp$ret$0_3);
      exakelvin = get_EK();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 15.0);
      PK = new Kelvin(tmp$ret$0_4);
      petakelvin = get_PK();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 12.0);
      TK = new Kelvin(tmp$ret$0_5);
      terakelvin = get_TK();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 9.0);
      GK = new Kelvin(tmp$ret$0_6);
      gigakelvin = get_GK();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 6.0);
      MK = new Kelvin(tmp$ret$0_7);
      megakelvin = get_MK();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, 3.0);
      kK = new Kelvin(tmp$ret$0_8);
      kilokelvin = get_kK();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, 2.0);
      hK = new Kelvin(tmp$ret$0_9);
      hectokelvin = get_hK();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, 1.0);
      daK = new Kelvin(tmp$ret$0_10);
      decakelvin = get_daK();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -1.0);
      dK = new Kelvin(tmp$ret$0_11);
      decikelvin = get_dK();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -2.0);
      cK = new Kelvin(tmp$ret$0_12);
      centikelvin = get_cK();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -3.0);
      mK = new Kelvin(tmp$ret$0_13);
      millikelvin = get_mK();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -6.0);
      μK = new Kelvin(tmp$ret$0_14);
      microkelvin = get_μK();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -9.0);
      nK = new Kelvin(tmp$ret$0_15);
      nanokelvin = get_nK();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -12.0);
      pK = new Kelvin(tmp$ret$0_16);
      picokelvin = get_pK();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -15.0);
      fK = new Kelvin(tmp$ret$0_17);
      femtokelvin = get_fK();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -18.0);
      aK = new Kelvin(tmp$ret$0_18);
      attokelvin = get_aK();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -21.0);
      zK = new Kelvin(tmp$ret$0_19);
      zeptokelvin = get_zK();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -24.0);
      yK = new Kelvin(tmp$ret$0_20);
      yoctokelvin = get_yK();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -27.0);
      rK = new Kelvin(tmp$ret$0_21);
      rontokelvin = get_rK();
      var tmp$ret$0_22;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_22 = Math.pow(10.0, -30.0);
      qK = new Kelvin(tmp$ret$0_22);
      quectokelvin = get_qK();
    }
  }
  function get_descriptionKilogram() {
    init_properties_Kilogram_kt_6mfdcy();
    return descriptionKilogram;
  }
  var descriptionKilogram;
  function get_kg() {
    init_properties_Kilogram_kt_6mfdcy();
    return kg;
  }
  var kg;
  function get_Qkg() {
    init_properties_Kilogram_kt_6mfdcy();
    return Qkg;
  }
  var Qkg;
  function get_quettakilogram() {
    init_properties_Kilogram_kt_6mfdcy();
    return quettakilogram;
  }
  var quettakilogram;
  function get_Rkg() {
    init_properties_Kilogram_kt_6mfdcy();
    return Rkg;
  }
  var Rkg;
  function get_ronnakilogram() {
    init_properties_Kilogram_kt_6mfdcy();
    return ronnakilogram;
  }
  var ronnakilogram;
  function get_Ykg() {
    init_properties_Kilogram_kt_6mfdcy();
    return Ykg;
  }
  var Ykg;
  function get_yottakilogram() {
    init_properties_Kilogram_kt_6mfdcy();
    return yottakilogram;
  }
  var yottakilogram;
  function get_Zkg() {
    init_properties_Kilogram_kt_6mfdcy();
    return Zkg;
  }
  var Zkg;
  function get_zettakilogram() {
    init_properties_Kilogram_kt_6mfdcy();
    return zettakilogram;
  }
  var zettakilogram;
  function get_Ekg() {
    init_properties_Kilogram_kt_6mfdcy();
    return Ekg;
  }
  var Ekg;
  function get_exakilogram() {
    init_properties_Kilogram_kt_6mfdcy();
    return exakilogram;
  }
  var exakilogram;
  function get_Pkg() {
    init_properties_Kilogram_kt_6mfdcy();
    return Pkg;
  }
  var Pkg;
  function get_petakilogram() {
    init_properties_Kilogram_kt_6mfdcy();
    return petakilogram;
  }
  var petakilogram;
  function get_Tkg() {
    init_properties_Kilogram_kt_6mfdcy();
    return Tkg;
  }
  var Tkg;
  function get_terakilogram() {
    init_properties_Kilogram_kt_6mfdcy();
    return terakilogram;
  }
  var terakilogram;
  function get_Gkg() {
    init_properties_Kilogram_kt_6mfdcy();
    return Gkg;
  }
  var Gkg;
  function get_gigakilogram() {
    init_properties_Kilogram_kt_6mfdcy();
    return gigakilogram;
  }
  var gigakilogram;
  function get_Mkg() {
    init_properties_Kilogram_kt_6mfdcy();
    return Mkg;
  }
  var Mkg;
  function get_megakilogram() {
    init_properties_Kilogram_kt_6mfdcy();
    return megakilogram;
  }
  var megakilogram;
  function get_hkg() {
    init_properties_Kilogram_kt_6mfdcy();
    return hkg;
  }
  var hkg;
  function get_hectokilogram() {
    init_properties_Kilogram_kt_6mfdcy();
    return hectokilogram;
  }
  var hectokilogram;
  function get_dakg() {
    init_properties_Kilogram_kt_6mfdcy();
    return dakg;
  }
  var dakg;
  function get_decakilogram() {
    init_properties_Kilogram_kt_6mfdcy();
    return decakilogram;
  }
  var decakilogram;
  function get_dkg() {
    init_properties_Kilogram_kt_6mfdcy();
    return dkg;
  }
  var dkg;
  function get_decikilogram() {
    init_properties_Kilogram_kt_6mfdcy();
    return decikilogram;
  }
  var decikilogram;
  function get_ckg() {
    init_properties_Kilogram_kt_6mfdcy();
    return ckg;
  }
  var ckg;
  function get_centikilogram() {
    init_properties_Kilogram_kt_6mfdcy();
    return centikilogram;
  }
  var centikilogram;
  function get_mkg() {
    init_properties_Kilogram_kt_6mfdcy();
    return mkg;
  }
  var mkg;
  function get_millikilogram() {
    init_properties_Kilogram_kt_6mfdcy();
    return millikilogram;
  }
  var millikilogram;
  function get_μkg() {
    init_properties_Kilogram_kt_6mfdcy();
    return μkg;
  }
  var μkg;
  function get_microkilogram() {
    init_properties_Kilogram_kt_6mfdcy();
    return microkilogram;
  }
  var microkilogram;
  function get_nkg() {
    init_properties_Kilogram_kt_6mfdcy();
    return nkg;
  }
  var nkg;
  function get_nanokilogram() {
    init_properties_Kilogram_kt_6mfdcy();
    return nanokilogram;
  }
  var nanokilogram;
  function get_pkg() {
    init_properties_Kilogram_kt_6mfdcy();
    return pkg;
  }
  var pkg;
  function get_picokilogram() {
    init_properties_Kilogram_kt_6mfdcy();
    return picokilogram;
  }
  var picokilogram;
  function get_fkg() {
    init_properties_Kilogram_kt_6mfdcy();
    return fkg;
  }
  var fkg;
  function get_femtokilogram() {
    init_properties_Kilogram_kt_6mfdcy();
    return femtokilogram;
  }
  var femtokilogram;
  function get_akg() {
    init_properties_Kilogram_kt_6mfdcy();
    return akg;
  }
  var akg;
  function get_attokilogram() {
    init_properties_Kilogram_kt_6mfdcy();
    return attokilogram;
  }
  var attokilogram;
  function get_zkg() {
    init_properties_Kilogram_kt_6mfdcy();
    return zkg;
  }
  var zkg;
  function get_zeptokilogram() {
    init_properties_Kilogram_kt_6mfdcy();
    return zeptokilogram;
  }
  var zeptokilogram;
  function get_ykg() {
    init_properties_Kilogram_kt_6mfdcy();
    return ykg;
  }
  var ykg;
  function get_yoctokilogram() {
    init_properties_Kilogram_kt_6mfdcy();
    return yoctokilogram;
  }
  var yoctokilogram;
  function get_rkg() {
    init_properties_Kilogram_kt_6mfdcy();
    return rkg;
  }
  var rkg;
  function get_rontokilogram() {
    init_properties_Kilogram_kt_6mfdcy();
    return rontokilogram;
  }
  var rontokilogram;
  function get_qkg() {
    init_properties_Kilogram_kt_6mfdcy();
    return qkg;
  }
  var qkg;
  function get_quectokilogram() {
    init_properties_Kilogram_kt_6mfdcy();
    return quectokilogram;
  }
  var quectokilogram;
  function Kilogram(value) {
    Expression_init_$Init$(value, get_descriptionKilogram(), this);
  }
  function get_kg_0(_this__u8e3s4) {
    init_properties_Kilogram_kt_6mfdcy();
    return new Kilogram(numberToDouble(_this__u8e3s4));
  }
  function descriptionKilogram$lambda(v) {
    init_properties_Kilogram_kt_6mfdcy();
    return new Kilogram(v);
  }
  var properties_initialized_Kilogram_kt_bqx56u;
  function init_properties_Kilogram_kt_6mfdcy() {
    if (properties_initialized_Kilogram_kt_bqx56u) {
    } else {
      properties_initialized_Kilogram_kt_bqx56u = true;
      descriptionKilogram = new UnitSpecification('kg', 'M', 90, descriptionKilogram$lambda);
      kg = new Kilogram(1.0);
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 27.0);
      Qkg = new Kilogram(tmp$ret$0);
      quettakilogram = get_Qkg();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 24.0);
      Rkg = new Kilogram(tmp$ret$0_0);
      ronnakilogram = get_Rkg();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 21.0);
      Ykg = new Kilogram(tmp$ret$0_1);
      yottakilogram = get_Ykg();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 18.0);
      Zkg = new Kilogram(tmp$ret$0_2);
      zettakilogram = get_Zkg();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 15.0);
      Ekg = new Kilogram(tmp$ret$0_3);
      exakilogram = get_Ekg();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 12.0);
      Pkg = new Kilogram(tmp$ret$0_4);
      petakilogram = get_Pkg();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 9.0);
      Tkg = new Kilogram(tmp$ret$0_5);
      terakilogram = get_Tkg();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 6.0);
      Gkg = new Kilogram(tmp$ret$0_6);
      gigakilogram = get_Gkg();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 3.0);
      Mkg = new Kilogram(tmp$ret$0_7);
      megakilogram = get_Mkg();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, -1.0);
      hkg = new Kilogram(tmp$ret$0_8);
      hectokilogram = get_hkg();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, -2.0);
      dakg = new Kilogram(tmp$ret$0_9);
      decakilogram = get_dakg();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, -4.0);
      dkg = new Kilogram(tmp$ret$0_10);
      decikilogram = get_dkg();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -5.0);
      ckg = new Kilogram(tmp$ret$0_11);
      centikilogram = get_ckg();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -6.0);
      mkg = new Kilogram(tmp$ret$0_12);
      millikilogram = get_mkg();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -9.0);
      μkg = new Kilogram(tmp$ret$0_13);
      microkilogram = get_μkg();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -12.0);
      nkg = new Kilogram(tmp$ret$0_14);
      nanokilogram = get_nkg();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -15.0);
      pkg = new Kilogram(tmp$ret$0_15);
      picokilogram = get_pkg();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -18.0);
      fkg = new Kilogram(tmp$ret$0_16);
      femtokilogram = get_fkg();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -21.0);
      akg = new Kilogram(tmp$ret$0_17);
      attokilogram = get_akg();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -24.0);
      zkg = new Kilogram(tmp$ret$0_18);
      zeptokilogram = get_zkg();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -27.0);
      ykg = new Kilogram(tmp$ret$0_19);
      yoctokilogram = get_ykg();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -30.0);
      rkg = new Kilogram(tmp$ret$0_20);
      rontokilogram = get_rkg();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -33.0);
      qkg = new Kilogram(tmp$ret$0_21);
      quectokilogram = get_qkg();
    }
  }
  function get_descriptionMetre() {
    init_properties_Metre_kt_vswkjp();
    return descriptionMetre;
  }
  var descriptionMetre;
  function get_m() {
    init_properties_Metre_kt_vswkjp();
    return m;
  }
  var m;
  function get_Qm() {
    init_properties_Metre_kt_vswkjp();
    return Qm;
  }
  var Qm;
  function get_quettametre() {
    init_properties_Metre_kt_vswkjp();
    return quettametre;
  }
  var quettametre;
  function get_Rm() {
    init_properties_Metre_kt_vswkjp();
    return Rm;
  }
  var Rm;
  function get_ronnametre() {
    init_properties_Metre_kt_vswkjp();
    return ronnametre;
  }
  var ronnametre;
  function get_Ym() {
    init_properties_Metre_kt_vswkjp();
    return Ym;
  }
  var Ym;
  function get_yottametre() {
    init_properties_Metre_kt_vswkjp();
    return yottametre;
  }
  var yottametre;
  function get_Zm() {
    init_properties_Metre_kt_vswkjp();
    return Zm;
  }
  var Zm;
  function get_zettametre() {
    init_properties_Metre_kt_vswkjp();
    return zettametre;
  }
  var zettametre;
  function get_Em() {
    init_properties_Metre_kt_vswkjp();
    return Em;
  }
  var Em;
  function get_exametre() {
    init_properties_Metre_kt_vswkjp();
    return exametre;
  }
  var exametre;
  function get_Pm() {
    init_properties_Metre_kt_vswkjp();
    return Pm;
  }
  var Pm;
  function get_petametre() {
    init_properties_Metre_kt_vswkjp();
    return petametre;
  }
  var petametre;
  function get_Tm() {
    init_properties_Metre_kt_vswkjp();
    return Tm;
  }
  var Tm;
  function get_terametre() {
    init_properties_Metre_kt_vswkjp();
    return terametre;
  }
  var terametre;
  function get_Gm() {
    init_properties_Metre_kt_vswkjp();
    return Gm;
  }
  var Gm;
  function get_gigametre() {
    init_properties_Metre_kt_vswkjp();
    return gigametre;
  }
  var gigametre;
  function get_Mm() {
    init_properties_Metre_kt_vswkjp();
    return Mm;
  }
  var Mm;
  function get_megametre() {
    init_properties_Metre_kt_vswkjp();
    return megametre;
  }
  var megametre;
  function get_km() {
    init_properties_Metre_kt_vswkjp();
    return km;
  }
  var km;
  function get_kilometre() {
    init_properties_Metre_kt_vswkjp();
    return kilometre;
  }
  var kilometre;
  function get_hm() {
    init_properties_Metre_kt_vswkjp();
    return hm;
  }
  var hm;
  function get_hectometre() {
    init_properties_Metre_kt_vswkjp();
    return hectometre;
  }
  var hectometre;
  function get_dam() {
    init_properties_Metre_kt_vswkjp();
    return dam;
  }
  var dam;
  function get_decametre() {
    init_properties_Metre_kt_vswkjp();
    return decametre;
  }
  var decametre;
  function get_dm() {
    init_properties_Metre_kt_vswkjp();
    return dm;
  }
  var dm;
  function get_decimetre() {
    init_properties_Metre_kt_vswkjp();
    return decimetre;
  }
  var decimetre;
  function get_cm() {
    init_properties_Metre_kt_vswkjp();
    return cm;
  }
  var cm;
  function get_centimetre() {
    init_properties_Metre_kt_vswkjp();
    return centimetre;
  }
  var centimetre;
  function get_mm() {
    init_properties_Metre_kt_vswkjp();
    return mm;
  }
  var mm;
  function get_millimetre() {
    init_properties_Metre_kt_vswkjp();
    return millimetre;
  }
  var millimetre;
  function get_μm() {
    init_properties_Metre_kt_vswkjp();
    return μm;
  }
  var μm;
  function get_micrometre() {
    init_properties_Metre_kt_vswkjp();
    return micrometre;
  }
  var micrometre;
  function get_nm() {
    init_properties_Metre_kt_vswkjp();
    return nm;
  }
  var nm;
  function get_nanometre() {
    init_properties_Metre_kt_vswkjp();
    return nanometre;
  }
  var nanometre;
  function get_pm() {
    init_properties_Metre_kt_vswkjp();
    return pm;
  }
  var pm;
  function get_picometre() {
    init_properties_Metre_kt_vswkjp();
    return picometre;
  }
  var picometre;
  function get_fm() {
    init_properties_Metre_kt_vswkjp();
    return fm;
  }
  var fm;
  function get_femtometre() {
    init_properties_Metre_kt_vswkjp();
    return femtometre;
  }
  var femtometre;
  function get_am() {
    init_properties_Metre_kt_vswkjp();
    return am;
  }
  var am;
  function get_attometre() {
    init_properties_Metre_kt_vswkjp();
    return attometre;
  }
  var attometre;
  function get_zm() {
    init_properties_Metre_kt_vswkjp();
    return zm;
  }
  var zm;
  function get_zeptometre() {
    init_properties_Metre_kt_vswkjp();
    return zeptometre;
  }
  var zeptometre;
  function get_ym() {
    init_properties_Metre_kt_vswkjp();
    return ym;
  }
  var ym;
  function get_yoctometre() {
    init_properties_Metre_kt_vswkjp();
    return yoctometre;
  }
  var yoctometre;
  function get_rm() {
    init_properties_Metre_kt_vswkjp();
    return rm;
  }
  var rm;
  function get_rontometre() {
    init_properties_Metre_kt_vswkjp();
    return rontometre;
  }
  var rontometre;
  function get_qm() {
    init_properties_Metre_kt_vswkjp();
    return qm;
  }
  var qm;
  function get_quectometre() {
    init_properties_Metre_kt_vswkjp();
    return quectometre;
  }
  var quectometre;
  function Metre(value) {
    Expression_init_$Init$(value, get_descriptionMetre(), this);
  }
  function descriptionMetre$lambda(v) {
    init_properties_Metre_kt_vswkjp();
    return new Metre(v);
  }
  var properties_initialized_Metre_kt_els675;
  function init_properties_Metre_kt_vswkjp() {
    if (properties_initialized_Metre_kt_els675) {
    } else {
      properties_initialized_Metre_kt_els675 = true;
      descriptionMetre = new UnitSpecification('m', 'L', 80, descriptionMetre$lambda);
      m = new Metre(1.0);
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 30.0);
      Qm = new Metre(tmp$ret$0);
      quettametre = get_Qm();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 27.0);
      Rm = new Metre(tmp$ret$0_0);
      ronnametre = get_Rm();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 24.0);
      Ym = new Metre(tmp$ret$0_1);
      yottametre = get_Ym();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 21.0);
      Zm = new Metre(tmp$ret$0_2);
      zettametre = get_Zm();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 18.0);
      Em = new Metre(tmp$ret$0_3);
      exametre = get_Em();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 15.0);
      Pm = new Metre(tmp$ret$0_4);
      petametre = get_Pm();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 12.0);
      Tm = new Metre(tmp$ret$0_5);
      terametre = get_Tm();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 9.0);
      Gm = new Metre(tmp$ret$0_6);
      gigametre = get_Gm();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 6.0);
      Mm = new Metre(tmp$ret$0_7);
      megametre = get_Mm();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, 3.0);
      km = new Metre(tmp$ret$0_8);
      kilometre = get_km();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, 2.0);
      hm = new Metre(tmp$ret$0_9);
      hectometre = get_hm();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, 1.0);
      dam = new Metre(tmp$ret$0_10);
      decametre = get_dam();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -1.0);
      dm = new Metre(tmp$ret$0_11);
      decimetre = get_dm();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -2.0);
      cm = new Metre(tmp$ret$0_12);
      centimetre = get_cm();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -3.0);
      mm = new Metre(tmp$ret$0_13);
      millimetre = get_mm();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -6.0);
      μm = new Metre(tmp$ret$0_14);
      micrometre = get_μm();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -9.0);
      nm = new Metre(tmp$ret$0_15);
      nanometre = get_nm();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -12.0);
      pm = new Metre(tmp$ret$0_16);
      picometre = get_pm();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -15.0);
      fm = new Metre(tmp$ret$0_17);
      femtometre = get_fm();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -18.0);
      am = new Metre(tmp$ret$0_18);
      attometre = get_am();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -21.0);
      zm = new Metre(tmp$ret$0_19);
      zeptometre = get_zm();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -24.0);
      ym = new Metre(tmp$ret$0_20);
      yoctometre = get_ym();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -27.0);
      rm = new Metre(tmp$ret$0_21);
      rontometre = get_rm();
      var tmp$ret$0_22;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_22 = Math.pow(10.0, -30.0);
      qm = new Metre(tmp$ret$0_22);
      quectometre = get_qm();
    }
  }
  function get_descriptionMole() {
    init_properties_Mole_kt_qg3ntt();
    return descriptionMole;
  }
  var descriptionMole;
  function get_mol() {
    init_properties_Mole_kt_qg3ntt();
    return mol;
  }
  var mol;
  function get_Qmol() {
    init_properties_Mole_kt_qg3ntt();
    return Qmol;
  }
  var Qmol;
  function get_quettamole() {
    init_properties_Mole_kt_qg3ntt();
    return quettamole;
  }
  var quettamole;
  function get_Rmol() {
    init_properties_Mole_kt_qg3ntt();
    return Rmol;
  }
  var Rmol;
  function get_ronnamole() {
    init_properties_Mole_kt_qg3ntt();
    return ronnamole;
  }
  var ronnamole;
  function get_Ymol() {
    init_properties_Mole_kt_qg3ntt();
    return Ymol;
  }
  var Ymol;
  function get_yottamole() {
    init_properties_Mole_kt_qg3ntt();
    return yottamole;
  }
  var yottamole;
  function get_Zmol() {
    init_properties_Mole_kt_qg3ntt();
    return Zmol;
  }
  var Zmol;
  function get_zettamole() {
    init_properties_Mole_kt_qg3ntt();
    return zettamole;
  }
  var zettamole;
  function get_Emol() {
    init_properties_Mole_kt_qg3ntt();
    return Emol;
  }
  var Emol;
  function get_examole() {
    init_properties_Mole_kt_qg3ntt();
    return examole;
  }
  var examole;
  function get_Pmol() {
    init_properties_Mole_kt_qg3ntt();
    return Pmol;
  }
  var Pmol;
  function get_petamole() {
    init_properties_Mole_kt_qg3ntt();
    return petamole;
  }
  var petamole;
  function get_Tmol() {
    init_properties_Mole_kt_qg3ntt();
    return Tmol;
  }
  var Tmol;
  function get_teramole() {
    init_properties_Mole_kt_qg3ntt();
    return teramole;
  }
  var teramole;
  function get_Gmol() {
    init_properties_Mole_kt_qg3ntt();
    return Gmol;
  }
  var Gmol;
  function get_gigamole() {
    init_properties_Mole_kt_qg3ntt();
    return gigamole;
  }
  var gigamole;
  function get_Mmol() {
    init_properties_Mole_kt_qg3ntt();
    return Mmol;
  }
  var Mmol;
  function get_megamole() {
    init_properties_Mole_kt_qg3ntt();
    return megamole;
  }
  var megamole;
  function get_kmol() {
    init_properties_Mole_kt_qg3ntt();
    return kmol;
  }
  var kmol;
  function get_kilomole() {
    init_properties_Mole_kt_qg3ntt();
    return kilomole;
  }
  var kilomole;
  function get_hmol() {
    init_properties_Mole_kt_qg3ntt();
    return hmol;
  }
  var hmol;
  function get_hectomole() {
    init_properties_Mole_kt_qg3ntt();
    return hectomole;
  }
  var hectomole;
  function get_damol() {
    init_properties_Mole_kt_qg3ntt();
    return damol;
  }
  var damol;
  function get_decamole() {
    init_properties_Mole_kt_qg3ntt();
    return decamole;
  }
  var decamole;
  function get_dmol() {
    init_properties_Mole_kt_qg3ntt();
    return dmol;
  }
  var dmol;
  function get_decimole() {
    init_properties_Mole_kt_qg3ntt();
    return decimole;
  }
  var decimole;
  function get_cmol() {
    init_properties_Mole_kt_qg3ntt();
    return cmol;
  }
  var cmol;
  function get_centimole() {
    init_properties_Mole_kt_qg3ntt();
    return centimole;
  }
  var centimole;
  function get_mmol() {
    init_properties_Mole_kt_qg3ntt();
    return mmol;
  }
  var mmol;
  function get_millimole() {
    init_properties_Mole_kt_qg3ntt();
    return millimole;
  }
  var millimole;
  function get_μmol() {
    init_properties_Mole_kt_qg3ntt();
    return μmol;
  }
  var μmol;
  function get_micromole() {
    init_properties_Mole_kt_qg3ntt();
    return micromole;
  }
  var micromole;
  function get_nmol() {
    init_properties_Mole_kt_qg3ntt();
    return nmol;
  }
  var nmol;
  function get_nanomole() {
    init_properties_Mole_kt_qg3ntt();
    return nanomole;
  }
  var nanomole;
  function get_pmol() {
    init_properties_Mole_kt_qg3ntt();
    return pmol;
  }
  var pmol;
  function get_picomole() {
    init_properties_Mole_kt_qg3ntt();
    return picomole;
  }
  var picomole;
  function get_fmol() {
    init_properties_Mole_kt_qg3ntt();
    return fmol;
  }
  var fmol;
  function get_femtomole() {
    init_properties_Mole_kt_qg3ntt();
    return femtomole;
  }
  var femtomole;
  function get_amol() {
    init_properties_Mole_kt_qg3ntt();
    return amol;
  }
  var amol;
  function get_attomole() {
    init_properties_Mole_kt_qg3ntt();
    return attomole;
  }
  var attomole;
  function get_zmol() {
    init_properties_Mole_kt_qg3ntt();
    return zmol;
  }
  var zmol;
  function get_zeptomole() {
    init_properties_Mole_kt_qg3ntt();
    return zeptomole;
  }
  var zeptomole;
  function get_ymol() {
    init_properties_Mole_kt_qg3ntt();
    return ymol;
  }
  var ymol;
  function get_yoctomole() {
    init_properties_Mole_kt_qg3ntt();
    return yoctomole;
  }
  var yoctomole;
  function get_rmol() {
    init_properties_Mole_kt_qg3ntt();
    return rmol;
  }
  var rmol;
  function get_rontomole() {
    init_properties_Mole_kt_qg3ntt();
    return rontomole;
  }
  var rontomole;
  function get_qmol() {
    init_properties_Mole_kt_qg3ntt();
    return qmol;
  }
  var qmol;
  function get_quectomole() {
    init_properties_Mole_kt_qg3ntt();
    return quectomole;
  }
  var quectomole;
  function Mole(value) {
    Expression_init_$Init$(value, get_descriptionMole(), this);
  }
  function descriptionMole$lambda(v) {
    init_properties_Mole_kt_qg3ntt();
    return new Mole(v);
  }
  var properties_initialized_Mole_kt_nenglf;
  function init_properties_Mole_kt_qg3ntt() {
    if (properties_initialized_Mole_kt_nenglf) {
    } else {
      properties_initialized_Mole_kt_nenglf = true;
      descriptionMole = new UnitSpecification('mol', 'N', 50, descriptionMole$lambda);
      mol = new Mole(1.0);
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 30.0);
      Qmol = new Mole(tmp$ret$0);
      quettamole = get_Qmol();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 27.0);
      Rmol = new Mole(tmp$ret$0_0);
      ronnamole = get_Rmol();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 24.0);
      Ymol = new Mole(tmp$ret$0_1);
      yottamole = get_Ymol();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 21.0);
      Zmol = new Mole(tmp$ret$0_2);
      zettamole = get_Zmol();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 18.0);
      Emol = new Mole(tmp$ret$0_3);
      examole = get_Emol();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 15.0);
      Pmol = new Mole(tmp$ret$0_4);
      petamole = get_Pmol();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 12.0);
      Tmol = new Mole(tmp$ret$0_5);
      teramole = get_Tmol();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 9.0);
      Gmol = new Mole(tmp$ret$0_6);
      gigamole = get_Gmol();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 6.0);
      Mmol = new Mole(tmp$ret$0_7);
      megamole = get_Mmol();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, 3.0);
      kmol = new Mole(tmp$ret$0_8);
      kilomole = get_kmol();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, 2.0);
      hmol = new Mole(tmp$ret$0_9);
      hectomole = get_hmol();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, 1.0);
      damol = new Mole(tmp$ret$0_10);
      decamole = get_damol();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -1.0);
      dmol = new Mole(tmp$ret$0_11);
      decimole = get_dmol();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -2.0);
      cmol = new Mole(tmp$ret$0_12);
      centimole = get_cmol();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -3.0);
      mmol = new Mole(tmp$ret$0_13);
      millimole = get_mmol();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -6.0);
      μmol = new Mole(tmp$ret$0_14);
      micromole = get_μmol();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -9.0);
      nmol = new Mole(tmp$ret$0_15);
      nanomole = get_nmol();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -12.0);
      pmol = new Mole(tmp$ret$0_16);
      picomole = get_pmol();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -15.0);
      fmol = new Mole(tmp$ret$0_17);
      femtomole = get_fmol();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -18.0);
      amol = new Mole(tmp$ret$0_18);
      attomole = get_amol();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -21.0);
      zmol = new Mole(tmp$ret$0_19);
      zeptomole = get_zmol();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -24.0);
      ymol = new Mole(tmp$ret$0_20);
      yoctomole = get_ymol();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -27.0);
      rmol = new Mole(tmp$ret$0_21);
      rontomole = get_rmol();
      var tmp$ret$0_22;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_22 = Math.pow(10.0, -30.0);
      qmol = new Mole(tmp$ret$0_22);
      quectomole = get_qmol();
    }
  }
  function get_descriptionSecond() {
    init_properties_Second_kt_chj7a2();
    return descriptionSecond;
  }
  var descriptionSecond;
  function get_s() {
    init_properties_Second_kt_chj7a2();
    return s;
  }
  var s;
  function get_Qs() {
    init_properties_Second_kt_chj7a2();
    return Qs;
  }
  var Qs;
  function get_quettasecond() {
    init_properties_Second_kt_chj7a2();
    return quettasecond;
  }
  var quettasecond;
  function get_Rs() {
    init_properties_Second_kt_chj7a2();
    return Rs;
  }
  var Rs;
  function get_ronnasecond() {
    init_properties_Second_kt_chj7a2();
    return ronnasecond;
  }
  var ronnasecond;
  function get_Ys() {
    init_properties_Second_kt_chj7a2();
    return Ys;
  }
  var Ys;
  function get_yottasecond() {
    init_properties_Second_kt_chj7a2();
    return yottasecond;
  }
  var yottasecond;
  function get_Zs() {
    init_properties_Second_kt_chj7a2();
    return Zs;
  }
  var Zs;
  function get_zettasecond() {
    init_properties_Second_kt_chj7a2();
    return zettasecond;
  }
  var zettasecond;
  function get_Es() {
    init_properties_Second_kt_chj7a2();
    return Es;
  }
  var Es;
  function get_exasecond() {
    init_properties_Second_kt_chj7a2();
    return exasecond;
  }
  var exasecond;
  function get_Ps() {
    init_properties_Second_kt_chj7a2();
    return Ps;
  }
  var Ps;
  function get_petasecond() {
    init_properties_Second_kt_chj7a2();
    return petasecond;
  }
  var petasecond;
  function get_Ts() {
    init_properties_Second_kt_chj7a2();
    return Ts;
  }
  var Ts;
  function get_terasecond() {
    init_properties_Second_kt_chj7a2();
    return terasecond;
  }
  var terasecond;
  function get_Gs() {
    init_properties_Second_kt_chj7a2();
    return Gs;
  }
  var Gs;
  function get_gigasecond() {
    init_properties_Second_kt_chj7a2();
    return gigasecond;
  }
  var gigasecond;
  function get_Ms() {
    init_properties_Second_kt_chj7a2();
    return Ms;
  }
  var Ms;
  function get_megasecond() {
    init_properties_Second_kt_chj7a2();
    return megasecond;
  }
  var megasecond;
  function get_ks() {
    init_properties_Second_kt_chj7a2();
    return ks;
  }
  var ks;
  function get_kilosecond() {
    init_properties_Second_kt_chj7a2();
    return kilosecond;
  }
  var kilosecond;
  function get_hs() {
    init_properties_Second_kt_chj7a2();
    return hs;
  }
  var hs;
  function get_hectosecond() {
    init_properties_Second_kt_chj7a2();
    return hectosecond;
  }
  var hectosecond;
  function get_das() {
    init_properties_Second_kt_chj7a2();
    return das;
  }
  var das;
  function get_decasecond() {
    init_properties_Second_kt_chj7a2();
    return decasecond;
  }
  var decasecond;
  function get_ds() {
    init_properties_Second_kt_chj7a2();
    return ds;
  }
  var ds;
  function get_decisecond() {
    init_properties_Second_kt_chj7a2();
    return decisecond;
  }
  var decisecond;
  function get_cs() {
    init_properties_Second_kt_chj7a2();
    return cs;
  }
  var cs;
  function get_centisecond() {
    init_properties_Second_kt_chj7a2();
    return centisecond;
  }
  var centisecond;
  function get_ms() {
    init_properties_Second_kt_chj7a2();
    return ms;
  }
  var ms;
  function get_millisecond() {
    init_properties_Second_kt_chj7a2();
    return millisecond;
  }
  var millisecond;
  function get_μs() {
    init_properties_Second_kt_chj7a2();
    return μs;
  }
  var μs;
  function get_microsecond() {
    init_properties_Second_kt_chj7a2();
    return microsecond;
  }
  var microsecond;
  function get_ns() {
    init_properties_Second_kt_chj7a2();
    return ns;
  }
  var ns;
  function get_nanosecond() {
    init_properties_Second_kt_chj7a2();
    return nanosecond;
  }
  var nanosecond;
  function get_ps() {
    init_properties_Second_kt_chj7a2();
    return ps;
  }
  var ps;
  function get_picosecond() {
    init_properties_Second_kt_chj7a2();
    return picosecond;
  }
  var picosecond;
  function get_fs() {
    init_properties_Second_kt_chj7a2();
    return fs;
  }
  var fs;
  function get_femtosecond() {
    init_properties_Second_kt_chj7a2();
    return femtosecond;
  }
  var femtosecond;
  function get_as() {
    init_properties_Second_kt_chj7a2();
    return as;
  }
  var as;
  function get_attosecond() {
    init_properties_Second_kt_chj7a2();
    return attosecond;
  }
  var attosecond;
  function get_zs() {
    init_properties_Second_kt_chj7a2();
    return zs;
  }
  var zs;
  function get_zeptosecond() {
    init_properties_Second_kt_chj7a2();
    return zeptosecond;
  }
  var zeptosecond;
  function get_ys() {
    init_properties_Second_kt_chj7a2();
    return ys;
  }
  var ys;
  function get_yoctosecond() {
    init_properties_Second_kt_chj7a2();
    return yoctosecond;
  }
  var yoctosecond;
  function get_rs() {
    init_properties_Second_kt_chj7a2();
    return rs;
  }
  var rs;
  function get_rontosecond() {
    init_properties_Second_kt_chj7a2();
    return rontosecond;
  }
  var rontosecond;
  function get_qs() {
    init_properties_Second_kt_chj7a2();
    return qs;
  }
  var qs;
  function get_quectosecond() {
    init_properties_Second_kt_chj7a2();
    return quectosecond;
  }
  var quectosecond;
  function Second(value) {
    Expression_init_$Init$(value, get_descriptionSecond(), this);
  }
  function descriptionSecond$lambda(v) {
    init_properties_Second_kt_chj7a2();
    return new Second(v);
  }
  var properties_initialized_Second_kt_mmkvpm;
  function init_properties_Second_kt_chj7a2() {
    if (properties_initialized_Second_kt_mmkvpm) {
    } else {
      properties_initialized_Second_kt_mmkvpm = true;
      descriptionSecond = new UnitSpecification('s', 'T', 0, descriptionSecond$lambda);
      s = new Second(1.0);
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 30.0);
      Qs = new Second(tmp$ret$0);
      quettasecond = get_Qs();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 27.0);
      Rs = new Second(tmp$ret$0_0);
      ronnasecond = get_Rs();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 24.0);
      Ys = new Second(tmp$ret$0_1);
      yottasecond = get_Ys();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 21.0);
      Zs = new Second(tmp$ret$0_2);
      zettasecond = get_Zs();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 18.0);
      Es = new Second(tmp$ret$0_3);
      exasecond = get_Es();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 15.0);
      Ps = new Second(tmp$ret$0_4);
      petasecond = get_Ps();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 12.0);
      Ts = new Second(tmp$ret$0_5);
      terasecond = get_Ts();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 9.0);
      Gs = new Second(tmp$ret$0_6);
      gigasecond = get_Gs();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 6.0);
      Ms = new Second(tmp$ret$0_7);
      megasecond = get_Ms();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, 3.0);
      ks = new Second(tmp$ret$0_8);
      kilosecond = get_ks();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, 2.0);
      hs = new Second(tmp$ret$0_9);
      hectosecond = get_hs();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, 1.0);
      das = new Second(tmp$ret$0_10);
      decasecond = get_das();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -1.0);
      ds = new Second(tmp$ret$0_11);
      decisecond = get_ds();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -2.0);
      cs = new Second(tmp$ret$0_12);
      centisecond = get_cs();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -3.0);
      ms = new Second(tmp$ret$0_13);
      millisecond = get_ms();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -6.0);
      μs = new Second(tmp$ret$0_14);
      microsecond = get_μs();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -9.0);
      ns = new Second(tmp$ret$0_15);
      nanosecond = get_ns();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -12.0);
      ps = new Second(tmp$ret$0_16);
      picosecond = get_ps();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -15.0);
      fs = new Second(tmp$ret$0_17);
      femtosecond = get_fs();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -18.0);
      as = new Second(tmp$ret$0_18);
      attosecond = get_as();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -21.0);
      zs = new Second(tmp$ret$0_19);
      zeptosecond = get_zs();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -24.0);
      ys = new Second(tmp$ret$0_20);
      yoctosecond = get_ys();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -27.0);
      rs = new Second(tmp$ret$0_21);
      rontosecond = get_rs();
      var tmp$ret$0_22;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_22 = Math.pow(10.0, -30.0);
      qs = new Second(tmp$ret$0_22);
      quectosecond = get_qs();
    }
  }
  function DerivedUnit(value, formula) {
    Expression.call(this, numberToDouble(value) * formula.value, formula.dimensions);
  }
  function dimOf($this, p, invert) {
    var pv = invert ? -p.powerValue : p.powerValue;
    return p.specification.unitSymbol + tryFormatToIntNotOne($this, pv);
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
      return it.specification.categorySymbol + tryFormatToIntNotOne(this$0, it.powerValue);
    };
  }
  function Dimensions(factors) {
    this.factors = factors;
  }
  Dimensions.prototype.z5 = function () {
    return this.factors;
  };
  Dimensions.prototype.checkCompatibility = function (other) {
    if (!(this.x5() === other.x5()))
      throw IllegalArgumentException_init_$Create$(get_COMPATIBILITY_ERR_PREFIX() + " '" + this.x5() + "' and '" + other.x5() + "'");
  };
  Dimensions.prototype.x5 = function () {
    var top = '';
    // Inline function 'kotlin.collections.forEach' call
    var tmp$ret$2;
    // Inline function 'kotlin.collections.filter' call
    var tmp0_filter = sorted(this.factors);
    var tmp$ret$1;
    // Inline function 'kotlin.collections.filterTo' call
    var tmp0_filterTo = ArrayList_init_$Create$();
    var tmp0_iterator = tmp0_filter.d();
    while (tmp0_iterator.g()) {
      var element = tmp0_iterator.e();
      var tmp$ret$0;
      // Inline function 'eu.sirotin.kotunil.core.Dimensions.unitSymbols.<anonymous>' call
      tmp$ret$0 = element.powerValue > 0.0;
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
    var tmp2_filter = sorted(this.factors);
    var tmp$ret$4;
    // Inline function 'kotlin.collections.filterTo' call
    var tmp0_filterTo_0 = ArrayList_init_$Create$();
    var tmp0_iterator_1 = tmp2_filter.d();
    while (tmp0_iterator_1.g()) {
      var element_1 = tmp0_iterator_1.e();
      var tmp$ret$3;
      // Inline function 'eu.sirotin.kotunil.core.Dimensions.unitSymbols.<anonymous>' call
      tmp$ret$3 = element_1.powerValue < 0.0;
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
  Dimensions.prototype.unitSymbols = function () {
    return this.x5();
  };
  Dimensions.prototype.y5 = function () {
    var tmp = sorted(this.factors);
    return joinToString$default(tmp, '', null, null, 0, null, Dimensions$categorySymbols$lambda(this), 30, null);
  };
  Dimensions.prototype.categorySymbols = function () {
    return this.y5();
  };
  Dimensions.prototype.component1 = function () {
    return this.factors;
  };
  Dimensions.prototype.copy = function (factors) {
    return this.a6(factors === void 1 ? this.factors : factors);
  };
  Dimensions.prototype.a6 = function (factors) {
    return new Dimensions(factors);
  };
  Dimensions.prototype.b6 = function (factors, $mask0, $handler) {
    if (!(($mask0 & 1) === 0))
      factors = this.factors;
    return this.a6(factors);
  };
  Dimensions.prototype.toString = function () {
    return 'Dimensions(factors=' + this.factors + ')';
  };
  Dimensions.prototype.hashCode = function () {
    return hashCode(this.factors);
  };
  Dimensions.prototype.equals = function (other) {
    if (this === other)
      return true;
    if (!(other instanceof Dimensions))
      return false;
    var tmp0_other_with_cast = other instanceof Dimensions ? other : THROW_CCE();
    if (!equals(this.factors, tmp0_other_with_cast.factors))
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
    var powerValue_0 = powerValue === void 1 ? 1.0 : powerValue;
    this.specification = specification;
    this.powerValue = powerValue_0;
  }
  Factor.prototype.c6 = function () {
    return this.specification;
  };
  Factor.prototype.d6 = function () {
    return this.powerValue;
  };
  Factor.prototype.e6 = function (other) {
    return -compareTo(this.specification.presentationPriority, other.specification.presentationPriority) | 0;
  };
  Factor.prototype.t1 = function (other) {
    return this.e6(other instanceof Factor ? other : THROW_CCE());
  };
  Factor.prototype.component1 = function () {
    return this.specification;
  };
  Factor.prototype.component2 = function () {
    return this.powerValue;
  };
  Factor.prototype.copy = function (specification, powerValue) {
    return this.f6(specification === void 1 ? this.specification : specification, powerValue === void 1 ? this.powerValue : powerValue);
  };
  Factor.prototype.f6 = function (specification, powerValue) {
    return new Factor(specification, powerValue);
  };
  Factor.prototype.g6 = function (specification, powerValue, $mask0, $handler) {
    if (!(($mask0 & 1) === 0))
      specification = this.specification;
    if (!(($mask0 & 2) === 0))
      powerValue = this.powerValue;
    return this.f6(specification, powerValue);
  };
  Factor.prototype.toString = function () {
    return 'Factor(specification=' + this.specification + ', powerValue=' + this.powerValue + ')';
  };
  Factor.prototype.hashCode = function () {
    var result = this.specification.hashCode();
    result = imul(result, 31) + getNumberHashCode(this.powerValue) | 0;
    return result;
  };
  Factor.prototype.equals = function (other) {
    if (this === other)
      return true;
    if (!(other instanceof Factor))
      return false;
    var tmp0_other_with_cast = other instanceof Factor ? other : THROW_CCE();
    if (!this.specification.equals(tmp0_other_with_cast.specification))
      return false;
    if (!equals(this.powerValue, tmp0_other_with_cast.powerValue))
      return false;
    return true;
  };
  function plus_0(_this__u8e3s4, other) {
    _this__u8e3s4.checkCompatibility(other);
    return new Dimensions(toSet(_this__u8e3s4.factors));
  }
  function times(_this__u8e3s4, other) {
    var tmp$ret$2;
    // Inline function 'kotlin.collections.map' call
    var tmp0_map = _this__u8e3s4.factors;
    var tmp$ret$1;
    // Inline function 'kotlin.collections.mapTo' call
    var tmp0_mapTo = ArrayList_init_$Create$_0(collectionSizeOrDefault(tmp0_map, 10));
    var tmp0_iterator = tmp0_map.d();
    while (tmp0_iterator.g()) {
      var item = tmp0_iterator.e();
      var tmp$ret$0;
      // Inline function 'eu.sirotin.kotunil.core.times.<anonymous>' call
      tmp$ret$0 = item.specification.categorySymbol;
      tmp0_mapTo.a(tmp$ret$0);
    }
    tmp$ret$1 = tmp0_mapTo;
    tmp$ret$2 = tmp$ret$1;
    var thisDimensionSymbols = toSet(tmp$ret$2);
    var tmp$ret$5;
    // Inline function 'kotlin.collections.map' call
    var tmp1_map = other.factors;
    var tmp$ret$4;
    // Inline function 'kotlin.collections.mapTo' call
    var tmp0_mapTo_0 = ArrayList_init_$Create$_0(collectionSizeOrDefault(tmp1_map, 10));
    var tmp0_iterator_0 = tmp1_map.d();
    while (tmp0_iterator_0.g()) {
      var item_0 = tmp0_iterator_0.e();
      var tmp$ret$3;
      // Inline function 'eu.sirotin.kotunil.core.times.<anonymous>' call
      tmp$ret$3 = item_0.specification.categorySymbol;
      tmp0_mapTo_0.a(tmp$ret$3);
    }
    tmp$ret$4 = tmp0_mapTo_0;
    tmp$ret$5 = tmp$ret$4;
    var otherDimensionSymbols = toSet(tmp$ret$5);
    var commonDimensionSymbols = intersect(thisDimensionSymbols, otherDimensionSymbols);
    var tmp$ret$8;
    // Inline function 'kotlin.collections.filter' call
    var tmp2_filter = _this__u8e3s4.factors;
    var tmp$ret$7;
    // Inline function 'kotlin.collections.filterTo' call
    var tmp0_filterTo = ArrayList_init_$Create$();
    var tmp0_iterator_1 = tmp2_filter.d();
    while (tmp0_iterator_1.g()) {
      var element = tmp0_iterator_1.e();
      var tmp$ret$6;
      // Inline function 'eu.sirotin.kotunil.core.times.<anonymous>' call
      tmp$ret$6 = commonDimensionSymbols.i(element.specification.categorySymbol);
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
      tmp$ret$9 = plusCommonFactors(element_0, _this__u8e3s4.factors, other.factors);
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
    var tmp3_filter = _this__u8e3s4.factors;
    var tmp$ret$14;
    // Inline function 'kotlin.collections.filterTo' call
    var tmp0_filterTo_0 = ArrayList_init_$Create$();
    var tmp0_iterator_3 = tmp3_filter.d();
    while (tmp0_iterator_3.g()) {
      var element_1 = tmp0_iterator_3.e();
      var tmp$ret$13;
      // Inline function 'eu.sirotin.kotunil.core.times.<anonymous>' call
      tmp$ret$13 = !commonDimensionSymbols.i(element_1.specification.categorySymbol);
      if (tmp$ret$13) {
        tmp0_filterTo_0.a(element_1);
      }
    }
    tmp$ret$14 = tmp0_filterTo_0;
    tmp$ret$15 = tmp$ret$14;
    var restThisFactors = toSet(tmp$ret$15);
    var tmp$ret$18;
    // Inline function 'kotlin.collections.filter' call
    var tmp4_filter = other.factors;
    var tmp$ret$17;
    // Inline function 'kotlin.collections.filterTo' call
    var tmp0_filterTo_1 = ArrayList_init_$Create$();
    var tmp0_iterator_4 = tmp4_filter.d();
    while (tmp0_iterator_4.g()) {
      var element_2 = tmp0_iterator_4.e();
      var tmp$ret$16;
      // Inline function 'eu.sirotin.kotunil.core.times.<anonymous>' call
      tmp$ret$16 = !commonDimensionSymbols.i(element_2.specification.categorySymbol);
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
    var tmp0_map = _this__u8e3s4.factors;
    var tmp$ret$1;
    // Inline function 'kotlin.collections.mapTo' call
    var tmp0_mapTo = ArrayList_init_$Create$_0(collectionSizeOrDefault(tmp0_map, 10));
    var tmp0_iterator = tmp0_map.d();
    while (tmp0_iterator.g()) {
      var item = tmp0_iterator.e();
      var tmp$ret$0;
      // Inline function 'eu.sirotin.kotunil.core.pow.<anonymous>' call
      tmp$ret$0 = new Factor(item.specification, item.powerValue * numberToDouble(degree));
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
        tmp$ret$0 = element.specification.equals(f.specification);
        if (tmp$ret$0) {
          tmp$ret$1 = element;
          break $l$block;
        }
      }
      tmp$ret$1 = null;
    }
    tmp$ret$2 = tmp$ret$1;
    var tmp0_elvis_lhs = tmp$ret$2;
    var tmp;
    if (tmp0_elvis_lhs == null) {
      return null;
    } else {
      tmp = tmp0_elvis_lhs;
    }
    var f1 = tmp;
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
        tmp$ret$3 = element_0.specification.equals(f.specification);
        if (tmp$ret$3) {
          tmp$ret$4 = element_0;
          break $l$block_0;
        }
      }
      tmp$ret$4 = null;
    }
    tmp$ret$5 = tmp$ret$4;
    var tmp1_elvis_lhs = tmp$ret$5;
    var tmp_0;
    if (tmp1_elvis_lhs == null) {
      return null;
    } else {
      tmp_0 = tmp1_elvis_lhs;
    }
    var f2 = tmp_0;
    var powerValue = f1.powerValue + f2.powerValue;
    var tmp_1;
    var tmp$ret$6;
    // Inline function 'kotlin.math.abs' call
    tmp$ret$6 = Math.abs(powerValue);
    if (tmp$ret$6 > get_ε()) {
      tmp_1 = new Factor(f.specification, powerValue);
    } else {
      tmp_1 = null;
    }
    return tmp_1;
  }
  function get_ε() {
    return ε;
  }
  var ε;
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
    if (!($this.x5() === other.x5()))
      throw IllegalArgumentException_init_$Create$("Can't process objects with different dimensions: '" + $this.x5() + "' and " + other.x5());
  }
  function Expression(value, dimensions) {
    this.value = value;
    this.dimensions = dimensions;
  }
  Expression.prototype.u5 = function (_set____db54di) {
    this.value = _set____db54di;
  };
  Expression.prototype.s = function () {
    return this.value;
  };
  Expression.prototype.v5 = function () {
    return this.dimensions;
  };
  Expression.prototype.compare = function (other) {
    return this.w5(other);
  };
  Expression.prototype.w5 = function (other) {
    checkCompatibility(this, other);
    return compareTo(this.value, other.value);
  };
  Expression.prototype.t1 = function (other) {
    return this.w5(other instanceof Expression ? other : THROW_CCE());
  };
  Expression.prototype.x5 = function () {
    return this.dimensions.x5();
  };
  Expression.prototype.unitSymbols = function () {
    return this.x5();
  };
  Expression.prototype.y5 = function () {
    return this.dimensions.y5();
  };
  Expression.prototype.categorySymbols = function () {
    return this.y5();
  };
  Expression.prototype.toString = function () {
    return '' + this.value + ' ' + this.x5();
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
  function pow_0(_this__u8e3s4, degree) {
    var tmp$ret$0;
    // Inline function 'kotlin.math.pow' call
    var tmp0_pow = _this__u8e3s4.value;
    var tmp1_pow = numberToDouble(degree);
    tmp$ret$0 = Math.pow(tmp0_pow, tmp1_pow);
    return new Expression(tmp$ret$0, pow(_this__u8e3s4.dimensions, degree));
  }
  function powExpression(_this__u8e3s4, degree) {
    return pow_0(_this__u8e3s4, degree);
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
  function UnitSpecification_init_$Init$(unitSymbol, categorySymbol, presentationPriority, creator, $mask0, $marker, $this) {
    if (!(($mask0 & 4) === 0))
      presentationPriority = 0;
    UnitSpecification.call($this, unitSymbol, categorySymbol, presentationPriority, creator);
    return $this;
  }
  function UnitSpecification_init_$Create$(unitSymbol, categorySymbol, presentationPriority, creator, $mask0, $marker) {
    return UnitSpecification_init_$Init$(unitSymbol, categorySymbol, presentationPriority, creator, $mask0, $marker, Object.create(UnitSpecification.prototype));
  }
  function UnitSpecification(unitSymbol, categorySymbol, presentationPriority, creator) {
    var presentationPriority_0 = presentationPriority === void 1 ? 0 : presentationPriority;
    this.unitSymbol = unitSymbol;
    this.categorySymbol = categorySymbol;
    this.presentationPriority = presentationPriority_0;
    this.creator = creator;
  }
  UnitSpecification.prototype.h6 = function () {
    return this.unitSymbol;
  };
  UnitSpecification.prototype.i6 = function () {
    return this.categorySymbol;
  };
  UnitSpecification.prototype.j6 = function () {
    return this.presentationPriority;
  };
  UnitSpecification.prototype.k6 = function () {
    return this.creator;
  };
  UnitSpecification.prototype.component1 = function () {
    return this.unitSymbol;
  };
  UnitSpecification.prototype.component2 = function () {
    return this.categorySymbol;
  };
  UnitSpecification.prototype.component3 = function () {
    return this.presentationPriority;
  };
  UnitSpecification.prototype.component4 = function () {
    return this.creator;
  };
  UnitSpecification.prototype.copy = function (unitSymbol, categorySymbol, presentationPriority, creator) {
    return this.l6(unitSymbol === void 1 ? this.unitSymbol : unitSymbol, categorySymbol === void 1 ? this.categorySymbol : categorySymbol, presentationPriority === void 1 ? this.presentationPriority : presentationPriority, creator === void 1 ? this.creator : creator);
  };
  UnitSpecification.prototype.l6 = function (unitSymbol, categorySymbol, presentationPriority, creator) {
    return new UnitSpecification(unitSymbol, categorySymbol, presentationPriority, creator);
  };
  UnitSpecification.prototype.m6 = function (unitSymbol, categorySymbol, presentationPriority, creator, $mask0, $handler) {
    if (!(($mask0 & 1) === 0))
      unitSymbol = this.unitSymbol;
    if (!(($mask0 & 2) === 0))
      categorySymbol = this.categorySymbol;
    if (!(($mask0 & 4) === 0))
      presentationPriority = this.presentationPriority;
    if (!(($mask0 & 8) === 0))
      creator = this.creator;
    return this.l6(unitSymbol, categorySymbol, presentationPriority, creator);
  };
  UnitSpecification.prototype.toString = function () {
    return 'UnitSpecification(unitSymbol=' + this.unitSymbol + ', categorySymbol=' + this.categorySymbol + ', presentationPriority=' + this.presentationPriority + ', creator=' + this.creator + ')';
  };
  UnitSpecification.prototype.hashCode = function () {
    var result = getStringHashCode(this.unitSymbol);
    result = imul(result, 31) + getStringHashCode(this.categorySymbol) | 0;
    result = imul(result, 31) + this.presentationPriority | 0;
    result = imul(result, 31) + hashCode(this.creator) | 0;
    return result;
  };
  UnitSpecification.prototype.equals = function (other) {
    if (this === other)
      return true;
    if (!(other instanceof UnitSpecification))
      return false;
    var tmp0_other_with_cast = other instanceof UnitSpecification ? other : THROW_CCE();
    if (!(this.unitSymbol === tmp0_other_with_cast.unitSymbol))
      return false;
    if (!(this.categorySymbol === tmp0_other_with_cast.categorySymbol))
      return false;
    if (!(this.presentationPriority === tmp0_other_with_cast.presentationPriority))
      return false;
    if (!equals(this.creator, tmp0_other_with_cast.creator))
      return false;
    return true;
  };
  function get_descriptionAustralianDollar() {
    init_properties_AustralianDollar_kt_fnolqo();
    return descriptionAustralianDollar;
  }
  var descriptionAustralianDollar;
  function get_AUD() {
    init_properties_AustralianDollar_kt_fnolqo();
    return AUD;
  }
  var AUD;
  function AustralianDollar_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    AustralianDollar.call($this, value);
    return $this;
  }
  function AustralianDollar_init_$Create$(value, $mask0, $marker) {
    return AustralianDollar_init_$Init$(value, $mask0, $marker, Object.create(AustralianDollar.prototype));
  }
  function AustralianDollar(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionAustralianDollar(), this);
  }
  function descriptionAustralianDollar$lambda(v) {
    init_properties_AustralianDollar_kt_fnolqo();
    return new AustralianDollar(v);
  }
  var properties_initialized_AustralianDollar_kt_ull2oc;
  function init_properties_AustralianDollar_kt_fnolqo() {
    if (properties_initialized_AustralianDollar_kt_ull2oc) {
    } else {
      properties_initialized_AustralianDollar_kt_ull2oc = true;
      descriptionAustralianDollar = UnitSpecification_init_$Create$('AUD', '`A$`', 0, descriptionAustralianDollar$lambda, 4, null);
      AUD = AustralianDollar_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionBrazilianReal() {
    init_properties_BrazilianReal_kt_9nkkac();
    return descriptionBrazilianReal;
  }
  var descriptionBrazilianReal;
  function get_BRL() {
    init_properties_BrazilianReal_kt_9nkkac();
    return BRL;
  }
  var BRL;
  function BrazilianReal_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    BrazilianReal.call($this, value);
    return $this;
  }
  function BrazilianReal_init_$Create$(value, $mask0, $marker) {
    return BrazilianReal_init_$Init$(value, $mask0, $marker, Object.create(BrazilianReal.prototype));
  }
  function BrazilianReal(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionBrazilianReal(), this);
  }
  function descriptionBrazilianReal$lambda(v) {
    init_properties_BrazilianReal_kt_9nkkac();
    return new BrazilianReal(v);
  }
  var properties_initialized_BrazilianReal_kt_4ka7a0;
  function init_properties_BrazilianReal_kt_9nkkac() {
    if (properties_initialized_BrazilianReal_kt_4ka7a0) {
    } else {
      properties_initialized_BrazilianReal_kt_4ka7a0 = true;
      descriptionBrazilianReal = UnitSpecification_init_$Create$('BRL', '`R$`', 0, descriptionBrazilianReal$lambda, 4, null);
      BRL = BrazilianReal_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionCanadianDollar() {
    init_properties_CanadianDollar_kt_sz37dx();
    return descriptionCanadianDollar;
  }
  var descriptionCanadianDollar;
  function get_CAD() {
    init_properties_CanadianDollar_kt_sz37dx();
    return CAD;
  }
  var CAD;
  function CanadianDollar_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    CanadianDollar.call($this, value);
    return $this;
  }
  function CanadianDollar_init_$Create$(value, $mask0, $marker) {
    return CanadianDollar_init_$Init$(value, $mask0, $marker, Object.create(CanadianDollar.prototype));
  }
  function CanadianDollar(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionCanadianDollar(), this);
  }
  function descriptionCanadianDollar$lambda(v) {
    init_properties_CanadianDollar_kt_sz37dx();
    return new CanadianDollar(v);
  }
  var properties_initialized_CanadianDollar_kt_d7e41t;
  function init_properties_CanadianDollar_kt_sz37dx() {
    if (properties_initialized_CanadianDollar_kt_d7e41t) {
    } else {
      properties_initialized_CanadianDollar_kt_d7e41t = true;
      descriptionCanadianDollar = UnitSpecification_init_$Create$('CAD', '`C$`', 0, descriptionCanadianDollar$lambda, 4, null);
      CAD = CanadianDollar_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionChileanPeso() {
    init_properties_ChileanPeso_kt_dtwl7r();
    return descriptionChileanPeso;
  }
  var descriptionChileanPeso;
  function get_CLP() {
    init_properties_ChileanPeso_kt_dtwl7r();
    return CLP;
  }
  var CLP;
  function ChileanPeso_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    ChileanPeso.call($this, value);
    return $this;
  }
  function ChileanPeso_init_$Create$(value, $mask0, $marker) {
    return ChileanPeso_init_$Init$(value, $mask0, $marker, Object.create(ChileanPeso.prototype));
  }
  function ChileanPeso(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionChileanPeso(), this);
  }
  function descriptionChileanPeso$lambda(v) {
    init_properties_ChileanPeso_kt_dtwl7r();
    return new ChileanPeso(v);
  }
  var properties_initialized_ChileanPeso_kt_eeqsqd;
  function init_properties_ChileanPeso_kt_dtwl7r() {
    if (properties_initialized_ChileanPeso_kt_eeqsqd) {
    } else {
      properties_initialized_ChileanPeso_kt_eeqsqd = true;
      descriptionChileanPeso = UnitSpecification_init_$Create$('CLP', '`CLP$`', 0, descriptionChileanPeso$lambda, 4, null);
      CLP = ChileanPeso_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionColombianPeso() {
    init_properties_ColombianPeso_kt_33aic1();
    return descriptionColombianPeso;
  }
  var descriptionColombianPeso;
  function get_COP() {
    init_properties_ColombianPeso_kt_33aic1();
    return COP;
  }
  var COP;
  function ColombianPeso_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    ColombianPeso.call($this, value);
    return $this;
  }
  function ColombianPeso_init_$Create$(value, $mask0, $marker) {
    return ColombianPeso_init_$Init$(value, $mask0, $marker, Object.create(ColombianPeso.prototype));
  }
  function ColombianPeso(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionColombianPeso(), this);
  }
  function descriptionColombianPeso$lambda(v) {
    init_properties_ColombianPeso_kt_33aic1();
    return new ColombianPeso(v);
  }
  var properties_initialized_ColombianPeso_kt_86kvcd;
  function init_properties_ColombianPeso_kt_33aic1() {
    if (properties_initialized_ColombianPeso_kt_86kvcd) {
    } else {
      properties_initialized_ColombianPeso_kt_86kvcd = true;
      descriptionColombianPeso = UnitSpecification_init_$Create$('COP', '`COL$`', 0, descriptionColombianPeso$lambda, 4, null);
      COP = ColombianPeso_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionCzechKoruna() {
    init_properties_CzechKoruna_kt_8lr3x5();
    return descriptionCzechKoruna;
  }
  var descriptionCzechKoruna;
  function get_CZK() {
    init_properties_CzechKoruna_kt_8lr3x5();
    return CZK;
  }
  var CZK;
  function CzechKoruna_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    CzechKoruna.call($this, value);
    return $this;
  }
  function CzechKoruna_init_$Create$(value, $mask0, $marker) {
    return CzechKoruna_init_$Init$(value, $mask0, $marker, Object.create(CzechKoruna.prototype));
  }
  function CzechKoruna(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionCzechKoruna(), this);
  }
  function descriptionCzechKoruna$lambda(v) {
    init_properties_CzechKoruna_kt_8lr3x5();
    return new CzechKoruna(v);
  }
  var properties_initialized_CzechKoruna_kt_jmwa0z;
  function init_properties_CzechKoruna_kt_8lr3x5() {
    if (properties_initialized_CzechKoruna_kt_jmwa0z) {
    } else {
      properties_initialized_CzechKoruna_kt_jmwa0z = true;
      descriptionCzechKoruna = UnitSpecification_init_$Create$('CZK', '`K\u010D`', 0, descriptionCzechKoruna$lambda, 4, null);
      CZK = CzechKoruna_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionDanishKrone() {
    init_properties_DanishKrone_kt_8yv1lq();
    return descriptionDanishKrone;
  }
  var descriptionDanishKrone;
  function get_DKK() {
    init_properties_DanishKrone_kt_8yv1lq();
    return DKK;
  }
  var DKK;
  var dkr;
  function DanishKrone_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    DanishKrone.call($this, value);
    return $this;
  }
  function DanishKrone_init_$Create$(value, $mask0, $marker) {
    return DanishKrone_init_$Init$(value, $mask0, $marker, Object.create(DanishKrone.prototype));
  }
  function DanishKrone(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionDanishKrone(), this);
  }
  function descriptionDanishKrone$lambda(v) {
    init_properties_DanishKrone_kt_8yv1lq();
    return new DanishKrone(v);
  }
  var properties_initialized_DanishKrone_kt_j9scce;
  function init_properties_DanishKrone_kt_8yv1lq() {
    if (properties_initialized_DanishKrone_kt_j9scce) {
    } else {
      properties_initialized_DanishKrone_kt_j9scce = true;
      descriptionDanishKrone = UnitSpecification_init_$Create$('DKK', 'dkr', 0, descriptionDanishKrone$lambda, 4, null);
      DKK = DanishKrone_init_$Create$(0.0, 1, null);
      dkr = DanishKrone_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionEuro() {
    init_properties_Euro_kt_14p24t();
    return descriptionEuro;
  }
  var descriptionEuro;
  function get_EUR() {
    init_properties_Euro_kt_14p24t();
    return EUR;
  }
  var EUR;
  function Euro_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    Euro.call($this, value);
    return $this;
  }
  function Euro_init_$Create$(value, $mask0, $marker) {
    return Euro_init_$Init$(value, $mask0, $marker, Object.create(Euro.prototype));
  }
  function Euro(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionEuro(), this);
  }
  function descriptionEuro$lambda(v) {
    init_properties_Euro_kt_14p24t();
    return new Euro(v);
  }
  var properties_initialized_Euro_kt_k1nvf3;
  function init_properties_Euro_kt_14p24t() {
    if (properties_initialized_Euro_kt_k1nvf3) {
    } else {
      properties_initialized_Euro_kt_k1nvf3 = true;
      descriptionEuro = UnitSpecification_init_$Create$('EUR', '`\u20AC`', 0, descriptionEuro$lambda, 4, null);
      EUR = Euro_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionHongKongDollar() {
    init_properties_HongKongDollar_kt_uscm8v();
    return descriptionHongKongDollar;
  }
  var descriptionHongKongDollar;
  function get_HKD() {
    init_properties_HongKongDollar_kt_uscm8v();
    return HKD;
  }
  var HKD;
  function HongKongDollar_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    HongKongDollar.call($this, value);
    return $this;
  }
  function HongKongDollar_init_$Create$(value, $mask0, $marker) {
    return HongKongDollar_init_$Init$(value, $mask0, $marker, Object.create(HongKongDollar.prototype));
  }
  function HongKongDollar(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionHongKongDollar(), this);
  }
  function descriptionHongKongDollar$lambda(v) {
    init_properties_HongKongDollar_kt_uscm8v();
    return new HongKongDollar(v);
  }
  var properties_initialized_HongKongDollar_kt_f0niwr;
  function init_properties_HongKongDollar_kt_uscm8v() {
    if (properties_initialized_HongKongDollar_kt_f0niwr) {
    } else {
      properties_initialized_HongKongDollar_kt_f0niwr = true;
      descriptionHongKongDollar = UnitSpecification_init_$Create$('HKD', '`HK$`', 0, descriptionHongKongDollar$lambda, 4, null);
      HKD = HongKongDollar_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionHungarianForint() {
    init_properties_HungarianForint_kt_9t1b0x();
    return descriptionHungarianForint;
  }
  var descriptionHungarianForint;
  function get_HUF() {
    init_properties_HungarianForint_kt_9t1b0x();
    return HUF;
  }
  var HUF;
  var Ft;
  function HungarianForint_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    HungarianForint.call($this, value);
    return $this;
  }
  function HungarianForint_init_$Create$(value, $mask0, $marker) {
    return HungarianForint_init_$Init$(value, $mask0, $marker, Object.create(HungarianForint.prototype));
  }
  function HungarianForint(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionHungarianForint(), this);
  }
  function descriptionHungarianForint$lambda(v) {
    init_properties_HungarianForint_kt_9t1b0x();
    return new HungarianForint(v);
  }
  var properties_initialized_HungarianForint_kt_i67tf9;
  function init_properties_HungarianForint_kt_9t1b0x() {
    if (properties_initialized_HungarianForint_kt_i67tf9) {
    } else {
      properties_initialized_HungarianForint_kt_i67tf9 = true;
      descriptionHungarianForint = UnitSpecification_init_$Create$('HUF', 'Ft', 0, descriptionHungarianForint$lambda, 4, null);
      HUF = HungarianForint_init_$Create$(0.0, 1, null);
      Ft = HungarianForint_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionIndianRupee() {
    init_properties_IndianRupee_kt_9xasyq();
    return descriptionIndianRupee;
  }
  var descriptionIndianRupee;
  function get_INR() {
    init_properties_IndianRupee_kt_9xasyq();
    return INR;
  }
  var INR;
  function IndianRupee_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    IndianRupee.call($this, value);
    return $this;
  }
  function IndianRupee_init_$Create$(value, $mask0, $marker) {
    return IndianRupee_init_$Init$(value, $mask0, $marker, Object.create(IndianRupee.prototype));
  }
  function IndianRupee(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionIndianRupee(), this);
  }
  function descriptionIndianRupee$lambda(v) {
    init_properties_IndianRupee_kt_9xasyq();
    return new IndianRupee(v);
  }
  var properties_initialized_IndianRupee_kt_ibckze;
  function init_properties_IndianRupee_kt_9xasyq() {
    if (properties_initialized_IndianRupee_kt_ibckze) {
    } else {
      properties_initialized_IndianRupee_kt_ibckze = true;
      descriptionIndianRupee = UnitSpecification_init_$Create$('INR', '`\u20B9`', 0, descriptionIndianRupee$lambda, 4, null);
      INR = IndianRupee_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionIndonesianRupiah() {
    init_properties_IndonesianRupiah_kt_9q9bil();
    return descriptionIndonesianRupiah;
  }
  var descriptionIndonesianRupiah;
  function get_IDR() {
    init_properties_IndonesianRupiah_kt_9q9bil();
    return IDR;
  }
  var IDR;
  var Rp;
  function IndonesianRupiah_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    IndonesianRupiah.call($this, value);
    return $this;
  }
  function IndonesianRupiah_init_$Create$(value, $mask0, $marker) {
    return IndonesianRupiah_init_$Init$(value, $mask0, $marker, Object.create(IndonesianRupiah.prototype));
  }
  function IndonesianRupiah(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionIndonesianRupiah(), this);
  }
  function descriptionIndonesianRupiah$lambda(v) {
    init_properties_IndonesianRupiah_kt_9q9bil();
    return new IndonesianRupiah(v);
  }
  var properties_initialized_IndonesianRupiah_kt_yi3p2p;
  function init_properties_IndonesianRupiah_kt_9q9bil() {
    if (properties_initialized_IndonesianRupiah_kt_yi3p2p) {
    } else {
      properties_initialized_IndonesianRupiah_kt_yi3p2p = true;
      descriptionIndonesianRupiah = UnitSpecification_init_$Create$('IDR', 'Rp', 0, descriptionIndonesianRupiah$lambda, 4, null);
      IDR = IndonesianRupiah_init_$Create$(0.0, 1, null);
      Rp = IndonesianRupiah_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionIsraeliNewShekel() {
    init_properties_IsraeliNewShekel_kt_734dhb();
    return descriptionIsraeliNewShekel;
  }
  var descriptionIsraeliNewShekel;
  function get_ILS() {
    init_properties_IsraeliNewShekel_kt_734dhb();
    return ILS;
  }
  var ILS;
  function IsraeliNewShekel_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    IsraeliNewShekel.call($this, value);
    return $this;
  }
  function IsraeliNewShekel_init_$Create$(value, $mask0, $marker) {
    return IsraeliNewShekel_init_$Init$(value, $mask0, $marker, Object.create(IsraeliNewShekel.prototype));
  }
  function IsraeliNewShekel(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionIsraeliNewShekel(), this);
  }
  function descriptionIsraeliNewShekel$lambda(v) {
    init_properties_IsraeliNewShekel_kt_734dhb();
    return new IsraeliNewShekel(v);
  }
  var properties_initialized_IsraeliNewShekel_kt_hoq02t;
  function init_properties_IsraeliNewShekel_kt_734dhb() {
    if (properties_initialized_IsraeliNewShekel_kt_hoq02t) {
    } else {
      properties_initialized_IsraeliNewShekel_kt_hoq02t = true;
      descriptionIsraeliNewShekel = UnitSpecification_init_$Create$('ILS', '`\u20AA`', 0, descriptionIsraeliNewShekel$lambda, 4, null);
      ILS = IsraeliNewShekel_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionJapaneseYen() {
    init_properties_JapaneseYen_kt_wu6gf7();
    return descriptionJapaneseYen;
  }
  var descriptionJapaneseYen;
  function get_JPY() {
    init_properties_JapaneseYen_kt_wu6gf7();
    return JPY;
  }
  var JPY;
  function JapaneseYen_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    JapaneseYen.call($this, value);
    return $this;
  }
  function JapaneseYen_init_$Create$(value, $mask0, $marker) {
    return JapaneseYen_init_$Init$(value, $mask0, $marker, Object.create(JapaneseYen.prototype));
  }
  function JapaneseYen(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionJapaneseYen(), this);
  }
  function descriptionJapaneseYen$lambda(v) {
    init_properties_JapaneseYen_kt_wu6gf7();
    return new JapaneseYen(v);
  }
  var properties_initialized_JapaneseYen_kt_9ya7lt;
  function init_properties_JapaneseYen_kt_wu6gf7() {
    if (properties_initialized_JapaneseYen_kt_9ya7lt) {
    } else {
      properties_initialized_JapaneseYen_kt_9ya7lt = true;
      descriptionJapaneseYen = UnitSpecification_init_$Create$('JPY', '`\xA5`', 0, descriptionJapaneseYen$lambda, 4, null);
      JPY = JapaneseYen_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionMalaysianRinggit() {
    init_properties_MalaysianRinggit_kt_o4db2t();
    return descriptionMalaysianRinggit;
  }
  var descriptionMalaysianRinggit;
  function get_MYR() {
    init_properties_MalaysianRinggit_kt_o4db2t();
    return MYR;
  }
  var MYR;
  var RM;
  function MalaysianRinggit_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    MalaysianRinggit.call($this, value);
    return $this;
  }
  function MalaysianRinggit_init_$Create$(value, $mask0, $marker) {
    return MalaysianRinggit_init_$Init$(value, $mask0, $marker, Object.create(MalaysianRinggit.prototype));
  }
  function MalaysianRinggit(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionMalaysianRinggit(), this);
  }
  function descriptionMalaysianRinggit$lambda(v) {
    init_properties_MalaysianRinggit_kt_o4db2t();
    return new MalaysianRinggit(v);
  }
  var properties_initialized_MalaysianRinggit_kt_nh2hb;
  function init_properties_MalaysianRinggit_kt_o4db2t() {
    if (properties_initialized_MalaysianRinggit_kt_nh2hb) {
    } else {
      properties_initialized_MalaysianRinggit_kt_nh2hb = true;
      descriptionMalaysianRinggit = UnitSpecification_init_$Create$('MYR', 'RM', 0, descriptionMalaysianRinggit$lambda, 4, null);
      MYR = MalaysianRinggit_init_$Create$(0.0, 1, null);
      RM = MalaysianRinggit_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionMexicanPeso() {
    init_properties_MexicanPeso_kt_q8kgpw();
    return descriptionMexicanPeso;
  }
  var descriptionMexicanPeso;
  function get_MXN() {
    init_properties_MexicanPeso_kt_q8kgpw();
    return MXN;
  }
  var MXN;
  function MexicanPeso_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    MexicanPeso.call($this, value);
    return $this;
  }
  function MexicanPeso_init_$Create$(value, $mask0, $marker) {
    return MexicanPeso_init_$Init$(value, $mask0, $marker, Object.create(MexicanPeso.prototype));
  }
  function MexicanPeso(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionMexicanPeso(), this);
  }
  function descriptionMexicanPeso$lambda(v) {
    init_properties_MexicanPeso_kt_q8kgpw();
    return new MexicanPeso(v);
  }
  var properties_initialized_MexicanPeso_kt_202x88;
  function init_properties_MexicanPeso_kt_q8kgpw() {
    if (properties_initialized_MexicanPeso_kt_202x88) {
    } else {
      properties_initialized_MexicanPeso_kt_202x88 = true;
      descriptionMexicanPeso = UnitSpecification_init_$Create$('MXN', '`$`', 0, descriptionMexicanPeso$lambda, 4, null);
      MXN = MexicanPeso_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionNewTaiwanDollar() {
    init_properties_NewTaiwanDollar_kt_odtaa8();
    return descriptionNewTaiwanDollar;
  }
  var descriptionNewTaiwanDollar;
  function get_TWD() {
    init_properties_NewTaiwanDollar_kt_odtaa8();
    return TWD;
  }
  var TWD;
  function NewTaiwanDollar_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    NewTaiwanDollar.call($this, value);
    return $this;
  }
  function NewTaiwanDollar_init_$Create$(value, $mask0, $marker) {
    return NewTaiwanDollar_init_$Init$(value, $mask0, $marker, Object.create(NewTaiwanDollar.prototype));
  }
  function NewTaiwanDollar(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionNewTaiwanDollar(), this);
  }
  function descriptionNewTaiwanDollar$lambda(v) {
    init_properties_NewTaiwanDollar_kt_odtaa8();
    return new NewTaiwanDollar(v);
  }
  var properties_initialized_NewTaiwanDollar_kt_g0mrvw;
  function init_properties_NewTaiwanDollar_kt_odtaa8() {
    if (properties_initialized_NewTaiwanDollar_kt_g0mrvw) {
    } else {
      properties_initialized_NewTaiwanDollar_kt_g0mrvw = true;
      descriptionNewTaiwanDollar = UnitSpecification_init_$Create$('TWD', '`NT$`', 0, descriptionNewTaiwanDollar$lambda, 4, null);
      TWD = NewTaiwanDollar_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionNewZealandDollar() {
    init_properties_NewZealandDollar_kt_3x9nj7();
    return descriptionNewZealandDollar;
  }
  var descriptionNewZealandDollar;
  function get_NZD() {
    init_properties_NewZealandDollar_kt_3x9nj7();
    return NZD;
  }
  var NZD;
  function NewZealandDollar_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    NewZealandDollar.call($this, value);
    return $this;
  }
  function NewZealandDollar_init_$Create$(value, $mask0, $marker) {
    return NewZealandDollar_init_$Init$(value, $mask0, $marker, Object.create(NewZealandDollar.prototype));
  }
  function NewZealandDollar(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionNewZealandDollar(), this);
  }
  function descriptionNewZealandDollar$lambda(v) {
    init_properties_NewZealandDollar_kt_3x9nj7();
    return new NewZealandDollar(v);
  }
  var properties_initialized_NewZealandDollar_kt_kukq0x;
  function init_properties_NewZealandDollar_kt_3x9nj7() {
    if (properties_initialized_NewZealandDollar_kt_kukq0x) {
    } else {
      properties_initialized_NewZealandDollar_kt_kukq0x = true;
      descriptionNewZealandDollar = UnitSpecification_init_$Create$('NZD', '`NZ$`', 0, descriptionNewZealandDollar$lambda, 4, null);
      NZD = NewZealandDollar_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionNorwegianKrone() {
    init_properties_NorwegianKrone_kt_ltlo15();
    return descriptionNorwegianKrone;
  }
  var descriptionNorwegianKrone;
  function get_NOK() {
    init_properties_NorwegianKrone_kt_ltlo15();
    return NOK;
  }
  var NOK;
  var nkr;
  function NorwegianKrone_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    NorwegianKrone.call($this, value);
    return $this;
  }
  function NorwegianKrone_init_$Create$(value, $mask0, $marker) {
    return NorwegianKrone_init_$Init$(value, $mask0, $marker, Object.create(NorwegianKrone.prototype));
  }
  function NorwegianKrone(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionNorwegianKrone(), this);
  }
  function descriptionNorwegianKrone$lambda(v) {
    init_properties_NorwegianKrone_kt_ltlo15();
    return new NorwegianKrone(v);
  }
  var properties_initialized_NorwegianKrone_kt_xftalv;
  function init_properties_NorwegianKrone_kt_ltlo15() {
    if (properties_initialized_NorwegianKrone_kt_xftalv) {
    } else {
      properties_initialized_NorwegianKrone_kt_xftalv = true;
      descriptionNorwegianKrone = UnitSpecification_init_$Create$('NOK', 'nkr', 0, descriptionNorwegianKrone$lambda, 4, null);
      NOK = NorwegianKrone_init_$Create$(0.0, 1, null);
      nkr = NorwegianKrone_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionPhilippinePeso() {
    init_properties_PhilippinePeso_kt_4quyjb();
    return descriptionPhilippinePeso;
  }
  var descriptionPhilippinePeso;
  function get_PHP() {
    init_properties_PhilippinePeso_kt_4quyjb();
    return PHP;
  }
  var PHP;
  function PhilippinePeso_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    PhilippinePeso.call($this, value);
    return $this;
  }
  function PhilippinePeso_init_$Create$(value, $mask0, $marker) {
    return PhilippinePeso_init_$Init$(value, $mask0, $marker, Object.create(PhilippinePeso.prototype));
  }
  function PhilippinePeso(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionPhilippinePeso(), this);
  }
  function descriptionPhilippinePeso$lambda(v) {
    init_properties_PhilippinePeso_kt_4quyjb();
    return new PhilippinePeso(v);
  }
  var properties_initialized_PhilippinePeso_kt_kik1vf;
  function init_properties_PhilippinePeso_kt_4quyjb() {
    if (properties_initialized_PhilippinePeso_kt_kik1vf) {
    } else {
      properties_initialized_PhilippinePeso_kt_kik1vf = true;
      descriptionPhilippinePeso = UnitSpecification_init_$Create$('PHP', '`\u20B1`', 0, descriptionPhilippinePeso$lambda, 4, null);
      PHP = PhilippinePeso_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionPolishZłoty() {
    init_properties_PolishZłoty_kt_yjutvr();
    return descriptionPolishZłoty;
  }
  var descriptionPolishZłoty;
  function get_PLN() {
    init_properties_PolishZłoty_kt_yjutvr();
    return PLN;
  }
  var PLN;
  function PolishZłoty_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    PolishZłoty.call($this, value);
    return $this;
  }
  function PolishZłoty_init_$Create$(value, $mask0, $marker) {
    return PolishZłoty_init_$Init$(value, $mask0, $marker, Object.create(PolishZłoty.prototype));
  }
  function PolishZłoty(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionPolishZłoty(), this);
  }
  function descriptionPolishZłoty$lambda(v) {
    init_properties_PolishZłoty_kt_yjutvr();
    return new PolishZłoty(v);
  }
  var properties_initialized_PolishZłoty_kt_6b7fxn;
  function init_properties_PolishZłoty_kt_yjutvr() {
    if (properties_initialized_PolishZłoty_kt_6b7fxn) {
    } else {
      properties_initialized_PolishZłoty_kt_6b7fxn = true;
      descriptionPolishZłoty = UnitSpecification_init_$Create$('PLN', '`z\u0142`', 0, descriptionPolishZłoty$lambda, 4, null);
      PLN = PolishZłoty_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionPoundSterling() {
    init_properties_PoundSterling_kt_h0t3b0();
    return descriptionPoundSterling;
  }
  var descriptionPoundSterling;
  function get_GBP() {
    init_properties_PoundSterling_kt_h0t3b0();
    return GBP;
  }
  var GBP;
  function PoundSterling_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    PoundSterling.call($this, value);
    return $this;
  }
  function PoundSterling_init_$Create$(value, $mask0, $marker) {
    return PoundSterling_init_$Init$(value, $mask0, $marker, Object.create(PoundSterling.prototype));
  }
  function PoundSterling(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionPoundSterling(), this);
  }
  function descriptionPoundSterling$lambda(v) {
    init_properties_PoundSterling_kt_h0t3b0();
    return new PoundSterling(v);
  }
  var properties_initialized_PoundSterling_kt_bxiqao;
  function init_properties_PoundSterling_kt_h0t3b0() {
    if (properties_initialized_PoundSterling_kt_bxiqao) {
    } else {
      properties_initialized_PoundSterling_kt_bxiqao = true;
      descriptionPoundSterling = UnitSpecification_init_$Create$('GBP', '`\xA3`', 0, descriptionPoundSterling$lambda, 4, null);
      GBP = PoundSterling_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionRenminbi() {
    init_properties_Renminbi_kt_5rhgfw();
    return descriptionRenminbi;
  }
  var descriptionRenminbi;
  function get_CNY() {
    init_properties_Renminbi_kt_5rhgfw();
    return CNY;
  }
  var CNY;
  function Renminbi_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    Renminbi.call($this, value);
    return $this;
  }
  function Renminbi_init_$Create$(value, $mask0, $marker) {
    return Renminbi_init_$Init$(value, $mask0, $marker, Object.create(Renminbi.prototype));
  }
  function Renminbi(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionRenminbi(), this);
  }
  function descriptionRenminbi$lambda(v) {
    init_properties_Renminbi_kt_5rhgfw();
    return new Renminbi(v);
  }
  var properties_initialized_Renminbi_kt_avz89s;
  function init_properties_Renminbi_kt_5rhgfw() {
    if (properties_initialized_Renminbi_kt_avz89s) {
    } else {
      properties_initialized_Renminbi_kt_avz89s = true;
      descriptionRenminbi = UnitSpecification_init_$Create$('CNY', '`\u4EBA\u6C11\u5E01`', 0, descriptionRenminbi$lambda, 4, null);
      CNY = Renminbi_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionRomanianLeu() {
    init_properties_RomanianLeu_kt_igi5yp();
    return descriptionRomanianLeu;
  }
  var descriptionRomanianLeu;
  function get_RON() {
    init_properties_RomanianLeu_kt_igi5yp();
    return RON;
  }
  var RON;
  var RL;
  function RomanianLeu_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    RomanianLeu.call($this, value);
    return $this;
  }
  function RomanianLeu_init_$Create$(value, $mask0, $marker) {
    return RomanianLeu_init_$Init$(value, $mask0, $marker, Object.create(RomanianLeu.prototype));
  }
  function RomanianLeu(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionRomanianLeu(), this);
  }
  function descriptionRomanianLeu$lambda(v) {
    init_properties_RomanianLeu_kt_igi5yp();
    return new RomanianLeu(v);
  }
  var properties_initialized_RomanianLeu_kt_obyi2b;
  function init_properties_RomanianLeu_kt_igi5yp() {
    if (properties_initialized_RomanianLeu_kt_obyi2b) {
    } else {
      properties_initialized_RomanianLeu_kt_obyi2b = true;
      descriptionRomanianLeu = UnitSpecification_init_$Create$('RON', 'RL', 0, descriptionRomanianLeu$lambda, 4, null);
      RON = RomanianLeu_init_$Create$(0.0, 1, null);
      RL = RomanianLeu_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionRussianRuble() {
    init_properties_RussianRuble_kt_vhuhd7();
    return descriptionRussianRuble;
  }
  var descriptionRussianRuble;
  function get_RUB() {
    init_properties_RussianRuble_kt_vhuhd7();
    return RUB;
  }
  var RUB;
  function RussianRuble_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    RussianRuble.call($this, value);
    return $this;
  }
  function RussianRuble_init_$Create$(value, $mask0, $marker) {
    return RussianRuble_init_$Init$(value, $mask0, $marker, Object.create(RussianRuble.prototype));
  }
  function RussianRuble(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionRussianRuble(), this);
  }
  function descriptionRussianRuble$lambda(v) {
    init_properties_RussianRuble_kt_vhuhd7();
    return new RussianRuble(v);
  }
  var properties_initialized_RussianRuble_kt_8f24p3;
  function init_properties_RussianRuble_kt_vhuhd7() {
    if (properties_initialized_RussianRuble_kt_8f24p3) {
    } else {
      properties_initialized_RussianRuble_kt_8f24p3 = true;
      descriptionRussianRuble = UnitSpecification_init_$Create$('RUB', '`\u20BD`', 0, descriptionRussianRuble$lambda, 4, null);
      RUB = RussianRuble_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionSaudiRiyal() {
    init_properties_SaudiRiyal_kt_xklqk9();
    return descriptionSaudiRiyal;
  }
  var descriptionSaudiRiyal;
  function get_SAR() {
    init_properties_SaudiRiyal_kt_xklqk9();
    return SAR;
  }
  var SAR;
  function SaudiRiyal_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    SaudiRiyal.call($this, value);
    return $this;
  }
  function SaudiRiyal_init_$Create$(value, $mask0, $marker) {
    return SaudiRiyal_init_$Init$(value, $mask0, $marker, Object.create(SaudiRiyal.prototype));
  }
  function SaudiRiyal(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionSaudiRiyal(), this);
  }
  function descriptionSaudiRiyal$lambda(v) {
    init_properties_SaudiRiyal_kt_xklqk9();
    return new SaudiRiyal(v);
  }
  var properties_initialized_SaudiRiyal_kt_dmu6ub;
  function init_properties_SaudiRiyal_kt_xklqk9() {
    if (properties_initialized_SaudiRiyal_kt_dmu6ub) {
    } else {
      properties_initialized_SaudiRiyal_kt_dmu6ub = true;
      descriptionSaudiRiyal = UnitSpecification_init_$Create$('SAR', '`\uFDFC `', 0, descriptionSaudiRiyal$lambda, 4, null);
      SAR = SaudiRiyal_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionSingaporeDollar() {
    init_properties_SingaporeDollar_kt_gvjmx8();
    return descriptionSingaporeDollar;
  }
  var descriptionSingaporeDollar;
  function get_SGD() {
    init_properties_SingaporeDollar_kt_gvjmx8();
    return SGD;
  }
  var SGD;
  function SingaporeDollar_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    SingaporeDollar.call($this, value);
    return $this;
  }
  function SingaporeDollar_init_$Create$(value, $mask0, $marker) {
    return SingaporeDollar_init_$Init$(value, $mask0, $marker, Object.create(SingaporeDollar.prototype));
  }
  function SingaporeDollar(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionSingaporeDollar(), this);
  }
  function descriptionSingaporeDollar$lambda(v) {
    init_properties_SingaporeDollar_kt_gvjmx8();
    return new SingaporeDollar(v);
  }
  var properties_initialized_SingaporeDollar_kt_p8q5bk;
  function init_properties_SingaporeDollar_kt_gvjmx8() {
    if (properties_initialized_SingaporeDollar_kt_p8q5bk) {
    } else {
      properties_initialized_SingaporeDollar_kt_p8q5bk = true;
      descriptionSingaporeDollar = UnitSpecification_init_$Create$('SGD', '`S$`', 0, descriptionSingaporeDollar$lambda, 4, null);
      SGD = SingaporeDollar_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionSouthAfricanRand() {
    init_properties_SouthAfricanRand_kt_i5945u();
    return descriptionSouthAfricanRand;
  }
  var descriptionSouthAfricanRand;
  function get_ZAR() {
    init_properties_SouthAfricanRand_kt_i5945u();
    return ZAR;
  }
  var ZAR;
  var R;
  function SouthAfricanRand_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    SouthAfricanRand.call($this, value);
    return $this;
  }
  function SouthAfricanRand_init_$Create$(value, $mask0, $marker) {
    return SouthAfricanRand_init_$Init$(value, $mask0, $marker, Object.create(SouthAfricanRand.prototype));
  }
  function SouthAfricanRand(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionSouthAfricanRand(), this);
  }
  function descriptionSouthAfricanRand$lambda(v) {
    init_properties_SouthAfricanRand_kt_i5945u();
    return new SouthAfricanRand(v);
  }
  var properties_initialized_SouthAfricanRand_kt_6ml9ea;
  function init_properties_SouthAfricanRand_kt_i5945u() {
    if (properties_initialized_SouthAfricanRand_kt_6ml9ea) {
    } else {
      properties_initialized_SouthAfricanRand_kt_6ml9ea = true;
      descriptionSouthAfricanRand = UnitSpecification_init_$Create$('ZAR', 'R', 0, descriptionSouthAfricanRand$lambda, 4, null);
      ZAR = SouthAfricanRand_init_$Create$(0.0, 1, null);
      R = SouthAfricanRand_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionSouthKoreanWon() {
    init_properties_SouthKoreanWon_kt_mjmijv();
    return descriptionSouthKoreanWon;
  }
  var descriptionSouthKoreanWon;
  function get_KRW() {
    init_properties_SouthKoreanWon_kt_mjmijv();
    return KRW;
  }
  var KRW;
  function SouthKoreanWon_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    SouthKoreanWon.call($this, value);
    return $this;
  }
  function SouthKoreanWon_init_$Create$(value, $mask0, $marker) {
    return SouthKoreanWon_init_$Init$(value, $mask0, $marker, Object.create(SouthKoreanWon.prototype));
  }
  function SouthKoreanWon(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionSouthKoreanWon(), this);
  }
  function descriptionSouthKoreanWon$lambda(v) {
    init_properties_SouthKoreanWon_kt_mjmijv();
    return new SouthKoreanWon(v);
  }
  var properties_initialized_SouthKoreanWon_kt_6rxf7r;
  function init_properties_SouthKoreanWon_kt_mjmijv() {
    if (properties_initialized_SouthKoreanWon_kt_6rxf7r) {
    } else {
      properties_initialized_SouthKoreanWon_kt_6rxf7r = true;
      descriptionSouthKoreanWon = UnitSpecification_init_$Create$('KRW', '`\u20A9`', 0, descriptionSouthKoreanWon$lambda, 4, null);
      KRW = SouthKoreanWon_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionSwedishKrona() {
    init_properties_SwedishKrona_kt_z3mrae();
    return descriptionSwedishKrona;
  }
  var descriptionSwedishKrona;
  function get_SEK() {
    init_properties_SwedishKrona_kt_z3mrae();
    return SEK;
  }
  var SEK;
  var skr;
  function SwedishKrona_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    SwedishKrona.call($this, value);
    return $this;
  }
  function SwedishKrona_init_$Create$(value, $mask0, $marker) {
    return SwedishKrona_init_$Init$(value, $mask0, $marker, Object.create(SwedishKrona.prototype));
  }
  function SwedishKrona(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionSwedishKrona(), this);
  }
  function descriptionSwedishKrona$lambda(v) {
    init_properties_SwedishKrona_kt_z3mrae();
    return new SwedishKrona(v);
  }
  var properties_initialized_SwedishKrona_kt_c0uema;
  function init_properties_SwedishKrona_kt_z3mrae() {
    if (properties_initialized_SwedishKrona_kt_c0uema) {
    } else {
      properties_initialized_SwedishKrona_kt_c0uema = true;
      descriptionSwedishKrona = UnitSpecification_init_$Create$('SEK', 'skr', 0, descriptionSwedishKrona$lambda, 4, null);
      SEK = SwedishKrona_init_$Create$(0.0, 1, null);
      skr = SwedishKrona_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionSwissFranc() {
    init_properties_SwissFranc_kt_6lrowl();
    return descriptionSwissFranc;
  }
  var descriptionSwissFranc;
  function get_CHF() {
    init_properties_SwissFranc_kt_6lrowl();
    return CHF;
  }
  var CHF;
  var SCHF;
  function SwissFranc_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    SwissFranc.call($this, value);
    return $this;
  }
  function SwissFranc_init_$Create$(value, $mask0, $marker) {
    return SwissFranc_init_$Init$(value, $mask0, $marker, Object.create(SwissFranc.prototype));
  }
  function SwissFranc(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionSwissFranc(), this);
  }
  function descriptionSwissFranc$lambda(v) {
    init_properties_SwissFranc_kt_6lrowl();
    return new SwissFranc(v);
  }
  var properties_initialized_SwissFranc_kt_uffth5;
  function init_properties_SwissFranc_kt_6lrowl() {
    if (properties_initialized_SwissFranc_kt_uffth5) {
    } else {
      properties_initialized_SwissFranc_kt_uffth5 = true;
      descriptionSwissFranc = UnitSpecification_init_$Create$('CHF', 'SCHF', 0, descriptionSwissFranc$lambda, 4, null);
      CHF = SwissFranc_init_$Create$(0.0, 1, null);
      SCHF = SwissFranc_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionThaiBaht() {
    init_properties_ThaiBaht_kt_dg9yj1();
    return descriptionThaiBaht;
  }
  var descriptionThaiBaht;
  function get_THB() {
    init_properties_ThaiBaht_kt_dg9yj1();
    return THB;
  }
  var THB;
  function ThaiBaht_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    ThaiBaht.call($this, value);
    return $this;
  }
  function ThaiBaht_init_$Create$(value, $mask0, $marker) {
    return ThaiBaht_init_$Init$(value, $mask0, $marker, Object.create(ThaiBaht.prototype));
  }
  function ThaiBaht(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionThaiBaht(), this);
  }
  function descriptionThaiBaht$lambda(v) {
    init_properties_ThaiBaht_kt_dg9yj1();
    return new ThaiBaht(v);
  }
  var properties_initialized_ThaiBaht_kt_8bs6p5;
  function init_properties_ThaiBaht_kt_dg9yj1() {
    if (properties_initialized_ThaiBaht_kt_8bs6p5) {
    } else {
      properties_initialized_ThaiBaht_kt_8bs6p5 = true;
      descriptionThaiBaht = UnitSpecification_init_$Create$('THB', '`\u0E3F`', 0, descriptionThaiBaht$lambda, 4, null);
      THB = ThaiBaht_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionTurkishLira() {
    init_properties_TurkishLira_kt_rjpifw();
    return descriptionTurkishLira;
  }
  var descriptionTurkishLira;
  function get_TRY() {
    init_properties_TurkishLira_kt_rjpifw();
    return TRY;
  }
  var TRY;
  function TurkishLira_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    TurkishLira.call($this, value);
    return $this;
  }
  function TurkishLira_init_$Create$(value, $mask0, $marker) {
    return TurkishLira_init_$Init$(value, $mask0, $marker, Object.create(TurkishLira.prototype));
  }
  function TurkishLira(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionTurkishLira(), this);
  }
  function descriptionTurkishLira$lambda(v) {
    init_properties_TurkishLira_kt_rjpifw();
    return new TurkishLira(v);
  }
  var properties_initialized_TurkishLira_kt_oxvi8;
  function init_properties_TurkishLira_kt_rjpifw() {
    if (properties_initialized_TurkishLira_kt_oxvi8) {
    } else {
      properties_initialized_TurkishLira_kt_oxvi8 = true;
      descriptionTurkishLira = UnitSpecification_init_$Create$('TRY', '`\u20BA`', 0, descriptionTurkishLira$lambda, 4, null);
      TRY = TurkishLira_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionUAEDirham() {
    init_properties_UAEDirham_kt_nypb58();
    return descriptionUAEDirham;
  }
  var descriptionUAEDirham;
  function get_AED() {
    init_properties_UAEDirham_kt_nypb58();
    return AED;
  }
  var AED;
  var Dh;
  function UAEDirham_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    UAEDirham.call($this, value);
    return $this;
  }
  function UAEDirham_init_$Create$(value, $mask0, $marker) {
    return UAEDirham_init_$Init$(value, $mask0, $marker, Object.create(UAEDirham.prototype));
  }
  function UAEDirham(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionUAEDirham(), this);
  }
  function descriptionUAEDirham$lambda(v) {
    init_properties_UAEDirham_kt_nypb58();
    return new UAEDirham(v);
  }
  var properties_initialized_UAEDirham_kt_75mgcw;
  function init_properties_UAEDirham_kt_nypb58() {
    if (properties_initialized_UAEDirham_kt_75mgcw) {
    } else {
      properties_initialized_UAEDirham_kt_75mgcw = true;
      descriptionUAEDirham = UnitSpecification_init_$Create$('AED', 'Dh', 0, descriptionUAEDirham$lambda, 4, null);
      AED = UAEDirham_init_$Create$(0.0, 1, null);
      Dh = UAEDirham_init_$Create$(0.0, 1, null);
    }
  }
  function get_descriptionUnitedStatesDollar() {
    init_properties_UnitedStatesDollar_kt_tsv7yx();
    return descriptionUnitedStatesDollar;
  }
  var descriptionUnitedStatesDollar;
  function get_USD() {
    init_properties_UnitedStatesDollar_kt_tsv7yx();
    return USD;
  }
  var USD;
  function UnitedStatesDollar_init_$Init$(value, $mask0, $marker, $this) {
    if (!(($mask0 & 1) === 0))
      value = 1.0;
    UnitedStatesDollar.call($this, value);
    return $this;
  }
  function UnitedStatesDollar_init_$Create$(value, $mask0, $marker) {
    return UnitedStatesDollar_init_$Init$(value, $mask0, $marker, Object.create(UnitedStatesDollar.prototype));
  }
  function UnitedStatesDollar(value) {
    var value_0 = value === void 1 ? 1.0 : value;
    Expression_init_$Init$(value_0, get_descriptionUnitedStatesDollar(), this);
  }
  function descriptionUnitedStatesDollar$lambda(v) {
    init_properties_UnitedStatesDollar_kt_tsv7yx();
    return new UnitedStatesDollar(v);
  }
  var properties_initialized_UnitedStatesDollar_kt_tb39vn;
  function init_properties_UnitedStatesDollar_kt_tsv7yx() {
    if (properties_initialized_UnitedStatesDollar_kt_tb39vn) {
    } else {
      properties_initialized_UnitedStatesDollar_kt_tb39vn = true;
      descriptionUnitedStatesDollar = UnitSpecification_init_$Create$('USD', '`US$`', 0, descriptionUnitedStatesDollar$lambda, 4, null);
      USD = UnitedStatesDollar_init_$Create$(0.0, 1, null);
    }
  }
  function get_formula() {
    init_properties_Becquerel_kt_240c04();
    return formula;
  }
  var formula;
  function get_Bq() {
    init_properties_Becquerel_kt_240c04();
    return Bq;
  }
  var Bq;
  function get_QBq() {
    init_properties_Becquerel_kt_240c04();
    return QBq;
  }
  var QBq;
  function get_quettabecquerel() {
    init_properties_Becquerel_kt_240c04();
    return quettabecquerel;
  }
  var quettabecquerel;
  function get_RBq() {
    init_properties_Becquerel_kt_240c04();
    return RBq;
  }
  var RBq;
  function get_ronnabecquerel() {
    init_properties_Becquerel_kt_240c04();
    return ronnabecquerel;
  }
  var ronnabecquerel;
  function get_YBq() {
    init_properties_Becquerel_kt_240c04();
    return YBq;
  }
  var YBq;
  function get_yottabecquerel() {
    init_properties_Becquerel_kt_240c04();
    return yottabecquerel;
  }
  var yottabecquerel;
  function get_ZBq() {
    init_properties_Becquerel_kt_240c04();
    return ZBq;
  }
  var ZBq;
  function get_zettabecquerel() {
    init_properties_Becquerel_kt_240c04();
    return zettabecquerel;
  }
  var zettabecquerel;
  function get_EBq() {
    init_properties_Becquerel_kt_240c04();
    return EBq;
  }
  var EBq;
  function get_exabecquerel() {
    init_properties_Becquerel_kt_240c04();
    return exabecquerel;
  }
  var exabecquerel;
  function get_PBq() {
    init_properties_Becquerel_kt_240c04();
    return PBq;
  }
  var PBq;
  function get_petabecquerel() {
    init_properties_Becquerel_kt_240c04();
    return petabecquerel;
  }
  var petabecquerel;
  function get_TBq() {
    init_properties_Becquerel_kt_240c04();
    return TBq;
  }
  var TBq;
  function get_terabecquerel() {
    init_properties_Becquerel_kt_240c04();
    return terabecquerel;
  }
  var terabecquerel;
  function get_GBq() {
    init_properties_Becquerel_kt_240c04();
    return GBq;
  }
  var GBq;
  function get_gigabecquerel() {
    init_properties_Becquerel_kt_240c04();
    return gigabecquerel;
  }
  var gigabecquerel;
  function get_MBq() {
    init_properties_Becquerel_kt_240c04();
    return MBq;
  }
  var MBq;
  function get_megabecquerel() {
    init_properties_Becquerel_kt_240c04();
    return megabecquerel;
  }
  var megabecquerel;
  function get_kBq() {
    init_properties_Becquerel_kt_240c04();
    return kBq;
  }
  var kBq;
  function get_kilobecquerel() {
    init_properties_Becquerel_kt_240c04();
    return kilobecquerel;
  }
  var kilobecquerel;
  function get_hBq() {
    init_properties_Becquerel_kt_240c04();
    return hBq;
  }
  var hBq;
  function get_hectobecquerel() {
    init_properties_Becquerel_kt_240c04();
    return hectobecquerel;
  }
  var hectobecquerel;
  function get_daBq() {
    init_properties_Becquerel_kt_240c04();
    return daBq;
  }
  var daBq;
  function get_decabecquerel() {
    init_properties_Becquerel_kt_240c04();
    return decabecquerel;
  }
  var decabecquerel;
  function get_dBq() {
    init_properties_Becquerel_kt_240c04();
    return dBq;
  }
  var dBq;
  function get_decibecquerel() {
    init_properties_Becquerel_kt_240c04();
    return decibecquerel;
  }
  var decibecquerel;
  function get_cBq() {
    init_properties_Becquerel_kt_240c04();
    return cBq;
  }
  var cBq;
  function get_centibecquerel() {
    init_properties_Becquerel_kt_240c04();
    return centibecquerel;
  }
  var centibecquerel;
  function get_mBq() {
    init_properties_Becquerel_kt_240c04();
    return mBq;
  }
  var mBq;
  function get_millibecquerel() {
    init_properties_Becquerel_kt_240c04();
    return millibecquerel;
  }
  var millibecquerel;
  function get_μBq() {
    init_properties_Becquerel_kt_240c04();
    return μBq;
  }
  var μBq;
  function get_microbecquerel() {
    init_properties_Becquerel_kt_240c04();
    return microbecquerel;
  }
  var microbecquerel;
  function get_nBq() {
    init_properties_Becquerel_kt_240c04();
    return nBq;
  }
  var nBq;
  function get_nanobecquerel() {
    init_properties_Becquerel_kt_240c04();
    return nanobecquerel;
  }
  var nanobecquerel;
  function get_pBq() {
    init_properties_Becquerel_kt_240c04();
    return pBq;
  }
  var pBq;
  function get_picobecquerel() {
    init_properties_Becquerel_kt_240c04();
    return picobecquerel;
  }
  var picobecquerel;
  function get_fBq() {
    init_properties_Becquerel_kt_240c04();
    return fBq;
  }
  var fBq;
  function get_femtobecquerel() {
    init_properties_Becquerel_kt_240c04();
    return femtobecquerel;
  }
  var femtobecquerel;
  function get_aBq() {
    init_properties_Becquerel_kt_240c04();
    return aBq;
  }
  var aBq;
  function get_attobecquerel() {
    init_properties_Becquerel_kt_240c04();
    return attobecquerel;
  }
  var attobecquerel;
  function get_zBq() {
    init_properties_Becquerel_kt_240c04();
    return zBq;
  }
  var zBq;
  function get_zeptobecquerel() {
    init_properties_Becquerel_kt_240c04();
    return zeptobecquerel;
  }
  var zeptobecquerel;
  function get_yBq() {
    init_properties_Becquerel_kt_240c04();
    return yBq;
  }
  var yBq;
  function get_yoctobecquerel() {
    init_properties_Becquerel_kt_240c04();
    return yoctobecquerel;
  }
  var yoctobecquerel;
  function get_rBq() {
    init_properties_Becquerel_kt_240c04();
    return rBq;
  }
  var rBq;
  function get_rontobecquerel() {
    init_properties_Becquerel_kt_240c04();
    return rontobecquerel;
  }
  var rontobecquerel;
  function get_qBq() {
    init_properties_Becquerel_kt_240c04();
    return qBq;
  }
  var qBq;
  function get_quectobecquerel() {
    init_properties_Becquerel_kt_240c04();
    return quectobecquerel;
  }
  var quectobecquerel;
  function Becquerel(value) {
    DerivedUnit.call(this, value, get_formula());
  }
  var properties_initialized_Becquerel_kt_ep2is8;
  function init_properties_Becquerel_kt_240c04() {
    if (properties_initialized_Becquerel_kt_ep2is8) {
    } else {
      properties_initialized_Becquerel_kt_ep2is8 = true;
      formula = powExpression(get_s(), -1);
      Bq = get_formula();
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 30.0);
      QBq = times_2(tmp$ret$0, powExpression(get_s(), -1));
      quettabecquerel = get_QBq();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 27.0);
      RBq = times_2(tmp$ret$0_0, powExpression(get_s(), -1));
      ronnabecquerel = get_RBq();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 24.0);
      YBq = times_2(tmp$ret$0_1, powExpression(get_s(), -1));
      yottabecquerel = get_YBq();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 21.0);
      ZBq = times_2(tmp$ret$0_2, powExpression(get_s(), -1));
      zettabecquerel = get_ZBq();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 18.0);
      EBq = times_2(tmp$ret$0_3, powExpression(get_s(), -1));
      exabecquerel = get_EBq();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 15.0);
      PBq = times_2(tmp$ret$0_4, powExpression(get_s(), -1));
      petabecquerel = get_PBq();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 12.0);
      TBq = times_2(tmp$ret$0_5, powExpression(get_s(), -1));
      terabecquerel = get_TBq();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 9.0);
      GBq = times_2(tmp$ret$0_6, powExpression(get_s(), -1));
      gigabecquerel = get_GBq();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 6.0);
      MBq = times_2(tmp$ret$0_7, powExpression(get_s(), -1));
      megabecquerel = get_MBq();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, 3.0);
      kBq = times_2(tmp$ret$0_8, powExpression(get_s(), -1));
      kilobecquerel = get_kBq();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, 2.0);
      hBq = times_2(tmp$ret$0_9, powExpression(get_s(), -1));
      hectobecquerel = get_hBq();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, 1.0);
      daBq = times_2(tmp$ret$0_10, powExpression(get_s(), -1));
      decabecquerel = get_daBq();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -1.0);
      dBq = times_2(tmp$ret$0_11, powExpression(get_s(), -1));
      decibecquerel = get_dBq();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -2.0);
      cBq = times_2(tmp$ret$0_12, powExpression(get_s(), -1));
      centibecquerel = get_cBq();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -3.0);
      mBq = times_2(tmp$ret$0_13, powExpression(get_s(), -1));
      millibecquerel = get_mBq();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -6.0);
      μBq = times_2(tmp$ret$0_14, powExpression(get_s(), -1));
      microbecquerel = get_μBq();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -9.0);
      nBq = times_2(tmp$ret$0_15, powExpression(get_s(), -1));
      nanobecquerel = get_nBq();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -12.0);
      pBq = times_2(tmp$ret$0_16, powExpression(get_s(), -1));
      picobecquerel = get_pBq();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -15.0);
      fBq = times_2(tmp$ret$0_17, powExpression(get_s(), -1));
      femtobecquerel = get_fBq();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -18.0);
      aBq = times_2(tmp$ret$0_18, powExpression(get_s(), -1));
      attobecquerel = get_aBq();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -21.0);
      zBq = times_2(tmp$ret$0_19, powExpression(get_s(), -1));
      zeptobecquerel = get_zBq();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -24.0);
      yBq = times_2(tmp$ret$0_20, powExpression(get_s(), -1));
      yoctobecquerel = get_yBq();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -27.0);
      rBq = times_2(tmp$ret$0_21, powExpression(get_s(), -1));
      rontobecquerel = get_rBq();
      var tmp$ret$0_22;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_22 = Math.pow(10.0, -30.0);
      qBq = times_2(tmp$ret$0_22, powExpression(get_s(), -1));
      quectobecquerel = get_qBq();
    }
  }
  function get_formula_0() {
    init_properties_Coulomb_kt_gjiitp();
    return formula_0;
  }
  var formula_0;
  function get_C() {
    init_properties_Coulomb_kt_gjiitp();
    return C;
  }
  var C;
  function get_QC() {
    init_properties_Coulomb_kt_gjiitp();
    return QC;
  }
  var QC;
  function get_quettacoulomb() {
    init_properties_Coulomb_kt_gjiitp();
    return quettacoulomb;
  }
  var quettacoulomb;
  function get_RC() {
    init_properties_Coulomb_kt_gjiitp();
    return RC;
  }
  var RC;
  function get_ronnacoulomb() {
    init_properties_Coulomb_kt_gjiitp();
    return ronnacoulomb;
  }
  var ronnacoulomb;
  function get_YC() {
    init_properties_Coulomb_kt_gjiitp();
    return YC;
  }
  var YC;
  function get_yottacoulomb() {
    init_properties_Coulomb_kt_gjiitp();
    return yottacoulomb;
  }
  var yottacoulomb;
  function get_ZC() {
    init_properties_Coulomb_kt_gjiitp();
    return ZC;
  }
  var ZC;
  function get_zettacoulomb() {
    init_properties_Coulomb_kt_gjiitp();
    return zettacoulomb;
  }
  var zettacoulomb;
  function get_EC() {
    init_properties_Coulomb_kt_gjiitp();
    return EC;
  }
  var EC;
  function get_exacoulomb() {
    init_properties_Coulomb_kt_gjiitp();
    return exacoulomb;
  }
  var exacoulomb;
  function get_PC() {
    init_properties_Coulomb_kt_gjiitp();
    return PC;
  }
  var PC;
  function get_petacoulomb() {
    init_properties_Coulomb_kt_gjiitp();
    return petacoulomb;
  }
  var petacoulomb;
  function get_TC() {
    init_properties_Coulomb_kt_gjiitp();
    return TC;
  }
  var TC;
  function get_teracoulomb() {
    init_properties_Coulomb_kt_gjiitp();
    return teracoulomb;
  }
  var teracoulomb;
  function get_GC() {
    init_properties_Coulomb_kt_gjiitp();
    return GC;
  }
  var GC;
  function get_gigacoulomb() {
    init_properties_Coulomb_kt_gjiitp();
    return gigacoulomb;
  }
  var gigacoulomb;
  function get_MC() {
    init_properties_Coulomb_kt_gjiitp();
    return MC;
  }
  var MC;
  function get_megacoulomb() {
    init_properties_Coulomb_kt_gjiitp();
    return megacoulomb;
  }
  var megacoulomb;
  function get_kC() {
    init_properties_Coulomb_kt_gjiitp();
    return kC;
  }
  var kC;
  function get_kilocoulomb() {
    init_properties_Coulomb_kt_gjiitp();
    return kilocoulomb;
  }
  var kilocoulomb;
  function get_hC() {
    init_properties_Coulomb_kt_gjiitp();
    return hC;
  }
  var hC;
  function get_hectocoulomb() {
    init_properties_Coulomb_kt_gjiitp();
    return hectocoulomb;
  }
  var hectocoulomb;
  function get_daC() {
    init_properties_Coulomb_kt_gjiitp();
    return daC;
  }
  var daC;
  function get_decacoulomb() {
    init_properties_Coulomb_kt_gjiitp();
    return decacoulomb;
  }
  var decacoulomb;
  function get_dC() {
    init_properties_Coulomb_kt_gjiitp();
    return dC;
  }
  var dC;
  function get_decicoulomb() {
    init_properties_Coulomb_kt_gjiitp();
    return decicoulomb;
  }
  var decicoulomb;
  function get_cC() {
    init_properties_Coulomb_kt_gjiitp();
    return cC;
  }
  var cC;
  function get_centicoulomb() {
    init_properties_Coulomb_kt_gjiitp();
    return centicoulomb;
  }
  var centicoulomb;
  function get_mC() {
    init_properties_Coulomb_kt_gjiitp();
    return mC;
  }
  var mC;
  function get_millicoulomb() {
    init_properties_Coulomb_kt_gjiitp();
    return millicoulomb;
  }
  var millicoulomb;
  function get_μC() {
    init_properties_Coulomb_kt_gjiitp();
    return μC;
  }
  var μC;
  function get_microcoulomb() {
    init_properties_Coulomb_kt_gjiitp();
    return microcoulomb;
  }
  var microcoulomb;
  function get_nC() {
    init_properties_Coulomb_kt_gjiitp();
    return nC;
  }
  var nC;
  function get_nanocoulomb() {
    init_properties_Coulomb_kt_gjiitp();
    return nanocoulomb;
  }
  var nanocoulomb;
  function get_pC() {
    init_properties_Coulomb_kt_gjiitp();
    return pC;
  }
  var pC;
  function get_picocoulomb() {
    init_properties_Coulomb_kt_gjiitp();
    return picocoulomb;
  }
  var picocoulomb;
  function get_fC() {
    init_properties_Coulomb_kt_gjiitp();
    return fC;
  }
  var fC;
  function get_femtocoulomb() {
    init_properties_Coulomb_kt_gjiitp();
    return femtocoulomb;
  }
  var femtocoulomb;
  function get_aC() {
    init_properties_Coulomb_kt_gjiitp();
    return aC;
  }
  var aC;
  function get_attocoulomb() {
    init_properties_Coulomb_kt_gjiitp();
    return attocoulomb;
  }
  var attocoulomb;
  function get_zC() {
    init_properties_Coulomb_kt_gjiitp();
    return zC;
  }
  var zC;
  function get_zeptocoulomb() {
    init_properties_Coulomb_kt_gjiitp();
    return zeptocoulomb;
  }
  var zeptocoulomb;
  function get_yC() {
    init_properties_Coulomb_kt_gjiitp();
    return yC;
  }
  var yC;
  function get_yoctocoulomb() {
    init_properties_Coulomb_kt_gjiitp();
    return yoctocoulomb;
  }
  var yoctocoulomb;
  function get_rC() {
    init_properties_Coulomb_kt_gjiitp();
    return rC;
  }
  var rC;
  function get_rontocoulomb() {
    init_properties_Coulomb_kt_gjiitp();
    return rontocoulomb;
  }
  var rontocoulomb;
  function get_qC() {
    init_properties_Coulomb_kt_gjiitp();
    return qC;
  }
  var qC;
  function get_quectocoulomb() {
    init_properties_Coulomb_kt_gjiitp();
    return quectocoulomb;
  }
  var quectocoulomb;
  function Coulomb(value) {
    DerivedUnit.call(this, value, get_formula_0());
  }
  var properties_initialized_Coulomb_kt_6jb89b;
  function init_properties_Coulomb_kt_gjiitp() {
    if (properties_initialized_Coulomb_kt_6jb89b) {
    } else {
      properties_initialized_Coulomb_kt_6jb89b = true;
      formula_0 = times_0(get_s(), get_A());
      C = get_formula_0();
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 30.0);
      QC = times_2(tmp$ret$0, times_0(get_s(), get_A()));
      quettacoulomb = get_QC();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 27.0);
      RC = times_2(tmp$ret$0_0, times_0(get_s(), get_A()));
      ronnacoulomb = get_RC();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 24.0);
      YC = times_2(tmp$ret$0_1, times_0(get_s(), get_A()));
      yottacoulomb = get_YC();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 21.0);
      ZC = times_2(tmp$ret$0_2, times_0(get_s(), get_A()));
      zettacoulomb = get_ZC();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 18.0);
      EC = times_2(tmp$ret$0_3, times_0(get_s(), get_A()));
      exacoulomb = get_EC();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 15.0);
      PC = times_2(tmp$ret$0_4, times_0(get_s(), get_A()));
      petacoulomb = get_PC();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 12.0);
      TC = times_2(tmp$ret$0_5, times_0(get_s(), get_A()));
      teracoulomb = get_TC();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 9.0);
      GC = times_2(tmp$ret$0_6, times_0(get_s(), get_A()));
      gigacoulomb = get_GC();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 6.0);
      MC = times_2(tmp$ret$0_7, times_0(get_s(), get_A()));
      megacoulomb = get_MC();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, 3.0);
      kC = times_2(tmp$ret$0_8, times_0(get_s(), get_A()));
      kilocoulomb = get_kC();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, 2.0);
      hC = times_2(tmp$ret$0_9, times_0(get_s(), get_A()));
      hectocoulomb = get_hC();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, 1.0);
      daC = times_2(tmp$ret$0_10, times_0(get_s(), get_A()));
      decacoulomb = get_daC();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -1.0);
      dC = times_2(tmp$ret$0_11, times_0(get_s(), get_A()));
      decicoulomb = get_dC();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -2.0);
      cC = times_2(tmp$ret$0_12, times_0(get_s(), get_A()));
      centicoulomb = get_cC();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -3.0);
      mC = times_2(tmp$ret$0_13, times_0(get_s(), get_A()));
      millicoulomb = get_mC();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -6.0);
      μC = times_2(tmp$ret$0_14, times_0(get_s(), get_A()));
      microcoulomb = get_μC();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -9.0);
      nC = times_2(tmp$ret$0_15, times_0(get_s(), get_A()));
      nanocoulomb = get_nC();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -12.0);
      pC = times_2(tmp$ret$0_16, times_0(get_s(), get_A()));
      picocoulomb = get_pC();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -15.0);
      fC = times_2(tmp$ret$0_17, times_0(get_s(), get_A()));
      femtocoulomb = get_fC();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -18.0);
      aC = times_2(tmp$ret$0_18, times_0(get_s(), get_A()));
      attocoulomb = get_aC();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -21.0);
      zC = times_2(tmp$ret$0_19, times_0(get_s(), get_A()));
      zeptocoulomb = get_zC();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -24.0);
      yC = times_2(tmp$ret$0_20, times_0(get_s(), get_A()));
      yoctocoulomb = get_yC();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -27.0);
      rC = times_2(tmp$ret$0_21, times_0(get_s(), get_A()));
      rontocoulomb = get_rC();
      var tmp$ret$0_22;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_22 = Math.pow(10.0, -30.0);
      qC = times_2(tmp$ret$0_22, times_0(get_s(), get_A()));
      quectocoulomb = get_qC();
    }
  }
  function get_formula_1() {
    init_properties_Farad_kt_gs63pi();
    return formula_1;
  }
  var formula_1;
  function get_F() {
    init_properties_Farad_kt_gs63pi();
    return F;
  }
  var F;
  function get_QF() {
    init_properties_Farad_kt_gs63pi();
    return QF;
  }
  var QF;
  function get_quettafarad() {
    init_properties_Farad_kt_gs63pi();
    return quettafarad;
  }
  var quettafarad;
  function get_RF() {
    init_properties_Farad_kt_gs63pi();
    return RF;
  }
  var RF;
  function get_ronnafarad() {
    init_properties_Farad_kt_gs63pi();
    return ronnafarad;
  }
  var ronnafarad;
  function get_YF() {
    init_properties_Farad_kt_gs63pi();
    return YF;
  }
  var YF;
  function get_yottafarad() {
    init_properties_Farad_kt_gs63pi();
    return yottafarad;
  }
  var yottafarad;
  function get_ZF() {
    init_properties_Farad_kt_gs63pi();
    return ZF;
  }
  var ZF;
  function get_zettafarad() {
    init_properties_Farad_kt_gs63pi();
    return zettafarad;
  }
  var zettafarad;
  function get_EF() {
    init_properties_Farad_kt_gs63pi();
    return EF;
  }
  var EF;
  function get_exafarad() {
    init_properties_Farad_kt_gs63pi();
    return exafarad;
  }
  var exafarad;
  function get_PF() {
    init_properties_Farad_kt_gs63pi();
    return PF;
  }
  var PF;
  function get_petafarad() {
    init_properties_Farad_kt_gs63pi();
    return petafarad;
  }
  var petafarad;
  function get_TF() {
    init_properties_Farad_kt_gs63pi();
    return TF;
  }
  var TF;
  function get_terafarad() {
    init_properties_Farad_kt_gs63pi();
    return terafarad;
  }
  var terafarad;
  function get_GF() {
    init_properties_Farad_kt_gs63pi();
    return GF;
  }
  var GF;
  function get_gigafarad() {
    init_properties_Farad_kt_gs63pi();
    return gigafarad;
  }
  var gigafarad;
  function get_MF() {
    init_properties_Farad_kt_gs63pi();
    return MF;
  }
  var MF;
  function get_megafarad() {
    init_properties_Farad_kt_gs63pi();
    return megafarad;
  }
  var megafarad;
  function get_kF() {
    init_properties_Farad_kt_gs63pi();
    return kF;
  }
  var kF;
  function get_kilofarad() {
    init_properties_Farad_kt_gs63pi();
    return kilofarad;
  }
  var kilofarad;
  function get_hF() {
    init_properties_Farad_kt_gs63pi();
    return hF;
  }
  var hF;
  function get_hectofarad() {
    init_properties_Farad_kt_gs63pi();
    return hectofarad;
  }
  var hectofarad;
  function get_daF() {
    init_properties_Farad_kt_gs63pi();
    return daF;
  }
  var daF;
  function get_decafarad() {
    init_properties_Farad_kt_gs63pi();
    return decafarad;
  }
  var decafarad;
  function get_dF() {
    init_properties_Farad_kt_gs63pi();
    return dF;
  }
  var dF;
  function get_decifarad() {
    init_properties_Farad_kt_gs63pi();
    return decifarad;
  }
  var decifarad;
  function get_cF() {
    init_properties_Farad_kt_gs63pi();
    return cF;
  }
  var cF;
  function get_centifarad() {
    init_properties_Farad_kt_gs63pi();
    return centifarad;
  }
  var centifarad;
  function get_mF() {
    init_properties_Farad_kt_gs63pi();
    return mF;
  }
  var mF;
  function get_millifarad() {
    init_properties_Farad_kt_gs63pi();
    return millifarad;
  }
  var millifarad;
  function get_μF() {
    init_properties_Farad_kt_gs63pi();
    return μF;
  }
  var μF;
  function get_microfarad() {
    init_properties_Farad_kt_gs63pi();
    return microfarad;
  }
  var microfarad;
  function get_nF() {
    init_properties_Farad_kt_gs63pi();
    return nF;
  }
  var nF;
  function get_nanofarad() {
    init_properties_Farad_kt_gs63pi();
    return nanofarad;
  }
  var nanofarad;
  function get_pF() {
    init_properties_Farad_kt_gs63pi();
    return pF;
  }
  var pF;
  function get_picofarad() {
    init_properties_Farad_kt_gs63pi();
    return picofarad;
  }
  var picofarad;
  function get_fF() {
    init_properties_Farad_kt_gs63pi();
    return fF;
  }
  var fF;
  function get_femtofarad() {
    init_properties_Farad_kt_gs63pi();
    return femtofarad;
  }
  var femtofarad;
  function get_aF() {
    init_properties_Farad_kt_gs63pi();
    return aF;
  }
  var aF;
  function get_attofarad() {
    init_properties_Farad_kt_gs63pi();
    return attofarad;
  }
  var attofarad;
  function get_zF() {
    init_properties_Farad_kt_gs63pi();
    return zF;
  }
  var zF;
  function get_zeptofarad() {
    init_properties_Farad_kt_gs63pi();
    return zeptofarad;
  }
  var zeptofarad;
  function get_yF() {
    init_properties_Farad_kt_gs63pi();
    return yF;
  }
  var yF;
  function get_yoctofarad() {
    init_properties_Farad_kt_gs63pi();
    return yoctofarad;
  }
  var yoctofarad;
  function get_rF() {
    init_properties_Farad_kt_gs63pi();
    return rF;
  }
  var rF;
  function get_rontofarad() {
    init_properties_Farad_kt_gs63pi();
    return rontofarad;
  }
  var rontofarad;
  function get_qF() {
    init_properties_Farad_kt_gs63pi();
    return qF;
  }
  var qF;
  function get_quectofarad() {
    init_properties_Farad_kt_gs63pi();
    return quectofarad;
  }
  var quectofarad;
  function Farad(value) {
    DerivedUnit.call(this, value, get_formula_1());
  }
  var properties_initialized_Farad_kt_xzai22;
  function init_properties_Farad_kt_gs63pi() {
    if (properties_initialized_Farad_kt_xzai22) {
    } else {
      properties_initialized_Farad_kt_xzai22 = true;
      formula_1 = times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 4)), powExpression(get_A(), 2));
      F = get_formula_1();
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 30.0);
      QF = times_2(tmp$ret$0, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 4)), powExpression(get_A(), 2)));
      quettafarad = get_QF();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 27.0);
      RF = times_2(tmp$ret$0_0, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 4)), powExpression(get_A(), 2)));
      ronnafarad = get_RF();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 24.0);
      YF = times_2(tmp$ret$0_1, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 4)), powExpression(get_A(), 2)));
      yottafarad = get_YF();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 21.0);
      ZF = times_2(tmp$ret$0_2, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 4)), powExpression(get_A(), 2)));
      zettafarad = get_ZF();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 18.0);
      EF = times_2(tmp$ret$0_3, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 4)), powExpression(get_A(), 2)));
      exafarad = get_EF();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 15.0);
      PF = times_2(tmp$ret$0_4, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 4)), powExpression(get_A(), 2)));
      petafarad = get_PF();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 12.0);
      TF = times_2(tmp$ret$0_5, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 4)), powExpression(get_A(), 2)));
      terafarad = get_TF();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 9.0);
      GF = times_2(tmp$ret$0_6, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 4)), powExpression(get_A(), 2)));
      gigafarad = get_GF();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 6.0);
      MF = times_2(tmp$ret$0_7, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 4)), powExpression(get_A(), 2)));
      megafarad = get_MF();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, 3.0);
      kF = times_2(tmp$ret$0_8, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 4)), powExpression(get_A(), 2)));
      kilofarad = get_kF();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, 2.0);
      hF = times_2(tmp$ret$0_9, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 4)), powExpression(get_A(), 2)));
      hectofarad = get_hF();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, 1.0);
      daF = times_2(tmp$ret$0_10, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 4)), powExpression(get_A(), 2)));
      decafarad = get_daF();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -1.0);
      dF = times_2(tmp$ret$0_11, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 4)), powExpression(get_A(), 2)));
      decifarad = get_dF();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -2.0);
      cF = times_2(tmp$ret$0_12, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 4)), powExpression(get_A(), 2)));
      centifarad = get_cF();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -3.0);
      mF = times_2(tmp$ret$0_13, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 4)), powExpression(get_A(), 2)));
      millifarad = get_mF();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -6.0);
      μF = times_2(tmp$ret$0_14, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 4)), powExpression(get_A(), 2)));
      microfarad = get_μF();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -9.0);
      nF = times_2(tmp$ret$0_15, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 4)), powExpression(get_A(), 2)));
      nanofarad = get_nF();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -12.0);
      pF = times_2(tmp$ret$0_16, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 4)), powExpression(get_A(), 2)));
      picofarad = get_pF();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -15.0);
      fF = times_2(tmp$ret$0_17, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 4)), powExpression(get_A(), 2)));
      femtofarad = get_fF();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -18.0);
      aF = times_2(tmp$ret$0_18, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 4)), powExpression(get_A(), 2)));
      attofarad = get_aF();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -21.0);
      zF = times_2(tmp$ret$0_19, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 4)), powExpression(get_A(), 2)));
      zeptofarad = get_zF();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -24.0);
      yF = times_2(tmp$ret$0_20, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 4)), powExpression(get_A(), 2)));
      yoctofarad = get_yF();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -27.0);
      rF = times_2(tmp$ret$0_21, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 4)), powExpression(get_A(), 2)));
      rontofarad = get_rF();
      var tmp$ret$0_22;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_22 = Math.pow(10.0, -30.0);
      qF = times_2(tmp$ret$0_22, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 4)), powExpression(get_A(), 2)));
      quectofarad = get_qF();
    }
  }
  function get_formula_2() {
    init_properties_Gray_kt_st6n6f();
    return formula_2;
  }
  var formula_2;
  function get_Gy() {
    init_properties_Gray_kt_st6n6f();
    return Gy;
  }
  var Gy;
  function get_QGy() {
    init_properties_Gray_kt_st6n6f();
    return QGy;
  }
  var QGy;
  function get_quettagray() {
    init_properties_Gray_kt_st6n6f();
    return quettagray;
  }
  var quettagray;
  function get_RGy() {
    init_properties_Gray_kt_st6n6f();
    return RGy;
  }
  var RGy;
  function get_ronnagray() {
    init_properties_Gray_kt_st6n6f();
    return ronnagray;
  }
  var ronnagray;
  function get_YGy() {
    init_properties_Gray_kt_st6n6f();
    return YGy;
  }
  var YGy;
  function get_yottagray() {
    init_properties_Gray_kt_st6n6f();
    return yottagray;
  }
  var yottagray;
  function get_ZGy() {
    init_properties_Gray_kt_st6n6f();
    return ZGy;
  }
  var ZGy;
  function get_zettagray() {
    init_properties_Gray_kt_st6n6f();
    return zettagray;
  }
  var zettagray;
  function get_EGy() {
    init_properties_Gray_kt_st6n6f();
    return EGy;
  }
  var EGy;
  function get_exagray() {
    init_properties_Gray_kt_st6n6f();
    return exagray;
  }
  var exagray;
  function get_PGy() {
    init_properties_Gray_kt_st6n6f();
    return PGy;
  }
  var PGy;
  function get_petagray() {
    init_properties_Gray_kt_st6n6f();
    return petagray;
  }
  var petagray;
  function get_TGy() {
    init_properties_Gray_kt_st6n6f();
    return TGy;
  }
  var TGy;
  function get_teragray() {
    init_properties_Gray_kt_st6n6f();
    return teragray;
  }
  var teragray;
  function get_GGy() {
    init_properties_Gray_kt_st6n6f();
    return GGy;
  }
  var GGy;
  function get_gigagray() {
    init_properties_Gray_kt_st6n6f();
    return gigagray;
  }
  var gigagray;
  function get_MGy() {
    init_properties_Gray_kt_st6n6f();
    return MGy;
  }
  var MGy;
  function get_megagray() {
    init_properties_Gray_kt_st6n6f();
    return megagray;
  }
  var megagray;
  function get_kGy() {
    init_properties_Gray_kt_st6n6f();
    return kGy;
  }
  var kGy;
  function get_kilogray() {
    init_properties_Gray_kt_st6n6f();
    return kilogray;
  }
  var kilogray;
  function get_hGy() {
    init_properties_Gray_kt_st6n6f();
    return hGy;
  }
  var hGy;
  function get_hectogray() {
    init_properties_Gray_kt_st6n6f();
    return hectogray;
  }
  var hectogray;
  function get_daGy() {
    init_properties_Gray_kt_st6n6f();
    return daGy;
  }
  var daGy;
  function get_decagray() {
    init_properties_Gray_kt_st6n6f();
    return decagray;
  }
  var decagray;
  function get_dGy() {
    init_properties_Gray_kt_st6n6f();
    return dGy;
  }
  var dGy;
  function get_decigray() {
    init_properties_Gray_kt_st6n6f();
    return decigray;
  }
  var decigray;
  function get_cGy() {
    init_properties_Gray_kt_st6n6f();
    return cGy;
  }
  var cGy;
  function get_centigray() {
    init_properties_Gray_kt_st6n6f();
    return centigray;
  }
  var centigray;
  function get_mGy() {
    init_properties_Gray_kt_st6n6f();
    return mGy;
  }
  var mGy;
  function get_milligray() {
    init_properties_Gray_kt_st6n6f();
    return milligray;
  }
  var milligray;
  function get_μGy() {
    init_properties_Gray_kt_st6n6f();
    return μGy;
  }
  var μGy;
  function get_microgray() {
    init_properties_Gray_kt_st6n6f();
    return microgray;
  }
  var microgray;
  function get_nGy() {
    init_properties_Gray_kt_st6n6f();
    return nGy;
  }
  var nGy;
  function get_nanogray() {
    init_properties_Gray_kt_st6n6f();
    return nanogray;
  }
  var nanogray;
  function get_pGy() {
    init_properties_Gray_kt_st6n6f();
    return pGy;
  }
  var pGy;
  function get_picogray() {
    init_properties_Gray_kt_st6n6f();
    return picogray;
  }
  var picogray;
  function get_fGy() {
    init_properties_Gray_kt_st6n6f();
    return fGy;
  }
  var fGy;
  function get_femtogray() {
    init_properties_Gray_kt_st6n6f();
    return femtogray;
  }
  var femtogray;
  function get_aGy() {
    init_properties_Gray_kt_st6n6f();
    return aGy;
  }
  var aGy;
  function get_attogray() {
    init_properties_Gray_kt_st6n6f();
    return attogray;
  }
  var attogray;
  function get_zGy() {
    init_properties_Gray_kt_st6n6f();
    return zGy;
  }
  var zGy;
  function get_zeptogray() {
    init_properties_Gray_kt_st6n6f();
    return zeptogray;
  }
  var zeptogray;
  function get_yGy() {
    init_properties_Gray_kt_st6n6f();
    return yGy;
  }
  var yGy;
  function get_yoctogray() {
    init_properties_Gray_kt_st6n6f();
    return yoctogray;
  }
  var yoctogray;
  function get_rGy() {
    init_properties_Gray_kt_st6n6f();
    return rGy;
  }
  var rGy;
  function get_rontogray() {
    init_properties_Gray_kt_st6n6f();
    return rontogray;
  }
  var rontogray;
  function get_qGy() {
    init_properties_Gray_kt_st6n6f();
    return qGy;
  }
  var qGy;
  function get_quectogray() {
    init_properties_Gray_kt_st6n6f();
    return quectogray;
  }
  var quectogray;
  function Gray(value) {
    DerivedUnit.call(this, value, get_formula_2());
  }
  var properties_initialized_Gray_kt_7mtpmj;
  function init_properties_Gray_kt_st6n6f() {
    if (properties_initialized_Gray_kt_7mtpmj) {
    } else {
      properties_initialized_Gray_kt_7mtpmj = true;
      formula_2 = times_0(get_m2(), powExpression(get_s(), -2));
      Gy = get_formula_2();
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 30.0);
      QGy = times_2(tmp$ret$0, times_0(get_m2(), powExpression(get_s(), -2)));
      quettagray = get_QGy();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 27.0);
      RGy = times_2(tmp$ret$0_0, times_0(get_m2(), powExpression(get_s(), -2)));
      ronnagray = get_RGy();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 24.0);
      YGy = times_2(tmp$ret$0_1, times_0(get_m2(), powExpression(get_s(), -2)));
      yottagray = get_YGy();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 21.0);
      ZGy = times_2(tmp$ret$0_2, times_0(get_m2(), powExpression(get_s(), -2)));
      zettagray = get_ZGy();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 18.0);
      EGy = times_2(tmp$ret$0_3, times_0(get_m2(), powExpression(get_s(), -2)));
      exagray = get_EGy();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 15.0);
      PGy = times_2(tmp$ret$0_4, times_0(get_m2(), powExpression(get_s(), -2)));
      petagray = get_PGy();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 12.0);
      TGy = times_2(tmp$ret$0_5, times_0(get_m2(), powExpression(get_s(), -2)));
      teragray = get_TGy();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 9.0);
      GGy = times_2(tmp$ret$0_6, times_0(get_m2(), powExpression(get_s(), -2)));
      gigagray = get_GGy();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 6.0);
      MGy = times_2(tmp$ret$0_7, times_0(get_m2(), powExpression(get_s(), -2)));
      megagray = get_MGy();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, 3.0);
      kGy = times_2(tmp$ret$0_8, times_0(get_m2(), powExpression(get_s(), -2)));
      kilogray = get_kGy();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, 2.0);
      hGy = times_2(tmp$ret$0_9, times_0(get_m2(), powExpression(get_s(), -2)));
      hectogray = get_hGy();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, 1.0);
      daGy = times_2(tmp$ret$0_10, times_0(get_m2(), powExpression(get_s(), -2)));
      decagray = get_daGy();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -1.0);
      dGy = times_2(tmp$ret$0_11, times_0(get_m2(), powExpression(get_s(), -2)));
      decigray = get_dGy();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -2.0);
      cGy = times_2(tmp$ret$0_12, times_0(get_m2(), powExpression(get_s(), -2)));
      centigray = get_cGy();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -3.0);
      mGy = times_2(tmp$ret$0_13, times_0(get_m2(), powExpression(get_s(), -2)));
      milligray = get_mGy();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -6.0);
      μGy = times_2(tmp$ret$0_14, times_0(get_m2(), powExpression(get_s(), -2)));
      microgray = get_μGy();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -9.0);
      nGy = times_2(tmp$ret$0_15, times_0(get_m2(), powExpression(get_s(), -2)));
      nanogray = get_nGy();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -12.0);
      pGy = times_2(tmp$ret$0_16, times_0(get_m2(), powExpression(get_s(), -2)));
      picogray = get_pGy();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -15.0);
      fGy = times_2(tmp$ret$0_17, times_0(get_m2(), powExpression(get_s(), -2)));
      femtogray = get_fGy();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -18.0);
      aGy = times_2(tmp$ret$0_18, times_0(get_m2(), powExpression(get_s(), -2)));
      attogray = get_aGy();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -21.0);
      zGy = times_2(tmp$ret$0_19, times_0(get_m2(), powExpression(get_s(), -2)));
      zeptogray = get_zGy();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -24.0);
      yGy = times_2(tmp$ret$0_20, times_0(get_m2(), powExpression(get_s(), -2)));
      yoctogray = get_yGy();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -27.0);
      rGy = times_2(tmp$ret$0_21, times_0(get_m2(), powExpression(get_s(), -2)));
      rontogray = get_rGy();
      var tmp$ret$0_22;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_22 = Math.pow(10.0, -30.0);
      qGy = times_2(tmp$ret$0_22, times_0(get_m2(), powExpression(get_s(), -2)));
      quectogray = get_qGy();
    }
  }
  function get_formula_3() {
    init_properties_Henry_kt_qx3ckc();
    return formula_3;
  }
  var formula_3;
  function get_H() {
    init_properties_Henry_kt_qx3ckc();
    return H;
  }
  var H;
  function get_QH() {
    init_properties_Henry_kt_qx3ckc();
    return QH;
  }
  var QH;
  function get_quettahenry() {
    init_properties_Henry_kt_qx3ckc();
    return quettahenry;
  }
  var quettahenry;
  function get_RH() {
    init_properties_Henry_kt_qx3ckc();
    return RH;
  }
  var RH;
  function get_ronnahenry() {
    init_properties_Henry_kt_qx3ckc();
    return ronnahenry;
  }
  var ronnahenry;
  function get_YH() {
    init_properties_Henry_kt_qx3ckc();
    return YH;
  }
  var YH;
  function get_yottahenry() {
    init_properties_Henry_kt_qx3ckc();
    return yottahenry;
  }
  var yottahenry;
  function get_ZH() {
    init_properties_Henry_kt_qx3ckc();
    return ZH;
  }
  var ZH;
  function get_zettahenry() {
    init_properties_Henry_kt_qx3ckc();
    return zettahenry;
  }
  var zettahenry;
  function get_EH() {
    init_properties_Henry_kt_qx3ckc();
    return EH;
  }
  var EH;
  function get_exahenry() {
    init_properties_Henry_kt_qx3ckc();
    return exahenry;
  }
  var exahenry;
  function get_PH() {
    init_properties_Henry_kt_qx3ckc();
    return PH;
  }
  var PH;
  function get_petahenry() {
    init_properties_Henry_kt_qx3ckc();
    return petahenry;
  }
  var petahenry;
  function get_TH() {
    init_properties_Henry_kt_qx3ckc();
    return TH;
  }
  var TH;
  function get_terahenry() {
    init_properties_Henry_kt_qx3ckc();
    return terahenry;
  }
  var terahenry;
  function get_GH() {
    init_properties_Henry_kt_qx3ckc();
    return GH;
  }
  var GH;
  function get_gigahenry() {
    init_properties_Henry_kt_qx3ckc();
    return gigahenry;
  }
  var gigahenry;
  function get_MH() {
    init_properties_Henry_kt_qx3ckc();
    return MH;
  }
  var MH;
  function get_megahenry() {
    init_properties_Henry_kt_qx3ckc();
    return megahenry;
  }
  var megahenry;
  function get_kH() {
    init_properties_Henry_kt_qx3ckc();
    return kH;
  }
  var kH;
  function get_kilohenry() {
    init_properties_Henry_kt_qx3ckc();
    return kilohenry;
  }
  var kilohenry;
  function get_hH() {
    init_properties_Henry_kt_qx3ckc();
    return hH;
  }
  var hH;
  function get_hectohenry() {
    init_properties_Henry_kt_qx3ckc();
    return hectohenry;
  }
  var hectohenry;
  function get_daH() {
    init_properties_Henry_kt_qx3ckc();
    return daH;
  }
  var daH;
  function get_decahenry() {
    init_properties_Henry_kt_qx3ckc();
    return decahenry;
  }
  var decahenry;
  function get_dH() {
    init_properties_Henry_kt_qx3ckc();
    return dH;
  }
  var dH;
  function get_decihenry() {
    init_properties_Henry_kt_qx3ckc();
    return decihenry;
  }
  var decihenry;
  function get_cH() {
    init_properties_Henry_kt_qx3ckc();
    return cH;
  }
  var cH;
  function get_centihenry() {
    init_properties_Henry_kt_qx3ckc();
    return centihenry;
  }
  var centihenry;
  function get_mH() {
    init_properties_Henry_kt_qx3ckc();
    return mH;
  }
  var mH;
  function get_millihenry() {
    init_properties_Henry_kt_qx3ckc();
    return millihenry;
  }
  var millihenry;
  function get_μH() {
    init_properties_Henry_kt_qx3ckc();
    return μH;
  }
  var μH;
  function get_microhenry() {
    init_properties_Henry_kt_qx3ckc();
    return microhenry;
  }
  var microhenry;
  function get_nH() {
    init_properties_Henry_kt_qx3ckc();
    return nH;
  }
  var nH;
  function get_nanohenry() {
    init_properties_Henry_kt_qx3ckc();
    return nanohenry;
  }
  var nanohenry;
  function get_pH() {
    init_properties_Henry_kt_qx3ckc();
    return pH;
  }
  var pH;
  function get_picohenry() {
    init_properties_Henry_kt_qx3ckc();
    return picohenry;
  }
  var picohenry;
  function get_fH() {
    init_properties_Henry_kt_qx3ckc();
    return fH;
  }
  var fH;
  function get_femtohenry() {
    init_properties_Henry_kt_qx3ckc();
    return femtohenry;
  }
  var femtohenry;
  function get_aH() {
    init_properties_Henry_kt_qx3ckc();
    return aH;
  }
  var aH;
  function get_attohenry() {
    init_properties_Henry_kt_qx3ckc();
    return attohenry;
  }
  var attohenry;
  function get_zH() {
    init_properties_Henry_kt_qx3ckc();
    return zH;
  }
  var zH;
  function get_zeptohenry() {
    init_properties_Henry_kt_qx3ckc();
    return zeptohenry;
  }
  var zeptohenry;
  function get_yH() {
    init_properties_Henry_kt_qx3ckc();
    return yH;
  }
  var yH;
  function get_yoctohenry() {
    init_properties_Henry_kt_qx3ckc();
    return yoctohenry;
  }
  var yoctohenry;
  function get_rH() {
    init_properties_Henry_kt_qx3ckc();
    return rH;
  }
  var rH;
  function get_rontohenry() {
    init_properties_Henry_kt_qx3ckc();
    return rontohenry;
  }
  var rontohenry;
  function get_qH() {
    init_properties_Henry_kt_qx3ckc();
    return qH;
  }
  var qH;
  function get_quectohenry() {
    init_properties_Henry_kt_qx3ckc();
    return quectohenry;
  }
  var quectohenry;
  function Henry(value) {
    DerivedUnit.call(this, value, get_formula_3());
  }
  var properties_initialized_Henry_kt_9pyy7s;
  function init_properties_Henry_kt_qx3ckc() {
    if (properties_initialized_Henry_kt_9pyy7s) {
    } else {
      properties_initialized_Henry_kt_9pyy7s = true;
      formula_3 = times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -2));
      H = get_formula_3();
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 30.0);
      QH = times_2(tmp$ret$0, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -2)));
      quettahenry = get_QH();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 27.0);
      RH = times_2(tmp$ret$0_0, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -2)));
      ronnahenry = get_RH();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 24.0);
      YH = times_2(tmp$ret$0_1, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -2)));
      yottahenry = get_YH();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 21.0);
      ZH = times_2(tmp$ret$0_2, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -2)));
      zettahenry = get_ZH();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 18.0);
      EH = times_2(tmp$ret$0_3, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -2)));
      exahenry = get_EH();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 15.0);
      PH = times_2(tmp$ret$0_4, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -2)));
      petahenry = get_PH();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 12.0);
      TH = times_2(tmp$ret$0_5, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -2)));
      terahenry = get_TH();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 9.0);
      GH = times_2(tmp$ret$0_6, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -2)));
      gigahenry = get_GH();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 6.0);
      MH = times_2(tmp$ret$0_7, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -2)));
      megahenry = get_MH();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, 3.0);
      kH = times_2(tmp$ret$0_8, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -2)));
      kilohenry = get_kH();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, 2.0);
      hH = times_2(tmp$ret$0_9, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -2)));
      hectohenry = get_hH();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, 1.0);
      daH = times_2(tmp$ret$0_10, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -2)));
      decahenry = get_daH();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -1.0);
      dH = times_2(tmp$ret$0_11, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -2)));
      decihenry = get_dH();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -2.0);
      cH = times_2(tmp$ret$0_12, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -2)));
      centihenry = get_cH();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -3.0);
      mH = times_2(tmp$ret$0_13, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -2)));
      millihenry = get_mH();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -6.0);
      μH = times_2(tmp$ret$0_14, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -2)));
      microhenry = get_μH();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -9.0);
      nH = times_2(tmp$ret$0_15, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -2)));
      nanohenry = get_nH();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -12.0);
      pH = times_2(tmp$ret$0_16, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -2)));
      picohenry = get_pH();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -15.0);
      fH = times_2(tmp$ret$0_17, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -2)));
      femtohenry = get_fH();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -18.0);
      aH = times_2(tmp$ret$0_18, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -2)));
      attohenry = get_aH();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -21.0);
      zH = times_2(tmp$ret$0_19, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -2)));
      zeptohenry = get_zH();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -24.0);
      yH = times_2(tmp$ret$0_20, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -2)));
      yoctohenry = get_yH();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -27.0);
      rH = times_2(tmp$ret$0_21, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -2)));
      rontohenry = get_rH();
      var tmp$ret$0_22;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_22 = Math.pow(10.0, -30.0);
      qH = times_2(tmp$ret$0_22, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -2)));
      quectohenry = get_qH();
    }
  }
  function get_formula_4() {
    init_properties_Hertz_kt_sue2bd();
    return formula_4;
  }
  var formula_4;
  function get_Hz() {
    init_properties_Hertz_kt_sue2bd();
    return Hz;
  }
  var Hz;
  function get_QHz() {
    init_properties_Hertz_kt_sue2bd();
    return QHz;
  }
  var QHz;
  function get_quettahertz() {
    init_properties_Hertz_kt_sue2bd();
    return quettahertz;
  }
  var quettahertz;
  function get_RHz() {
    init_properties_Hertz_kt_sue2bd();
    return RHz;
  }
  var RHz;
  function get_ronnahertz() {
    init_properties_Hertz_kt_sue2bd();
    return ronnahertz;
  }
  var ronnahertz;
  function get_YHz() {
    init_properties_Hertz_kt_sue2bd();
    return YHz;
  }
  var YHz;
  function get_yottahertz() {
    init_properties_Hertz_kt_sue2bd();
    return yottahertz;
  }
  var yottahertz;
  function get_ZHz() {
    init_properties_Hertz_kt_sue2bd();
    return ZHz;
  }
  var ZHz;
  function get_zettahertz() {
    init_properties_Hertz_kt_sue2bd();
    return zettahertz;
  }
  var zettahertz;
  function get_EHz() {
    init_properties_Hertz_kt_sue2bd();
    return EHz;
  }
  var EHz;
  function get_exahertz() {
    init_properties_Hertz_kt_sue2bd();
    return exahertz;
  }
  var exahertz;
  function get_PHz() {
    init_properties_Hertz_kt_sue2bd();
    return PHz;
  }
  var PHz;
  function get_petahertz() {
    init_properties_Hertz_kt_sue2bd();
    return petahertz;
  }
  var petahertz;
  function get_THz() {
    init_properties_Hertz_kt_sue2bd();
    return THz;
  }
  var THz;
  function get_terahertz() {
    init_properties_Hertz_kt_sue2bd();
    return terahertz;
  }
  var terahertz;
  function get_GHz() {
    init_properties_Hertz_kt_sue2bd();
    return GHz;
  }
  var GHz;
  function get_gigahertz() {
    init_properties_Hertz_kt_sue2bd();
    return gigahertz;
  }
  var gigahertz;
  function get_MHz() {
    init_properties_Hertz_kt_sue2bd();
    return MHz;
  }
  var MHz;
  function get_megahertz() {
    init_properties_Hertz_kt_sue2bd();
    return megahertz;
  }
  var megahertz;
  function get_kHz() {
    init_properties_Hertz_kt_sue2bd();
    return kHz;
  }
  var kHz;
  function get_kilohertz() {
    init_properties_Hertz_kt_sue2bd();
    return kilohertz;
  }
  var kilohertz;
  function get_hHz() {
    init_properties_Hertz_kt_sue2bd();
    return hHz;
  }
  var hHz;
  function get_hectohertz() {
    init_properties_Hertz_kt_sue2bd();
    return hectohertz;
  }
  var hectohertz;
  function get_daHz() {
    init_properties_Hertz_kt_sue2bd();
    return daHz;
  }
  var daHz;
  function get_decahertz() {
    init_properties_Hertz_kt_sue2bd();
    return decahertz;
  }
  var decahertz;
  function get_dHz() {
    init_properties_Hertz_kt_sue2bd();
    return dHz;
  }
  var dHz;
  function get_decihertz() {
    init_properties_Hertz_kt_sue2bd();
    return decihertz;
  }
  var decihertz;
  function get_cHz() {
    init_properties_Hertz_kt_sue2bd();
    return cHz;
  }
  var cHz;
  function get_centihertz() {
    init_properties_Hertz_kt_sue2bd();
    return centihertz;
  }
  var centihertz;
  function get_mHz() {
    init_properties_Hertz_kt_sue2bd();
    return mHz;
  }
  var mHz;
  function get_millihertz() {
    init_properties_Hertz_kt_sue2bd();
    return millihertz;
  }
  var millihertz;
  function get_μHz() {
    init_properties_Hertz_kt_sue2bd();
    return μHz;
  }
  var μHz;
  function get_microhertz() {
    init_properties_Hertz_kt_sue2bd();
    return microhertz;
  }
  var microhertz;
  function get_nHz() {
    init_properties_Hertz_kt_sue2bd();
    return nHz;
  }
  var nHz;
  function get_nanohertz() {
    init_properties_Hertz_kt_sue2bd();
    return nanohertz;
  }
  var nanohertz;
  function get_pHz() {
    init_properties_Hertz_kt_sue2bd();
    return pHz;
  }
  var pHz;
  function get_picohertz() {
    init_properties_Hertz_kt_sue2bd();
    return picohertz;
  }
  var picohertz;
  function get_fHz() {
    init_properties_Hertz_kt_sue2bd();
    return fHz;
  }
  var fHz;
  function get_femtohertz() {
    init_properties_Hertz_kt_sue2bd();
    return femtohertz;
  }
  var femtohertz;
  function get_aHz() {
    init_properties_Hertz_kt_sue2bd();
    return aHz;
  }
  var aHz;
  function get_attohertz() {
    init_properties_Hertz_kt_sue2bd();
    return attohertz;
  }
  var attohertz;
  function get_zHz() {
    init_properties_Hertz_kt_sue2bd();
    return zHz;
  }
  var zHz;
  function get_zeptohertz() {
    init_properties_Hertz_kt_sue2bd();
    return zeptohertz;
  }
  var zeptohertz;
  function get_yHz() {
    init_properties_Hertz_kt_sue2bd();
    return yHz;
  }
  var yHz;
  function get_yoctohertz() {
    init_properties_Hertz_kt_sue2bd();
    return yoctohertz;
  }
  var yoctohertz;
  function get_rHz() {
    init_properties_Hertz_kt_sue2bd();
    return rHz;
  }
  var rHz;
  function get_rontohertz() {
    init_properties_Hertz_kt_sue2bd();
    return rontohertz;
  }
  var rontohertz;
  function get_qHz() {
    init_properties_Hertz_kt_sue2bd();
    return qHz;
  }
  var qHz;
  function get_quectohertz() {
    init_properties_Hertz_kt_sue2bd();
    return quectohertz;
  }
  var quectohertz;
  function Hertz(value) {
    DerivedUnit.call(this, value, get_formula_4());
  }
  var properties_initialized_Hertz_kt_bn9nyt;
  function init_properties_Hertz_kt_sue2bd() {
    if (properties_initialized_Hertz_kt_bn9nyt) {
    } else {
      properties_initialized_Hertz_kt_bn9nyt = true;
      formula_4 = div_0(1, get_s());
      Hz = get_formula_4();
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 30.0);
      QHz = times_2(tmp$ret$0, div_0(1, get_s()));
      quettahertz = get_QHz();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 27.0);
      RHz = times_2(tmp$ret$0_0, div_0(1, get_s()));
      ronnahertz = get_RHz();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 24.0);
      YHz = times_2(tmp$ret$0_1, div_0(1, get_s()));
      yottahertz = get_YHz();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 21.0);
      ZHz = times_2(tmp$ret$0_2, div_0(1, get_s()));
      zettahertz = get_ZHz();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 18.0);
      EHz = times_2(tmp$ret$0_3, div_0(1, get_s()));
      exahertz = get_EHz();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 15.0);
      PHz = times_2(tmp$ret$0_4, div_0(1, get_s()));
      petahertz = get_PHz();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 12.0);
      THz = times_2(tmp$ret$0_5, div_0(1, get_s()));
      terahertz = get_THz();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 9.0);
      GHz = times_2(tmp$ret$0_6, div_0(1, get_s()));
      gigahertz = get_GHz();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 6.0);
      MHz = times_2(tmp$ret$0_7, div_0(1, get_s()));
      megahertz = get_MHz();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, 3.0);
      kHz = times_2(tmp$ret$0_8, div_0(1, get_s()));
      kilohertz = get_kHz();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, 2.0);
      hHz = times_2(tmp$ret$0_9, div_0(1, get_s()));
      hectohertz = get_hHz();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, 1.0);
      daHz = times_2(tmp$ret$0_10, div_0(1, get_s()));
      decahertz = get_daHz();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -1.0);
      dHz = times_2(tmp$ret$0_11, div_0(1, get_s()));
      decihertz = get_dHz();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -2.0);
      cHz = times_2(tmp$ret$0_12, div_0(1, get_s()));
      centihertz = get_cHz();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -3.0);
      mHz = times_2(tmp$ret$0_13, div_0(1, get_s()));
      millihertz = get_mHz();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -6.0);
      μHz = times_2(tmp$ret$0_14, div_0(1, get_s()));
      microhertz = get_μHz();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -9.0);
      nHz = times_2(tmp$ret$0_15, div_0(1, get_s()));
      nanohertz = get_nHz();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -12.0);
      pHz = times_2(tmp$ret$0_16, div_0(1, get_s()));
      picohertz = get_pHz();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -15.0);
      fHz = times_2(tmp$ret$0_17, div_0(1, get_s()));
      femtohertz = get_fHz();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -18.0);
      aHz = times_2(tmp$ret$0_18, div_0(1, get_s()));
      attohertz = get_aHz();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -21.0);
      zHz = times_2(tmp$ret$0_19, div_0(1, get_s()));
      zeptohertz = get_zHz();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -24.0);
      yHz = times_2(tmp$ret$0_20, div_0(1, get_s()));
      yoctohertz = get_yHz();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -27.0);
      rHz = times_2(tmp$ret$0_21, div_0(1, get_s()));
      rontohertz = get_rHz();
      var tmp$ret$0_22;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_22 = Math.pow(10.0, -30.0);
      qHz = times_2(tmp$ret$0_22, div_0(1, get_s()));
      quectohertz = get_qHz();
    }
  }
  function get_formula_5() {
    init_properties_Joule_kt_lgmsgb();
    return formula_5;
  }
  var formula_5;
  function get_J() {
    init_properties_Joule_kt_lgmsgb();
    return J;
  }
  var J;
  function get_QJ() {
    init_properties_Joule_kt_lgmsgb();
    return QJ;
  }
  var QJ;
  function get_quettajoule() {
    init_properties_Joule_kt_lgmsgb();
    return quettajoule;
  }
  var quettajoule;
  function get_RJ() {
    init_properties_Joule_kt_lgmsgb();
    return RJ;
  }
  var RJ;
  function get_ronnajoule() {
    init_properties_Joule_kt_lgmsgb();
    return ronnajoule;
  }
  var ronnajoule;
  function get_YJ() {
    init_properties_Joule_kt_lgmsgb();
    return YJ;
  }
  var YJ;
  function get_yottajoule() {
    init_properties_Joule_kt_lgmsgb();
    return yottajoule;
  }
  var yottajoule;
  function get_ZJ() {
    init_properties_Joule_kt_lgmsgb();
    return ZJ;
  }
  var ZJ;
  function get_zettajoule() {
    init_properties_Joule_kt_lgmsgb();
    return zettajoule;
  }
  var zettajoule;
  function get_EJ() {
    init_properties_Joule_kt_lgmsgb();
    return EJ;
  }
  var EJ;
  function get_exajoule() {
    init_properties_Joule_kt_lgmsgb();
    return exajoule;
  }
  var exajoule;
  function get_PJ() {
    init_properties_Joule_kt_lgmsgb();
    return PJ;
  }
  var PJ;
  function get_petajoule() {
    init_properties_Joule_kt_lgmsgb();
    return petajoule;
  }
  var petajoule;
  function get_TJ() {
    init_properties_Joule_kt_lgmsgb();
    return TJ;
  }
  var TJ;
  function get_terajoule() {
    init_properties_Joule_kt_lgmsgb();
    return terajoule;
  }
  var terajoule;
  function get_GJ() {
    init_properties_Joule_kt_lgmsgb();
    return GJ;
  }
  var GJ;
  function get_gigajoule() {
    init_properties_Joule_kt_lgmsgb();
    return gigajoule;
  }
  var gigajoule;
  function get_MJ() {
    init_properties_Joule_kt_lgmsgb();
    return MJ;
  }
  var MJ;
  function get_megajoule() {
    init_properties_Joule_kt_lgmsgb();
    return megajoule;
  }
  var megajoule;
  function get_kJ() {
    init_properties_Joule_kt_lgmsgb();
    return kJ;
  }
  var kJ;
  function get_kilojoule() {
    init_properties_Joule_kt_lgmsgb();
    return kilojoule;
  }
  var kilojoule;
  function get_hJ() {
    init_properties_Joule_kt_lgmsgb();
    return hJ;
  }
  var hJ;
  function get_hectojoule() {
    init_properties_Joule_kt_lgmsgb();
    return hectojoule;
  }
  var hectojoule;
  function get_daJ() {
    init_properties_Joule_kt_lgmsgb();
    return daJ;
  }
  var daJ;
  function get_decajoule() {
    init_properties_Joule_kt_lgmsgb();
    return decajoule;
  }
  var decajoule;
  function get_dJ() {
    init_properties_Joule_kt_lgmsgb();
    return dJ;
  }
  var dJ;
  function get_decijoule() {
    init_properties_Joule_kt_lgmsgb();
    return decijoule;
  }
  var decijoule;
  function get_cJ() {
    init_properties_Joule_kt_lgmsgb();
    return cJ;
  }
  var cJ;
  function get_centijoule() {
    init_properties_Joule_kt_lgmsgb();
    return centijoule;
  }
  var centijoule;
  function get_mJ() {
    init_properties_Joule_kt_lgmsgb();
    return mJ;
  }
  var mJ;
  function get_millijoule() {
    init_properties_Joule_kt_lgmsgb();
    return millijoule;
  }
  var millijoule;
  function get_μJ() {
    init_properties_Joule_kt_lgmsgb();
    return μJ;
  }
  var μJ;
  function get_microjoule() {
    init_properties_Joule_kt_lgmsgb();
    return microjoule;
  }
  var microjoule;
  function get_nJ() {
    init_properties_Joule_kt_lgmsgb();
    return nJ;
  }
  var nJ;
  function get_nanojoule() {
    init_properties_Joule_kt_lgmsgb();
    return nanojoule;
  }
  var nanojoule;
  function get_pJ() {
    init_properties_Joule_kt_lgmsgb();
    return pJ;
  }
  var pJ;
  function get_picojoule() {
    init_properties_Joule_kt_lgmsgb();
    return picojoule;
  }
  var picojoule;
  function get_fJ() {
    init_properties_Joule_kt_lgmsgb();
    return fJ;
  }
  var fJ;
  function get_femtojoule() {
    init_properties_Joule_kt_lgmsgb();
    return femtojoule;
  }
  var femtojoule;
  function get_aJ() {
    init_properties_Joule_kt_lgmsgb();
    return aJ;
  }
  var aJ;
  function get_attojoule() {
    init_properties_Joule_kt_lgmsgb();
    return attojoule;
  }
  var attojoule;
  function get_zJ() {
    init_properties_Joule_kt_lgmsgb();
    return zJ;
  }
  var zJ;
  function get_zeptojoule() {
    init_properties_Joule_kt_lgmsgb();
    return zeptojoule;
  }
  var zeptojoule;
  function get_yJ() {
    init_properties_Joule_kt_lgmsgb();
    return yJ;
  }
  var yJ;
  function get_yoctojoule() {
    init_properties_Joule_kt_lgmsgb();
    return yoctojoule;
  }
  var yoctojoule;
  function get_rJ() {
    init_properties_Joule_kt_lgmsgb();
    return rJ;
  }
  var rJ;
  function get_rontojoule() {
    init_properties_Joule_kt_lgmsgb();
    return rontojoule;
  }
  var rontojoule;
  function get_qJ() {
    init_properties_Joule_kt_lgmsgb();
    return qJ;
  }
  var qJ;
  function get_quectojoule() {
    init_properties_Joule_kt_lgmsgb();
    return quectojoule;
  }
  var quectojoule;
  function Joule(value) {
    DerivedUnit.call(this, value, get_formula_5());
  }
  function get_J_0(_this__u8e3s4) {
    init_properties_Joule_kt_lgmsgb();
    return times_2(numberToDouble(_this__u8e3s4), get_formula_5());
  }
  var properties_initialized_Joule_kt_49ie3r;
  function init_properties_Joule_kt_lgmsgb() {
    if (properties_initialized_Joule_kt_49ie3r) {
    } else {
      properties_initialized_Joule_kt_49ie3r = true;
      formula_5 = div(times_0(get_kg(), get_m2()), powExpression(get_s(), 2));
      J = get_formula_5();
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 30.0);
      QJ = times_2(tmp$ret$0, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 2)));
      quettajoule = get_QJ();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 27.0);
      RJ = times_2(tmp$ret$0_0, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 2)));
      ronnajoule = get_RJ();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 24.0);
      YJ = times_2(tmp$ret$0_1, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 2)));
      yottajoule = get_YJ();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 21.0);
      ZJ = times_2(tmp$ret$0_2, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 2)));
      zettajoule = get_ZJ();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 18.0);
      EJ = times_2(tmp$ret$0_3, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 2)));
      exajoule = get_EJ();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 15.0);
      PJ = times_2(tmp$ret$0_4, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 2)));
      petajoule = get_PJ();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 12.0);
      TJ = times_2(tmp$ret$0_5, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 2)));
      terajoule = get_TJ();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 9.0);
      GJ = times_2(tmp$ret$0_6, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 2)));
      gigajoule = get_GJ();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 6.0);
      MJ = times_2(tmp$ret$0_7, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 2)));
      megajoule = get_MJ();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, 3.0);
      kJ = times_2(tmp$ret$0_8, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 2)));
      kilojoule = get_kJ();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, 2.0);
      hJ = times_2(tmp$ret$0_9, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 2)));
      hectojoule = get_hJ();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, 1.0);
      daJ = times_2(tmp$ret$0_10, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 2)));
      decajoule = get_daJ();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -1.0);
      dJ = times_2(tmp$ret$0_11, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 2)));
      decijoule = get_dJ();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -2.0);
      cJ = times_2(tmp$ret$0_12, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 2)));
      centijoule = get_cJ();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -3.0);
      mJ = times_2(tmp$ret$0_13, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 2)));
      millijoule = get_mJ();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -6.0);
      μJ = times_2(tmp$ret$0_14, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 2)));
      microjoule = get_μJ();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -9.0);
      nJ = times_2(tmp$ret$0_15, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 2)));
      nanojoule = get_nJ();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -12.0);
      pJ = times_2(tmp$ret$0_16, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 2)));
      picojoule = get_pJ();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -15.0);
      fJ = times_2(tmp$ret$0_17, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 2)));
      femtojoule = get_fJ();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -18.0);
      aJ = times_2(tmp$ret$0_18, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 2)));
      attojoule = get_aJ();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -21.0);
      zJ = times_2(tmp$ret$0_19, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 2)));
      zeptojoule = get_zJ();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -24.0);
      yJ = times_2(tmp$ret$0_20, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 2)));
      yoctojoule = get_yJ();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -27.0);
      rJ = times_2(tmp$ret$0_21, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 2)));
      rontojoule = get_rJ();
      var tmp$ret$0_22;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_22 = Math.pow(10.0, -30.0);
      qJ = times_2(tmp$ret$0_22, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 2)));
      quectojoule = get_qJ();
    }
  }
  function get_formula_6() {
    init_properties_Katal_kt_ds1ho5();
    return formula_6;
  }
  var formula_6;
  function get_kat() {
    init_properties_Katal_kt_ds1ho5();
    return kat;
  }
  var kat;
  function get_Qkat() {
    init_properties_Katal_kt_ds1ho5();
    return Qkat;
  }
  var Qkat;
  function get_quettakatal() {
    init_properties_Katal_kt_ds1ho5();
    return quettakatal;
  }
  var quettakatal;
  function get_Rkat() {
    init_properties_Katal_kt_ds1ho5();
    return Rkat;
  }
  var Rkat;
  function get_ronnakatal() {
    init_properties_Katal_kt_ds1ho5();
    return ronnakatal;
  }
  var ronnakatal;
  function get_Ykat() {
    init_properties_Katal_kt_ds1ho5();
    return Ykat;
  }
  var Ykat;
  function get_yottakatal() {
    init_properties_Katal_kt_ds1ho5();
    return yottakatal;
  }
  var yottakatal;
  function get_Zkat() {
    init_properties_Katal_kt_ds1ho5();
    return Zkat;
  }
  var Zkat;
  function get_zettakatal() {
    init_properties_Katal_kt_ds1ho5();
    return zettakatal;
  }
  var zettakatal;
  function get_Ekat() {
    init_properties_Katal_kt_ds1ho5();
    return Ekat;
  }
  var Ekat;
  function get_exakatal() {
    init_properties_Katal_kt_ds1ho5();
    return exakatal;
  }
  var exakatal;
  function get_Pkat() {
    init_properties_Katal_kt_ds1ho5();
    return Pkat;
  }
  var Pkat;
  function get_petakatal() {
    init_properties_Katal_kt_ds1ho5();
    return petakatal;
  }
  var petakatal;
  function get_Tkat() {
    init_properties_Katal_kt_ds1ho5();
    return Tkat;
  }
  var Tkat;
  function get_terakatal() {
    init_properties_Katal_kt_ds1ho5();
    return terakatal;
  }
  var terakatal;
  function get_Gkat() {
    init_properties_Katal_kt_ds1ho5();
    return Gkat;
  }
  var Gkat;
  function get_gigakatal() {
    init_properties_Katal_kt_ds1ho5();
    return gigakatal;
  }
  var gigakatal;
  function get_Mkat() {
    init_properties_Katal_kt_ds1ho5();
    return Mkat;
  }
  var Mkat;
  function get_megakatal() {
    init_properties_Katal_kt_ds1ho5();
    return megakatal;
  }
  var megakatal;
  function get_kkat() {
    init_properties_Katal_kt_ds1ho5();
    return kkat;
  }
  var kkat;
  function get_kilokatal() {
    init_properties_Katal_kt_ds1ho5();
    return kilokatal;
  }
  var kilokatal;
  function get_hkat() {
    init_properties_Katal_kt_ds1ho5();
    return hkat;
  }
  var hkat;
  function get_hectokatal() {
    init_properties_Katal_kt_ds1ho5();
    return hectokatal;
  }
  var hectokatal;
  function get_dakat() {
    init_properties_Katal_kt_ds1ho5();
    return dakat;
  }
  var dakat;
  function get_decakatal() {
    init_properties_Katal_kt_ds1ho5();
    return decakatal;
  }
  var decakatal;
  function get_dkat() {
    init_properties_Katal_kt_ds1ho5();
    return dkat;
  }
  var dkat;
  function get_decikatal() {
    init_properties_Katal_kt_ds1ho5();
    return decikatal;
  }
  var decikatal;
  function get_ckat() {
    init_properties_Katal_kt_ds1ho5();
    return ckat;
  }
  var ckat;
  function get_centikatal() {
    init_properties_Katal_kt_ds1ho5();
    return centikatal;
  }
  var centikatal;
  function get_mkat() {
    init_properties_Katal_kt_ds1ho5();
    return mkat;
  }
  var mkat;
  function get_millikatal() {
    init_properties_Katal_kt_ds1ho5();
    return millikatal;
  }
  var millikatal;
  function get_μkat() {
    init_properties_Katal_kt_ds1ho5();
    return μkat;
  }
  var μkat;
  function get_microkatal() {
    init_properties_Katal_kt_ds1ho5();
    return microkatal;
  }
  var microkatal;
  function get_nkat() {
    init_properties_Katal_kt_ds1ho5();
    return nkat;
  }
  var nkat;
  function get_nanokatal() {
    init_properties_Katal_kt_ds1ho5();
    return nanokatal;
  }
  var nanokatal;
  function get_pkat() {
    init_properties_Katal_kt_ds1ho5();
    return pkat;
  }
  var pkat;
  function get_picokatal() {
    init_properties_Katal_kt_ds1ho5();
    return picokatal;
  }
  var picokatal;
  function get_fkat() {
    init_properties_Katal_kt_ds1ho5();
    return fkat;
  }
  var fkat;
  function get_femtokatal() {
    init_properties_Katal_kt_ds1ho5();
    return femtokatal;
  }
  var femtokatal;
  function get_akat() {
    init_properties_Katal_kt_ds1ho5();
    return akat;
  }
  var akat;
  function get_attokatal() {
    init_properties_Katal_kt_ds1ho5();
    return attokatal;
  }
  var attokatal;
  function get_zkat() {
    init_properties_Katal_kt_ds1ho5();
    return zkat;
  }
  var zkat;
  function get_zeptokatal() {
    init_properties_Katal_kt_ds1ho5();
    return zeptokatal;
  }
  var zeptokatal;
  function get_ykat() {
    init_properties_Katal_kt_ds1ho5();
    return ykat;
  }
  var ykat;
  function get_yoctokatal() {
    init_properties_Katal_kt_ds1ho5();
    return yoctokatal;
  }
  var yoctokatal;
  function get_rkat() {
    init_properties_Katal_kt_ds1ho5();
    return rkat;
  }
  var rkat;
  function get_rontokatal() {
    init_properties_Katal_kt_ds1ho5();
    return rontokatal;
  }
  var rontokatal;
  function get_qkat() {
    init_properties_Katal_kt_ds1ho5();
    return qkat;
  }
  var qkat;
  function get_quectokatal() {
    init_properties_Katal_kt_ds1ho5();
    return quectokatal;
  }
  var quectokatal;
  function Katal(value) {
    DerivedUnit.call(this, value, get_formula_6());
  }
  var properties_initialized_Katal_kt_uz5w0p;
  function init_properties_Katal_kt_ds1ho5() {
    if (properties_initialized_Katal_kt_uz5w0p) {
    } else {
      properties_initialized_Katal_kt_uz5w0p = true;
      formula_6 = times_0(get_mol(), powExpression(get_s(), -1));
      kat = get_formula_6();
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 30.0);
      Qkat = times_2(tmp$ret$0, times_0(get_mol(), powExpression(get_s(), -1)));
      quettakatal = get_Qkat();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 27.0);
      Rkat = times_2(tmp$ret$0_0, times_0(get_mol(), powExpression(get_s(), -1)));
      ronnakatal = get_Rkat();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 24.0);
      Ykat = times_2(tmp$ret$0_1, times_0(get_mol(), powExpression(get_s(), -1)));
      yottakatal = get_Ykat();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 21.0);
      Zkat = times_2(tmp$ret$0_2, times_0(get_mol(), powExpression(get_s(), -1)));
      zettakatal = get_Zkat();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 18.0);
      Ekat = times_2(tmp$ret$0_3, times_0(get_mol(), powExpression(get_s(), -1)));
      exakatal = get_Ekat();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 15.0);
      Pkat = times_2(tmp$ret$0_4, times_0(get_mol(), powExpression(get_s(), -1)));
      petakatal = get_Pkat();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 12.0);
      Tkat = times_2(tmp$ret$0_5, times_0(get_mol(), powExpression(get_s(), -1)));
      terakatal = get_Tkat();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 9.0);
      Gkat = times_2(tmp$ret$0_6, times_0(get_mol(), powExpression(get_s(), -1)));
      gigakatal = get_Gkat();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 6.0);
      Mkat = times_2(tmp$ret$0_7, times_0(get_mol(), powExpression(get_s(), -1)));
      megakatal = get_Mkat();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, 3.0);
      kkat = times_2(tmp$ret$0_8, times_0(get_mol(), powExpression(get_s(), -1)));
      kilokatal = get_kkat();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, 2.0);
      hkat = times_2(tmp$ret$0_9, times_0(get_mol(), powExpression(get_s(), -1)));
      hectokatal = get_hkat();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, 1.0);
      dakat = times_2(tmp$ret$0_10, times_0(get_mol(), powExpression(get_s(), -1)));
      decakatal = get_dakat();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -1.0);
      dkat = times_2(tmp$ret$0_11, times_0(get_mol(), powExpression(get_s(), -1)));
      decikatal = get_dkat();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -2.0);
      ckat = times_2(tmp$ret$0_12, times_0(get_mol(), powExpression(get_s(), -1)));
      centikatal = get_ckat();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -3.0);
      mkat = times_2(tmp$ret$0_13, times_0(get_mol(), powExpression(get_s(), -1)));
      millikatal = get_mkat();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -6.0);
      μkat = times_2(tmp$ret$0_14, times_0(get_mol(), powExpression(get_s(), -1)));
      microkatal = get_μkat();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -9.0);
      nkat = times_2(tmp$ret$0_15, times_0(get_mol(), powExpression(get_s(), -1)));
      nanokatal = get_nkat();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -12.0);
      pkat = times_2(tmp$ret$0_16, times_0(get_mol(), powExpression(get_s(), -1)));
      picokatal = get_pkat();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -15.0);
      fkat = times_2(tmp$ret$0_17, times_0(get_mol(), powExpression(get_s(), -1)));
      femtokatal = get_fkat();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -18.0);
      akat = times_2(tmp$ret$0_18, times_0(get_mol(), powExpression(get_s(), -1)));
      attokatal = get_akat();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -21.0);
      zkat = times_2(tmp$ret$0_19, times_0(get_mol(), powExpression(get_s(), -1)));
      zeptokatal = get_zkat();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -24.0);
      ykat = times_2(tmp$ret$0_20, times_0(get_mol(), powExpression(get_s(), -1)));
      yoctokatal = get_ykat();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -27.0);
      rkat = times_2(tmp$ret$0_21, times_0(get_mol(), powExpression(get_s(), -1)));
      rontokatal = get_rkat();
      var tmp$ret$0_22;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_22 = Math.pow(10.0, -30.0);
      qkat = times_2(tmp$ret$0_22, times_0(get_mol(), powExpression(get_s(), -1)));
      quectokatal = get_qkat();
    }
  }
  function get_formula_7() {
    init_properties_Lumen_kt_l7zjjb();
    return formula_7;
  }
  var formula_7;
  function get_lm() {
    init_properties_Lumen_kt_l7zjjb();
    return lm;
  }
  var lm;
  function get_Qlm() {
    init_properties_Lumen_kt_l7zjjb();
    return Qlm;
  }
  var Qlm;
  function get_quettalumen() {
    init_properties_Lumen_kt_l7zjjb();
    return quettalumen;
  }
  var quettalumen;
  function get_Rlm() {
    init_properties_Lumen_kt_l7zjjb();
    return Rlm;
  }
  var Rlm;
  function get_ronnalumen() {
    init_properties_Lumen_kt_l7zjjb();
    return ronnalumen;
  }
  var ronnalumen;
  function get_Ylm() {
    init_properties_Lumen_kt_l7zjjb();
    return Ylm;
  }
  var Ylm;
  function get_yottalumen() {
    init_properties_Lumen_kt_l7zjjb();
    return yottalumen;
  }
  var yottalumen;
  function get_Zlm() {
    init_properties_Lumen_kt_l7zjjb();
    return Zlm;
  }
  var Zlm;
  function get_zettalumen() {
    init_properties_Lumen_kt_l7zjjb();
    return zettalumen;
  }
  var zettalumen;
  function get_Elm() {
    init_properties_Lumen_kt_l7zjjb();
    return Elm;
  }
  var Elm;
  function get_exalumen() {
    init_properties_Lumen_kt_l7zjjb();
    return exalumen;
  }
  var exalumen;
  function get_Plm() {
    init_properties_Lumen_kt_l7zjjb();
    return Plm;
  }
  var Plm;
  function get_petalumen() {
    init_properties_Lumen_kt_l7zjjb();
    return petalumen;
  }
  var petalumen;
  function get_Tlm() {
    init_properties_Lumen_kt_l7zjjb();
    return Tlm;
  }
  var Tlm;
  function get_teralumen() {
    init_properties_Lumen_kt_l7zjjb();
    return teralumen;
  }
  var teralumen;
  function get_Glm() {
    init_properties_Lumen_kt_l7zjjb();
    return Glm;
  }
  var Glm;
  function get_gigalumen() {
    init_properties_Lumen_kt_l7zjjb();
    return gigalumen;
  }
  var gigalumen;
  function get_Mlm() {
    init_properties_Lumen_kt_l7zjjb();
    return Mlm;
  }
  var Mlm;
  function get_megalumen() {
    init_properties_Lumen_kt_l7zjjb();
    return megalumen;
  }
  var megalumen;
  function get_klm() {
    init_properties_Lumen_kt_l7zjjb();
    return klm;
  }
  var klm;
  function get_kilolumen() {
    init_properties_Lumen_kt_l7zjjb();
    return kilolumen;
  }
  var kilolumen;
  function get_hlm() {
    init_properties_Lumen_kt_l7zjjb();
    return hlm;
  }
  var hlm;
  function get_hectolumen() {
    init_properties_Lumen_kt_l7zjjb();
    return hectolumen;
  }
  var hectolumen;
  function get_dalm() {
    init_properties_Lumen_kt_l7zjjb();
    return dalm;
  }
  var dalm;
  function get_decalumen() {
    init_properties_Lumen_kt_l7zjjb();
    return decalumen;
  }
  var decalumen;
  function get_dlm() {
    init_properties_Lumen_kt_l7zjjb();
    return dlm;
  }
  var dlm;
  function get_decilumen() {
    init_properties_Lumen_kt_l7zjjb();
    return decilumen;
  }
  var decilumen;
  function get_clm() {
    init_properties_Lumen_kt_l7zjjb();
    return clm;
  }
  var clm;
  function get_centilumen() {
    init_properties_Lumen_kt_l7zjjb();
    return centilumen;
  }
  var centilumen;
  function get_mlm() {
    init_properties_Lumen_kt_l7zjjb();
    return mlm;
  }
  var mlm;
  function get_millilumen() {
    init_properties_Lumen_kt_l7zjjb();
    return millilumen;
  }
  var millilumen;
  function get_μlm() {
    init_properties_Lumen_kt_l7zjjb();
    return μlm;
  }
  var μlm;
  function get_microlumen() {
    init_properties_Lumen_kt_l7zjjb();
    return microlumen;
  }
  var microlumen;
  function get_nlm() {
    init_properties_Lumen_kt_l7zjjb();
    return nlm;
  }
  var nlm;
  function get_nanolumen() {
    init_properties_Lumen_kt_l7zjjb();
    return nanolumen;
  }
  var nanolumen;
  function get_plm() {
    init_properties_Lumen_kt_l7zjjb();
    return plm;
  }
  var plm;
  function get_picolumen() {
    init_properties_Lumen_kt_l7zjjb();
    return picolumen;
  }
  var picolumen;
  function get_flm() {
    init_properties_Lumen_kt_l7zjjb();
    return flm;
  }
  var flm;
  function get_femtolumen() {
    init_properties_Lumen_kt_l7zjjb();
    return femtolumen;
  }
  var femtolumen;
  function get_alm() {
    init_properties_Lumen_kt_l7zjjb();
    return alm;
  }
  var alm;
  function get_attolumen() {
    init_properties_Lumen_kt_l7zjjb();
    return attolumen;
  }
  var attolumen;
  function get_zlm() {
    init_properties_Lumen_kt_l7zjjb();
    return zlm;
  }
  var zlm;
  function get_zeptolumen() {
    init_properties_Lumen_kt_l7zjjb();
    return zeptolumen;
  }
  var zeptolumen;
  function get_ylm() {
    init_properties_Lumen_kt_l7zjjb();
    return ylm;
  }
  var ylm;
  function get_yoctolumen() {
    init_properties_Lumen_kt_l7zjjb();
    return yoctolumen;
  }
  var yoctolumen;
  function get_rlm() {
    init_properties_Lumen_kt_l7zjjb();
    return rlm;
  }
  var rlm;
  function get_rontolumen() {
    init_properties_Lumen_kt_l7zjjb();
    return rontolumen;
  }
  var rontolumen;
  function get_qlm() {
    init_properties_Lumen_kt_l7zjjb();
    return qlm;
  }
  var qlm;
  function get_quectolumen() {
    init_properties_Lumen_kt_l7zjjb();
    return quectolumen;
  }
  var quectolumen;
  function Lumen(value) {
    DerivedUnit.call(this, value, get_formula_7());
  }
  var properties_initialized_Lumen_kt_40v56r;
  function init_properties_Lumen_kt_l7zjjb() {
    if (properties_initialized_Lumen_kt_40v56r) {
    } else {
      properties_initialized_Lumen_kt_40v56r = true;
      formula_7 = times_0(powExpression(get_cd(), 1), get_sr());
      lm = get_formula_7();
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 30.0);
      Qlm = times_2(tmp$ret$0, times_0(powExpression(get_cd(), 1), get_sr()));
      quettalumen = get_Qlm();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 27.0);
      Rlm = times_2(tmp$ret$0_0, times_0(powExpression(get_cd(), 1), get_sr()));
      ronnalumen = get_Rlm();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 24.0);
      Ylm = times_2(tmp$ret$0_1, times_0(powExpression(get_cd(), 1), get_sr()));
      yottalumen = get_Ylm();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 21.0);
      Zlm = times_2(tmp$ret$0_2, times_0(powExpression(get_cd(), 1), get_sr()));
      zettalumen = get_Zlm();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 18.0);
      Elm = times_2(tmp$ret$0_3, times_0(powExpression(get_cd(), 1), get_sr()));
      exalumen = get_Elm();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 15.0);
      Plm = times_2(tmp$ret$0_4, times_0(powExpression(get_cd(), 1), get_sr()));
      petalumen = get_Plm();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 12.0);
      Tlm = times_2(tmp$ret$0_5, times_0(powExpression(get_cd(), 1), get_sr()));
      teralumen = get_Tlm();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 9.0);
      Glm = times_2(tmp$ret$0_6, times_0(powExpression(get_cd(), 1), get_sr()));
      gigalumen = get_Glm();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 6.0);
      Mlm = times_2(tmp$ret$0_7, times_0(powExpression(get_cd(), 1), get_sr()));
      megalumen = get_Mlm();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, 3.0);
      klm = times_2(tmp$ret$0_8, times_0(powExpression(get_cd(), 1), get_sr()));
      kilolumen = get_klm();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, 2.0);
      hlm = times_2(tmp$ret$0_9, times_0(powExpression(get_cd(), 1), get_sr()));
      hectolumen = get_hlm();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, 1.0);
      dalm = times_2(tmp$ret$0_10, times_0(powExpression(get_cd(), 1), get_sr()));
      decalumen = get_dalm();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -1.0);
      dlm = times_2(tmp$ret$0_11, times_0(powExpression(get_cd(), 1), get_sr()));
      decilumen = get_dlm();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -2.0);
      clm = times_2(tmp$ret$0_12, times_0(powExpression(get_cd(), 1), get_sr()));
      centilumen = get_clm();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -3.0);
      mlm = times_2(tmp$ret$0_13, times_0(powExpression(get_cd(), 1), get_sr()));
      millilumen = get_mlm();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -6.0);
      μlm = times_2(tmp$ret$0_14, times_0(powExpression(get_cd(), 1), get_sr()));
      microlumen = get_μlm();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -9.0);
      nlm = times_2(tmp$ret$0_15, times_0(powExpression(get_cd(), 1), get_sr()));
      nanolumen = get_nlm();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -12.0);
      plm = times_2(tmp$ret$0_16, times_0(powExpression(get_cd(), 1), get_sr()));
      picolumen = get_plm();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -15.0);
      flm = times_2(tmp$ret$0_17, times_0(powExpression(get_cd(), 1), get_sr()));
      femtolumen = get_flm();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -18.0);
      alm = times_2(tmp$ret$0_18, times_0(powExpression(get_cd(), 1), get_sr()));
      attolumen = get_alm();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -21.0);
      zlm = times_2(tmp$ret$0_19, times_0(powExpression(get_cd(), 1), get_sr()));
      zeptolumen = get_zlm();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -24.0);
      ylm = times_2(tmp$ret$0_20, times_0(powExpression(get_cd(), 1), get_sr()));
      yoctolumen = get_ylm();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -27.0);
      rlm = times_2(tmp$ret$0_21, times_0(powExpression(get_cd(), 1), get_sr()));
      rontolumen = get_rlm();
      var tmp$ret$0_22;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_22 = Math.pow(10.0, -30.0);
      qlm = times_2(tmp$ret$0_22, times_0(powExpression(get_cd(), 1), get_sr()));
      quectolumen = get_qlm();
    }
  }
  function get_formula_8() {
    init_properties_Lux_kt_q9knd1();
    return formula_8;
  }
  var formula_8;
  function get_lx() {
    init_properties_Lux_kt_q9knd1();
    return lx;
  }
  var lx;
  function get_Qlx() {
    init_properties_Lux_kt_q9knd1();
    return Qlx;
  }
  var Qlx;
  function get_quettalux() {
    init_properties_Lux_kt_q9knd1();
    return quettalux;
  }
  var quettalux;
  function get_Rlx() {
    init_properties_Lux_kt_q9knd1();
    return Rlx;
  }
  var Rlx;
  function get_ronnalux() {
    init_properties_Lux_kt_q9knd1();
    return ronnalux;
  }
  var ronnalux;
  function get_Ylx() {
    init_properties_Lux_kt_q9knd1();
    return Ylx;
  }
  var Ylx;
  function get_yottalux() {
    init_properties_Lux_kt_q9knd1();
    return yottalux;
  }
  var yottalux;
  function get_Zlx() {
    init_properties_Lux_kt_q9knd1();
    return Zlx;
  }
  var Zlx;
  function get_zettalux() {
    init_properties_Lux_kt_q9knd1();
    return zettalux;
  }
  var zettalux;
  function get_Elx() {
    init_properties_Lux_kt_q9knd1();
    return Elx;
  }
  var Elx;
  function get_exalux() {
    init_properties_Lux_kt_q9knd1();
    return exalux;
  }
  var exalux;
  function get_Plx() {
    init_properties_Lux_kt_q9knd1();
    return Plx;
  }
  var Plx;
  function get_petalux() {
    init_properties_Lux_kt_q9knd1();
    return petalux;
  }
  var petalux;
  function get_Tlx() {
    init_properties_Lux_kt_q9knd1();
    return Tlx;
  }
  var Tlx;
  function get_teralux() {
    init_properties_Lux_kt_q9knd1();
    return teralux;
  }
  var teralux;
  function get_Glx() {
    init_properties_Lux_kt_q9knd1();
    return Glx;
  }
  var Glx;
  function get_gigalux() {
    init_properties_Lux_kt_q9knd1();
    return gigalux;
  }
  var gigalux;
  function get_Mlx() {
    init_properties_Lux_kt_q9knd1();
    return Mlx;
  }
  var Mlx;
  function get_megalux() {
    init_properties_Lux_kt_q9knd1();
    return megalux;
  }
  var megalux;
  function get_klx() {
    init_properties_Lux_kt_q9knd1();
    return klx;
  }
  var klx;
  function get_kilolux() {
    init_properties_Lux_kt_q9knd1();
    return kilolux;
  }
  var kilolux;
  function get_hlx() {
    init_properties_Lux_kt_q9knd1();
    return hlx;
  }
  var hlx;
  function get_hectolux() {
    init_properties_Lux_kt_q9knd1();
    return hectolux;
  }
  var hectolux;
  function get_dalx() {
    init_properties_Lux_kt_q9knd1();
    return dalx;
  }
  var dalx;
  function get_decalux() {
    init_properties_Lux_kt_q9knd1();
    return decalux;
  }
  var decalux;
  function get_dlx() {
    init_properties_Lux_kt_q9knd1();
    return dlx;
  }
  var dlx;
  function get_decilux() {
    init_properties_Lux_kt_q9knd1();
    return decilux;
  }
  var decilux;
  function get_clx() {
    init_properties_Lux_kt_q9knd1();
    return clx;
  }
  var clx;
  function get_centilux() {
    init_properties_Lux_kt_q9knd1();
    return centilux;
  }
  var centilux;
  function get_mlx() {
    init_properties_Lux_kt_q9knd1();
    return mlx;
  }
  var mlx;
  function get_millilux() {
    init_properties_Lux_kt_q9knd1();
    return millilux;
  }
  var millilux;
  function get_μlx() {
    init_properties_Lux_kt_q9knd1();
    return μlx;
  }
  var μlx;
  function get_microlux() {
    init_properties_Lux_kt_q9knd1();
    return microlux;
  }
  var microlux;
  function get_nlx() {
    init_properties_Lux_kt_q9knd1();
    return nlx;
  }
  var nlx;
  function get_nanolux() {
    init_properties_Lux_kt_q9knd1();
    return nanolux;
  }
  var nanolux;
  function get_plx() {
    init_properties_Lux_kt_q9knd1();
    return plx;
  }
  var plx;
  function get_picolux() {
    init_properties_Lux_kt_q9knd1();
    return picolux;
  }
  var picolux;
  function get_flx() {
    init_properties_Lux_kt_q9knd1();
    return flx;
  }
  var flx;
  function get_femtolux() {
    init_properties_Lux_kt_q9knd1();
    return femtolux;
  }
  var femtolux;
  function get_alx() {
    init_properties_Lux_kt_q9knd1();
    return alx;
  }
  var alx;
  function get_attolux() {
    init_properties_Lux_kt_q9knd1();
    return attolux;
  }
  var attolux;
  function get_zlx() {
    init_properties_Lux_kt_q9knd1();
    return zlx;
  }
  var zlx;
  function get_zeptolux() {
    init_properties_Lux_kt_q9knd1();
    return zeptolux;
  }
  var zeptolux;
  function get_ylx() {
    init_properties_Lux_kt_q9knd1();
    return ylx;
  }
  var ylx;
  function get_yoctolux() {
    init_properties_Lux_kt_q9knd1();
    return yoctolux;
  }
  var yoctolux;
  function get_rlx() {
    init_properties_Lux_kt_q9knd1();
    return rlx;
  }
  var rlx;
  function get_rontolux() {
    init_properties_Lux_kt_q9knd1();
    return rontolux;
  }
  var rontolux;
  function get_qlx() {
    init_properties_Lux_kt_q9knd1();
    return qlx;
  }
  var qlx;
  function get_quectolux() {
    init_properties_Lux_kt_q9knd1();
    return quectolux;
  }
  var quectolux;
  function Lux(value) {
    DerivedUnit.call(this, value, get_formula_8());
  }
  var properties_initialized_Lux_kt_pkzbtt;
  function init_properties_Lux_kt_q9knd1() {
    if (properties_initialized_Lux_kt_pkzbtt) {
    } else {
      properties_initialized_Lux_kt_pkzbtt = true;
      formula_8 = times_0(times_0(get_cd(), get_sr()), powExpression(get_m(), -2));
      lx = get_formula_8();
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 30.0);
      Qlx = times_2(tmp$ret$0, times_0(times_0(get_cd(), get_sr()), powExpression(get_m(), -2)));
      quettalux = get_Qlx();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 27.0);
      Rlx = times_2(tmp$ret$0_0, times_0(times_0(get_cd(), get_sr()), powExpression(get_m(), -2)));
      ronnalux = get_Rlx();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 24.0);
      Ylx = times_2(tmp$ret$0_1, times_0(times_0(get_cd(), get_sr()), powExpression(get_m(), -2)));
      yottalux = get_Ylx();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 21.0);
      Zlx = times_2(tmp$ret$0_2, times_0(times_0(get_cd(), get_sr()), powExpression(get_m(), -2)));
      zettalux = get_Zlx();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 18.0);
      Elx = times_2(tmp$ret$0_3, times_0(times_0(get_cd(), get_sr()), powExpression(get_m(), -2)));
      exalux = get_Elx();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 15.0);
      Plx = times_2(tmp$ret$0_4, times_0(times_0(get_cd(), get_sr()), powExpression(get_m(), -2)));
      petalux = get_Plx();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 12.0);
      Tlx = times_2(tmp$ret$0_5, times_0(times_0(get_cd(), get_sr()), powExpression(get_m(), -2)));
      teralux = get_Tlx();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 9.0);
      Glx = times_2(tmp$ret$0_6, times_0(times_0(get_cd(), get_sr()), powExpression(get_m(), -2)));
      gigalux = get_Glx();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 6.0);
      Mlx = times_2(tmp$ret$0_7, times_0(times_0(get_cd(), get_sr()), powExpression(get_m(), -2)));
      megalux = get_Mlx();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, 3.0);
      klx = times_2(tmp$ret$0_8, times_0(times_0(get_cd(), get_sr()), powExpression(get_m(), -2)));
      kilolux = get_klx();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, 2.0);
      hlx = times_2(tmp$ret$0_9, times_0(times_0(get_cd(), get_sr()), powExpression(get_m(), -2)));
      hectolux = get_hlx();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, 1.0);
      dalx = times_2(tmp$ret$0_10, times_0(times_0(get_cd(), get_sr()), powExpression(get_m(), -2)));
      decalux = get_dalx();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -1.0);
      dlx = times_2(tmp$ret$0_11, times_0(times_0(get_cd(), get_sr()), powExpression(get_m(), -2)));
      decilux = get_dlx();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -2.0);
      clx = times_2(tmp$ret$0_12, times_0(times_0(get_cd(), get_sr()), powExpression(get_m(), -2)));
      centilux = get_clx();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -3.0);
      mlx = times_2(tmp$ret$0_13, times_0(times_0(get_cd(), get_sr()), powExpression(get_m(), -2)));
      millilux = get_mlx();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -6.0);
      μlx = times_2(tmp$ret$0_14, times_0(times_0(get_cd(), get_sr()), powExpression(get_m(), -2)));
      microlux = get_μlx();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -9.0);
      nlx = times_2(tmp$ret$0_15, times_0(times_0(get_cd(), get_sr()), powExpression(get_m(), -2)));
      nanolux = get_nlx();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -12.0);
      plx = times_2(tmp$ret$0_16, times_0(times_0(get_cd(), get_sr()), powExpression(get_m(), -2)));
      picolux = get_plx();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -15.0);
      flx = times_2(tmp$ret$0_17, times_0(times_0(get_cd(), get_sr()), powExpression(get_m(), -2)));
      femtolux = get_flx();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -18.0);
      alx = times_2(tmp$ret$0_18, times_0(times_0(get_cd(), get_sr()), powExpression(get_m(), -2)));
      attolux = get_alx();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -21.0);
      zlx = times_2(tmp$ret$0_19, times_0(times_0(get_cd(), get_sr()), powExpression(get_m(), -2)));
      zeptolux = get_zlx();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -24.0);
      ylx = times_2(tmp$ret$0_20, times_0(times_0(get_cd(), get_sr()), powExpression(get_m(), -2)));
      yoctolux = get_ylx();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -27.0);
      rlx = times_2(tmp$ret$0_21, times_0(times_0(get_cd(), get_sr()), powExpression(get_m(), -2)));
      rontolux = get_rlx();
      var tmp$ret$0_22;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_22 = Math.pow(10.0, -30.0);
      qlx = times_2(tmp$ret$0_22, times_0(times_0(get_cd(), get_sr()), powExpression(get_m(), -2)));
      quectolux = get_qlx();
    }
  }
  function get_formula_9() {
    init_properties_Newton_kt_6q8jpj();
    return formula_9;
  }
  var formula_9;
  function get_N() {
    init_properties_Newton_kt_6q8jpj();
    return N;
  }
  var N;
  function get_QN() {
    init_properties_Newton_kt_6q8jpj();
    return QN;
  }
  var QN;
  function get_quettanewton() {
    init_properties_Newton_kt_6q8jpj();
    return quettanewton;
  }
  var quettanewton;
  function get_RN() {
    init_properties_Newton_kt_6q8jpj();
    return RN;
  }
  var RN;
  function get_ronnanewton() {
    init_properties_Newton_kt_6q8jpj();
    return ronnanewton;
  }
  var ronnanewton;
  function get_YN() {
    init_properties_Newton_kt_6q8jpj();
    return YN;
  }
  var YN;
  function get_yottanewton() {
    init_properties_Newton_kt_6q8jpj();
    return yottanewton;
  }
  var yottanewton;
  function get_ZN() {
    init_properties_Newton_kt_6q8jpj();
    return ZN;
  }
  var ZN;
  function get_zettanewton() {
    init_properties_Newton_kt_6q8jpj();
    return zettanewton;
  }
  var zettanewton;
  function get_EN() {
    init_properties_Newton_kt_6q8jpj();
    return EN;
  }
  var EN;
  function get_exanewton() {
    init_properties_Newton_kt_6q8jpj();
    return exanewton;
  }
  var exanewton;
  function get_PN() {
    init_properties_Newton_kt_6q8jpj();
    return PN;
  }
  var PN;
  function get_petanewton() {
    init_properties_Newton_kt_6q8jpj();
    return petanewton;
  }
  var petanewton;
  function get_TN() {
    init_properties_Newton_kt_6q8jpj();
    return TN;
  }
  var TN;
  function get_teranewton() {
    init_properties_Newton_kt_6q8jpj();
    return teranewton;
  }
  var teranewton;
  function get_GN() {
    init_properties_Newton_kt_6q8jpj();
    return GN;
  }
  var GN;
  function get_giganewton() {
    init_properties_Newton_kt_6q8jpj();
    return giganewton;
  }
  var giganewton;
  function get_MN() {
    init_properties_Newton_kt_6q8jpj();
    return MN;
  }
  var MN;
  function get_meganewton() {
    init_properties_Newton_kt_6q8jpj();
    return meganewton;
  }
  var meganewton;
  function get_kN() {
    init_properties_Newton_kt_6q8jpj();
    return kN;
  }
  var kN;
  function get_kilonewton() {
    init_properties_Newton_kt_6q8jpj();
    return kilonewton;
  }
  var kilonewton;
  function get_hN() {
    init_properties_Newton_kt_6q8jpj();
    return hN;
  }
  var hN;
  function get_hectonewton() {
    init_properties_Newton_kt_6q8jpj();
    return hectonewton;
  }
  var hectonewton;
  function get_daN() {
    init_properties_Newton_kt_6q8jpj();
    return daN;
  }
  var daN;
  function get_decanewton() {
    init_properties_Newton_kt_6q8jpj();
    return decanewton;
  }
  var decanewton;
  function get_dN() {
    init_properties_Newton_kt_6q8jpj();
    return dN;
  }
  var dN;
  function get_decinewton() {
    init_properties_Newton_kt_6q8jpj();
    return decinewton;
  }
  var decinewton;
  function get_cN() {
    init_properties_Newton_kt_6q8jpj();
    return cN;
  }
  var cN;
  function get_centinewton() {
    init_properties_Newton_kt_6q8jpj();
    return centinewton;
  }
  var centinewton;
  function get_mN() {
    init_properties_Newton_kt_6q8jpj();
    return mN;
  }
  var mN;
  function get_millinewton() {
    init_properties_Newton_kt_6q8jpj();
    return millinewton;
  }
  var millinewton;
  function get_μN() {
    init_properties_Newton_kt_6q8jpj();
    return μN;
  }
  var μN;
  function get_micronewton() {
    init_properties_Newton_kt_6q8jpj();
    return micronewton;
  }
  var micronewton;
  function get_nN() {
    init_properties_Newton_kt_6q8jpj();
    return nN;
  }
  var nN;
  function get_nanonewton() {
    init_properties_Newton_kt_6q8jpj();
    return nanonewton;
  }
  var nanonewton;
  function get_pN() {
    init_properties_Newton_kt_6q8jpj();
    return pN;
  }
  var pN;
  function get_piconewton() {
    init_properties_Newton_kt_6q8jpj();
    return piconewton;
  }
  var piconewton;
  function get_fN() {
    init_properties_Newton_kt_6q8jpj();
    return fN;
  }
  var fN;
  function get_femtonewton() {
    init_properties_Newton_kt_6q8jpj();
    return femtonewton;
  }
  var femtonewton;
  function get_aN() {
    init_properties_Newton_kt_6q8jpj();
    return aN;
  }
  var aN;
  function get_attonewton() {
    init_properties_Newton_kt_6q8jpj();
    return attonewton;
  }
  var attonewton;
  function get_zN() {
    init_properties_Newton_kt_6q8jpj();
    return zN;
  }
  var zN;
  function get_zeptonewton() {
    init_properties_Newton_kt_6q8jpj();
    return zeptonewton;
  }
  var zeptonewton;
  function get_yN() {
    init_properties_Newton_kt_6q8jpj();
    return yN;
  }
  var yN;
  function get_yoctonewton() {
    init_properties_Newton_kt_6q8jpj();
    return yoctonewton;
  }
  var yoctonewton;
  function get_rN() {
    init_properties_Newton_kt_6q8jpj();
    return rN;
  }
  var rN;
  function get_rontonewton() {
    init_properties_Newton_kt_6q8jpj();
    return rontonewton;
  }
  var rontonewton;
  function get_qN() {
    init_properties_Newton_kt_6q8jpj();
    return qN;
  }
  var qN;
  function get_quectonewton() {
    init_properties_Newton_kt_6q8jpj();
    return quectonewton;
  }
  var quectonewton;
  function Newton(value) {
    DerivedUnit.call(this, value, get_formula_9());
  }
  var properties_initialized_Newton_kt_t6rf9x;
  function init_properties_Newton_kt_6q8jpj() {
    if (properties_initialized_Newton_kt_t6rf9x) {
    } else {
      properties_initialized_Newton_kt_t6rf9x = true;
      formula_9 = div(times_0(get_kg(), get_m()), powExpression(get_s(), 2));
      N = get_formula_9();
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 30.0);
      QN = times_2(tmp$ret$0, div(times_0(get_kg(), get_m()), powExpression(get_s(), 2)));
      quettanewton = get_QN();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 27.0);
      RN = times_2(tmp$ret$0_0, div(times_0(get_kg(), get_m()), powExpression(get_s(), 2)));
      ronnanewton = get_RN();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 24.0);
      YN = times_2(tmp$ret$0_1, div(times_0(get_kg(), get_m()), powExpression(get_s(), 2)));
      yottanewton = get_YN();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 21.0);
      ZN = times_2(tmp$ret$0_2, div(times_0(get_kg(), get_m()), powExpression(get_s(), 2)));
      zettanewton = get_ZN();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 18.0);
      EN = times_2(tmp$ret$0_3, div(times_0(get_kg(), get_m()), powExpression(get_s(), 2)));
      exanewton = get_EN();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 15.0);
      PN = times_2(tmp$ret$0_4, div(times_0(get_kg(), get_m()), powExpression(get_s(), 2)));
      petanewton = get_PN();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 12.0);
      TN = times_2(tmp$ret$0_5, div(times_0(get_kg(), get_m()), powExpression(get_s(), 2)));
      teranewton = get_TN();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 9.0);
      GN = times_2(tmp$ret$0_6, div(times_0(get_kg(), get_m()), powExpression(get_s(), 2)));
      giganewton = get_GN();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 6.0);
      MN = times_2(tmp$ret$0_7, div(times_0(get_kg(), get_m()), powExpression(get_s(), 2)));
      meganewton = get_MN();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, 3.0);
      kN = times_2(tmp$ret$0_8, div(times_0(get_kg(), get_m()), powExpression(get_s(), 2)));
      kilonewton = get_kN();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, 2.0);
      hN = times_2(tmp$ret$0_9, div(times_0(get_kg(), get_m()), powExpression(get_s(), 2)));
      hectonewton = get_hN();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, 1.0);
      daN = times_2(tmp$ret$0_10, div(times_0(get_kg(), get_m()), powExpression(get_s(), 2)));
      decanewton = get_daN();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -1.0);
      dN = times_2(tmp$ret$0_11, div(times_0(get_kg(), get_m()), powExpression(get_s(), 2)));
      decinewton = get_dN();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -2.0);
      cN = times_2(tmp$ret$0_12, div(times_0(get_kg(), get_m()), powExpression(get_s(), 2)));
      centinewton = get_cN();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -3.0);
      mN = times_2(tmp$ret$0_13, div(times_0(get_kg(), get_m()), powExpression(get_s(), 2)));
      millinewton = get_mN();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -6.0);
      μN = times_2(tmp$ret$0_14, div(times_0(get_kg(), get_m()), powExpression(get_s(), 2)));
      micronewton = get_μN();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -9.0);
      nN = times_2(tmp$ret$0_15, div(times_0(get_kg(), get_m()), powExpression(get_s(), 2)));
      nanonewton = get_nN();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -12.0);
      pN = times_2(tmp$ret$0_16, div(times_0(get_kg(), get_m()), powExpression(get_s(), 2)));
      piconewton = get_pN();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -15.0);
      fN = times_2(tmp$ret$0_17, div(times_0(get_kg(), get_m()), powExpression(get_s(), 2)));
      femtonewton = get_fN();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -18.0);
      aN = times_2(tmp$ret$0_18, div(times_0(get_kg(), get_m()), powExpression(get_s(), 2)));
      attonewton = get_aN();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -21.0);
      zN = times_2(tmp$ret$0_19, div(times_0(get_kg(), get_m()), powExpression(get_s(), 2)));
      zeptonewton = get_zN();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -24.0);
      yN = times_2(tmp$ret$0_20, div(times_0(get_kg(), get_m()), powExpression(get_s(), 2)));
      yoctonewton = get_yN();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -27.0);
      rN = times_2(tmp$ret$0_21, div(times_0(get_kg(), get_m()), powExpression(get_s(), 2)));
      rontonewton = get_rN();
      var tmp$ret$0_22;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_22 = Math.pow(10.0, -30.0);
      qN = times_2(tmp$ret$0_22, div(times_0(get_kg(), get_m()), powExpression(get_s(), 2)));
      quectonewton = get_qN();
    }
  }
  function get_formula_10() {
    init_properties_Ohm_kt_rhd5z4();
    return formula_10;
  }
  var formula_10;
  function get_Ω() {
    init_properties_Ohm_kt_rhd5z4();
    return Ω;
  }
  var Ω;
  function get_QΩ() {
    init_properties_Ohm_kt_rhd5z4();
    return QΩ;
  }
  var QΩ;
  function get_quettaohm() {
    init_properties_Ohm_kt_rhd5z4();
    return quettaohm;
  }
  var quettaohm;
  function get_RΩ() {
    init_properties_Ohm_kt_rhd5z4();
    return RΩ;
  }
  var RΩ;
  function get_ronnaohm() {
    init_properties_Ohm_kt_rhd5z4();
    return ronnaohm;
  }
  var ronnaohm;
  function get_YΩ() {
    init_properties_Ohm_kt_rhd5z4();
    return YΩ;
  }
  var YΩ;
  function get_yottaohm() {
    init_properties_Ohm_kt_rhd5z4();
    return yottaohm;
  }
  var yottaohm;
  function get_ZΩ() {
    init_properties_Ohm_kt_rhd5z4();
    return ZΩ;
  }
  var ZΩ;
  function get_zettaohm() {
    init_properties_Ohm_kt_rhd5z4();
    return zettaohm;
  }
  var zettaohm;
  function get_EΩ() {
    init_properties_Ohm_kt_rhd5z4();
    return EΩ;
  }
  var EΩ;
  function get_exaohm() {
    init_properties_Ohm_kt_rhd5z4();
    return exaohm;
  }
  var exaohm;
  function get_PΩ() {
    init_properties_Ohm_kt_rhd5z4();
    return PΩ;
  }
  var PΩ;
  function get_petaohm() {
    init_properties_Ohm_kt_rhd5z4();
    return petaohm;
  }
  var petaohm;
  function get_TΩ() {
    init_properties_Ohm_kt_rhd5z4();
    return TΩ;
  }
  var TΩ;
  function get_teraohm() {
    init_properties_Ohm_kt_rhd5z4();
    return teraohm;
  }
  var teraohm;
  function get_GΩ() {
    init_properties_Ohm_kt_rhd5z4();
    return GΩ;
  }
  var GΩ;
  function get_gigaohm() {
    init_properties_Ohm_kt_rhd5z4();
    return gigaohm;
  }
  var gigaohm;
  function get_MΩ() {
    init_properties_Ohm_kt_rhd5z4();
    return MΩ;
  }
  var MΩ;
  function get_megaohm() {
    init_properties_Ohm_kt_rhd5z4();
    return megaohm;
  }
  var megaohm;
  function get_kΩ() {
    init_properties_Ohm_kt_rhd5z4();
    return kΩ;
  }
  var kΩ;
  function get_kiloohm() {
    init_properties_Ohm_kt_rhd5z4();
    return kiloohm;
  }
  var kiloohm;
  function get_hΩ() {
    init_properties_Ohm_kt_rhd5z4();
    return hΩ;
  }
  var hΩ;
  function get_hectoohm() {
    init_properties_Ohm_kt_rhd5z4();
    return hectoohm;
  }
  var hectoohm;
  function get_daΩ() {
    init_properties_Ohm_kt_rhd5z4();
    return daΩ;
  }
  var daΩ;
  function get_decaohm() {
    init_properties_Ohm_kt_rhd5z4();
    return decaohm;
  }
  var decaohm;
  function get_dΩ() {
    init_properties_Ohm_kt_rhd5z4();
    return dΩ;
  }
  var dΩ;
  function get_deciohm() {
    init_properties_Ohm_kt_rhd5z4();
    return deciohm;
  }
  var deciohm;
  function get_cΩ() {
    init_properties_Ohm_kt_rhd5z4();
    return cΩ;
  }
  var cΩ;
  function get_centiohm() {
    init_properties_Ohm_kt_rhd5z4();
    return centiohm;
  }
  var centiohm;
  function get_mΩ() {
    init_properties_Ohm_kt_rhd5z4();
    return mΩ;
  }
  var mΩ;
  function get_milliohm() {
    init_properties_Ohm_kt_rhd5z4();
    return milliohm;
  }
  var milliohm;
  function get_μΩ() {
    init_properties_Ohm_kt_rhd5z4();
    return μΩ;
  }
  var μΩ;
  function get_microohm() {
    init_properties_Ohm_kt_rhd5z4();
    return microohm;
  }
  var microohm;
  function get_nΩ() {
    init_properties_Ohm_kt_rhd5z4();
    return nΩ;
  }
  var nΩ;
  function get_nanoohm() {
    init_properties_Ohm_kt_rhd5z4();
    return nanoohm;
  }
  var nanoohm;
  function get_pΩ() {
    init_properties_Ohm_kt_rhd5z4();
    return pΩ;
  }
  var pΩ;
  function get_picoohm() {
    init_properties_Ohm_kt_rhd5z4();
    return picoohm;
  }
  var picoohm;
  function get_fΩ() {
    init_properties_Ohm_kt_rhd5z4();
    return fΩ;
  }
  var fΩ;
  function get_femtoohm() {
    init_properties_Ohm_kt_rhd5z4();
    return femtoohm;
  }
  var femtoohm;
  function get_aΩ() {
    init_properties_Ohm_kt_rhd5z4();
    return aΩ;
  }
  var aΩ;
  function get_attoohm() {
    init_properties_Ohm_kt_rhd5z4();
    return attoohm;
  }
  var attoohm;
  function get_zΩ() {
    init_properties_Ohm_kt_rhd5z4();
    return zΩ;
  }
  var zΩ;
  function get_zeptoohm() {
    init_properties_Ohm_kt_rhd5z4();
    return zeptoohm;
  }
  var zeptoohm;
  function get_yΩ() {
    init_properties_Ohm_kt_rhd5z4();
    return yΩ;
  }
  var yΩ;
  function get_yoctoohm() {
    init_properties_Ohm_kt_rhd5z4();
    return yoctoohm;
  }
  var yoctoohm;
  function get_rΩ() {
    init_properties_Ohm_kt_rhd5z4();
    return rΩ;
  }
  var rΩ;
  function get_rontoohm() {
    init_properties_Ohm_kt_rhd5z4();
    return rontoohm;
  }
  var rontoohm;
  function get_qΩ() {
    init_properties_Ohm_kt_rhd5z4();
    return qΩ;
  }
  var qΩ;
  function get_quectoohm() {
    init_properties_Ohm_kt_rhd5z4();
    return quectoohm;
  }
  var quectoohm;
  function Ohm(value) {
    DerivedUnit.call(this, value, get_formula_10());
  }
  var properties_initialized_Ohm_kt_qsrufw;
  function init_properties_Ohm_kt_rhd5z4() {
    if (properties_initialized_Ohm_kt_qsrufw) {
    } else {
      properties_initialized_Ohm_kt_qsrufw = true;
      formula_10 = times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -2));
      Ω = get_formula_10();
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 30.0);
      QΩ = times_2(tmp$ret$0, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -2)));
      quettaohm = get_QΩ();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 27.0);
      RΩ = times_2(tmp$ret$0_0, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -2)));
      ronnaohm = get_RΩ();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 24.0);
      YΩ = times_2(tmp$ret$0_1, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -2)));
      yottaohm = get_YΩ();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 21.0);
      ZΩ = times_2(tmp$ret$0_2, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -2)));
      zettaohm = get_ZΩ();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 18.0);
      EΩ = times_2(tmp$ret$0_3, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -2)));
      exaohm = get_EΩ();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 15.0);
      PΩ = times_2(tmp$ret$0_4, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -2)));
      petaohm = get_PΩ();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 12.0);
      TΩ = times_2(tmp$ret$0_5, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -2)));
      teraohm = get_TΩ();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 9.0);
      GΩ = times_2(tmp$ret$0_6, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -2)));
      gigaohm = get_GΩ();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 6.0);
      MΩ = times_2(tmp$ret$0_7, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -2)));
      megaohm = get_MΩ();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, 3.0);
      kΩ = times_2(tmp$ret$0_8, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -2)));
      kiloohm = get_kΩ();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, 2.0);
      hΩ = times_2(tmp$ret$0_9, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -2)));
      hectoohm = get_hΩ();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, 1.0);
      daΩ = times_2(tmp$ret$0_10, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -2)));
      decaohm = get_daΩ();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -1.0);
      dΩ = times_2(tmp$ret$0_11, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -2)));
      deciohm = get_dΩ();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -2.0);
      cΩ = times_2(tmp$ret$0_12, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -2)));
      centiohm = get_cΩ();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -3.0);
      mΩ = times_2(tmp$ret$0_13, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -2)));
      milliohm = get_mΩ();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -6.0);
      μΩ = times_2(tmp$ret$0_14, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -2)));
      microohm = get_μΩ();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -9.0);
      nΩ = times_2(tmp$ret$0_15, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -2)));
      nanoohm = get_nΩ();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -12.0);
      pΩ = times_2(tmp$ret$0_16, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -2)));
      picoohm = get_pΩ();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -15.0);
      fΩ = times_2(tmp$ret$0_17, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -2)));
      femtoohm = get_fΩ();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -18.0);
      aΩ = times_2(tmp$ret$0_18, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -2)));
      attoohm = get_aΩ();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -21.0);
      zΩ = times_2(tmp$ret$0_19, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -2)));
      zeptoohm = get_zΩ();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -24.0);
      yΩ = times_2(tmp$ret$0_20, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -2)));
      yoctoohm = get_yΩ();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -27.0);
      rΩ = times_2(tmp$ret$0_21, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -2)));
      rontoohm = get_rΩ();
      var tmp$ret$0_22;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_22 = Math.pow(10.0, -30.0);
      qΩ = times_2(tmp$ret$0_22, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -2)));
      quectoohm = get_qΩ();
    }
  }
  function get_formula_11() {
    init_properties_Pascal_kt_m88c2a();
    return formula_11;
  }
  var formula_11;
  function get_Pa() {
    init_properties_Pascal_kt_m88c2a();
    return Pa;
  }
  var Pa;
  function get_QPa() {
    init_properties_Pascal_kt_m88c2a();
    return QPa;
  }
  var QPa;
  function get_quettapascal() {
    init_properties_Pascal_kt_m88c2a();
    return quettapascal;
  }
  var quettapascal;
  function get_RPa() {
    init_properties_Pascal_kt_m88c2a();
    return RPa;
  }
  var RPa;
  function get_ronnapascal() {
    init_properties_Pascal_kt_m88c2a();
    return ronnapascal;
  }
  var ronnapascal;
  function get_YPa() {
    init_properties_Pascal_kt_m88c2a();
    return YPa;
  }
  var YPa;
  function get_yottapascal() {
    init_properties_Pascal_kt_m88c2a();
    return yottapascal;
  }
  var yottapascal;
  function get_ZPa() {
    init_properties_Pascal_kt_m88c2a();
    return ZPa;
  }
  var ZPa;
  function get_zettapascal() {
    init_properties_Pascal_kt_m88c2a();
    return zettapascal;
  }
  var zettapascal;
  function get_EPa() {
    init_properties_Pascal_kt_m88c2a();
    return EPa;
  }
  var EPa;
  function get_exapascal() {
    init_properties_Pascal_kt_m88c2a();
    return exapascal;
  }
  var exapascal;
  function get_PPa() {
    init_properties_Pascal_kt_m88c2a();
    return PPa;
  }
  var PPa;
  function get_petapascal() {
    init_properties_Pascal_kt_m88c2a();
    return petapascal;
  }
  var petapascal;
  function get_TPa() {
    init_properties_Pascal_kt_m88c2a();
    return TPa;
  }
  var TPa;
  function get_terapascal() {
    init_properties_Pascal_kt_m88c2a();
    return terapascal;
  }
  var terapascal;
  function get_GPa() {
    init_properties_Pascal_kt_m88c2a();
    return GPa;
  }
  var GPa;
  function get_gigapascal() {
    init_properties_Pascal_kt_m88c2a();
    return gigapascal;
  }
  var gigapascal;
  function get_MPa() {
    init_properties_Pascal_kt_m88c2a();
    return MPa;
  }
  var MPa;
  function get_megapascal() {
    init_properties_Pascal_kt_m88c2a();
    return megapascal;
  }
  var megapascal;
  function get_kPa() {
    init_properties_Pascal_kt_m88c2a();
    return kPa;
  }
  var kPa;
  function get_kilopascal() {
    init_properties_Pascal_kt_m88c2a();
    return kilopascal;
  }
  var kilopascal;
  function get_hPa() {
    init_properties_Pascal_kt_m88c2a();
    return hPa;
  }
  var hPa;
  function get_hectopascal() {
    init_properties_Pascal_kt_m88c2a();
    return hectopascal;
  }
  var hectopascal;
  function get_daPa() {
    init_properties_Pascal_kt_m88c2a();
    return daPa;
  }
  var daPa;
  function get_decapascal() {
    init_properties_Pascal_kt_m88c2a();
    return decapascal;
  }
  var decapascal;
  function get_dPa() {
    init_properties_Pascal_kt_m88c2a();
    return dPa;
  }
  var dPa;
  function get_decipascal() {
    init_properties_Pascal_kt_m88c2a();
    return decipascal;
  }
  var decipascal;
  function get_cPa() {
    init_properties_Pascal_kt_m88c2a();
    return cPa;
  }
  var cPa;
  function get_centipascal() {
    init_properties_Pascal_kt_m88c2a();
    return centipascal;
  }
  var centipascal;
  function get_mPa() {
    init_properties_Pascal_kt_m88c2a();
    return mPa;
  }
  var mPa;
  function get_millipascal() {
    init_properties_Pascal_kt_m88c2a();
    return millipascal;
  }
  var millipascal;
  function get_μPa() {
    init_properties_Pascal_kt_m88c2a();
    return μPa;
  }
  var μPa;
  function get_micropascal() {
    init_properties_Pascal_kt_m88c2a();
    return micropascal;
  }
  var micropascal;
  function get_nPa() {
    init_properties_Pascal_kt_m88c2a();
    return nPa;
  }
  var nPa;
  function get_nanopascal() {
    init_properties_Pascal_kt_m88c2a();
    return nanopascal;
  }
  var nanopascal;
  function get_pPa() {
    init_properties_Pascal_kt_m88c2a();
    return pPa;
  }
  var pPa;
  function get_picopascal() {
    init_properties_Pascal_kt_m88c2a();
    return picopascal;
  }
  var picopascal;
  function get_fPa() {
    init_properties_Pascal_kt_m88c2a();
    return fPa;
  }
  var fPa;
  function get_femtopascal() {
    init_properties_Pascal_kt_m88c2a();
    return femtopascal;
  }
  var femtopascal;
  function get_aPa() {
    init_properties_Pascal_kt_m88c2a();
    return aPa;
  }
  var aPa;
  function get_attopascal() {
    init_properties_Pascal_kt_m88c2a();
    return attopascal;
  }
  var attopascal;
  function get_zPa() {
    init_properties_Pascal_kt_m88c2a();
    return zPa;
  }
  var zPa;
  function get_zeptopascal() {
    init_properties_Pascal_kt_m88c2a();
    return zeptopascal;
  }
  var zeptopascal;
  function get_yPa() {
    init_properties_Pascal_kt_m88c2a();
    return yPa;
  }
  var yPa;
  function get_yoctopascal() {
    init_properties_Pascal_kt_m88c2a();
    return yoctopascal;
  }
  var yoctopascal;
  function get_rPa() {
    init_properties_Pascal_kt_m88c2a();
    return rPa;
  }
  var rPa;
  function get_rontopascal() {
    init_properties_Pascal_kt_m88c2a();
    return rontopascal;
  }
  var rontopascal;
  function get_qPa() {
    init_properties_Pascal_kt_m88c2a();
    return qPa;
  }
  var qPa;
  function get_quectopascal() {
    init_properties_Pascal_kt_m88c2a();
    return quectopascal;
  }
  var quectopascal;
  function Pascal(value) {
    DerivedUnit.call(this, value, get_formula_11());
  }
  var properties_initialized_Pascal_kt_cvvqxe;
  function init_properties_Pascal_kt_m88c2a() {
    if (properties_initialized_Pascal_kt_cvvqxe) {
    } else {
      properties_initialized_Pascal_kt_cvvqxe = true;
      formula_11 = div(get_kg(), times_0(get_m(), powExpression(get_s(), 2)));
      Pa = get_formula_11();
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 30.0);
      QPa = times_2(tmp$ret$0, div(get_kg(), times_0(get_m(), powExpression(get_s(), 2))));
      quettapascal = get_QPa();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 27.0);
      RPa = times_2(tmp$ret$0_0, div(get_kg(), times_0(get_m(), powExpression(get_s(), 2))));
      ronnapascal = get_RPa();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 24.0);
      YPa = times_2(tmp$ret$0_1, div(get_kg(), times_0(get_m(), powExpression(get_s(), 2))));
      yottapascal = get_YPa();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 21.0);
      ZPa = times_2(tmp$ret$0_2, div(get_kg(), times_0(get_m(), powExpression(get_s(), 2))));
      zettapascal = get_ZPa();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 18.0);
      EPa = times_2(tmp$ret$0_3, div(get_kg(), times_0(get_m(), powExpression(get_s(), 2))));
      exapascal = get_EPa();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 15.0);
      PPa = times_2(tmp$ret$0_4, div(get_kg(), times_0(get_m(), powExpression(get_s(), 2))));
      petapascal = get_PPa();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 12.0);
      TPa = times_2(tmp$ret$0_5, div(get_kg(), times_0(get_m(), powExpression(get_s(), 2))));
      terapascal = get_TPa();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 9.0);
      GPa = times_2(tmp$ret$0_6, div(get_kg(), times_0(get_m(), powExpression(get_s(), 2))));
      gigapascal = get_GPa();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 6.0);
      MPa = times_2(tmp$ret$0_7, div(get_kg(), times_0(get_m(), powExpression(get_s(), 2))));
      megapascal = get_MPa();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, 3.0);
      kPa = times_2(tmp$ret$0_8, div(get_kg(), times_0(get_m(), powExpression(get_s(), 2))));
      kilopascal = get_kPa();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, 2.0);
      hPa = times_2(tmp$ret$0_9, div(get_kg(), times_0(get_m(), powExpression(get_s(), 2))));
      hectopascal = get_hPa();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, 1.0);
      daPa = times_2(tmp$ret$0_10, div(get_kg(), times_0(get_m(), powExpression(get_s(), 2))));
      decapascal = get_daPa();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -1.0);
      dPa = times_2(tmp$ret$0_11, div(get_kg(), times_0(get_m(), powExpression(get_s(), 2))));
      decipascal = get_dPa();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -2.0);
      cPa = times_2(tmp$ret$0_12, div(get_kg(), times_0(get_m(), powExpression(get_s(), 2))));
      centipascal = get_cPa();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -3.0);
      mPa = times_2(tmp$ret$0_13, div(get_kg(), times_0(get_m(), powExpression(get_s(), 2))));
      millipascal = get_mPa();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -6.0);
      μPa = times_2(tmp$ret$0_14, div(get_kg(), times_0(get_m(), powExpression(get_s(), 2))));
      micropascal = get_μPa();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -9.0);
      nPa = times_2(tmp$ret$0_15, div(get_kg(), times_0(get_m(), powExpression(get_s(), 2))));
      nanopascal = get_nPa();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -12.0);
      pPa = times_2(tmp$ret$0_16, div(get_kg(), times_0(get_m(), powExpression(get_s(), 2))));
      picopascal = get_pPa();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -15.0);
      fPa = times_2(tmp$ret$0_17, div(get_kg(), times_0(get_m(), powExpression(get_s(), 2))));
      femtopascal = get_fPa();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -18.0);
      aPa = times_2(tmp$ret$0_18, div(get_kg(), times_0(get_m(), powExpression(get_s(), 2))));
      attopascal = get_aPa();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -21.0);
      zPa = times_2(tmp$ret$0_19, div(get_kg(), times_0(get_m(), powExpression(get_s(), 2))));
      zeptopascal = get_zPa();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -24.0);
      yPa = times_2(tmp$ret$0_20, div(get_kg(), times_0(get_m(), powExpression(get_s(), 2))));
      yoctopascal = get_yPa();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -27.0);
      rPa = times_2(tmp$ret$0_21, div(get_kg(), times_0(get_m(), powExpression(get_s(), 2))));
      rontopascal = get_rPa();
      var tmp$ret$0_22;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_22 = Math.pow(10.0, -30.0);
      qPa = times_2(tmp$ret$0_22, div(get_kg(), times_0(get_m(), powExpression(get_s(), 2))));
      quectopascal = get_qPa();
    }
  }
  function get_formula_12() {
    init_properties_Radian_kt_f7neqv();
    return formula_12;
  }
  var formula_12;
  function get_rad() {
    init_properties_Radian_kt_f7neqv();
    return rad;
  }
  var rad;
  function get_Qrad() {
    init_properties_Radian_kt_f7neqv();
    return Qrad;
  }
  var Qrad;
  function get_quettaradian() {
    init_properties_Radian_kt_f7neqv();
    return quettaradian;
  }
  var quettaradian;
  function get_Rrad() {
    init_properties_Radian_kt_f7neqv();
    return Rrad;
  }
  var Rrad;
  function get_ronnaradian() {
    init_properties_Radian_kt_f7neqv();
    return ronnaradian;
  }
  var ronnaradian;
  function get_Yrad() {
    init_properties_Radian_kt_f7neqv();
    return Yrad;
  }
  var Yrad;
  function get_yottaradian() {
    init_properties_Radian_kt_f7neqv();
    return yottaradian;
  }
  var yottaradian;
  function get_Zrad() {
    init_properties_Radian_kt_f7neqv();
    return Zrad;
  }
  var Zrad;
  function get_zettaradian() {
    init_properties_Radian_kt_f7neqv();
    return zettaradian;
  }
  var zettaradian;
  function get_Erad() {
    init_properties_Radian_kt_f7neqv();
    return Erad;
  }
  var Erad;
  function get_exaradian() {
    init_properties_Radian_kt_f7neqv();
    return exaradian;
  }
  var exaradian;
  function get_Prad() {
    init_properties_Radian_kt_f7neqv();
    return Prad;
  }
  var Prad;
  function get_petaradian() {
    init_properties_Radian_kt_f7neqv();
    return petaradian;
  }
  var petaradian;
  function get_Trad() {
    init_properties_Radian_kt_f7neqv();
    return Trad;
  }
  var Trad;
  function get_teraradian() {
    init_properties_Radian_kt_f7neqv();
    return teraradian;
  }
  var teraradian;
  function get_Grad() {
    init_properties_Radian_kt_f7neqv();
    return Grad;
  }
  var Grad;
  function get_gigaradian() {
    init_properties_Radian_kt_f7neqv();
    return gigaradian;
  }
  var gigaradian;
  function get_Mrad() {
    init_properties_Radian_kt_f7neqv();
    return Mrad;
  }
  var Mrad;
  function get_megaradian() {
    init_properties_Radian_kt_f7neqv();
    return megaradian;
  }
  var megaradian;
  function get_krad() {
    init_properties_Radian_kt_f7neqv();
    return krad;
  }
  var krad;
  function get_kiloradian() {
    init_properties_Radian_kt_f7neqv();
    return kiloradian;
  }
  var kiloradian;
  function get_hrad() {
    init_properties_Radian_kt_f7neqv();
    return hrad;
  }
  var hrad;
  function get_hectoradian() {
    init_properties_Radian_kt_f7neqv();
    return hectoradian;
  }
  var hectoradian;
  function get_darad() {
    init_properties_Radian_kt_f7neqv();
    return darad;
  }
  var darad;
  function get_decaradian() {
    init_properties_Radian_kt_f7neqv();
    return decaradian;
  }
  var decaradian;
  function get_drad() {
    init_properties_Radian_kt_f7neqv();
    return drad;
  }
  var drad;
  function get_deciradian() {
    init_properties_Radian_kt_f7neqv();
    return deciradian;
  }
  var deciradian;
  function get_crad() {
    init_properties_Radian_kt_f7neqv();
    return crad;
  }
  var crad;
  function get_centiradian() {
    init_properties_Radian_kt_f7neqv();
    return centiradian;
  }
  var centiradian;
  function get_mrad() {
    init_properties_Radian_kt_f7neqv();
    return mrad;
  }
  var mrad;
  function get_milliradian() {
    init_properties_Radian_kt_f7neqv();
    return milliradian;
  }
  var milliradian;
  function get_μrad() {
    init_properties_Radian_kt_f7neqv();
    return μrad;
  }
  var μrad;
  function get_microradian() {
    init_properties_Radian_kt_f7neqv();
    return microradian;
  }
  var microradian;
  function get_nrad() {
    init_properties_Radian_kt_f7neqv();
    return nrad;
  }
  var nrad;
  function get_nanoradian() {
    init_properties_Radian_kt_f7neqv();
    return nanoradian;
  }
  var nanoradian;
  function get_prad() {
    init_properties_Radian_kt_f7neqv();
    return prad;
  }
  var prad;
  function get_picoradian() {
    init_properties_Radian_kt_f7neqv();
    return picoradian;
  }
  var picoradian;
  function get_frad() {
    init_properties_Radian_kt_f7neqv();
    return frad;
  }
  var frad;
  function get_femtoradian() {
    init_properties_Radian_kt_f7neqv();
    return femtoradian;
  }
  var femtoradian;
  function get_arad() {
    init_properties_Radian_kt_f7neqv();
    return arad;
  }
  var arad;
  function get_attoradian() {
    init_properties_Radian_kt_f7neqv();
    return attoradian;
  }
  var attoradian;
  function get_zrad() {
    init_properties_Radian_kt_f7neqv();
    return zrad;
  }
  var zrad;
  function get_zeptoradian() {
    init_properties_Radian_kt_f7neqv();
    return zeptoradian;
  }
  var zeptoradian;
  function get_yrad() {
    init_properties_Radian_kt_f7neqv();
    return yrad;
  }
  var yrad;
  function get_yoctoradian() {
    init_properties_Radian_kt_f7neqv();
    return yoctoradian;
  }
  var yoctoradian;
  function get_rrad() {
    init_properties_Radian_kt_f7neqv();
    return rrad;
  }
  var rrad;
  function get_rontoradian() {
    init_properties_Radian_kt_f7neqv();
    return rontoradian;
  }
  var rontoradian;
  function get_qrad() {
    init_properties_Radian_kt_f7neqv();
    return qrad;
  }
  var qrad;
  function get_quectoradian() {
    init_properties_Radian_kt_f7neqv();
    return quectoradian;
  }
  var quectoradian;
  function Radian(value) {
    DerivedUnit.call(this, value, get_formula_12());
  }
  var properties_initialized_Radian_kt_jwgo8t;
  function init_properties_Radian_kt_f7neqv() {
    if (properties_initialized_Radian_kt_jwgo8t) {
    } else {
      properties_initialized_Radian_kt_jwgo8t = true;
      formula_12 = div(get_m(), get_m());
      rad = get_formula_12();
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 30.0);
      Qrad = times_2(tmp$ret$0, div(get_m(), get_m()));
      quettaradian = get_Qrad();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 27.0);
      Rrad = times_2(tmp$ret$0_0, div(get_m(), get_m()));
      ronnaradian = get_Rrad();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 24.0);
      Yrad = times_2(tmp$ret$0_1, div(get_m(), get_m()));
      yottaradian = get_Yrad();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 21.0);
      Zrad = times_2(tmp$ret$0_2, div(get_m(), get_m()));
      zettaradian = get_Zrad();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 18.0);
      Erad = times_2(tmp$ret$0_3, div(get_m(), get_m()));
      exaradian = get_Erad();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 15.0);
      Prad = times_2(tmp$ret$0_4, div(get_m(), get_m()));
      petaradian = get_Prad();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 12.0);
      Trad = times_2(tmp$ret$0_5, div(get_m(), get_m()));
      teraradian = get_Trad();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 9.0);
      Grad = times_2(tmp$ret$0_6, div(get_m(), get_m()));
      gigaradian = get_Grad();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 6.0);
      Mrad = times_2(tmp$ret$0_7, div(get_m(), get_m()));
      megaradian = get_Mrad();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, 3.0);
      krad = times_2(tmp$ret$0_8, div(get_m(), get_m()));
      kiloradian = get_krad();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, 2.0);
      hrad = times_2(tmp$ret$0_9, div(get_m(), get_m()));
      hectoradian = get_hrad();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, 1.0);
      darad = times_2(tmp$ret$0_10, div(get_m(), get_m()));
      decaradian = get_darad();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -1.0);
      drad = times_2(tmp$ret$0_11, div(get_m(), get_m()));
      deciradian = get_drad();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -2.0);
      crad = times_2(tmp$ret$0_12, div(get_m(), get_m()));
      centiradian = get_crad();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -3.0);
      mrad = times_2(tmp$ret$0_13, div(get_m(), get_m()));
      milliradian = get_mrad();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -6.0);
      μrad = times_2(tmp$ret$0_14, div(get_m(), get_m()));
      microradian = get_μrad();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -9.0);
      nrad = times_2(tmp$ret$0_15, div(get_m(), get_m()));
      nanoradian = get_nrad();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -12.0);
      prad = times_2(tmp$ret$0_16, div(get_m(), get_m()));
      picoradian = get_prad();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -15.0);
      frad = times_2(tmp$ret$0_17, div(get_m(), get_m()));
      femtoradian = get_frad();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -18.0);
      arad = times_2(tmp$ret$0_18, div(get_m(), get_m()));
      attoradian = get_arad();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -21.0);
      zrad = times_2(tmp$ret$0_19, div(get_m(), get_m()));
      zeptoradian = get_zrad();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -24.0);
      yrad = times_2(tmp$ret$0_20, div(get_m(), get_m()));
      yoctoradian = get_yrad();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -27.0);
      rrad = times_2(tmp$ret$0_21, div(get_m(), get_m()));
      rontoradian = get_rrad();
      var tmp$ret$0_22;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_22 = Math.pow(10.0, -30.0);
      qrad = times_2(tmp$ret$0_22, div(get_m(), get_m()));
      quectoradian = get_qrad();
    }
  }
  function get_formula_13() {
    init_properties_Siemens_kt_erjjt4();
    return formula_13;
  }
  var formula_13;
  function get_S() {
    init_properties_Siemens_kt_erjjt4();
    return S;
  }
  var S;
  function get_QS() {
    init_properties_Siemens_kt_erjjt4();
    return QS;
  }
  var QS;
  function get_quettasiemens() {
    init_properties_Siemens_kt_erjjt4();
    return quettasiemens;
  }
  var quettasiemens;
  function get_RS() {
    init_properties_Siemens_kt_erjjt4();
    return RS;
  }
  var RS;
  function get_ronnasiemens() {
    init_properties_Siemens_kt_erjjt4();
    return ronnasiemens;
  }
  var ronnasiemens;
  function get_YS() {
    init_properties_Siemens_kt_erjjt4();
    return YS;
  }
  var YS;
  function get_yottasiemens() {
    init_properties_Siemens_kt_erjjt4();
    return yottasiemens;
  }
  var yottasiemens;
  function get_ZS() {
    init_properties_Siemens_kt_erjjt4();
    return ZS;
  }
  var ZS;
  function get_zettasiemens() {
    init_properties_Siemens_kt_erjjt4();
    return zettasiemens;
  }
  var zettasiemens;
  function get_ES() {
    init_properties_Siemens_kt_erjjt4();
    return ES;
  }
  var ES;
  function get_exasiemens() {
    init_properties_Siemens_kt_erjjt4();
    return exasiemens;
  }
  var exasiemens;
  function get_PS() {
    init_properties_Siemens_kt_erjjt4();
    return PS;
  }
  var PS;
  function get_petasiemens() {
    init_properties_Siemens_kt_erjjt4();
    return petasiemens;
  }
  var petasiemens;
  function get_TS() {
    init_properties_Siemens_kt_erjjt4();
    return TS;
  }
  var TS;
  function get_terasiemens() {
    init_properties_Siemens_kt_erjjt4();
    return terasiemens;
  }
  var terasiemens;
  function get_GS() {
    init_properties_Siemens_kt_erjjt4();
    return GS;
  }
  var GS;
  function get_gigasiemens() {
    init_properties_Siemens_kt_erjjt4();
    return gigasiemens;
  }
  var gigasiemens;
  function get_MS() {
    init_properties_Siemens_kt_erjjt4();
    return MS;
  }
  var MS;
  function get_megasiemens() {
    init_properties_Siemens_kt_erjjt4();
    return megasiemens;
  }
  var megasiemens;
  function get_kS() {
    init_properties_Siemens_kt_erjjt4();
    return kS;
  }
  var kS;
  function get_kilosiemens() {
    init_properties_Siemens_kt_erjjt4();
    return kilosiemens;
  }
  var kilosiemens;
  function get_hS() {
    init_properties_Siemens_kt_erjjt4();
    return hS;
  }
  var hS;
  function get_hectosiemens() {
    init_properties_Siemens_kt_erjjt4();
    return hectosiemens;
  }
  var hectosiemens;
  function get_daS() {
    init_properties_Siemens_kt_erjjt4();
    return daS;
  }
  var daS;
  function get_decasiemens() {
    init_properties_Siemens_kt_erjjt4();
    return decasiemens;
  }
  var decasiemens;
  function get_dS() {
    init_properties_Siemens_kt_erjjt4();
    return dS;
  }
  var dS;
  function get_decisiemens() {
    init_properties_Siemens_kt_erjjt4();
    return decisiemens;
  }
  var decisiemens;
  function get_cS() {
    init_properties_Siemens_kt_erjjt4();
    return cS;
  }
  var cS;
  function get_centisiemens() {
    init_properties_Siemens_kt_erjjt4();
    return centisiemens;
  }
  var centisiemens;
  function get_mS() {
    init_properties_Siemens_kt_erjjt4();
    return mS;
  }
  var mS;
  function get_millisiemens() {
    init_properties_Siemens_kt_erjjt4();
    return millisiemens;
  }
  var millisiemens;
  function get_μS() {
    init_properties_Siemens_kt_erjjt4();
    return μS;
  }
  var μS;
  function get_microsiemens() {
    init_properties_Siemens_kt_erjjt4();
    return microsiemens;
  }
  var microsiemens;
  function get_nS() {
    init_properties_Siemens_kt_erjjt4();
    return nS;
  }
  var nS;
  function get_nanosiemens() {
    init_properties_Siemens_kt_erjjt4();
    return nanosiemens;
  }
  var nanosiemens;
  function get_pS() {
    init_properties_Siemens_kt_erjjt4();
    return pS;
  }
  var pS;
  function get_picosiemens() {
    init_properties_Siemens_kt_erjjt4();
    return picosiemens;
  }
  var picosiemens;
  function get_fS() {
    init_properties_Siemens_kt_erjjt4();
    return fS;
  }
  var fS;
  function get_femtosiemens() {
    init_properties_Siemens_kt_erjjt4();
    return femtosiemens;
  }
  var femtosiemens;
  function get_aS() {
    init_properties_Siemens_kt_erjjt4();
    return aS;
  }
  var aS;
  function get_attosiemens() {
    init_properties_Siemens_kt_erjjt4();
    return attosiemens;
  }
  var attosiemens;
  function get_zS() {
    init_properties_Siemens_kt_erjjt4();
    return zS;
  }
  var zS;
  function get_zeptosiemens() {
    init_properties_Siemens_kt_erjjt4();
    return zeptosiemens;
  }
  var zeptosiemens;
  function get_yS() {
    init_properties_Siemens_kt_erjjt4();
    return yS;
  }
  var yS;
  function get_yoctosiemens() {
    init_properties_Siemens_kt_erjjt4();
    return yoctosiemens;
  }
  var yoctosiemens;
  function get_rS() {
    init_properties_Siemens_kt_erjjt4();
    return rS;
  }
  var rS;
  function get_rontosiemens() {
    init_properties_Siemens_kt_erjjt4();
    return rontosiemens;
  }
  var rontosiemens;
  function get_qS() {
    init_properties_Siemens_kt_erjjt4();
    return qS;
  }
  var qS;
  function get_quectosiemens() {
    init_properties_Siemens_kt_erjjt4();
    return quectosiemens;
  }
  var quectosiemens;
  function Siemens(value) {
    DerivedUnit.call(this, value, get_formula_13());
  }
  var properties_initialized_Siemens_kt_x6qr30;
  function init_properties_Siemens_kt_erjjt4() {
    if (properties_initialized_Siemens_kt_x6qr30) {
    } else {
      properties_initialized_Siemens_kt_x6qr30 = true;
      formula_13 = times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 3)), powExpression(get_A(), 2));
      S = get_formula_13();
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 30.0);
      QS = times_2(tmp$ret$0, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 3)), powExpression(get_A(), 2)));
      quettasiemens = get_QS();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 27.0);
      RS = times_2(tmp$ret$0_0, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 3)), powExpression(get_A(), 2)));
      ronnasiemens = get_RS();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 24.0);
      YS = times_2(tmp$ret$0_1, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 3)), powExpression(get_A(), 2)));
      yottasiemens = get_YS();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 21.0);
      ZS = times_2(tmp$ret$0_2, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 3)), powExpression(get_A(), 2)));
      zettasiemens = get_ZS();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 18.0);
      ES = times_2(tmp$ret$0_3, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 3)), powExpression(get_A(), 2)));
      exasiemens = get_ES();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 15.0);
      PS = times_2(tmp$ret$0_4, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 3)), powExpression(get_A(), 2)));
      petasiemens = get_PS();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 12.0);
      TS = times_2(tmp$ret$0_5, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 3)), powExpression(get_A(), 2)));
      terasiemens = get_TS();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 9.0);
      GS = times_2(tmp$ret$0_6, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 3)), powExpression(get_A(), 2)));
      gigasiemens = get_GS();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 6.0);
      MS = times_2(tmp$ret$0_7, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 3)), powExpression(get_A(), 2)));
      megasiemens = get_MS();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, 3.0);
      kS = times_2(tmp$ret$0_8, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 3)), powExpression(get_A(), 2)));
      kilosiemens = get_kS();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, 2.0);
      hS = times_2(tmp$ret$0_9, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 3)), powExpression(get_A(), 2)));
      hectosiemens = get_hS();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, 1.0);
      daS = times_2(tmp$ret$0_10, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 3)), powExpression(get_A(), 2)));
      decasiemens = get_daS();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -1.0);
      dS = times_2(tmp$ret$0_11, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 3)), powExpression(get_A(), 2)));
      decisiemens = get_dS();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -2.0);
      cS = times_2(tmp$ret$0_12, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 3)), powExpression(get_A(), 2)));
      centisiemens = get_cS();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -3.0);
      mS = times_2(tmp$ret$0_13, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 3)), powExpression(get_A(), 2)));
      millisiemens = get_mS();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -6.0);
      μS = times_2(tmp$ret$0_14, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 3)), powExpression(get_A(), 2)));
      microsiemens = get_μS();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -9.0);
      nS = times_2(tmp$ret$0_15, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 3)), powExpression(get_A(), 2)));
      nanosiemens = get_nS();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -12.0);
      pS = times_2(tmp$ret$0_16, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 3)), powExpression(get_A(), 2)));
      picosiemens = get_pS();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -15.0);
      fS = times_2(tmp$ret$0_17, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 3)), powExpression(get_A(), 2)));
      femtosiemens = get_fS();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -18.0);
      aS = times_2(tmp$ret$0_18, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 3)), powExpression(get_A(), 2)));
      attosiemens = get_aS();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -21.0);
      zS = times_2(tmp$ret$0_19, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 3)), powExpression(get_A(), 2)));
      zeptosiemens = get_zS();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -24.0);
      yS = times_2(tmp$ret$0_20, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 3)), powExpression(get_A(), 2)));
      yoctosiemens = get_yS();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -27.0);
      rS = times_2(tmp$ret$0_21, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 3)), powExpression(get_A(), 2)));
      rontosiemens = get_rS();
      var tmp$ret$0_22;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_22 = Math.pow(10.0, -30.0);
      qS = times_2(tmp$ret$0_22, times_0(times_0(times_0(powExpression(get_kg(), -1), powExpression(get_m(), -2)), powExpression(get_s(), 3)), powExpression(get_A(), 2)));
      quectosiemens = get_qS();
    }
  }
  function get_formula_14() {
    init_properties_Sievert_kt_4v3t84();
    return formula_14;
  }
  var formula_14;
  function get_Sv() {
    init_properties_Sievert_kt_4v3t84();
    return Sv;
  }
  var Sv;
  function get_QSv() {
    init_properties_Sievert_kt_4v3t84();
    return QSv;
  }
  var QSv;
  function get_quettasievert() {
    init_properties_Sievert_kt_4v3t84();
    return quettasievert;
  }
  var quettasievert;
  function get_RSv() {
    init_properties_Sievert_kt_4v3t84();
    return RSv;
  }
  var RSv;
  function get_ronnasievert() {
    init_properties_Sievert_kt_4v3t84();
    return ronnasievert;
  }
  var ronnasievert;
  function get_YSv() {
    init_properties_Sievert_kt_4v3t84();
    return YSv;
  }
  var YSv;
  function get_yottasievert() {
    init_properties_Sievert_kt_4v3t84();
    return yottasievert;
  }
  var yottasievert;
  function get_ZSv() {
    init_properties_Sievert_kt_4v3t84();
    return ZSv;
  }
  var ZSv;
  function get_zettasievert() {
    init_properties_Sievert_kt_4v3t84();
    return zettasievert;
  }
  var zettasievert;
  function get_ESv() {
    init_properties_Sievert_kt_4v3t84();
    return ESv;
  }
  var ESv;
  function get_exasievert() {
    init_properties_Sievert_kt_4v3t84();
    return exasievert;
  }
  var exasievert;
  function get_PSv() {
    init_properties_Sievert_kt_4v3t84();
    return PSv;
  }
  var PSv;
  function get_petasievert() {
    init_properties_Sievert_kt_4v3t84();
    return petasievert;
  }
  var petasievert;
  function get_TSv() {
    init_properties_Sievert_kt_4v3t84();
    return TSv;
  }
  var TSv;
  function get_terasievert() {
    init_properties_Sievert_kt_4v3t84();
    return terasievert;
  }
  var terasievert;
  function get_GSv() {
    init_properties_Sievert_kt_4v3t84();
    return GSv;
  }
  var GSv;
  function get_gigasievert() {
    init_properties_Sievert_kt_4v3t84();
    return gigasievert;
  }
  var gigasievert;
  function get_MSv() {
    init_properties_Sievert_kt_4v3t84();
    return MSv;
  }
  var MSv;
  function get_megasievert() {
    init_properties_Sievert_kt_4v3t84();
    return megasievert;
  }
  var megasievert;
  function get_kSv() {
    init_properties_Sievert_kt_4v3t84();
    return kSv;
  }
  var kSv;
  function get_kilosievert() {
    init_properties_Sievert_kt_4v3t84();
    return kilosievert;
  }
  var kilosievert;
  function get_hSv() {
    init_properties_Sievert_kt_4v3t84();
    return hSv;
  }
  var hSv;
  function get_hectosievert() {
    init_properties_Sievert_kt_4v3t84();
    return hectosievert;
  }
  var hectosievert;
  function get_daSv() {
    init_properties_Sievert_kt_4v3t84();
    return daSv;
  }
  var daSv;
  function get_decasievert() {
    init_properties_Sievert_kt_4v3t84();
    return decasievert;
  }
  var decasievert;
  function get_dSv() {
    init_properties_Sievert_kt_4v3t84();
    return dSv;
  }
  var dSv;
  function get_decisievert() {
    init_properties_Sievert_kt_4v3t84();
    return decisievert;
  }
  var decisievert;
  function get_cSv() {
    init_properties_Sievert_kt_4v3t84();
    return cSv;
  }
  var cSv;
  function get_centisievert() {
    init_properties_Sievert_kt_4v3t84();
    return centisievert;
  }
  var centisievert;
  function get_mSv() {
    init_properties_Sievert_kt_4v3t84();
    return mSv;
  }
  var mSv;
  function get_millisievert() {
    init_properties_Sievert_kt_4v3t84();
    return millisievert;
  }
  var millisievert;
  function get_μSv() {
    init_properties_Sievert_kt_4v3t84();
    return μSv;
  }
  var μSv;
  function get_microsievert() {
    init_properties_Sievert_kt_4v3t84();
    return microsievert;
  }
  var microsievert;
  function get_nSv() {
    init_properties_Sievert_kt_4v3t84();
    return nSv;
  }
  var nSv;
  function get_nanosievert() {
    init_properties_Sievert_kt_4v3t84();
    return nanosievert;
  }
  var nanosievert;
  function get_pSv() {
    init_properties_Sievert_kt_4v3t84();
    return pSv;
  }
  var pSv;
  function get_picosievert() {
    init_properties_Sievert_kt_4v3t84();
    return picosievert;
  }
  var picosievert;
  function get_fSv() {
    init_properties_Sievert_kt_4v3t84();
    return fSv;
  }
  var fSv;
  function get_femtosievert() {
    init_properties_Sievert_kt_4v3t84();
    return femtosievert;
  }
  var femtosievert;
  function get_aSv() {
    init_properties_Sievert_kt_4v3t84();
    return aSv;
  }
  var aSv;
  function get_attosievert() {
    init_properties_Sievert_kt_4v3t84();
    return attosievert;
  }
  var attosievert;
  function get_zSv() {
    init_properties_Sievert_kt_4v3t84();
    return zSv;
  }
  var zSv;
  function get_zeptosievert() {
    init_properties_Sievert_kt_4v3t84();
    return zeptosievert;
  }
  var zeptosievert;
  function get_ySv() {
    init_properties_Sievert_kt_4v3t84();
    return ySv;
  }
  var ySv;
  function get_yoctosievert() {
    init_properties_Sievert_kt_4v3t84();
    return yoctosievert;
  }
  var yoctosievert;
  function get_rSv() {
    init_properties_Sievert_kt_4v3t84();
    return rSv;
  }
  var rSv;
  function get_rontosievert() {
    init_properties_Sievert_kt_4v3t84();
    return rontosievert;
  }
  var rontosievert;
  function get_qSv() {
    init_properties_Sievert_kt_4v3t84();
    return qSv;
  }
  var qSv;
  function get_quectosievert() {
    init_properties_Sievert_kt_4v3t84();
    return quectosievert;
  }
  var quectosievert;
  function Sievert(value) {
    DerivedUnit.call(this, value, get_formula_14());
  }
  var properties_initialized_Sievert_kt_rxxkb4;
  function init_properties_Sievert_kt_4v3t84() {
    if (properties_initialized_Sievert_kt_rxxkb4) {
    } else {
      properties_initialized_Sievert_kt_rxxkb4 = true;
      formula_14 = times_0(get_m2(), powExpression(get_s(), -2));
      Sv = get_formula_14();
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 30.0);
      QSv = times_2(tmp$ret$0, times_0(get_m2(), powExpression(get_s(), -2)));
      quettasievert = get_QSv();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 27.0);
      RSv = times_2(tmp$ret$0_0, times_0(get_m2(), powExpression(get_s(), -2)));
      ronnasievert = get_RSv();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 24.0);
      YSv = times_2(tmp$ret$0_1, times_0(get_m2(), powExpression(get_s(), -2)));
      yottasievert = get_YSv();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 21.0);
      ZSv = times_2(tmp$ret$0_2, times_0(get_m2(), powExpression(get_s(), -2)));
      zettasievert = get_ZSv();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 18.0);
      ESv = times_2(tmp$ret$0_3, times_0(get_m2(), powExpression(get_s(), -2)));
      exasievert = get_ESv();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 15.0);
      PSv = times_2(tmp$ret$0_4, times_0(get_m2(), powExpression(get_s(), -2)));
      petasievert = get_PSv();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 12.0);
      TSv = times_2(tmp$ret$0_5, times_0(get_m2(), powExpression(get_s(), -2)));
      terasievert = get_TSv();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 9.0);
      GSv = times_2(tmp$ret$0_6, times_0(get_m2(), powExpression(get_s(), -2)));
      gigasievert = get_GSv();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 6.0);
      MSv = times_2(tmp$ret$0_7, times_0(get_m2(), powExpression(get_s(), -2)));
      megasievert = get_MSv();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, 3.0);
      kSv = times_2(tmp$ret$0_8, times_0(get_m2(), powExpression(get_s(), -2)));
      kilosievert = get_kSv();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, 2.0);
      hSv = times_2(tmp$ret$0_9, times_0(get_m2(), powExpression(get_s(), -2)));
      hectosievert = get_hSv();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, 1.0);
      daSv = times_2(tmp$ret$0_10, times_0(get_m2(), powExpression(get_s(), -2)));
      decasievert = get_daSv();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -1.0);
      dSv = times_2(tmp$ret$0_11, times_0(get_m2(), powExpression(get_s(), -2)));
      decisievert = get_dSv();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -2.0);
      cSv = times_2(tmp$ret$0_12, times_0(get_m2(), powExpression(get_s(), -2)));
      centisievert = get_cSv();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -3.0);
      mSv = times_2(tmp$ret$0_13, times_0(get_m2(), powExpression(get_s(), -2)));
      millisievert = get_mSv();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -6.0);
      μSv = times_2(tmp$ret$0_14, times_0(get_m2(), powExpression(get_s(), -2)));
      microsievert = get_μSv();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -9.0);
      nSv = times_2(tmp$ret$0_15, times_0(get_m2(), powExpression(get_s(), -2)));
      nanosievert = get_nSv();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -12.0);
      pSv = times_2(tmp$ret$0_16, times_0(get_m2(), powExpression(get_s(), -2)));
      picosievert = get_pSv();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -15.0);
      fSv = times_2(tmp$ret$0_17, times_0(get_m2(), powExpression(get_s(), -2)));
      femtosievert = get_fSv();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -18.0);
      aSv = times_2(tmp$ret$0_18, times_0(get_m2(), powExpression(get_s(), -2)));
      attosievert = get_aSv();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -21.0);
      zSv = times_2(tmp$ret$0_19, times_0(get_m2(), powExpression(get_s(), -2)));
      zeptosievert = get_zSv();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -24.0);
      ySv = times_2(tmp$ret$0_20, times_0(get_m2(), powExpression(get_s(), -2)));
      yoctosievert = get_ySv();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -27.0);
      rSv = times_2(tmp$ret$0_21, times_0(get_m2(), powExpression(get_s(), -2)));
      rontosievert = get_rSv();
      var tmp$ret$0_22;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_22 = Math.pow(10.0, -30.0);
      qSv = times_2(tmp$ret$0_22, times_0(get_m2(), powExpression(get_s(), -2)));
      quectosievert = get_qSv();
    }
  }
  function get_formula_15() {
    init_properties_Steradian_kt_m0qgen();
    return formula_15;
  }
  var formula_15;
  function get_sr() {
    init_properties_Steradian_kt_m0qgen();
    return sr;
  }
  var sr;
  function get_Qsr() {
    init_properties_Steradian_kt_m0qgen();
    return Qsr;
  }
  var Qsr;
  function get_quettasteradian() {
    init_properties_Steradian_kt_m0qgen();
    return quettasteradian;
  }
  var quettasteradian;
  function get_Rsr() {
    init_properties_Steradian_kt_m0qgen();
    return Rsr;
  }
  var Rsr;
  function get_ronnasteradian() {
    init_properties_Steradian_kt_m0qgen();
    return ronnasteradian;
  }
  var ronnasteradian;
  function get_Ysr() {
    init_properties_Steradian_kt_m0qgen();
    return Ysr;
  }
  var Ysr;
  function get_yottasteradian() {
    init_properties_Steradian_kt_m0qgen();
    return yottasteradian;
  }
  var yottasteradian;
  function get_Zsr() {
    init_properties_Steradian_kt_m0qgen();
    return Zsr;
  }
  var Zsr;
  function get_zettasteradian() {
    init_properties_Steradian_kt_m0qgen();
    return zettasteradian;
  }
  var zettasteradian;
  function get_Esr() {
    init_properties_Steradian_kt_m0qgen();
    return Esr;
  }
  var Esr;
  function get_exasteradian() {
    init_properties_Steradian_kt_m0qgen();
    return exasteradian;
  }
  var exasteradian;
  function get_Psr() {
    init_properties_Steradian_kt_m0qgen();
    return Psr;
  }
  var Psr;
  function get_petasteradian() {
    init_properties_Steradian_kt_m0qgen();
    return petasteradian;
  }
  var petasteradian;
  function get_Tsr() {
    init_properties_Steradian_kt_m0qgen();
    return Tsr;
  }
  var Tsr;
  function get_terasteradian() {
    init_properties_Steradian_kt_m0qgen();
    return terasteradian;
  }
  var terasteradian;
  function get_Gsr() {
    init_properties_Steradian_kt_m0qgen();
    return Gsr;
  }
  var Gsr;
  function get_gigasteradian() {
    init_properties_Steradian_kt_m0qgen();
    return gigasteradian;
  }
  var gigasteradian;
  function get_Msr() {
    init_properties_Steradian_kt_m0qgen();
    return Msr;
  }
  var Msr;
  function get_megasteradian() {
    init_properties_Steradian_kt_m0qgen();
    return megasteradian;
  }
  var megasteradian;
  function get_ksr() {
    init_properties_Steradian_kt_m0qgen();
    return ksr;
  }
  var ksr;
  function get_kilosteradian() {
    init_properties_Steradian_kt_m0qgen();
    return kilosteradian;
  }
  var kilosteradian;
  function get_hsr() {
    init_properties_Steradian_kt_m0qgen();
    return hsr;
  }
  var hsr;
  function get_hectosteradian() {
    init_properties_Steradian_kt_m0qgen();
    return hectosteradian;
  }
  var hectosteradian;
  function get_dasr() {
    init_properties_Steradian_kt_m0qgen();
    return dasr;
  }
  var dasr;
  function get_decasteradian() {
    init_properties_Steradian_kt_m0qgen();
    return decasteradian;
  }
  var decasteradian;
  function get_dsr() {
    init_properties_Steradian_kt_m0qgen();
    return dsr;
  }
  var dsr;
  function get_decisteradian() {
    init_properties_Steradian_kt_m0qgen();
    return decisteradian;
  }
  var decisteradian;
  function get_csr() {
    init_properties_Steradian_kt_m0qgen();
    return csr;
  }
  var csr;
  function get_centisteradian() {
    init_properties_Steradian_kt_m0qgen();
    return centisteradian;
  }
  var centisteradian;
  function get_msr() {
    init_properties_Steradian_kt_m0qgen();
    return msr;
  }
  var msr;
  function get_millisteradian() {
    init_properties_Steradian_kt_m0qgen();
    return millisteradian;
  }
  var millisteradian;
  function get_μsr() {
    init_properties_Steradian_kt_m0qgen();
    return μsr;
  }
  var μsr;
  function get_microsteradian() {
    init_properties_Steradian_kt_m0qgen();
    return microsteradian;
  }
  var microsteradian;
  function get_nsr() {
    init_properties_Steradian_kt_m0qgen();
    return nsr;
  }
  var nsr;
  function get_nanosteradian() {
    init_properties_Steradian_kt_m0qgen();
    return nanosteradian;
  }
  var nanosteradian;
  function get_psr() {
    init_properties_Steradian_kt_m0qgen();
    return psr;
  }
  var psr;
  function get_picosteradian() {
    init_properties_Steradian_kt_m0qgen();
    return picosteradian;
  }
  var picosteradian;
  function get_fsr() {
    init_properties_Steradian_kt_m0qgen();
    return fsr;
  }
  var fsr;
  function get_femtosteradian() {
    init_properties_Steradian_kt_m0qgen();
    return femtosteradian;
  }
  var femtosteradian;
  function get_asr() {
    init_properties_Steradian_kt_m0qgen();
    return asr;
  }
  var asr;
  function get_attosteradian() {
    init_properties_Steradian_kt_m0qgen();
    return attosteradian;
  }
  var attosteradian;
  function get_zsr() {
    init_properties_Steradian_kt_m0qgen();
    return zsr;
  }
  var zsr;
  function get_zeptosteradian() {
    init_properties_Steradian_kt_m0qgen();
    return zeptosteradian;
  }
  var zeptosteradian;
  function get_ysr() {
    init_properties_Steradian_kt_m0qgen();
    return ysr;
  }
  var ysr;
  function get_yoctosteradian() {
    init_properties_Steradian_kt_m0qgen();
    return yoctosteradian;
  }
  var yoctosteradian;
  function get_rsr() {
    init_properties_Steradian_kt_m0qgen();
    return rsr;
  }
  var rsr;
  function get_rontosteradian() {
    init_properties_Steradian_kt_m0qgen();
    return rontosteradian;
  }
  var rontosteradian;
  function get_qsr() {
    init_properties_Steradian_kt_m0qgen();
    return qsr;
  }
  var qsr;
  function get_quectosteradian() {
    init_properties_Steradian_kt_m0qgen();
    return quectosteradian;
  }
  var quectosteradian;
  function Steradian(value) {
    DerivedUnit.call(this, value, get_formula_15());
  }
  var properties_initialized_Steradian_kt_w7aqs5;
  function init_properties_Steradian_kt_m0qgen() {
    if (properties_initialized_Steradian_kt_w7aqs5) {
    } else {
      properties_initialized_Steradian_kt_w7aqs5 = true;
      formula_15 = div(get_m2(), get_m2());
      sr = get_formula_15();
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 30.0);
      Qsr = times_2(tmp$ret$0, div(get_m2(), get_m2()));
      quettasteradian = get_Qsr();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 27.0);
      Rsr = times_2(tmp$ret$0_0, div(get_m2(), get_m2()));
      ronnasteradian = get_Rsr();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 24.0);
      Ysr = times_2(tmp$ret$0_1, div(get_m2(), get_m2()));
      yottasteradian = get_Ysr();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 21.0);
      Zsr = times_2(tmp$ret$0_2, div(get_m2(), get_m2()));
      zettasteradian = get_Zsr();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 18.0);
      Esr = times_2(tmp$ret$0_3, div(get_m2(), get_m2()));
      exasteradian = get_Esr();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 15.0);
      Psr = times_2(tmp$ret$0_4, div(get_m2(), get_m2()));
      petasteradian = get_Psr();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 12.0);
      Tsr = times_2(tmp$ret$0_5, div(get_m2(), get_m2()));
      terasteradian = get_Tsr();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 9.0);
      Gsr = times_2(tmp$ret$0_6, div(get_m2(), get_m2()));
      gigasteradian = get_Gsr();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 6.0);
      Msr = times_2(tmp$ret$0_7, div(get_m2(), get_m2()));
      megasteradian = get_Msr();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, 3.0);
      ksr = times_2(tmp$ret$0_8, div(get_m2(), get_m2()));
      kilosteradian = get_ksr();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, 2.0);
      hsr = times_2(tmp$ret$0_9, div(get_m2(), get_m2()));
      hectosteradian = get_hsr();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, 1.0);
      dasr = times_2(tmp$ret$0_10, div(get_m2(), get_m2()));
      decasteradian = get_dasr();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -1.0);
      dsr = times_2(tmp$ret$0_11, div(get_m2(), get_m2()));
      decisteradian = get_dsr();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -2.0);
      csr = times_2(tmp$ret$0_12, div(get_m2(), get_m2()));
      centisteradian = get_csr();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -3.0);
      msr = times_2(tmp$ret$0_13, div(get_m2(), get_m2()));
      millisteradian = get_msr();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -6.0);
      μsr = times_2(tmp$ret$0_14, div(get_m2(), get_m2()));
      microsteradian = get_μsr();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -9.0);
      nsr = times_2(tmp$ret$0_15, div(get_m2(), get_m2()));
      nanosteradian = get_nsr();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -12.0);
      psr = times_2(tmp$ret$0_16, div(get_m2(), get_m2()));
      picosteradian = get_psr();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -15.0);
      fsr = times_2(tmp$ret$0_17, div(get_m2(), get_m2()));
      femtosteradian = get_fsr();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -18.0);
      asr = times_2(tmp$ret$0_18, div(get_m2(), get_m2()));
      attosteradian = get_asr();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -21.0);
      zsr = times_2(tmp$ret$0_19, div(get_m2(), get_m2()));
      zeptosteradian = get_zsr();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -24.0);
      ysr = times_2(tmp$ret$0_20, div(get_m2(), get_m2()));
      yoctosteradian = get_ysr();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -27.0);
      rsr = times_2(tmp$ret$0_21, div(get_m2(), get_m2()));
      rontosteradian = get_rsr();
      var tmp$ret$0_22;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_22 = Math.pow(10.0, -30.0);
      qsr = times_2(tmp$ret$0_22, div(get_m2(), get_m2()));
      quectosteradian = get_qsr();
    }
  }
  function get_formula_16() {
    init_properties_Tesla_kt_jwis59();
    return formula_16;
  }
  var formula_16;
  function get_T() {
    init_properties_Tesla_kt_jwis59();
    return T;
  }
  var T;
  function get_QT() {
    init_properties_Tesla_kt_jwis59();
    return QT;
  }
  var QT;
  function get_quettatesla() {
    init_properties_Tesla_kt_jwis59();
    return quettatesla;
  }
  var quettatesla;
  function get_RT() {
    init_properties_Tesla_kt_jwis59();
    return RT;
  }
  var RT;
  function get_ronnatesla() {
    init_properties_Tesla_kt_jwis59();
    return ronnatesla;
  }
  var ronnatesla;
  function get_YT() {
    init_properties_Tesla_kt_jwis59();
    return YT;
  }
  var YT;
  function get_yottatesla() {
    init_properties_Tesla_kt_jwis59();
    return yottatesla;
  }
  var yottatesla;
  function get_ZT() {
    init_properties_Tesla_kt_jwis59();
    return ZT;
  }
  var ZT;
  function get_zettatesla() {
    init_properties_Tesla_kt_jwis59();
    return zettatesla;
  }
  var zettatesla;
  function get_ET() {
    init_properties_Tesla_kt_jwis59();
    return ET;
  }
  var ET;
  function get_exatesla() {
    init_properties_Tesla_kt_jwis59();
    return exatesla;
  }
  var exatesla;
  function get_PT() {
    init_properties_Tesla_kt_jwis59();
    return PT;
  }
  var PT;
  function get_petatesla() {
    init_properties_Tesla_kt_jwis59();
    return petatesla;
  }
  var petatesla;
  function get_TT() {
    init_properties_Tesla_kt_jwis59();
    return TT;
  }
  var TT;
  function get_teratesla() {
    init_properties_Tesla_kt_jwis59();
    return teratesla;
  }
  var teratesla;
  function get_GT() {
    init_properties_Tesla_kt_jwis59();
    return GT;
  }
  var GT;
  function get_gigatesla() {
    init_properties_Tesla_kt_jwis59();
    return gigatesla;
  }
  var gigatesla;
  function get_MT() {
    init_properties_Tesla_kt_jwis59();
    return MT;
  }
  var MT;
  function get_megatesla() {
    init_properties_Tesla_kt_jwis59();
    return megatesla;
  }
  var megatesla;
  function get_kT() {
    init_properties_Tesla_kt_jwis59();
    return kT;
  }
  var kT;
  function get_kilotesla() {
    init_properties_Tesla_kt_jwis59();
    return kilotesla;
  }
  var kilotesla;
  function get_hT() {
    init_properties_Tesla_kt_jwis59();
    return hT;
  }
  var hT;
  function get_hectotesla() {
    init_properties_Tesla_kt_jwis59();
    return hectotesla;
  }
  var hectotesla;
  function get_daT() {
    init_properties_Tesla_kt_jwis59();
    return daT;
  }
  var daT;
  function get_decatesla() {
    init_properties_Tesla_kt_jwis59();
    return decatesla;
  }
  var decatesla;
  function get_dT() {
    init_properties_Tesla_kt_jwis59();
    return dT;
  }
  var dT;
  function get_decitesla() {
    init_properties_Tesla_kt_jwis59();
    return decitesla;
  }
  var decitesla;
  function get_cT() {
    init_properties_Tesla_kt_jwis59();
    return cT;
  }
  var cT;
  function get_centitesla() {
    init_properties_Tesla_kt_jwis59();
    return centitesla;
  }
  var centitesla;
  function get_mT() {
    init_properties_Tesla_kt_jwis59();
    return mT;
  }
  var mT;
  function get_millitesla() {
    init_properties_Tesla_kt_jwis59();
    return millitesla;
  }
  var millitesla;
  function get_μT() {
    init_properties_Tesla_kt_jwis59();
    return μT;
  }
  var μT;
  function get_microtesla() {
    init_properties_Tesla_kt_jwis59();
    return microtesla;
  }
  var microtesla;
  function get_nT() {
    init_properties_Tesla_kt_jwis59();
    return nT;
  }
  var nT;
  function get_nanotesla() {
    init_properties_Tesla_kt_jwis59();
    return nanotesla;
  }
  var nanotesla;
  function get_pT() {
    init_properties_Tesla_kt_jwis59();
    return pT;
  }
  var pT;
  function get_picotesla() {
    init_properties_Tesla_kt_jwis59();
    return picotesla;
  }
  var picotesla;
  function get_fT() {
    init_properties_Tesla_kt_jwis59();
    return fT;
  }
  var fT;
  function get_femtotesla() {
    init_properties_Tesla_kt_jwis59();
    return femtotesla;
  }
  var femtotesla;
  function get_aT() {
    init_properties_Tesla_kt_jwis59();
    return aT;
  }
  var aT;
  function get_attotesla() {
    init_properties_Tesla_kt_jwis59();
    return attotesla;
  }
  var attotesla;
  function get_zT() {
    init_properties_Tesla_kt_jwis59();
    return zT;
  }
  var zT;
  function get_zeptotesla() {
    init_properties_Tesla_kt_jwis59();
    return zeptotesla;
  }
  var zeptotesla;
  function get_yT() {
    init_properties_Tesla_kt_jwis59();
    return yT;
  }
  var yT;
  function get_yoctotesla() {
    init_properties_Tesla_kt_jwis59();
    return yoctotesla;
  }
  var yoctotesla;
  function get_rT() {
    init_properties_Tesla_kt_jwis59();
    return rT;
  }
  var rT;
  function get_rontotesla() {
    init_properties_Tesla_kt_jwis59();
    return rontotesla;
  }
  var rontotesla;
  function get_qT() {
    init_properties_Tesla_kt_jwis59();
    return qT;
  }
  var qT;
  function get_quectotesla() {
    init_properties_Tesla_kt_jwis59();
    return quectotesla;
  }
  var quectotesla;
  function Tesla(value) {
    DerivedUnit.call(this, value, get_formula_16());
  }
  var properties_initialized_Tesla_kt_2pedsp;
  function init_properties_Tesla_kt_jwis59() {
    if (properties_initialized_Tesla_kt_2pedsp) {
    } else {
      properties_initialized_Tesla_kt_2pedsp = true;
      formula_16 = times_0(times_0(get_kg(), powExpression(get_s(), -2)), powExpression(get_A(), -1));
      T = get_formula_16();
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 30.0);
      QT = times_2(tmp$ret$0, times_0(times_0(get_kg(), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      quettatesla = get_QT();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 27.0);
      RT = times_2(tmp$ret$0_0, times_0(times_0(get_kg(), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      ronnatesla = get_RT();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 24.0);
      YT = times_2(tmp$ret$0_1, times_0(times_0(get_kg(), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      yottatesla = get_YT();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 21.0);
      ZT = times_2(tmp$ret$0_2, times_0(times_0(get_kg(), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      zettatesla = get_ZT();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 18.0);
      ET = times_2(tmp$ret$0_3, times_0(times_0(get_kg(), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      exatesla = get_ET();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 15.0);
      PT = times_2(tmp$ret$0_4, times_0(times_0(get_kg(), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      petatesla = get_PT();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 12.0);
      TT = times_2(tmp$ret$0_5, times_0(times_0(get_kg(), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      teratesla = get_TT();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 9.0);
      GT = times_2(tmp$ret$0_6, times_0(times_0(get_kg(), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      gigatesla = get_GT();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 6.0);
      MT = times_2(tmp$ret$0_7, times_0(times_0(get_kg(), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      megatesla = get_MT();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, 3.0);
      kT = times_2(tmp$ret$0_8, times_0(times_0(get_kg(), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      kilotesla = get_kT();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, 2.0);
      hT = times_2(tmp$ret$0_9, times_0(times_0(get_kg(), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      hectotesla = get_hT();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, 1.0);
      daT = times_2(tmp$ret$0_10, times_0(times_0(get_kg(), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      decatesla = get_daT();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -1.0);
      dT = times_2(tmp$ret$0_11, times_0(times_0(get_kg(), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      decitesla = get_dT();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -2.0);
      cT = times_2(tmp$ret$0_12, times_0(times_0(get_kg(), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      centitesla = get_cT();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -3.0);
      mT = times_2(tmp$ret$0_13, times_0(times_0(get_kg(), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      millitesla = get_mT();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -6.0);
      μT = times_2(tmp$ret$0_14, times_0(times_0(get_kg(), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      microtesla = get_μT();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -9.0);
      nT = times_2(tmp$ret$0_15, times_0(times_0(get_kg(), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      nanotesla = get_nT();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -12.0);
      pT = times_2(tmp$ret$0_16, times_0(times_0(get_kg(), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      picotesla = get_pT();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -15.0);
      fT = times_2(tmp$ret$0_17, times_0(times_0(get_kg(), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      femtotesla = get_fT();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -18.0);
      aT = times_2(tmp$ret$0_18, times_0(times_0(get_kg(), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      attotesla = get_aT();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -21.0);
      zT = times_2(tmp$ret$0_19, times_0(times_0(get_kg(), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      zeptotesla = get_zT();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -24.0);
      yT = times_2(tmp$ret$0_20, times_0(times_0(get_kg(), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      yoctotesla = get_yT();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -27.0);
      rT = times_2(tmp$ret$0_21, times_0(times_0(get_kg(), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      rontotesla = get_rT();
      var tmp$ret$0_22;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_22 = Math.pow(10.0, -30.0);
      qT = times_2(tmp$ret$0_22, times_0(times_0(get_kg(), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      quectotesla = get_qT();
    }
  }
  function get_formula_17() {
    init_properties_Volt_kt_ymmf09();
    return formula_17;
  }
  var formula_17;
  function get_V() {
    init_properties_Volt_kt_ymmf09();
    return V;
  }
  var V;
  function get_QV() {
    init_properties_Volt_kt_ymmf09();
    return QV;
  }
  var QV;
  function get_quettavolt() {
    init_properties_Volt_kt_ymmf09();
    return quettavolt;
  }
  var quettavolt;
  function get_RV() {
    init_properties_Volt_kt_ymmf09();
    return RV;
  }
  var RV;
  function get_ronnavolt() {
    init_properties_Volt_kt_ymmf09();
    return ronnavolt;
  }
  var ronnavolt;
  function get_YV() {
    init_properties_Volt_kt_ymmf09();
    return YV;
  }
  var YV;
  function get_yottavolt() {
    init_properties_Volt_kt_ymmf09();
    return yottavolt;
  }
  var yottavolt;
  function get_ZV() {
    init_properties_Volt_kt_ymmf09();
    return ZV;
  }
  var ZV;
  function get_zettavolt() {
    init_properties_Volt_kt_ymmf09();
    return zettavolt;
  }
  var zettavolt;
  function get_EV() {
    init_properties_Volt_kt_ymmf09();
    return EV;
  }
  var EV;
  function get_exavolt() {
    init_properties_Volt_kt_ymmf09();
    return exavolt;
  }
  var exavolt;
  function get_PV() {
    init_properties_Volt_kt_ymmf09();
    return PV;
  }
  var PV;
  function get_petavolt() {
    init_properties_Volt_kt_ymmf09();
    return petavolt;
  }
  var petavolt;
  function get_TV() {
    init_properties_Volt_kt_ymmf09();
    return TV;
  }
  var TV;
  function get_teravolt() {
    init_properties_Volt_kt_ymmf09();
    return teravolt;
  }
  var teravolt;
  function get_GV() {
    init_properties_Volt_kt_ymmf09();
    return GV;
  }
  var GV;
  function get_gigavolt() {
    init_properties_Volt_kt_ymmf09();
    return gigavolt;
  }
  var gigavolt;
  function get_MV() {
    init_properties_Volt_kt_ymmf09();
    return MV;
  }
  var MV;
  function get_megavolt() {
    init_properties_Volt_kt_ymmf09();
    return megavolt;
  }
  var megavolt;
  function get_kV() {
    init_properties_Volt_kt_ymmf09();
    return kV;
  }
  var kV;
  function get_kilovolt() {
    init_properties_Volt_kt_ymmf09();
    return kilovolt;
  }
  var kilovolt;
  function get_hV() {
    init_properties_Volt_kt_ymmf09();
    return hV;
  }
  var hV;
  function get_hectovolt() {
    init_properties_Volt_kt_ymmf09();
    return hectovolt;
  }
  var hectovolt;
  function get_daV() {
    init_properties_Volt_kt_ymmf09();
    return daV;
  }
  var daV;
  function get_decavolt() {
    init_properties_Volt_kt_ymmf09();
    return decavolt;
  }
  var decavolt;
  function get_dV() {
    init_properties_Volt_kt_ymmf09();
    return dV;
  }
  var dV;
  function get_decivolt() {
    init_properties_Volt_kt_ymmf09();
    return decivolt;
  }
  var decivolt;
  function get_cV() {
    init_properties_Volt_kt_ymmf09();
    return cV;
  }
  var cV;
  function get_centivolt() {
    init_properties_Volt_kt_ymmf09();
    return centivolt;
  }
  var centivolt;
  function get_mV() {
    init_properties_Volt_kt_ymmf09();
    return mV;
  }
  var mV;
  function get_millivolt() {
    init_properties_Volt_kt_ymmf09();
    return millivolt;
  }
  var millivolt;
  function get_μV() {
    init_properties_Volt_kt_ymmf09();
    return μV;
  }
  var μV;
  function get_microvolt() {
    init_properties_Volt_kt_ymmf09();
    return microvolt;
  }
  var microvolt;
  function get_nV() {
    init_properties_Volt_kt_ymmf09();
    return nV;
  }
  var nV;
  function get_nanovolt() {
    init_properties_Volt_kt_ymmf09();
    return nanovolt;
  }
  var nanovolt;
  function get_pV() {
    init_properties_Volt_kt_ymmf09();
    return pV;
  }
  var pV;
  function get_picovolt() {
    init_properties_Volt_kt_ymmf09();
    return picovolt;
  }
  var picovolt;
  function get_fV() {
    init_properties_Volt_kt_ymmf09();
    return fV;
  }
  var fV;
  function get_femtovolt() {
    init_properties_Volt_kt_ymmf09();
    return femtovolt;
  }
  var femtovolt;
  function get_aV() {
    init_properties_Volt_kt_ymmf09();
    return aV;
  }
  var aV;
  function get_attovolt() {
    init_properties_Volt_kt_ymmf09();
    return attovolt;
  }
  var attovolt;
  function get_zV() {
    init_properties_Volt_kt_ymmf09();
    return zV;
  }
  var zV;
  function get_zeptovolt() {
    init_properties_Volt_kt_ymmf09();
    return zeptovolt;
  }
  var zeptovolt;
  function get_yV() {
    init_properties_Volt_kt_ymmf09();
    return yV;
  }
  var yV;
  function get_yoctovolt() {
    init_properties_Volt_kt_ymmf09();
    return yoctovolt;
  }
  var yoctovolt;
  function get_rV() {
    init_properties_Volt_kt_ymmf09();
    return rV;
  }
  var rV;
  function get_rontovolt() {
    init_properties_Volt_kt_ymmf09();
    return rontovolt;
  }
  var rontovolt;
  function get_qV() {
    init_properties_Volt_kt_ymmf09();
    return qV;
  }
  var qV;
  function get_quectovolt() {
    init_properties_Volt_kt_ymmf09();
    return quectovolt;
  }
  var quectovolt;
  function Volt(value) {
    DerivedUnit.call(this, value, get_formula_17());
  }
  var properties_initialized_Volt_kt_dg9hgd;
  function init_properties_Volt_kt_ymmf09() {
    if (properties_initialized_Volt_kt_dg9hgd) {
    } else {
      properties_initialized_Volt_kt_dg9hgd = true;
      formula_17 = times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -1));
      V = get_formula_17();
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 30.0);
      QV = times_2(tmp$ret$0, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -1)));
      quettavolt = get_QV();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 27.0);
      RV = times_2(tmp$ret$0_0, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -1)));
      ronnavolt = get_RV();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 24.0);
      YV = times_2(tmp$ret$0_1, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -1)));
      yottavolt = get_YV();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 21.0);
      ZV = times_2(tmp$ret$0_2, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -1)));
      zettavolt = get_ZV();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 18.0);
      EV = times_2(tmp$ret$0_3, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -1)));
      exavolt = get_EV();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 15.0);
      PV = times_2(tmp$ret$0_4, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -1)));
      petavolt = get_PV();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 12.0);
      TV = times_2(tmp$ret$0_5, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -1)));
      teravolt = get_TV();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 9.0);
      GV = times_2(tmp$ret$0_6, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -1)));
      gigavolt = get_GV();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 6.0);
      MV = times_2(tmp$ret$0_7, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -1)));
      megavolt = get_MV();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, 3.0);
      kV = times_2(tmp$ret$0_8, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -1)));
      kilovolt = get_kV();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, 2.0);
      hV = times_2(tmp$ret$0_9, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -1)));
      hectovolt = get_hV();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, 1.0);
      daV = times_2(tmp$ret$0_10, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -1)));
      decavolt = get_daV();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -1.0);
      dV = times_2(tmp$ret$0_11, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -1)));
      decivolt = get_dV();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -2.0);
      cV = times_2(tmp$ret$0_12, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -1)));
      centivolt = get_cV();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -3.0);
      mV = times_2(tmp$ret$0_13, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -1)));
      millivolt = get_mV();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -6.0);
      μV = times_2(tmp$ret$0_14, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -1)));
      microvolt = get_μV();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -9.0);
      nV = times_2(tmp$ret$0_15, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -1)));
      nanovolt = get_nV();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -12.0);
      pV = times_2(tmp$ret$0_16, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -1)));
      picovolt = get_pV();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -15.0);
      fV = times_2(tmp$ret$0_17, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -1)));
      femtovolt = get_fV();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -18.0);
      aV = times_2(tmp$ret$0_18, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -1)));
      attovolt = get_aV();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -21.0);
      zV = times_2(tmp$ret$0_19, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -1)));
      zeptovolt = get_zV();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -24.0);
      yV = times_2(tmp$ret$0_20, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -1)));
      yoctovolt = get_yV();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -27.0);
      rV = times_2(tmp$ret$0_21, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -1)));
      rontovolt = get_rV();
      var tmp$ret$0_22;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_22 = Math.pow(10.0, -30.0);
      qV = times_2(tmp$ret$0_22, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -3)), powExpression(get_A(), -1)));
      quectovolt = get_qV();
    }
  }
  function get_formula_18() {
    init_properties_Watt_kt_s8bpio();
    return formula_18;
  }
  var formula_18;
  function get_W() {
    init_properties_Watt_kt_s8bpio();
    return W;
  }
  var W;
  function get_QW() {
    init_properties_Watt_kt_s8bpio();
    return QW;
  }
  var QW;
  function get_quettawatt() {
    init_properties_Watt_kt_s8bpio();
    return quettawatt;
  }
  var quettawatt;
  function get_RW() {
    init_properties_Watt_kt_s8bpio();
    return RW;
  }
  var RW;
  function get_ronnawatt() {
    init_properties_Watt_kt_s8bpio();
    return ronnawatt;
  }
  var ronnawatt;
  function get_YW() {
    init_properties_Watt_kt_s8bpio();
    return YW;
  }
  var YW;
  function get_yottawatt() {
    init_properties_Watt_kt_s8bpio();
    return yottawatt;
  }
  var yottawatt;
  function get_ZW() {
    init_properties_Watt_kt_s8bpio();
    return ZW;
  }
  var ZW;
  function get_zettawatt() {
    init_properties_Watt_kt_s8bpio();
    return zettawatt;
  }
  var zettawatt;
  function get_EW() {
    init_properties_Watt_kt_s8bpio();
    return EW;
  }
  var EW;
  function get_exawatt() {
    init_properties_Watt_kt_s8bpio();
    return exawatt;
  }
  var exawatt;
  function get_PW() {
    init_properties_Watt_kt_s8bpio();
    return PW;
  }
  var PW;
  function get_petawatt() {
    init_properties_Watt_kt_s8bpio();
    return petawatt;
  }
  var petawatt;
  function get_TW() {
    init_properties_Watt_kt_s8bpio();
    return TW;
  }
  var TW;
  function get_terawatt() {
    init_properties_Watt_kt_s8bpio();
    return terawatt;
  }
  var terawatt;
  function get_GW() {
    init_properties_Watt_kt_s8bpio();
    return GW;
  }
  var GW;
  function get_gigawatt() {
    init_properties_Watt_kt_s8bpio();
    return gigawatt;
  }
  var gigawatt;
  function get_MW() {
    init_properties_Watt_kt_s8bpio();
    return MW;
  }
  var MW;
  function get_megawatt() {
    init_properties_Watt_kt_s8bpio();
    return megawatt;
  }
  var megawatt;
  function get_kW() {
    init_properties_Watt_kt_s8bpio();
    return kW;
  }
  var kW;
  function get_kilowatt() {
    init_properties_Watt_kt_s8bpio();
    return kilowatt;
  }
  var kilowatt;
  function get_hW() {
    init_properties_Watt_kt_s8bpio();
    return hW;
  }
  var hW;
  function get_hectowatt() {
    init_properties_Watt_kt_s8bpio();
    return hectowatt;
  }
  var hectowatt;
  function get_daW() {
    init_properties_Watt_kt_s8bpio();
    return daW;
  }
  var daW;
  function get_decawatt() {
    init_properties_Watt_kt_s8bpio();
    return decawatt;
  }
  var decawatt;
  function get_dW() {
    init_properties_Watt_kt_s8bpio();
    return dW;
  }
  var dW;
  function get_deciwatt() {
    init_properties_Watt_kt_s8bpio();
    return deciwatt;
  }
  var deciwatt;
  function get_cW() {
    init_properties_Watt_kt_s8bpio();
    return cW;
  }
  var cW;
  function get_centiwatt() {
    init_properties_Watt_kt_s8bpio();
    return centiwatt;
  }
  var centiwatt;
  function get_mW() {
    init_properties_Watt_kt_s8bpio();
    return mW;
  }
  var mW;
  function get_milliwatt() {
    init_properties_Watt_kt_s8bpio();
    return milliwatt;
  }
  var milliwatt;
  function get_μW() {
    init_properties_Watt_kt_s8bpio();
    return μW;
  }
  var μW;
  function get_microwatt() {
    init_properties_Watt_kt_s8bpio();
    return microwatt;
  }
  var microwatt;
  function get_nW() {
    init_properties_Watt_kt_s8bpio();
    return nW;
  }
  var nW;
  function get_nanowatt() {
    init_properties_Watt_kt_s8bpio();
    return nanowatt;
  }
  var nanowatt;
  function get_pW() {
    init_properties_Watt_kt_s8bpio();
    return pW;
  }
  var pW;
  function get_picowatt() {
    init_properties_Watt_kt_s8bpio();
    return picowatt;
  }
  var picowatt;
  function get_fW() {
    init_properties_Watt_kt_s8bpio();
    return fW;
  }
  var fW;
  function get_femtowatt() {
    init_properties_Watt_kt_s8bpio();
    return femtowatt;
  }
  var femtowatt;
  function get_aW() {
    init_properties_Watt_kt_s8bpio();
    return aW;
  }
  var aW;
  function get_attowatt() {
    init_properties_Watt_kt_s8bpio();
    return attowatt;
  }
  var attowatt;
  function get_zW() {
    init_properties_Watt_kt_s8bpio();
    return zW;
  }
  var zW;
  function get_zeptowatt() {
    init_properties_Watt_kt_s8bpio();
    return zeptowatt;
  }
  var zeptowatt;
  function get_yW() {
    init_properties_Watt_kt_s8bpio();
    return yW;
  }
  var yW;
  function get_yoctowatt() {
    init_properties_Watt_kt_s8bpio();
    return yoctowatt;
  }
  var yoctowatt;
  function get_rW() {
    init_properties_Watt_kt_s8bpio();
    return rW;
  }
  var rW;
  function get_rontowatt() {
    init_properties_Watt_kt_s8bpio();
    return rontowatt;
  }
  var rontowatt;
  function get_qW() {
    init_properties_Watt_kt_s8bpio();
    return qW;
  }
  var qW;
  function get_quectowatt() {
    init_properties_Watt_kt_s8bpio();
    return quectowatt;
  }
  var quectowatt;
  function Watt(value) {
    DerivedUnit.call(this, value, get_formula_18());
  }
  var properties_initialized_Watt_kt_lmfewk;
  function init_properties_Watt_kt_s8bpio() {
    if (properties_initialized_Watt_kt_lmfewk) {
    } else {
      properties_initialized_Watt_kt_lmfewk = true;
      formula_18 = div(times_0(get_kg(), get_m2()), powExpression(get_s(), 3));
      W = get_formula_18();
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 30.0);
      QW = times_2(tmp$ret$0, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 3)));
      quettawatt = get_QW();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 27.0);
      RW = times_2(tmp$ret$0_0, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 3)));
      ronnawatt = get_RW();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 24.0);
      YW = times_2(tmp$ret$0_1, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 3)));
      yottawatt = get_YW();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 21.0);
      ZW = times_2(tmp$ret$0_2, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 3)));
      zettawatt = get_ZW();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 18.0);
      EW = times_2(tmp$ret$0_3, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 3)));
      exawatt = get_EW();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 15.0);
      PW = times_2(tmp$ret$0_4, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 3)));
      petawatt = get_PW();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 12.0);
      TW = times_2(tmp$ret$0_5, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 3)));
      terawatt = get_TW();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 9.0);
      GW = times_2(tmp$ret$0_6, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 3)));
      gigawatt = get_GW();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 6.0);
      MW = times_2(tmp$ret$0_7, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 3)));
      megawatt = get_MW();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, 3.0);
      kW = times_2(tmp$ret$0_8, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 3)));
      kilowatt = get_kW();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, 2.0);
      hW = times_2(tmp$ret$0_9, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 3)));
      hectowatt = get_hW();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, 1.0);
      daW = times_2(tmp$ret$0_10, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 3)));
      decawatt = get_daW();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -1.0);
      dW = times_2(tmp$ret$0_11, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 3)));
      deciwatt = get_dW();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -2.0);
      cW = times_2(tmp$ret$0_12, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 3)));
      centiwatt = get_cW();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -3.0);
      mW = times_2(tmp$ret$0_13, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 3)));
      milliwatt = get_mW();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -6.0);
      μW = times_2(tmp$ret$0_14, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 3)));
      microwatt = get_μW();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -9.0);
      nW = times_2(tmp$ret$0_15, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 3)));
      nanowatt = get_nW();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -12.0);
      pW = times_2(tmp$ret$0_16, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 3)));
      picowatt = get_pW();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -15.0);
      fW = times_2(tmp$ret$0_17, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 3)));
      femtowatt = get_fW();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -18.0);
      aW = times_2(tmp$ret$0_18, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 3)));
      attowatt = get_aW();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -21.0);
      zW = times_2(tmp$ret$0_19, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 3)));
      zeptowatt = get_zW();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -24.0);
      yW = times_2(tmp$ret$0_20, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 3)));
      yoctowatt = get_yW();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -27.0);
      rW = times_2(tmp$ret$0_21, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 3)));
      rontowatt = get_rW();
      var tmp$ret$0_22;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_22 = Math.pow(10.0, -30.0);
      qW = times_2(tmp$ret$0_22, div(times_0(get_kg(), get_m2()), powExpression(get_s(), 3)));
      quectowatt = get_qW();
    }
  }
  function get_formula_19() {
    init_properties_Weber_kt_r6yv9v();
    return formula_19;
  }
  var formula_19;
  function get_Wb() {
    init_properties_Weber_kt_r6yv9v();
    return Wb;
  }
  var Wb;
  function get_QWb() {
    init_properties_Weber_kt_r6yv9v();
    return QWb;
  }
  var QWb;
  function get_quettaweber() {
    init_properties_Weber_kt_r6yv9v();
    return quettaweber;
  }
  var quettaweber;
  function get_RWb() {
    init_properties_Weber_kt_r6yv9v();
    return RWb;
  }
  var RWb;
  function get_ronnaweber() {
    init_properties_Weber_kt_r6yv9v();
    return ronnaweber;
  }
  var ronnaweber;
  function get_YWb() {
    init_properties_Weber_kt_r6yv9v();
    return YWb;
  }
  var YWb;
  function get_yottaweber() {
    init_properties_Weber_kt_r6yv9v();
    return yottaweber;
  }
  var yottaweber;
  function get_ZWb() {
    init_properties_Weber_kt_r6yv9v();
    return ZWb;
  }
  var ZWb;
  function get_zettaweber() {
    init_properties_Weber_kt_r6yv9v();
    return zettaweber;
  }
  var zettaweber;
  function get_EWb() {
    init_properties_Weber_kt_r6yv9v();
    return EWb;
  }
  var EWb;
  function get_exaweber() {
    init_properties_Weber_kt_r6yv9v();
    return exaweber;
  }
  var exaweber;
  function get_PWb() {
    init_properties_Weber_kt_r6yv9v();
    return PWb;
  }
  var PWb;
  function get_petaweber() {
    init_properties_Weber_kt_r6yv9v();
    return petaweber;
  }
  var petaweber;
  function get_TWb() {
    init_properties_Weber_kt_r6yv9v();
    return TWb;
  }
  var TWb;
  function get_teraweber() {
    init_properties_Weber_kt_r6yv9v();
    return teraweber;
  }
  var teraweber;
  function get_GWb() {
    init_properties_Weber_kt_r6yv9v();
    return GWb;
  }
  var GWb;
  function get_gigaweber() {
    init_properties_Weber_kt_r6yv9v();
    return gigaweber;
  }
  var gigaweber;
  function get_MWb() {
    init_properties_Weber_kt_r6yv9v();
    return MWb;
  }
  var MWb;
  function get_megaweber() {
    init_properties_Weber_kt_r6yv9v();
    return megaweber;
  }
  var megaweber;
  function get_kWb() {
    init_properties_Weber_kt_r6yv9v();
    return kWb;
  }
  var kWb;
  function get_kiloweber() {
    init_properties_Weber_kt_r6yv9v();
    return kiloweber;
  }
  var kiloweber;
  function get_hWb() {
    init_properties_Weber_kt_r6yv9v();
    return hWb;
  }
  var hWb;
  function get_hectoweber() {
    init_properties_Weber_kt_r6yv9v();
    return hectoweber;
  }
  var hectoweber;
  function get_daWb() {
    init_properties_Weber_kt_r6yv9v();
    return daWb;
  }
  var daWb;
  function get_decaweber() {
    init_properties_Weber_kt_r6yv9v();
    return decaweber;
  }
  var decaweber;
  function get_dWb() {
    init_properties_Weber_kt_r6yv9v();
    return dWb;
  }
  var dWb;
  function get_deciweber() {
    init_properties_Weber_kt_r6yv9v();
    return deciweber;
  }
  var deciweber;
  function get_cWb() {
    init_properties_Weber_kt_r6yv9v();
    return cWb;
  }
  var cWb;
  function get_centiweber() {
    init_properties_Weber_kt_r6yv9v();
    return centiweber;
  }
  var centiweber;
  function get_mWb() {
    init_properties_Weber_kt_r6yv9v();
    return mWb;
  }
  var mWb;
  function get_milliweber() {
    init_properties_Weber_kt_r6yv9v();
    return milliweber;
  }
  var milliweber;
  function get_μWb() {
    init_properties_Weber_kt_r6yv9v();
    return μWb;
  }
  var μWb;
  function get_microweber() {
    init_properties_Weber_kt_r6yv9v();
    return microweber;
  }
  var microweber;
  function get_nWb() {
    init_properties_Weber_kt_r6yv9v();
    return nWb;
  }
  var nWb;
  function get_nanoweber() {
    init_properties_Weber_kt_r6yv9v();
    return nanoweber;
  }
  var nanoweber;
  function get_pWb() {
    init_properties_Weber_kt_r6yv9v();
    return pWb;
  }
  var pWb;
  function get_picoweber() {
    init_properties_Weber_kt_r6yv9v();
    return picoweber;
  }
  var picoweber;
  function get_fWb() {
    init_properties_Weber_kt_r6yv9v();
    return fWb;
  }
  var fWb;
  function get_femtoweber() {
    init_properties_Weber_kt_r6yv9v();
    return femtoweber;
  }
  var femtoweber;
  function get_aWb() {
    init_properties_Weber_kt_r6yv9v();
    return aWb;
  }
  var aWb;
  function get_attoweber() {
    init_properties_Weber_kt_r6yv9v();
    return attoweber;
  }
  var attoweber;
  function get_zWb() {
    init_properties_Weber_kt_r6yv9v();
    return zWb;
  }
  var zWb;
  function get_zeptoweber() {
    init_properties_Weber_kt_r6yv9v();
    return zeptoweber;
  }
  var zeptoweber;
  function get_yWb() {
    init_properties_Weber_kt_r6yv9v();
    return yWb;
  }
  var yWb;
  function get_yoctoweber() {
    init_properties_Weber_kt_r6yv9v();
    return yoctoweber;
  }
  var yoctoweber;
  function get_rWb() {
    init_properties_Weber_kt_r6yv9v();
    return rWb;
  }
  var rWb;
  function get_rontoweber() {
    init_properties_Weber_kt_r6yv9v();
    return rontoweber;
  }
  var rontoweber;
  function get_qWb() {
    init_properties_Weber_kt_r6yv9v();
    return qWb;
  }
  var qWb;
  function get_quectoweber() {
    init_properties_Weber_kt_r6yv9v();
    return quectoweber;
  }
  var quectoweber;
  function Weber(value) {
    DerivedUnit.call(this, value, get_formula_19());
  }
  var properties_initialized_Weber_kt_9zugxb;
  function init_properties_Weber_kt_r6yv9v() {
    if (properties_initialized_Weber_kt_9zugxb) {
    } else {
      properties_initialized_Weber_kt_9zugxb = true;
      formula_19 = times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -1));
      Wb = get_formula_19();
      var tmp$ret$0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0 = Math.pow(10.0, 30.0);
      QWb = times_2(tmp$ret$0, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      quettaweber = get_QWb();
      var tmp$ret$0_0;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_0 = Math.pow(10.0, 27.0);
      RWb = times_2(tmp$ret$0_0, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      ronnaweber = get_RWb();
      var tmp$ret$0_1;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_1 = Math.pow(10.0, 24.0);
      YWb = times_2(tmp$ret$0_1, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      yottaweber = get_YWb();
      var tmp$ret$0_2;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_2 = Math.pow(10.0, 21.0);
      ZWb = times_2(tmp$ret$0_2, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      zettaweber = get_ZWb();
      var tmp$ret$0_3;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_3 = Math.pow(10.0, 18.0);
      EWb = times_2(tmp$ret$0_3, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      exaweber = get_EWb();
      var tmp$ret$0_4;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_4 = Math.pow(10.0, 15.0);
      PWb = times_2(tmp$ret$0_4, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      petaweber = get_PWb();
      var tmp$ret$0_5;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_5 = Math.pow(10.0, 12.0);
      TWb = times_2(tmp$ret$0_5, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      teraweber = get_TWb();
      var tmp$ret$0_6;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_6 = Math.pow(10.0, 9.0);
      GWb = times_2(tmp$ret$0_6, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      gigaweber = get_GWb();
      var tmp$ret$0_7;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_7 = Math.pow(10.0, 6.0);
      MWb = times_2(tmp$ret$0_7, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      megaweber = get_MWb();
      var tmp$ret$0_8;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_8 = Math.pow(10.0, 3.0);
      kWb = times_2(tmp$ret$0_8, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      kiloweber = get_kWb();
      var tmp$ret$0_9;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_9 = Math.pow(10.0, 2.0);
      hWb = times_2(tmp$ret$0_9, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      hectoweber = get_hWb();
      var tmp$ret$0_10;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_10 = Math.pow(10.0, 1.0);
      daWb = times_2(tmp$ret$0_10, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      decaweber = get_daWb();
      var tmp$ret$0_11;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_11 = Math.pow(10.0, -1.0);
      dWb = times_2(tmp$ret$0_11, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      deciweber = get_dWb();
      var tmp$ret$0_12;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_12 = Math.pow(10.0, -2.0);
      cWb = times_2(tmp$ret$0_12, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      centiweber = get_cWb();
      var tmp$ret$0_13;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_13 = Math.pow(10.0, -3.0);
      mWb = times_2(tmp$ret$0_13, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      milliweber = get_mWb();
      var tmp$ret$0_14;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_14 = Math.pow(10.0, -6.0);
      μWb = times_2(tmp$ret$0_14, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      microweber = get_μWb();
      var tmp$ret$0_15;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_15 = Math.pow(10.0, -9.0);
      nWb = times_2(tmp$ret$0_15, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      nanoweber = get_nWb();
      var tmp$ret$0_16;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_16 = Math.pow(10.0, -12.0);
      pWb = times_2(tmp$ret$0_16, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      picoweber = get_pWb();
      var tmp$ret$0_17;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_17 = Math.pow(10.0, -15.0);
      fWb = times_2(tmp$ret$0_17, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      femtoweber = get_fWb();
      var tmp$ret$0_18;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_18 = Math.pow(10.0, -18.0);
      aWb = times_2(tmp$ret$0_18, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      attoweber = get_aWb();
      var tmp$ret$0_19;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_19 = Math.pow(10.0, -21.0);
      zWb = times_2(tmp$ret$0_19, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      zeptoweber = get_zWb();
      var tmp$ret$0_20;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_20 = Math.pow(10.0, -24.0);
      yWb = times_2(tmp$ret$0_20, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      yoctoweber = get_yWb();
      var tmp$ret$0_21;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_21 = Math.pow(10.0, -27.0);
      rWb = times_2(tmp$ret$0_21, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      rontoweber = get_rWb();
      var tmp$ret$0_22;
      // Inline function 'kotlin.math.pow' call
      tmp$ret$0_22 = Math.pow(10.0, -30.0);
      qWb = times_2(tmp$ret$0_22, times_0(times_0(times_0(get_kg(), get_m2()), powExpression(get_s(), -2)), powExpression(get_A(), -1)));
      quectoweber = get_qWb();
    }
  }
  function get_m2() {
    init_properties_NonSiUnits_kt_6cvga6();
    return m2;
  }
  var m2;
  function get_m3() {
    init_properties_NonSiUnits_kt_6cvga6();
    return m3;
  }
  var m3;
  function get_min() {
    init_properties_NonSiUnits_kt_6cvga6();
    return min;
  }
  var min;
  function get_h() {
    init_properties_NonSiUnits_kt_6cvga6();
    return h;
  }
  var h;
  function get_d() {
    init_properties_NonSiUnits_kt_6cvga6();
    return d;
  }
  var d;
  function get_au() {
    init_properties_NonSiUnits_kt_6cvga6();
    return au;
  }
  var au;
  function get_ha() {
    init_properties_NonSiUnits_kt_6cvga6();
    return ha;
  }
  var ha;
  function get_l() {
    init_properties_NonSiUnits_kt_6cvga6();
    return l;
  }
  var l;
  var L;
  function get_t() {
    init_properties_NonSiUnits_kt_6cvga6();
    return t;
  }
  var t;
  function get_Da() {
    init_properties_NonSiUnits_kt_6cvga6();
    return Da;
  }
  var Da;
  function get_eV() {
    init_properties_NonSiUnits_kt_6cvga6();
    return eV;
  }
  var eV;
  function get_percentage() {
    init_properties_NonSiUnits_kt_6cvga6();
    return percentage;
  }
  var percentage;
  function get_π() {
    return π;
  }
  var π;
  function get_e() {
    return e;
  }
  var e;
  function get_au_0(_this__u8e3s4) {
    init_properties_NonSiUnits_kt_6cvga6();
    return new Metre(numberToDouble(_this__u8e3s4) * 1.495978707E11);
  }
  function get_ha_0(_this__u8e3s4) {
    init_properties_NonSiUnits_kt_6cvga6();
    return times_2(10000 * numberToDouble(_this__u8e3s4), get_m2());
  }
  function get_l_0(_this__u8e3s4) {
    init_properties_NonSiUnits_kt_6cvga6();
    return times_0(times_0(new Metre(numberToDouble(_this__u8e3s4) / 10.0), new Metre(0.1)), new Metre(0.1));
  }
  function get_Da_0(_this__u8e3s4) {
    init_properties_NonSiUnits_kt_6cvga6();
    var tmp = numberToDouble(_this__u8e3s4) * 1.66053904;
    var tmp$ret$0;
    // Inline function 'kotlin.math.pow' call
    tmp$ret$0 = Math.pow(10.0, -27.0);
    return new Kilogram(tmp * tmp$ret$0);
  }
  function get_eV_0(_this__u8e3s4) {
    init_properties_NonSiUnits_kt_6cvga6();
    var tmp$ret$0;
    // Inline function 'kotlin.math.pow' call
    tmp$ret$0 = Math.pow(10.0, -19.0);
    return new Expression(1.602176634 * tmp$ret$0, get_J_0(1).dimensions);
  }
  var properties_initialized_NonSiUnits_kt_u6jkuq;
  function init_properties_NonSiUnits_kt_6cvga6() {
    if (properties_initialized_NonSiUnits_kt_u6jkuq) {
    } else {
      properties_initialized_NonSiUnits_kt_u6jkuq = true;
      m2 = times_0(get_m(), get_m());
      m3 = times_0(get_m2(), get_m());
      min = new Second(60.0);
      h = new Second(3600.0);
      d = new Second(86400.0);
      au = get_au_0(1.0);
      ha = get_ha_0(1.0);
      l = get_l_0(1.0);
      L = get_l();
      t = get_kg_0(1000);
      Da = get_Da_0(1);
      eV = get_eV_0(1);
      percentage = 0.01;
    }
  }
  function get_g() {
    init_properties_SpecialBaseUnits_kt_akc7aj();
    return g;
  }
  var g;
  var properties_initialized_SpecialBaseUnits_kt_e7i69l;
  function init_properties_SpecialBaseUnits_kt_akc7aj() {
    if (properties_initialized_SpecialBaseUnits_kt_e7i69l) {
    } else {
      properties_initialized_SpecialBaseUnits_kt_e7i69l = true;
      g = get_kg_0(0.001);
    }
  }
  function get_celsius() {
    init_properties_SpecialDerivedUnits_kt_9dg447();
    return celsius;
  }
  var celsius;
  function get_celsius_0(_this__u8e3s4) {
    init_properties_SpecialDerivedUnits_kt_9dg447();
    return new Kelvin(numberToDouble(_this__u8e3s4) + 273.15);
  }
  var properties_initialized_SpecialDerivedUnits_kt_50rxxh;
  function init_properties_SpecialDerivedUnits_kt_9dg447() {
    if (properties_initialized_SpecialDerivedUnits_kt_50rxxh) {
    } else {
      properties_initialized_SpecialDerivedUnits_kt_50rxxh = true;
      celsius = get_celsius_0(0);
    }
  }
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
  ε = 1.0E-12;
  COMPATIBILITY_ERR_PREFIX = "Can't process objects with different dimensions:";
  π = 3.141592653589793;
  e = 2.718281828459045;
  //endregion
  //region block: exports
  function $jsExportAll$(_) {
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$base = $eu$sirotin$kotunil.base || ($eu$sirotin$kotunil.base = {});
    Object.defineProperty($eu$sirotin$kotunil$base, 'A', {
      configurable: true,
      get: get_A
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'QA', {
      configurable: true,
      get: get_QA
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'quettaampere', {
      configurable: true,
      get: get_quettaampere
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'RA', {
      configurable: true,
      get: get_RA
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'ronnaampere', {
      configurable: true,
      get: get_ronnaampere
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'YA', {
      configurable: true,
      get: get_YA
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'yottaampere', {
      configurable: true,
      get: get_yottaampere
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'ZA', {
      configurable: true,
      get: get_ZA
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'zettaampere', {
      configurable: true,
      get: get_zettaampere
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'EA', {
      configurable: true,
      get: get_EA
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'exaampere', {
      configurable: true,
      get: get_exaampere
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'PA', {
      configurable: true,
      get: get_PA
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'petaampere', {
      configurable: true,
      get: get_petaampere
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'TA', {
      configurable: true,
      get: get_TA
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'teraampere', {
      configurable: true,
      get: get_teraampere
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'GA', {
      configurable: true,
      get: get_GA
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'gigaampere', {
      configurable: true,
      get: get_gigaampere
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'MA', {
      configurable: true,
      get: get_MA
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'megaampere', {
      configurable: true,
      get: get_megaampere
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'kA', {
      configurable: true,
      get: get_kA
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'kiloampere', {
      configurable: true,
      get: get_kiloampere
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'hA', {
      configurable: true,
      get: get_hA
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'hectoampere', {
      configurable: true,
      get: get_hectoampere
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'daA', {
      configurable: true,
      get: get_daA
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'decaampere', {
      configurable: true,
      get: get_decaampere
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'dA', {
      configurable: true,
      get: get_dA
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'deciampere', {
      configurable: true,
      get: get_deciampere
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'cA', {
      configurable: true,
      get: get_cA
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'centiampere', {
      configurable: true,
      get: get_centiampere
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'milliampere', {
      configurable: true,
      get: get_milliampere
    });
    Object.defineProperty($eu$sirotin$kotunil$base, '\u03BCA', {
      configurable: true,
      get: get_μA
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'microampere', {
      configurable: true,
      get: get_microampere
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'nA', {
      configurable: true,
      get: get_nA
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'nanoampere', {
      configurable: true,
      get: get_nanoampere
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'picoampere', {
      configurable: true,
      get: get_picoampere
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'fA', {
      configurable: true,
      get: get_fA
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'femtoampere', {
      configurable: true,
      get: get_femtoampere
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'aA', {
      configurable: true,
      get: get_aA
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'attoampere', {
      configurable: true,
      get: get_attoampere
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'zeptoampere', {
      configurable: true,
      get: get_zeptoampere
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'yoctoampere', {
      configurable: true,
      get: get_yoctoampere
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'rontoampere', {
      configurable: true,
      get: get_rontoampere
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'quectoampere', {
      configurable: true,
      get: get_quectoampere
    });
    $eu$sirotin$kotunil$base.Ampere = Ampere;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$base = $eu$sirotin$kotunil.base || ($eu$sirotin$kotunil.base = {});
    Object.defineProperty($eu$sirotin$kotunil$base, 'cd', {
      configurable: true,
      get: get_cd
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Qcd', {
      configurable: true,
      get: get_Qcd
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'quettacandela', {
      configurable: true,
      get: get_quettacandela
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Rcd', {
      configurable: true,
      get: get_Rcd
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'ronnacandela', {
      configurable: true,
      get: get_ronnacandela
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Ycd', {
      configurable: true,
      get: get_Ycd
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'yottacandela', {
      configurable: true,
      get: get_yottacandela
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Zcd', {
      configurable: true,
      get: get_Zcd
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'zettacandela', {
      configurable: true,
      get: get_zettacandela
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Ecd', {
      configurable: true,
      get: get_Ecd
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'exacandela', {
      configurable: true,
      get: get_exacandela
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Pcd', {
      configurable: true,
      get: get_Pcd
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'petacandela', {
      configurable: true,
      get: get_petacandela
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Tcd', {
      configurable: true,
      get: get_Tcd
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'teracandela', {
      configurable: true,
      get: get_teracandela
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Gcd', {
      configurable: true,
      get: get_Gcd
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'gigacandela', {
      configurable: true,
      get: get_gigacandela
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Mcd', {
      configurable: true,
      get: get_Mcd
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'megacandela', {
      configurable: true,
      get: get_megacandela
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'kcd', {
      configurable: true,
      get: get_kcd
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'kilocandela', {
      configurable: true,
      get: get_kilocandela
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'hcd', {
      configurable: true,
      get: get_hcd
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'hectocandela', {
      configurable: true,
      get: get_hectocandela
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'dacd', {
      configurable: true,
      get: get_dacd
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'decacandela', {
      configurable: true,
      get: get_decacandela
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'dcd', {
      configurable: true,
      get: get_dcd
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'decicandela', {
      configurable: true,
      get: get_decicandela
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'ccd', {
      configurable: true,
      get: get_ccd
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'centicandela', {
      configurable: true,
      get: get_centicandela
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'millicandela', {
      configurable: true,
      get: get_millicandela
    });
    Object.defineProperty($eu$sirotin$kotunil$base, '\u03BCcd', {
      configurable: true,
      get: get_μcd
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'microcandela', {
      configurable: true,
      get: get_microcandela
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'ncd', {
      configurable: true,
      get: get_ncd
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'nanocandela', {
      configurable: true,
      get: get_nanocandela
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'picocandela', {
      configurable: true,
      get: get_picocandela
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'fcd', {
      configurable: true,
      get: get_fcd
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'femtocandela', {
      configurable: true,
      get: get_femtocandela
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'acd', {
      configurable: true,
      get: get_acd
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'attocandela', {
      configurable: true,
      get: get_attocandela
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'zeptocandela', {
      configurable: true,
      get: get_zeptocandela
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'yoctocandela', {
      configurable: true,
      get: get_yoctocandela
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'rontocandela', {
      configurable: true,
      get: get_rontocandela
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'quectocandela', {
      configurable: true,
      get: get_quectocandela
    });
    $eu$sirotin$kotunil$base.Candela = Candela;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$base = $eu$sirotin$kotunil.base || ($eu$sirotin$kotunil.base = {});
    Object.defineProperty($eu$sirotin$kotunil$base, 'K', {
      configurable: true,
      get: get_K
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'QK', {
      configurable: true,
      get: get_QK
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'quettakelvin', {
      configurable: true,
      get: get_quettakelvin
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'RK', {
      configurable: true,
      get: get_RK
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'ronnakelvin', {
      configurable: true,
      get: get_ronnakelvin
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'YK', {
      configurable: true,
      get: get_YK
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'yottakelvin', {
      configurable: true,
      get: get_yottakelvin
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'ZK', {
      configurable: true,
      get: get_ZK
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'zettakelvin', {
      configurable: true,
      get: get_zettakelvin
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'EK', {
      configurable: true,
      get: get_EK
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'exakelvin', {
      configurable: true,
      get: get_exakelvin
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'PK', {
      configurable: true,
      get: get_PK
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'petakelvin', {
      configurable: true,
      get: get_petakelvin
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'TK', {
      configurable: true,
      get: get_TK
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'terakelvin', {
      configurable: true,
      get: get_terakelvin
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'GK', {
      configurable: true,
      get: get_GK
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'gigakelvin', {
      configurable: true,
      get: get_gigakelvin
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'MK', {
      configurable: true,
      get: get_MK
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'megakelvin', {
      configurable: true,
      get: get_megakelvin
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'kK', {
      configurable: true,
      get: get_kK
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'kilokelvin', {
      configurable: true,
      get: get_kilokelvin
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'hK', {
      configurable: true,
      get: get_hK
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'hectokelvin', {
      configurable: true,
      get: get_hectokelvin
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'daK', {
      configurable: true,
      get: get_daK
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'decakelvin', {
      configurable: true,
      get: get_decakelvin
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'dK', {
      configurable: true,
      get: get_dK
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'decikelvin', {
      configurable: true,
      get: get_decikelvin
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'cK', {
      configurable: true,
      get: get_cK
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'centikelvin', {
      configurable: true,
      get: get_centikelvin
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'millikelvin', {
      configurable: true,
      get: get_millikelvin
    });
    Object.defineProperty($eu$sirotin$kotunil$base, '\u03BCK', {
      configurable: true,
      get: get_μK
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'microkelvin', {
      configurable: true,
      get: get_microkelvin
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'nK', {
      configurable: true,
      get: get_nK
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'nanokelvin', {
      configurable: true,
      get: get_nanokelvin
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'picokelvin', {
      configurable: true,
      get: get_picokelvin
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'fK', {
      configurable: true,
      get: get_fK
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'femtokelvin', {
      configurable: true,
      get: get_femtokelvin
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'aK', {
      configurable: true,
      get: get_aK
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'attokelvin', {
      configurable: true,
      get: get_attokelvin
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'zeptokelvin', {
      configurable: true,
      get: get_zeptokelvin
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'yoctokelvin', {
      configurable: true,
      get: get_yoctokelvin
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'rontokelvin', {
      configurable: true,
      get: get_rontokelvin
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'quectokelvin', {
      configurable: true,
      get: get_quectokelvin
    });
    $eu$sirotin$kotunil$base.Kelvin = Kelvin;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$base = $eu$sirotin$kotunil.base || ($eu$sirotin$kotunil.base = {});
    Object.defineProperty($eu$sirotin$kotunil$base, 'kg', {
      configurable: true,
      get: get_kg
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Qkg', {
      configurable: true,
      get: get_Qkg
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'quettakilogram', {
      configurable: true,
      get: get_quettakilogram
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Rkg', {
      configurable: true,
      get: get_Rkg
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'ronnakilogram', {
      configurable: true,
      get: get_ronnakilogram
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Ykg', {
      configurable: true,
      get: get_Ykg
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'yottakilogram', {
      configurable: true,
      get: get_yottakilogram
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Zkg', {
      configurable: true,
      get: get_Zkg
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'zettakilogram', {
      configurable: true,
      get: get_zettakilogram
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Ekg', {
      configurable: true,
      get: get_Ekg
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'exakilogram', {
      configurable: true,
      get: get_exakilogram
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Pkg', {
      configurable: true,
      get: get_Pkg
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'petakilogram', {
      configurable: true,
      get: get_petakilogram
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Tkg', {
      configurable: true,
      get: get_Tkg
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'terakilogram', {
      configurable: true,
      get: get_terakilogram
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Gkg', {
      configurable: true,
      get: get_Gkg
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'gigakilogram', {
      configurable: true,
      get: get_gigakilogram
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Mkg', {
      configurable: true,
      get: get_Mkg
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'megakilogram', {
      configurable: true,
      get: get_megakilogram
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'hkg', {
      configurable: true,
      get: get_hkg
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'hectokilogram', {
      configurable: true,
      get: get_hectokilogram
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'dakg', {
      configurable: true,
      get: get_dakg
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'decakilogram', {
      configurable: true,
      get: get_decakilogram
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'dkg', {
      configurable: true,
      get: get_dkg
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'decikilogram', {
      configurable: true,
      get: get_decikilogram
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'ckg', {
      configurable: true,
      get: get_ckg
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'centikilogram', {
      configurable: true,
      get: get_centikilogram
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'millikilogram', {
      configurable: true,
      get: get_millikilogram
    });
    Object.defineProperty($eu$sirotin$kotunil$base, '\u03BCkg', {
      configurable: true,
      get: get_μkg
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'microkilogram', {
      configurable: true,
      get: get_microkilogram
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'nkg', {
      configurable: true,
      get: get_nkg
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'nanokilogram', {
      configurable: true,
      get: get_nanokilogram
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'picokilogram', {
      configurable: true,
      get: get_picokilogram
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'fkg', {
      configurable: true,
      get: get_fkg
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'femtokilogram', {
      configurable: true,
      get: get_femtokilogram
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'akg', {
      configurable: true,
      get: get_akg
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'attokilogram', {
      configurable: true,
      get: get_attokilogram
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'zeptokilogram', {
      configurable: true,
      get: get_zeptokilogram
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'yoctokilogram', {
      configurable: true,
      get: get_yoctokilogram
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'rontokilogram', {
      configurable: true,
      get: get_rontokilogram
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'quectokilogram', {
      configurable: true,
      get: get_quectokilogram
    });
    $eu$sirotin$kotunil$base.Kilogram = Kilogram;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$base = $eu$sirotin$kotunil.base || ($eu$sirotin$kotunil.base = {});
    Object.defineProperty($eu$sirotin$kotunil$base, 'm', {
      configurable: true,
      get: get_m
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Qm', {
      configurable: true,
      get: get_Qm
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'quettametre', {
      configurable: true,
      get: get_quettametre
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Rm', {
      configurable: true,
      get: get_Rm
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'ronnametre', {
      configurable: true,
      get: get_ronnametre
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Ym', {
      configurable: true,
      get: get_Ym
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'yottametre', {
      configurable: true,
      get: get_yottametre
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Zm', {
      configurable: true,
      get: get_Zm
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'zettametre', {
      configurable: true,
      get: get_zettametre
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Em', {
      configurable: true,
      get: get_Em
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'exametre', {
      configurable: true,
      get: get_exametre
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Pm', {
      configurable: true,
      get: get_Pm
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'petametre', {
      configurable: true,
      get: get_petametre
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Tm', {
      configurable: true,
      get: get_Tm
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'terametre', {
      configurable: true,
      get: get_terametre
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Gm', {
      configurable: true,
      get: get_Gm
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'gigametre', {
      configurable: true,
      get: get_gigametre
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Mm', {
      configurable: true,
      get: get_Mm
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'megametre', {
      configurable: true,
      get: get_megametre
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'km', {
      configurable: true,
      get: get_km
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'kilometre', {
      configurable: true,
      get: get_kilometre
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'hm', {
      configurable: true,
      get: get_hm
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'hectometre', {
      configurable: true,
      get: get_hectometre
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'dam', {
      configurable: true,
      get: get_dam
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'decametre', {
      configurable: true,
      get: get_decametre
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'dm', {
      configurable: true,
      get: get_dm
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'decimetre', {
      configurable: true,
      get: get_decimetre
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'cm', {
      configurable: true,
      get: get_cm
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'centimetre', {
      configurable: true,
      get: get_centimetre
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'millimetre', {
      configurable: true,
      get: get_millimetre
    });
    Object.defineProperty($eu$sirotin$kotunil$base, '\u03BCm', {
      configurable: true,
      get: get_μm
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'micrometre', {
      configurable: true,
      get: get_micrometre
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'nm', {
      configurable: true,
      get: get_nm
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'nanometre', {
      configurable: true,
      get: get_nanometre
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'picometre', {
      configurable: true,
      get: get_picometre
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'fm', {
      configurable: true,
      get: get_fm
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'femtometre', {
      configurable: true,
      get: get_femtometre
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'am', {
      configurable: true,
      get: get_am
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'attometre', {
      configurable: true,
      get: get_attometre
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'zeptometre', {
      configurable: true,
      get: get_zeptometre
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'yoctometre', {
      configurable: true,
      get: get_yoctometre
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'rontometre', {
      configurable: true,
      get: get_rontometre
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'quectometre', {
      configurable: true,
      get: get_quectometre
    });
    $eu$sirotin$kotunil$base.Metre = Metre;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$base = $eu$sirotin$kotunil.base || ($eu$sirotin$kotunil.base = {});
    Object.defineProperty($eu$sirotin$kotunil$base, 'mol', {
      configurable: true,
      get: get_mol
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Qmol', {
      configurable: true,
      get: get_Qmol
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'quettamole', {
      configurable: true,
      get: get_quettamole
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Rmol', {
      configurable: true,
      get: get_Rmol
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'ronnamole', {
      configurable: true,
      get: get_ronnamole
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Ymol', {
      configurable: true,
      get: get_Ymol
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'yottamole', {
      configurable: true,
      get: get_yottamole
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Zmol', {
      configurable: true,
      get: get_Zmol
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'zettamole', {
      configurable: true,
      get: get_zettamole
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Emol', {
      configurable: true,
      get: get_Emol
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'examole', {
      configurable: true,
      get: get_examole
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Pmol', {
      configurable: true,
      get: get_Pmol
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'petamole', {
      configurable: true,
      get: get_petamole
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Tmol', {
      configurable: true,
      get: get_Tmol
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'teramole', {
      configurable: true,
      get: get_teramole
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Gmol', {
      configurable: true,
      get: get_Gmol
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'gigamole', {
      configurable: true,
      get: get_gigamole
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Mmol', {
      configurable: true,
      get: get_Mmol
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'megamole', {
      configurable: true,
      get: get_megamole
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'kmol', {
      configurable: true,
      get: get_kmol
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'kilomole', {
      configurable: true,
      get: get_kilomole
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'hmol', {
      configurable: true,
      get: get_hmol
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'hectomole', {
      configurable: true,
      get: get_hectomole
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'damol', {
      configurable: true,
      get: get_damol
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'decamole', {
      configurable: true,
      get: get_decamole
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'dmol', {
      configurable: true,
      get: get_dmol
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'decimole', {
      configurable: true,
      get: get_decimole
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'cmol', {
      configurable: true,
      get: get_cmol
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'centimole', {
      configurable: true,
      get: get_centimole
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'millimole', {
      configurable: true,
      get: get_millimole
    });
    Object.defineProperty($eu$sirotin$kotunil$base, '\u03BCmol', {
      configurable: true,
      get: get_μmol
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'micromole', {
      configurable: true,
      get: get_micromole
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'nmol', {
      configurable: true,
      get: get_nmol
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'nanomole', {
      configurable: true,
      get: get_nanomole
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'picomole', {
      configurable: true,
      get: get_picomole
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'fmol', {
      configurable: true,
      get: get_fmol
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'femtomole', {
      configurable: true,
      get: get_femtomole
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'amol', {
      configurable: true,
      get: get_amol
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'attomole', {
      configurable: true,
      get: get_attomole
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'zeptomole', {
      configurable: true,
      get: get_zeptomole
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'yoctomole', {
      configurable: true,
      get: get_yoctomole
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'rontomole', {
      configurable: true,
      get: get_rontomole
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'quectomole', {
      configurable: true,
      get: get_quectomole
    });
    $eu$sirotin$kotunil$base.Mole = Mole;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$base = $eu$sirotin$kotunil.base || ($eu$sirotin$kotunil.base = {});
    Object.defineProperty($eu$sirotin$kotunil$base, 's', {
      configurable: true,
      get: get_s
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Qs', {
      configurable: true,
      get: get_Qs
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'quettasecond', {
      configurable: true,
      get: get_quettasecond
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Rs', {
      configurable: true,
      get: get_Rs
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'ronnasecond', {
      configurable: true,
      get: get_ronnasecond
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Ys', {
      configurable: true,
      get: get_Ys
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'yottasecond', {
      configurable: true,
      get: get_yottasecond
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Zs', {
      configurable: true,
      get: get_Zs
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'zettasecond', {
      configurable: true,
      get: get_zettasecond
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Es', {
      configurable: true,
      get: get_Es
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'exasecond', {
      configurable: true,
      get: get_exasecond
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Ps', {
      configurable: true,
      get: get_Ps
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'petasecond', {
      configurable: true,
      get: get_petasecond
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Ts', {
      configurable: true,
      get: get_Ts
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'terasecond', {
      configurable: true,
      get: get_terasecond
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Gs', {
      configurable: true,
      get: get_Gs
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'gigasecond', {
      configurable: true,
      get: get_gigasecond
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'Ms', {
      configurable: true,
      get: get_Ms
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'megasecond', {
      configurable: true,
      get: get_megasecond
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'ks', {
      configurable: true,
      get: get_ks
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'kilosecond', {
      configurable: true,
      get: get_kilosecond
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'hs', {
      configurable: true,
      get: get_hs
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'hectosecond', {
      configurable: true,
      get: get_hectosecond
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'das', {
      configurable: true,
      get: get_das
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'decasecond', {
      configurable: true,
      get: get_decasecond
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'ds', {
      configurable: true,
      get: get_ds
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'decisecond', {
      configurable: true,
      get: get_decisecond
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'cs', {
      configurable: true,
      get: get_cs
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'centisecond', {
      configurable: true,
      get: get_centisecond
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'millisecond', {
      configurable: true,
      get: get_millisecond
    });
    Object.defineProperty($eu$sirotin$kotunil$base, '\u03BCs', {
      configurable: true,
      get: get_μs
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'microsecond', {
      configurable: true,
      get: get_microsecond
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'ns', {
      configurable: true,
      get: get_ns
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'nanosecond', {
      configurable: true,
      get: get_nanosecond
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'picosecond', {
      configurable: true,
      get: get_picosecond
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'fs', {
      configurable: true,
      get: get_fs
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'femtosecond', {
      configurable: true,
      get: get_femtosecond
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'as', {
      configurable: true,
      get: get_as
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'attosecond', {
      configurable: true,
      get: get_attosecond
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'zeptosecond', {
      configurable: true,
      get: get_zeptosecond
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'yoctosecond', {
      configurable: true,
      get: get_yoctosecond
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'rontosecond', {
      configurable: true,
      get: get_rontosecond
    });
    Object.defineProperty($eu$sirotin$kotunil$base, 'quectosecond', {
      configurable: true,
      get: get_quectosecond
    });
    $eu$sirotin$kotunil$base.Second = Second;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$core = $eu$sirotin$kotunil.core || ($eu$sirotin$kotunil.core = {});
    $eu$sirotin$kotunil$core.Dimensions = Dimensions;
    $eu$sirotin$kotunil$core.Factor = Factor;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$core = $eu$sirotin$kotunil.core || ($eu$sirotin$kotunil.core = {});
    Object.defineProperty($eu$sirotin$kotunil$core, '\u03B5', {
      configurable: true,
      get: get_ε
    });
    $eu$sirotin$kotunil$core.Expression = Expression;
    $eu$sirotin$kotunil$core.Expression.create = create;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$core = $eu$sirotin$kotunil.core || ($eu$sirotin$kotunil.core = {});
    $eu$sirotin$kotunil$core.UnitSpecification = UnitSpecification;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'AUD', {
      configurable: true,
      get: get_AUD
    });
    $eu$sirotin$kotunil$currency.AustralianDollar = AustralianDollar;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'BRL', {
      configurable: true,
      get: get_BRL
    });
    $eu$sirotin$kotunil$currency.BrazilianReal = BrazilianReal;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'CAD', {
      configurable: true,
      get: get_CAD
    });
    $eu$sirotin$kotunil$currency.CanadianDollar = CanadianDollar;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'CLP', {
      configurable: true,
      get: get_CLP
    });
    $eu$sirotin$kotunil$currency.ChileanPeso = ChileanPeso;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'COP', {
      configurable: true,
      get: get_COP
    });
    $eu$sirotin$kotunil$currency.ColombianPeso = ColombianPeso;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'CZK', {
      configurable: true,
      get: get_CZK
    });
    $eu$sirotin$kotunil$currency.CzechKoruna = CzechKoruna;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'DKK', {
      configurable: true,
      get: get_DKK
    });
    $eu$sirotin$kotunil$currency.DanishKrone = DanishKrone;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'EUR', {
      configurable: true,
      get: get_EUR
    });
    $eu$sirotin$kotunil$currency.Euro = Euro;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'HKD', {
      configurable: true,
      get: get_HKD
    });
    $eu$sirotin$kotunil$currency.HongKongDollar = HongKongDollar;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'HUF', {
      configurable: true,
      get: get_HUF
    });
    $eu$sirotin$kotunil$currency.HungarianForint = HungarianForint;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'INR', {
      configurable: true,
      get: get_INR
    });
    $eu$sirotin$kotunil$currency.IndianRupee = IndianRupee;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'IDR', {
      configurable: true,
      get: get_IDR
    });
    $eu$sirotin$kotunil$currency.IndonesianRupiah = IndonesianRupiah;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'ILS', {
      configurable: true,
      get: get_ILS
    });
    $eu$sirotin$kotunil$currency.IsraeliNewShekel = IsraeliNewShekel;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'JPY', {
      configurable: true,
      get: get_JPY
    });
    $eu$sirotin$kotunil$currency.JapaneseYen = JapaneseYen;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'MYR', {
      configurable: true,
      get: get_MYR
    });
    $eu$sirotin$kotunil$currency.MalaysianRinggit = MalaysianRinggit;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'MXN', {
      configurable: true,
      get: get_MXN
    });
    $eu$sirotin$kotunil$currency.MexicanPeso = MexicanPeso;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'TWD', {
      configurable: true,
      get: get_TWD
    });
    $eu$sirotin$kotunil$currency.NewTaiwanDollar = NewTaiwanDollar;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'NZD', {
      configurable: true,
      get: get_NZD
    });
    $eu$sirotin$kotunil$currency.NewZealandDollar = NewZealandDollar;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'NOK', {
      configurable: true,
      get: get_NOK
    });
    $eu$sirotin$kotunil$currency.NorwegianKrone = NorwegianKrone;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'PHP', {
      configurable: true,
      get: get_PHP
    });
    $eu$sirotin$kotunil$currency.PhilippinePeso = PhilippinePeso;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'PLN', {
      configurable: true,
      get: get_PLN
    });
    $eu$sirotin$kotunil$currency.PolishZłoty = PolishZłoty;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'GBP', {
      configurable: true,
      get: get_GBP
    });
    $eu$sirotin$kotunil$currency.PoundSterling = PoundSterling;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'CNY', {
      configurable: true,
      get: get_CNY
    });
    $eu$sirotin$kotunil$currency.Renminbi = Renminbi;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'RON', {
      configurable: true,
      get: get_RON
    });
    $eu$sirotin$kotunil$currency.RomanianLeu = RomanianLeu;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'RUB', {
      configurable: true,
      get: get_RUB
    });
    $eu$sirotin$kotunil$currency.RussianRuble = RussianRuble;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'SAR', {
      configurable: true,
      get: get_SAR
    });
    $eu$sirotin$kotunil$currency.SaudiRiyal = SaudiRiyal;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'SGD', {
      configurable: true,
      get: get_SGD
    });
    $eu$sirotin$kotunil$currency.SingaporeDollar = SingaporeDollar;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'ZAR', {
      configurable: true,
      get: get_ZAR
    });
    $eu$sirotin$kotunil$currency.SouthAfricanRand = SouthAfricanRand;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'KRW', {
      configurable: true,
      get: get_KRW
    });
    $eu$sirotin$kotunil$currency.SouthKoreanWon = SouthKoreanWon;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'SEK', {
      configurable: true,
      get: get_SEK
    });
    $eu$sirotin$kotunil$currency.SwedishKrona = SwedishKrona;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'CHF', {
      configurable: true,
      get: get_CHF
    });
    $eu$sirotin$kotunil$currency.SwissFranc = SwissFranc;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'THB', {
      configurable: true,
      get: get_THB
    });
    $eu$sirotin$kotunil$currency.ThaiBaht = ThaiBaht;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'TRY', {
      configurable: true,
      get: get_TRY
    });
    $eu$sirotin$kotunil$currency.TurkishLira = TurkishLira;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'AED', {
      configurable: true,
      get: get_AED
    });
    $eu$sirotin$kotunil$currency.UAEDirham = UAEDirham;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$currency = $eu$sirotin$kotunil.currency || ($eu$sirotin$kotunil.currency = {});
    Object.defineProperty($eu$sirotin$kotunil$currency, 'USD', {
      configurable: true,
      get: get_USD
    });
    $eu$sirotin$kotunil$currency.UnitedStatesDollar = UnitedStatesDollar;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$derived = $eu$sirotin$kotunil.derived || ($eu$sirotin$kotunil.derived = {});
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Bq', {
      configurable: true,
      get: get_Bq
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'QBq', {
      configurable: true,
      get: get_QBq
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quettabecquerel', {
      configurable: true,
      get: get_quettabecquerel
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'RBq', {
      configurable: true,
      get: get_RBq
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ronnabecquerel', {
      configurable: true,
      get: get_ronnabecquerel
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'YBq', {
      configurable: true,
      get: get_YBq
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yottabecquerel', {
      configurable: true,
      get: get_yottabecquerel
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ZBq', {
      configurable: true,
      get: get_ZBq
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zettabecquerel', {
      configurable: true,
      get: get_zettabecquerel
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'EBq', {
      configurable: true,
      get: get_EBq
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'exabecquerel', {
      configurable: true,
      get: get_exabecquerel
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'PBq', {
      configurable: true,
      get: get_PBq
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'petabecquerel', {
      configurable: true,
      get: get_petabecquerel
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'TBq', {
      configurable: true,
      get: get_TBq
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'terabecquerel', {
      configurable: true,
      get: get_terabecquerel
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'GBq', {
      configurable: true,
      get: get_GBq
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'gigabecquerel', {
      configurable: true,
      get: get_gigabecquerel
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'MBq', {
      configurable: true,
      get: get_MBq
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'megabecquerel', {
      configurable: true,
      get: get_megabecquerel
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kBq', {
      configurable: true,
      get: get_kBq
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kilobecquerel', {
      configurable: true,
      get: get_kilobecquerel
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hBq', {
      configurable: true,
      get: get_hBq
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hectobecquerel', {
      configurable: true,
      get: get_hectobecquerel
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'daBq', {
      configurable: true,
      get: get_daBq
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decabecquerel', {
      configurable: true,
      get: get_decabecquerel
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'dBq', {
      configurable: true,
      get: get_dBq
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decibecquerel', {
      configurable: true,
      get: get_decibecquerel
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'cBq', {
      configurable: true,
      get: get_cBq
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'centibecquerel', {
      configurable: true,
      get: get_centibecquerel
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'millibecquerel', {
      configurable: true,
      get: get_millibecquerel
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, '\u03BCBq', {
      configurable: true,
      get: get_μBq
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'microbecquerel', {
      configurable: true,
      get: get_microbecquerel
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nBq', {
      configurable: true,
      get: get_nBq
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nanobecquerel', {
      configurable: true,
      get: get_nanobecquerel
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'picobecquerel', {
      configurable: true,
      get: get_picobecquerel
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'fBq', {
      configurable: true,
      get: get_fBq
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'femtobecquerel', {
      configurable: true,
      get: get_femtobecquerel
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'aBq', {
      configurable: true,
      get: get_aBq
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'attobecquerel', {
      configurable: true,
      get: get_attobecquerel
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zeptobecquerel', {
      configurable: true,
      get: get_zeptobecquerel
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yoctobecquerel', {
      configurable: true,
      get: get_yoctobecquerel
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'rontobecquerel', {
      configurable: true,
      get: get_rontobecquerel
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quectobecquerel', {
      configurable: true,
      get: get_quectobecquerel
    });
    $eu$sirotin$kotunil$derived.Becquerel = Becquerel;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$derived = $eu$sirotin$kotunil.derived || ($eu$sirotin$kotunil.derived = {});
    Object.defineProperty($eu$sirotin$kotunil$derived, 'C', {
      configurable: true,
      get: get_C
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'QC', {
      configurable: true,
      get: get_QC
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quettacoulomb', {
      configurable: true,
      get: get_quettacoulomb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'RC', {
      configurable: true,
      get: get_RC
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ronnacoulomb', {
      configurable: true,
      get: get_ronnacoulomb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'YC', {
      configurable: true,
      get: get_YC
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yottacoulomb', {
      configurable: true,
      get: get_yottacoulomb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ZC', {
      configurable: true,
      get: get_ZC
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zettacoulomb', {
      configurable: true,
      get: get_zettacoulomb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'EC', {
      configurable: true,
      get: get_EC
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'exacoulomb', {
      configurable: true,
      get: get_exacoulomb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'PC', {
      configurable: true,
      get: get_PC
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'petacoulomb', {
      configurable: true,
      get: get_petacoulomb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'TC', {
      configurable: true,
      get: get_TC
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'teracoulomb', {
      configurable: true,
      get: get_teracoulomb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'GC', {
      configurable: true,
      get: get_GC
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'gigacoulomb', {
      configurable: true,
      get: get_gigacoulomb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'MC', {
      configurable: true,
      get: get_MC
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'megacoulomb', {
      configurable: true,
      get: get_megacoulomb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kC', {
      configurable: true,
      get: get_kC
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kilocoulomb', {
      configurable: true,
      get: get_kilocoulomb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hC', {
      configurable: true,
      get: get_hC
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hectocoulomb', {
      configurable: true,
      get: get_hectocoulomb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'daC', {
      configurable: true,
      get: get_daC
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decacoulomb', {
      configurable: true,
      get: get_decacoulomb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'dC', {
      configurable: true,
      get: get_dC
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decicoulomb', {
      configurable: true,
      get: get_decicoulomb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'cC', {
      configurable: true,
      get: get_cC
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'centicoulomb', {
      configurable: true,
      get: get_centicoulomb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'millicoulomb', {
      configurable: true,
      get: get_millicoulomb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, '\u03BCC', {
      configurable: true,
      get: get_μC
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'microcoulomb', {
      configurable: true,
      get: get_microcoulomb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nC', {
      configurable: true,
      get: get_nC
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nanocoulomb', {
      configurable: true,
      get: get_nanocoulomb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'picocoulomb', {
      configurable: true,
      get: get_picocoulomb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'fC', {
      configurable: true,
      get: get_fC
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'femtocoulomb', {
      configurable: true,
      get: get_femtocoulomb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'aC', {
      configurable: true,
      get: get_aC
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'attocoulomb', {
      configurable: true,
      get: get_attocoulomb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zeptocoulomb', {
      configurable: true,
      get: get_zeptocoulomb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yoctocoulomb', {
      configurable: true,
      get: get_yoctocoulomb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'rontocoulomb', {
      configurable: true,
      get: get_rontocoulomb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quectocoulomb', {
      configurable: true,
      get: get_quectocoulomb
    });
    $eu$sirotin$kotunil$derived.Coulomb = Coulomb;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$derived = $eu$sirotin$kotunil.derived || ($eu$sirotin$kotunil.derived = {});
    Object.defineProperty($eu$sirotin$kotunil$derived, 'F', {
      configurable: true,
      get: get_F
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'QF', {
      configurable: true,
      get: get_QF
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quettafarad', {
      configurable: true,
      get: get_quettafarad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'RF', {
      configurable: true,
      get: get_RF
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ronnafarad', {
      configurable: true,
      get: get_ronnafarad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'YF', {
      configurable: true,
      get: get_YF
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yottafarad', {
      configurable: true,
      get: get_yottafarad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ZF', {
      configurable: true,
      get: get_ZF
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zettafarad', {
      configurable: true,
      get: get_zettafarad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'EF', {
      configurable: true,
      get: get_EF
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'exafarad', {
      configurable: true,
      get: get_exafarad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'PF', {
      configurable: true,
      get: get_PF
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'petafarad', {
      configurable: true,
      get: get_petafarad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'TF', {
      configurable: true,
      get: get_TF
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'terafarad', {
      configurable: true,
      get: get_terafarad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'GF', {
      configurable: true,
      get: get_GF
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'gigafarad', {
      configurable: true,
      get: get_gigafarad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'MF', {
      configurable: true,
      get: get_MF
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'megafarad', {
      configurable: true,
      get: get_megafarad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kF', {
      configurable: true,
      get: get_kF
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kilofarad', {
      configurable: true,
      get: get_kilofarad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hF', {
      configurable: true,
      get: get_hF
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hectofarad', {
      configurable: true,
      get: get_hectofarad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'daF', {
      configurable: true,
      get: get_daF
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decafarad', {
      configurable: true,
      get: get_decafarad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'dF', {
      configurable: true,
      get: get_dF
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decifarad', {
      configurable: true,
      get: get_decifarad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'cF', {
      configurable: true,
      get: get_cF
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'centifarad', {
      configurable: true,
      get: get_centifarad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'millifarad', {
      configurable: true,
      get: get_millifarad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, '\u03BCF', {
      configurable: true,
      get: get_μF
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'microfarad', {
      configurable: true,
      get: get_microfarad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nF', {
      configurable: true,
      get: get_nF
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nanofarad', {
      configurable: true,
      get: get_nanofarad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'picofarad', {
      configurable: true,
      get: get_picofarad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'fF', {
      configurable: true,
      get: get_fF
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'femtofarad', {
      configurable: true,
      get: get_femtofarad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'aF', {
      configurable: true,
      get: get_aF
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'attofarad', {
      configurable: true,
      get: get_attofarad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zeptofarad', {
      configurable: true,
      get: get_zeptofarad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yoctofarad', {
      configurable: true,
      get: get_yoctofarad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'rontofarad', {
      configurable: true,
      get: get_rontofarad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quectofarad', {
      configurable: true,
      get: get_quectofarad
    });
    $eu$sirotin$kotunil$derived.Farad = Farad;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$derived = $eu$sirotin$kotunil.derived || ($eu$sirotin$kotunil.derived = {});
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Gy', {
      configurable: true,
      get: get_Gy
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'QGy', {
      configurable: true,
      get: get_QGy
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quettagray', {
      configurable: true,
      get: get_quettagray
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'RGy', {
      configurable: true,
      get: get_RGy
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ronnagray', {
      configurable: true,
      get: get_ronnagray
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'YGy', {
      configurable: true,
      get: get_YGy
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yottagray', {
      configurable: true,
      get: get_yottagray
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ZGy', {
      configurable: true,
      get: get_ZGy
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zettagray', {
      configurable: true,
      get: get_zettagray
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'EGy', {
      configurable: true,
      get: get_EGy
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'exagray', {
      configurable: true,
      get: get_exagray
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'PGy', {
      configurable: true,
      get: get_PGy
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'petagray', {
      configurable: true,
      get: get_petagray
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'TGy', {
      configurable: true,
      get: get_TGy
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'teragray', {
      configurable: true,
      get: get_teragray
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'GGy', {
      configurable: true,
      get: get_GGy
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'gigagray', {
      configurable: true,
      get: get_gigagray
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'MGy', {
      configurable: true,
      get: get_MGy
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'megagray', {
      configurable: true,
      get: get_megagray
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kGy', {
      configurable: true,
      get: get_kGy
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kilogray', {
      configurable: true,
      get: get_kilogray
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hGy', {
      configurable: true,
      get: get_hGy
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hectogray', {
      configurable: true,
      get: get_hectogray
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'daGy', {
      configurable: true,
      get: get_daGy
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decagray', {
      configurable: true,
      get: get_decagray
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'dGy', {
      configurable: true,
      get: get_dGy
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decigray', {
      configurable: true,
      get: get_decigray
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'cGy', {
      configurable: true,
      get: get_cGy
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'centigray', {
      configurable: true,
      get: get_centigray
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'milligray', {
      configurable: true,
      get: get_milligray
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, '\u03BCGy', {
      configurable: true,
      get: get_μGy
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'microgray', {
      configurable: true,
      get: get_microgray
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nGy', {
      configurable: true,
      get: get_nGy
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nanogray', {
      configurable: true,
      get: get_nanogray
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'picogray', {
      configurable: true,
      get: get_picogray
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'fGy', {
      configurable: true,
      get: get_fGy
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'femtogray', {
      configurable: true,
      get: get_femtogray
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'aGy', {
      configurable: true,
      get: get_aGy
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'attogray', {
      configurable: true,
      get: get_attogray
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zeptogray', {
      configurable: true,
      get: get_zeptogray
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yoctogray', {
      configurable: true,
      get: get_yoctogray
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'rontogray', {
      configurable: true,
      get: get_rontogray
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quectogray', {
      configurable: true,
      get: get_quectogray
    });
    $eu$sirotin$kotunil$derived.Gray = Gray;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$derived = $eu$sirotin$kotunil.derived || ($eu$sirotin$kotunil.derived = {});
    Object.defineProperty($eu$sirotin$kotunil$derived, 'H', {
      configurable: true,
      get: get_H
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'QH', {
      configurable: true,
      get: get_QH
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quettahenry', {
      configurable: true,
      get: get_quettahenry
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'RH', {
      configurable: true,
      get: get_RH
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ronnahenry', {
      configurable: true,
      get: get_ronnahenry
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'YH', {
      configurable: true,
      get: get_YH
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yottahenry', {
      configurable: true,
      get: get_yottahenry
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ZH', {
      configurable: true,
      get: get_ZH
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zettahenry', {
      configurable: true,
      get: get_zettahenry
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'EH', {
      configurable: true,
      get: get_EH
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'exahenry', {
      configurable: true,
      get: get_exahenry
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'PH', {
      configurable: true,
      get: get_PH
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'petahenry', {
      configurable: true,
      get: get_petahenry
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'TH', {
      configurable: true,
      get: get_TH
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'terahenry', {
      configurable: true,
      get: get_terahenry
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'GH', {
      configurable: true,
      get: get_GH
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'gigahenry', {
      configurable: true,
      get: get_gigahenry
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'MH', {
      configurable: true,
      get: get_MH
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'megahenry', {
      configurable: true,
      get: get_megahenry
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kH', {
      configurable: true,
      get: get_kH
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kilohenry', {
      configurable: true,
      get: get_kilohenry
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hH', {
      configurable: true,
      get: get_hH
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hectohenry', {
      configurable: true,
      get: get_hectohenry
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'daH', {
      configurable: true,
      get: get_daH
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decahenry', {
      configurable: true,
      get: get_decahenry
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'dH', {
      configurable: true,
      get: get_dH
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decihenry', {
      configurable: true,
      get: get_decihenry
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'cH', {
      configurable: true,
      get: get_cH
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'centihenry', {
      configurable: true,
      get: get_centihenry
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'millihenry', {
      configurable: true,
      get: get_millihenry
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, '\u03BCH', {
      configurable: true,
      get: get_μH
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'microhenry', {
      configurable: true,
      get: get_microhenry
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nH', {
      configurable: true,
      get: get_nH
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nanohenry', {
      configurable: true,
      get: get_nanohenry
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'picohenry', {
      configurable: true,
      get: get_picohenry
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'fH', {
      configurable: true,
      get: get_fH
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'femtohenry', {
      configurable: true,
      get: get_femtohenry
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'aH', {
      configurable: true,
      get: get_aH
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'attohenry', {
      configurable: true,
      get: get_attohenry
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zeptohenry', {
      configurable: true,
      get: get_zeptohenry
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yoctohenry', {
      configurable: true,
      get: get_yoctohenry
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'rontohenry', {
      configurable: true,
      get: get_rontohenry
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quectohenry', {
      configurable: true,
      get: get_quectohenry
    });
    $eu$sirotin$kotunil$derived.Henry = Henry;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$derived = $eu$sirotin$kotunil.derived || ($eu$sirotin$kotunil.derived = {});
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Hz', {
      configurable: true,
      get: get_Hz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'QHz', {
      configurable: true,
      get: get_QHz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quettahertz', {
      configurable: true,
      get: get_quettahertz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'RHz', {
      configurable: true,
      get: get_RHz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ronnahertz', {
      configurable: true,
      get: get_ronnahertz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'YHz', {
      configurable: true,
      get: get_YHz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yottahertz', {
      configurable: true,
      get: get_yottahertz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ZHz', {
      configurable: true,
      get: get_ZHz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zettahertz', {
      configurable: true,
      get: get_zettahertz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'EHz', {
      configurable: true,
      get: get_EHz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'exahertz', {
      configurable: true,
      get: get_exahertz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'PHz', {
      configurable: true,
      get: get_PHz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'petahertz', {
      configurable: true,
      get: get_petahertz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'THz', {
      configurable: true,
      get: get_THz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'terahertz', {
      configurable: true,
      get: get_terahertz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'GHz', {
      configurable: true,
      get: get_GHz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'gigahertz', {
      configurable: true,
      get: get_gigahertz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'MHz', {
      configurable: true,
      get: get_MHz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'megahertz', {
      configurable: true,
      get: get_megahertz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kHz', {
      configurable: true,
      get: get_kHz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kilohertz', {
      configurable: true,
      get: get_kilohertz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hHz', {
      configurable: true,
      get: get_hHz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hectohertz', {
      configurable: true,
      get: get_hectohertz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'daHz', {
      configurable: true,
      get: get_daHz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decahertz', {
      configurable: true,
      get: get_decahertz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'dHz', {
      configurable: true,
      get: get_dHz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decihertz', {
      configurable: true,
      get: get_decihertz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'cHz', {
      configurable: true,
      get: get_cHz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'centihertz', {
      configurable: true,
      get: get_centihertz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'millihertz', {
      configurable: true,
      get: get_millihertz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, '\u03BCHz', {
      configurable: true,
      get: get_μHz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'microhertz', {
      configurable: true,
      get: get_microhertz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nHz', {
      configurable: true,
      get: get_nHz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nanohertz', {
      configurable: true,
      get: get_nanohertz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'picohertz', {
      configurable: true,
      get: get_picohertz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'fHz', {
      configurable: true,
      get: get_fHz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'femtohertz', {
      configurable: true,
      get: get_femtohertz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'aHz', {
      configurable: true,
      get: get_aHz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'attohertz', {
      configurable: true,
      get: get_attohertz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zeptohertz', {
      configurable: true,
      get: get_zeptohertz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yoctohertz', {
      configurable: true,
      get: get_yoctohertz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'rontohertz', {
      configurable: true,
      get: get_rontohertz
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quectohertz', {
      configurable: true,
      get: get_quectohertz
    });
    $eu$sirotin$kotunil$derived.Hertz = Hertz;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$derived = $eu$sirotin$kotunil.derived || ($eu$sirotin$kotunil.derived = {});
    Object.defineProperty($eu$sirotin$kotunil$derived, 'J', {
      configurable: true,
      get: get_J
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'QJ', {
      configurable: true,
      get: get_QJ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quettajoule', {
      configurable: true,
      get: get_quettajoule
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'RJ', {
      configurable: true,
      get: get_RJ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ronnajoule', {
      configurable: true,
      get: get_ronnajoule
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'YJ', {
      configurable: true,
      get: get_YJ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yottajoule', {
      configurable: true,
      get: get_yottajoule
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ZJ', {
      configurable: true,
      get: get_ZJ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zettajoule', {
      configurable: true,
      get: get_zettajoule
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'EJ', {
      configurable: true,
      get: get_EJ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'exajoule', {
      configurable: true,
      get: get_exajoule
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'PJ', {
      configurable: true,
      get: get_PJ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'petajoule', {
      configurable: true,
      get: get_petajoule
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'TJ', {
      configurable: true,
      get: get_TJ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'terajoule', {
      configurable: true,
      get: get_terajoule
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'GJ', {
      configurable: true,
      get: get_GJ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'gigajoule', {
      configurable: true,
      get: get_gigajoule
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'MJ', {
      configurable: true,
      get: get_MJ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'megajoule', {
      configurable: true,
      get: get_megajoule
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kJ', {
      configurable: true,
      get: get_kJ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kilojoule', {
      configurable: true,
      get: get_kilojoule
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hJ', {
      configurable: true,
      get: get_hJ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hectojoule', {
      configurable: true,
      get: get_hectojoule
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'daJ', {
      configurable: true,
      get: get_daJ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decajoule', {
      configurable: true,
      get: get_decajoule
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'dJ', {
      configurable: true,
      get: get_dJ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decijoule', {
      configurable: true,
      get: get_decijoule
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'cJ', {
      configurable: true,
      get: get_cJ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'centijoule', {
      configurable: true,
      get: get_centijoule
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'millijoule', {
      configurable: true,
      get: get_millijoule
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, '\u03BCJ', {
      configurable: true,
      get: get_μJ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'microjoule', {
      configurable: true,
      get: get_microjoule
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nJ', {
      configurable: true,
      get: get_nJ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nanojoule', {
      configurable: true,
      get: get_nanojoule
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'picojoule', {
      configurable: true,
      get: get_picojoule
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'fJ', {
      configurable: true,
      get: get_fJ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'femtojoule', {
      configurable: true,
      get: get_femtojoule
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'aJ', {
      configurable: true,
      get: get_aJ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'attojoule', {
      configurable: true,
      get: get_attojoule
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zeptojoule', {
      configurable: true,
      get: get_zeptojoule
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yoctojoule', {
      configurable: true,
      get: get_yoctojoule
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'rontojoule', {
      configurable: true,
      get: get_rontojoule
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quectojoule', {
      configurable: true,
      get: get_quectojoule
    });
    $eu$sirotin$kotunil$derived.Joule = Joule;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$derived = $eu$sirotin$kotunil.derived || ($eu$sirotin$kotunil.derived = {});
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kat', {
      configurable: true,
      get: get_kat
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Qkat', {
      configurable: true,
      get: get_Qkat
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quettakatal', {
      configurable: true,
      get: get_quettakatal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Rkat', {
      configurable: true,
      get: get_Rkat
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ronnakatal', {
      configurable: true,
      get: get_ronnakatal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Ykat', {
      configurable: true,
      get: get_Ykat
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yottakatal', {
      configurable: true,
      get: get_yottakatal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Zkat', {
      configurable: true,
      get: get_Zkat
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zettakatal', {
      configurable: true,
      get: get_zettakatal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Ekat', {
      configurable: true,
      get: get_Ekat
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'exakatal', {
      configurable: true,
      get: get_exakatal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Pkat', {
      configurable: true,
      get: get_Pkat
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'petakatal', {
      configurable: true,
      get: get_petakatal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Tkat', {
      configurable: true,
      get: get_Tkat
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'terakatal', {
      configurable: true,
      get: get_terakatal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Gkat', {
      configurable: true,
      get: get_Gkat
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'gigakatal', {
      configurable: true,
      get: get_gigakatal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Mkat', {
      configurable: true,
      get: get_Mkat
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'megakatal', {
      configurable: true,
      get: get_megakatal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kkat', {
      configurable: true,
      get: get_kkat
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kilokatal', {
      configurable: true,
      get: get_kilokatal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hkat', {
      configurable: true,
      get: get_hkat
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hectokatal', {
      configurable: true,
      get: get_hectokatal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'dakat', {
      configurable: true,
      get: get_dakat
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decakatal', {
      configurable: true,
      get: get_decakatal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'dkat', {
      configurable: true,
      get: get_dkat
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decikatal', {
      configurable: true,
      get: get_decikatal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ckat', {
      configurable: true,
      get: get_ckat
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'centikatal', {
      configurable: true,
      get: get_centikatal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'millikatal', {
      configurable: true,
      get: get_millikatal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, '\u03BCkat', {
      configurable: true,
      get: get_μkat
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'microkatal', {
      configurable: true,
      get: get_microkatal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nkat', {
      configurable: true,
      get: get_nkat
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nanokatal', {
      configurable: true,
      get: get_nanokatal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'picokatal', {
      configurable: true,
      get: get_picokatal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'fkat', {
      configurable: true,
      get: get_fkat
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'femtokatal', {
      configurable: true,
      get: get_femtokatal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'akat', {
      configurable: true,
      get: get_akat
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'attokatal', {
      configurable: true,
      get: get_attokatal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zeptokatal', {
      configurable: true,
      get: get_zeptokatal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yoctokatal', {
      configurable: true,
      get: get_yoctokatal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'rontokatal', {
      configurable: true,
      get: get_rontokatal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quectokatal', {
      configurable: true,
      get: get_quectokatal
    });
    $eu$sirotin$kotunil$derived.Katal = Katal;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$derived = $eu$sirotin$kotunil.derived || ($eu$sirotin$kotunil.derived = {});
    Object.defineProperty($eu$sirotin$kotunil$derived, 'lm', {
      configurable: true,
      get: get_lm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Qlm', {
      configurable: true,
      get: get_Qlm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quettalumen', {
      configurable: true,
      get: get_quettalumen
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Rlm', {
      configurable: true,
      get: get_Rlm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ronnalumen', {
      configurable: true,
      get: get_ronnalumen
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Ylm', {
      configurable: true,
      get: get_Ylm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yottalumen', {
      configurable: true,
      get: get_yottalumen
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Zlm', {
      configurable: true,
      get: get_Zlm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zettalumen', {
      configurable: true,
      get: get_zettalumen
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Elm', {
      configurable: true,
      get: get_Elm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'exalumen', {
      configurable: true,
      get: get_exalumen
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Plm', {
      configurable: true,
      get: get_Plm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'petalumen', {
      configurable: true,
      get: get_petalumen
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Tlm', {
      configurable: true,
      get: get_Tlm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'teralumen', {
      configurable: true,
      get: get_teralumen
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Glm', {
      configurable: true,
      get: get_Glm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'gigalumen', {
      configurable: true,
      get: get_gigalumen
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Mlm', {
      configurable: true,
      get: get_Mlm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'megalumen', {
      configurable: true,
      get: get_megalumen
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'klm', {
      configurable: true,
      get: get_klm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kilolumen', {
      configurable: true,
      get: get_kilolumen
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hlm', {
      configurable: true,
      get: get_hlm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hectolumen', {
      configurable: true,
      get: get_hectolumen
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'dalm', {
      configurable: true,
      get: get_dalm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decalumen', {
      configurable: true,
      get: get_decalumen
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'dlm', {
      configurable: true,
      get: get_dlm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decilumen', {
      configurable: true,
      get: get_decilumen
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'clm', {
      configurable: true,
      get: get_clm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'centilumen', {
      configurable: true,
      get: get_centilumen
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'millilumen', {
      configurable: true,
      get: get_millilumen
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, '\u03BClm', {
      configurable: true,
      get: get_μlm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'microlumen', {
      configurable: true,
      get: get_microlumen
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nlm', {
      configurable: true,
      get: get_nlm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nanolumen', {
      configurable: true,
      get: get_nanolumen
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'picolumen', {
      configurable: true,
      get: get_picolumen
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'flm', {
      configurable: true,
      get: get_flm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'femtolumen', {
      configurable: true,
      get: get_femtolumen
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'alm', {
      configurable: true,
      get: get_alm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'attolumen', {
      configurable: true,
      get: get_attolumen
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zeptolumen', {
      configurable: true,
      get: get_zeptolumen
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yoctolumen', {
      configurable: true,
      get: get_yoctolumen
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'rontolumen', {
      configurable: true,
      get: get_rontolumen
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quectolumen', {
      configurable: true,
      get: get_quectolumen
    });
    $eu$sirotin$kotunil$derived.Lumen = Lumen;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$derived = $eu$sirotin$kotunil.derived || ($eu$sirotin$kotunil.derived = {});
    Object.defineProperty($eu$sirotin$kotunil$derived, 'lx', {
      configurable: true,
      get: get_lx
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Qlx', {
      configurable: true,
      get: get_Qlx
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quettalux', {
      configurable: true,
      get: get_quettalux
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Rlx', {
      configurable: true,
      get: get_Rlx
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ronnalux', {
      configurable: true,
      get: get_ronnalux
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Ylx', {
      configurable: true,
      get: get_Ylx
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yottalux', {
      configurable: true,
      get: get_yottalux
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Zlx', {
      configurable: true,
      get: get_Zlx
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zettalux', {
      configurable: true,
      get: get_zettalux
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Elx', {
      configurable: true,
      get: get_Elx
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'exalux', {
      configurable: true,
      get: get_exalux
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Plx', {
      configurable: true,
      get: get_Plx
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'petalux', {
      configurable: true,
      get: get_petalux
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Tlx', {
      configurable: true,
      get: get_Tlx
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'teralux', {
      configurable: true,
      get: get_teralux
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Glx', {
      configurable: true,
      get: get_Glx
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'gigalux', {
      configurable: true,
      get: get_gigalux
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Mlx', {
      configurable: true,
      get: get_Mlx
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'megalux', {
      configurable: true,
      get: get_megalux
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'klx', {
      configurable: true,
      get: get_klx
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kilolux', {
      configurable: true,
      get: get_kilolux
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hlx', {
      configurable: true,
      get: get_hlx
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hectolux', {
      configurable: true,
      get: get_hectolux
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'dalx', {
      configurable: true,
      get: get_dalx
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decalux', {
      configurable: true,
      get: get_decalux
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'dlx', {
      configurable: true,
      get: get_dlx
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decilux', {
      configurable: true,
      get: get_decilux
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'clx', {
      configurable: true,
      get: get_clx
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'centilux', {
      configurable: true,
      get: get_centilux
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'millilux', {
      configurable: true,
      get: get_millilux
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, '\u03BClx', {
      configurable: true,
      get: get_μlx
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'microlux', {
      configurable: true,
      get: get_microlux
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nlx', {
      configurable: true,
      get: get_nlx
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nanolux', {
      configurable: true,
      get: get_nanolux
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'picolux', {
      configurable: true,
      get: get_picolux
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'flx', {
      configurable: true,
      get: get_flx
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'femtolux', {
      configurable: true,
      get: get_femtolux
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'alx', {
      configurable: true,
      get: get_alx
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'attolux', {
      configurable: true,
      get: get_attolux
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zeptolux', {
      configurable: true,
      get: get_zeptolux
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yoctolux', {
      configurable: true,
      get: get_yoctolux
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'rontolux', {
      configurable: true,
      get: get_rontolux
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quectolux', {
      configurable: true,
      get: get_quectolux
    });
    $eu$sirotin$kotunil$derived.Lux = Lux;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$derived = $eu$sirotin$kotunil.derived || ($eu$sirotin$kotunil.derived = {});
    Object.defineProperty($eu$sirotin$kotunil$derived, 'N', {
      configurable: true,
      get: get_N
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'QN', {
      configurable: true,
      get: get_QN
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quettanewton', {
      configurable: true,
      get: get_quettanewton
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'RN', {
      configurable: true,
      get: get_RN
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ronnanewton', {
      configurable: true,
      get: get_ronnanewton
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'YN', {
      configurable: true,
      get: get_YN
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yottanewton', {
      configurable: true,
      get: get_yottanewton
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ZN', {
      configurable: true,
      get: get_ZN
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zettanewton', {
      configurable: true,
      get: get_zettanewton
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'EN', {
      configurable: true,
      get: get_EN
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'exanewton', {
      configurable: true,
      get: get_exanewton
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'PN', {
      configurable: true,
      get: get_PN
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'petanewton', {
      configurable: true,
      get: get_petanewton
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'TN', {
      configurable: true,
      get: get_TN
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'teranewton', {
      configurable: true,
      get: get_teranewton
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'GN', {
      configurable: true,
      get: get_GN
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'giganewton', {
      configurable: true,
      get: get_giganewton
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'MN', {
      configurable: true,
      get: get_MN
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'meganewton', {
      configurable: true,
      get: get_meganewton
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kN', {
      configurable: true,
      get: get_kN
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kilonewton', {
      configurable: true,
      get: get_kilonewton
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hN', {
      configurable: true,
      get: get_hN
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hectonewton', {
      configurable: true,
      get: get_hectonewton
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'daN', {
      configurable: true,
      get: get_daN
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decanewton', {
      configurable: true,
      get: get_decanewton
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'dN', {
      configurable: true,
      get: get_dN
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decinewton', {
      configurable: true,
      get: get_decinewton
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'cN', {
      configurable: true,
      get: get_cN
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'centinewton', {
      configurable: true,
      get: get_centinewton
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'millinewton', {
      configurable: true,
      get: get_millinewton
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, '\u03BCN', {
      configurable: true,
      get: get_μN
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'micronewton', {
      configurable: true,
      get: get_micronewton
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nN', {
      configurable: true,
      get: get_nN
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nanonewton', {
      configurable: true,
      get: get_nanonewton
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'piconewton', {
      configurable: true,
      get: get_piconewton
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'fN', {
      configurable: true,
      get: get_fN
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'femtonewton', {
      configurable: true,
      get: get_femtonewton
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'aN', {
      configurable: true,
      get: get_aN
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'attonewton', {
      configurable: true,
      get: get_attonewton
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zeptonewton', {
      configurable: true,
      get: get_zeptonewton
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yoctonewton', {
      configurable: true,
      get: get_yoctonewton
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'rontonewton', {
      configurable: true,
      get: get_rontonewton
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quectonewton', {
      configurable: true,
      get: get_quectonewton
    });
    $eu$sirotin$kotunil$derived.Newton = Newton;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$derived = $eu$sirotin$kotunil.derived || ($eu$sirotin$kotunil.derived = {});
    Object.defineProperty($eu$sirotin$kotunil$derived, '\u03A9', {
      configurable: true,
      get: get_Ω
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Q\u03A9', {
      configurable: true,
      get: get_QΩ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quettaohm', {
      configurable: true,
      get: get_quettaohm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'R\u03A9', {
      configurable: true,
      get: get_RΩ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ronnaohm', {
      configurable: true,
      get: get_ronnaohm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Y\u03A9', {
      configurable: true,
      get: get_YΩ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yottaohm', {
      configurable: true,
      get: get_yottaohm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Z\u03A9', {
      configurable: true,
      get: get_ZΩ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zettaohm', {
      configurable: true,
      get: get_zettaohm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'E\u03A9', {
      configurable: true,
      get: get_EΩ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'exaohm', {
      configurable: true,
      get: get_exaohm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'P\u03A9', {
      configurable: true,
      get: get_PΩ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'petaohm', {
      configurable: true,
      get: get_petaohm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'T\u03A9', {
      configurable: true,
      get: get_TΩ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'teraohm', {
      configurable: true,
      get: get_teraohm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'G\u03A9', {
      configurable: true,
      get: get_GΩ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'gigaohm', {
      configurable: true,
      get: get_gigaohm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'M\u03A9', {
      configurable: true,
      get: get_MΩ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'megaohm', {
      configurable: true,
      get: get_megaohm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'k\u03A9', {
      configurable: true,
      get: get_kΩ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kiloohm', {
      configurable: true,
      get: get_kiloohm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'h\u03A9', {
      configurable: true,
      get: get_hΩ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hectoohm', {
      configurable: true,
      get: get_hectoohm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'da\u03A9', {
      configurable: true,
      get: get_daΩ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decaohm', {
      configurable: true,
      get: get_decaohm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'd\u03A9', {
      configurable: true,
      get: get_dΩ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'deciohm', {
      configurable: true,
      get: get_deciohm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'c\u03A9', {
      configurable: true,
      get: get_cΩ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'centiohm', {
      configurable: true,
      get: get_centiohm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'milliohm', {
      configurable: true,
      get: get_milliohm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, '\u03BC\u03A9', {
      configurable: true,
      get: get_μΩ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'microohm', {
      configurable: true,
      get: get_microohm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'n\u03A9', {
      configurable: true,
      get: get_nΩ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nanoohm', {
      configurable: true,
      get: get_nanoohm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'picoohm', {
      configurable: true,
      get: get_picoohm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'f\u03A9', {
      configurable: true,
      get: get_fΩ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'femtoohm', {
      configurable: true,
      get: get_femtoohm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'a\u03A9', {
      configurable: true,
      get: get_aΩ
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'attoohm', {
      configurable: true,
      get: get_attoohm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zeptoohm', {
      configurable: true,
      get: get_zeptoohm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yoctoohm', {
      configurable: true,
      get: get_yoctoohm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'rontoohm', {
      configurable: true,
      get: get_rontoohm
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quectoohm', {
      configurable: true,
      get: get_quectoohm
    });
    $eu$sirotin$kotunil$derived.Ohm = Ohm;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$derived = $eu$sirotin$kotunil.derived || ($eu$sirotin$kotunil.derived = {});
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Pa', {
      configurable: true,
      get: get_Pa
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'QPa', {
      configurable: true,
      get: get_QPa
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quettapascal', {
      configurable: true,
      get: get_quettapascal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'RPa', {
      configurable: true,
      get: get_RPa
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ronnapascal', {
      configurable: true,
      get: get_ronnapascal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'YPa', {
      configurable: true,
      get: get_YPa
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yottapascal', {
      configurable: true,
      get: get_yottapascal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ZPa', {
      configurable: true,
      get: get_ZPa
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zettapascal', {
      configurable: true,
      get: get_zettapascal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'EPa', {
      configurable: true,
      get: get_EPa
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'exapascal', {
      configurable: true,
      get: get_exapascal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'PPa', {
      configurable: true,
      get: get_PPa
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'petapascal', {
      configurable: true,
      get: get_petapascal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'TPa', {
      configurable: true,
      get: get_TPa
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'terapascal', {
      configurable: true,
      get: get_terapascal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'GPa', {
      configurable: true,
      get: get_GPa
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'gigapascal', {
      configurable: true,
      get: get_gigapascal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'MPa', {
      configurable: true,
      get: get_MPa
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'megapascal', {
      configurable: true,
      get: get_megapascal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kPa', {
      configurable: true,
      get: get_kPa
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kilopascal', {
      configurable: true,
      get: get_kilopascal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hPa', {
      configurable: true,
      get: get_hPa
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hectopascal', {
      configurable: true,
      get: get_hectopascal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'daPa', {
      configurable: true,
      get: get_daPa
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decapascal', {
      configurable: true,
      get: get_decapascal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'dPa', {
      configurable: true,
      get: get_dPa
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decipascal', {
      configurable: true,
      get: get_decipascal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'cPa', {
      configurable: true,
      get: get_cPa
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'centipascal', {
      configurable: true,
      get: get_centipascal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'millipascal', {
      configurable: true,
      get: get_millipascal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, '\u03BCPa', {
      configurable: true,
      get: get_μPa
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'micropascal', {
      configurable: true,
      get: get_micropascal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nPa', {
      configurable: true,
      get: get_nPa
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nanopascal', {
      configurable: true,
      get: get_nanopascal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'picopascal', {
      configurable: true,
      get: get_picopascal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'fPa', {
      configurable: true,
      get: get_fPa
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'femtopascal', {
      configurable: true,
      get: get_femtopascal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'aPa', {
      configurable: true,
      get: get_aPa
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'attopascal', {
      configurable: true,
      get: get_attopascal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zeptopascal', {
      configurable: true,
      get: get_zeptopascal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yoctopascal', {
      configurable: true,
      get: get_yoctopascal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'rontopascal', {
      configurable: true,
      get: get_rontopascal
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quectopascal', {
      configurable: true,
      get: get_quectopascal
    });
    $eu$sirotin$kotunil$derived.Pascal = Pascal;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$derived = $eu$sirotin$kotunil.derived || ($eu$sirotin$kotunil.derived = {});
    Object.defineProperty($eu$sirotin$kotunil$derived, 'rad', {
      configurable: true,
      get: get_rad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Qrad', {
      configurable: true,
      get: get_Qrad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quettaradian', {
      configurable: true,
      get: get_quettaradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Rrad', {
      configurable: true,
      get: get_Rrad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ronnaradian', {
      configurable: true,
      get: get_ronnaradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Yrad', {
      configurable: true,
      get: get_Yrad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yottaradian', {
      configurable: true,
      get: get_yottaradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Zrad', {
      configurable: true,
      get: get_Zrad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zettaradian', {
      configurable: true,
      get: get_zettaradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Erad', {
      configurable: true,
      get: get_Erad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'exaradian', {
      configurable: true,
      get: get_exaradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Prad', {
      configurable: true,
      get: get_Prad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'petaradian', {
      configurable: true,
      get: get_petaradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Trad', {
      configurable: true,
      get: get_Trad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'teraradian', {
      configurable: true,
      get: get_teraradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Grad', {
      configurable: true,
      get: get_Grad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'gigaradian', {
      configurable: true,
      get: get_gigaradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Mrad', {
      configurable: true,
      get: get_Mrad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'megaradian', {
      configurable: true,
      get: get_megaradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'krad', {
      configurable: true,
      get: get_krad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kiloradian', {
      configurable: true,
      get: get_kiloradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hrad', {
      configurable: true,
      get: get_hrad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hectoradian', {
      configurable: true,
      get: get_hectoradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'darad', {
      configurable: true,
      get: get_darad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decaradian', {
      configurable: true,
      get: get_decaradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'drad', {
      configurable: true,
      get: get_drad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'deciradian', {
      configurable: true,
      get: get_deciradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'crad', {
      configurable: true,
      get: get_crad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'centiradian', {
      configurable: true,
      get: get_centiradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'milliradian', {
      configurable: true,
      get: get_milliradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, '\u03BCrad', {
      configurable: true,
      get: get_μrad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'microradian', {
      configurable: true,
      get: get_microradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nrad', {
      configurable: true,
      get: get_nrad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nanoradian', {
      configurable: true,
      get: get_nanoradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'picoradian', {
      configurable: true,
      get: get_picoradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'frad', {
      configurable: true,
      get: get_frad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'femtoradian', {
      configurable: true,
      get: get_femtoradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'arad', {
      configurable: true,
      get: get_arad
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'attoradian', {
      configurable: true,
      get: get_attoradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zeptoradian', {
      configurable: true,
      get: get_zeptoradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yoctoradian', {
      configurable: true,
      get: get_yoctoradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'rontoradian', {
      configurable: true,
      get: get_rontoradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quectoradian', {
      configurable: true,
      get: get_quectoradian
    });
    $eu$sirotin$kotunil$derived.Radian = Radian;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$derived = $eu$sirotin$kotunil.derived || ($eu$sirotin$kotunil.derived = {});
    Object.defineProperty($eu$sirotin$kotunil$derived, 'S', {
      configurable: true,
      get: get_S
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'QS', {
      configurable: true,
      get: get_QS
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quettasiemens', {
      configurable: true,
      get: get_quettasiemens
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'RS', {
      configurable: true,
      get: get_RS
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ronnasiemens', {
      configurable: true,
      get: get_ronnasiemens
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'YS', {
      configurable: true,
      get: get_YS
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yottasiemens', {
      configurable: true,
      get: get_yottasiemens
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ZS', {
      configurable: true,
      get: get_ZS
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zettasiemens', {
      configurable: true,
      get: get_zettasiemens
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ES', {
      configurable: true,
      get: get_ES
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'exasiemens', {
      configurable: true,
      get: get_exasiemens
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'PS', {
      configurable: true,
      get: get_PS
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'petasiemens', {
      configurable: true,
      get: get_petasiemens
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'TS', {
      configurable: true,
      get: get_TS
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'terasiemens', {
      configurable: true,
      get: get_terasiemens
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'GS', {
      configurable: true,
      get: get_GS
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'gigasiemens', {
      configurable: true,
      get: get_gigasiemens
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'MS', {
      configurable: true,
      get: get_MS
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'megasiemens', {
      configurable: true,
      get: get_megasiemens
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kS', {
      configurable: true,
      get: get_kS
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kilosiemens', {
      configurable: true,
      get: get_kilosiemens
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hS', {
      configurable: true,
      get: get_hS
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hectosiemens', {
      configurable: true,
      get: get_hectosiemens
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'daS', {
      configurable: true,
      get: get_daS
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decasiemens', {
      configurable: true,
      get: get_decasiemens
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'dS', {
      configurable: true,
      get: get_dS
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decisiemens', {
      configurable: true,
      get: get_decisiemens
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'cS', {
      configurable: true,
      get: get_cS
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'centisiemens', {
      configurable: true,
      get: get_centisiemens
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'millisiemens', {
      configurable: true,
      get: get_millisiemens
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, '\u03BCS', {
      configurable: true,
      get: get_μS
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'microsiemens', {
      configurable: true,
      get: get_microsiemens
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nS', {
      configurable: true,
      get: get_nS
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nanosiemens', {
      configurable: true,
      get: get_nanosiemens
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'picosiemens', {
      configurable: true,
      get: get_picosiemens
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'fS', {
      configurable: true,
      get: get_fS
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'femtosiemens', {
      configurable: true,
      get: get_femtosiemens
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'aS', {
      configurable: true,
      get: get_aS
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'attosiemens', {
      configurable: true,
      get: get_attosiemens
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zeptosiemens', {
      configurable: true,
      get: get_zeptosiemens
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yoctosiemens', {
      configurable: true,
      get: get_yoctosiemens
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'rontosiemens', {
      configurable: true,
      get: get_rontosiemens
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quectosiemens', {
      configurable: true,
      get: get_quectosiemens
    });
    $eu$sirotin$kotunil$derived.Siemens = Siemens;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$derived = $eu$sirotin$kotunil.derived || ($eu$sirotin$kotunil.derived = {});
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Sv', {
      configurable: true,
      get: get_Sv
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'QSv', {
      configurable: true,
      get: get_QSv
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quettasievert', {
      configurable: true,
      get: get_quettasievert
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'RSv', {
      configurable: true,
      get: get_RSv
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ronnasievert', {
      configurable: true,
      get: get_ronnasievert
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'YSv', {
      configurable: true,
      get: get_YSv
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yottasievert', {
      configurable: true,
      get: get_yottasievert
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ZSv', {
      configurable: true,
      get: get_ZSv
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zettasievert', {
      configurable: true,
      get: get_zettasievert
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ESv', {
      configurable: true,
      get: get_ESv
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'exasievert', {
      configurable: true,
      get: get_exasievert
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'PSv', {
      configurable: true,
      get: get_PSv
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'petasievert', {
      configurable: true,
      get: get_petasievert
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'TSv', {
      configurable: true,
      get: get_TSv
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'terasievert', {
      configurable: true,
      get: get_terasievert
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'GSv', {
      configurable: true,
      get: get_GSv
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'gigasievert', {
      configurable: true,
      get: get_gigasievert
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'MSv', {
      configurable: true,
      get: get_MSv
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'megasievert', {
      configurable: true,
      get: get_megasievert
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kSv', {
      configurable: true,
      get: get_kSv
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kilosievert', {
      configurable: true,
      get: get_kilosievert
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hSv', {
      configurable: true,
      get: get_hSv
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hectosievert', {
      configurable: true,
      get: get_hectosievert
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'daSv', {
      configurable: true,
      get: get_daSv
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decasievert', {
      configurable: true,
      get: get_decasievert
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'dSv', {
      configurable: true,
      get: get_dSv
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decisievert', {
      configurable: true,
      get: get_decisievert
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'cSv', {
      configurable: true,
      get: get_cSv
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'centisievert', {
      configurable: true,
      get: get_centisievert
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'millisievert', {
      configurable: true,
      get: get_millisievert
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, '\u03BCSv', {
      configurable: true,
      get: get_μSv
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'microsievert', {
      configurable: true,
      get: get_microsievert
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nSv', {
      configurable: true,
      get: get_nSv
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nanosievert', {
      configurable: true,
      get: get_nanosievert
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'picosievert', {
      configurable: true,
      get: get_picosievert
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'fSv', {
      configurable: true,
      get: get_fSv
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'femtosievert', {
      configurable: true,
      get: get_femtosievert
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'aSv', {
      configurable: true,
      get: get_aSv
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'attosievert', {
      configurable: true,
      get: get_attosievert
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zeptosievert', {
      configurable: true,
      get: get_zeptosievert
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yoctosievert', {
      configurable: true,
      get: get_yoctosievert
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'rontosievert', {
      configurable: true,
      get: get_rontosievert
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quectosievert', {
      configurable: true,
      get: get_quectosievert
    });
    $eu$sirotin$kotunil$derived.Sievert = Sievert;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$derived = $eu$sirotin$kotunil.derived || ($eu$sirotin$kotunil.derived = {});
    Object.defineProperty($eu$sirotin$kotunil$derived, 'sr', {
      configurable: true,
      get: get_sr
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Qsr', {
      configurable: true,
      get: get_Qsr
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quettasteradian', {
      configurable: true,
      get: get_quettasteradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Rsr', {
      configurable: true,
      get: get_Rsr
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ronnasteradian', {
      configurable: true,
      get: get_ronnasteradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Ysr', {
      configurable: true,
      get: get_Ysr
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yottasteradian', {
      configurable: true,
      get: get_yottasteradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Zsr', {
      configurable: true,
      get: get_Zsr
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zettasteradian', {
      configurable: true,
      get: get_zettasteradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Esr', {
      configurable: true,
      get: get_Esr
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'exasteradian', {
      configurable: true,
      get: get_exasteradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Psr', {
      configurable: true,
      get: get_Psr
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'petasteradian', {
      configurable: true,
      get: get_petasteradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Tsr', {
      configurable: true,
      get: get_Tsr
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'terasteradian', {
      configurable: true,
      get: get_terasteradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Gsr', {
      configurable: true,
      get: get_Gsr
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'gigasteradian', {
      configurable: true,
      get: get_gigasteradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Msr', {
      configurable: true,
      get: get_Msr
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'megasteradian', {
      configurable: true,
      get: get_megasteradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ksr', {
      configurable: true,
      get: get_ksr
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kilosteradian', {
      configurable: true,
      get: get_kilosteradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hsr', {
      configurable: true,
      get: get_hsr
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hectosteradian', {
      configurable: true,
      get: get_hectosteradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'dasr', {
      configurable: true,
      get: get_dasr
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decasteradian', {
      configurable: true,
      get: get_decasteradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'dsr', {
      configurable: true,
      get: get_dsr
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decisteradian', {
      configurable: true,
      get: get_decisteradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'csr', {
      configurable: true,
      get: get_csr
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'centisteradian', {
      configurable: true,
      get: get_centisteradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'millisteradian', {
      configurable: true,
      get: get_millisteradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, '\u03BCsr', {
      configurable: true,
      get: get_μsr
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'microsteradian', {
      configurable: true,
      get: get_microsteradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nsr', {
      configurable: true,
      get: get_nsr
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nanosteradian', {
      configurable: true,
      get: get_nanosteradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'picosteradian', {
      configurable: true,
      get: get_picosteradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'fsr', {
      configurable: true,
      get: get_fsr
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'femtosteradian', {
      configurable: true,
      get: get_femtosteradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'asr', {
      configurable: true,
      get: get_asr
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'attosteradian', {
      configurable: true,
      get: get_attosteradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zeptosteradian', {
      configurable: true,
      get: get_zeptosteradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yoctosteradian', {
      configurable: true,
      get: get_yoctosteradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'rontosteradian', {
      configurable: true,
      get: get_rontosteradian
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quectosteradian', {
      configurable: true,
      get: get_quectosteradian
    });
    $eu$sirotin$kotunil$derived.Steradian = Steradian;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$derived = $eu$sirotin$kotunil.derived || ($eu$sirotin$kotunil.derived = {});
    Object.defineProperty($eu$sirotin$kotunil$derived, 'T', {
      configurable: true,
      get: get_T
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'QT', {
      configurable: true,
      get: get_QT
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quettatesla', {
      configurable: true,
      get: get_quettatesla
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'RT', {
      configurable: true,
      get: get_RT
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ronnatesla', {
      configurable: true,
      get: get_ronnatesla
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'YT', {
      configurable: true,
      get: get_YT
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yottatesla', {
      configurable: true,
      get: get_yottatesla
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ZT', {
      configurable: true,
      get: get_ZT
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zettatesla', {
      configurable: true,
      get: get_zettatesla
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ET', {
      configurable: true,
      get: get_ET
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'exatesla', {
      configurable: true,
      get: get_exatesla
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'PT', {
      configurable: true,
      get: get_PT
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'petatesla', {
      configurable: true,
      get: get_petatesla
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'TT', {
      configurable: true,
      get: get_TT
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'teratesla', {
      configurable: true,
      get: get_teratesla
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'GT', {
      configurable: true,
      get: get_GT
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'gigatesla', {
      configurable: true,
      get: get_gigatesla
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'MT', {
      configurable: true,
      get: get_MT
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'megatesla', {
      configurable: true,
      get: get_megatesla
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kT', {
      configurable: true,
      get: get_kT
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kilotesla', {
      configurable: true,
      get: get_kilotesla
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hT', {
      configurable: true,
      get: get_hT
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hectotesla', {
      configurable: true,
      get: get_hectotesla
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'daT', {
      configurable: true,
      get: get_daT
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decatesla', {
      configurable: true,
      get: get_decatesla
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'dT', {
      configurable: true,
      get: get_dT
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decitesla', {
      configurable: true,
      get: get_decitesla
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'cT', {
      configurable: true,
      get: get_cT
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'centitesla', {
      configurable: true,
      get: get_centitesla
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'millitesla', {
      configurable: true,
      get: get_millitesla
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, '\u03BCT', {
      configurable: true,
      get: get_μT
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'microtesla', {
      configurable: true,
      get: get_microtesla
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nT', {
      configurable: true,
      get: get_nT
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nanotesla', {
      configurable: true,
      get: get_nanotesla
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'picotesla', {
      configurable: true,
      get: get_picotesla
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'fT', {
      configurable: true,
      get: get_fT
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'femtotesla', {
      configurable: true,
      get: get_femtotesla
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'aT', {
      configurable: true,
      get: get_aT
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'attotesla', {
      configurable: true,
      get: get_attotesla
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zeptotesla', {
      configurable: true,
      get: get_zeptotesla
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yoctotesla', {
      configurable: true,
      get: get_yoctotesla
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'rontotesla', {
      configurable: true,
      get: get_rontotesla
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quectotesla', {
      configurable: true,
      get: get_quectotesla
    });
    $eu$sirotin$kotunil$derived.Tesla = Tesla;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$derived = $eu$sirotin$kotunil.derived || ($eu$sirotin$kotunil.derived = {});
    Object.defineProperty($eu$sirotin$kotunil$derived, 'V', {
      configurable: true,
      get: get_V
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'QV', {
      configurable: true,
      get: get_QV
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quettavolt', {
      configurable: true,
      get: get_quettavolt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'RV', {
      configurable: true,
      get: get_RV
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ronnavolt', {
      configurable: true,
      get: get_ronnavolt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'YV', {
      configurable: true,
      get: get_YV
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yottavolt', {
      configurable: true,
      get: get_yottavolt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ZV', {
      configurable: true,
      get: get_ZV
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zettavolt', {
      configurable: true,
      get: get_zettavolt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'EV', {
      configurable: true,
      get: get_EV
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'exavolt', {
      configurable: true,
      get: get_exavolt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'PV', {
      configurable: true,
      get: get_PV
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'petavolt', {
      configurable: true,
      get: get_petavolt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'TV', {
      configurable: true,
      get: get_TV
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'teravolt', {
      configurable: true,
      get: get_teravolt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'GV', {
      configurable: true,
      get: get_GV
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'gigavolt', {
      configurable: true,
      get: get_gigavolt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'MV', {
      configurable: true,
      get: get_MV
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'megavolt', {
      configurable: true,
      get: get_megavolt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kV', {
      configurable: true,
      get: get_kV
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kilovolt', {
      configurable: true,
      get: get_kilovolt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hV', {
      configurable: true,
      get: get_hV
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hectovolt', {
      configurable: true,
      get: get_hectovolt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'daV', {
      configurable: true,
      get: get_daV
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decavolt', {
      configurable: true,
      get: get_decavolt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'dV', {
      configurable: true,
      get: get_dV
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decivolt', {
      configurable: true,
      get: get_decivolt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'cV', {
      configurable: true,
      get: get_cV
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'centivolt', {
      configurable: true,
      get: get_centivolt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'millivolt', {
      configurable: true,
      get: get_millivolt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, '\u03BCV', {
      configurable: true,
      get: get_μV
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'microvolt', {
      configurable: true,
      get: get_microvolt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nV', {
      configurable: true,
      get: get_nV
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nanovolt', {
      configurable: true,
      get: get_nanovolt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'picovolt', {
      configurable: true,
      get: get_picovolt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'fV', {
      configurable: true,
      get: get_fV
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'femtovolt', {
      configurable: true,
      get: get_femtovolt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'aV', {
      configurable: true,
      get: get_aV
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'attovolt', {
      configurable: true,
      get: get_attovolt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zeptovolt', {
      configurable: true,
      get: get_zeptovolt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yoctovolt', {
      configurable: true,
      get: get_yoctovolt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'rontovolt', {
      configurable: true,
      get: get_rontovolt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quectovolt', {
      configurable: true,
      get: get_quectovolt
    });
    $eu$sirotin$kotunil$derived.Volt = Volt;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$derived = $eu$sirotin$kotunil.derived || ($eu$sirotin$kotunil.derived = {});
    Object.defineProperty($eu$sirotin$kotunil$derived, 'W', {
      configurable: true,
      get: get_W
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'QW', {
      configurable: true,
      get: get_QW
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quettawatt', {
      configurable: true,
      get: get_quettawatt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'RW', {
      configurable: true,
      get: get_RW
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ronnawatt', {
      configurable: true,
      get: get_ronnawatt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'YW', {
      configurable: true,
      get: get_YW
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yottawatt', {
      configurable: true,
      get: get_yottawatt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ZW', {
      configurable: true,
      get: get_ZW
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zettawatt', {
      configurable: true,
      get: get_zettawatt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'EW', {
      configurable: true,
      get: get_EW
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'exawatt', {
      configurable: true,
      get: get_exawatt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'PW', {
      configurable: true,
      get: get_PW
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'petawatt', {
      configurable: true,
      get: get_petawatt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'TW', {
      configurable: true,
      get: get_TW
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'terawatt', {
      configurable: true,
      get: get_terawatt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'GW', {
      configurable: true,
      get: get_GW
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'gigawatt', {
      configurable: true,
      get: get_gigawatt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'MW', {
      configurable: true,
      get: get_MW
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'megawatt', {
      configurable: true,
      get: get_megawatt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kW', {
      configurable: true,
      get: get_kW
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kilowatt', {
      configurable: true,
      get: get_kilowatt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hW', {
      configurable: true,
      get: get_hW
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hectowatt', {
      configurable: true,
      get: get_hectowatt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'daW', {
      configurable: true,
      get: get_daW
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decawatt', {
      configurable: true,
      get: get_decawatt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'dW', {
      configurable: true,
      get: get_dW
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'deciwatt', {
      configurable: true,
      get: get_deciwatt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'cW', {
      configurable: true,
      get: get_cW
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'centiwatt', {
      configurable: true,
      get: get_centiwatt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'milliwatt', {
      configurable: true,
      get: get_milliwatt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, '\u03BCW', {
      configurable: true,
      get: get_μW
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'microwatt', {
      configurable: true,
      get: get_microwatt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nW', {
      configurable: true,
      get: get_nW
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nanowatt', {
      configurable: true,
      get: get_nanowatt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'picowatt', {
      configurable: true,
      get: get_picowatt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'fW', {
      configurable: true,
      get: get_fW
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'femtowatt', {
      configurable: true,
      get: get_femtowatt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'aW', {
      configurable: true,
      get: get_aW
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'attowatt', {
      configurable: true,
      get: get_attowatt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zeptowatt', {
      configurable: true,
      get: get_zeptowatt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yoctowatt', {
      configurable: true,
      get: get_yoctowatt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'rontowatt', {
      configurable: true,
      get: get_rontowatt
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quectowatt', {
      configurable: true,
      get: get_quectowatt
    });
    $eu$sirotin$kotunil$derived.Watt = Watt;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$derived = $eu$sirotin$kotunil.derived || ($eu$sirotin$kotunil.derived = {});
    Object.defineProperty($eu$sirotin$kotunil$derived, 'Wb', {
      configurable: true,
      get: get_Wb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'QWb', {
      configurable: true,
      get: get_QWb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quettaweber', {
      configurable: true,
      get: get_quettaweber
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'RWb', {
      configurable: true,
      get: get_RWb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ronnaweber', {
      configurable: true,
      get: get_ronnaweber
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'YWb', {
      configurable: true,
      get: get_YWb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yottaweber', {
      configurable: true,
      get: get_yottaweber
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'ZWb', {
      configurable: true,
      get: get_ZWb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zettaweber', {
      configurable: true,
      get: get_zettaweber
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'EWb', {
      configurable: true,
      get: get_EWb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'exaweber', {
      configurable: true,
      get: get_exaweber
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'PWb', {
      configurable: true,
      get: get_PWb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'petaweber', {
      configurable: true,
      get: get_petaweber
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'TWb', {
      configurable: true,
      get: get_TWb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'teraweber', {
      configurable: true,
      get: get_teraweber
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'GWb', {
      configurable: true,
      get: get_GWb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'gigaweber', {
      configurable: true,
      get: get_gigaweber
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'MWb', {
      configurable: true,
      get: get_MWb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'megaweber', {
      configurable: true,
      get: get_megaweber
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kWb', {
      configurable: true,
      get: get_kWb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'kiloweber', {
      configurable: true,
      get: get_kiloweber
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hWb', {
      configurable: true,
      get: get_hWb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'hectoweber', {
      configurable: true,
      get: get_hectoweber
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'daWb', {
      configurable: true,
      get: get_daWb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'decaweber', {
      configurable: true,
      get: get_decaweber
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'dWb', {
      configurable: true,
      get: get_dWb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'deciweber', {
      configurable: true,
      get: get_deciweber
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'cWb', {
      configurable: true,
      get: get_cWb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'centiweber', {
      configurable: true,
      get: get_centiweber
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'milliweber', {
      configurable: true,
      get: get_milliweber
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, '\u03BCWb', {
      configurable: true,
      get: get_μWb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'microweber', {
      configurable: true,
      get: get_microweber
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nWb', {
      configurable: true,
      get: get_nWb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'nanoweber', {
      configurable: true,
      get: get_nanoweber
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'picoweber', {
      configurable: true,
      get: get_picoweber
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'fWb', {
      configurable: true,
      get: get_fWb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'femtoweber', {
      configurable: true,
      get: get_femtoweber
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'aWb', {
      configurable: true,
      get: get_aWb
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'attoweber', {
      configurable: true,
      get: get_attoweber
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'zeptoweber', {
      configurable: true,
      get: get_zeptoweber
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'yoctoweber', {
      configurable: true,
      get: get_yoctoweber
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'rontoweber', {
      configurable: true,
      get: get_rontoweber
    });
    Object.defineProperty($eu$sirotin$kotunil$derived, 'quectoweber', {
      configurable: true,
      get: get_quectoweber
    });
    $eu$sirotin$kotunil$derived.Weber = Weber;
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$specialunits = $eu$sirotin$kotunil.specialunits || ($eu$sirotin$kotunil.specialunits = {});
    Object.defineProperty($eu$sirotin$kotunil$specialunits, 'm2', {
      configurable: true,
      get: get_m2
    });
    Object.defineProperty($eu$sirotin$kotunil$specialunits, 'm3', {
      configurable: true,
      get: get_m3
    });
    Object.defineProperty($eu$sirotin$kotunil$specialunits, 'min', {
      configurable: true,
      get: get_min
    });
    Object.defineProperty($eu$sirotin$kotunil$specialunits, 'h', {
      configurable: true,
      get: get_h
    });
    Object.defineProperty($eu$sirotin$kotunil$specialunits, 'd', {
      configurable: true,
      get: get_d
    });
    Object.defineProperty($eu$sirotin$kotunil$specialunits, 'au', {
      configurable: true,
      get: get_au
    });
    Object.defineProperty($eu$sirotin$kotunil$specialunits, 'ha', {
      configurable: true,
      get: get_ha
    });
    Object.defineProperty($eu$sirotin$kotunil$specialunits, 'l', {
      configurable: true,
      get: get_l
    });
    Object.defineProperty($eu$sirotin$kotunil$specialunits, 't', {
      configurable: true,
      get: get_t
    });
    Object.defineProperty($eu$sirotin$kotunil$specialunits, 'Da', {
      configurable: true,
      get: get_Da
    });
    Object.defineProperty($eu$sirotin$kotunil$specialunits, 'eV', {
      configurable: true,
      get: get_eV
    });
    Object.defineProperty($eu$sirotin$kotunil$specialunits, 'percentage', {
      configurable: true,
      get: get_percentage
    });
    Object.defineProperty($eu$sirotin$kotunil$specialunits, '\u03C0', {
      configurable: true,
      get: get_π
    });
    Object.defineProperty($eu$sirotin$kotunil$specialunits, 'e', {
      configurable: true,
      get: get_e
    });
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$specialunits = $eu$sirotin$kotunil.specialunits || ($eu$sirotin$kotunil.specialunits = {});
    Object.defineProperty($eu$sirotin$kotunil$specialunits, 'g', {
      configurable: true,
      get: get_g
    });
    var $eu = _.eu || (_.eu = {});
    var $eu$sirotin = $eu.sirotin || ($eu.sirotin = {});
    var $eu$sirotin$kotunil = $eu$sirotin.kotunil || ($eu$sirotin.kotunil = {});
    var $eu$sirotin$kotunil$specialunits = $eu$sirotin$kotunil.specialunits || ($eu$sirotin$kotunil.specialunits = {});
    Object.defineProperty($eu$sirotin$kotunil$specialunits, 'celsius', {
      configurable: true,
      get: get_celsius
    });
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
