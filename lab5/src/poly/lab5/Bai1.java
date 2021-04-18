package poly.lab5;

import java.util.ArrayList;
import java.util.Scanner;


public class Bai1 {
    static ArrayList<Double> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public void input() {
        do {
            System.out.println("Nhập vào một số: ");
            Double x = Double.parseDouble(sc.nextLine());
            list.add(x);
            System.out.println("Nhập thêm (Y/N)?");
            if(sc.nextLine().equals("N")){
                break;
            }
        }while (true);
    }

    public void output() {
        for (double x : list) {
            System.out.println("Xuất :" + x);
        }
    }

    public static void main(String[] args) {
        Bai1 l5 = new Bai1();
        l5.input();
        l5.output();
    }
}
