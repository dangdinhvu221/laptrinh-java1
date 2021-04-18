package day6;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email, mauEmail = "\\w+@\\w+(\\.\\w+){1,2}";
        while (true) {
            System.out.print("Nhập Email: ");
            email = sc.nextLine();
            if (email.matches(mauEmail)) {
                break;
            } else {
                System.out.println("vui lòng nhập lại !!!!");
            }
        }
        System.out.println("Email nhập là: " + email);
    }
}
