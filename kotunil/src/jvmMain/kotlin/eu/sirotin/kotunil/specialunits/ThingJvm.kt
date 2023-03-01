package eu.sirotin.kotunil.specialunits

    val Number.`#` : Thing
        /**
         * Returns Thing-Object for current number value.
         */
        get() = Thing(this.toDouble())


    /**
     * Thing-unit for representation of some object.
     */
    val `#` = Thing(1.0)
