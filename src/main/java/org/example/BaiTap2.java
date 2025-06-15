package org.example;

import java.util.Scanner;

public class BaiTap2 {
    static double salary(int date, double salaryPerDay){
        return date*salaryPerDay;
    }
    static double avg(double toan, double ly, double hoa){
        return (toan+ly+hoa)/3;
    }

    static void ranking(double avg){
        if (avg <= 5 ){
            System.out.println("Hs yếu với điểm trung bình là: " + avg);
        } else if (avg < 6) {
            System.out.println("Hs trung bình với điểm trung bình là: " + avg);
        } else if (avg < 7) {
            System.out.println("Hs khá với điểm trung bình là: " + avg);
        } else if (avg < 8) {
            System.out.println("Hs giỏi với điểm trung bình là: " + avg);
        }else {
            System.out.println("HS xuất sắc với điểm trung bình là: " + avg);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập điểm toán: ");
        double toan = scanner.nextDouble();
        System.out.println("Nhập điểm lý: ");
        double ly = scanner.nextDouble();
        System.out.println("Nhập điểm hóa: ");
        double hoa = scanner.nextDouble();
        double avg = avg(toan,ly,hoa);
        ranking(avg);
//        System.out.println("Nhập số ngày làm: ");
//        int date = scanner.nextInt();
//        System.out.println("Nhập tiền lương trong 1 ngày: ");
//        double salaryPerDay = scanner.nextDouble();
//        double totalSalary = salary(date,salaryPerDay);
//        System.out.println("Tháng này bạn nhận được: " + totalSalary+ "vnd");
    }
}
