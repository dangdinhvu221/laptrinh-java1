
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chosse;
        QLComputer ql = new QLComputer();
        ql.khoiTao();
        do {
            menu();
            chosse = Integer.parseInt(scanner.nextLine());
            switch (chosse) {
                case 1:
                    ql.inputCPT();
                    break;
                case 2:
                    ql.outputCPT();
                    break;
                case 3:
                    ql.xuatTheoKG();
                    break;
                case 4:
                    ql.SapXepPrice();
                    break;
                case 5:
                    ql.intop3Computer();
                    break;
                case 6:
                    System.out.println("Kế thừa");
                    LittleComputer c = new  LittleComputer("Vũ", 18, 250,"black");
                    c.output();
                    break;
                case 0:
                    exit(0);
                    break;
                default:
                    System.out.println("Byeeee!!!!");
            }
        } while (true);
    }


    public static void menu() {
        System.out.println("-----------------------------------");
        System.out.println("1. Nhập");
        System.out.println("2. Xuất");
        System.out.println("3. in khoảng giá.");
        System.out.println("4. Sắp xếp tăng dần price");
        System.out.println("5. in 3 Computer thấp nhất.");
        System.out.println("0. Thoát");
        System.out.print("Mời bạn chọn: ");
    }
}
