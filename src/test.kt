fun main()
{

    var kocsiSzalon = DealerShip("szalon","Budapest",123456)
    kocsiSzalon.addNewCar(Car("123-asd",CarType.FERRARI,500,50000000))
    kocsiSzalon.SaveOut()
    kocsiSzalon.LoadIn()
    println( kocsiSzalon.toString())
}
<<<<<<< HEAD
=======

>>>>>>> a769db49d91ff012df09bc1f72ec071fd6a7fa30
