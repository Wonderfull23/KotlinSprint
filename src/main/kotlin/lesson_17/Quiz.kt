package lesson_17

class Quiz(_question: String, _answer: String) {
    var question = _question
        set(value) {
            field = if (value.contains('?')) value else "Standard question"
        }

    var answer = _answer
        get() = if (question == "Standard question") "Standard answer" else field
        set(value) {
            if (value == "Yes" || value == "No") field = value
        }


}