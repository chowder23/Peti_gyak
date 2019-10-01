import Car
import java.io.File
import java.nio.file.Path

class DealerShip(val nev:String, var telephely:String, val adoszam:Int) {

    var allCarList = mutableListOf<Car>()

    fun addNewCar(kocsi:Car)
    {
        allCarList.add(kocsi)
    }
    fun getCars()= allCarList

    fun avarageHorsepower():Int
    {
        var atlag:Int = 0
        for(kocsi in allCarList)
        {
            atlag+=kocsi.HorsePower
        }
        return atlag
    }

    fun SaveOut()
    {
        val myFile = File("saves.txt")
        for (kocsi in allCarList)
        {
            myFile.appendText(kocsi.toString())
        }
    }

}