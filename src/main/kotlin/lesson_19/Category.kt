package lesson_19

enum class Category {
    CLOTHES,
    STATIONERY,
    OTHER;

    fun getCategory(category: Category) =
        category.name.toString()[0] + category.name.toString().substring(1).lowercase()
}