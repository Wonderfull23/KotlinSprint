package lesson_19

class Product(
    private val name: String,
    private var id: Int,
    private val category: Category = Category.OTHER,
) {

    fun printInfo() = println("name: $name, id: $id, category: ${category.getCategory(category)}")

}