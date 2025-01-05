package com.practice.DSA.StriverSheet;

public class LargestElement {
    public static void largestElement(int[] nums) {
     int largest=nums[0];
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("Largest Element: " + largest);
    }
    public static void main(String[] args){
        int nums[]={1,4,8,3,7,2,9,5,10,6,0};
        largestElement(nums);


    }
}
