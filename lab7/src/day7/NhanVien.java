package day7;

import java.util.Scanner;

public class NhanVien {
    private String hoTen;
    private double luong;
    static Scanner scanner = new Scanner(System.in);

    public NhanVien(){

    }

    public NhanVien(String hoTen, double luong) {
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public void nhap(){
        System.out.println("Nhập họ tên: ");
        hoTen = scanner.nextLine();
        System.out.println("Nhập Lương: ");
        luong = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "NhanVien {  " +
                "hoTen=  '" + hoTen + '\'' +
                ",  luong=  " + luong +
                '}';
    }
    public void xuat(){
        System.out.println(toString());
    }
}
