/*
Q41: Write a program to swap the first and last digit of a number.

Sample Test Cases:
Input 1:
1234
Output 1:
4231

Input 2:
1001
Output 2:
1001

*/
package Day_21;
import java.util.*;

public class SwapFirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = sc.nextInt();

        int original = n;
        int divisor = 1;

        while (n >= 10) {
            divisor = divisor * 10;
            n = n / 10;
        }

        int first = n;
        int last = original % 10;
        int middle = (original % divisor) / 10;

        int result = last * divisor + middle * 10 + first;

        System.out.println(result);

        sc.close();
    }
}