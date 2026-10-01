/*Q39: Write a program to find the product of odd digits of a number.

Sample Test Cases:
Input 1:
12345
Output 1:
15 (1*3*5)

Input 2:
2468
Output 2:
1 (no odd digits, assume 1)

*/
//01 Sept 2026
package Day_20;
import java.util.*;

public class ProductOfOddDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int a = sc.nextInt();
        int ans = 1;
        while(a != 0){
            int d = a%10;
            a = a/10;
            if(d % 2 == 0){
                continue;
            }
            else{
                ans *= d;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}