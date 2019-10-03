fun main()
{

    var kocsiSzalon = DealerShip("szalon","Budapest",123456)
    kocsiSzalon.addNewCar(Car("123-asd",CarType.FERRARI,500,50000000))
    kocsiSzalon.addNewCar(Car("ABC-123",CarType.SUZUKI,50,10000))
    kocsiSzalon.SaveOut()
    kocsiSzalon.LoadIn()
    println( kocsiSzalon.toString())
    
}
