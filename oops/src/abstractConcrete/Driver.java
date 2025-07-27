package abstractConcrete;

public class Driver extends car {
    @Override
    public void start(){
        System.out.println("Car start");
    }

//    @Override
//    public void shiftgears() {
//        super.shiftgears();
//        System.out.println("Shift gear");
//    }

    @Override
    public void stop(){
        System.out.println("Car stop");
    }
    public static void main(String[] args){
        Driver d = new Driver();
        d.start();
//        d.shiftgears();
        d.stop();
    }
}
