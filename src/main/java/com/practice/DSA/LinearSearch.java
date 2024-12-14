//Linear Search for Sorted Array

package com.practice.DSA;
public class LinearSearch {

    public static void main(String[] args) {
        int num[] = {1, 2, 4, 6, 8, 10};
        int target = 6;
        int result = linearsearch(num, target);
        if (result!=-1) {
            System.out.println("Target found on " + result);
        }else
            System.out.println("Target Not Found");
    }

    private static int linearsearch(int[] num, int target) {
        for (int i = 0; i <= num.length; i++) {
            if (num[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
