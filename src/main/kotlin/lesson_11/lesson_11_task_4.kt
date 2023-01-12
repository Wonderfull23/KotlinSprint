package lesson_11

fun main() {
    val contact1 = Contact(
        "CatLogo.png", "First Name Second Name",
        closeFriendsHeaders = mutableListOf("жена", "подруга", "подруга"),
        closeFriendsNames = mutableListOf("userName", "userName", "userName"),
        _mobilePhone = "89999994242",
        _homePhone = "89998884242",
        _iCloud = "mail@mail.ru",
    )

    println(contact1)
}