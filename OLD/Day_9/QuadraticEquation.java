/*Q17: Write a program to find the roots of a quadratic equation and categorize them.

Sample Test Cases:
Input 1:
1 -3 2
Output 1:
Roots are real and different: 2, 1

Input 2:
1 -2 1
Output 2:
Roots are real and same: 1

Input 3:
1 2 5
Output 3:
Roots are complex

*/

//20 Sept 2026

package Day_9;
import java.util.*;

public class QuadraticEquation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter values of a,b and c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double d = (b * b) - (4 * a * c);
        if(d >= 0){
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            //also could have done d == 0
            if(r1 == r2){
                System.out.println("Roots are real and same: "+ r1);
            }
            else{
                System.out.printf("Roots are real and different: %.1f, %.1f",r1,r2);
            }
        }
        else{
            System.out.println("Roots are complex.");
        }
    }
}
