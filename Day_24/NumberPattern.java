/*Q48: Write a program to print the following pattern:
1
12
123
1234
12345

Sample Test Cases:
Input 1:

Output 1:
1
12
123
1234
12345

*/
package Day_24;

public class NumberPattern {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 5) {
            int j = 1;

            while (j <= i) {
                System.out.print(j);
                j++;
            }

            System.out.println();
            i++;
        }
    }
}