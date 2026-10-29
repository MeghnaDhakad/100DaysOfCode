package Day_22;

import java.util.Scanner;

public class Leetcode136 {
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }

        return result;
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
        Leetcode136 obj = new Leetcode136();
        System.out.println(obj.singleNumber(nums));
        sc.close();
    }
}
