/*Q25: Write a program to implement a basic calculator using switch-case for +, -, *, /, %.

Sample Test Cases:
Input 1:
4 2 +
Output 1:
6

Input 2:
10 3 %
Output 2:
1

Input 3:
15 5 /
Output 3:
3

*/

//24 Sept 2026

package Day_13;
import java.util.*;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers and switch-case:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next();
        try{
            if(c.equals("+")){
                System.out.println((a+b));
            }
            else if(c.equals("-")){
                System.out.println((a-b));
            }
            else if(c.equals("*")){
                System.out.println((a * b));
            }
            else if(c.equals("/")){
                System.out.println((a / b));
            }
            else if(c.equals("%")){
                System.out.println((a % b));
            }
            else{
                System.out.println("enter a valid symbol (+,-,%,/,*):");
            } 
        }
        catch(ArithmeticException e){
            System.out.println("division by 0 is not possible.");
        }
        sc.close();
    }
}
