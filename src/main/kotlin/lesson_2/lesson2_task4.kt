package org.example.lesson_2

const val EDUCATOR_OF_PERCENT = 100

fun main() {
    val kristall = 7
    val iron = 11
    val buff = 20
    val buffKristall = kristall * buff / EDUCATOR_OF_PERCENT
    val buffIron = iron * buff / EDUCATOR_OF_PERCENT

    println("Бонусные кристаллы $buffKristall")
    println("Бонусное железо $buffIron")
}