package thithu;

import java.util.Scanner;

public class Chicken {
    private String name;
    private String  color;
    private int price;
    static Scanner sc= new Scanner(System.in);

    public Chicken() {
    }

    public Chicken(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String name(String name){
        System.out.println(name);
        return sc.nextLine();
    }
    public Integer soNguyen(String name){
        System.out.println(name);
        return Integer.parseInt(sc.nextLine());
    }

    public void input(){
        name("Nhập name: ");
        name("Nhập color: ");
        soNguyen("Nhập price: ");
    }
    public void output(){
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }
}
