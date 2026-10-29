// 26 Sept 2026
//try again with diff method

import java.util.*;

public class Leetcode485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i = 0;i<n;i++){
            if(nums[i] == 1){
                count += 1;
            }
            list.add(count);
            if(nums[i] == 0){
                count = 0;
            }
        }
        return Collections.max(list);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array:");
        int n = sc.nextInt();
        System.out.println("enter elements of array:");
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        Leetcode485 obj = new Leetcode485();
        System.out.println(obj.findMaxConsecutiveOnes(nums));
        sc.close();
    }
}
