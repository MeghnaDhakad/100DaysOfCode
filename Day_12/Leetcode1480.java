//23 Sept 2026
package Day_12;
import java.util.*;

class Leetcode1480{
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] nums2 = new int[n];

        for(int i = 0;i<n;i++){
            if(i == 0){
                nums2[i] = nums[i];
            }
            else{
                nums2[i] = nums[i] + nums2[i-1];
            }
        }
        return nums2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter elements of array:");
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        Leetcode1480 obj = new Leetcode1480();
        System.out.println(Arrays.toString(obj.runningSum(nums)));
        sc.close();
    }
}