/*Q15: Write a program to input a character and check whether it is an uppercase alphabet, 
lowercase alphabet, digit, or special character.

Sample Test Cases:
Input 1:
A
Output 1:
Uppercase alphabet

Input 2:
a
Output 2:
Lowercase alphabet

Input 3:
3
Output 3:
Digit

Input 4:
#
Output 4:
Special character

*/
//19 Sept 2026

package Day_8;
import java.util.*;

class CheckCharacter{
    public static void main(String[] args){
        String up = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String down = "abcdefghijklmnopqrstuvwxyz";
        String sp = "1234567890";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character:");
        String a = sc.nextLine();
        if(up.contains(a)){
            System.out.println("Uppercase alphabet");
        }
        if(down.contains(a)){
            System.out.println("Lowercase alphabet");
        }
        if(sp.contains(a)){
            System.out.println("Digit alphabet");
        }
    }
}