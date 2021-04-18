package poly.sanpham;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập vào n sản phẩm: ");
        n = Integer.parseInt(sc.nextLine());
        SanPham[] sp = new SanPham[n];
        for (int i = 0; i < sp.length; i++) {
            sp[i] = new SanPham();
            sp[i].input();
        }

        System.out.println("\nXuất DS sản phẩm:");
        for (SanPham x: sp) {
            System.out.println(x);
        }


        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                    if (sp[i].getTinhTien() < sp[j].getTinhTien()){
                        SanPham temp = sp[i];
                        sp[i] = sp[j];
                        sp[j] = temp;
                }
            }
            System.out.println("\nSắp xếp giảm dần");
            for (SanPham x: sp) {
                System.out.println(x);
            }
        }
    }
}
