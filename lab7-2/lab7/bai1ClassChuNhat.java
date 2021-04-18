package lab7;

public class bai1ClassChuNhat {
    private double rong;
    private double dai;

    public bai1ClassChuNhat() {
        super();
    }

    public bai1ClassChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getChuVi(){
        return (dai + rong) * 2;
    }

    public double getDienTich(){
        return dai * rong;
    }

    public void xuat(){
        System.out.println("chieu dai hcn " + dai);
        System.out.println("Chieu rong hcn " + rong);
        System.out.println("Chu vi " + getChuVi());
        System.out.println("Dien tich " + getDienTich());
    }
}
