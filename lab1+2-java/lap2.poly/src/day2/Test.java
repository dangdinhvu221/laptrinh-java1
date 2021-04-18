package day2;

import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String name;
        double diem = 0;


        System.out.println("Nhập name: ");
        name = sc.nextLine();


        do {
            System.out.println("Nhập điểm: ");
            diem = Double.parseDouble(sc.nextLine());
        }while (diem < 0 || diem > 10);

        if (diem <= 5){
            System.out.println("Trượt");
        }else if(diem < 7){
            System.out.println("khá");
        }


        System.out.println("ĐIểm: " + diem);
        System.out.println("Name: " + name);
        System.out.println("Xếp loại: " + diem);
    }


}
