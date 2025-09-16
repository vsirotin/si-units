# KotUniL - Kotlin Units Library

This is the core library module implementing the complete Kotlin Units Library for processing International System of Units (SI) and related units.

## Purpose

The kotunil module provides:
- **Complete SI unit system** implementation in Kotlin
- **Multiplatform support** for JVM, JavaScript, and iOS
- **Type-safe calculations** with dimensional analysis
- **Runtime error detection** for incompatible unit operations

## Technology Stack

### Java/Kotlin Versions
- **Java**: 11 toolchain targeting Java 8 bytecode
- **Kotlin**: 2.0.21 (latest stable)

### Why These Versions?
This module uses a **hybrid approach** as part of our **Phase 2: Library Build** strategy:
- **Java 11 toolchain**: Modern build environment with full Gradle feature support
- **Java 8 bytecode target**: Maximum compatibility with legacy enterprise systems
- **Broad compatibility**: Runs on Java 8+ environments (reaching ~66% of Java users)
- **Enterprise friendly**: Compatible with older corporate environments still using Java 8

## Library Structure

### Core Packages and using examples

#### eu.sirotin.kotunil.base
System International base units:
```kotlin
val length = 5.m        // meter
val time = 10.s         // second
val mass = 2.kg         // kilogram
val current = 3.A       // ampere
val temperature = 273.K // kelvin
val amount = 1.mol      // mole
val intensity = 100.cd  // candela
```

#### eu.sirotin.kotunil.derived
System International derived units:
```kotlin
val force = 10.N        // newton
val energy = 100.J      // joule
val power = 50.W        // watt
val voltage = 12.V      // volt
val frequency = 50.Hz   // hertz
```

#### eu.sirotin.kotunil.currency
Currency support:
```kotlin
val price = 25.`€`      // euro
val cost = 100.`$`      // US dollar
```

#### eu.sirotin.kotunil.specialunits
Non-SI units accepted for use with SI:
```kotlin
val duration = 2.h      // hour
val volume = 5.l        // liter
val area = 1.ha         // hectare
```

#### eu.sirotin.kotunil.core
Core functionality including base classes, dimensional analysis, and common utilities.

## Key Features

### Type Safety
```kotlin
val distance = 100.m
val time = 10.s
val velocity = distance / time  // OK: m/s

// val invalid = distance + time  // Runtime error: incompatible dimensions
```

### Dimensional Analysis
```kotlin
val acceleration = 9.81.m / (s * s)
println(acceleration.unitSymbols())     // "m/s2"
println(acceleration.categorySymbols()) // "LT-2"
```

### Multiplatform Support
- **JVM**: Full feature set with operator overloading
- **JavaScript**: ES2016 compatible with TypeScript definitions
- **iOS**: Native framework support (iosArm64, iosSimulatorArm64, iosX64)

## Compatibility

### Runtime Requirements
- **Minimum**: Java 8+ (JRE 1.8 or higher)
- **Recommended**: Java 11+ for optimal performance
- **Android**: API level 26+ (Android 8.0)

### JavaScript Requirements
- **Node.js**: 14.0.0 or higher
- **Browsers**: ES2016 support (Chrome 52+, Firefox 50+, Safari 10+, Edge 14+)

## Building from Source

This library is generated from the kotunil-generators module and can be built using:

```bash
./gradlew :kotunil:build
```

For complete documentation and examples, visit: https://github.com/vsirotin/si-units
