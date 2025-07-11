// Lớp Rectangle
public class Bai1 { // Định nghĩa lớp Bai1 (biểu diễn hình chữ nhật)

    // Thuộc tính (biến thành viên)
    private double length; // Chiều dài (chỉ lớp này truy cập được)
    private double width;  // Chiều rộng

    // Constructor mặc định (không tham số)
    public Bai1() {
        this.length = 1; // Gán mặc định chiều dài = 1
        this.width = 1;  // Gán mặc định chiều rộng = 1
    }

    // Constructor có tham số (dùng để tạo hình chữ nhật với kích thước cụ thể)
    public Bai1(double length, double width) {
        this.length = length; // Gán giá trị tham số cho chiều dài
        this.width = width;   // Gán giá trị tham số cho chiều rộng
    }

    // Phương thức tính diện tích
    public double getArea() {
        return length * width; // Diện tích = chiều dài * chiều rộng
    }

    // Phương thức tính chu vi
    public double getPerimeter() {
        return 2 * (length + width); // Chu vi = 2*(chiều dài + chiều rộng)
    }

    // Phương thức hiển thị thông tin hình chữ nhật
    public void display() {
        System.out.println("Chiều dài: " + length);
        System.out.println("Chiều rộng: " + width);
        System.out.println("Diện tích: " + getArea());       // Gọi phương thức getArea() để tính diện tích
        System.out.println("Chu vi: " + getPerimeter());     // Gọi phương thức getPerimeter() để tính chu vi
        System.out.println(); // In thêm dòng trống cho dễ nhìn
    }
}
