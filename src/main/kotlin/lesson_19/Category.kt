package lesson_19

enum class Category(private val category: String) {
    CLOTHES("Clothes"),
    STATIONERY("Stationery"),
    OTHER("Other");

    fun getCategory(category: Category) = category.category
}