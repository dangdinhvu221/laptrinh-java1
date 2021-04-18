package test;

import java.util.Scanner;

public class sinhVien {
    public String hoten;
    public double diem;
    static Scanner sc = new Scanner(System.in);

    public sinhVien() {
    }

    public sinhVien(String hoten, double diem) {
        this.hoten = hoten;
        this.diem = diem;
    }

    public void input() {
        System.out.print("Nhập họ tên SV: ");
        hoten = sc.nextLine();
            System.out.print("Nhập điểm: ");
            diem = sc.nextDouble();
            sc.nextLine();
            if(diem < 0 || diem > 10){
                input();
            }
    }

    public void output() {
        System.out.println("\nTên : " + hoten);
        System.out.println("Điểm: " + diem);
        System.out.println("xếp loại: " + getxepLoai(diem));


    }

    public String getxepLoai(double diem) {
        if (diem <= 5) {
            return "Học lực kém";
        } else if (diem <= 7) {
            return "Học lực khá";
        } else if (diem <= 8) {
            return "Học lực giỏi";
        } else {
            return "Học lực suất sắc";
        }
    }
}
