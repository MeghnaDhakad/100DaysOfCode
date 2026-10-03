/*
Q44: Write a program to find the sum of the series: 1 + 3/4 + 5/6 + 7/8 + … up to n terms.

Sample Test Cases:
Input 1:
3
Output 1:
Approximate sum: 3.3

Input 2:
5
Output 2:
Approximate sum: 4.4

*/
package Day_22;
import java.util.*;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of terms:");
        int n = sc.nextInt();

        double sum = 1;
        int i = 2;

        while (i <= n) {
            double numerator = (2 * i) - 1;
            double denominator = 2 * i;

            sum = sum + (numerator / denominator);
            i++;
        }

        System.out.printf("Approximate sum: %.1f", sum);

        sc.close();
    }
}