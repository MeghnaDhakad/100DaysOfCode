/*Q4: Write a program to calculate the area and circumference of a circle given its radius.

Sample Test Cases:
Input 1:
7
Output 1:
Area=153.94, Circumference=43.96

Input 2:
3
Output 2:
Area=28.27, Circumference=18.85

*/
//13 Sept 2026
package Day_2;

public class Circle {
    public static void main(String[] args){
        int r = 7;
        //dont use 22/7 because java will remove everything after decimal
        double area = (Math.PI * r * r);
        double cir = (Math.PI * 2 *r);
        System.out.printf("Area=%.2f, Circumference=%.2f%n", area, cir);
    }
}
