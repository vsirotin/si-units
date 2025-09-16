package eu.sirotin.kotunil.specialunits

    val Number.`#` : Thing
        /**
         * Returns a Thing object for the current number value.
         */
        get() = Thing(this.toDouble())


    /**
     * Thing unit for representation of some object.
     */
    val `#` = Thing(1.0)
