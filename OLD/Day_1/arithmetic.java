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
//12 Sept 2026

import java.util.*;
class arithmetic{
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("enter first number:");
            int a = sc.nextInt();
            System.out.println("Enter second number:");
            int b = sc.nextInt();
            System.out.println("Sum = " + (a+b) + ", Diff = " + (a-b) + ", Product = " + (a*b) + ", Quotient = " + (a/b));
        }
        catch(ArithmeticException e){
            System.out.println("Division by 0 error");
        }
    }
}