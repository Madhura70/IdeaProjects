//hashCode

package Array1.Object;

public class Student {
    @Override
    public int hashCode(){
        return 1;
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.hashCode());
    }
}
