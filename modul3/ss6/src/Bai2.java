package ss5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullName = "";
        String email = "";
        String phone = "";
        String password = "";
        do {
            System.out.println("**************QUẢN LÝ NGƯỜI DÙNG**************");
            System.out.println("1. Nhập thông tin người dùng");
            System.out.println("2. Chuẩn hóa họ tên");
            System.out.println("3. Kiểm tra email hợp lệ");
            System.out.println("4. Kiểm tra số điện thoại hợp lệ");
            System.out.println("5. Kiểm tra mật khẩu hợp lệ");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập vào họ và tên:");
                    fullName = scanner.nextLine();
                    System.out.println("Nhập vào email:");
                    email = scanner.nextLine();
                    System.out.println("Nhập vào số điện thoại:");
                    phone = scanner.nextLine();
                    System.out.println("Nhập vào mật khẩu:");
                    password = scanner.nextLine();
                    break;
                case 2:
                    //Chuẩn hóa fullName
                    //--Xóa trắng 2 đầu, mỗi từ cách nhau 1 space, ký tự đầu mỗi từ viết hoa, các ký tự sau viết thường
                    String fullNameShort = fullName.trim().replaceAll("\\s+", " ");
                    String[] arrFullName = fullNameShort.split(" ");
                    StringBuilder fullNameStandard = new StringBuilder();//empty
                    for (int i = 0; i < arrFullName.length; i++) {
                        //nGuYỄn --> Nguyễn
                        fullNameStandard.append(Character.toUpperCase(arrFullName[i].charAt(0)))
                                .append(arrFullName[i].substring(1).toLowerCase()).append(" ");
                    }
                    //Nguyễn Duy Quang
                    System.out.println("Họ và tên sau khi chuẩn hóa: " + fullNameStandard.toString().trim());
                    break;
                case 3:
                    //Kiểm tra email hợp lệ: chứa @ và . quangnd@rikkeisoft.com
                    String emailRegex = "[a-zA-Z0-9]{6,}@[a-zA-Z0-9]{3,}\\.[a-zA-Z0-9]{2,3}";
                    if (Pattern.matches(emailRegex, email)) {
                        System.out.println("Email đúng định dạng");
                    } else {
                        System.err.println("Email không đúng định dạng");
                    }
                    break;
                case 4:
                    //Kiểm tra phone là số điện thoại di động tại Việt Nam
                    String phoneRegex = "(09|03|08)[014835][\\d]{7}";
                    if (Pattern.matches(phoneRegex, phone)) {
                        System.out.println("Đúng định dạng số điện thoại di động VN");
                    } else {
                        System.err.println("Không đúng định dạng số điện thoại di động VN");
                    }
                    break;
                case 5:
                    //Kiểm tra có phải mật khẩu mạnh không
                    String passwordRegex = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^*])[a-zA-Z0-9!@#$%^*]{8,}";
                    if (Pattern.matches(passwordRegex, password)) {
                        System.out.println("Đây là mật khẩu mạnh");
                    } else {
                        System.err.println("Đây không phải là mật khẩu mạnh");
                    }
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn từ 1-6");
            }
        } while (true);
    }

}