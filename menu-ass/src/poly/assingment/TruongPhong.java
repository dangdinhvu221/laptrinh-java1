package poly.assingment;

public class TruongPhong extends NhanVien {
    private double trachNhiem;

    // Contractor không tham só
    public TruongPhong() {
        super();
    }

    // Contractor có 1 tham số
    public TruongPhong(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    // Contractor có tham số kế thừa
    public TruongPhong(String code, String name, double salary, double trachNhiem) {
        super(code, name, salary);
        this.trachNhiem = trachNhiem;
    }

    // Getter --- Setter
    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    @Override
    public double getThuNhap() {
        return (getSalary() + getTrachNhiem());
    }

    @Override
    public double getThueThuNhap() {
        double tax = 0.0;
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
                0.0, 0.0, trachNhiem);
    }

    public void input() {
        super.input();
        do {
            System.out.print("Nhập trách nhiệm: ");
            trachNhiem = check();
        } while (trachNhiem < 0);
    }

    //------------ Chếch lỗi --------------------------------//

    public double check() {
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
