package Array1.META;


import java.util.Scanner;

import static java.lang.System.exit;

public class Meta implements Whatsapp,Facebook,Instagram,Thread{
    @Override
    public void isWhatsapp() {
        System.out.println("Whatsapp Login");
    }

    @Override
    public String pass() {
        return "";
    }

    @Override
    public void isWhatsappChat() {
        System.out.println("Whatsapp Chat open");
    }

    @Override
    public void isFacebook() {
        System.out.println("Facebook Login");
    }

    @Override
    public void isFacebookChat() {
        System.out.println("FacebookChat open");
    }

    @Override
    public void isInstagram() {
        System.out.println("Instagram login");
    }

    @Override
    public void isInstagramChat() {
        System.out.println("Instagram open");
    }

    @Override
    public void isThread() {
        System.out.println("Thread Login");
    }

    @Override
    public void isThreadChat() {
        System.out.println("ThreadChat open");
    }

    public static void main(String[] args) {
        Meta m = new Meta();
        Scanner sc = new Scanner(System.in);
        String inid;
        String inpass;
        for(;;){
            System.out.println("Enter number of operations : ");
            System.out.println("1.WhatsApp \n2.Facebook \n3.Instagram \n4.Thread \n5.Exit");
            switch(sc.nextInt()){
                case 1:
                    System.out.println("Enter id");
                    inid=sc.next();
                    System.out.println("Enter pass");
                    inpass= sc.next();
//                    System.out.println("Loged in to Whatsapp");

                    if (inid.equals(Whatsapp.id) || inpass == m.pass()) {
                        m.isWhatsappChat();
                    } else {
                        System.out.println("Invalid output");
                    }
                    break;
                case 2:
                    System.out.println("Enter id");
                    inid=sc.next();
                    System.out.println("Enter pass");
                    inpass= sc.next();
//                    System.out.println("Loged in to Facebook");
                    if (inid.equals(Facebook.id) || inpass == m.pass()) {
                        m.isFacebookChat();
                    } else {
                        System.out.println("Invalid output");
                    }
                    break;
                case 3:
                    System.out.println("Enter id");
                    inid=sc.next();
                    System.out.println("Enter pass");
                    inpass= sc.next();
//                    System.out.println("Loged in to Instagram");
                    if (inid.equals(Instagram.id) || inpass == m.pass()) {
                        m.isInstagramChat();
                    } else {
                        System.out.println("Invalid output");
                    }
                    break;
                case 4:
                    System.out.println("Enter id");
                    inid=sc.next();
                    System.out.println("Enter pass");
                    inpass= sc.next();
//                    System.out.println("Loged in to Thread");
                    if (inid.equals(Thread.id) || inpass == m.pass()) {
                        m.isThreadChat();
                    } else {
                        System.out.println("Invalid output");
                    }
                    break;
                case 5:
                    exit(0);
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid id and pass");
            }
        }
    }
}
