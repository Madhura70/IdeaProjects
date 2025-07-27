package FirstCodeOOP;

import java.util.Scanner;

public class ClassBook {
    private String name;
    private String author;
    private int price;
    private int edition;

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getEdition() {
        return edition;
    }
    public void display(){
        System.out.println("name:"+getName());
        System.out.println("Author:"+getAuthor());
        System.out.println("Edition:"+getEdition());
        System.out.println("Price:"+getPrice());
    }
    public static  void main(String[] args){
        ClassBook cb = new ClassBook();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        cb.setName(sc.next());
        System.out.println("Enter Author");
        cb.setAuthor(sc.next());
        System.out.println("Enter Edition");
        cb.setEdition(sc.nextInt());
        System.out.println("Enter Price");
        cb.setPrice(sc.nextInt());
        cb.display();
    }
}
