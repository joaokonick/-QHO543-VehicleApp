
fun main() {
    val garage = Garage()

    val car = Car("Toyota", 4)
    car.accelerate(60)
    car.brake(10)
    garage.addVehicle(car)

    val motorcycle = Motorcycle("Honda", false)
    motorcycle.accelerate(80)
    motorcycle.brake(20)
    garage.addVehicle(motorcycle)

    garage.displayVehicles()

    val found = garage.findVehicleByBrand("Honda")
    if (found != null) {
        print("Found: ")
        found.displayInfo()
    }
}