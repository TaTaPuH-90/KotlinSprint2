package org.example.lesson_1

const val SEC_HOURS = 3600
const val SEC_MIN = 60

fun main() {
    val given = 13250
    val hours = given / SEC_HOURS
    val minutes = (given % SEC_HOURS) / SEC_MIN
    val seconds = given - (hours * SEC_HOURS) - (minutes * SEC_MIN)

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}