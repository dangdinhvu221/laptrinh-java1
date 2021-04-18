package poly.sanpham;

import java.util.Scanner;

public class SanPham {
    static Scanner sc = new Scanner(System.in);

    private String maSP;
    private String tenSP;
    public double donGia;
    public int soLuong;

    public SanPham() {

    }

    public SanPham(String maSP, String tenSP, double donGia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        SanPham.sc = sc;
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

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void input() {
        System.out.println("Nhập mã sp: ");
        maSP = sc.nextLine();
        System.out.println("Nhập tên sp: ");
        tenSP = sc.nextLine();
        System.out.println("Đơn giá: ");
        donGia = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập số lượng: ");
        soLuong = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return "SanPham" +
                "maSP: " + maSP +
                ", tenSP: '" + tenSP + '\'' +
                ", donGia: " + donGia +
                ", soLuong: " + soLuong + "Thành tiền: " + getTinhTien();
    }

    public double getTinhTien() {
        return donGia * soLuong;

    }


    //     String name;
//    double price;
//    double weight;
//
//    public SanPham() {
//
//    }
//
//    public SanPham(String name, double price, double weight) {
//        this.name = name;
//        this.price = price;
//        this.weight = weight;
//    }
//
//    public void input(){
//        System.out.println("Nhập tên SP: ");
//        name = sc.nextLine();
//        System.out.println("Nhập giá: ");
//        price = Double.parseDouble(sc.nextLine());
//        System.out.println("Nhập cân nặng: ");
//        weight = Double.parseDouble(sc.nextLine());
//    }
//
//    public String getStatus(double price){
//        if (price < 200){
//           return "giá rẻ";
//        }else if (price < 500){
//            return "trung bình";
//        }else {
//            return "quá đắt";
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "SanPham{" +
//                "name= '" + name + '\'' +
//                ", price= " + price +
//                ", weight= " + weight + "Status: " + getStatus(price) +
//                '}';
//    }
}
