/*Q21: Write a program to display the month name and number of days using switch-case for a given month number.

Sample Test Cases:
Input 1:
2
Output 1:
February, 28 days

Input 2:
12
Output 2:
December, 31 days

*/

// 22 Sept 2026
package Day_11;
import java.util.*;

public class MonthAndDays {
    public static void main(String[] args){
        String[] month = {"January", "February" , "March", "April","May" , "June","July","August","September","October","November","December"};
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        System.out.println(month[n-1] + ", " + days[n-1] + " days.");
        sc.close();
    }
}
