# KotUniL Generators

This module contains code generation tools used to create and maintain the KotUniL library source code.

## Purpose

The kotunil-generators module serves as:
- **Code generation engine** for SI units, derived units, and prefixes
- **Template processor** for creating consistent unit implementations
- **Development tool** for maintaining library consistency across platforms

## Technology Stack

### Java/Kotlin Versions
- **Java**: 22 (latest stable)
- **Kotlin**: 2.0.21 (latest stable)

### Why These Versions?
This module uses the **newest available versions** as part of our **Phase 1: Generation** strategy:
- **Latest Java 22**: Provides access to newest language features and performance improvements
- **Latest Kotlin 2.0.21**: Access to cutting-edge Kotlin features for code generation
- **Development productivity**: Internal tools benefit from modern language capabilities
- **Not distributed**: Since this is an internal development tool, compatibility constraints don't apply

## Generated Packages

The generator creates the following packages in the main kotunil library:

### eu.sirotin.kotunil.base
Contains classes for processing System International base units (meter, second, kilogram, etc.).

### eu.sirotin.kotunil.derived  
Contains classes for processing System International derived units (newton, joule, watt, etc.).

### eu.sirotin.kotunil.currency
Contains classes for processing major currencies (euro, US dollar, etc.).

### eu.sirotin.kotunil.specialunits
Contains classes for historical and other Non-SI units (hour, liter, etc.).

### eu.sirotin.kotunil.core
Contains core functionality and base classes for the library.

## Running the Generator

### Using Gradle
```bash
./gradlew :kotunil-generators:run
```

### Using JAR
```bash
./gradlew :kotunil-generators:build
java -jar kotunil-generators/build/libs/kotunil-generators.jar
```

## Output

The generator creates source files in the `kotunil/src/commonMain/kotlin/eu/sirotin/kotunil/` directory structure, ensuring:
- Consistent API across all units
- Proper dimensional analysis
- Type-safe operations
- Multiplatform compatibility (JVM, JS, iOS)

## Development Notes

- **Not for end users**: This module is only relevant for KotUniL library development
- **Template-based**: Uses templates to ensure consistency across generated units
- **Multiplatform aware**: Generates code compatible with Kotlin multiplatform targets
- **Version independent**: Generated code targets the library's compatibility requirements

For the complete tutorial and usage examples, see the main project documentation at https://github.com/vsirotin/si-units.
