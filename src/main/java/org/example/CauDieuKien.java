package org.example;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CauDieuKien {
    public static void main(String[] args) {
//        if (2>4){
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập tuổi: ");
//        int age = scanner.nextInt();
//        if(age >= 18){
//            System.out.println("Đủ tuổi học ĐH");
//        }else {
//            System.out.println("Chưa đủ tuổi học ĐH đâu");
//        }

        //toán tử 3 ngôi -> đk  ? thực hiện logic 1 : thực hiện logic 2
//        String result = (age > 18) ? "Đủ tuổi học ĐH" : "Chưa đủ tuổi học ĐH đâu";
//        System.out.println(result);
//        int count = 0;
//        System.out.println("Điểm toán: ");
//        float math = scanner.nextFloat();
//        if(math < 0 || math > 10 ){
//            System.out.println("Điểm nhập không hợp lệ");
//            return;
//        }
//        count++;
//        System.out.println("Điểm lý: ");
//        float physics = scanner.nextFloat();
//        if(physics < 0 || physics > 10 ){
//            System.out.println("Điểm nhập không hợp lệ");
//            return;
//        }
//        count++;
//        System.out.println("Điểm hóa: ");
//        float chemical = scanner.nextFloat();
//        if(chemical < 0 || chemical > 10 ){
//            System.out.println("Điểm nhập không hợp lệ");
//            return;
//        }
//        count++;
//
//            float avg = (math + physics + chemical)/count;
////            if(avg <= 5){
////                System.out.println("Bạn là HS yếu với điểm trung bình là " + avg);
////            } else if (avg <= 6 ) {
////                System.out.println("Bạn là HS TB với điểm trung bình là " + avg);
////            }else if (avg <= 7) {
////                System.out.println("Bạn là HS khá với điểm trung bình là " + avg);
////            }else if (avg <= 8) {
////                System.out.println("Bạn là HS giỏi với điểm trung bình là " + avg);
////            }else {
////                System.out.println("Bạn là HS xuất sắc với điểm trung bình là " + avg);
////            }
//            String result = "Bạn là " +
//                    (avg <= 5 ? "HS yếu" : avg <= 6 ? "HS TB" : avg <= 7 ? "HS khá" : avg <= 8 ? "HS giỏi" : "HS xuất sắc") + " với điểm trung bình là " + avg;
//            System.out.println(result);
//        System.out.println("Nhập số điện đã sử dụng tháng vừa qua: ");
//        float electricNumber = scanner.nextFloat();
//        float bill;
//        if(electricNumber < 0 ){
//            System.out.println("Số điện bạn nhập không hợp lệ");
//            return;
//        } else if (electricNumber <= 50) {
//            bill = electricNumber * 500;
//        }else if (electricNumber <= 100) {
//            bill = 50 * 500 + (electricNumber - 50)* 650;
//        }else if (electricNumber <= 200) {
//            bill = 50 * 500 + 50*650 + (electricNumber - 100)* 850;
//        }else if (electricNumber <= 350) {
//            bill = 50 * 500 + 50*650 + 100*850 + (electricNumber - 200)* 1100;
//        }else {
//            bill = 50 * 500 + 50 * 650 + 100 * 850 + 150 * 1100 + (electricNumber - 350) * 1300;
//        }
//        NumberFormat nf = NumberFormat.getInstance(Locale.UK);
//        System.out.println("Tiền điện bạn cần đóng là " + nf.format(bill) +" vnd");


        int a= 15;
        switch (a){
            case 10:
                System.out.println("số 10");
                break;
            case 15:
                System.out.println("số 15");
                break;
            default:
                System.out.println("vui lòng check lại");
        }
    }
}
