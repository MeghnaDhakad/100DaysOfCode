/*Q37: Write a program to find the LCM of two numbers.

Sample Test Cases:
Input 1:
4 5
Output 1:
20

Input 2:
7 3
Output 2:
21

*/
//30 Sept 2026
//used ai- try again
package Day_19;
import java.util.*;

public class FindLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int sum = 0;

        number = Math.abs(number);

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println(sum);

        sc.close();
    }
}
