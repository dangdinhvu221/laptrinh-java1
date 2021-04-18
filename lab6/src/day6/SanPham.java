package day6;

import java.util.Scanner;

abstract public class SanPham {
    private String maSP;
    private String tenSP;
    private double donGia;
    static Scanner sc = new Scanner(System.in);

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, double donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
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

    public String nhapChuoi(String name){
        System.out.println(name);
        return sc.nextLine();
    }
    public double sothuc(String sth){
        System.out.println(sth);
        return Double.parseDouble(sc.nextLine());
    }


    @Override
    public String toString() {
        return "SanPham{" +
                "maSP='" + maSP + '\'' +
                ", tenSP='" + tenSP + '\'' +
                ", donGia=" + donGia +
                '}';
    }

    public void input(){
        maSP = nhapChuoi("Nhập mã SP: ");
//        System.out.print("Nhập Tên SP: ");
//        tenSP = sc.nextLine();
        tenSP = nhapChuoi("Nhập Tên SP: ");

//        System.out.print("Nhập Đơn Giá: ");
//        donGia = Double.parseDouble(sc.nextLine());
        donGia = sothuc("Nhập Đơn Giá: ");
    }

    public void output(){
//        System.out.println(toString());
        System.out.printf("\n%-15s %-15s %-20s\n", "maSP", "tenSP", "donGia");
        System.out.printf("%-15s %-15s %-20.1f", maSP, tenSP, donGia);
    }
}
