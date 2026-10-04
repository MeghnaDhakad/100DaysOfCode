/*
Q46: Write a program to print the following pattern:
*****
*****
*****
*****
*****

Sample Test Cases:
Input 1:

Output 1:
*****
*****
*****
*****
*****

*/
package Day_23;
import java.util.*;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int n = sc.nextInt();

        int i = 1;

        while (i <= n) {
            int j = 1;

            while (j <= n) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }

        sc.close();
    }
}