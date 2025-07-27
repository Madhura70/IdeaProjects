package useOfSuperKey;

import java.security.PublicKey;

public class test2 extends test{
    test2(String m){
        super(1);
        System.out.println("Child");
    }
    public static void main(String[] args){
        test2 t = new test2("Ram");

    }
}
