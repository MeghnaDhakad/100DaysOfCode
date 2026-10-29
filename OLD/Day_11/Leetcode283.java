//22 Sept 2026
//used ai, try again
package Day_11;
import java.util.*;

public class Leetcode283 {
    public void moveZeroes(int[] nums) {
        // 'count' is our Builder. It tracks the exact index where the next non-zero number belongs.
        int count = 0;
        
        // Phase 1: The Gathering
        // 'i' is our Explorer. It checks every single number in the array.
        for (int i = 0; i < nums.length; i++) {
            
            // If we find a number that is NOT zero, it is safe to keep.
            if (nums[i] != 0) {
                // Place it at the front of the array where the Builder is standing.
                nums[count] = nums[i];
                
                // Move the Builder forward by one step to prepare for the next non-zero number.
                count++;
            }
        }
        
        // Phase 2: The Cleanup
        // The Builder is now standing exactly where the zeros need to start.
        // We run a new loop starting from 'count' and going to the very end of the array.
        for (int i = count; i < nums.length; i++) {
            
            // Overwrite any leftover garbage numbers with 0.
            nums[i] = 0;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array:");
        int n = sc.nextInt();
        System.out.println("enter elements of array:");
        int[] nums = new int[n];
        for (int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        Leetcode283 obj = new Leetcode283();
        obj.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
        sc.close();
    }
}
