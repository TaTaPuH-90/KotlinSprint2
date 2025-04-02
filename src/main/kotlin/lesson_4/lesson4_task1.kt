package org.example.lesson_4

fun main() {

    val reservationToday = 13
    val reservationTomorrow = 9

    println("Досупность столиков на сегодня: ${reservationToday < TABLE}")
    println("Досупность столиков на завтра: ${reservationTomorrow < TABLE}")
}

const val TABLE = 13