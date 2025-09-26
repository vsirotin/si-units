[![Maven Central](https://img.shields.io/maven-central/v/eu.sirotin.kotunil/kotunil-jvm)](https://mvnrepository.com/artifact/eu.sirotin.kotunil/kotunil-jvm)
[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](https://www.apache.org/licenses/LICENSE-2.0)
[![GitHub contributors](https://img.shields.io/github/contributors/vsirotin/si-units)](https://github.com/vsirotin/si-units/graphs/contributors)

[![npm](https://img.shields.io/npm/v/kotunil-js-lib?sort=semver&logo=npm)](https://www.npmjs.com/package/kotunil-js-lib)
[![npm type definitions](https://img.shields.io/npm/types/v-github-icon?logo=typescript)](https://github.com/vinayakkulkarni/v-github-icon/blob/main/package.json)
[![npm](https://img.shields.io/npm/dt/kotunil-js-lib?logo=npm)](http://npm-stat.com/charts.html?package=kotunil-js-lib)
[![npm](https://img.shields.io/npm/dw/kotunil-js-lib?logo=npm)](http://npm-stat.com/charts.html?package=kotunil-js-lib)

![badge-jvm](http://img.shields.io/badge/platform-jvm-DB413D.svg?style=flat)
![badge-android](http://img.shields.io/badge/platform-android-6EDB8D.svg?style=flat)
![badge-ios](http://img.shields.io/badge/platform-ios-CDCDCD.svg?style=flat)
![badge-mac](http://img.shields.io/badge/platform-macos-111111.svg?style=flat)
![badge-linux](http://img.shields.io/badge/platform-linux-2D3F6C.svg?style=flat)
![badge-nodejs](https://img.shields.io/badge/platform-jsNode-F8DB5D.svg?style=flat)
![badge-browser](https://img.shields.io/badge/platform-jsBrowser-F8DB5D.svg?style=flat)
 
# KotUniL

![alt Genesis rules of International System of Units_(Source: Wikipedia) ](https://github.com/vsirotin/si-units/blob/main/docs/images/si-genesis.png)

**KotUniL** covers all units of **International System of Units** (SI)  
like meter, second etc. [(see Wikipedia)](https://en.wikipedia.org/wiki/International_System_of_Units)
as well as SI-Prefixes (micro, nano etc.) and some other common units like currencies, percentages etc.

**KotUniL (Kotlin Units Library)** is a library of functions and objects of Kotlin that meets the following 
requirements in total:
1. It allows various formulas to be written in Kotlin in a way maximally similar to the way formulas are written in physics and economics.
2. It allows analyzing dimensions of results of applications of complicated formulas.
3. It allows detecting most of the typical errors when working with SI units already at the compilation stage. Errors in incorrect use of physical units in complex formulas are detected at runtime.
4. It is a pure library (no plug-in, no parser etc.), it has no dependencies.

## Compatibility Requirements

### Java/JVM Compatibility
**KotUniL JVM library supports:**
- **Minimum Runtime**: Java 8+ (JRE 1.8 or higher)
- **Recommended**: Java 11+ for optimal performance
- **Tested with**: Java 8, 11, 17, 21, and 22
- **Android**: Compatible with Android API level 26+ (Android 8.0)

The library is compiled with a hybrid approach: built using modern toolchains but targeting Java 8 bytecode for maximum compatibility with legacy enterprise systems.

### JavaScript/Node.js Compatibility
**KotUniL JavaScript library supports:**
- **Node.js**: Version 14.0.0 or higher
- **ECMAScript**: ES2016 (ES7) and later
- **TypeScript**: Full TypeScript definitions included
- **Browsers**: All modern browsers supporting ES2016
  - Chrome 52+
  - Firefox 50+
  - Safari 10+
  - Edge 14+

## Project Structure

The goal of the project is not only to provide a unified set of objects and 
functions that allows using SI in programs in different programming languages. 
The project also contains simple applications in all of the target languages that show how to do this. In addition, these applications test the availability of all necessary functions on that target platform.

Therefore, all subprojects of this project are divided into four groups:
1. [kotunil](https://github.com/vsirotin/si-units/tree/main/kotunil) - implementation of library functionality in Kotlin.
2. [js-lib](https://github.com/vsirotin/si-units/tree/main/js-lib) - JavaScript variant of KotUniL, available as NPM package [kotunil-js-lib](https://www.npmjs.com/package/kotunil-js-lib). 
3. [apps](https://github.com/vsirotin/si-units/tree/main/apps) - 
applications that test the functionality of the library on a specific platform.
Currently there are test applications as console applications for [Kotlin](https://github.com/vsirotin/si-units/tree/main/apps/jvm/kotlin-console)
and [Java](https://github.com/vsirotin/si-units/tree/main/apps/jvm/java-console) platforms implemented as well as web applications 
for [Browser/JavaScript](https://github.com/vsirotin/si-units/tree/main/apps/web_app_js) and [Node/TypeScript](https://github.com/vsirotin/si-units/tree/main/apps/node_ts_app)
variants of the library. 
4. [kotunil-generators](https://github.com/vsirotin/si-units/tree/main/kotunil-generators) - generators used to accelerate the implementation and testing of the library.

If you are a developer and you are interested in the source code of the library, 
you only need the [kotunil](https://github.com/vsirotin/si-units/tree/main/kotunil) part.

## 1. Getting Started

### 1.1 Simple Physical Formulas

Let's consider some simple examples.

*In Eva's case, a glass broke in her aquarium and water flowed onto the floor. 
The aquarium contained 32 liters of water before the breakage.
Eva's room is 4 m wide and 4.3 m long. 
How high in mm is the water now in Eva's room, assuming that it stayed there 
and did not flow away?*

The solution in Kotlin can be written in one line. For didactic reasons, let's introduce two auxiliary variables s and h.

```kotlin
val s = 4.m * 4.3.m
val h = 32.l/s   
print("Water height is ${h.mm} mm.")
```

### 1.2 How to Properly Write KotUniL Formulas
KotUniL is a multiplatform library.
You can read about how to properly write physics and other formulas
using the objects and functions of the KotUniL library in the "Rules for Writing KotUniL Formulas" section at the end of this document.

### 1.3 Dimension Analysis
Please note that the variable **s** has physical dimension **m²** (square meter) and **h** has dimension **m** (simple meter).
Furthermore, in this example we also used liters (**l**), which have dimension **m³** (cubic meters). 

Using the built-in function **unitSymbols()** you can determine the dimension of any object in terms of SI standard.

```kotlin
val s = 4.m * 5.m
assertEquals("m2", s.unitSymbols())

val x = 20.l
assertEquals("m3", x.unitSymbols())

val h = x/s
assertEquals("m", h.unitSymbols())

val y = 1.2.s
assertEquals("s", y.unitSymbols())

val z = x/y
assertEquals("m3/s", z.unitSymbols())
```

Using the built-in function **categorySymbols()** 
you can analyze dimensions of physical units in an "academic" manner.

```kotlin
val s = 4.m * 5.m
assertEquals("L2", s.categorySymbols())

val x = 20.l
assertEquals("L3", x.categorySymbols())

val h = x/s
assertEquals("L", h.categorySymbols())

val y = 1.2.s
assertEquals("T", y.categorySymbols())

val z = x/y
assertEquals("L3T-1", z.categorySymbols())
```

### 1.4 Type Safety

Physical units of the same dimension can be added, subtracted and compared.
If you try to do this with units of different types, 
you will get either compilation errors (for simple units) 
or run-time errors for complicated units. 

```kotlin
//val x = 1.m + 2 // compilation error
//val y = 20.l/(4.m * 5.m) + 14 // compilation error

//Complex errors will be found at runtime:
val exception = assertFailsWith<IllegalArgumentException>(
    block = { 1.m + 2.s }
)
assertTrue(exception.message!!.startsWith(COMPATIBILITY_ERR_PREFIX))
```

Of course, safety with an exception is not classic type safety that shows up during compilation time. 
However, it is better than letting the meter and the second add up. 

When using SI, such errors are found during the first unit test.  
(Reminder: just such errors led in the past to terrible technical catastrophes, 
see e.g. https://en.wikipedia.org/wiki/Mars_Climate_Orbiter).

### 1.5 Comparison of Objects

Physical objects can be compared only if they have the same dimensions. 

```kotlin
assertTrue(5.m > 4.1.m)

assertTrue(20.2*m3 > 4.2*m3)

assertTrue(2.2*kg*m/s < 4.2*kg*m/s)
```

Otherwise, you will get a run-time error.

```kotlin
val v1 = 2.4.m
val v2 = 2.4.s

val exception = assertFailsWith<IllegalArgumentException>(
    block = { v1 >= v2 }
)
assertTrue(exception.message!!.startsWith(COMPATIBILITY_ERR_PREFIX))
```

or:

```kotlin
val v1 = 2.4.m*kg/s
val v2 = 2.4.s*m3/ μV

val exception = assertFailsWith<IllegalArgumentException>(
    block = { v1 >= v2 }
)
assertTrue(exception.message!!.startsWith(COMPATIBILITY_ERR_PREFIX))
```

With KotUniL you can also compare, add and divide objects that are defined differently but have the same physical dimension.  
In the example below, objects with the dimension "hertz" (1/second) are used.
```kotlin
assertEquals(0.9.Hz, 0.9/s)
assertEquals(0.9.Hz, 5/s - 4.1.Hz)
```

## 2. How to Use

### 2.1 Production Mode
KotUniL is distributed as a Kotlin library via MavenCentral.
Dependency for **build.gradle.kts**:

```kotlin
repositories {
    mavenCentral()
}

dependencies {
    implementation("eu.sirotin.kotunil:kotunil-jvm:X.Y.Z")
}
```
where X.Y.Z is the last published version of KotUniL in MavenCentral.
You can see the number of this version at the head of this file after the icon with 
the text "maven-central". 

Dependency for Maven/pom:

```xml
<dependency>
    <groupId>eu.sirotin.kotunil</groupId>
    <artifactId>kotunil-jvm</artifactId>
    <version>X.Y.Z</version>
</dependency>
```

### 2.2 JavaScript/TypeScript Usage

For JavaScript and TypeScript projects, install via npm:

```bash
npm install kotunil-js-lib
```

Usage in TypeScript:
```typescript
import { m, s, kg } from 'kotunil-js-lib';

const distance = 100 * m;
const time = 10 * s;
const velocity = distance / time;
console.log(`Velocity: ${velocity.value} m/s`);
```

Usage in JavaScript:
```javascript
const { m, s, kg } = require('kotunil-js-lib');

const distance = 100 * m;
const time = 10 * s;
const velocity = distance / time;
console.log(`Velocity: ${velocity.value} m/s`);
```

### 2.3 Development Mode

At the moment, KotUniL is developing rapidly. 
To enable you to try the latest features of KotUniL, use the following configuration in KTS:

```kotlin
implementation("eu.sirotin.kotunil:kotunil-jvm:+")
```

and with Maven:

```xml
<version>LATEST</version>
```

### 2.4 Using Only Source Code
If you want to use it as source code, 
copy into your project all production files from 
**src/commonMain/kotlin/eu/sirotin/kotunil**.

## 3. Deeper Into Details

### 3.1 Base Units

The SI standard defines 7 base units, as well as some derived units 
and accepts historically established non-SI units.

The table below lists Base SI units.

You can define a physical unit by multiplying 
a value with a unit variable or from a number (Double, Int etc.) 
if you write the SI symbol after a dot after a number.

```kotlin
1*s == 1.0.s
s == 1.s
s = 1.0.s
```

In special cases you can also create a unit using a class constructor.

```kotlin
Second(1.0) == 1.s
```

| SI Base Unit | Unit symbol | Description |
|--------------|-------------|-------------|
| second       | s           | Time        |
| metre        | m           | Length      | 
| kilogram     | kg          | Mass        |
| ampere       | A           | Electric current |
| kelvin       | K           | Thermodynamic temperature |
| mole         | mol         | Amount of substance |
| candela      | cd          | Luminous intensity |

### 3.2 Derived Units

SI standard defines beside base unit also 22 derived units. 
They are listed in the table below.
Do not be surprised if you encounter in this table 
and in KotUniL library unusual for identifiers symbols like Ω. 
It is possible because according to Kotlin's specification most common unicode symbols can be used in Kotlin identifiers (see paragraph "1.2.4 Identifiers" in Kotlin Specification https://kotlinlang.org/spec/pdf/kotlin-spec.pdf).
Derived units can be used just like base units.
Both types can be used in a formula by multiplication or division.

| SI Derived Unit | Unit symbol | Formula                                            | 
|-----------------|-------------|----------------------------------------------------|
| radian          | rad         | m/m                                                |  
| steradian       | sr          | m2/m2                                              |  
| hertz           | Hz          | 1/s                                                |  
| newton          | N           | kg*m/(s `^` 2)                                     |  
| pascal          | Pa          | kg/(m * (s `^` 2))                                 |  
| joule           | J           | kg*(m2)/(s `^` 2)                                  |  
| watt            | W           | kg*(m2)/(s `^` 3)                                  |  
| coulomb         | C           | s*A                                                |  
| volt            | V           | kg\*m2*(s `^` -3) * (A `^` -1)                     |  
| farad           | F           | (kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2) |  
| ohm             | Ω           | kg*m2 * (s `^` -3) * (A `^` -2)                    |  
| siemens         | S           | (kg `^` -1) * (m `^` -2) \*(s `^` 3)* (A `^` 2)    |  
| weber           | Wb          | kg*(m2) * (s `^` -2) * (A `^` -1)                  |  
| tesla           | T           | kg* (s `^` -2) * (A `^` -1)                        |  
| henry           | H           | kg* (m2)\*(s `^` -2)*(A `^` -2)                    |  
| degreeCelsius   | Celsius     | (K `^` 1)                                          |  
| lumen           | lm          | ((cd `^` 1)*sr)                                    |  
| lux             | lx          | cd\*sr*(m `^` -2)                                  |  
| becquerel       | Bq          | (s `^` -1)                                         |  
| gray            | Gy          | (m2)*(s `^` -2)                                    |  
| sievert         | Sv          | (m2)*(s `^` -2)                                    |  
| katal           | kat         | (mol * (s `^` -1))                                 | 

Also, do not wound yourself when you see the **^** symbol. 
Kotlin has no operator for power, but a function. 
KotUniL was extended with this infix function. 
Unfortunately, with it can not set proper priority for this function. 
Although this looks like a "real" operator, 
for keeping proper operation prioritization, 
you have to put it in parentheses.


#### Real-life example:

Miller family makes a trip to the nature. 
They brought a solar panel and immediately turned on at the 
excursion site. Solar produced 12 volts and 7 amps 2 hours. 
Produced electricity was stored in a storage tank. 
Storage efficiency is 85%.
After that, Mrs. Miller decided to prepare the tea in boiler. 
To prepare hot water for tea with boilers with 500 watt strength, 
the water should be boiled for 8 min.
The question, is stored in memory electricity enough for that?

```kotlin
        val producedElectricity = 12.V * 7.A * 2.h
        val savedElectricity = producedElectricity * 85.`%`
        val neededElectricity = 0.5.kW * 8.min
        val dif = savedElectricity - neededElectricity
        assertTrue(dif < 0.W*h) //Comparison in KotUniL
        assertTrue(dif.value < 0) //Comparison dimensionless
```

Note that for convenience we use here the symbol `%`. 
This is also extension of Kotlin in our library.

Regarding this and similar extensions, see the statement:
"Kotlin supports escaping identifiers by enclosing
any sequence of characters into backtick (\`) characters,
allowing to use any name as an identifier."
(See paragraph 1.2.4 "Identifiers" in Kotlin specification
https://kotlinlang.org/spec/syntax-and-grammar.html#grammar-rule-Identifier).
The character backtick (`) (UTF-8 code U+0060) is not equal
to the apostrophe characters on the keyboard (UTF-8 code U+0027).
To use it, you better copy it directly from this example.

**Please note: such identifiers currently work only on Jvm platform.**

Most derived units can be derived from Based Units 
or from other Derived Units in different ways.  
Look at the example of Tesla:

```kotlin
assertEquals(T,	kg * (s `^` -2) * (A `^` -1))
assertEquals(T,	Wb/ m2)
```

### 3.3 Own Derive Units

You can also define your own Derived Units.
Consider a not properly scientifically proven example.
Let's imagine that the melting speed of snow in mountains 
is proportional to the duration and temperature above 0 °C. 
This will be our new Derived Unit.
If current snow thickness is 10 cm, 
what proportion will be melted in 5 hours at 20 °C?  
The code below also shows the nice side of Kotlin - 
a possibility to use Unicode symbols, e.g. Greek letters.

```kotlin
        val ζ = 10.μm/(h*K) //melting speed
        val τ = 10.cm
        val t = 20.`°C`
        val ξ = 5.h*(t - 0.`°C`)
        val σ = ζ*ξ //melting height
        val α = σ/τ //melting ration
        assertEquals(1.0, α.`as %`, ε) //α.`as %` - Ratio presented in percents
```

Please note, how you can present calculation result in percents: 
**α.`as %`** - ratio presented in percents.

ε is some small value for tolerance by comparison of double numbers. This is also one of the variables defined in KotUniL

### 3.4 SI-Prefixes 

SI standard also defines SI prefixes 
and rules for their use with units ( Base and Derived). 
SI Units library implements this mechanism. 
The table of prefixes and their values can be seen 
in the table below. 

| Prefix | Symbol | Degree |
|--------|--------|--------|
| quetta | Q      | 30     | 
| ronna  | R      | 27     | 
| yotta  | Y      | 24     | 
| zetta  | Z      | 21     | 
| exa    | E      | 18     | 
| peta   | P      | 15     | 
| tera   | T      | 12     | 
| giga   | G      | 9      | 
| mega   | M      | 6      | 
| kilo   | k      | 3      | 
| hecto  | h      | 2      | 
| deca   | da     | 1      | 
| deci   | d      | -1     | 
| centi  | c      | -2     | 
| milli  | m      | -3     | 
| micro  | μ      | -6     | 
| nano   | n      | -9     | 
| pico   | p      | -12    | 
| femto  | f      | -15    | 
| atto   | a      | -18    | 
| zepto  | z      | -21    | 
| yocto  | y      | -24    |
| ronto  | r      | -27    |
| quecto | q      | -30    |

In example below we check that one kilometer is equal 
to milliard of micrometer.  

```kotlin
val d = km - (10 `^` 9) * μm
assertTrue(abs(d.value) < ε)
```

### 3.5 Non-SI units accepted for use with SI

Many non-SI units continue to be used in the scientific, 
technical, and commercial literature.
KotUniL Library implements these units.
They are listed in the table below.


| Quantity               | 	Name                                  | 	Symbol | 	Value in SI units                      |
|------------------------|----------------------------------------|---------|-----------------------------------------|
| time	                  | minute	                                | min	    | 1 min = 60 s                            |
| time                   | hour                                   | 	h	     | 1 h = 60 min = 3600 s                   |
| time                   | day                                    | 	d      | 	1 d = 24 h = 86400 s                   |
| length	                | astronomical unit                      | 	au	    | 1 au = 149597870700 m                   |
| plane and phase angle	 | degree	                                | °       | 	1° = π*rad/180                         |
| plane and phase angle	 | arcminute                              | 	′      | 	1′ = 1°/60 = π*rad/10800               |
| plane and phase angle	 | arcsecond	″	1″ = 1′ /60 = π*rad/648000 |
| area                   | 	hectare	                              | ha	     | 1 ha = 1 hm2 = 10^4 m2                  |
| volume                 | 	litre                                 | 	l, L	  | 1 l = 1 L = 1 dm3 = 10^3 cm3 = 10^−3 m3 |
| mass	                  | tonne (metric ton)	                    | t	      | 1 t = 1 Mg = 10^3 kg                    |
| mass	                  | dalton	                                | Da	     | 1 Da = 1.660539040(20)×10^−27 kg        |
| energy	                | electronvolt                           | 	eV     | 	1 eV = 1.602176634×10^−19 J            |


**Example:**

A city park has area 2.3 hectares. 
During a rain 1 mm of water had fallen from the sky.  
If there was no rain, the park should be watered 
with water from car cisterns. A car cistern can carry 4 tons of water.
How many cisterns are needed to achieve 
the same effect as in case of rain?
Reminder: density of watter is 1 kg/l

```kotlin
val s = 1.ha
val ω = s*100.mm //water volume
val ρ = kg/l //density of watter is 1 kg/l
val τ = ω * ρ //common water weight of rain
val n = τ/4.t
assertEquals(250.0, n.value, ε)
```

### 3.6 Currencies
KotUniL library lets you use currencies in your calculations.

Some example:

A householder has decided to cover the floor with tiles in one of his rooms.

He has bought 16,5 sqm of tiles for 52 €/sqm.
How much does he pay for his tiles?

```kotlin
val prise = 52.`€`/m2
val s = 16.5*m2
val cost = s*prise
assertEquals("858,00 EUR", cost.show("%.2f"))
assertEquals("EUR", cost.unitSymbols())
```

### 3.7 Things
Sometimes you need an abstract unit like "thing". For example:

Every good guy has 30 different things per liter in his pocket.
Jan is a good guy and his pocket is 0.3 liters big.
How many things can his mom find in Jan's pocket? 

```kotlin
val p = 30.`#`/l
val n = 0.3.l * p

assertEquals("9 #", n.show("%.0f"))
assertEquals("#", n.unitSymbols())    
```

### 3.8 Full implementation of Kotlin's operators for units
Library completely implements Kotlin's operators like:
Unare operators:

```kotlin
a = +b
a = -b
```

Augment assignments:

```kotlin
a +=b
a -=b
a *=b
a /=b
a %=b
```

**Attention**: Operators

```kotlin
a++ 
```

and

```kotlin
a-- 
```
**are not implemented** due to known bugs Kotlin compiler
(See https://youtrack.jetbrains.com/issue/KT-24800)

Head image: Genesis rules of International System of Units (Source: [Wikipedia](https://en.wikipedia.org/wiki/International_System_of_Units))

## Rules for Writing KotUniL Formulas

### General Principles

1. **Natural Syntax**: Write formulas as close as possible to their mathematical representation
2. **Type Safety**: Let the compiler and runtime catch dimensional errors
3. **Readability**: Use meaningful variable names and clear expressions

### Best Practices

#### For JVM (Kotlin/Java)
```kotlin
// Prefer extension properties over multiplication
val distance = 100.m        // Good
val distance = 100 * m      // Also acceptable

// Chain operations naturally
val acceleration = 9.81.m / (1.s * 1.s)  // or
val acceleration = 9.81.m / s.pow(2)

// Use descriptive variable names
val earthGravity = 9.81.m/s2
val carMass = 1500.kg
val force = carMass * earthGravity
```

#### For JavaScript/TypeScript
```typescript
// Import what you need
import { m, s, kg, N } from 'kotunil-js-lib';

// Use multiplication syntax
const distance = 100 * m;
const time = 10 * s;
const velocity = distance / time;

// Access values for display
console.log(`Distance: ${distance.value} ${distance.unitSymbols()}`);
```

### Platform-Specific Considerations

#### JVM Platform
- Full operator overloading support
- Compile-time type checking for simple units
- Runtime checking for complex derived units
- Extension functions available

#### JavaScript Platform
- Limited operator overloading (multiplication and division only)
- Runtime type checking
- Value property for numeric access
- Full unit conversion support

### Error Handling

#### Dimensional Errors
```kotlin
try {
    val invalid = 1.m + 1.s  // Will throw at runtime
} catch (e: IllegalArgumentException) {
    println("Cannot add meters and seconds: ${e.message}")
}
```

#### Best Practices for Error Prevention
1. Use unit tests extensively
2. Validate formulas with known values
3. Check dimensional consistency regularly
4. Use meaningful variable names that include units when possible

### Performance Considerations

#### For High-Performance Applications
```kotlin
// Cache frequently used units
val gravity = 9.81.m/s2

// Minimize object creation in loops
for (i in 0..1000) {
    val force = mass * gravity  // Reuse gravity object
}
```

#### Memory Management
- Units are lightweight objects
- Immutable by design
- Safe for concurrent use
- Minimal memory overhead
