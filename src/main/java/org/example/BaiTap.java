package org.example;

import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //tính lương, nhập tên, tổng số ngày làm
//        System.out.println("Nhập tên: ");
//        String name = scanner.nextLine();
//        System.out.println("Nhập lương 1 ngày: ");
//        float salary = scanner.nextFloat();
//        System.out.println("Nhập số ngày làm việc: ");
//        int workingDate = scanner.nextInt();
//        float totalSalary = salary * workingDate;
//        System.out.println("Bạn " + name + " tháng này được nhận " + totalSalary + " vnd");

        System.out.println("Nhập điểm toán: ");
        float math = scanner.nextFloat();
        System.out.println("Nhập điểm lý: ");
        float physics = scanner.nextFloat();
        System.out.println("Nhập điểm hóa: ");
        float chemical = scanner.nextFloat();
        float avgPoint = (math + physics + chemical)/3;
        System.out.println("Điểm trung bình là " + avgPoint + " điểm ");
    }
}
