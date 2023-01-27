package lesson_19

class SpaceShip(val name: String): StartLending, Shootable, StartFly {
    override fun startLending() {
        println("Начать приземление")
    }
    override fun startShoot() {
        TODO("Нужна доп. информация для логики")
    }

    override fun startFly() {
        throw NotImplementedError()
    }
}
interface StartFly{
    fun startFly()
}
interface Shootable{
    fun startShoot()
}
interface StartLending{
    fun startLending()
}