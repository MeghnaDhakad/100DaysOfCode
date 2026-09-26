/*Q29: Write a program to calculate the factorial of a number.

Sample Test Cases:
Input 1:
5
Output 1:
120

Input 2:
3
Output 2:
6

*/

// 26 Sept 2026
import java.util.*;

public class CalculateFactorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        int ans = 1;
        for(int i = 1;i<=n;i++){
            ans *= i;
        }
        System.out.println(ans);
        sc.close();
    }
}
