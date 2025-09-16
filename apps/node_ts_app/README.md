# Node.js TypeScript Application

This is a test application demonstrating the usage of KotUniL JavaScript library in Node.js environment with TypeScript.

## Purpose

This application serves as:
- **Compatibility test** for KotUniL JavaScript library with Node.js platforms
- **Example implementation** showing how to use KotUniL in TypeScript/Node.js projects
- **Testing platform** for the latest Node.js and TypeScript versions as part of our three-phase version strategy

## Testing Strategy

**Important**: This application is designed to be tested with the **newest available Node.js and TypeScript versions** to ensure forward compatibility and early detection of potential issues. Currently tested with:
- Node.js 20+ LTS (latest)
- Node.js 18+ LTS
- Node.js 16+ LTS
- Node.js 14+ (minimum supported)
- TypeScript 5.9.2 (latest stable)

## Requirements

- **Minimum**: Node.js 14.0.0 or higher
- **Recommended**: Node.js 18+ LTS for optimal performance
- **Testing**: Latest available Node.js LTS version
- **TypeScript**: Latest stable version
- **ECMAScript**: ES2016 (ES7) support

## Running the Application

### Development Mode
```bash
npm run dev
```

### Console Application
```bash
./gradlew :apps:node_ts_app:startConsole
```

### Web Server
```bash
./gradlew :apps:node_ts_app:build
npm run startWeb
```

### Using Gradle Build System
```bash
./gradlew :apps:node_ts_app:clean
./gradlew :apps:node_ts_app:build
./gradlew :apps:node_ts_app:startConsole
```

## What it demonstrates

The application runs comprehensive tests covering:
- Basic SI units with JavaScript/TypeScript syntax
- Derived units and complex calculations
- Unit conversions in JavaScript environment
- Dimensional analysis with runtime type checking
- Error handling for incompatible units
- Currency and percentage calculations
- TypeScript type definitions for units
- Integration with Node.js ecosystem

## Expected Output

The console application should display a table showing test results with:
- Number of tests (checks): 1078
- Number of KotUniL's tested objects: 61
- Number of errors: 0
- Detailed test results for each unit category

The web server provides REST API endpoints for unit calculations and conversions.

## Compatibility Notes

This application validates that the KotUniL JavaScript library compiled for ES2016 works correctly with modern Node.js versions and TypeScript, ensuring our compatibility strategy for JavaScript environments.
