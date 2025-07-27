package ArrayList;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList  a1 = new ArrayList();
        a1.add("a");
        a1.add("Ram");
        a1.add(100);
            a1.add(1.2);
            a1.add(null);
    //        System.out.println(a1);

            ArrayList  a2 = new ArrayList();
            a2.add("Ram");
            a2.add("a");
            a2.add(1.2);
            a2.add(null);
            a2.add(100);
            System.out.println(a2);
            System.out.println("Output:"+a1.containsAll(a2));

        System.out.println("----------------");
        a2.set(0,"Seeta");         //set(Index , object) -->replace value
        System.out.println("Output "+a2);

        System.out.println("----------------");
        System.out.println("Array a2 "+ a2);
        System.out.println("Output: "+a2.indexOf(100));

        System.out.println("----------------");
        System.out.println("Array a2 "+ a2);
        System.out.println("Output "+a2.lastIndexOf(null));

        System.out.println("----------------");

        ArrayList a3 = new ArrayList();
        a3.add("Adimanav");
        a3.add("a");
        a3.add(10);

        System.out.println("ArrayList" + a3);
        System.out.println("output"+a3.lastIndexOf(10));
        }

}
