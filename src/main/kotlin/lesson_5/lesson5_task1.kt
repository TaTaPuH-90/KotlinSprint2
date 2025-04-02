package org.example.lesson_5

fun main() {

    println("Сложи числа 4+6")

    val enteredData = readln().toInt()
    val result = if (enteredData == 10)
        "Добро пожаловать!"
    else "Доступ запрещен"

    println(result)
}