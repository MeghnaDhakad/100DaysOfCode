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
//13 Sept 2026
package Day_2;
public class Rectangle {
    public static void main(String[]args){
        int l = 3;
        int b = 7;
        System.out.println("Area = " + (l*b) + ", Perimeter = " + (2*(l+b)));
    }
}
