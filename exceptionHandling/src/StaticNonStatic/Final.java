package StaticNonStatic;

public class Final {
    public static void main(String[] args) {
        System.out.println("open");
        try{
            System.out.println(10/0);
        }
        catch (Exception e){
            System.out.println("Invalid"+ e);
//            System.exit(0);         // undefined bug occurred
        }

        finally {
            System.exit(0);        //to stop finally execution use exit
            System.out.println("Close");
        }
    }
}
