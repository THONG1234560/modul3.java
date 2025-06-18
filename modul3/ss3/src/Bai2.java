import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, N;  // a là điểm, N là lựa chọn

        do {
            // Hiển thị menu lựa chọn
            System.out.println("Nhập 1 để tính xếp loại học lực của học sinh");
            System.out.println("Nhập 2 để tính tổng điểm của học sinh");
            System.out.println("Nhập -1 để thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");
            N = sc.nextInt();

            if (N == -1) {
                System.out.println("Đã thoát chương trình.");
                break;
            }

            switch (N) {
                case 1:
                    // Xếp loại học lực
                    System.out.print("Mời nhập điểm học viên (0–10): ");
                    a = sc.nextInt();

                    if (a < 0 || a > 10) {
                        System.out.println("Điểm không hợp lệ! Vui lòng nhập từ 0 đến 10.");
                    } else if (a < 5) {
                        System.out.println("Học lực yếu");
                    } else if (a < 7) {
                        System.out.println("Học lực trung bình");
                    } else if (a < 8) {
                        System.out.println("Học lực khá");
                    } else {
                        System.out.println("Học lực giỏi");
                    }
                    break;

                case 2:
                    // Tính tổng điểm với số cột điểm do người dùng nhập trước
                    System.out.print("Nhập số cột điểm cần nhập: ");
                    int socotdiem = sc.nextInt();
                    int tong = 0;

                    for (int i = 1; i <= socotdiem; i++) {
                        int diem;
                        do {
                            System.out.print("Nhập điểm thứ " + i + " (0–10): ");
                            diem = sc.nextInt();
                            if (diem < 0 || diem > 10) {
                                System.out.println("Điểm không hợp lệ! Nhập lại.");
                            }
                        } while (diem < 0 || diem > 10);

                        tong += diem;
                    }

                    System.out.println("Tổng điểm của " + socotdiem + " cột là: " + tong);
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại.");
            }

        } while (true);
    }
}
