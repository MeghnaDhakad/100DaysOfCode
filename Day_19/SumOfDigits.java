/*Q38: Write a program to find the sum of digits of a number.

Sample Test Cases:
Input 1:
123
Output 1:
6

Input 2:
999
Output 2:
27

*/
//30 Sept 2026
// used ai - try again
package Day_19;
import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int lcm = Math.abs(a * b);

        for (int i = 1; i <= lcm; i++) {
            if (i % a == 0 && i % b == 0) {
                lcm = i;
                break;
            }
        }

        System.out.println(lcm);

        sc.close();
    }
}
