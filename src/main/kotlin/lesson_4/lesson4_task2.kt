package org.example.lesson_4

fun main() {

    val cargoWeight1 = 20
    val cargoVolume1 = 80

    println("Груз с весом 20 кг и обьемом 80 л соответсвует категории 'Average' : ${MINIMUM_WEIGHT < cargoWeight1 && cargoWeight1  <= MAXIMUM_WEIGHT && cargoVolume1 < VOLUME }")

    val cargoWeight2 = 50
    val cargoVolume2 = 100

    println("Груз с весом 50 кг и обьемом 100 л соответсвует категории 'Average' : ${MINIMUM_WEIGHT < cargoWeight2 && cargoWeight2  <= MAXIMUM_WEIGHT && cargoVolume2 < VOLUME }")
}

  const val MINIMUM_WEIGHT = 35
  const val MAXIMUM_WEIGHT= 100
  const val VOLUME = 100