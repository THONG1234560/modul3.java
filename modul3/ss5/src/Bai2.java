import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Hello, Java World!");
        System.out.println("Chuỗi ban đầu: " + sb);
        sb.delete(5, 9);
        System.out.println("Chuỗi sau khi xóa: " + sb);
        sb.replace(8,14, "Universe");
        System.out.println("Chuỗi sau khi thay thế: " + sb);
    }
}