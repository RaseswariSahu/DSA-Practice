package com.practice.DSA;

public class BubbleSort {
    public static void main(String[] args){
        int nums[]={1,4,8,3,7,2,9,5,10,6,0};
        int temp=0;
        System.out.println("Before Shorting: ");
        for(int n :nums){
            System.out.print(n +" ");
        }
        for (int i=0; i<nums.length; i++){
            for (int j=0; j<nums.length-1; j++){
                if(nums[j]>=nums[j+1]){
                    temp=nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;

                }
            }
        }
        System.out.println("\nAfter Shorting:");
        for(int n :nums){
            System.out.print(n +" ");
        }
    }
}
