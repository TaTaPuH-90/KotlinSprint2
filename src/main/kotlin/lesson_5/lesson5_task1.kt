package org.example.lesson_5

fun main() {

    val number1 = 4
    val number2 = 6

    println("Сложи числа $number1+$number2")

    val sum = number1 + number2
    val enteredData = readln().toInt()
    val result = if (enteredData == sum)
        "Добро пожаловать!"
    else "Доступ запрещен"

    println(result)
}