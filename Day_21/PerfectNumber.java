/*Q42: Write a program to check if a number is a perfect number.

Sample Test Cases:
Input 1:
6
Output 1:
Perfect number

Input 2:
10
Output 2:
Not perfect number

*/
package Day_21;
import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        while (i < n) {
            if (n % i == 0) {
                sum = sum + i;
            }
            i++;
        }

        if (sum == n) {
            System.out.println("Perfect number");
        } else {
            System.out.println("Not perfect number");
        }

        sc.close();
    }
}