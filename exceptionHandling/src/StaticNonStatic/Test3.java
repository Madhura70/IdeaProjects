package StaticNonStatic;

public class Test3 {
    static void main1() throws InterruptedException{
        for (int i = 1; i<=10;i++){
            System.out.println(i);
            Thread.sleep(5000);   // to run our code 5 sec late use 5000
        }
    }
    public static void main(String[] args){
        try {
            main1();
        } catch (InterruptedException e) {
            //to auto generate catch block
            e.printStackTrace();
//            throw new RuntimeException(e);
        }
        finally {
            System.out.println("close");
        }
    }
}
