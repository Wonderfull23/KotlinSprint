package lesson_13

fun main() {
    val number: Long
    val strNumber = readLine().toString()
    try {
        number = strNumber.toLong()
        println(number)
    }
    catch (e: NumberFormatException){
        println("Number can contain only figures")
    }
}
