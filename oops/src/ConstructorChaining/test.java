package ConstructorChaining;

public class test {
    public test(){
        System.out.println("1");    }
    public test(int a){
        this();
        System.out.println(2);
    }
    public test(float a){
        this(1);
        System.out.println(3);
    }
    public static void main(String[] args){
        test t = new test(1.2f);
    }
}
