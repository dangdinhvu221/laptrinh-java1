package test;

import java.util.ArrayList;
import java.util.Scanner;

public class QLSP {
    ArrayList<SanPham> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public void khoiTao(){
        SanPham sp = new SanPham();
        list.add(new SanPham("Quạt điện", 250, "OK"));
        list.add(new SanPham("Điện Thoại", 190, "iPhone"));
        list.add(new SanPham("LapTop", 123, "OK"));
    }

    public void nhapDSSP(){
        while (true){
            SanPham sp1 = new SanPham();
            sp1.input();
            list.add(sp1);
            System.out.print("Nhập tiếp hay không (N/Y)?: ");
            if (sc.nextLine().equalsIgnoreCase("N")){
                break;
            }
        }
    }

    public void xuatDSSP(){
//        System.out.printf("-15s 19s 20s", "tenSP", "donGia", "hang");
        for (SanPham x: list) {
            x.output();
        }
    }

    public void xuatDSTKDG(){
        System.out.println("Nhập min: ");
        double min = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập max: ");
        double max = Double.parseDouble(sc.nextLine());
        boolean ok = false;
        System.out.println("DSSP đơn giá min -> max: ");
        for (SanPham sp: list) {
            if (sp.getDonGia() >= min && sp.getDonGia() <= max){
                sp.output();
            }
        }
    }

    public void sapxepGD(){
        list.sort((o1, o2) -> {
           return o1.getHang().compareToIgnoreCase(o2.getHang());
        });
        System.out.println("Sắp xếp theo hãng giảm dần: ");
        xuatDSSP();
    }
}
