package lesson_20

fun main() {
    val elements = listOf("button", "banner", "checkbox", "search button")
    val listOfLambdas = mutableListOf<() -> String>()
    elements.map {
        listOfLambdas.add( {"Нажат элемент $it"} )
    }
    listOfLambdas.forEach{ println(it()) }
}
