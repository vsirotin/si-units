# si-units

**SI-Units** a library of functions and objects of Kotlin that meet the following requirements in total:
1. It covers all units of SI base units (see https://en.wikipedia.org/wiki/International_System_of_Units) like meter, second etc. as well as some other common units like currencies, percentages etc.
2. It allows various formulas to be written in Kotlin in a way maximally similar to the way formulas are written in physics and economics.
3. It allows analyzing dimensions of results of applications of complicated formulas.
4. It allows to detect most of the typical errors when working with SI units already at the compilation stage. Errors in incorrect use of physical units in complex formulas are detected in runtime.
5. It is pure library (no plug-in, no parser etc.), it has no dependencies

Let's consider some simple examples.

## 1. Getting started

### 1.1 Simple physical formulas

In Eva's case, a glass broke in her aquarium and water flowed on floor. In aquarium before breakage was 32 liters of water. Eva'a room is 4 m. long and 4.3 tall. How high in mm. is water now in Eva's room with assumption that it stayed there and did not flow away?

The solution in Kotlin can be written in one line. For didactic reasons like introduce two auxiliary variables s and h.

        val s = 4.m * 4.3.m
        val h = 32.l/s   
        print("Water height is ${h.mm} mm."

### 1.2 Dimension analysis
Please note that the variable **s** is physical dimension **m2** (square meter) and **h** - **m** (simple meter).
Furthermore, in this example we also used liters (**l**), which have dimension **m3** (cubic meters). 

Using the built-in function **unitSymbols()** you can determine the dimension of any object in terms of SI standard.
        
        val s = 4.m * 5.m
        assertEquals("m2", s.unitSymbols())
        
        val x = 20.l
        assertEquals("m3", x.unitSymbols())
        
        val h = x/s
        assertEquals("m", h.unitSymbols())
        
        val y = 1.2.s
        assertEquals("s", y.unitSymbols())

        val z = x/y
        assertEquals("m3/s", z.unitSymbols())

Using the built-in function **categorySymbols()** 
you can analyze dimensions of physical units in "academic" manner.

        val s = 4.m * 5.m
        assertEquals("L2", s.categorySymbols())
        
        val x = 20.l
        assertEquals("L3", x.categorySymbols())
        
        val h = x/s
        assertEquals("L", h.categorySymbols())

        val y = 1.2.s
        assertEquals("T", y.categorySymbols())

        val z = x/y
        assertEquals("L3T-1", z.categorySymbols())

### 1.3 Type safety

Physical units of the same dimension can be added, subtracted and compared.
If you try to do this with units of different types, 
you will get either compilation errors (for simple units) 
or run-time errors for complicated units. 

        //val x = 1.m + 2 compilation error
        //val y = 20.l/(4.m * 5.m) + 14 compilation error

        //Complex errors will be found in runtime:
        val exception = assertFailsWith<IllegalArgumentException>(
            block = { 1.m + 2.s }
        )
        assertTrue(exception.message!!.startsWith(COMPATIBILITY_ERR_PREFIX))

### 1.4 Comparison of objects

Physical objects can be compared only if they have the same dimensions. 

        assertTrue(5.m > 4.1.m)

        assertTrue(20.2*m3 > 4.2*m3)

        assertTrue(2.2*kg*m/s < 4.2*kg*m/s)

Otherwise you will get a run-time error.

        val v1 = 2.4.m
        val v2 = 2.4.s

        val exception = assertFailsWith<IllegalArgumentException>(
            block = { v1 >= v2 }
        )
        assertTrue(exception.message!!.startsWith(COMPATIBILITY_ERR_PREFIX))

oder:

        val v1 = 2.4.m*kg/s
        val v2 = 2.4.s*m3/ μV

        val exception = assertFailsWith<IllegalArgumentException>(
            block = { v1 >= v2 }
        )
        assertTrue(exception.message!!.startsWith(COMPATIBILITY_ERR_PREFIX))

### 1.5 Pretty print

Values of physical objects can be presented using the built-in function **show()** 
similar to the way they are presented in technical articles.

        val s = 4.m * 5.m
        assertEquals("20 m2", s.show("%.0f"))
        val x = 20.l
        val format = "%.2f"
        assertEquals("0,02 m3", x.show(format))
        val h = x/s
        assertEquals("0,001 m", h.show("%.3f"))
        val y = 3.1415927.m
        assertEquals("3,142 m", y.show("%.3f"))

## 2. How to use

You can use the library as a collection of open source code or 
as a built library (si-unit*.jar).
If you want to use it as source code, 
copy into your project all production files from 
**src/main/kotlin/eu/sirotin** except the package **generator**.

At the moment I am working to place appropriate JAR library 
in popular repositories. 

## 3. Deeper into details

### 3.1 Base Units

SI standard defines 7 base units, as well as some derived units 
and accepts historically established non-SI units.

The table below listed Base SI units.

You can define a physical unit by multiplying 
a value at unit variable or from a number (Double, Int etc.) 
if you write SI symbol after a dot after a number.

    1*s == 1.0.s

In special cases you can also create unit using a class constructor.

    Second(1.0) == 1.s

| SI Base Unit | Unit symbol |
|--------------|-------------|
| second       | s           |
| metre        | m           | 
| kilogram     | kg          |
| ampere       | A           | 
| kelvin       | K           | 
| mole         | mol         | 
| candela      | cd          | 

The name of the class differs from the name 
of the unit by first capital letter. 

### 3.2 Derived Units

SI standard defines beside base unit also 22 derived units. 
They are listed in the table below.
Do not be surprised if you encounter in this table 
and in SI-Unit library unusual for identifiers symbols like Ω. 
It is possible because according to Kotlin's specification most common unicode symbols can be used in Kotlin identifiers (see paragraph "1.2.4 Identifiers" in Kotlin Specification https://kotlinlang.org/spec/pdf/kotlin-spec.pdf).
Derived units can be used just like base units.
Both types can be used in a formula by multiplication or division.

| SI Derived Unit | Unit symbol | Formula                                            | 
|-----------------|-------------|----------------------------------------------------|
| radian          | rad         | m/m                                                |  
| steradian       | sr          | m2/m2                                              |  
| hertz           | Hz          | 1/s                                                |  
| newton          | N           | kg*m/(s `^` 2)                                     |  
| pascal          | Pa          | kg/(m * (s `^` 2))                                 |  
| joule           | J           | kg*(m2)/(s `^` 2)                                  |  
| watt            | W           | kg*(m2)/(s `^` 3)                                  |  
| coulomb         | C           | s*A                                                |  
| volt            | V           | kg\*m2*(s `^` -3) * (A `^` -1)                     |  
| farad           | F           | (kg  `^` -1) * (m  `^` -2) * (s `^` 4) * (A `^` 2) |  
| ohm             | Ω           | kg*m2 * (s `^` -3) * (A `^` -2)                    |  
| siemens         | S           | (kg `^` -1) * (m `^` -2) \*(s `^` 3)* (A `^` 2)    |  
| weber           | Wb          | kg*(m2) * (s `^` -2) * (A `^` -1)                  |  
| tesla           | T           | kg* (s `^` -2) * (A `^` -1)                        |  
| henry           | H           | kg* (m2)\*(s `^` -2)*(A `^` -2)                    |  
| degreeCelsius   | Celsius     | (K `^` 1)                                          |  
| lumen           | lm          | ((cd `^` 1)*sr)                                    |  
| lux             | lx          | cd\*sr*(m `^` -2)                                  |  
| becquerel       | Bq          | (s `^` -1)                                         |  
| gray            | Gy          | (m2)*(s `^` -2)                                    |  
| sievert         | Sv          | (m2)*(s `^` -2)                                    |  
| katal           | kat         | (mol * (s `^` -1))                                 | 

Also, do not wound yourself when you see the **^** symbol. 
Kotlin has no operator for power, but a function. SI-Unit was extended with this infix function. Unfortunately, with it can not set proper priority for this function. Although this looks like a "real" operator, for keeping proper operation prioritization, 
you have to put it in parenthesis. 

Most derived units can be derived from Based Units or from other Derived Units in different ways.  Look at the example of Tesla:

    assertEquals(T,	kg * (s `^` -2) * (A `^` -1))
    assertEquals(T,	Wb/ m2)

### 3.3 SI-Prefixes 

SI standard also defines SI prefixes 
and rules for their use with units ( Base and Derived). 
SI Units library implements this mechanism. 
The table of prefixes and their values can be seen 
in the table below. 

| Prefix | Symbol | Degree |
|--------|--------|--------|
| yotta  | Y      | 24     | 
| zetta  | Z      | 21     | 
| exa    | E      | 18     | 
| peta   | P      | 15     | 
| tera   | T      | 12     | 
| giga   | G      | 9      | 
| mega   | M      | 6      | 
| kilo   | k      | 3      | 
| hecto  | h      | 2      | 
| deca   | da     | 1      | 
| deci   | d      | -1     | 
| centi  | c      | -2     | 
| milli  | m      | -3     | 
| micro  | μ      | -6     | 
| nano   | n      | -9     | 
| pico   | p      | -12    | 
| femto  | f      | -15    | 
| atto   | a      | -18    | 
| zepto  | z      | -21    | 
| yocto  | y      | -24    |

In example below we check that one kilometer is equal 
to milliard of millimeter.  

        val d = km - (10 `^` 9) * μm
        assertTrue(abs(d.value) < (10 `^` -9))
