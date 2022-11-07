# si-units
**SI-Units** a library of functions and objects of Kotlin for working with SI units like meter, second, 
as well as currencies and general units like percent. 

**The library is currently in the first phase of development. 
Please wait until the first version is ready.**

**SI-Units** a library of functions and objects of Kotlin that meet the following requirements in total:
1. It covers all units of SI base units (see https://en.wikipedia.org/wiki/International_System_of_Units) like meter, second etc. as well as some other common units like currencies, percentages etc.
2. It allows various formulas to be written in Kotlin in a way maximally similar to the way formulas are written in physics and economics.
3. It allows analyzing dimensions of results of applications of complicated formulas.
4. It allows to detect most of the typical errors when working with SI units already at the compilation stage. Errors in incorrect use of physical units in complex formulas are detected in runtime.
5. It is pure library (no plug-in, no parser etc.), it has no dependencies

Let's consider some simple examples.

## 1. Getting started

In Eva's case, a glass broke in her aquarium and water flowed on floor. In aquarium before breakage was 32 liters of water. Eva'a room is 4 m. long and 4.3 tall. How high in mm. is water now in Eva's room with assumption that it stayed there and did not flow away?

The solution in Kotlin can be written in one line. For didactic reasons like introduce two auxiliary variables s and h.

        val s = 4.m * 4.3.m
        val h = 32.l/s   
        print("Water height is ${h.mm} mm."

## 2. Dimension analysis
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

## 3. Type safety

Physical units of the same dimension can be added, added, 
divided and compared.
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

## 4. Comparison of objects

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

## 5. Pretty print

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



