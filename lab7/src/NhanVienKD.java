import java.util.Scanner;

public class NhanVienKD extends NhanVien{
    private int salaryKD;
    static Scanner sc = new Scanner(System.in);

    public NhanVienKD(){
        super();
    }

    public NhanVienKD(int salaryKD) {
        this.salaryKD = salaryKD;
    }

    public NhanVienKD(String maNV, String nameNV, int salary, int salaryKD) {
        super(maNV, nameNV, salary);
        this.salaryKD = salaryKD;
    }

    public int getSalaryKD() {
        return salaryKD;
    }

    public void setSalaryKD(int salaryKD) {
        this.salaryKD = salaryKD;
    }



    @Override
    public void input(){
        super.input();
        System.out.println("Nhập Lương NVKD: ");
        salaryKD = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Lương NVKD: " + salaryKD);
    }

    @Override
    public int tiluong() {
        return (salary + salaryKD);
    }
}
