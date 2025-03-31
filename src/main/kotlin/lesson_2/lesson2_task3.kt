package org.example.lesson_2

const val TIME = 60
fun main() {

    val startHours = 9
    val startMinute = 39
    val travelTimeMinutes = 457
    val totalStartMinutes = startHours * TIME + startMinute
    val arrivalMinutes = totalStartMinutes + travelTimeMinutes
    val endHours = arrivalMinutes / TIME
    val endMinutes = arrivalMinutes % TIME

    println("$endHours:$endMinutes")
}