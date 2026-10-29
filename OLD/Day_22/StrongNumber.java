/*
Q43: Write a program to check if a number is a strong number.

Sample Test Cases:
Input 1:
145
Output 1:
Strong number

Input 2:
123
Output 2:
Not strong number

*/
package Day_22;
import java.util.*;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            int factorial = 1;
            int i = 1;

            while (i <= digit) {
                factorial = factorial * i;
                i++;
            }

            sum = sum + factorial;
            n = n / 10;
        }

        if (sum == original) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not strong number");
        }

        sc.close();
    }
}