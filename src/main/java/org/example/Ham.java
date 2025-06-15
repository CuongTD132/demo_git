package org.example;

public class Ham {
    //hàm thực hiện logic(ko trả giá trị)
    //static void ham(){}
    static void greeting(){
        System.out.println("hihi");
    }
    //hàm có giá trị trả về
    //static <kiểu dữ liệu> ham(){}
    static double avg(double math, double ly, double science){

        return (ly + science + math)/3;
    }
    public static void main(String[] args) {

        greeting();
        double ly = 7, hoa = 8, toan = 9;
        double dtb = avg(hoa,ly,toan);
        System.out.println(dtb);

    }
}
