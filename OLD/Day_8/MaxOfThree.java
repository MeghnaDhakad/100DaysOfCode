/*Q16: Write a program to input three numbers and find the largest among them using if–else.

Sample Test Cases:
Input 1:
3 7 5
Output 1:
Largest is 7

Input 2:
-1 -5 0
Output 2:
Largest is 0

*/
//19 Sept 2026
package Day_8;
import java.util.*;

class MaxOfThree{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maxx = 0;

        if(a>b){
            if(a>c){
                maxx = a;
            }
            else{
                maxx = c;
            }
        }
        else{
            if(b>c){
                maxx = b;
            }
            else{
                maxx = c;
            }
        }
        System.out.println("Largest is : " + maxx);
        sc.close();
    }
}