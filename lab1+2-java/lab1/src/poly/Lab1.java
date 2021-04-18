package poly;

import java.util.Scanner;

import static java.lang.System.exit;
public class Lab1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do{
            menu();
            choice = scanner.nextInt();
            switch (choice){
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
                case 0:
                    exit(0);
                    break;

                default:
                    System.out.print("Bye!!!");
            }
        }while (choice>0);
    }
    static void menu() {
        System.out.println("+--------------------+");
        System.out.println("|  1. Bài 1:         |");
        System.out.println("|  2. Bài 2:         |");
        System.out.println("|  3. Bài 3:         |");
        System.out.println("|  4. Bài 4:         |");
        System.out.println("|  5. Bài 5:         |");
        System.out.println("|  0. Thoát:         |");
        System.out.println("+--------------------+");
        System.out.println("Mời chon: ");

    }

    static  void Exercise1(){
        String name;
        float avg;
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Avg: ");
        avg = scanner.nextFloat();

        System.out.println("Name: " + name);
        System.out.println("Avg: " + avg);
    }

    static void Exercise2(){
        double width= 0, height = 0, chuvi, dientich, CanhNN;
        System.out.print("Width = ");
        width = scanner.nextDouble();
        System.out.print("Height = ");
        height = scanner.nextDouble();

        chuvi = (height + width) * 2;
        dientich = (height * width);
        CanhNN = Math.min(height, width);

        System.out.println("Chu vi = " + chuvi);
        System.out.println("Dien tich = " + dientich);
        System.out.println("Cạnh nhỏ nhất: " + CanhNN);
    }

    static void Exercise3(){
        float cach;
        System.out.print("cach = ");
        cach = scanner.nextFloat();

        System.out.println("Thể tích khối chữ nhật là: " + Math.pow(cach,3));
    }

    static void Exercise4(){
        float a, b, c;
        System.out.print("A = ");
        a = scanner.nextFloat();
        System.out.print("B = ");
        b = scanner.nextFloat();
        System.out.print("C = ");
        c = scanner.nextFloat();

        double delta = Math.pow(b,2) - 4 * a * c;
        System.out.println("Delta = " + delta);
        System.out.println("Căn Delta = " + Math.sqrt(delta));
    }

    static void Exercise5(){
        String nameCat;
        double weight;
        int age;
        System.out.println("Nhập Name(Cat): ");
        nameCat = scanner.nextLine();
//        System.out.println("Nhập Weight: ");
//        weight = scanner.nextDouble();
//        System.out.println("Nhập Age: ");
//        age = scanner.nextInt();

//        System.out.printf("Weight = %f", weight);
//        System.out.println("Name Cat = " + nameCat);
//        System.out.println("Age = " + age);
    }
}
