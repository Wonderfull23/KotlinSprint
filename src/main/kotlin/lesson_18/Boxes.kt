package lesson_18

import kotlin.math.pow

abstract class Box {
    abstract fun getArea(): Double
}

class RectangleBox(private val length: Double, private val width: Double, private val high: Double): Box(){
    override fun getArea() = 2*(length * width + width * high + length * high)
}

class CubeBox(private val cubeSide: Double): Box(){
    override fun getArea() = (6 * cubeSide).pow(2)
}