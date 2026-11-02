/*Q10: Write a program to input time in seconds and convert it to hours:minutes:seconds format.

Sample Test Cases:
Input 1:
3661
Output 1:
1:1:1

Input 2:
7322
Output 2:
2:2:2

*/
import java.util.*;

public class FormatTime {
    public static void main(String[] args){
        System.out.println("enter time in seconds : ");
        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();
        int min = 0;
        int hr = 0;
        while(sec>=60){
            min+=1;
            sec-=60;
        }
        while(min>=60){
            hr+=1;
            min-=60;
        }
        System.out.println(hr + ":" + min + ":" + sec);
        sc.close();
    }
}
