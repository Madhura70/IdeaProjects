package singleLevel;

class Son extends Father {

    int SonAge = 25;

    public void isSon() {
        System.out.println("Son property");
    }

    public static void main(String[] args) {
        Son s = new Son();
        System.out.println("Son Age:" + s.SonAge);
        System.out.println("Son Age:" + s.FatherAge);

        s.isFather();
        s.isSon();
    }
}