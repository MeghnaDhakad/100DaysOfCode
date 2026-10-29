//23 Sept 2026
//this is the least optimal solution -- TRY AGAIN
package Day_12;
import java.util.*;

public class Leetcode509 {
    public int fib(int n) {
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        Leetcode509 obj = new Leetcode509();
        System.out.println(obj.fib(n));
        sc.close();
    }
}
