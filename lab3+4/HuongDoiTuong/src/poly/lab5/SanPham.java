package poly.lab5;

import java.util.Scanner;

public class SanPham {
    static Scanner sc = new Scanner(System.in);
    public String tenSP;
    public double donGia;
    public double giamGia;

    public void input() {
        System.out.println("Nhập thông tin sp : tên, gia, giảm giá.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên SP: ");
        tenSP = sc.nextLine();
        System.out.print("Nhập gia: ");
        donGia = check();
        System.out.print("Giảm giá: ");
        giamGia = check();
    }

    public void output() {
        System.out.println("\nThông tin SP: ");
        System.out.println("Tên SP: " + tenSP);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("\nThuế nhập khẩu: " + tinhThueNhapKhau());
    }

    public double tinhThueNhapKhau() {
        return donGia * 0.1;
    }


    public static void main(String[] args) {
        SanPham sp = new SanPham();
        sp.tenSP = "SP1";
        sp.donGia = 65.000;
        sp.giamGia = 150.000;
        sp.output();
    }

    static double check() {
        if (sc.hasNextDouble()) {
            return sc.nextDouble();
        } else {
            System.out.println("ERROR");
            sc.next();
            return check();
        }
    }
}
