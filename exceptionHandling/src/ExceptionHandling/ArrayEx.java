//ArrayIndexOutOfBoundsException

package ExceptionHandling;

public class ArrayEx {
    public static void main(String[] args) {
        int[] a={10,20,30};
        try {
            System.out.println(a[1000]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("nooooooooo! !");     //(Grand Parent)
        }
//        catch (IndexOutOfBoundsException e){
//            System.out.println("nooooooooo! !");    //(Father)
//        }
//        catch (RuntimeException e){
//            System.out.println("nooooooooo! !");   //(Child)
//        }
//        catch (Exception e){
//            System.out.println("nooooooooo! !");   //(Grand son)
//        }

    }
}
