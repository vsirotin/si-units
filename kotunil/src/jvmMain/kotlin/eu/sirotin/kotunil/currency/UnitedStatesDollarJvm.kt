package eu.sirotin.kotunil.currency


/**
* Creates an object to hold United States dollar
*/
val Number.`US$` : UnitedStatesDollar
    /**
    * Returns the value of the object holding United States dollar
    */
    get() = UnitedStatesDollar(this.toDouble())

/**
* One unit of United States dollar
*/
val `US$` = UnitedStatesDollar()
