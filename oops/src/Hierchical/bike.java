package Hierchical;

public class bike extends vehicle {
    String bikeName = "Honda" ;

    public void isBike() {
       System.out.println("bike name is honda");

       bike b = new bike();
       b.isVehicle();
       b.isBike();
    }
}
