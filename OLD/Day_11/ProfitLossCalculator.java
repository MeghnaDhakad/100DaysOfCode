/*Q22: Write a program to find profit or loss percentage given cost price and selling price.

Sample Test Cases:
Input 1:
1000 1200
Output 1:
Profit 20%

Input 2:
1000 800
Output 2:
Loss 20%

Input 3:
1000 1000
Output 3:
No Profit No Loss
*/

//22 Sept 2026

package Day_11;
import java.util.*;

public class ProfitLossCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cost price and selling price:");
        int buy = sc.nextInt();
        int sell = sc.nextInt();
        int ans = 0;
        if (buy == sell){
            System.out.println("No Profit No Loss");
        }
        else if(buy>sell){
            //ans = ((sell - buy)/buy)*100; -- DIVISION TRAP
            ans = ((buy - sell) * 100) / buy;
            System.out.printf("Profit %d %%",ans);
        }
        else{
            //ans = ((buy - sell)/sell)*100;
            ans = ((sell - buy) * 100) / buy;
            System.out.printf("Loss %d %%",ans);
        }
        sc.close();
    }
}
