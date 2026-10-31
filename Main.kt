
fun main() 				
{
    val car = Car("Toyota", 4) 
    car.accelerate(60)         
    car.displayInfo() 

    val motorcycle = Motorcycle("Honda", false)
    motorcycle.accelerate(80)
    motorcycle.brake(20)
    motorcycle.displayInfo()             		
}                                       
