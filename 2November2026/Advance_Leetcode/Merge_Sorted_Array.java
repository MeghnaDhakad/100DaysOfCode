import java.util.*;

public class Merge_Sorted_Array {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int a = 0;

        for (int i = m; i < (m + n); i++) {
            nums1[i] = nums2[a];
            a++;
        }

        Arrays.sort(nums1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter m: ");
        int m = sc.nextInt();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums1 = new int[m + n];
        int[] nums2 = new int[n];

        System.out.println("Enter " + m + " elements of nums1:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter " + n + " elements of nums2:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        merge(nums1, m, nums2, n);

        System.out.println("Merged Sorted Array:");

        for (int i = 0; i < (m + n); i++) {
            System.out.print(nums1[i] + " ");
        }

        sc.close();
    }
}