/*Q3: Write a program to calculate the area and perimeter of a rectangle given its length and breadth.

Sample Test Cases:
Input 1:
5 10
Output 1:
Area=50, Perimeter=30

Input 2:
3 7
Output 2:
Area=21, Perimeter=20

*/
import java.util.*;

public class Rectangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length:");
        int l = sc.nextInt();
        System.out.println("enter breadth:");
        int b = sc.nextInt();
        System.out.println("Area = " + (l*b) + ", Perimeter = " + (2*(l+b)));
        sc.close();
    }
}