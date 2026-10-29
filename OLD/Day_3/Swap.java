/*
Q6: Write a program to swap two numbers using a third variable.

Sample Test Cases:
Input 1:
3 5
Output 1:
After swap: 5 3

Input 2:
-1 1
Output 2:
After swap: 1 -1

*/
// 14 Sept 2026
package Day_3;
import java.util.*;
public class Swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Swaped : " + b +" " + a);
        sc.close();
    }
}
