
fun main(){
    val vehicles = mutableListOf<Vehicle>()

    val car = Car("Toyota", 4)
    car.accelerate(60)
    car.brake(10)
    vehicles.add(car)

    val motorcycle = Motorcycle("Honda", false)
    motorcycle.accelerate(80)
    motorcycle.brake(20)
    vehicles.add(motorcycle)

    for (vehicle in vehicles) {
        vehicle.displayInfo()
    }
}                                  
