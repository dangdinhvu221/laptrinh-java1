package lab7;


public class SinhVienBiz extends SinhVienPoly {
    private double diemMarketing;
    private double diemSale;

    public SinhVienBiz() {
        super();
    }

    public SinhVienBiz(double diemMarketing, double diemSale) {
        this.diemMarketing = diemMarketing;
        this.diemSale = diemSale;
    }

    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSale) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSale = diemSale;
    }

    public void setDiemMarketing(double diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    public void setDiemSale(double diemSale) {
        this.diemSale = diemSale;
    }

    public double getDiemMarketing() {
        return diemMarketing;
    }

    public double getDiemSale() {
        return diemSale;
    }

    @Override
    public double getDiem() {
        return (2 * getDiemMarketing() + getDiemSale()) / 3;
    }

    @Override
    public void inputSt() {
        super.inputSt();
        do {
            System.out.println("Nha diem mar: ");
            diemMarketing = Double.parseDouble(scanner.nextLine());
        } while (diemMarketing < 0 || diemMarketing > 10);
        do {
            System.out.println("Nhap diem sale: ");
            diemSale = Double.parseDouble(scanner.nextLine());
        } while (diemSale < 0 || diemSale > 10);
    }

    @Override
    public String toString() {
        return "SinhVienBiz{" +
                "diemMarketing=" + diemMarketing +
                ", diemSale=" + diemSale +
                '}';
    }

    @Override
    public void output() {
//        System.out.println(toString());
        System.out.printf("%-15s %-15s %-20.1f %-20f.1 % -15.1f %-15.1f %-15.1f %15s\n", getHoTen(), getNganh(), getDiemMarketing(), getDiemSale(), 0.0, 0.0, 0.0, getHocLuc());
    }
}
