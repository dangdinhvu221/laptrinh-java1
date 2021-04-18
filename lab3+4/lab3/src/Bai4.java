import java.util.Scanner;

public class Bai4 {
    static Scanner sc = new Scanner(System.in);

    public static void input() {
        int n = 0;
        try {
            System.out.print("Nhập số lượng SV: ");
            n = Integer.parseInt(sc.nextLine());
        } catch (Exception ex) {
            System.out.println("Vui lòng nhập lại");
            input();
        }

        String[] hoTen = new String[n];
        double[] mark = new double[n];
        for (int i = 0; i < hoTen.length; i++) {
            System.out.print("Nhập họ tên sv " + (i + 1) + " : ");
            hoTen[i] = sc.nextLine();
            try {
                System.out.print("Nhập điểm sv " + (i + 1) + " : ");
                mark[i] = Double.parseDouble(sc.nextLine());
            } catch (Exception ex) {
                System.out.println(" ");
                System.out.println("-----------------------------");
                System.out.println("Nhập lại từ đầu.!");
                input();
            }
        }

        System.out.println("Xuất: ");
        for (int i = 0; i < hoTen.length; i++) {
            System.out.println("Tên SV " + (i + 1) + " là: " + hoTen[i]);
            System.out.println("Điểm SV " + (i + 1) + " là: " + mark[i]);

            if (mark[i] < 5) {
                System.out.println("Học lực: Yếu");
                System.out.println(" ");
            } else if (mark[i] < 6.5) {
                System.out.println("Học lực: Trung bình");
                System.out.println(" ");
            } else if (mark[i] < 7.5) {
                System.out.println("Học lực: Khá");
                System.out.println(" ");
            } else if (mark[i] < 9) {
                System.out.println("Học lực: Giỏi");
                System.out.println(" ");
            } else {
                System.out.println("Học lực: Xuấ sắc");
                System.out.println(" ");

            }
        }
    }

    public static void main(String[] args) {
        input();
    }
}
