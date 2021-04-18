package baithithu.poly;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chosse;
        do {
            menu();
            chosse = Integer.parseInt(scanner.nextLine());
            switch (chosse) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    exit(0);
                    break;
                default:
                    System.out.println("Byeeee!!!!");
            }
        }while(true);
    }


    public static void menu(){
        System.out.println("-----------------------------------");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("0. Thoát");
        System.out.print("Mời bạn chọn: ");
    }
}
