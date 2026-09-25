/*Q28: Write a program to print the product of even numbers from 1 to n.

Sample Test Cases:
Input 1:
4
Output 1:
8 (2 * 4)

Input 2:
6
Output 2:
48 (2 * 4 * 6)

*/

//25 Sept 2026

package Day_14;
import java.util.*;

public class ProductEvenNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        int ans = 1;
        for(int i = 1;i<= n;i++){
            if(i%2 == 0){
                ans *= i;
            }
            else{
                continue;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
