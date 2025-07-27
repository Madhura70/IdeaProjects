package ArrayList;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        System.out.println("----------------");
        ArrayList<Integer> a = new ArrayList<>();

        a.add(10);   // add() is use to insert elements into arraylist
        a.add(20);
        a.add(30);
        a.add(40);
        System.out.println("Arraylist first"+a);

        for(Object b:a){
            System.out.println(b);
        }

        System.out.println("-------------");
        ArrayList<Integer> a1 = new ArrayList<>();

        a1.add(60);
        a1.add(70);
        a1.add(80);
        a1.add(90);
        System.out.println("Arraylist second"+a1);

        a.addAll(a1);
//        a1.addAll(a);
        System.out.println("ArrayList third"+ a);

        System.out.println("----------size of arraylist------------------");
        int[] array = {10,20,30,40,50};
        System.out.println(array.length);  //array-> length
        String s  ="Ram";
        System.out.println(s.length());  //string-> length
        System.out.println(a.size());    //collection-> size
        System.out.println("Array before remove"+a);
        a.remove(2);     //remove array(index) -->used to remove single index based element from arraylist
//        a.remove(-2);
        System.out.println("Array after remove"+a);
        a.removeAll(a1);
        System.out.println("After removing all element from a"+ a);

        System.out.println("-------------");
        System.out.println("-------------");

        ArrayList s1 = new ArrayList();
        s1.add("Ram");
        s1.add("A");
        s1.add(100);
        s1.add(5.6);
        s1.add(null);
        s1.add(true);

        System.out.println("Array s1 "+s1);
        System.out.println("Output: "+s1.contains("Ram"));

        System.out.println("Ooutput :"+s1.containsAll(s1));  //containsAll() -->used to check each ahd every

        s1.clear();   // used to remove all elements from collection
        s1.removeAll(s1);
        if(s1.isEmpty()){     //used to cehck the given collection is empty or not
            System.out.println("S1 array is empty");
        }else {
            System.out.println("s1 is not empty");
        }




    }
}
