import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Float> luongNhanVien = new ArrayList<>();
        int luaChon;

        do {
            System.out.println("\n***************MENU NHẬP LƯƠNG***************");
            System.out.println("1. Nhập lương nhân viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Tính tổng số tiền thưởng cho nhân viên");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            luaChon = sc.nextInt();

            switch (luaChon) {
                case 1:
                    // Nhập lương nhân viên
                    float luong;
                    do {
                        System.out.print("Nhập lương nhân viên (nhập -1 để kết thúc): ");
                        luong = sc.nextFloat();

                        if (luong == -1) break;

                        if (luong < 0 || luong > 500_000_000) {
                            System.out.println("Lương không hợp lệ! (0–500 triệu)");
                        } else {
                            luongNhanVien.add(luong);

                            // Phân loại
                            if (luong < 5_000_000) {
                                System.out.println("→ Thu nhập thấp");
                            } else if (luong < 15_000_000) {
                                System.out.println("→ Thu nhập trung bình");
                            } else if (luong <= 50_000_000) {
                                System.out.println("→ Thu nhập khá");
                            } else {
                                System.out.println("→ Thu nhập cao");
                            }
                        }
                    } while (luong != -1);
                    break;

                case 2:
                    // Thống kê
                    if (luongNhanVien.isEmpty()) {
                        System.out.println("→ Chưa có dữ liệu");
                    } else {
                        int tongNV = luongNhanVien.size();
                        float tongLuong = 0;
                        float max = luongNhanVien.get(0);
                        float min = luongNhanVien.get(0);

                        for (float l : luongNhanVien) {
                            tongLuong += l;
                            if (l > max) max = l;
                            if (l < min) min = l;
                        }

                        float trungBinh = tongLuong / tongNV;

                        System.out.println("Số nhân viên đã nhập: " + tongNV);
                        System.out.printf("Lương trung bình: %.2f\n", trungBinh);
                        System.out.printf("Lương cao nhất: %.2f\n", max);
                        System.out.printf("Lương thấp nhất: %.2f\n", min);
                        System.out.printf("Tổng tiền lương: %.2f\n", tongLuong);
                    }
                    break;

                case 3:
                    // Tính tiền thưởng
                    if (luongNhanVien.isEmpty()) {
                        System.out.println("→ Chưa có dữ liệu");
                    } else {
                        float tongThuong = 0;
                        for (float l : luongNhanVien) {
                            float thuong = 0;
                            if (l < 5_000_000) {
                                thuong = l * 0.05f;
                            } else if (l < 15_000_000) {
                                thuong = l * 0.10f;
                            } else if (l < 50_000_000) {
                                thuong = l * 0.15f;
                            } else if (l <= 100_000_000) {
                                thuong = l * 0.20f;
                            } else {
                                thuong = l * 0.25f;
                            }
                            tongThuong += thuong;
                        }
                        System.out.printf("Tổng số tiền thưởng cho nhân viên: %.2f\n", tongThuong);
                    }
                    break;

                case 4:
                    System.out.println("→ Đã thoát chương trình.");
                    break;

                default:
                    System.out.println("→ Lựa chọn không hợp lệ! Vui lòng chọn lại.");
            }

        } while (luaChon != 4);
    }
}
