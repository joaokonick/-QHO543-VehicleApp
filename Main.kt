
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

    println("After accelerating all by 10:")
    garage.accelerateAll(10)
    garage.displayVehicles()
}