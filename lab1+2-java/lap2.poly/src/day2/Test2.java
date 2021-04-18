package day2;

import java.util.Scanner;

public class Test2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int nhapThang, nam;
        System.out.println("Nhap thang: ");
        nhapThang = sc.nextInt();
        System.out.println("Nhập năm: ");
        nam = sc.nextInt();
        switch (nhapThang){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Thang: "+ nhapThang + " Năm: "+ nam +" Có 31 ngày");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("Thang: "+ nhapThang + " Năm: "+ nam +" Có 30 ngày");
                break;
            case 2:
                if (nam %4 == 0 && nam %100 != 0){
                    System.out.println("Thang: \n"+ nhapThang + " Năm: \n"+ nam +" có 29 ngày\n");
                }else {
                    System.out.println(" Thang: "+ nhapThang + " Năm: "+ nam +" Có 28 ngày.");
                }

            default:
                System.out.println("Bye!!");
                break;
        }
    }
}
