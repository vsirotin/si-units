# KotUniL Release Notes

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