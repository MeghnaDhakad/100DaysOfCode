import java.util.Scanner;

public class buy_and_sell {

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }

            int profit = prices[i] - min;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter stock prices:");

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int result = maxProfit(prices);

        System.out.println("Maximum Profit = " + result);

        sc.close();
    }


    // SIMPLY WRONG APPROACH

    // for(int i = 0;i<n;i++){
    //     if(min>prices[i]){
    //         min = prices[i];
    //         buy = prices[i];
    //     }
    // }

    // for(int i = (buy+1); i<n;i++){
    //     if(max<prices[i]){
    //         max = prices[i];
    //         sell = prices[i];
    //     }
    // }


    // TIME LIMIT EXCEEDED

    // for(int i = 0;i<n;i++){
    //     for(int j = (i+1);j<n;j++){
    //         if((prices[j]-prices[i])>max){
    //             buy = prices[i];
    //             sell = prices[j];
    //         }
    //     }
    // }
}