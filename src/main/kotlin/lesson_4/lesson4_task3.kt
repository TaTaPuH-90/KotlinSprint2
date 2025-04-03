package org.example.lesson_4

fun main() {

    val isSunnyToday: Boolean = true
    val isAwningOpen: Boolean = true
    val airHumidity: Int = 20
    val timeOfYear: String = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых?" +
            " ${(isSunnyToday == WEATHER_IS_SUNNY) && (isAwningOpen == OPEN_AWNING) 
                    && (timeOfYear != Year_TIME) && (airHumidity == AIR)}")
}

const val WEATHER_IS_SUNNY = true
const val Year_TIME = "зима"
const val OPEN_AWNING = true
const val AIR = 20
