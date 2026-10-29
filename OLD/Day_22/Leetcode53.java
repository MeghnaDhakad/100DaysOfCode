package Day_22;

import java.util.Scanner;

public class Leetcode53 {
    public int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currentSum = Math.max(nums[i], currentSum + nums[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array:");
        int n = sc.nextInt();
        System.out.println("enter elements of array:");
        int[] nums = new int[n];
        for (int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        Leetcode53 obj = new Leetcode53();
        System.out.println(obj.maxSubArray(nums));
        sc.close();
    }
}
