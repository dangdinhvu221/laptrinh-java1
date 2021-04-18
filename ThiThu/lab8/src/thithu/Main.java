package thithu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QLChicken ql = new QLChicken();
        ql.khoiTao();
        do {
            System.out.println("\n1. Nhập ");
            System.out.println("2. Xuất ");
            System.out.println("3. In khoảng giá ");
            System.out.println("4. Sắp Xếp ");
            System.out.println("5. Tính trung bình. ");
            System.out.println("6.Kế thừa");
            System.out.println("0. Thoát");
            int chosse = Integer.parseInt(scanner.nextLine());

            switch (chosse) {
                case 1:
                    ql.inputChicken();
                    break;
                case 2:
                    ql.outputChicken();
                    break;
                case 3:
                    ql.inTheoKhongGia();
                    break;
                case 4:
                    ql.sapXepPrice();
                    break;
                case 5:
                    ql.tinhTBPrice();
                    break;
                case 6:
                    LittleChicken lck  = new LittleChicken("Đức", "Black", 456, 65.5);
                    lck.output();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bye!!!");
            }
        } while (true);
    }
}
