# Java Console Application

This is a test application demonstrating the usage of KotUniL library in Java environment.

## Purpose

This application serves as:
- **Compatibility test** for KotUniL library with Java platforms
- **Example implementation** showing how to use KotUniL in Java projects
- **Testing platform** for the latest Java versions as part of our three-phase version strategy

## Testing Strategy

**Important**: This application is designed to be tested with the **newest available Java version** to ensure forward compatibility and early detection of potential issues. Currently tested with:
- Java 22 (latest stable)
- Java 21 LTS
- Java 17 LTS
- Java 11 LTS
- Java 8 (minimum supported)

## Requirements

- **Minimum**: Java 8+ (JRE 1.8 or higher)
- **Recommended**: Java 11+ for optimal performance
- **Testing**: Latest available Java version

## Running the Application

### Using Gradle
```bash
./gradlew :apps:jvm:java-console:run
```

### Using JAR file
```bash
./gradlew :apps:jvm:java-console:build
java -jar apps/jvm/java-console/build/libs/java-console-*.jar
```

## What it demonstrates

The application runs comprehensive tests covering:
- Basic SI units (meter, second, kilogram, etc.)
- Derived units (newton, joule, watt, etc.)
- Unit conversions and calculations
- Dimensional analysis
- Error handling for incompatible units
- Currency and percentage calculations

## Expected Output

The application should display a table showing test results with:
- Number of tests performed
- Number of KotUniL objects tested
- Number of errors (should be 0)
- Detailed test results for each unit category

## Compatibility Notes

This application validates that the KotUniL library compiled with Java 8 bytecode runs correctly on newer Java versions, ensuring our hybrid compatibility strategy works as intended.
