class Car(
    brand: String,
    val doors: Int
) : Vehicle(brand) {
    
    override fun displayInfo() {
        println("Car: $brand, Doors: $doors, Speed: $speed km/h")
    }
}