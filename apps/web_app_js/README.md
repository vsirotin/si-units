# Web JavaScript Application

This is a browser-based test application demonstrating the usage of KotUniL JavaScript library in web browsers.

## Purpose

This application serves as:
- **Browser compatibility test** for KotUniL JavaScript library
- **Example implementation** showing how to use KotUniL in web browser environments
- **Testing platform** for the latest JavaScript engines as part of our three-phase version strategy

## Testing Strategy

**Important**: This application is designed to be tested with the **newest available browser versions** to ensure forward compatibility and early detection of potential issues. Currently tested with:
- Chrome 120+ (latest)
- Firefox 120+ (latest)
- Safari 17+ (latest)
- Edge 120+ (latest)
- All browsers supporting ES2016 (minimum)

## Requirements

- **Browser Support**: All modern browsers supporting ES2016 (ES7)
  - Chrome 52+
  - Firefox 50+
  - Safari 10+
  - Edge 14+
- **ECMAScript**: ES2016 (ES7) and later
- **Testing**: Latest available browser versions

## Running the Application

### Using Gradle Build System
```bash
./gradlew :apps:web_app_js:clean
./gradlew :apps:web_app_js:build
```

### Opening in Browser
1. Open `index.html` in your IDE
2. Use "Open in Browser" or similar command
3. Or navigate to the file directly in your browser

### Expected File Structure
After build, the application should have:
- `lib/package.json` with correct KotUniL version
- JavaScript test files in `src/scripts/`
- HTML entry point `index.html`

## What it demonstrates

The application runs comprehensive browser-based tests covering:
- Basic SI units with JavaScript syntax
- Derived units and complex calculations  
- Unit conversions in browser environment
- Dimensional analysis with runtime type checking
- Error handling for incompatible units
- Currency and percentage calculations
- Browser API integration
- Cross-browser compatibility

## Expected Output

The browser should display:
- **Line 1**: Number tests (checks): 1078
- **Line 2**: Number KotUniL's tested objects: 61  
- **Line 3**: Number errors: 0

Any errors indicate compatibility issues that need to be addressed.

## Compatibility Notes

This application validates that the KotUniL JavaScript library compiled for ES2016 works correctly across different browser engines, ensuring our compatibility strategy for web environments.

## Development Notes

- Uses webpack for bundling (configured in build system)
- Includes TypeScript definitions for better development experience
- Supports both development and production builds
- Compatible with modern frontend frameworks
