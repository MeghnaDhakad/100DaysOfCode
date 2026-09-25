//25 Sept 2026
package Day_14;
import java.util.*;

public class Leetcode344 {
    public void reverseString(char[] s) {
        int n = s.length;
        for(int i = 0;i<(n/2);i++){
            char temp = s[n-i-1];
            s[n-i-1] = s[i];
            s[i] = temp;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter length of array:");
        int n = sc.nextInt();
        char[] s = new char[n];
        sc.nextLine(); // need to absorb the 'Enter'
        System.out.printf("enter elements of array:");
        String a = sc.nextLine();
        for(int i = 0;i<n;i++){
            s[i] = a.charAt(i);
        }
        Leetcode344 obj = new Leetcode344();
        obj.reverseString(s);
        System.out.println(s);
        sc.close();
    }
}
