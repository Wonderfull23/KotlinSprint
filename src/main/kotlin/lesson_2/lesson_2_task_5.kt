package lesson_2

import kotlin.math.pow

fun main() {
    val capital = 70_000
    var interestRate = 0.167
    val years = 20

    val result: Double = capital * (1+ interestRate).pow(years)
    println("%.3f".format(result))
}
