# KotUniL JavaScript/TypeScript Library

JavaScript/TypeScript variant of Kotlin's KotUniL library.

**KotUniL** covers all units of **International System of Units** (SI)  
like meter, second etc. [(see Wikipedia)](https://en.wikipedia.org/wiki/International_System_of_Units)
as well as SI-Prefixes (micro, nano etc.) and some other common units like currencies, percentages etc.

## Installation

```bash
npm install kotunil-js-lib
```

## Usage

For detailed usage examples, please see the sample applications:
- [Node.js/TypeScript app](https://github.com/vsirotin/si-units/tree/main/apps/node_ts_app)
- [Web Browser JavaScript app](https://github.com/vsirotin/si-units/tree/main/apps/web_app_js)

For more information about KotUniL, please see the main documentation
in the [GitHub si-units project](https://github.com/vsirotin/si-units/blob/main/README.md).

## JS Release Notes

Since version 4.2.2 of the main (multiplatform) KotUniL library, the JS part of the project has its own versioning.

### Version 5.0.1

1. Changed call format by "direct-call" to const:
```javascript
{eu} = this['eu.sirotin.kotunil:kotunil']
```

instead of `{eu} = this['kotunil-js-lib']` (see [apps/web_app_js/src/scripts/tests/Starter.js](https://github.com/vsirotin/si-units/tree/main/apps/web_app_js/src/scripts/tests/Starter.js))

Call format for Node.js does not change.

2. Small update of documentation.

## License

Apache License 2.0 - see the [LICENSE](https://github.com/vsirotin/si-units/blob/main/LICENSE) file for details.
