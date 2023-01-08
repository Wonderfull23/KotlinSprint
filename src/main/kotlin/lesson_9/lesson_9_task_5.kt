package lesson_9

fun main() {
    println("Enter 5 ingredients one by one please")
    val list = List(5) { readln() }

    val sortedList = list.toSet().sorted()
    print(sortedList[0].replaceFirstChar { it.uppercase() } + ", ")
    for (i in 1 until sortedList.lastIndex) print(sortedList[i] + ", ")
    println(sortedList[sortedList.lastIndex] + ".")
}