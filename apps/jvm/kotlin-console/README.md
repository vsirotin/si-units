# Kotlin Console Application

This is a test application demonstrating the usage of KotUniL library in Kotlin environment.

## Purpose

This application serves as:
- **Compatibility test** for KotUniL library with Kotlin/JVM platforms
- **Example implementation** showing how to use KotUniL in Kotlin projects
- **Testing platform** for the latest Java/Kotlin versions as part of our three-phase version strategy

## Testing Strategy

**Important**: This application is designed to be tested with the **newest available Java and Kotlin versions** to ensure forward compatibility and early detection of potential issues. Currently tested with:
- Java 22 (latest stable) + Kotlin 2.0.21
- Java 21 LTS + Kotlin 2.0.21
- Java 17 LTS + Kotlin 2.0.21
- Java 11 LTS + Kotlin 2.0.21
- Java 8 + Kotlin 2.0.21 (minimum supported)

## Requirements

- **Minimum**: Java 8+ (JRE 1.8 or higher)
- **Recommended**: Java 11+ for optimal performance
- **Testing**: Latest available Java version
- **Kotlin**: Latest stable version (currently 2.0.21)

## Running the Application

### Using Gradle
```bash
./gradlew :apps:jvm:kotlin-console:run
```

### Using JAR file
```bash
./gradlew :apps:jvm:kotlin-console:build
java -jar apps/jvm/kotlin-console/build/libs/kotlin-console-*.jar
```

## What it demonstrates

The application runs comprehensive tests covering:
- Basic SI units with Kotlin's expressive syntax
- Derived units and complex calculations
- Unit conversions using Kotlin extension functions
- Dimensional analysis with type safety
- Error handling for incompatible units
- Currency and percentage calculations
- Kotlin-specific features like operator overloading

## Expected Output

The application should display a table showing test results with:
- Number of tests performed
- Number of KotUniL objects tested
- Number of errors (should be 0)
- Detailed test results for each unit category

## Compatibility Notes

This application validates that the KotUniL library works seamlessly with the latest Kotlin features while maintaining compatibility with older Java runtimes, demonstrating our hybrid compatibility strategy.
