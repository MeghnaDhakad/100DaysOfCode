/*Q36: Write a program to find the HCF (GCD) of two numbers.

Sample Test Cases:
Input 1:
12 18
Output 1:
6

Input 2:
7 9
Output 2:
1

*/
//29 Sept 2026
package Day_18;
import java.util.*;

public class FindHCF {
    public int HCF(int n,int m){
        if(m>n){
            for(int i = n;i>=1;i--){
                if(m%i == 0 && n% i == 0){
                    return i;
                }
            }
        }
        else{
            for(int i = m;i>=1;i--){
                if(m%i == 0 && n% i == 0){
                    return i;
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        FindHCF obj = new FindHCF();
        System.out.println(obj.HCF(n,m));
    }
}
