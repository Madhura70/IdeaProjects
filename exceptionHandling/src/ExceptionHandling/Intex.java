//InterruptedException

package ExceptionHandling;

public class Intex {
    public static void main(String[] args) {
        for(int i= 1;i<=10;i++) {
            System.out.println(i);

            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }
    }

}
