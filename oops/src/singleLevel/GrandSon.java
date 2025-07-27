package singleLevel;

class GrandSon extends Son {
    int GrandSonAge = 5;

    public void isGrandSon() {
        System.out.println("GrandSon property");
    }

    public static void main(String[] args) {
        GrandSon gs = new GrandSon();
        System.out.println("Son Age:" + gs.SonAge);
        System.out.println("Father Age:" + gs.FatherAge);
        System.out.println("GrandSon Age:" + gs.GrandSonAge);

        gs.isFather();
        gs.isSon();
        gs.isGrandSon();
    }
}