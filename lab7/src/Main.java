import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void menu(){
        System.out.println("1. nhập");
        System.out.println("2. xuất");
        System.out.println("0. thoát");
        System.out.println("Mời chọn: ");
    }

    public static void main(String[] args) {
        QLNV c = new QLNV();
        int chon;

        do {
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon){
                case 1:
                    c.inputDSNV();
                    break;
                case 2:
                    c.outputDSSV();
                    break;
                case 3:
                    break;

                default:
                    System.out.println("Byee!!!!");
            }
        }while (true);
    }
}
