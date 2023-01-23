package lesson_17

fun main() {
    val quiz = Quiz("Standard question", "gdfgd")
    println(quiz.answer)
    quiz.question = "Do you want to start first?"
    quiz.answer = "No"
    println(quiz.answer)
    quiz.question = "Do you want to start second?"
    quiz.answer = "Yes"
    println(quiz.answer)
}