package ExceptionHandling;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("Start");
        System.out.println(10/0);  //Exception in thread "main" java.lang.ArithmeticException: / by zero at ExceptionHandling.Test2.main(Test2.java:6)
        System.out.println("Stop");


    }

}
