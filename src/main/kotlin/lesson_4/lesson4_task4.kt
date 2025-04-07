package org.example.lesson_4

fun main() {

    val month = 31
    val monthlyPlanArmsLegs = month % THE_PARITY_DETERMINANT
    val trainingDAy = 5
    val eventOfTrainingDay = trainingDAy % THE_PARITY_DETERMINANT

    println(
        """|Упражнение для рук: ${eventOfTrainingDay == monthlyPlanArmsLegs}
          |Упражнение для ног: ${eventOfTrainingDay != monthlyPlanArmsLegs}
          |Упражнение для спины: ${eventOfTrainingDay != monthlyPlanArmsLegs}
          |Упражнение для пресса: ${eventOfTrainingDay == monthlyPlanArmsLegs} """.trimMargin()
    )
}

const val THE_PARITY_DETERMINANT = 2