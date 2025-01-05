package com.practice.DSA.StriverSheet;

public class SecondLargest {
//   public static void secondLargest(int[] nums){
//       int largest=nums[0];
//       for(int n:nums){
//           if(n>largest){
//               largest=n;
//           }
//       }
//       int n=nums.length;
//       int secondLargestNum=nums[1];
//       for(int i=n-2;i>0;i--){
//           if(nums[i]!=largest){
//               secondLargestNum=nums[i];
//               break;
//           }
//       }
//       System.out.println("Second Largest Num: " + secondLargestNum);
//   }
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
    public static void main(String[] args) {
        int nums[]={3,4,7,1,7,8,9,0};
        secondLargest(nums);
    }
}
