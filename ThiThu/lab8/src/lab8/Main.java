package lab8;

public class Main {
    public static void main(String[] args) {
        // Trường(thuộc tính static):

        XHelper.so = 100;
        //--------------------------------------------------------

        XHelper x = new XHelper();
        System.out.println("Tổng: " + x.sum(9, 4));
        System.out.println("Tổng 4 số: " + x.sum(4, 5, 6, 7));
        int[] b = {4, 5, 6, 7, 8, 9};
        System.out.println("Tổng mảng : " + x.sum(b));

        // gọi phương thức static..
        XHelper xh = new XHelper();
        System.out.println("Tổng 2 số: " + xh.tinhTong(7, 8));

        // C2: gọi trực tiếp;
        System.out.println("Tính tổng 3 số: " + XHelper.tinhTong(9, 5, 8));

    }
}
