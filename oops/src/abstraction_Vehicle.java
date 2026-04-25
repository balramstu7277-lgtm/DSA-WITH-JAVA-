abstract class vehicle{
    abstract void start();
}
class car extends vehicle{
    @Override
    void start(){
        System.out.println("Car starts ");
    }
}
class bike extends vehicle{
    @Override
    void start() {
        System.out.println("Bike starts ");
    }
}
public class abstraction_Vehicle {
    public static void  main(String []args){
        vehicle v1 = new car();
        v1.start();
        vehicle v2 = new bike();
                v2.start();
    }
}
