# Rules for writing KotUniL formulas in different programming languages

The KotUniL library for working with SI objects (meter, second, amp, etc.) and currencies, 
originally implemented in Kotlin, is now available in Java.

## Differences between Java and Kotlin from KotUniL perspective

The functionality available from Java is almost exactly the same as that available on Kotlin, 
with the following exception:
- Since it is not yet possible to override operators in Java, arithmetic manipulations of SI objects and currencies are implemented as member functions of those objects.
- Since there is no possibility in Java to use special identifiers bounded by the backtick, we will have to do without them.
- Instead of the keyword ```val``` of the Kotlin language, in Java you must explicitly specify the type of the variable to be defined. When it comes to KotUniL objects, you can always use ```Expression``` type without thinking twice.

## Writing physical formulas in Kotlin and Java

Let's look at the rules of using SI objects implemented in the KotUniL library in programs in Java. (And in Kotlin as well).

Consider a simple physical problem used in Tutorial KotUniL.

*Eva broke a glass in her aquarium and water flowed to the bottom.
In aquarium before the break was 20 liters of water.
Eva's room is 4 m. long and 5 tall.
How high in mm. is water now in Eva's room with assumption that it stayed there and did not flow away?*



In the language of physical formulas, its solution is written as follows:
```
z = 20 l / 4 m * 5 m
```
If we want to get the numerical answer in millimeters, we have to convert the result of formula calculation from meters to millimeters.

If we think that "calculations in mind" are not allowed, then we have to make such a conversion explicitly by dividing the result in meters by millimeters. That is, our formula will add:
```
z = 20 l / 4 m * 5 m /mm
```

If we want to show the solution in steps, we rewrite the formula like this:

```
s = 4 m * 5 m
v = 20 l
h = v/s
z = h/mm
```

Kotlin syntax allows us to write a one-line formula and step formulas very close to the form of writing we are familiar with from physics:
```kotlin
val z = 20.l / (4.m * 5.m) / mm
```

and
```kotlin
val s = 4.m * 5.m
val v = 20.l
val h = v / s
val z = h / mm
```

Given the Java language limitations listed above, the step-by-step representation can be written as follows (for ease of comparison, the Kotlin variant is written as a comment before the Java line:
```java
// val s = 4.m * 5.m
Expression s = m.times(4).times(m.times(5));
// val v = 20.l
Expression v = l.times(20);
// val h = v / s
Expression h = v.div(s);
// val z = h / mm
Expression z = h.div(mm);
```

Unfortunately, the single-step formula notation in Java looks very unwieldy:
```java
Expression z = l.times(20).div((m.times(4).times(m.times(5)))).div(mm)
```
## Translating physical formulas into expressions in Kotlin and Java

Let's formulate the rules of translation of physical formulas using SI units into KotUniL library 
formulas in Kotlin and Java languages.

### Rule 1: Using values

In physical formulas, we write first the value, then a symbol of SI unit, separated by a space, 
for example: ```4 m```.

In Kotlin, we put a dot between the value and the physical unit symbol: ```4.m```

In Java we explicitly multiply the SI unit by their number: ```m.times(4)```

### Rule 2: Using arithmetic operations

In Kotlin, the signs of arithmetic operations are used exactly the same as in physics formulas, 
for example: ```4.m*5.m``` or ```v/s```.

In Java this luxury is not yet available and every arithmetic operation of the form ```x f y```, 
where ```x``` and ```y``` are variables and ```f``` is an operation, must be rewritten as ```x.f(y)```. 
For example: ```m.times(4)```

### Rule 3: Declaration of the result of an expression

In physical formulas, we do not need to specifically declare the expected result of calculating the 
formula: ```s = 4 m * 5 m```

In Kotlin, we only need to tell the compiler whether we are going to change this result in the future. 
In this case, we use the ```var``` or, in most cases, ```val```. 
So most formulas in Kotlin are like physical formulas, 
only before the result variable we write the keyword: 

```val s = 4.m*5.m```

In Java you have to explicitly specify the type of the variable in the variable declaration. The good news is that if you use KotUniL library objects, you only need to use the Expression class in this case, for example:
```java
Expression s = m.times(4).times(m.times(5));
```

This works because KotUniL objects that are dynamically calculated by any formula are always
inherited from that class.

***

These simple rules will allow you to "translate" your formulas from "physics language" to Kotlin or Java in most almost interesting cases.
The same rules apply to currencies and units that you invent and implement yourself.
For more tricky cases, you can " look up" solutions in console applications 
in [Kotlin](https://github.com/vsirotin/si-units/blob/3c426412ffaa64641c45bfb93b44051c981242fb/apps/jvm/kotlin-console ) 
and [Java](https://github.com/vsirotin/si-units/blob/3c426412ffaa64641c45bfb93b44051c981242fb/apps/jvm/java-console ), which test the functionality of the library.  