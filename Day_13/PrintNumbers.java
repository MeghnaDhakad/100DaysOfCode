/*Q26: Write a program to print numbers from 1 to n.

Sample Test Cases:
Input 1:
5
Output 1:
1 2 3 4 5

Input 2:
3
Output 2:
1 2 3

*/

//24 Sept 2026

package Day_13;
import java.util.*;

public class PrintNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        for (int i = 1;i<=n;i++){
            System.out.print(i + " "); // so they print in a line istead of automatic \n in println
        }
        sc.close();
    }
}
