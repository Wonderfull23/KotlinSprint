package lesson_19

class Tank(private var usingBullet: Bullet = Bullet.BLUE) {
    fun arm(bullet: Bullet){
        println("Tank is loading with ${bullet.color} bullets")
        usingBullet = bullet
    }

    fun shoot(){
        println("Shoot(deal ${usingBullet.damage} to an enemy)")
    }
}