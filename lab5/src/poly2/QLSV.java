package poly2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QLSV {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<sinhVien> svlst = new ArrayList<>();

    public void DSSV() {
        while (true) {
            sinhVien sv = new sinhVien();
            sv.input();
            svlst.add(sv);
            System.out.println("Bạn có muốn tiếp tục không (Y/N): ");
            String hoi = sc.nextLine();
            if (hoi.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public void xuatDSSV() {
        for (sinhVien x : svlst) {
            x.output();
        }

    }

    public void sapXepTheoTen(){
        // tạo Comparator định nghĩa tiêu trí giữa 2 sv họ và tên

        Comparator <sinhVien> comp = new Comparator<sinhVien>() {
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                return o1.getHoten().compareToIgnoreCase(o2.getHoten());
            }
        };
        Collections.sort(svlst, comp);
        xuatDSSV();
    }


    public void sapXepTheoDiem(){
        Comparator <sinhVien> comp = new Comparator<sinhVien>() {
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                Double diem1 = o1.getDiem();
                Double diem2 = o2.getDiem();
                return diem1.compareTo(diem2);
            }
        };
        Collections.sort(svlst, comp);
        xuatDSSV();
    }
}
