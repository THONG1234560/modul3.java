import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi và loại bỏ khoảng trắng ở đầu và cuối
        System.out.print("Nhập địa chỉ email: ");
        String input = scanner.nextLine().trim();

        // Biểu thức chính quy kiểm tra email hợp lệ
        String emailRegex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*\\.[a-zA-Z]{2,6}$";

        // Kiểm tra tính hợp lệ
        if (input.matches(emailRegex)) {
            System.out.println("Email hợp lệ");
        } else {
            System.out.println("Email không hợp lệ");
        }
        scanner.close();
    }
}
