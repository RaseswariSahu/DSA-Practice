package com.practice.DSA;

public class SelectionSort {
    public static void main(String[] args){
        int nums[]={1,4,8,3,7,2,9,5,10,6,0};
        int temp=0;
        int minIndex=-1;

        System.out.println("Before Shorting: ");
        for(int n :nums){
            System.out.print(n +" ");
        }
        for (int i=0; i<nums.length-1; i++){
            minIndex=i;
            for (int j=i+1; j<nums.length; j++){
                if(nums[minIndex]>nums[j]){
                    minIndex=j;

                }
            }
            temp=nums[minIndex];
            nums[minIndex]=nums[i];
            nums[i]=temp;        }

        System.out.println("\nAfter Shorting:");
        for(int n :nums){
            System.out.print(n +" ");
        }
    }
}
