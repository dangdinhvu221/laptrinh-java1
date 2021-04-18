package lab7;

import java.util.Scanner;

public class ChuNhat {
    static Scanner sc = new Scanner(System.in);
    private double rong;
    private double dai;

    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getChuVi(){
        return 0;
    }

    public double getDienTich(){
        return 0;
    }

    @Override
    public String toString() {
        return "ChuNhat{" +
                "rong=" + rong +
                ", dai=" + dai +
                '}';
    }

    public void nhap(){
        System.out.print("Nhập rộng: ");
        rong = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập dài: ");
        dai = Double.parseDouble(sc.nextLine());
    }

    public void xuat(){
        System.out.println(toString());
    }
}
