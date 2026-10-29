package Day_21;
import java.util.*;

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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int k = sc.nextInt();
        System.out.println("enter length of array:");
        int n = sc.nextInt();
        System.out.println("enter elements of array:");
        int[] nums = new int[n];
        for (int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        Leetcode189 obj = new Leetcode189();
        obj.rotate(nums,k);
        System.out.println(Arrays.toString(nums));
        sc.close();
    }
}
