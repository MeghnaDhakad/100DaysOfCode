/*Q5: Write a program to convert temperature from Celsius to Fahrenheit.

Sample Test Cases:
Input 1:
0
Output 1:
Fahrenheit=32

Input 2:
100
Output 2:
Fahrenheit=212

*/
import java.util.*;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter temperature: ");
        int c = sc.nextInt();
        int f = ((c * 9)/5)+32;

        System.out.println(f);
        sc.close();
    }
}
