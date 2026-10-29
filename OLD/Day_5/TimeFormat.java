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
//16 Sept 2026

package Day_5;
import java.util.*;

class TimeFormat{
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

/*
for(int i =0;i<(sec/60);i++){
    min+=1;
}
for(int i = 0 ;i <(min/60);i++){
    hr+=1;
}
*/

/*
int hr = sec / 3600;
int min = (sec % 3600) / 60;
int finalSec = sec % 60;
*/