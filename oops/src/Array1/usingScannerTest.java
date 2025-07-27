package Array1;

import java.util.Scanner;

public class usingScannerTest {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};

        //simple print an array
        System.out.println("simple print an array");
        for (int i= 0;i<=a.length-1;i++){
            System.out.println(a[i]);
        }

            System.out.println("--------");

        //reverse direction
        System.out.println("reverse direction");
        for (int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }

    }
}
