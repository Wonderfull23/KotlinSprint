package lesson_14

import kotlin.math.sqrt

class Triangle(color: String, private val a: Double, private val b: Double, private val c: Double) :
    Figure(color) {
    override fun area(): Double{
        val p = perimeter() / 2
        return sqrt(p * (p - a) * (p - b) * (p - c))
    }

    override fun perimeter() = a + b + c
}