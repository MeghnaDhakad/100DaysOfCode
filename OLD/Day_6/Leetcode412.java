//17 Sept 2026
package Day_6;

import java.util.*;
public class Leetcode412 {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1;i<=n;i++){
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } 
            else if (i % 3 == 0) {
                list.add("Fizz");
            } 
            else if (i % 5 == 0) {
                list.add("Buzz");
            }
            else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer: ");
        int n = sc.nextInt();
        Leetcode412 obj = new Leetcode412();
        System.out.println(obj.fizzBuzz(n));
        sc.close();
    }
}
