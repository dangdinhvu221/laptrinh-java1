package poly.assingment;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

abstract public class NhanVien {
    static Scanner scanner = new Scanner(System.in);
    private String code;
    private String name;
    private double salary;

    // constructor không tham số..
    public NhanVien() {

    }

    // Contructor 3 tham số.
    public NhanVien(String code, String name, double salary) {
        this.code = code;
        this.name = name;
        this.salary = salary;
    }

    // Phương thức Getter and Setter..

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    abstract public double getThuNhap();

    abstract public double getThueThuNhap();

    //-------------Nhập thông tin nhân viên --------------------------
    public void input() {
        System.out.print("\nNhập mã nhân viên: ");
        code = scanner.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        name = scanner.nextLine();
        do {
            System.out.print("Nhập Lương: ");
            salary = check2();
        } while (salary < 0);
    }

    //-------------Xuẩt thông tin nhân viên --------------------------
    public void output() {
//        Locale locale = new Locale("vi", "VN");
//        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
//        String string = numberFormat.format(getSalary());

//        DecimalFormat formatter = new DecimalFormat("###,###,###");
//        System.out.println(formatter.format(salary)+" VNĐ");

        System.out.printf("%-15s %-20s %-20.1f %-20.1f %-20.1f %-20.1f %-20.1f %-20.1f\n",
                code, name, salary, getThuNhap(), getThueThuNhap(), 0.0, 0.0, 0.0);
    }


    //------------ Chếch lỗi ---------------------------------------//
    public Double check2() {
        try {
            if (scanner.hasNextDouble()) {
                return Double.parseDouble(scanner.nextLine());
            } else {
                System.out.println("Vui lòng nhập lại !!!");
                scanner.nextLine();
                return check2();
            }
        } catch (Exception e) {
            return check2();
        }
    }
}
