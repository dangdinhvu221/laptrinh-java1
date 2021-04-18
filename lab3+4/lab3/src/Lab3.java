import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.*;

public class Lab3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            menu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Exercise1();
                    break;
                case 2:
                    Exercise2();
                    break;
                case 3:
                    Exercise3();
                    break;
                case 4:
                    Exercise5();
                    break;
                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.print("Bye!!!");
            }
        } while (choice > 0);
    }

    static void menu() {
        System.out.println("+---------------------------+");
        System.out.println("|  1. Exercise 1: Số NTố    |");
        System.out.println("|  2. Exercise 2: Bảng CCH  |");
        System.out.println("|  3. Exercise 3:           |");
        System.out.println("|  4. Exercise 4:           |");
        System.out.println("|  0. Exit.                 |");
        System.out.println("+---------------------------+");
        System.out.println("Mời chon: ");

    }

    static void Exercise1() {
        int a;
        boolean dung = true;
        System.out.println("Nhập a= ");
        a = sc.nextInt();
        for (int i = 2; i < a - 1; i++) {
            if (a % i == 0) {
                dung = false;
                break;
            }
        }
        if (dung == true) {
            System.out.println(" " + a + " Laf số nguyên tố");
        } else {
            System.out.println(" " + a + " không phải là số nguyên tố");
        }
    }

    static void Exercise2() {
        int a;
        System.out.println("Nhập bảng cửu chương: ");
        a = sc.nextInt();

        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }
    }

    static void Exercise3() {
        int n;
        System.out.println("Nhập mảng số nguyên: ");
        n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Nhập các phần tử trong mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("array[%d]: ", i);
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Sắp xếp mảng: ");
        for (int x : array) {
            System.out.println(x + "");
        }
        System.out.println("Min = ");
        int min = array[0];
        for (int x : array) {
            min = Math.min(min, x);
        }
        System.out.println(min);

        int tong = 0, count = 0;
        System.out.println("Chia hết cho 3: ");
        for (int x : array) {
            if (x % 3 == 0) {
                tong += x;
                count++;
            }
        }
        System.out.printf("%.1f", (double) tong / (count - 1));
        System.out.println("");
    }
    public static void Exercise5() {
        int n = 0;
        try {
            System.out.print("Nhập số lượng SV: ");
            n = Integer.parseInt(sc.nextLine());
        } catch (Exception ex) {
            System.out.println("Vui lòng nhập lại");
            Exercise5();
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
                Exercise5();
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
}