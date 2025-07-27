//toString

package Array1;

public class Adimanav {
    String name;
    Adimanav(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return this.name;
    }

    public static void main(String[] args) {
        Adimanav a1 = new Adimanav("Tom");
        Adimanav a2 = new Adimanav("Jerry");

        System.out.println(a1);
        System.out.println(a2.toString());    // method override
                                              // .toString is optional

    }
}
