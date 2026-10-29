//18 Sept 2026
package Day_7;
import java.util.*;
public class Leetcode1342 {
    public int numberOfSteps(int num) {
        int count = 0;
        while(num != 0){
            if (num % 2 == 0){
                num = num/2;
            }
            else{
                num -= 1;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = sc.nextInt();
        Leetcode1342 obj = new Leetcode1342();
        System.out.println(obj.numberOfSteps(num));
        sc.close();
    }
}
