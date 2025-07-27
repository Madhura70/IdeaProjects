package Array1.Object;

public class stringPool {
    public static void main(String[] args) {
        String s1="Ram";
        String s2="Ram";
        String s3="Ram";

        String str1=new String("Ram");
        String str2=new String("Ram");
        String str3=new String("Ram");

        System.out.println("Literals");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("-------------");

        System.out.println("New Keyword");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

    }
}
