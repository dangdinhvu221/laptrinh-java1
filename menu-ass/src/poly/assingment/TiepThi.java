package poly.assingment;

public class TiepThi extends NhanVien {
    private double doanhSo;
    private double hoaHong;

    // contractor không tham số
    public TiepThi() {
        super();
    }

    // contractor có tham số
    public TiepThi(String code, String name, double salary, double doanhSo, double hoaHong) {
        super(code, name, salary);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    // Getter----Setter------------
    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }

    @Override
    public double getThuNhap() {
        return (super.getSalary() +  getDoanhSo()) * getHoaHong();
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
    public void output() {
        System.out.printf("%-15s %-20s %-20.1f %-20.1f %-20.1f %-20.1f %-20.1f %-20.1f \n",
                super.getCode(), super.getName(),
                super.getSalary(), getThuNhap(), getThueThuNhap(),
                doanhSo, hoaHong, 0.0);
    }

    public void input() {
        super.input();
        do {
            System.out.print("Nhập doanh số: ");
            doanhSo = check();
        } while (doanhSo < 0);
        do {
            System.out.print("Nhập hoa hồng: ");
            hoaHong = check();
        } while (hoaHong < 0);
    }

    //------------ Chếch lỗi ------------------------------//
    public Double check() {
        try {
            if (scanner.hasNextDouble()) {
                return Double.parseDouble(scanner.nextLine());
            } else {
                System.out.println("Vui lòng nhập lại !!!");
                scanner.nextLine();
                return check();
            }
        } catch (Exception e) {
            return check();
        }
    }
}
