package poly.assingment;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageEmployee {
    //----------Khai báo mảng Arraylist--------------------//
    ArrayList<NhanVien> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    //-------------------Nhập thêm thông tin Nhân viên---------------------//
    public void list5Employee() {
        list.add(new NhanVienHC("NV1", "ĐẶNG ĐÌNH VŨ", 1000000));
        list.add(new NhanVienHC("NV2", "ĐẶNG ĐÌNH LONG", 9000000));
        list.add(new NhanVienHC("NV3", "ĐẶNG ĐÌNH NGHĨA", 10000000));
        list.add(new NhanVienHC("NV4", "ĐẶNG THỊ LAN ANH", 1500000));
        list.add(new NhanVienHC("NV5", "ĐẶNG ĐÌNH TÌNH", 20000000));
    }

    public void inputEmployee() {
        int chon;
        do {
            do {
                System.out.println("Chọn loại NV (1 - Hành chính, 2 - Tiếp thị, 3 - Trưởng phòng): ");
                System.out.print("Mời chọn: ");
                chon = check();
            } while (chon > 3 || chon < 1);
            switch (chon) {
                case 1 -> {
                    NhanVienHC hc = new NhanVienHC();
                    hc.input();
                    list.add(hc);
                }
                case 2 -> {
                    TiepThi tt = new TiepThi();
                    tt.input();
                    list.add(tt);
                }
                case 3 -> {
                    TruongPhong tp = new TruongPhong();
                    tp.input();
                    list.add(tp);
                }
                default -> {
                    System.out.println();
                    System.out.println("Không có trong mục");
                }
            }
            System.out.print("Nhập tiếp hay không (N/Y)?: ");
        } while (!sc.nextLine().equalsIgnoreCase("N"));
    }

    //-------------------Xuất thông tin Nhân viên---------------------//
    public void outputEmployee() {
        System.out.printf("%-15s %-20s %-20s %-20s %-20s %-20s %-20s %-20s \n",
                "Mã Nhân Viên", "Họ Và Tên",
                "Lương", "Thu Nhập", "Thuế Thu Nhập", "Doanh Số", "Hoa Hồng", "Trách Nhiêm");
        for (NhanVien x : list) {
            x.output();
        }
    }


    //---------------Tìm kiếm mã nhân viên--------------//
    public void searchEmployee() {
        System.out.print("Mã nhân viên tìm kiếm: ");
        String code = sc.nextLine();
        boolean ok = false;
        System.out.println("Mã nhân viên tìm là: " + code);
        System.out.printf("\n%-15s %-20s %-20s %-20s %-20s %-20s %-20s %-20s \n", "MaNV", "HoTen", "Luong", "Thu " +
                "Nhap", "Thue Thu Nhap", "Doanh So", "Hoa Hong", "Trach Nhiem");
        for (NhanVien x : list) {
            if (x.getCode().equalsIgnoreCase(code)) {
                ok = true;
                x.output();
                break;
            }
        }
        if (!ok) {
            System.out.println("Không tìm thấy mã nhân viên :((...");
        }
    }

    //------------ Xoá mã nhân viên-----------------//
    public void deleteEmployee() {
        System.out.print("Mã nhân viên muốn xoá: ");
        String code = sc.nextLine();
        boolean ok = false;
        System.out.println("Bạn đã xoá : " + code);
        System.out.printf("\n%-15s %-20s %-20s %-20s %-20s %-20s %-20s %-20s \n", "MaNV", "HoTen", "Luong", "Thu " +
                "Nhap", "Thue Thu Nhap", "Doanh So", "Hoa Hong", "Trach Nhiem");
        for (NhanVien x : list) {
            if (x.getCode().equalsIgnoreCase(code)) {
                list.remove(x);
                ok = true;
                x.output();
                break;
            }
        }
        if (!ok) {
            System.out.println("\nKhông tìm thấy mã nhân viên :((...");
        }
    }

    //-------------------Cập nhật lại mã nhân viên------------------//
    public void updateEmployee() {
        int chon;
        boolean ok = false;
        System.out.print("Mã nhân viên muốn cập nhật: ");
        String code = sc.nextLine();
        for (NhanVien x : list) {
            if (code.equalsIgnoreCase(x.getCode())) {
                ok = true;
                break;
            }
        }
        if (!ok) {
            System.out.println("Không có mã nhân viên này :((..\n");
            updateEmployee();
        }
        do {
            System.out.println("Chọn loại NV (1 - Hành chính, 2 - Tiếp thị, 3 - Trưởng phòng): ");
            System.out.print("Mời chọn: ");
            chon = check();
        } while (chon > 3 || chon < 1);
        switch (chon) {
            case 1 -> {
                System.out.println("\n------------Mời nhập thông tin mới------------");
                NhanVienHC hc = new NhanVienHC();
                for (NhanVien x : list) {
                    if (x.getCode().equalsIgnoreCase(code)) {
                        list.remove(x);
                        hc.input();
                        list.add(hc);
                        break;
                    }
                }
                System.out.println("Đã cập nhật thành công <3...");
            }
            case 2 -> {
                System.out.println("\n------------Mời nhập thông tin mới------------");
                TiepThi tt = new TiepThi();
                for (NhanVien x : list) {
                    if (x.getCode().equalsIgnoreCase(code)) {
                        list.remove(x);
                        tt.input();
                        list.add(tt);
                        break;
                    }
                }
                System.out.println("Đã cập nhật thành công <3...");
            }
            case 3 -> {
                System.out.println("\n------------Mời nhập thông tin mới------------");
                TruongPhong tp = new TruongPhong();
                for (NhanVien x : list) {
                    if (x.getCode().equalsIgnoreCase(code)) {
                        list.remove(x);
                        tp.input();
                        list.add(tp);
                        break;
                    }
                }
                System.out.println("Đã cập nhật thành công <3...");
            }
            default -> System.out.println("Vui lòng Nhập Lại!!!");
        }
    }

    //---------------- Tìm nhân viên theo lương thu nhập--------------------//
    public void searchEarnings() {
        boolean ok = false;
        double max,min;
        do{
            System.out.print("Nhập min: " );
            min=check1();
        }while(min<0);
        do{
            System.out.print("Nhập max: ");
            max=check1();
        }while(min>max);
        System.out.printf("%-15s %-20s %-20s %-20s %-20s %-20s %-20s %-20s \n",
                "MaNV", "HoTen",
                "Luong", "Thu Nhap", "Thue Thu Nhap", "Doanh So", "Hoa Hong", "Trach Nhiem");
        for (NhanVien x : list) {

            if (x.getSalary() >= min && x.getSalary()<=max) {
                ok = true;
                x.output();
            }
        }
        if (!ok) {
            System.out.println("Khoảng lương không có trong DS!!!");
        }
    }

    //---------------- Sắp xếp nhân viên theo họ tên --------------------//
    public void sortFullName() {
        list.sort((o1, o2) -> {
            String name1 = o1.getName().split(" ")[o1.getName().split(" ").length - 1];
            String name2 = o2.getName().split(" ")[o2.getName().split(" ").length - 1];
            return name1.compareToIgnoreCase(name2);
        });
        System.out.println("Sắp xếp theo họ tên: ");
        outputEmployee();
    }

    //---------------- Sắp xếp nhân viên theo thu nhập --------------------//
    public void sortEarnings() {
        list.sort((o1, o2) -> {
            Double d1 = o1.getThuNhap();
            Double d2 = o2.getThuNhap();
            return d2.compareTo(d1);
        });
        System.out.println("Sắp xếp theo thu nhập: ");
        outputEmployee();
    }

    //---------------- Xuất 5 nhân viên có thu nhập cao nhất --------------------//
    public void employeeEarningsMax() {
        sortEarnings();
//        int t = (list.size() < 5) ? list.size() : 5;
        int t = Math.min(list.size(), 5);
        for (int i = 0; i < t; i++) {
            list.get(i).output();
        }
    }

    //--------------Check lỗi------------------------//
    public Integer check() {
        try {
            if (sc.hasNextInt()) {
                return Integer.parseInt(sc.nextLine());
            } else {
                System.out.println("Vui lòng nhập lại !!!");
                sc.nextLine();
                return check();
            }
        } catch (Exception e) {
            return check();
        }

    }

    public Double check1() {
        try {
            if (sc.hasNextDouble()) {
                return Double.parseDouble(sc.nextLine());
            } else {
                System.out.println("Vui lòng nhập lại !!!");
                sc.nextLine();
                return check1();
            }
        } catch (Exception e) {
            return check1();
        }

    }
}
