package DoubleInterface;

public class child implements Mother,Father {
//    int age = 20;

    @Override
    public void isRelation() {
        System.out.println(" Father ");
    }

    @Override
    public void isRelation1() {
        System.out.println(" Mother");
    }

    public static void main(String[] args) {
        child c = new child();
        c.isRelation();
        c.isRelation1();
    }
}
