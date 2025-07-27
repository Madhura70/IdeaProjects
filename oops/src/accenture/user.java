package accenture;

import java.util.Scanner;

public class user extends ATM{

    public static void main(String[] args) {
    Bank a =new ATM();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID:  ");
        int id = sc.nextInt();
        System.out.println("Enter pswd");
        String pass = sc.next();
        if(id==Bank.id){
            System.out.println("Enter pswd");
            if(pass.equals(Bank.pswd)){
                for(;;){
                    System.out.println("\"1.deposite 2.withdraw 3.balance 4.exit");
                    switch(sc.nextInt()){
                        case 1:
                            System.out.println("Enter deposit");
                            a.withdraw(sc.nextDouble());
                            break;
                        case 2:
                            System.out.println("Enter withdraw");
                            a.Deposit(sc.nextDouble());
                            break;
                        case 3:
                            System.out.println("display all");
                            a.display();
                            break;
                        case 4:
                            System.exit(0);
                        default:
                            System.out.println("Wrong input");
                    }
                }
            }
            else {
                System.out.println("Wrong");
            }


        }

//        System.out.println("1.deposite 2.withdraw 3.balance");
//        switch () {
//            case value1:
//
//                break;
//            case value2:
//
//                break;
//
//            default:
//
//        }

    }
}
