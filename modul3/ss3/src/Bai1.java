import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập thông tin khách hàng và sản phẩm
        System.out.print("Nhập tên khách hàng: ");
        String tenKhachHang = sc.nextLine();

        System.out.print("Nhập tên sản phẩm: ");
        String tenSanPham = sc.nextLine();

        System.out.print("Nhập giá sản phẩm: ");
        float gia = sc.nextFloat();

        System.out.print("Nhập số lượng mua: ");
        int soLuong = sc.nextInt();

        // Nhập thông tin thẻ thành viên và kiểm tra hợp lệ
        int thanhvien;
        do {
            System.out.print("Khách có thẻ thành viên không (1 = Có, 2 = Không): ");
            thanhvien = sc.nextInt();
        } while (thanhvien < 1 || thanhvien > 2);

        // Tính toán
        float thanhTien = gia * soLuong;
        float giamGia = (thanhvien == 1) ? thanhTien * 0.1f : 0;
        float vat = (thanhTien - giamGia) * 0.08f;
        float tongThanhToan = thanhTien - giamGia + vat;

        // In kết quả
        System.out.println("\n===== HÓA ĐƠN THANH TOÁN =====");
        System.out.println("Khách hàng       : " + tenKhachHang);
        System.out.println("Sản phẩm         : " + tenSanPham);
        System.out.println("Số lượng         : " + soLuong);
        System.out.printf("Đơn giá          : %.2f\n", gia);
        System.out.printf("Thành tiền       : %.2f\n", thanhTien);
        System.out.printf("Giảm giá         : %.2f\n", giamGia);
        System.out.printf("Tiền VAT (8%%)    : %.2f\n", vat);
        System.out.printf("Tổng thanh toán  : %.2f\n", tongThanhToan);
    }
}
