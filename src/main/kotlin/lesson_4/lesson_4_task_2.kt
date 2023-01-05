package lesson_4

fun main() {
    val limitWeight = 35..100
    val limitVolume = 0 until 100
    val cargos = arrayOf(Cargo(20,80), Cargo(50, 100))

    for (cargo in cargos)
    println("Average для груза с весом ${cargo.weight} кг и объемом ${cargo.volume} л: " +
            "${cargo.weight in limitWeight && cargo.volume in limitVolume}")

}

data class Cargo (val weight: Int, val volume: Int)