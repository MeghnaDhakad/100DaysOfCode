/*Q13: Write a program to input a year and check whether it is a leap year or not using conditional statements.

Sample Test Cases:
Input 1:
2020
Output 1:
Leap year

Input 2:
1900
Output 2:
Not a leap year

Input 3:
2000
Output 3:
Leap year

*/
//18 Sept 2026
package Day_7;
import java.util.*;

public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year:");
        int year = sc.nextInt();
// could have used if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year%400 == 0){
                    System.out.println("Leap Year");
                }
                else{
                    System.out.println("Not a Leap Year");
                }
            }
            else{
                System.out.println("Leap Year");
            }
        }
        else{
            System.out.println("Not a Leap Year");
        }
        sc.close();
    }
}
