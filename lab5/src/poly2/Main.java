package poly2;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        QLSV sv = new QLSV();
        int choice;
        do {
            menu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1. Nhập danh sách");
                    sv.DSSV();
                    break;
                case 2:
                    System.out.println("2. Xuất danh sách");
                    sv.xuatDSSV();
                    break;
                case 3:
                    System.out.println("2. Sắp xếp họ tên");
                    sv.sapXepTheoTen();
                    break;
                case 4:
                    System.out.println("2. Sắp xếp họ điểm");
                    sv.sapXepTheoDiem();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bye!!!!");
                    break;
            }
        } while (true);
    }

    public static void menu() {
        System.out.println("+------------------------+");
        System.out.println("1. Nhập danh sách");
        System.out.println("2. Xuất danh sách");
        System.out.println("3. Sắp xếp họ tên");
        System.out.println("4. Sắp xếp họ điểm");
        System.out.println("0. Thoát");
        System.out.println("+------------------------+");
        System.out.println("Mời chọn: ");
    }

}
