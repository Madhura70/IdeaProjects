//equalMethod

package Array1.Object;

public class Employee {
        int id;

        Employee(int id){
            this.id=id;
        }
        public boolean equals(Object obj){ //Object obje --> upcasted
            Employee e = (Employee) obj;   //Down caseted
            return this.id == e.id;
        }

    public static void main(String[] args) {
        Employee e1 =new Employee(10);
        Employee e2 =new Employee(10);

        System.out.println(e1 == e2); //e1 and e2 is checking address of that obj
//        System.out.println(e1 == e2);
        System.out.println(e1.equals(e2)); // e1 and e2 is checking equal or not

    }
}
