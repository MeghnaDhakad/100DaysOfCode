/*Q33: Write a program to check if a number is an Armstrong number.

Armstrong number is a number that equals the sum of its own digits, where each digit is raised to the power of the total number of digits

Sample Test Cases:
Input 1:
153
Output 1:
Armstrong

Input 2:
123
Output 2:
Not Armstrong

*/
//28 Sept 2026
import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int a = sc.nextInt();
        int c = a;
        int n = (int) Math.log10(a) + 1; //calculate length of integer
        int ans = 0;
        while(a != 0){
            int b = a % 10;
            ans += ((int) Math.pow(b, n)); //means b^n
            a = a/10;
        }
        if(ans == c){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
        sc.close();
    }
}
