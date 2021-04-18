package poly.lab5;

public class SanPham3 {
    public String tenSP;
    public double donGia;
    public double giamGia;

    private double tinhThueNhapKhau(){
        return donGia * 0.1;
    }

    public void output(){
        System.out.println("\nThông tin SP: ");
        System.out.println("Tên SP: " + tenSP);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + tinhThueNhapKhau());
    }
    // ham 3 tham số
    public SanPham3(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    // hàm 2 tham số
    public SanPham3(String tenSP, double donGia) {
        this(tenSP,donGia,0);
    }

    public static void main(String[] args) {
        SanPham3 sp1 = new SanPham3("May tính", 14, 1);
        SanPham3 sp2 = new SanPham3("Dien thoai", 10);
        sp1.output();
        sp2.output();
    }
}
