package StaticNonStatic;

public class Test2 {
    static void main1() throws ArithmeticException{
//        System.out.println(10/0);
        try {
            System.out.println(10/0);
        }
        catch (Exception e){
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
//        try {
//            System.out.println(10/0);
//        }
//        catch (Exception e){
//            System.out.println("Invalid");
//        }                                                //Both try catch are correct
        main1();
    }
}
