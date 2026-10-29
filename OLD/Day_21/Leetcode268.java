package Day_21;
import java.util.*;

public class Leetcode268 {
    public int missingNumber(int[] nums) {
       int n = nums.length + 1;
       int[] full = new int[n];
       int count = 0;
       for (int i = 0;i<n;i++){
        full[i] = i;
        count = count ^ full[i];
       }
       int count2 = 0;
       for (int i = 0;i<nums.length;i++){
        count2 = count2 ^ nums[i];
       }
       int missing = count ^ count2;
       return missing;
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
        Leetcode268 obj = new Leetcode268();
        System.out.println(obj.missingNumber(nums));
        sc.close();
    }
}
