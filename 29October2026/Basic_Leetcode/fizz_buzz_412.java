package Basic_Leetcode;
import java.util.*;
public class fizz_buzz_412 {
    public static List<String> fizzBuzz(int n) {
        ArrayList<String> l = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                l.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                l.add("Fizz");
            }
            else if (i % 5 == 0) {
                l.add("Buzz");
            }
            else {
                l.add(String.valueOf(i));
            }
        }
        return l;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        List<String> result = fizzBuzz(n);
        System.out.println(result);
        sc.close();
    }
}
