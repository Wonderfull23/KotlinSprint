package lesson_18

abstract class Figure(val x: Double, val y: Double,) {
}

class Point(x: Double, y: Double,) : Figure(x, y){
    
}

class Circle(x: Double, y: Double, val radius: Double) : Figure(x, y){

}

class Square(x: Double, y: Double, val side: Double) : Figure(x, y){

}