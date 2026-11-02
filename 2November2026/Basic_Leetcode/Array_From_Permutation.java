import java.util.*;

public class Array_From_Permutation {

    public int[] buildArray(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            // int a = nums[i];
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Array_From_Permutation obj = new Array_From_Permutation();

        System.out.println("Result Array:");
        System.out.println(Arrays.toString(obj.buildArray(nums)));

        sc.close();
    }
}