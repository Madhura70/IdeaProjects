package Calculator;

import java.util.Scanner;

public class main implements Calculator {
    static int a;
    static int b;

    public static void main(String[] args) {
        Calculator cal =  new main();
        Scanner sc = new Scanner(System.in);
        for(;;){
            System.out.println("1.Add 2.Sub 3.Mul 4.Div 5.log 6.exit");
            int c = sc.nextInt();
            switch (c){
                case 1:
                    System.out.println("Enter value of a:");
                    a= sc.nextInt();
                    System.out.println("Enter the value of b");
                    b= sc.nextInt();
                    System.out.println("Anser is");
                    cal.Add(a, b);
                    break;
                case 2:
                    System.out.println("Enter value of a:");
                    a= sc.nextInt();
                    System.out.println("Enter the value of b");
                    b= sc.nextInt();
                    System.out.println("Anser is");
                    cal.sub(a, b);
                    break;
                case 3:
                    System.out.println("Enter value of a:");
                    a= sc.nextInt();
                    System.out.println("Enter the value of b");
                    b= sc.nextInt();
                    System.out.println("Anser is");
                    cal.div(a, b);
                    break;
                case 4:
                    System.out.println("Enter value of a:");
                    a= sc.nextInt();
                    System.out.println("Enter the value of b");
                    b= sc.nextInt();
                    System.out.println("Anser is");
                    cal.mul(a, b);
                    break;
                case 5:
                    System.out.println("Enter value of a:");

                    c= sc.nextInt();
                    System.out.println("Anser is");
                    int result = 0;
                    cal.log(result);
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }

    @Override
    public void Add(double a, double b) {
        System.out.println(a + b);
    }

    @Override
    public void sub(double a, double b) {
        System.out.println(a - b);
    }

    @Override
    public void div(double a, double b) {
        System.out.println(a / b);
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println("Invalid");
        }
    }

    @Override
    public void mul(double a, double b) {
        System.out.println(a * b);
    }

    @Override
    public void log(int c) {
//        System.out.println( log(a) = -log(1/a));

        if (c <= 0) {
            System.out.println("Logarithm undefined for zero or negative numbers.");
            return;
        }

        double result = 0.0;
        double x = c;

        // Normalize x to a number between 1 and 10
        while (x >= 10) {
            x /= 10;
            result++;
        }

        while (x < 1) {
            x *= 10;
            result--;
        }

        // For fractional part (rough approximation)
        double fraction = 0.0;
        double precision = 0.0001;
        double base = 10;
        double temp = 1.0;

        for (int i = 1; i <= 100; i++) {
            temp /= base;
            while (x >= Math.pow(10, fraction + temp)) {
                fraction += temp;
            }
        }

        result += fraction;

        System.out.println("Approximate Log base 10 of " + a + " is: " + result);
    }

}


