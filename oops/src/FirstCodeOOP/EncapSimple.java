package FirstCodeOOP;

import java.util.Scanner;

public class EncapSimple {
    private int num;
    private String name;

    public void setNum(int num){
        this.num=num;
    }
    public  void setName(String name){
        this.name=name;
    }

    public int getNum(){
        return num;
    }
    public String getName(){
        return name;
    }
    public void display(){
        System.out.println("num:"+getNum());
        System.out.println("name:"+getName());

    }
    public static  void main(String[] args){
        EncapSimple e= new EncapSimple();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        e.setName(sc.next());
        System.out.println("Enter number");
        e.setNum(sc.nextInt());
        e.display();

    }

}
