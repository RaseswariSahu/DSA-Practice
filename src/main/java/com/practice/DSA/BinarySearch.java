//Binary Search for Sorted Array
package com.practice.DSA;

public class BinarySearch {
    public static void main(String[] args){
        int num[] = {1, 2, 4, 6, 8, 10};
        int target = 6;
        int left = 0;
        int right = num.length - 1;
        int result = binarysearch(num, target,left,right);
        if (result!=-1) {
            System.out.println("Target found on " + result);
        }else
            System.out.println("Target Not Found");
    }

    private static int binarysearch(int[] num, int target,int left,int right) {
        int mid = 0;
//        while (left <= right) {
//            mid = (left + right) / 2;
//            if (num[mid] == target) {
//                return mid;
//            } else if (num[mid] >= target) {
//                right = mid - 1;
//            } else
//                left = mid + 1;
//        }
        if (left <= right) {
            mid = (left + right) / 2;
            if (num[mid] == target) {
                return mid;
            } else if (num[mid] <= target) {
              return binarysearch(num,target,mid+1,right);
            } else
                return binarysearch(num,target,left,mid-1);
        }
        return -1;
    }

}
