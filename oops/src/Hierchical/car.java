package Hierchical;

public class car extends vehicle {
    String carName="BMW";

    public void isCar(){
        System.out.println("bike name is Bmw");

        car c = new car();
        c.isVehicle();
        c.isCar();

    }
}
