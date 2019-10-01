

open class Car(var Plate:String, var Type:String, var HorsePower:Int, var Price:Int)

class PersonalCar(Plate: String, Type: String, HorsePower: Int, Price: Int) : Car(Plate, Type, HorsePower, Price)

class BorrowCar(Plate: String, Type: String, HorsePower: Int, Price: Int): Car(Plate, Type, HorsePower, Price)

