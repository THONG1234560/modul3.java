import java.util.Random;
import java.util.Scanner;
public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Nhập độ dài chuỗi từ người dùng (1 ≤ n ≤ 1000)
        do {
            System.out.print("Nhập độ dài chuỗi (1 - 1000): ");
            n = scanner.nextInt();
        } while (n < 1 || n > 1000);

        String randomStr = generateRandomString(n);
        System.out.println("Chuỗi ngẫu nhiên: " + randomStr);
    }

    public static String generateRandomString(int length) {
        StringBuilder result = new StringBuilder();
        Random rand = new Random();

        // Tập ký tự: A-Z, a-z, 0-9
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(characters.length()); // chọn ngẫu nhiên 1 ký tự
            result.append(characters.charAt(index));
        }

        return result.toString();
    }
}
