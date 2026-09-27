/*Q31: Write a program to take a number as input and print its equivalent binary representation.

Sample Test Cases:
Input 1:
10
Output 1:
1010

Input 2:
7
Output 2:
111

*/
//27 Sept 2026
//used ai try again
package Day_16;
import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        int binary = 0;
        int place = 1;

        while (n > 0) {
            int rem = n % 2;
            binary = binary + rem * place;
            place = place * 10;
            n = n / 2;
        }

        System.out.println(binary);
        sc.close();
    }
}
