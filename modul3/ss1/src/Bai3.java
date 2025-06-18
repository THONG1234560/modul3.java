import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;  // r là bán kính
        System.out.print("Mời nhập bán kính hình tròn: ");
        r = sc.nextInt();
        double dienTich = 3.14 * r * r;
        System.out.println("Diện tích hình tròn là: " + dienTich);
    }
}
