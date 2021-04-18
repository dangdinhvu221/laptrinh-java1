package lab8.baitap;

import java.util.Scanner;

final class XPoly {
    public static final double sum(double... x) {
        double sum = 0;
        for (double a : x) {
            sum += a;
        }
        return sum;
    }

    public static double min(double... x) {
        double m = x[0];
        for (double i : x) {
            m = Math.min(m, i);
        }
        return m;
    }

    public static double max(double... x) {
        double m = x[0];
        for (double i : x) {
            m = Math.max(m, i);
        }
        return m;
    }

    public static void toUpperFistChars(String s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập: ");
        String ducanlon = scanner.nextLine();

        int dau = ducanlon.indexOf(" ");
        int cuoi = ducanlon.lastIndexOf(" ");
        String ho = ducanlon.substring(0, dau);
        for (int i = 0; i < ho.length(); i++){
            ho[0].toUpperCase();
        }
        String dem = ducanlon.substring(dau+1, cuoi);
        String ten = ducanlon.substring(cuoi+1);
        System.out.println(ho + " " + dem + " " + ten);
    }
}
