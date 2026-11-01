import java.util.*;

public class palindrome {

    public static boolean isPalindrome(int x) {

        int rev = 0;
        int og = x;

        while (x > 0) {
            int c = x % 10;
            rev = (rev * 10) + c;
            x = x / 10;
        }

        return (og == rev);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        boolean result = isPalindrome(x);

        System.out.println("Is Palindrome = " + result);

        sc.close();
    }
}