import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        do {
            System.out.print("Mời bạn nhập số tuổi của mình: ");
            while (!sc.hasNextInt()) {
                System.out.println("Đây không phải là số. Vui lòng nhập lại!");
                sc.next(); // Đọc bỏ giá trị không hợp lệ
                System.out.print("Mời bạn nhập số tuổi của mình: ");
            }

            a = sc.nextInt();

            if (a <= 0) {
                System.out.println("Tuổi phải là số nguyên dương. Vui lòng nhập lại!");
            }

        } while (a <= 0);

        System.out.println("Tuổi của bạn là: " + a);
    }
}
