//28 Sept 2026
package Day_17;
import java.util.*;

public class Leetcode27 {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int count = 0;
        for(int i =0;i<n;i++){
            if(nums[i] != val){
                nums[count] = nums[i]; 
                count ++;
            }
        }
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
