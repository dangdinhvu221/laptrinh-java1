 public class NhanVienHC extends NhanVien {
    private int soNC;

    public NhanVienHC() {
        super();
    }

    public NhanVienHC(int soNC) {
        this.soNC = soNC;
    }

    public NhanVienHC(String maNV, String nameNV, int salary, int soNC) {
        super(maNV, nameNV, salary);
        this.soNC = soNC;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Nhập SCNV: ");
        soNC = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void output() {
        super.output();
        System.out.println("SCNV là: " + soNC);
    }

    @Override
    public int tiluong() {
        return salary + soNC;
    }
}
