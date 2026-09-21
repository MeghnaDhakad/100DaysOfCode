/*Q20: Write a program to display the day of the week based on a number (1–7) using switch-case.

Sample Test Cases:
Input 1:
1
Output 1:
Monday

Input 2:
5
Output 2:
Friday

*/
//21 Sept 2026

package Day_10;
import java.util.*;

public class DayOfWeek {
    public static void main(String[] args){
        String[] week = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter day value:");
        int n = sc.nextInt();
        String day = week[n-1];
        System.out.println(day);
        sc.close();
    }
}
