# KotUniL Release Notes

# Version 4.2.2
1. Update to Kotlin 2.0.
2. Release mutliplatform artifacts. 


# Version 4.2.1
1. Update of main library to enable using of it functions from TypeScript.
2. Creation of sample sub-project for TypeScript.
3. Update of sample project for JavaScript. 

# Version 4.1.2
1. Small extension of tests (see issue #56) 

# Version 4.1.1
1. Derived units created with point operator from Numbers have as result its class,
not Expression as in previous versions. 
2. Non-SI Units declared in many separated files to avoid compiler error described 
in issue #50.
3. New unit tests. 

# Version 4.0.1

1. Demonstration of operations and comparison of objects with different definition but the same physical dimension.
2. Preliminary implementation for eliminating an initialization error for static objects that depends on order of processing of classes at run-time.

## Version 4.0.0
Method Expression.show() is removed because different behaviour 
used Kotlin/Java method on different platforms.
Not relevant for Kotlin behavior, but needed für Java and JavaScript annotations added. 

## Version 3.0.0

Because of implementation of operators like "+=" it is necessary to define property "value" in Expression as before. Formula is the API change and therefore major release number.
In fact, it is unlikely that users will notice this change.

Complete implementation of Kotlin's operators:
Unare operators:

        a = +b
        a = -b
Operators

    a++ 
and 

    a-- 
are not implemented due to known bugs Kotlin compiler 
(See https://youtrack.jetbrains.com/issue/KT-24800)

Augment assignments:

        a +=b
        a -=b
        a *=b
        a /=b
        a %=b


## Version 2.0.1

Restructuring of documentation. 

## Version 2.0.0

1. Re-Design internal classes. 
Re-Design of Library to avoid difference between creation elementary types and complex types. 
For users it should be irrelevant. (Enhancement, #15) 

## Version 1.1.1

1. BugFix: False calculation of some derived units #5: False calculation of some derived units, e.g. : assertEquals(1.kW, 1000.W)
2. Implement general unit "Thing" (Feature, #3)
3. Maven's coordinates changed: now it is: **eu.sirotin.kotunil:all** instead of **eu.sirotin.kotunil:kotunil**

## Version 1.0.1
Initial functionality