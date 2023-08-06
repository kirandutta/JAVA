abstract class vehicle
{
    abstract void start();
}

class scooter extends vehicle
{
    void start()
    {
        System.out.println("Scooter starts by a kick");
    }
}

public class car extends vehicle{
    void start()
    {
        System.out.println("Car start by a key");
    }
    scooter a=new scooter();
    a.start();
    car b=new car();
    b.start();
}
