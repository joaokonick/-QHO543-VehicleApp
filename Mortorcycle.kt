class Motorcycle(
    brand: String,
    val hasSidecar: Boolean
) : Vehicle(brand) {
    
    override fun displayInfo() {
        println("Motorcycle: $brand, Sidecar: $hasSidecar, Speed: $speed km/h")
    }
}