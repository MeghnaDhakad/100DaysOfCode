//24 Sept 2026

package Day_13;
import java.util.*;

public class Leetcode1295 {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0;i<n;i++){
            if(String.valueOf(Math.abs(nums[i])).length()%2 == 0){
                count += 1;
            }
            else{
                continue;
            }
        }
        return count;
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
        Leetcode1295 obj = new Leetcode1295();
        System.out.println(obj.findNumbers(nums));
        sc.close();
    }
}
