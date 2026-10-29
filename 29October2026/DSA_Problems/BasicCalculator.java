/*Q2: Write a program to input two numbers and display their sum, difference, product, and quotient.

Sample Test Cases:
Input 1:
10 2
Output 1:
Sum=12, Diff=8, Product=20, Quotient=5

Input 2:
7 3
Output 2:
Sum=10, Diff=4, Product=21, Quotient=2

*/
package DSA_Problems;
import java.util.*;

public class BasicCalculator {
    public int Summ(int a , int b){
        return (a+b);
    }
    public int Diff(int a , int b){
        return (a-b);
    }
    public int Pro(int a , int b){
        return (a*b);
    }
    public int Quo(int a , int b){
        try{
            return (a/b);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        BasicCalculator obj = new BasicCalculator();
        System.out.println("Sum=" + obj.Summ(a, b) + ", Diff=" + obj.Diff(a, b)+ ", Product=" + obj.Pro(a, b) + ", Quotient=" + obj.Quo(a, b));
        sc.close();
    }
}
