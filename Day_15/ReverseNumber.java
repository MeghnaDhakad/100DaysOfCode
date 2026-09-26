/*Q30: Write a program to reverse a given number.

Sample Test Cases:
Input 1:
1234
Output 1:
4321

Input 2:
100
Output 2:
1

*/

// 26 Sept 2026

import java.util.*;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int a = sc.nextInt();
        int b = 0;
        while(a != 0){
            int c = a % 10;
            a = a/10;
            b = ((b*10)+c);
        }
        System.out.println(b);
        sc.close();
    }
}
