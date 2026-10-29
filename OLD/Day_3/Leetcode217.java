//14 Sept 2026

package Day_3;
import java.util.*;
class Leetcode217{
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0;i<n-1;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
    return false;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,1}; 
        Leetcode217 obj = new Leetcode217();
        System.out.println(obj.containsDuplicate(nums));
    }
}