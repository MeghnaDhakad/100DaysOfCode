//20 Sept 2026

package Day_9;
import java.util.*;

public class Leetcode9 {
    public boolean isPalindrome(int x) {
        String temp = String.valueOf(x);
        int n = temp.length();
        if(x<0){
            return false;
        }
        else{
            for (int i = 0;i<(n/2);i++){
                if(temp.charAt(i) != temp.charAt(n-i-1)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int x = sc.nextInt();
        Leetcode9 obj = new Leetcode9();
        System.out.println(obj.isPalindrome(x));
        sc.close();
    }
}
