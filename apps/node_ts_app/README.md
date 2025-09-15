# KotUniL - Node.js TypeScript Demo Application

This demo demonstrates the use of **KotUniL** library in a Node.js console application developed with TypeScript
and tests all available library objects and functions.

**KotUniL** covers all units of **International System of Units** (SI)  
like meter, second etc. [(see Wikipedia)](https://en.wikipedia.org/wiki/International_System_of_Units)
as well as SI-Prefixes (micro, nano etc.) and some other common units like currencies, percentages etc.

You can learn about functions and objects of **KotUniL** library in the main [README.md](https://github.com/vsirotin/si-units/blob/main/README.md).
You can learn examples of using the library in Kotlin Console in [TutorialTest.kt](https://github.com/vsirotin/si-units/tree/main/apps/jvm/kotlin-console/src/main/kotlin/eu/sirotin/kotunil/app/kotlin/TutorialTest.kt).

## Prerequisites

- Node.js 14.0.0 or higher
- npm or yarn package manager

## Installation

1. Install dependencies:
    ```bash
    npm install
    ```

2. Build the TypeScript project:
    ```bash
    npm run build
    ```

## How to start console application

You can start the test with a command:
```bash
./gradlew :apps:node_ts_app:startConsole
```

Or directly with npm:
```bash
npm run startConsole
```

## How to start web application

You can start the web server with:
```bash
./gradlew :apps:node_ts_app:startWeb
```

Or directly with npm:
```bash
npm run startWeb
```

## Development

For development with auto-reload:
```bash
npm run dev
```

On success the application will show a list of tests and table with expected and real data.
Compare numbers in lines of printed table.

## How to properly write KotUniL's formulas

KotUniL is a multiplatform library.
You can read about how to properly write physics and other formulas
using the objects and functions of the KotUniL library in document
["Rules for writing KotUniL formulas in different programming languages"](https://github.com/vsirotin/si-units/blob/main/RulesWritingFormulas.md).
