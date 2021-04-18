package poly2;

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

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public void input() {
        System.out.print("Nhập họ tên SV: ");
        hoten = sc.nextLine();
        do {
            System.out.print("Nhập điểm: ");
            diem = sc.nextDouble();
            sc.nextLine();
        } while (diem > 10 || diem < 0);

    }

    public void output() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "sinhVien{  " +
                "  hoten: '" + hoten + '\'' +
                ",     diem: " + diem + "     " + getxepLoai(diem) +
                '}';
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
