/*Q19: Write a program to classify a triangle as Equilateral, Isosceles, or Scalene based on its side lengths.

Sample Test Cases:
Input 1:
3 3 3
Output 1:
Equilateral

Input 2:
3 3 4
Output 2:
Isosceles

Input 3:
2 3 4
Output 3:
Scalene

*/
//21 Sept 2026

package Day_10;
import java.util.*;

public class TriangleClassifier {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of all three sides:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a != b ){
            if(a == c || b == c){
                System.out.println("Isosceles");
            }
            else{
                System.out.println("Scalene");
            }
        }
        else{
            if(a == c){
                System.out.println("Equilateral");
            }
            else{
                System.out.println("Isosceles");
            }
        }
        sc.close();
    }
}



// AI's SOLUTION
/*
if (a == b && b == c) {
    System.out.println("Equilateral");
} 
else if (a == b || b == c || a == c) {
    System.out.println("Isosceles");
} 
else {
    System.out.println("Scalene");
}
*/