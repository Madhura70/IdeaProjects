package CustomException;

import java.util.Scanner;

public class Test extends MyException {
    public static void main(String[] args) throws MyException{
        int id = 123;
        int pswd =121;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id");
        if(sc.nextInt()==id){
            System.out.println("Enter pswd");
            if (sc.nextInt()==pswd){
                System.out.println("Login");
            }
            else {
                MyException e = new MyException();
                throw e;

            }
        }else {
            System.out.println("Invalid id");
        }
    }
}
