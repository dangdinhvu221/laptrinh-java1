package poly;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight;
        String name;
        int age;

        System.out.println("Nhập weight: ");
        weight = Double.parseDouble(sc.nextLine());
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("Age: ");
        age = sc.nextInt();

        System.out.println("Name: "+ name);
        System.out.printf("weight: %.2f\n", weight);
        System.out.println("Age: " + age);
    }
}
