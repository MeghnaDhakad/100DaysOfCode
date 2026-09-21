//21 Sept 2026

package Day_10;
import java.util.*;

public class Leetcode231 {
    public boolean isPowerOfTwo(int n) {
        while(n%2 == 0 && n != 0){
            n = n/2;
        }
        if(n == 1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        Leetcode231 obj = new Leetcode231();
        System.out.println(obj.isPowerOfTwo(n));
        sc.close();
    }
}
