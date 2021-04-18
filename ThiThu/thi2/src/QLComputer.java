import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class QLComputer {
    ArrayList<Computer> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    Computer cpt = new Computer();

    public void khoiTao() {
        list.add(new Computer("Vũ", 18, 250));
        list.add(new Computer("Đức", 18, 150));
        list.add(new Computer("Lan", 18, 100));
        list.add(new Computer("Thịnh", 18, 90));
        list.add(new Computer("Trường", 18, 850));
    }

    public void inputCPT() {
        do {
//            System.out.println("1. Computer -- 2. LittleComputer");
            Computer cpt = new Computer();
            cpt.input();
            list.add(cpt);
            System.out.print("Bạn có nhập tiếp không (N/Y)?: ");
        } while (!sc.nextLine().equalsIgnoreCase("N"));
    }

    public void outputCPT() {
        System.out.println("1. Xuất 1 đối tượng ||   2. Xuất DS đối tượng\n");
        int chon = Integer.parseInt(sc.nextLine());
        if (chon == 1) {
            System.out.print("Chọn name xuất: ");
            String name = sc.nextLine();
            for (Computer x : list) {
                if (x.getName().equalsIgnoreCase(name)){
                    x.output();
                    break;
                }
            }
        } else if (chon == 2) {
            for (Computer x : list) {
                x.output();
            }
        }
    }

    public void xuatTheoKG() {
        int max, min;
        System.out.print("Nhập min: ");
        min = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập max: ");
        max = Integer.parseInt(sc.nextLine());
        System.out.println("Xuất: ");
        for (Computer x : list) {
            if (x.getPrice() <= max && x.getPrice() >= min) {
                x.output();
            }
        }
    }

    public void SapXepPrice() {
        list.sort((o1, o2) -> {
            Integer d1 = o1.getPrice();
            Integer d2 = o2.getPrice();
            return d1.compareTo(d2);
        });
        System.out.println("Sắp Xếp các phần tử tăng dần theo price: ");
        outputCPT();
    }

    public void intop3Computer() {
        SapXepPrice();
        int min = Math.min(list.size(), 3);
        System.out.println("\nXuất 3 Computer có giá thấp nhất.");
        for (int i = 0; i < min; i++) {
            list.get(i).output();
        }
    }
}
