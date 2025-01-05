package com.practice.DSA.StriverSheet;

public class SecondLargestSecondSmallest {
public static void secondLargest(int[] nums){
    int largest=nums[0];
    int secondLargestNum=nums[0];
    for(int n:nums){
        if(n>largest){
            secondLargestNum=largest;//add as secondLargest
            largest=n;//add as largest
        } else if (n > secondLargestNum && n != largest) {
            secondLargestNum = n; // Update second largest if it's smaller than largest but larger than current secondLargest
        }
    }


    System.out.println("Second Largest Num: " + secondLargestNum);
}
public static void secondSmallest(int[] nums){
    int smallest=nums[0];
    int secondSmallest=Integer.MIN_VALUE;
    for(int n:nums){
        if(n<smallest){
            secondSmallest=n;
            smallest=n;
        }
    }

}
    public static void main(String[] args) {
        int nums[]={3,4,7,1,7,8,9,0};
        secondLargest(nums);
        secondSmallest(nums);
    }
}
