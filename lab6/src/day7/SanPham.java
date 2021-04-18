package day7;

import java.util.Scanner;

public class SanPham {
    static Scanner sc = new Scanner(System.in);
    private String tenSP;
    private double donGia;
    private double giamGia;

    public SanPham(){
        super();
    }

    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
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

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public void nhap(){
        System.out.println("Nhập Tên: ");
        tenSP = sc.nextLine();
        System.out.println("Nhập đơn giá: ");
        donGia = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập giảm giá: ");
        giamGia = Double.parseDouble(sc.nextLine());
    }

    public void xuat(){
        System.out.printf("%15s %15.1f %15.1f\n", tenSP, donGia, giamGia);
    }

//    public double check(){
//        if (sc.hasNextInt()){
//            return sc.nextDouble();
//        }else {
//            System.out.println("Vui lòng nhập lại!!!");
//            sc.next();
//            return check();
//        }
//    }
}
