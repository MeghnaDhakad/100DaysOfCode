//19 Sept 2026

package Day_8;
import java.util.*;

class gfg_MissingInArray{
    public int missingNum(int[] arr) {
        int ans = arr.length + 1;

        for (int i = 0; i < arr.length; i++) {
            ans ^= (i + 1);
            ans ^= arr[i];
        }

        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + " numbers:");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        gfg_MissingInArray obj = new gfg_MissingInArray();
        System.out.println(obj.missingNum(arr));
        sc.close();
    }
}