package poly.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    static ArrayList<Bai3> list = new ArrayList<Bai3>();
    static Scanner sc = new Scanner(System.in);

    public static void input() {
        while (true) {
            Bai3 b3 = new Bai3();
            System.out.println("Nhập tên SP: ");
            b3.tenSP = sc.nextLine();

            System.out.println("Nhập đơn giá: ");
            b3.donGia = check();

            list.add(b3);

            sc.nextLine();
            System.out.println("Nhập thêm (N/Y)?");
            if (sc.nextLine().equals("N")) {
                break;
            }
        }
    }

    public static void output(){
        for (Bai3 sp: list) {
            System.out.println("Tên SP: " + sp.tenSP);
            System.out.printf("Giá SP: %.2f\n", sp.donGia);
        }
    }

    public static void SapXepGD(){
        Comparator<Bai3> comparator = new Comparator<Bai3>() {
            @Override
            public int compare(Bai3 o1, Bai3 o2) {
                return Double.compare(o1.donGia, o2.donGia);
            }
        };
        Collections.sort(list, comparator);
        output();
    }


    public static void menu() {
        System.out.println("-----------------------------------------");
        System.out.println("| 1. Nhập Sản phẩm                      |");
        System.out.println("| 2. Xuất Sản Phẩm                      |");
        System.out.println("| 3. Sắp xếp giảm dần                   |");
        System.out.println("| 4. Tìm và xoá sản phẩm                |");
        System.out.println("| 5. Thoát.                             |");
        System.out.println("-----------------------------------------");
        System.out.print("Chọn chức năng: ");
    }

    public static void TimXoa() {
        System.out.println("------------------------------------");
        String name;
        System.out.println("Nhập H&T muốn xoá: ");
        name = sc.nextLine();
        for (Bai3 x : list) {
            if (x.equals(name)) {
                list.remove(x);
                break;
            }

        }
        System.out.println("Bạn đã xoá : " + name);
        output();
    }

    public static double check(){
        if (sc.hasNextDouble()){
            return sc.nextDouble();
        }else {
            System.out.println("ERRRO");
            sc.next();
            return check();
        }
    }
    public static void main(String[] args) {
        int choice;
        do {
            menu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập DS sản phẩm");
                    input();
                    break;
                case 2:
                    System.out.println("Xuất");
                    output();
                    break;
                case 3:
                    System.out.println("Sắp xếp giảm dần");
                    SapXepGD();
                    break;
                case 4:
                    System.out.println("Tìm và xoá sản phẩm");
                    TimXoa();
                    break;
                case 5:
                    exit(5);
                    break;
            }
        } while (true);
    }
}
