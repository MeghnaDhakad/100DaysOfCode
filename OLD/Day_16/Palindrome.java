/*Q32: Write a program to check if a number is a palindrome.

Sample Test Cases:
Input 1:
121
Output 1:
Palindrome

Input 2:
123
Output 2:
Not palindrome

*/
//27 Sept 2026

package Day_16;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int a = sc.nextInt();
        int d = a;
        int b = 0;
        while(a != 0){
            int c = a % 10;
            a = a/10;
            b = ((b*10)+c);
        }
        if(d == b){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
