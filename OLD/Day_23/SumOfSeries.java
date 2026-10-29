/*
Q45: Write a program to find the sum of the series: 2/3 + 4/7 + 6/11 + 8/15 + ... up to n terms.

Sample Test Cases:
Input 1:
3
Output 1:
Approximate sum: 1.56

Input 2:
5
Output 2:
Approximate sum: 2.22

*/
package Day_23;
import java.util.*;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of terms:");
        int n = sc.nextInt();

        double sum = 0;
        int i = 1;

        while (i <= n) {
            double numerator = 2 * i;
            double denominator = (4 * i) - 1;

            sum = sum + (numerator / denominator);
            i++;
        }

        System.out.printf("Approximate sum: %.2f", sum);

        sc.close();
    }
}