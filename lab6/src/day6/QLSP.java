//package day6;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class QLSP {
//    ArrayList<SanPham> list = new ArrayList<>();
//    static Scanner sc = new Scanner(System.in);
//
//    public void KhoiTao(){
//        SanPham sp = new SanPham();
//        list.add(new SanPham("sp1", "ôkoko", 456));
//        list.add(new SanPham("sp2", "quạt", 150));
//        list.add(new SanPham("sp3", "iphone", 850));
//    }
//
//    public void inputDSSP(){
//        while (true){
//            SanPham sp1 = new  SanPham();
//            sp1.input();
//            list.add(sp1);
//            System.out.println("Nhập tiếp hay không(N/Y)?: ");
//            if (sc.nextLine().equalsIgnoreCase("N")){
//                break;
//            }
//        }
//    }
//
//    public void outputDSSP(){
//        for (SanPham x: list) {
//            x.output();
//        }
//    }
//}
