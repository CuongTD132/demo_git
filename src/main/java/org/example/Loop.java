package org.example;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int i = 1;
//        while (i <= 5 ) {
//            i++;
//            System.out.println("hi");
//        }

//        System.out.println("Nhập số dòng muốn in: ");
//        int in = scanner.nextInt();
//        while (i <= in){
//            System.out.println("hihi");
//            i++;
//        }

        //do..while
//        giá trị ban đầu
//                do{
//                    thực hiện logic
//                            làm thay đổi first value
//                }while(điều kiện)

//        do {
//            System.out.println("giá trị i: " + i);
//            i++;
//        }while (i <= 5);
//
//        for (int j = 0; j <= 5; j++){
//            System.out.println("J value: " + j);
//        }

        System.out.println("Nhập số tùy chọn bài 1: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Số phải lơn hơn 0");
            return;
        }
        int result = 0;
        for(int i = 1; i <= n; i++){
            result += i;
        }
        System.out.println("Tổng từ 1 đến " + n + " là: " + result);

        System.out.println("Nhập số tùy chọn bài 2: ");
        int n2 = scanner.nextInt();
        if (n2 < 0) {
            System.out.println("Số phải lơn hơn 0");
            return;
        }
        int result2 = 0;
//        for(int i = 1; i <= n2; i++){
//            if (i% 2 == 0){
//                result2 += i;
//            }
//        }
        //tổng chẵn
        for(int i = 0; i <= n2; i+=2){
                result2 += i;
        }
        System.out.println("Tổng số chẵn từ 0 đến " + n2 + " là: " + result2);
        result2=0;
        //tổng lẻ
        for(int i = 1; i <= n2; i+=2){
                result2 += i;
        }
        System.out.println("Tổng số lẽ từ 0 đến " + n2 + " là: " + result2);
        result2=0;

        //tổng chia hết cho 3
        for(int i = 3; i <= n2; i+=3){
            result2 += i;
        }
        System.out.println("Tổng chia hết cho 3 từ 0 đến " + n2 + " là: " + result2);
    }
}
