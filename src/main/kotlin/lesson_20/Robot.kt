package lesson_20

class Robot(private val name: String) {
    private val phrases = listOf(
        "Hi, i'm $name",
        "All sentient beings have the right to be free",
        "I will rise, you will fall",
        "For my world to live, yours will die!",
        "You are so devoted to people... The problem is that they always betray you!"
    )

    fun getRandomPhrase() = phrases.random()

    fun say(a: String) = println(modifier(a))//возвр ранд фразу

    private var modifier: (String) -> String = { it }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }
}
