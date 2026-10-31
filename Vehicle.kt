open class Vehicle(val brand: String) { 
    var speed: Int = 0
        private set

    fun accelerate(amount: Int) {
        if (amount > 0) {
            speed += amount
        }
    }

    fun brake(amount: Int) {
        if (amount > 0) {
            speed = (speed - amount).coerceAtLeast(0)
        }
    }

    open fun displayInfo() {
        println("Brand: $brand, Speed: $speed km/h")
    }
}