package thithu;

import java.util.ArrayList;
import java.util.Scanner;

public class QLChicken {
    ArrayList<Chicken> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public void khoiTao() {
        list.add(new Chicken("duc", "black", 456));
        list.add(new Chicken("duc", "red", 100));
        list.add(new Chicken("duc", "blue", 90));
        list.add(new Chicken("duc", "green", 50));

    }

    public void inputChicken() {
        do {
            Chicken c = new Chicken();
            c.input();
            list.add(c);
            System.out.println("Nhập tiếp hay không (N/Y)?:");
        } while (!sc.nextLine().equalsIgnoreCase("N"));
    }

    public void outputChicken() {
        System.out.println("Xuat: ");
        for (Chicken x : list) {
            x.output();
        }
    }

    public void inTheoKhongGia() {
        int max, min;
        System.out.println("Nhập min: ");
        min = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập max: ");
        max = Integer.parseInt(sc.nextLine());
        for (Chicken x : list) {
            if (x.getPrice() <= max && x.getPrice() >= min) {
                x.output();
            }
        }
    }

    public void sapXepPrice() {
        list.sort((o1, o2) -> {
            Integer d1 = o1.getPrice();
            Integer d2 = o2.getPrice();
            return d1.compareTo(d2);
        });
        System.out.println("Sắp Xếp: ");
        outputChicken();
    }

    public void tinhTBPrice() {
        int dem = 0, sum = 0;
        for (Chicken x : list) {
            sum += x.getPrice();
            dem++;
        }
        System.out.println("Trung binh: " + (sum / dem));
    }

}
