package org.example.lesson_4

fun main() {

    val weatherToday : Boolean = true
    val awning : Boolean =true
    val airHumidity : Int = 20
    val timeOfYear : String = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${(weatherToday == WEATHER) && (awning == OPEN_AWNING) && (timeOfYear == Year_TIME) && (airHumidity== AIR)}")
}
  const val WEATHER = true ; const val Year_TIME = "не зима"
  const val OPEN_AWNING = true ; const val AIR = 20
