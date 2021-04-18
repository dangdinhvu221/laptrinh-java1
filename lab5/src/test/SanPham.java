package test;

import java.util.Scanner;

public class SanPham {
    static Scanner sc = new Scanner(System.in);
    private String tenSP;
    private double donGia;
    private String hang;

    public SanPham() {
    }

    public SanPham(String tenSP, double donGia, String hang) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.hang = hang;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "tenSP='" + tenSP + '\'' +
                ", donGia=" + donGia +
                ", hang='" + hang + '\'' +
                '}';
    }

    public void input() {
        System.out.print("Nhập tên sản phẩm: ");
        tenSP = sc.nextLine();
        do {
            System.out.print("Nhập đơn giá: ");
            donGia = check();
        } while (donGia < 0);

        System.out.print("Nhập Hãng: ");
        hang = sc.nextLine();
    }

    public void output() {
//        System.out.printf("-15s -19.1f -20s\n", tenSP, donGia, hang);
        System.out.println(toString());
    }

    public Double check() {
        if (sc.hasNextDouble()) {
            return Double.parseDouble(sc.nextLine());
        } else {
            System.out.println("Lỗi!!!");
            sc.nextLine();
            return check();
        }
    }
}
