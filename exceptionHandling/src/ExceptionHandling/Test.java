package ExceptionHandling;

import java.lang.Exception;
import java.lang.RuntimeException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:   ");
        int a = sc.nextInt();
        System.out.println("Enter Number:   ");
        int b = sc.nextInt();
        try {
           System.out.println("Output:  " + a / b);  // might come Exception so use try catch block
        }
        catch (ArithmeticException e){          //(GrandFather)
            System.out.println("Not Possible");
            System.out.println(e);
        }
//        catch (RuntimeException e){           //(Father)
//            System.out.println("Not Possible");
//            System.out.println(e);
//        }
//        catch (Exception e){                  //(son)
//            System.out.println("Not Possible");
//            System.out.println(e);
//        }

//        System.out.println(10/0);   //Exception in thread "main" java.lang.ArithmeticException: / by zero at ExceptionHandling.Test.main(Test.java:5)
    }
}
