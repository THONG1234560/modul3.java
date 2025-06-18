import java.util.Scanner;
import java.util.Arrays;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng phần tử
        System.out.println("Nhập số lượng phần tử trong mảng:");
        int n = sc.nextInt();
        int[] array = new int[n];

        // Nhập từng phần tử
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        // Sắp xếp mảng theo thứ tự giảm dần (bubble sort hoặc dùng Arrays)
        Arrays.sort(array); // sắp xếp tăng dần

        // Đảo mảng lại để thành giảm dần
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = array[n - 1 - i];  //logic để đảo mảng
        }

        // In mảng sau khi sắp xếp
        System.out.print("Mảng sau khi sắp xếp giảm dần: ");
        for (int i = 0; i < n; i++) {
            System.out.print(reversed[i] + " ");
        }
    }
}
