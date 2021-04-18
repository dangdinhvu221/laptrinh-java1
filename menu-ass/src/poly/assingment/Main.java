package poly.assingment;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ManageEmployee qlnv = new ManageEmployee();

    public static void main(String[] args) {
        int chon;
        qlnv.list5Employee();
        do {
            menu();
            chon = check();
            switch (chon) {
                case 1 -> {
                    System.out.println("Bạn chọn chức năng 1: Nhập danh sách nhân viên từ bàn phím.\n");
                    qlnv.inputEmployee();
                }
                case 2 -> {
                    System.out.println("Bạn chọn chức năng 2: Xuất danh sách nhân viên ra màn hình.");
                    qlnv.outputEmployee();
                }
                case 3 -> {
                    System.out.println("Bạn chọn chức năng 3: Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.");
                    qlnv.searchEmployee();
                }
                case 4 -> {
                    System.out.println("Bạn chọn chức năng 4: Xóa nhân viên theo mã nhập từ bàn phím.");
                    qlnv.deleteEmployee();
                }
                case 5 -> {
                    System.out.println("Bạn chọn chức năng 5:  Cập nhật thông tin nhân viên theo mã nhập từ bàn phím.\n");
                    qlnv.updateEmployee();
                }
                case 6 -> {
                    System.out.println("Bạn chọn chức năng 6:  Tìm các nhân viên theo khoảng lương nhập từ bàn phím.");
                    qlnv.searchEarnings();
                }
                case 7 -> {
                    System.out.println("Bạn chọn chức năng 7:  Sắp xếp nhân viên theo họ và tên.");
                    qlnv.sortFullName();
                }
                case 8 -> {
                    System.out.println("Bạn chọn chức năng 8: Sắp xếp nhân viên theo thu nhập. ");
                    qlnv.sortEarnings();
                }
                case 9 -> {
                    System.out.println("Bạn chọn chức năng 9:  Xuất 5 nhân viên có thu nhập cao nhất.");
                    qlnv.employeeEarningsMax();
                }
                case 0 -> {
                    System.exit(0);
                    System.out.println("Bạn chọn chức năng 0: Thoát");
                }
                default -> System.out.println("Không có chức năng này :((...");
            }
        } while (true);

    }

    //----------- Chếch lỗi -------------------//
    static Integer check() {
        try {
            if (sc.hasNextInt()) {
                return Integer.parseInt(sc.nextLine());
            } else {
                System.out.println("Vui lòng nhập lại!!!");
                sc.nextLine();
                return check();
            }
        } catch (Exception e) {
            return check();
        }
    }

    public static void menu() {
        System.out.println("\n++-------------------------------------------------------++");
        System.out.println("|1.Nhập danh sách nhân viên từ bàn phím.                  |");
        System.out.println("|2.Xuất danh sách nhân viên ra màn hình.                  |");
        System.out.println("|3.Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.    |");
        System.out.println("|4.Xóa nhân viên theo mã nhập từ bàn phím.                |");
        System.out.println("|5.Cập nhật thông tin nhân viên theo mã nhập từ bàn phím. |");
        System.out.println("|6.Tìm các nhân viên theo khoảng lương nhập từ bàn phím.  |");
        System.out.println("|7.Sắp xếp nhân viên theo họ và tên.                      |");
        System.out.println("|8.Sắp xếp nhân viên theo thu nhập.                       |");
        System.out.println("|9.Xuất 5 nhân viên có thu nhập cao nhất.                 |");
        System.out.println("|0.Thoát                                                  |");
        System.out.println("++-------------------------------------------------------++");
        System.out.print("Chọn chức năng: ");
    }
}

