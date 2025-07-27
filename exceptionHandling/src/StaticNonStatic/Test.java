package StaticNonStatic;

public class Test {
    static  int a = 10;
    int b = 20;

    static void main1(){
        System.out.println("Static method");
    }
    void main2(){
        System.out.println("Non static method");
    }

    static {                                        //First print this because --> main() method ko hum first call krte hai
        System.out.println("static block");
    }
    {
        System.out.println("Non static block");
    }

    public static void main(String[] args) {
        System.out.println(a);
        Test t = new Test();
        System.out.println(t.b);
        main1();
        t.main2();

    }

}
