import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;      //1 ngày trong tuần
        System.out.println("Mời nhập vào 1 ngày trong tuần:");
        a = sc.nextInt();
        if (a < 0 || a>7) {
            System.out.println("Không có ngày như vậy trong tuần");
        }else if (a == 1){
            System.out.println("1: chủ nhật");
        } else if (a == 1){
            System.out.println("2: thứ hai");
        }else if (a == 1){
            System.out.println("3: thứ ba");
        }else if (a == 1){
            System.out.println("4: thứ tư");
        }else if (a == 1){
            System.out.println("5: thứ năm");
        }else if (a == 1){
            System.out.println("6: thứ sáu");
        }else{
            System.out.println("7: thứ bảy");
        }
    }
}