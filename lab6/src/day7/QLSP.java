//package day7;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class QLSP {
//    ArrayList<SanPham> listSP = new ArrayList<>();
//    static Scanner sc = new Scanner(System.in);
//
//    public void khoiTao() {
////        SanPham ts = new SanPham();
////        listSP.add(new SanPham("quạt", 456, 123));
////        listSP.add(new SanPham("tủ lạnh", 789, 56));
////        listSP.add(new SanPham("tivi", 4500, 98));
////        listSP.add(new SanPham("laptop", 369, 32));
////        listSP.add(new SanPham("điện thoại", 456, 98));
//    }
//
//    public void nhapDSSP() {
//        do {
//            SanPham tssp = new SanPham();
//            tssp.nhap();
//            listSP.add(tssp);
//            System.out.println("Nhập tiếp hay không(N/Y)?: ");
//            if (sc.nextLine().equalsIgnoreCase("N")) {
//                break;
//            }
//        } while (true);
//    }
//
//    public void xuatDSSP() {
//        System.out.printf("%15s %15s %15s\n", "tenSP", "donGia", "giamGia");
//        for (SanPham x : listSP) {
//            x.xuat();
//        }
//    }
//
//    public void sapXepGD() {
//        listSP.sort((o1, o2) -> {
//            Double d1 = o1.getDonGia();
//            Double d2 = o2.getDonGia();
//            return d2.compareTo(d1);
//        });
//        System.out.println("Xuất thông tin SXGD theo đơn giá.");
//        xuatDSSP();
//    }
//
//    public double donGiaTB() {
//        double sum = 0, avg = 0;
//        for (SanPham x : listSP) {
//            sum += x.getDonGia();
//        }
//        avg = (double) sum / listSP.size();
//       // System.out.println("Đơn giá TB là: " + avg);
//        return avg;
//    }
//
//    public void XuatTTSPLHDGTB() {
//        for (SanPham x : listSP) {
//            if (x.getDonGia() > donGiaTB()) {
//                x.xuat();
//            }
//        }
//    }
//}
