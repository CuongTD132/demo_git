package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//    System.out.println("Hello bae");

//    Lệnh nhập
        Scanner scanner = new Scanner(System.in);

        // Biến - nơi lưu trữ data
        //primative value: int, boolean, double
        //tham chiếu value: string array, class, object, interface

        double salary = 1111.12;

        //hằng số - value ko đổi
        final double pi = 3.14332;
        //sout
//        System.out.println("Nhập tên người dùng: ");
//        String name = scanner.nextLine();
//        System.out.println("Xin chào " + name);

        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập lớp: ");
        String classRoom = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        System.out.println("Bạn là " + name + " " + age + " tuổi, hiện học lớp " + classRoom);
    }
}