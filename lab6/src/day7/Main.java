//package day7;
//
//import java.util.Scanner;
//
//public class Main {
//    static Scanner sc = new Scanner(System.in);
//
//    public static void menu(){
//        System.out.println("1. Nhập");
//        System.out.println("2. Xuất");
//        System.out.println("3. Sắp xếp");
//        System.out.println("4. Tính TB");
//        System.out.println("5. Xuất");
//        System.out.println("0. Thoát");
//    }
//
//    public static void main(String[] args) {
//        int chon;
//        QLSP ql = new QLSP();
//        ql.khoiTao();
//        do {
//            menu();
//            chon = Integer.parseInt(sc.nextLine());
//            switch (chon){
//                case 1:
//                    ql.nhapDSSP();
//                    break;
//                case 2:
//                    ql.xuatDSSP();
//                    break;
//                case 3:
//                    ql.sapXepGD();
//                    break;
//                case 4:
//                    System.out.println("Đơn giá TB là: " + ql.donGiaTB());
//                    break;
//                case 5:
//                    ql.XuatTTSPLHDGTB();
//                    break;
//                case 0:
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Bye!!!!");
//            }
//        }while (true);
//    }
//}
