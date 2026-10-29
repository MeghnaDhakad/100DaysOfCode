// 26 Sept 2026
//used ai -- try again
import java.util.*;

public class Leetcode350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] ans = new int[Math.min(nums1.length, nums2.length)];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {

            if (nums1[i] == nums2[j]) {
                ans[k] = nums1[i];
                k++;
                i++;
                j++;
            }
            else if (nums1[i] < nums2[j]) {
                i++;
            }
            else {
                j++;
            }
        }

        return Arrays.copyOf(ans,k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of first array:");
        int n = sc.nextInt();
        System.out.println("enter length of second array:");
        int m = sc.nextInt();
        System.out.println("enter elements of first array:");
        int[] nums1 = new int[n];
        int[] nums2 = new int[m];
        for(int i = 0;i<n;i++){
            nums1[i] = sc.nextInt();
        }
        System.out.println("enter elemnts of second array:");
        for(int i = 0;i<m;i++){
            nums2[i] = sc.nextInt();
        }
        Leetcode350 obj = new Leetcode350();
        System.out.println(Arrays.toString(obj.intersect(nums1, nums2)));
        sc.close();
    }
}
