import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Mời nhập số đầu tiên:");
        a = sc.nextInt();
        System.out.println("Mời nhập số thứ hai:");
        b = sc.nextInt();
        System.out.println("Tổng của 2 số là:" + (a+b));
        System.out.println("Hiệu của 2 số là:" + (a-b));
        System.out.println("Tích của 2 số là:" + (a*b));
        if (b!=0){
            System.out.println("Thương của 2 số là:" + ((double) a/b));
            System.out.print("Số dư của 2 số khi chia là" + (a%b));
        }
        else{
            System.out.print("không thể chia cho số 0");
        }
    }
}
