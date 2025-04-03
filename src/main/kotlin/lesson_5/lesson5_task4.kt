package org.example.lesson_5

fun main() {

    val registeredName = "Zaphod"
    val registeredPassword = "PanGalactic"
    println("Введите имя пользователя")

    val userName = readln()

    if (userName != registeredName) {
        println("Такой пользователь не найден. Зарегистрируйтесь . Заверешение программы")
        return
    } else println("Введите пароль")

    val userPassword = readln()

    if (userPassword == registeredPassword)
        println(
            "Пользователь \"$userName\", вам разрешено входить на борт" +
                    " корабля \"Heart of Gold\""
        )
    else println("Неверный пароль")
}