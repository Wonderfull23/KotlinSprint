package lesson_14

open class Post(
    val author: String,
    val text: String,
    val postTitle: String? = null
) {
    fun printPost() = println("Post $postTitle from $author:\n$text")
}