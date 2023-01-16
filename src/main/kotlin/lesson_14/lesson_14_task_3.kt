package lesson_14

fun main() {
    val post = Post(
        "Bob Marley",
        "Don't Gain The World & Lose Your Soul, Wisdom Is Better Than Silver Or Gold.",
        "No woman no cry"
    )
    val comment = Comment(
        "Kurt",
        "I'm so happy. Cause today I found my friends. They're in my head"
    )

    post.printPost()
    comment.printComment(post)
}