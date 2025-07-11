public class Main { // Định nghĩa lớp Main, lớp này chứa điểm bắt đầu chạy chương trình

    public static void main(String[] args) { // Phương thức main: nơi chương trình bắt đầu chạy

        // Tạo hình chữ nhật mặc định
        Bai1 hcn1 = new Bai1(); // Gọi constructor mặc định, tạo đối tượng hcn1 có chiều dài = 1, chiều rộng = 1
        hcn1.display(); // Gọi phương thức display() để in thông tin hình chữ nhật hcn1

        // Tạo hình chữ nhật với kích thước cụ thể
        Bai1 hcn2 = new Bai1(4.5, 3.0); // Gọi constructor có tham số, tạo đối tượng hcn2 có chiều dài = 4.5, chiều rộng = 3.0
        hcn2.display(); // Gọi phương thức display() để in thông tin hình chữ nhật hcn2
    } // Kết thúc phương thức main
} // Kết thúc lớp Main
