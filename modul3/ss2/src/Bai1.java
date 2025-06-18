import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Mời bạn nhập số:");
        a = sc.nextInt();
        if (a%2==0){
            System.out.println("Số vừa nhập là số chẵn:");
        }else {
            System.out.println("Số vừa nhập là số lẻ:");
        }
    }
}
