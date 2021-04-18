import java.util.Scanner;

public class Lab2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            menu();
            choice = scanner.nextInt();
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
                    Exercise4();
                    break;
                case 5:
                    Exercise5();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.print("Bye!!!");
            }
        } while (choice > 0);
    }

    static void menu() {
        System.out.println("+---------------------------+");
        System.out.println("|  1. Exercise 1: PT Bậc 1  |");
        System.out.println("|  2. Exercise 2: PT Bậc 2  |");
        System.out.println("|  3. Exercise 3: Số Điện   |");
        System.out.println("|  4. Exercise 4: Chicken   |");
        System.out.println("|  5. Exercise 5: Chicken2  |");
        System.out.println("|  0. Thoát                 |");
        System.out.println("+---------------------------+");
        System.out.println("Mời chon: ");

    }

    static void Exercise1() {
        Scanner scanner = new Scanner(System.in);
        float a, b, x;
        System.out.println("Nhập a = ");
        a = scanner.nextFloat();
        System.out.println("Nhập b = ");
        b = scanner.nextFloat();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            x = -b / a;
            System.out.println("Xuất nghiệm x = " + x);
        }
    }

    static void Exercise2() {
        Scanner scanner = new Scanner(System.in);
        float a, b, c, x;
        System.out.println("Nhập a = ");
        a = scanner.nextFloat();
        System.out.println("Nhập b = ");
        b = scanner.nextFloat();
        System.out.println("Nhập c = ");
        c = scanner.nextFloat();
        if (a == 0) {
            x = -b / a;
            System.out.println("Phương trình bậc nhất = " + x);
        } else {
            double delta = Math.pow(b, 2) - (4 * a * c);
            System.out.println("Delta = " + delta);
            if (delta < 0) {
                System.out.println("PT vô nghiệm");
            } else if (delta == 0) {
                float X = -b / (2 * a);
                System.out.println("Nghiệm kép = " + X);
            } else if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Có 2 nghiệm phân biệt x1 = " + x1);
                System.out.println("Có 2 nghiệm phân biệt x2 = " + x2);
            }
        }
    }

    static void Exercise3() {
        Scanner scanner = new Scanner(System.in);
        float dien = 0;
        System.out.println("Nhập số điện: ");
        dien = scanner.nextFloat();
        if (dien > 0 && dien < 50) {
            double tien = dien * 1000;
            System.out.println("Giá mỗi số điện là 1000");
            System.out.println("Cái giá phải trả là: " + tien);
        } else {
            double tien = 50 * 1000 + (dien - 50) * 1200;
            System.out.println("Goá mỗi số điện là 1200");
            System.out.println("Cái giá phải trả là: " + tien);
        }
    }

    static void Exercise4() {
        System.out.println("Nhập Gender: ");
        String gender = sc.nextLine();

        int age;
        do {
            System.out.println("Nhập Age: ");
            age = check();
        } while (age <= 0);

        System.out.println("Gender : " + gender);
        System.out.println("Age: " + age);

        if (age < 2) {
            System.out.println("Status: Gà con");
        } else {
            System.out.println("Status: Gà già");
        }
    }

    static void Exercise5() {
        System.out.println("Nhập Gender: ");
        String gender = sc.nextLine();
        int age;
        do {
            System.out.println("Nhập Age: ");
            age = check();
        } while (age <= 0);

        System.out.println("Gender : " + gender);
        System.out.println("Age: " + age);

        String ok = age < 2 ? "Stattus: Gà con" : "Status: Gà già";
        System.out.println(ok);
    }

    static int check() {
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Vui lòng nhập lại !!!");
            sc.next();
            return check();
        }
    }
}
