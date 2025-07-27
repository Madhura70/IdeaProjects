package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Linkmethods {
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<=5;i++){
            System.out.println("Enter "+i+" th "+"element: ");
            l1.add(sc.nextInt());
        }
        System.out.println("ArrayLink l1"+l1);
        System.out.println(l1.get(3));   //get() -->used to print or get index position value

    }
}
