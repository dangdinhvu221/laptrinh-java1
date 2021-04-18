import java.util.Scanner;

abstract  public class NhanVien {
    private String maNV;
    private String nameNV;
    protected int salary;
    static Scanner sc = new Scanner(System.in);

    public NhanVien() {

    }

    public NhanVien(String maNV, String nameNV, int salary) {
        this.maNV = maNV;
        this.nameNV = nameNV;
        this.salary = salary;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getNameNV() {
        return nameNV;
    }

    public void setNameNV(String nameNV) {
        this.nameNV = nameNV;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

//    @Override
//    public String toString() {
//        return "NhanVien{" +
//                "maNV='" + maNV + '\'' +
//                ", nameNV='" + nameNV + '\'' +
//                ", salary=" + salary +
//                '}';
//    }

    public void input(){
        System.out.println("Nhập mãNV: ");
        maNV = sc.nextLine();
        System.out.println("Nhập tênNV: ");
        nameNV = sc.nextLine();
        System.out.println("Nhập LươngNV: ");
        salary = Integer.parseInt(sc.nextLine());
    }
    public void output(){
        System.out.printf("%-10s %-20s -%10d -%10d", maNV, nameNV, salary, 0);
    }
    abstract  public  int tiluong();
}
