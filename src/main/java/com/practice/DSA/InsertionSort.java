//Insertion Sort
package com.practice.DSA;

public class InsertionSort {
    public static void main(String[] args){
        int nums[]={1,4,8,3,7,2,9,5,10,6,0};

        System.out.println("Before Shorting: ");
        for(int n :nums){
            System.out.print(n +" ");
        }
        for (int i=1; i<nums.length; i++){
            int key=nums[i];
            int j=i-1;
            while (j>=0 && nums[j]>key){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
        }

        System.out.println("\nAfter Shorting:");
        for(int n :nums){
            System.out.print(n +" ");
        }
    }
}
