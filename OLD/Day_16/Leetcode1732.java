//27 Sept 2026

package Day_16;
import java.util.*;

public class Leetcode1732 {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] al = new int[n+1];
        for(int i = 0;i<=n;i++){
            if(i == 0){
                al[i] = 0;
            }
            else{
                al[i] = gain[i-1] + al[i-1];
            }
        }
        int high = 0;
        for(int i = 0;i<=n;i++){
            if(al[i] > high){
                high = al[i];
            }
        }
        return high;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of gains:");
        int n = sc.nextInt();
        System.out.println("enter " + n + " gains:");
        int[] gain = new int[n];
        for(int i = 0;i<n;i++){
            gain[i] = sc.nextInt();
        }
        Leetcode1732 obj = new Leetcode1732();
        System.out.println(obj.largestAltitude(gain));
        sc.close();
    }
}
