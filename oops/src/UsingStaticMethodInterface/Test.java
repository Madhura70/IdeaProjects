package UsingStaticMethodInterface;

public class Test {
    private Test(){
        System.out.println("Object Created");
    }
    static void CreateObject(){   // helper method
        Test t = new Test();
    }
}
