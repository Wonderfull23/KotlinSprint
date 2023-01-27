package lesson_19

fun main() {
    val tank = Tank()
    tank.shoot()
    tank.arm(Bullet.GREEN)
    tank.shoot()
    tank.arm(Bullet.RED)
    tank.shoot()
}