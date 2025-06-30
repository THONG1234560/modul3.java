package ss4;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Khai báo mảng điểm sinh viên
        float[] scores = new float[100];
        int currentIndex = 0;
        do {
            System.out.println("*********QUẢN LÝ ĐIỂM SV*****************");
            System.out.println("1. Nhập danh sách điểm sinh viên");
            System.out.println("2. In danh sách điểm");
            System.out.println("3. Tính điểm trung bình sinh viên");
            System.out.println("4. Tìm điểm cao nhất và thấp nhất");
            System.out.println("5. Đếm số lượng sinh viên đạt và trượt");
            System.out.println("6. Sắp xếp điểm tăng dần");
            System.out.println("7. Thống kê số lượng sinh viên giỏi và xuất sắc");
            System.out.println("8. Thoát");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập vào số điểm sinh viên cần nhập:");
                    int cntStudents = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < cntStudents; i++) {
                        System.out.printf("Nhập vào điểm sinh viên thứ %d: ", (i + 1));
                        scores[currentIndex] = Float.parseFloat(scanner.nextLine());
                        currentIndex++;
                    }
                    break;
                case 2:
                    System.out.println("Danh sách điểm sinh viên:");
                    for (int i = 0; i < currentIndex; i++) {
                        System.out.printf("%.1f\t", scores[i]);
                    }
                    System.out.printf("\n");
                    break;
                case 3:
                    //Tính tổng điểm sinh viên
                    float sumScores = 0;
                    for (int i = 0; i < currentIndex; i++) {
                        sumScores += scores[i];
                    }
                    System.out.printf("Điểm trung bình sinh viên là: %.1f\n", sumScores / currentIndex);
                    break;
                case 4:
                    float maxScore = scores[0];
                    float minScore = scores[0];
                    for (int i = 1; i < currentIndex; i++) {
                        if (maxScore < scores[i]) {
                            maxScore = scores[i];
                        }
                        if (minScore > scores[i]) {
                            minScore = scores[i];
                        }
                    }
                    System.out.printf("Điểm lớn nhất: %.1f - Điểm nhỏ nhất: %.1f\n", maxScore, minScore);
                    break;
                case 5:
                    int cntStudentPass = 0;
                    int cntStudentFail = 0;
                    for (int i = 0; i < currentIndex; i++) {
                        if (scores[i] < 5) {
                            cntStudentFail++;
                        } else {
                            cntStudentPass++;
                        }
                    }
                    System.out.printf("Số sinh viên trượt: %d - Số sinh viên Pass: %d\n", cntStudentFail, cntStudentPass);
                    break;
                case 6:
                    //Exchange sort
                    for (int i = 0; i < currentIndex - 1; i++) {
                        for (int j = i + 1; j < currentIndex; j++) {
                            if (scores[i] > scores[j]) {
                                float temp = scores[i];
                                scores[i] = scores[j];
                                scores[j] = temp;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp xong điểm sinh viên tăng dần");
                    break;
                case 7:
                    int cntStudentGood = 0;
                    for (int i = 0; i < currentIndex; i++) {
                        if (scores[i] >= 8) {
                            cntStudentGood++;
                        }
                    }
                    System.out.printf("Số lượng sinh viên giỏi và xuất sắc là: %d\n", cntStudentGood);
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn từ 1-8");
            }
        } while (true);
    }
}