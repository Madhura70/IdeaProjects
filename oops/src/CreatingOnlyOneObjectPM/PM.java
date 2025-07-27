//Singleton Class

package CreatingOnlyOneObjectPM;

public class PM {
    static PM p =null;  //Static variable object
    private PM(){
        System.out.println("Object Created");
    }
    static void CreatePM(){
        if(p==null){
            p=new PM();
        }
        else{
            System.out.println("Object Not Created");
        }
    }
}
