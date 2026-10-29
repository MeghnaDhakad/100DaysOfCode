import java.util.*;
public class two_sum_1 {

    public static int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        int[] ans = new int[2];

        for (int i = 0; i < n - 1; i++) {

            for (int j = 1; j < n; j++) {

                if ((nums[i] + nums[j]) == target && i != j) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter values of array:");
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("enter target value:");
        int target = sc.nextInt();

        int[] result = twoSum(nums, target);

        System.out.println(Arrays.toString(result));
        sc.close();
    }
}
