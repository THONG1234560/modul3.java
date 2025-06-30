import java.util.*;
import java.util.regex.*;

public class Bai3 {

    private static List<String> bienSoXe = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n******************QUẢN LÝ BIỂN SỐ XE****************");
            System.out.println("1. Thêm các biển số xe");
            System.out.println("2. Hiển thị danh sách biển số xe");
            System.out.println("3. Tìm kiếm biển số xe");
            System.out.println("4. Tìm biển số xe theo mã tỉnh");
            System.out.println("5. Sắp xếp biển số xe tăng dần");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    themBienSo();
                    break;
                case 2:
                    hienThiBienSo();
                    break;
                case 3:
                    timKiemBienSo();
                    break;
                case 4:
                    timKiemTheoMaTinh();
                    break;
                case 5:
                    sapXepBienSo();
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 6);
    }

    // Thêm biển số xe
    private static void themBienSo() {
        System.out.print("Nhập số lượng biển số xe cần thêm: ");
        int n = Integer.parseInt(sc.nextLine());
        Pattern pattern = Pattern.compile("\\d{2}[A-Z]-\\d{3}\\.\\d{2}");

        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Nhập biển số xe thứ " + (i + 1) + ": ");
                String bienSo = sc.nextLine().toUpperCase();
                Matcher matcher = pattern.matcher(bienSo);
                if (matcher.matches()) {
                    bienSoXe.add(bienSo);
                    break;
                } else {
                    System.out.println("Định dạng không hợp lệ! Định dạng đúng: VD: 30F-123.45");
                }
            }
        }
    }

    // Hiển thị danh sách biển số xe
    private static void hienThiBienSo() {
        if (bienSoXe.isEmpty()) {
            System.out.println("Danh sách trống!");
        } else {
            System.out.println("Danh sách biển số xe:");
            for (String bs : bienSoXe) {
                System.out.println(bs);
            }
        }
    }

    // Tìm kiếm biển số xe chính xác
    private static void timKiemBienSo() {
        System.out.print("Nhập biển số xe cần tìm: ");
        String bienSo = sc.nextLine().toUpperCase();
        if (bienSoXe.contains(bienSo)) {
            System.out.println("Biển số xe tồn tại trong danh sách.");
        } else {
            System.out.println("Không tìm thấy biển số xe.");
        }
    }

    // Tìm biển số xe theo mã tỉnh
    private static void timKiemTheoMaTinh() {
        System.out.print("Nhập mã tỉnh (VD: 29,30,51...): ");
        String maTinh = sc.nextLine();
        boolean found = false;
        for (String bs : bienSoXe) {
            if (bs.startsWith(maTinh)) {
                if (!found) {
                    System.out.println("Các biển số xe có mã tỉnh " + maTinh + ":");
                }
                System.out.println(bs);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy biển số xe với mã tỉnh này.");
        }
    }

    // Sắp xếp biển số xe tăng dần
    private static void sapXepBienSo() {
        Collections.sort(bienSoXe);
        System.out.println("Đã sắp xếp biển số xe tăng dần.");
    }
}
