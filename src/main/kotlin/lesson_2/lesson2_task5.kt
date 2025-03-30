package org.example.lesson_2

import kotlin.math.pow

const val VARIABLE_OF_FORMULA = 1

fun main() {
    val deposit = 70000
    val percentRate = 16.7
    val depositTerm: Double = 20.0
    val accrualPeriod= 1
    val valueOfDeposit = deposit * (VARIABLE_OF_FORMULA + percentRate / accrualPeriod / EDUCATOR_OF_PERCENT).pow((depositTerm * accrualPeriod))

    println("%.3f".format(valueOfDeposit))
}