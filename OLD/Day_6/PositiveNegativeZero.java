/*Q12: Write a program to input an integer and check whether it is positive, negative or zero using nested if–else.

Sample Test Cases:
Input 1:
-5
Output 1:
Negative

Input 2:
0
Output 2:
Zero

Input 3:
10
Output 3:
Positive

*/
//17 Sept 2026
package Day_6;

import java.util.*;
public class PositiveNegativeZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer:");
        int n = sc.nextInt();
        if(n>=0){
            if(n == 0){
                System.out.println("Zero");
            }
            else{
                System.out.println("Positive");
            }
        }
        else{
            System.out.println("Negative");
        }
        sc.close();
    }
}
