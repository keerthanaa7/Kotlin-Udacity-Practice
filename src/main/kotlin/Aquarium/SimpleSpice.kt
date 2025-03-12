package org.example.Aquarium

class SimpleSpice(val spiceName:String, val spicelevel:String="mild") {
    init {
        println(spiceName+spicelevel)
    }

    val heat: Int
        get() {
            return when (spicelevel) {
                "mild" -> 1
                "tangy" -> 2
                "sour" -> 3
                else->4
            }
        }

    fun filterSpices() {

    }
}