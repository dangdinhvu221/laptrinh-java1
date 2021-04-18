import java.util.ArrayList;
import java.util.Scanner;

public class QLNV {
    ArrayList<NhanVien> listNV = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public void inputDSNV(){
        System.out.println("(1. Hành Chính, 2.Kinh Doanh");
        int chon = Integer.parseInt(sc.nextLine());

        switch (chon){
            case 1:
                NhanVienHC nvhc = new NhanVienHC();
                nvhc.input();
                listNV.add(nvhc);
                break;
            case 2:
                NhanVienKD nvkd = new NhanVienKD();
                break;
            case 0:
                System.exit(0);
                break;

            default:
                System.out.println("Byee!!!!");
        }
    }
    public void outputDSSV(){
        System.out.printf("\n%-10s %-20s -%15s -%10s\n", "maNV", "nameNV", "salary", "Số Công");
        for (NhanVien x: listNV) {
            x.output();
        }
    }
}
