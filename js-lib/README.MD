# KotUniL JavaScript/TypeScript Library 

JavaScript/TypeScript-variant of Kotlin's KotUniL library. 

**KotUniL** covers all units of **International System of Units** (SI)  
like meter, second etc. [(see Wikipedia)](https://en.wikipedia.org/wiki/International_System_of_Units) 
as well as SI- Prefixes (micro, nano etc.) and some other common units like currencies, percentages etc.

For more information about KotUniL please see origin documentation
in [GitHub si-units project](https://github.com/vsirotin/si-units/blob/26e2e890fa01cebdca93f48332bab0a0fa6c6255/README.md)
How to use this library please see the samples 
in [GitHub si-units project](https://github.com/vsirotin/si-units/blob/26e2e890fa01cebdca93f48332bab0a0fa6c6255/README.md): 
apps/node_ts_app and web_app_js).

## JS Release Notes

Since version 4.2.2 of main (multiplatform) KotUniL library has JS part of project its own versioning.

### Version 5.0.1

1. Changed call format by "direct-call" to const 
```javascript
{eu} = this['eu.sirotin.kotunil:kotunil']
```

instead of {eu} = this['kotunil-js-lib']

Call format by Node.JS does not change.

2. Small update of documentation.


