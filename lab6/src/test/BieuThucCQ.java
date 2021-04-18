package test;

import java.util.Scanner;

public class BieuThucCQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String mauCCCD = "0[0-9]{12}";
//
//        while(true){
//            System.out.println("Nhập CCCD: ");
//            String cccd = sc.nextLine();
//            if (cccd.matches(mauCCCD)){
//                break;
//            }else {
//                System.out.println("ERROR!!!");
//            }
//        }


//        while(true){
//            String mau = "\\.{8,}";
//            System.out.println("Nhập mat khau: ");
//            String cd = sc.nextLine();
//            if (cd.matches(mau)){
//                break;
//            }else{
//                System.out.println("ERROR!!");
//            }
//        }

//        String mau = "(29|3[0-3]|40)-[A-Z]\\d-((\\d{4})|(\\d{3}\\.\\d{2}))";
//        while (true) {
//            System.out.println("Nhập biển xe: ");
//            String bx = sc.nextLine();
//            if (bx.matches(mau)) {
//                break;
//            } else {
//                System.out.println("ERROR!!");
//            }
//        }
//

        String mau = "(http|https)://\\w+\\.\\w{2,3}";
        while(true){
            System.out.println("Nhập mẫu: ");
            String x = sc.nextLine();
            if (x.matches(mau)){
                break;
            }else{
                System.out.println("ERRROR!!!");
            }
        }
    }
}
