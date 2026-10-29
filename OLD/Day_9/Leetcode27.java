//20 Sept 2026
//used ai, try again
package Day_9;
import java.util.*;

public class Leetcode27 {
    public int removeElement(int[] nums, int val) {
        // 'count' acts as our Builder. It tracks the index where the next safe number should go.
        int count = 0;
        int n = nums.length;

        // 'i' acts as our Explorer. It checks every single number in the array.
        for (int i = 0; i < n; i++) {
            
            // If the current number is NOT the value we want to remove, it is safe to keep.
            if (nums[i] != val) {
                
                // Place the safe number at the front of the array where the Builder is standing.
                // (This safely overwrites any "bad" numbers that used to be there).
                nums[count] = nums[i];
                
                // Move the Builder forward by one step to prepare for the next safe number.
                count++;
            }
        }

        // Return the final count, which represents the length of the clean, updated array.
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array:");
        int n = sc.nextInt();
        System.out.println("enter " + n + " elements:");
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("enter a number:");
        int val = sc.nextInt();
        Leetcode27 obj = new Leetcode27();
        System.out.println(obj.removeElement(nums,val));
        sc.close();
    }
}
