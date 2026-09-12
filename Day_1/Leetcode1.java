package Day_1;
import java.util.Arrays;
public class Leetcode1 {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
    public static void main(String[] args){
        int[] nums = {5,6,9,2,3,0};
        int target = 15;
        Leetcode1 obj = new Leetcode1();
        System.out.println(Arrays.toString(obj.twoSum(nums, target)));
    }
}
