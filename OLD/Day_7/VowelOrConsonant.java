/*Q14: Write a program to input a character and check whether it is a vowel or consonant using if–else.

Sample Test Cases:
Input 1:
a
Output 1:
Vowel

Input 2:
b
Output 2:
Consonant

*/

//18 Sept 2026
package Day_7;
import java.util.*;
public class VowelOrConsonant {
    public static void main(String[] args){
        String vowel = "aeiouAEIOU";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character:");
        String a = sc.nextLine();
        if(vowel.contains(a)){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
        sc.close();
    }
}
