/*Q40: Write a program to find the 1’s complement of a binary number and print it.

Sample Test Cases:
Input 1:
1010
Output 1:
0101

Input 2:
1111
Output 2:
0000

*/
//01 Sept 2026
// Used ai - try again
package Day_20;
import java.util.*;

public class OnesComplement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int a = sc.nextInt();
        String result = ""; 
        
        // Handle the case where the input itself is 0
        if (a == 0) {
            result = "1";
        } else {
            while(a != 0){
                int d = a % 10;
                if(d == 1){
                    result = "0" + result; // Add 0 to the front
                }
                else{
                    result = "1" + result; // Add 1 to the front
                }
                a = a / 10;
            }
        }
        
        System.out.println(result);
        sc.close();
    }
}
