package org.example.lesson_2

const val QUANTITY_STUDENT = 4

fun main(){

    val firstStudent = 3
    val secondStudent = 4
    val thirdStudent = 3
    val fourthStudent = 5
    val averageScore = (firstStudent+secondStudent+thirdStudent+fourthStudent) / QUANTITY_STUDENT.toFloat()

    println(averageScore)
}