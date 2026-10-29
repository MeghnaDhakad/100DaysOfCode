/*Q9: Write a program to calculate simple and compound interest for given principal, rate, and time.

Sample Test Cases:
Input 1:
1000 5 2
Output 1:
Simple Interest=100, Compound Interest=102.5

Input 2:
5000 7 3
Output 2:
Simple Interest=1050, Compound Interest=1125.76

*/
//16 Sept 2026

package Day_5;
import java.util.*;
public class CalculateInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter principal : ");
        int p = sc.nextInt();
        System.out.println("enter rate : ");
        int r = sc.nextInt();
        System.out.println("enter time : ");
        int t = sc.nextInt();

        //simple interest
        double si = (p * r * t) / 100.0;

        //compound interest
        // ci = p(1+(r/100))^t - p
        double ci = p * Math.pow((1 + r / 100.0), t) - p;

        System.out.printf("Simple Interest : %.2f, Compound Interest : %.2f" ,si,ci );
        sc.close();
    }
}
