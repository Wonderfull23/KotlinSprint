package lesson_15

fun main() {
    val musicInstruments = MusicInstruments(mapOf("гитара" to 15, "укулеле" to 18, "барабанная установка" to 4))
    val accessories =
        Accessories(mapOf("комплект струн" to 47, "барабанные палочки" to 20, "стикерпак metallica" to 0))

    musicInstruments.search("гитара")
    accessories.search("комплект струн")
    musicInstruments.search("скрипка")
    accessories.search("Стикерпак Metallica")

}