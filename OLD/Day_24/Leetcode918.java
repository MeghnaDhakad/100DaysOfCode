package Day_24;

import java.util.*;

class Leetcode918{
    public int maxSubarraySumCircular(int[] nums) {

        int totalSum = 0;

        int currentMax = nums[0];
        int maxSum = nums[0];

        int currentMin = nums[0];
        int minSum = nums[0];

        for (int i = 0; i < nums.length; i++) {

            totalSum += nums[i];

            if (i > 0) {
                currentMax = Math.max(nums[i], currentMax + nums[i]);
                maxSum = Math.max(maxSum, currentMax);

                currentMin = Math.min(nums[i], currentMin + nums[i]);
                minSum = Math.min(minSum, currentMin);
            }
        }

        // If every element is negative
        if (maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum, totalSum - minSum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array:");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.println("enter elements of array:");
        for(int i = 0;i<n;i++){
            prices[i] = sc.nextInt();
        }
        Leetcode918 obj = new Leetcode918();
        System.out.println(obj.maxSubarraySumCircular(prices));
        sc.close();
    }
}