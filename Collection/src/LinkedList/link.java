package LinkedList;
import java.util.*;
import java.util.LinkedList;

public class link {
    String name;
    link(String name){
        this.name=name;
    }
    @Override
    public String toString(){
        return this.name;
    }
    public static void main(String[] args) {
        link l = new link("Link");
        LinkedList l1 = new LinkedList();
        l1.add(10);
        l1.add("RAM");
        l1.add("C");
        l1.add(null);
        l1.add(false);
        l1.add(1);
        System.out.println("Linked List l1 : " + l1);

        ArrayList a1 = new ArrayList();
        a1.add(23);
        a1.add("Shree");
        a1.add(1.2);
//        a1.add(20);
        a1.add(true);
        a1.add(null);
        System.out.println("ArrayList" + a1);

        l1.remove(2);
        System.out.println("Linked List l1 " + l1);
        l1.removeAll(a1);
        System.out.println(l1);

        System.out.println("----------");
        System.out.println("Linked list" + l1);
        System.out.println("ArrayList"+a1);
        System.out.println("Output "+l1.contains("Shree"));
        System.out.println("Output "+a1.containsAll(a1));

        System.out.println(l1.isEmpty());
        System.out.println("--------");
        System.out.println(l1);
        System.out.println("Size is"+l1.size());
        System.out.println(l1);
        l1.clear();
        System.out.println("Outpout"+l1);
        System.out.println("LinkedList"+l1.size());

    }
}
