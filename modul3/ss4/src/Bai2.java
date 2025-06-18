import java.util.Scanner;

public class Bai2 {
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


        int sum = 0;
        for (int i = 0; i < n; i++) {
                sum = sum + array[i];
        }

        System.out.println("Tổng các phần tử trong mảng là: " + sum);
    }
}
