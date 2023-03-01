
package eu.sirotin.kotunil.currency

/**
* Creates object for hold of Malaysian ringgit
*/
val Number.RM : MalaysianRinggit
    /**
    * Returns value of object for hold of Malaysian ringgit
    */
    get() = MalaysianRinggit(this.toDouble())

/**
* One unit of Malaysian ringgit
*/
val RM = MalaysianRinggit() 
    