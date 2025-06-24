import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Mời bạn nhập vào dãy số: ");
        String input = scanner.nextLine();

        // Thay thế tất cả ký tự số bằng *
        String replaced = input.replaceAll("[0-9]", "*");

        // In kết quả
        System.out.println("Chuỗi sau khi thay thế: " + replaced);

        scanner.close();
    }
}
