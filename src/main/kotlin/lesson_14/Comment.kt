package lesson_14

class Comment(author: String, text: String) : Post(author, text) {

    fun printComment(post: Post) = println("Comment from $author on the post ${post.postTitle}:\n$text")
}