//package day6;
//
//import java.util.Scanner;
//
//import static java.lang.System.exit;
//
//public class Main {
//    static Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        SanPham  sp = new SanPham();
//        int chon;
//        QLSP qlsp = new QLSP();
//        qlsp.KhoiTao();
//        do {
//            menu();
//            chon = Integer.parseInt(sc.nextLine());
//            switch (chon) {
//                case 1:
//                    qlsp.inputDSSP();
//                    break;
//                case 2:
//                    qlsp.outputDSSP();
//                    break;
//                case 0:
//                    exit(0);
//                    break;
//
//                default:
//                    System.out.println("Byee!!!!");
//            }
//
//        } while (true);
//    }
//
//
//    public static void menu() {
//        System.out.println("\n1. nhập");
//        System.out.println("2. xuất");
//        System.out.println("0. thoát");
//    }
//}
