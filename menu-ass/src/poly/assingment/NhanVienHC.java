package poly.assingment;

public class NhanVienHC extends NhanVien {

    // Contractor không tham số
    public NhanVienHC() {
        super();
    }

    // Contractor có tham số
    public NhanVienHC(String code, String name, double salary) {
        super(code, name, salary);
    }

    @Override
    public double getThuNhap() {
        return getSalary();
    }

    @Override
    public double getThueThuNhap() {
        double tax;
        if (getSalary() < 9.0) {
            tax = 0.0;
        } else if (getSalary() <= 15.0) {
            tax = 0.1;
        } else {
            tax = 0.12;
        }
        return getThuNhap() * tax;
    }

    @Override
    public void input() {
        super.input();
    }

    @Override
    public void output() {
        super.output();
    }
}
