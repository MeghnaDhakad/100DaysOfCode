//29 Sept 2026
// used ai - try again
package Day_18;
import java.util.*;

public class Leetcode26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int insertIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }

        return insertIndex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter length of array:");
        int n = sc.nextInt();
        System.out.println("enter elemnts of array:");
        int[] nums = new int[n];
        for(int i =0 ;i <n;i++){
            nums[i] = sc.nextInt();
        }
        Leetcode26 obj = new Leetcode26();
        System.out.println(obj.removeDuplicates(nums));
        sc.close();
    }
}
