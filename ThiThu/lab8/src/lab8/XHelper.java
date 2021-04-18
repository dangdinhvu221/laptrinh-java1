package lab8;

public class XHelper {
    // Khối static{} sẽ chạy trước khi tạo đối tượng hoắc truy xuất bất kỳ thành viên tĩnh khác
    static{
        System.out.println("    // Khối static{} sẽ chạy trước khi tạo đối tượng hoắc truy xuất bất kỳ thành viên tĩnh khác\n");
    }
    // Các thành viên tĩnh .. (Tên_lớp . )

    // Trường(thuộc tính static):
    public static int so;

    // tham số biến đổi ...a: thực chất là mảng
    public int sum(int... a) {
        int s = 0;
        for (int x : a) {
            s += x;
        }
        return s;
    }

    // tham số biến đổi ...a: thực chất là mảng
    public static int tinhTong(int... a) {
        int s = 0;
        for (int x : a) {
            s += x;
        }
        return s;
    }

}
