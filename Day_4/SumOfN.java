/*Q8: Write a program to find and display the sum of the first n natural numbers.

Sample Test Cases:
Input 1:
5
Output 1:
Sum=15

Input 2:
10
Output 2:
Sum=55

*/

//15 Sept 2026
package Day_4;
import java.util.*;

public class SumOfN {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter value of n : ");
        int n = sc.nextInt();
        int summ = 0;
        for (int i = 1;i<=n;i++){
            summ += i;
        }
        System.out.println("Sum = " + summ);
        sc.close();
    }
}
