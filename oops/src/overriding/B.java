package overriding;

public class B extends A1 {

    @Override
    void m1(int a){
        super.m1(1);
        System.out.println("method 2");
    }
    public static void main(String[] args){
        B b = new B();
        b.m1(2);
    }
}
