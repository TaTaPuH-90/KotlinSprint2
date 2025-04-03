package org.example.lesson_5

fun main() {
    val firstWinningNumber = 16
    val secondWinningNumber = 35

    println("Введите первое число от 0 до 42")
    val number1 = readln().toInt()

    println("Введите второе число от 0 до 42")
    val number2 = readln().toInt()

    if (number1 == firstWinningNumber &&
        number2 == secondWinningNumber ||
        number2 == firstWinningNumber &&
        number1 == secondWinningNumber
    )
        println("Поздравляем! Вы выиграли главный приз!")
    else if (number1 == firstWinningNumber ||
        number2 == secondWinningNumber ||
        number2 == firstWinningNumber ||
        number1 == secondWinningNumber
    ) {
        println("Вы выиграли утешительный приз!")
        println("Выигрышные числа $firstWinningNumber и $secondWinningNumber")
    } else {
        println("Неудача!")
        println("Выигрышные числа $firstWinningNumber и $secondWinningNumber")
    }
}