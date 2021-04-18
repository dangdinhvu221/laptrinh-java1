package day6;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Họ và Tên: ");
        name = sc.nextLine();

        int vtd = name.indexOf(" ");
        int vtc = name.lastIndexOf(" ");

        String ho = name.substring(0, vtd);
        String dem = name.substring(vtd + 1, vtc);
        String ten = name.substring(vtc + 1);


        System.out.println("Họ tên in hoa: " + name);
        System.out.println("Đệm: " + dem);
        System.out.println("Họ tên in hoa: " + name.toUpperCase());
        System.out.println("Họ in hoa: " + ho.toUpperCase());
        System.out.println("Tên in hoa: " + ten.toUpperCase());
        System.out.println("Độ  dài họ tên: " + name.length());
    }
}
