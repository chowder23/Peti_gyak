import Car
class DealerShip(val nev:String, var telephely:String, val adoszam:Int) {

    var carsList = mutableListOf<Car>()

    fun addNewCar(kocsi:Car)
    {
        carsList.add(kocsi)
    }
    fun getCars()= carsList

    fun avarageHorsepower():Int
    {
        var atlag:Int = 0
        for(kocsi in carsList)
        {
            atlag+=kocsi.HorsePower
        }
        return atlag
    }
}