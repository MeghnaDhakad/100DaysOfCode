//19 Sept 2026
package Day_8;
import java.util.*;

public class Leetcode1281 {
    public int subtractProductAndSum(int n) {
        String temp = String.valueOf(n);
        int len = temp.length();
        int pro = 1;
        int summ = 0;
        for (int i = 0;i<len;i++){
            pro *= (temp.charAt(i) - '0');  // Convert the char back to an int
            summ += (temp.charAt(i) - '0');
        }

        return (pro - summ);
    }
    public static void main(String[] args){
        Leetcode1281 obj = new Leetcode1281();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        System.out.println(obj.subtractProductAndSum(n));
        sc.close();
    }
}
