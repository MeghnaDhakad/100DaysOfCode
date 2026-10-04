package Day_23;
import java.util.*;

public class Leetcode238 {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        // Store prefix products
        ans[0] = 1;

        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // Multiply by suffix products
        int suffix = 1;

        for (int i = n - 1; i >= 0; i--) {

            ans[i] = ans[i] * suffix;

            suffix = suffix * nums[i];
        }

        return ans;
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
        Leetcode238 obj = new Leetcode238();
        System.out.println(Arrays.toString(obj.productExceptSelf(nums)));
        sc.close();
    }
}
