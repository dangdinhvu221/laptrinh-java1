package lab7;

public class bai1ClassHinhVuong extends bai1ClassChuNhat {

    public bai1ClassHinhVuong(double canh){
        super(canh, canh);

    }
    public void xuat() {
        System.out.println("cach hinh vuong: " + super.getRong());
        System.out.println("chu vi hinh vuong: " + getChuVi());
        System.out.println("dien tich hinh vuong: " + getDienTich());
    }
}
