/*Q24: Write a program to calculate electricity bill based on units consumed with these rates: 
First 100 units at ₹5/unit 
Next 100 units at ₹7/unit 
Next 100 units at ₹10/unit 
Above at ₹12/unit

Sample Test Cases:
Input 1:
50
Output 1:
Bill: ₹250

Input 2:
150
Output 2:
Bill: ₹850

Input 3:
250
Output 3:
Bill: ₹1700

*/

//23 Sept 2026
package Day_12;
import java.util.*;

public class PowerBill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of units:");
        int unit = sc.nextInt();
        int bill = 0;
        for(int i = 1;i<=unit;i++){
            if(i <= 100){
                bill += 5;
            }
            else if(i>100 && i <=200){
                bill += 7;
            }
            else if(i>200 && i <=300){
                bill += 10;
            }
            else{
                bill += 12;
                }
        }
        System.out.println("Bill: Rs" + bill );
        sc.close();
    }
}
