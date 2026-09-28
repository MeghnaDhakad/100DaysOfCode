/*Q34: Write a program to check if a number is prime.

Sample Test Cases:
Input 1:
7
Output 1:
Prime

Input 2:
10
Output 2:
Not prime

*/
//28 Sept 2026
import java.util.*;

public class PrimeNumber {
    public String PnP(int n){
        if(n<=1){
            return ("Not prime.");
        }
        else{
            for(int i = 2;i<n;i++){
                if( n % i == 0){
                    return ("Not prime.");
                }
                else{
                    continue;
                }
            }
        }
        return ("Prime");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        PrimeNumber obj = new PrimeNumber();
        System.out.println(obj.PnP(n));
        sc.close();
    }
}
