/*Q18: Write a program that accepts a percentage (0-100) and assigns a grade based on the following criteria: 
90-100: Grade A 
80-89: Grade B 
70-79: Grade C 
60-69: Grade D 
below 60: Grade F.

Sample Test Cases:
Input 1:
95
Output 1:
Grade A

Input 2:
82
Output 2:
Grade B

Input 3:
68
Output 3:
Grade D

Input 4:
50
Output 4:
Grade F

*/

//20 Sept 2026

package Day_9;
import java.util.*;

public class PercentageToGrade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter percentage:");
        int p = sc.nextInt();
        if (p<60 && p>=0){
            System.out.println("Grade F");
        }
        else if (p >= 60 && p <70){
            System.out.println("Grade D");
        }
        else if (p >= 70 && p <80){
            System.out.println("Grade C");
        }
        else if (p >= 80 && p <90){
            System.out.println("Grade B");
        }
        else if (p >= 90 && p <=100){
            System.out.println("Grade A");
        }
        else{
            System.out.println("enter valid percentage.");
        }
    }
}
