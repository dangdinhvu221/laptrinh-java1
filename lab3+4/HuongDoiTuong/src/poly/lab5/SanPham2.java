package poly.lab5;

import java.util.Scanner;

public class SanPham2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("\nNhập số lượng sản phẩm: ");
        int sl = check();
        SanPham[] sp = new SanPham[sl];
        for (int i = 0; i < sp.length; i++) {
            sp[i] = new SanPham();
            sp[i].input();
        }

        for (SanPham x: sp) {
            x.output();
        }
    }

    public static int check(){
        if (sc.hasNextDouble()){
            return sc.nextInt();
        }else {
            System.out.println("Vui lòng nhập lại!!!");
            sc.next();
            return check();
        }
    }
}
