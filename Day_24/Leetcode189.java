package Day_24;

import java.util.Scanner;

public class Leetcode189 {
    public void rotate(int[] nums, int k) {
        System.gc();
        int n = nums.length;
        k = k % n;

        int[] ans = new int[n];
        for(int i = 0;i<n;i++){
            int m = (i + k) % n;
            ans[m] = nums[i];
        }

        for(int i = 0; i<n;i++){
            nums[i] = ans[i];
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of k");
        int k = sc.nextInt();
        System.out.println("enter length of array:");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.println("enter elements of array:");
        for(int i = 0;i<n;i++){
            prices[i] = sc.nextInt();
        }
        Leetcode189 obj = new Leetcode189();
        obj.rotate(prices,k);
        System.out.println(prices);
        sc.close();
    }
}
