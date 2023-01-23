package lesson_17

class Package(
    _name: String,
    _filesNumber: Int,
    var flag: Boolean,
) {
    val name = _name
        get() = if (flag) "Hidden package" else field
    val filesNumber = _filesNumber
        get() = if (flag) 0 else field
}