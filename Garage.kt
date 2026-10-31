class Garage {
    private val vehicles = mutableListOf<Vehicle>()

    fun addVehicle(vehicle: Vehicle) {
        vehicles.add(vehicle)
    }

    fun findVehicleByBrand(brand: String): Vehicle? {
        return vehicles.find { it.brand.equals(brand, ignoreCase = true) }
    }

    fun displayVehicles() {
        for (vehicle in vehicles) {
            vehicle.displayInfo()
        }
    }

    fun accelerateAll(amount: Int) {
        for (vehicle in vehicles) {
            vehicle.accelerate(amount)
        }
    }
}