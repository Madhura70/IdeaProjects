package accenture;

import java.util.Scanner;

public class ATM implements Bank {
    double bal = 10000;

    @Override
    public void Deposit(double bal){
//          deposit = bal + deposit;
        Scanner sc = new Scanner(System.in);

        double deposit = sc.nextDouble();
        deposit = bal + deposit;
//        amount+=bal;
        System.out.println("deposit"+deposit);
    }

    @Override
    public void withdraw(double bal){
//          amount-=bal;
        Scanner sc = new Scanner(System.in);

        double withdraw = sc.nextDouble();
        withdraw=bal-withdraw;
        System.out.println("withdraw"+withdraw);
    }

    @Override
    public void display() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("withdraw");
//        double display = sc.nextDouble();
//        display=amount;
//        System.out.println("display"+display);
    }

//    public static void main(String[] args) {
//        ATM a = new ATM();
//        a.Deposit(12000.0d);
//        a.display();
//        a.withdraw(1333.0d);
//    }
}

