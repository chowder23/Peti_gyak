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
        myFile.delete()
        for (kocsi in allCarList)
        {
            myFile.appendText(kocsi.toSaveFormat())
        }
    }

    fun LoadIn()
    {
        val carStringList:List<String> = File("saves.txt").readLines()
        var carTempList = mutableListOf<Car>()
        var splittedCar:List<String>
        for (kocsiSor in carStringList)
        {
            splittedCar = kocsiSor.split(",")
            carTempList.add(Car(splittedCar[0],CarType.valueOf(splittedCar[1]),splittedCar[2].toInt(),splittedCar[3].toInt()))
        }
        allCarList=carTempList
    }

    override fun toString(): String {
        var cars:String = ""
        for(kocsi in allCarList)
        {
            cars+= kocsi.toString() + "\n"
        }
        return cars
    }

}