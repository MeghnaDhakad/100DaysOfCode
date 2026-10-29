//21 Sept 2026

package Day_10;
import java.util.*;

public class Leetcode88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m;i<(m+n);i++){
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of first array:");
        int m = sc.nextInt();
        System.out.println("enter length of second array:");
        int n = sc.nextInt();
        int[] nums1 = new int[m+n]; 
        System.out.println("enter values of first array:");
        for (int i = 0;i<n;i++){
            nums1[i] = sc.nextInt();
        }
        for (int i = m;i<(m+n);i++){
            nums1[i] = 0;
        }
        int[] nums2 = new int[n];
        System.out.println("enter values of second array:");
        for(int i = 0;i<n;i++){
            nums2[i] = sc.nextInt();
        }
        Leetcode88 obj = new Leetcode88();
        obj.merge(nums1, m, nums2, n); 
        System.out.println(Arrays.toString(nums1));
        sc.close();
    }
}