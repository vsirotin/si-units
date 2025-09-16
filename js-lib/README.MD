# KotUniL JavaScript Library

This is the JavaScript/TypeScript distribution of the KotUniL library, available as NPM package `kotunil-js-lib`.

## Purpose

This library provides:
- **JavaScript/TypeScript implementation** of KotUniL units library
- **Cross-platform compatibility** for web browsers and Node.js
- **TypeScript definitions** for type-safe development
- **ES2016 target** for broad browser compatibility

## Installation

### NPM
```bash
npm install kotunil-js-lib
```

### Yarn
```bash
yarn add kotunil-js-lib
```

## Usage

### TypeScript
```typescript
import { m, s, kg, N } from 'kotunil-js-lib';

const distance = 100 * m;
const time = 10 * s;
const velocity = distance / time;
console.log(`Velocity: ${velocity.value} ${velocity.unitSymbols()}`);
```

### JavaScript (ES6+)
```javascript
import { m, s, kg, N } from 'kotunil-js-lib';

const distance = 100 * m;
const time = 10 * s;
const velocity = distance / time;
console.log(`Velocity: ${velocity.value} ${velocity.unitSymbols()}`);
```

### JavaScript (CommonJS)
```javascript
const { m, s, kg, N } = require('kotunil-js-lib');

const distance = 100 * m;
const time = 10 * s;
const velocity = distance / time;
console.log(`Velocity: ${velocity.value} ${velocity.unitSymbols()}`);
```

## Compatibility

### JavaScript Engine Support
- **Node.js**: 14.0.0+ (LTS versions recommended)
- **Browsers**: All supporting ES2016
  - Chrome 52+
  - Firefox 50+
  - Safari 10+
  - Edge 14+
- **TypeScript**: Full type definitions included

### Testing Strategy
This library is tested with the **newest available JavaScript engines** to ensure forward compatibility as part of our three-phase version strategy.

## Features

- Complete SI unit system implementation
- Type-safe operations with TypeScript
- Runtime dimensional analysis
- Currency and percentage support
- Minimal bundle size with tree-shaking support
- Zero dependencies

## API Reference

The JavaScript API mirrors the Kotlin API with some platform-specific adaptations:

### Basic Usage
```javascript
// Creating units
const length = 5 * m;
const time = 2 * s;

// Calculations
const velocity = length / time;
const acceleration = velocity / time;

// Accessing values
console.log(velocity.value);           // Numeric value
console.log(velocity.unitSymbols());   // "m/s"
console.log(velocity.categorySymbols()); // "LT-1"
```

### Error Handling
```javascript
try {
    const invalid = 1 * m + 1 * s;  // Will throw
} catch (error) {
    console.log("Dimensional error:", error.message);
}
```

## Building from Source

This library is automatically generated from the Kotlin multiplatform project:

```bash
./gradlew :js-lib:clean
./gradlew :js-lib:build
```

The generated package can be found in `js-lib/dist/`.
