package org.example.Aquarium

    fun main(){
     //   printSpice()
        lambdaPractice()
    }

    fun printSpice() {
        val spice1 = SimpleSpice("turmeric", "sour")
        val spice2 = SimpleSpice("lemon juice", "tangy")
        val spice3 = SimpleSpice("garlic", "mild")
        val simpleSpicelist:List<SimpleSpice>  = listOf(spice1, spice2, spice3)
        println("heat3 " + spice3.heat)
        println("heat2 " + spice2.heat)
        println("heat 1 " + spice1.heat)
        val filteredspiceList = simpleSpicelist.filter { it.heat==1}
        for(spice:SimpleSpice in filteredspiceList){
            println("spice name " + spice.spiceName)
        }
    }

fun lambdaPractice() {
    var path: MutableList<Directions> = mutableListOf(Directions.START);
    println(path)
    var north = { path.add(Directions.NORTH) };
    var south = { path.add(Directions.SOUTH) };
    var east = { path.add(Directions.EAST) };
    var west = { path.add(Directions.WEST) };
    var end = {
        path.add(Directions.END)
        println("Game over")
        println(path)
        path.clear()
        false
    }
    north.invoke()
    south.invoke()
    east.invoke()
    west.invoke()
    end.invoke()
    println(path)
    val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,0)
}


