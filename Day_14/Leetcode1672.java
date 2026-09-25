//25 Sept 2026

package Day_14;
import java.util.*;

public class Leetcode1672 {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int m = accounts[0].length;
        int high = 0;
        int[] wealth = new int[n];
        for(int i = 0;i<n;i++){
            int money = 0;
            for (int j = 0;j<m;j++){
                money += accounts[i][j];
            }
            wealth[i] = money;
        }
        for(int i = 0;i<n;i++){
            if(wealth[i] > high){
                high = wealth[i];
            }
        }
        return high;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array:");
        int n = sc.nextInt();
        System.out.println("enter length of subarray:");
        int m = sc.nextInt();
        int[][] accounts = new int[n][m];
        for(int i = 0;i<n;i++){
            System.out.println("enter " + m + " numbers for account " + (i+1) + ":");
            for(int j = 0;j<m;j++){
                accounts[i][j] = sc.nextInt();
            }
        }
        Leetcode1672 obj = new Leetcode1672();
        System.out.println(obj.maximumWealth(accounts));
        sc.close();
    }
}
