//18 Sept 2026
//used ai, do again
package Day_7;
import java.util.*;
public class Leetcode121 {
    public int maxProfit(int[] prices) {

        int buy = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < buy) {
                buy = prices[i];
            } else {
                int currentProfit = prices[i] - buy;

                if (currentProfit > profit) {
                    profit = currentProfit;
                }
            }
        }

        return profit;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of days:");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.println("enter prices for " + n + " days");
        for(int i = 0;i<n;i++){
            prices[i] = sc.nextInt();
        }
        Leetcode121 obj = new Leetcode121();
        System.out.println(obj.maxProfit(prices));
        sc.close();
    }
} 
