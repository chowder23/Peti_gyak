import CarType

open class Car(var Plate:String, var Type:CarType, var HorsePower:Int, var Price:Int)
{


    override fun toString(): String {
        return "Plate: $Plate, Type: $Type, HorsePower: $HorsePower, Price: $Price"
    }
    fun toSaveFormat():String{
        return "$Plate,$Type,$HorsePower,$Price"
    }
}

class PersonalCar(Plate: String, Type: CarType, HorsePower: Int, Price: Int) : Car(Plate, Type, HorsePower, Price)
{

}

class BorrowCar(Plate: String, Type: CarType, HorsePower: Int, Price: Int): Car(Plate, Type, HorsePower, Price)
{

}

