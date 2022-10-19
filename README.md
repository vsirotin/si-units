# si-units
**SI-Units** a library of functions and objects of Kotlin for working with SI units like meter, second, 
as well as currencies and general units like percent. 

**The library is currently in the first phase of development. 
Please wait until the first version is ready.**

**SI-Units** a library of functions and objects of Kotlin that meet the following requirements in total:
- 1\. It covers all units of SI base units (see https://en.wikipedia.org/wiki/International_System_of_Units) like meter, second etc. as well as some other common units like currencies, percentages etc.
- 2\. It allows various formulas to be written in Kotlin in a way maximally similar to the way formulas are written in physics and economics.
- 3\. It allows analyzing dimensions of results of applications of complicated formulas.
- 4\. It allows to detect most of the typical errors when working with SI units already at the compilation stage. Errors in incorrect use of physical units in complex formulas are detected in runtime.
- 5\. It is pure library (no plug-in, no parser etc.), it has no dependencies

Let's consider some simple examples:

Different dimensions:

In Eve's case, a glass broke in her aquarium and water flowed on floor. In aquarium before breakage was 32 liters of water. Eva'a room is 4 m. long and 4.3 tall. How high in mm. is water now in Eva's room with assumption that it stayed there and did not flow away?

The solution in Kotlin can be written in one line. For didactic reasons like introduce two auxiliary variables s and h.

        val s = 4.m * 4.3.m
        val h = 32.l/s   
        print("Water height is ${h.mm} mm."

Please note that the variable **s** is physical dimension **m2** (square meter) and **h** - **m** (simple meter).
