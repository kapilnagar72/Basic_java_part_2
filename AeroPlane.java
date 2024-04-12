package Inheritance;
public class AeroPlane {  // inherited
    public void takeoff()
    {
        System.out.println(" Aeropalne takeoff ");
    }
    public void fly()
    {
        System.out.println(" Aeroplane is flying");
    }
}

class CargoPlane extends AeroPlane
{

}
class PassengerPalne extends AeroPlane
{

}
class Inheritance5
{
    public static void main()
    {
    CargoPlane cp = new CargoPlane();
    cp.takeoff();
    cp.fly();

    PassengerPalne pp = new PassengerPalne();
    pp.takeoff();
    pp.fly();

    }
}



/* 
public class AeroPlane {  // overridden 
    public void takeoff()
    {
        System.out.println(" Aeropalne takeoff ");
    }
    public void fly()
    {
        System.out.println(" Aeroplane is flying");
    }
}

class CargoPlane extends AeroPlane
{

}
class PassengerPalne extends AeroPlane
{

}
class Inheritance5
{
    public static void main()
    {
    CargoPlane cp = new CargoPlane();
    cp.takeoff();
    cp.fly();

    PassengerPalne pp = new PassengerPalne();
    pp.takeoff();
    pp.fly();

    }
}
*/


/* 

public class AeroPlane {  // Specialized
    public void takeoff()
    {
        System.out.println(" Aeropalne takeoff ");
    }
    public void fly()
    {
        System.out.println(" Aeroplane is flying");
    }
}

class CargoPlane extends AeroPlane
{

}
class PassengerPalne extends AeroPlane
{

}
class Inheritance5
{
    public static void main()
    {
    CargoPlane cp = new CargoPlane();
    cp.takeoff();
    cp.fly();

    PassengerPalne pp = new PassengerPalne();
    pp.takeoff();
    pp.fly();

    }
}

*/