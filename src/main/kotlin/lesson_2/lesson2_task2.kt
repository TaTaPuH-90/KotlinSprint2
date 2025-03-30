package org.example.lesson_2

fun main() {

    val worker = 50
    val intern = 30
    val salaryOfWorker = 30000
    val salaryOfIntern = 20000
    val expensesForWorker = worker * salaryOfWorker
    val generalExpenses = (worker * salaryOfWorker) + (intern * salaryOfIntern)
    val averageSalary = ((worker * salaryOfWorker) + (intern * salaryOfIntern)) / (worker+intern)

    println(expensesForWorker)
    println(generalExpenses)
    println(averageSalary)
}