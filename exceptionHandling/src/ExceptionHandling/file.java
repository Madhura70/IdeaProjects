package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class file {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("abc.txtx");
        }
        catch (FileNotFoundException f){          //FileNotFound (GrandParent) --> IOException (Parent) -->Exception(Child)  --Throwable(Grandchild)
            System.out.println("FileNotFound");
        }
//        catch (IOException f){
//            System.out.println("FileNotFound");
//        }

//        catch (Exception f){
//            System.out.println("FileNot  Found");
//        }
//        catch (Throwable){
//            System.out.println("FileNot  Found");
//        }
    }
}
