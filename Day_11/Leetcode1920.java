//22 Sept 2026
package Day_11;
import java.util.*;

public class Leetcode1920 {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] nums2 = new int[n];
        for (int i = 0;i<n;i++){
            nums2[i] = nums[nums[i]];
        }
        return nums2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array:");
        int m = sc.nextInt();
        System.out.println("enter elements of array:");
        int[] nums = new int[m];
        for (int i = 0;i<m;i++){
            nums[i] = sc.nextInt();
        }
        Leetcode1920 obj = new Leetcode1920();
        System.out.println(Arrays.toString(obj.buildArray(nums)));
        sc.close();
    }
}
