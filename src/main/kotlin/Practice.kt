package org.example

import java.lang.Math.random

fun main(){
 //   testPrint()
   //println("fortune cookie message"+getFortuneCookie())
   // println("can we add fish "+   canAddFish(10.0, listOf(3,3,3)))
    //println("can we add fish "+   canAddFish(9.0, listOf(1,1,3), hasdecorations = true))
    //println("can we add fish "+   canAddFish(10.0, listOf(), 7, true))
   /* print("Enter the mood of the day")
    var mood:String= readln()
    System.out.println( whatShouldIDoToday(mood))*/
   // practiceFilter()
}

fun testPrint() {
    println("test")
}
fun getFortuneCookie():String{
    var fortuneCookieList:List<String> = listOf("You will have a great day!", "Things will go well for you today.", "Enjoy a wonderful day of success")
    print("enter your birthday")
    val fortunelistLength:Int = fortuneCookieList.size

    return when(getBirthday()){
        28,31-> "You will have a great day!"
        in 1..7 -> "Things will go well for you today"
        else ->"Enjoy a wonderful day of success"
    }
}

fun getBirthday():Int{
    return readLine()?.toIntOrNull()?:1
}

fun canAddFish(
    tanksize: Double,
    currentFishlist: List<Int>,
    fishsize: Int = 2,
    hasdecorations: Boolean = true
): Boolean {
    return when (currentFishlist.size) {
        0 -> true
        else -> {
            var totalFishSize:Int?=0
            for(eachFishsize:Int in currentFishlist){
                totalFishSize = eachFishsize * fishsize + totalFishSize!!
            }
            if(totalFishSize!! > tanksize && hasdecorations){
                return false
            } else {
                return true
            }

        }
    }
}

fun whatShouldIDoToday(mood:String, weather:String="Sunny",temperature:Int=24){
    when {
        mood == "happy" && weather == "Sunny" -> println("go for a walk")
        mood == "sad" && weather == "rainy" && temperature == 0 -> println("stay in bed")
        temperature > 35 -> println("go swimming")
        else -> println("Stay home and read.")
    }
}

fun practiceFilter(){
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    println(spices.filter {it[0] =='c'})
    println(spices.filter {it[0] =='c' && it[it.length-1] == 'e'})
    println(spices.filter {it.contains("curry")}.sortedBy { it.length })
    println(spices.subList(0,2).filter { it.startsWith('c') })
    val random1 = random()

    var sides = 5

    var rollsides = {(0..12).random()}
    var rolsides1 = {sides:Int->(0..12).random()}
    var rolsides2 = {sides:Int->
        if (sides == 0){
            0
        }
        else{
            (0..12).random()
        }
    }
    var rolldice2:(Int) -> Int = {sides->
        if (sides == 0){
            0
        }
        else{
            (0..12).random()
        }
    }

    fun gameplay(rolldice:Int) {
        println("rolldice "+ rolldice)
    }

    gameplay(rolldice2(sides))

}

