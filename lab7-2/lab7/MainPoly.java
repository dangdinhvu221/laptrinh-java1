package lab7;

import java.util.Scanner;

public class MainPoly {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        QLStudent ql = new QLStudent();

        do {
            System.out.println("\n----------------Menu----------------");
            System.out.println("1. Nhập danh sách Sinh Viên");
            System.out.println("2. Xuất danh sách Sinh Viên");
            System.out.println("3. Xuat Sinh Viên có HLG");
            System.out.println("4. Sắp Xếp DSSV theo điểm");
            System.out.println("0. thoat");
            int ans = Integer.parseInt(scanner.nextLine());
//            ql.kt();
            switch (ans) {
                case 1 -> ql.inputDs();
                case 2 -> ql.outputDs();
                case 3 -> ql.xuatHSG();
                case 4 -> ql.sxD();
                case 0 -> System.exit(0);
            }
        } while (true);
    }
}
