/*Q23: Write a program to calculate library fine based on late days as follows: 
First 5 days late: ₹2/day 
Next 5 days late: ₹4/day 
Next 20 days days late: ₹6/day 
More than 30 days: Membership Cancelled.

Sample Test Cases:
Input 1:
4
Output 1:
Fine ₹8

Input 2:
8
Output 2:
Fine ₹22

Input 3:
15
Output 3:
Fine ₹60

Input 4:
31
Output 4:
Membership Cancelled

*/
// 23 Sept 2026
package Day_12;
import java.util.*;

public class LibraryLateFee {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of late days:");
        int n = sc.nextInt();
        int fee = 0;
        if(n<=30){
            for(int i = 1 ; i <= n; i++){
                if(i <= 5){
                    fee += 2;
                }
                else if(i>5 && i <=10){
                    fee += 4;
                }
                else{
                    fee += 6;
                }
            }
            System.out.println("fine Rs" + fee );
        }
        else{
            System.out.println("Membership Cancelled");
        }
        sc.close();
    }
}
