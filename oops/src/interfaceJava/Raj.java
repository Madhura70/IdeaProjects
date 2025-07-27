package interfaceJava;

public class Raj implements Person{
    @Override
    public void eat(){
        System.out.println("Eating Vadapav");
    }

    public static void main(String[] args){
        System.out.println(Person.a);
        Raj r = new Raj();
        r.eat();
    }
}
