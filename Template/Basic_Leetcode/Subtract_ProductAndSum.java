import java.util.*;

public class Subtract_ProductAndSum {
    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int c = n % 10;
            sum += c;
            product *= c;
            n = n / 10;
        }
        return (product - sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = subtractProductAndSum(n);
        System.out.println("Product - Sum = " + result);
        sc.close();
    }
}