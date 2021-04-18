package test;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void menu(){
        System.out.println("-----------------------------------------");
        System.out.println("1. Nhập ");
        System.out.println("2. Xuất ");
        System.out.println("3. Xuất DSSP theo khoảng giá");
        System.out.println("0. Thoát ");
        System.out.println("-----------------------------------------");
        System.out.print("Bạn chọn: ");
    }

    public static void main(String[] args) {
        QLSP qlsp = new  QLSP();
        int choice;
        qlsp.khoiTao();
        do {
            menu();
            choice = check2();

            switch (choice){
                case 1:
                    qlsp.nhapDSSP();
                    break;
                case 2:
                    qlsp.xuatDSSP();
                    break;

                case 3:
                    qlsp.xuatDSTKDG();
                    break;

                case 4:
                    qlsp.sapxepGD();
                    break;
                case 0:
                    exit(0);
                    break;

                default:
                    System.out.println("Bye!!!");
                    break;
            }
        }while (true);
    }
    public static Integer check2(){
        if (sc.hasNextInt()){
            return Integer.parseInt(sc.nextLine());
        }else {
            System.out.println("Lỗi!!!!");
            sc.nextLine();
            return check2();
        }
    }
}
