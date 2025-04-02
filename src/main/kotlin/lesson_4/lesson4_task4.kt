package org.example.lesson_4

fun main() {

    val monthlyPlanArmsLegs = 1..31 step 2
    val trainingDAy = 5
    println(
        """|Упражнение для рук: ${trainingDAy in monthlyPlanArmsLegs} 
            |Упражнение для ног: ${trainingDAy !in monthlyPlanArmsLegs} 
            |Упражнение для спины: ${trainingDAy !in monthlyPlanArmsLegs} 
            |Упражнение для пресса: ${trainingDAy in monthlyPlanArmsLegs} """.trimMargin()
    )
}

