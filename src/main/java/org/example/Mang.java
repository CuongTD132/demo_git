package org.example;

public class Mang {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40};
        String[] name = {"An", "Bi", "Vi"};
        //for-each - chỉ dùng trong mảng
        for (int num: nums){
            System.out.println(num);
        }
        //reverse
        for(int i = nums.length - 1; i >= 0; i--){
            System.out.println(nums[i]);
        }
    }
}
