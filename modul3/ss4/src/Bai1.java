import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng:");
        int n = sc.nextInt();
        int[] array = new int[n];

        // Nhập từng phần tử
        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập số thứ " + i + ": ");
            array[i - 1] = sc.nextInt();
        }

        // Tìm phần tử lớn nhất
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
    }
}
