import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, N;
        System.out.println("Mời bạn nhập số chuỗi của dãy số:");
        N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Số không hợp lệ");
        } else {
            int sum = 0;
            for (int i = 1; i <= N; i++) {
                System.out.println("Mời bạn nhập số thứ: " + i);
                a = sc.nextInt();
                sum += a; // Cộng dồn vào tổng
            }
            System.out.println("Tổng của dãy số là: " + sum);
        }
    }
}
