package lab7;

public class SinhVienIT extends SinhVienPoly {
    private double diemJava;
    private double diemHtml;
    private double diemCss;

    public SinhVienIT() {
        super();
    }

    public double getDiemJava() {
        return diemJava;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public double getDiemCss() {
        return diemCss;
    }

    @Override
    public double getDiem() {
        return (2 * diemJava + diemHtml + diemCss) / 4;
    }


    @Override
    public void inputSt() {
        super.inputSt();
        do {
            System.out.println("Nhap diem java: ");
            diemJava = Double.parseDouble(scanner.nextLine());
        } while (diemJava < 0 || diemJava > 10);
        do {
            System.out.println("Nhap diem html: ");
            diemHtml = Double.parseDouble(scanner.nextLine());
        } while (diemHtml < 0 || diemHtml > 10);
        do {
            System.out.println("nhap diem css:");
            diemCss = Double.parseDouble(scanner.nextLine());
        } while (diemCss < 0 || diemCss > 10);
    }

    @Override
    public String toString() {
        return "SinhVienIT{" +
                "diemJava=" + diemJava +
                ", diemHtml=" + diemHtml +
                ", diemCss=" + diemCss +
                '}';
    }

    @Override
    public void output() {
//        System.out.println(toString());
        System.out.printf("%-15s %-15s %-20.1f %-20f % -15.1f %-15.1f %-15.1f %15s", getHoTen(), getNganh(), 0.0, 0.0, getDiemJava(), getDiemHtml(), getDiemCss(), getHocLuc());

    }
}
