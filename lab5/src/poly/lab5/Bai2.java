package poly.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.exit;

public class Bai2 {
    static ArrayList<String> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Bai2 b2 = new Bai2();
        int choice;
        do {
            menu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập danh sách họ và tên.");
                    b2.input();
                    break;
                case 2:
                    System.out.println("Xuất danh sách vừa nhập.");
                    b2.output();
                    break;
                case 3:
                    System.out.println("Xuất danh sách ngẫu nhiên.");
                    b2.ngaunhien();
                    break;
                case 4:
                    System.out.println("Sắp xếp giảm dần và sắp xếp.");
                    b2.SapXep();
                    break;
                case 5:
                    System.out.println("Tìm và xoá họ tên nhập từ bàn phím");
                    b2.TimXoa();
                    break;
                case 6:
                    System.out.println("Kết thúc.");
                    exit(6);
                    break;

                default:
                    System.out.println("Tạm biệt!!!");
                    break;
            }
        } while (true);
    }

    public static void menu() {
        System.out.println("+---------------------------------------------+");
        System.out.println("| 1. Nhập danh sách họ và tên.                |");
        System.out.println("| 2. Xuất danh sách vừa nhập.                 |");
        System.out.println("| 3. Xuất danh sách ngẫu nhiên.               |");
        System.out.println("| 4. Sắp xếp giảm dần và sắp xếp.             |");
        System.out.println("| 5. Tìm và xoá họ tên nhập từ bàn phím       |");
        System.out.println("| 6. Kết thúc.                                |");
        System.out.println("+---------------------------------------------+");
        System.out.print("Mời bạn chọn: ");
    }


    public void input() {
        while (true) {
            System.out.print("Nhập họ và tên : ");
            String x = sc.nextLine();
            list.add(x);

            System.out.print("Nhập thêm (Y/N)? ");
            if (sc.nextLine().equals("N")) {
                break;
            }
        }
    }

    public void output() {
        System.out.println("Xuất DS:");
        for (String ds : list) {
            System.out.println(ds);
        }
    }

    public void ngaunhien() {
        System.out.println("\nSắp xếp ngẫu nhiên: ");
        Collections.shuffle(list);
        this.output();
    }


    public void SapXep() {
        System.out.println("\nSắp Xếp tăng dần:");
        Collections.sort(list);
        Collections.reverse(list);
        this.output();
    }


    public void TimXoa() {
        String name;
        System.out.println("\nNhập họ và tên muốn xoá: ");
        name = sc.nextLine();
        for (String x : list) {
            if (x.equals(name)) {
                list.remove(x);
                break;
            }

        }
        System.out.println("Bạn đã xoá bạn: " + name);
    }
}
