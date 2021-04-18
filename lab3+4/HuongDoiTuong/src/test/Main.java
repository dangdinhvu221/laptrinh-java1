package test;

import test.sinhVien;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        sinhVien sv = new sinhVien();
        System.out.print("Nhập số lượng sinh viên: ");
        int sinhVien = Integer.parseInt(sc.nextLine());
        sinhVien[] sv1 = new sinhVien[sinhVien];
        for (int i = 0; i < sv1.length; i++) {
            sv1[i] = new sinhVien();
            sv1[i].input();
        }
        for (sinhVien x : sv1) {
            x.output();
        }
    }
}
