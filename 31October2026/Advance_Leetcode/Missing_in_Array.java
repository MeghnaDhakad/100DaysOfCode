import java.util.*;

public class Missing_in_Array {
    public static int missingNum(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] != (i + 1)) {
                return (i + 1);
            }
        }
        // If all numbers 1 to n are present,
        // then the missing number is n + 1
        return (n + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = missingNum(arr);
        System.out.println("Missing Number = " + result);
        sc.close();
    }
}