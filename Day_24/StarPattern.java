/*Q47: Write a program to print the following pattern:
*
**
***
****
*****

Sample Test Cases:
Input 1:

Output 1:
*
**
***
****
*****

*/
package Day_24;

public class StarPattern {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 5) {
            int j = 1;

            while (j <= i) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }
    }
}