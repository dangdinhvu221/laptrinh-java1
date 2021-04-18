package lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class QLStudent {
    ArrayList<SinhVienPoly> arrayList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public void kt() {
        arrayList.add(new SinhVienBiz("ok1", "ok1", 1,1));
    }

    public void inputDs() {
        int choose;
        do {
            do {
                System.out.println("Loai student(1. IT 2. Buss)");
                System.out.print("ban chon: ");
                choose = Integer.parseInt(scanner.nextLine());
            }while(choose > 2 || choose < 1);
            if (choose ==1){
                SinhVienIT it = new SinhVienIT();
                it.inputSt();
                arrayList.add(it);
            }else {
                SinhVienBiz bz = new SinhVienBiz();
                bz.inputSt();
                arrayList.add(bz);
            }
            System.out.print("Bạn muốn nhập nữa không ? (Y/N): ");
        } while (!scanner.nextLine().equalsIgnoreCase("N"));
    }


    public void outputDs() {
        System.out.printf("%-15s %-15s %-20s %-20s %-15s %-15s %-15s %15.;s\n", "hoTen",
                "nganh", "diem marketing", "diem sale", "diem java", "diem html", "diem css", "Học Lực");

        for (SinhVienPoly x : arrayList) {
            x.output();
        }
//        arrayList.forEach((SinhVienPoly::output));
    }


    public void xuatHSG() {
        for (SinhVienPoly x : arrayList) {
            if (x.getHocLuc().equalsIgnoreCase("Gioi")) {
                x.output();
            }
        }
    }

    public void sxD() {
        arrayList.sort((o1, o2) -> {
            Double d1 = o1.getDiem();
            Double d2 = o2.getDiem();
            return d1.compareTo(d2);
        });
        System.out.println("------Xuất-----------");
        outputDs();
    }
}
