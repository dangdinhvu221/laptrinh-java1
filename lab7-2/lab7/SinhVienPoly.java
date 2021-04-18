package lab7;

import java.util.Scanner;

abstract public class SinhVienPoly {
    private String hoTen;
    private String nganh;
    static Scanner scanner = new Scanner(System.in);

    public SinhVienPoly() {
        super();
    }

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getNganh() {
        return nganh;
    }

    public String getHocLuc() {
        double diem = getDiem();
        String hocLuc;
        if (diem >= 9 )
            hocLuc = "Xuat Sac";
        else if(diem >= 7.5)
            hocLuc = "Gioi";
        else if(diem >= 6.5)
            hocLuc = "Kha";
        else if(diem >= 5)
            hocLuc = "trung binh";
        else
            hocLuc = "yeu";
        return hocLuc;
    }

    abstract public double getDiem();

    public void inputSt() {
        System.out.println("Nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.println("Nhap nganh: ");
        nganh = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "SinhVienPoly{" +
                "hoTen='" + hoTen + '\'' +
                ", nganh='" + nganh + '\'' +
                '}';
    }

    public void output() {
//        System.out.println(toString());
        System.out.printf("%-15s %-15s %-20.1f %-20.1f % -15.1f %-15.1f %-15.1f %15s", getHoTen(), getNganh(), 0.0, 0.0, 0.0, 0.0, 0.0, getHocLuc());
    }
}
