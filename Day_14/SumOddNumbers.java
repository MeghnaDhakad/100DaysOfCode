
/*Q27: Write a program to print the sum of the first n odd numbers.

Sample Test Cases:
Input 1:
3
Output 1:
9

Input 2:
5
Output 2:
25

*/

//25 Sept 2026

package Day_14;
import java.util.*;

public class SumOddNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        int ans = 0;
        int count = 0;
        int num = 1;
        while(count < n){
            if(num % 2 != 0){
                ans += num;
                num += 1;
                count += 1;
            }
            else{
                num += 1;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
