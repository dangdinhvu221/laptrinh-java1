package day7;

import java.util.Scanner;

public class TruongPhong extends NhanVien{// Trưởng phòng kế thừa nhân viên
    // Trưởng phòng được sử dụng tài sản(thuộc /tính, phương thức) của nhan viên
    // Nếu tài sản đó khai báo: public, protected, default(nếu cha, con cùng gói)
    // khai báo các thuộc tính, phương thức khác như bình thường
    // Muốn sử dụng tài sản của cha: supper.ten_thuộc_tính, super.ten_phuong_thuc

    // khai báo thêm thuộc tính trách nhiệm.


    private double TrachNhiem;

    public TruongPhong(){
        super(); // gọi đến hàm tạo không tham số của cha..
    }

    public TruongPhong(String hoTen, double luong, double trachNhiem) {
        super(hoTen, luong);// gọi đến hàm tạo 2 tham số của lớp cha...
        this.TrachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return TrachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        TrachNhiem = trachNhiem;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập trách nhiệm: ");
        TrachNhiem = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println(toString());
    }
}
