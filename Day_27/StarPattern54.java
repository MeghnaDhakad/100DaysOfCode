package Day_27;

public class StarPattern54 {
    public static void main(String[] args) {

        int i = 1;

        // Increasing part
        while (i <= 7) {
            int spaces = (7 - i) / 2;

            while (spaces > 0) {
                System.out.print(" ");
                spaces--;
            }

            int j = 1;

            while (j <= i) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i = i + 2;
        }

        // Decreasing part
        i = 5;

        while (i >= 1) {
            int spaces = (7 - i) / 2;

            while (spaces > 0) {
                System.out.print(" ");
                spaces--;
            }

            int j = 1;

            while (j <= i) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i = i - 2;
        }
    }
}