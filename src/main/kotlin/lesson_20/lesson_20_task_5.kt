package lesson_20

fun main() {
    val robot = Robot("Optimus Prime")
    val randomPhrase = robot.getRandomPhrase()
    robot.say(randomPhrase)
    robot.setModifier { it.reversed() }
    robot.say(randomPhrase)
}