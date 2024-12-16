package com.practice.DSA;

import java.util.Arrays;

public class QuickSort {
    public static void quickSortFun(int[] nums,int min,int max) {
        if (min<max){
            int pi=partition(nums,min,max);
            quickSortFun(nums,min,pi-1);
            quickSortFun(nums,pi+1,max);
        }

    }

    private static int partition(int[] nums, int min, int max) {
        int pivot=nums[max];
        int i=min-1;
        for (int j=min;j<max;j++) {
            if (nums[j]>pivot){
                i++;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }

        }
        int temp=nums[i+1];
        nums[i+1]=nums[max];
        nums[max]=temp;
    return i+1;
    }


    ;
    public static void main(String[] args){
        int nums[]={1,4,8,3,7,2,9,5,10,6,0};

        System.out.println("Before Shorting: ");
        quickSortFun(nums,0,nums.length-1);
        System.out.println("\nAfter Shorting:");
        for(int n :nums){
            System.out.print(n +" ");
        }
    }
}
