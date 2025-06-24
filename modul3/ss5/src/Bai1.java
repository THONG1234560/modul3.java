import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập văn bản vào:");
        String vanban = sc.nextLine().trim();  //bỏ khoảng trắng đầu & cuối

        if (vanban.isEmpty()) {
            System.out.println("Không có ký tự.");
        } else {
            // Tách và đếm số từ
            String[] words = vanban.split("\\s+");
            System.out.println("Số lượng từ trong chuỗi là: " + words.length);

            // Tìm số lần xuất hiện của một ký tự
            System.out.println("Nhập vào chữ cần tìm:");
            char a = sc.next().charAt(0);
            int dem = 0;
            for (int i = 0; i < vanban.length(); i++) {
                if (vanban.charAt(i) == a) {
                    dem++;
                }
            }
            System.out.println("Số lần xuất hiện của ký tự '" + a + "' là: " + dem);
        }
    }
}
