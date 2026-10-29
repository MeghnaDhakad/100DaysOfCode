package Day_27;

public class StarPattern53{
    public static void main(String[] args) {

        int i = 1;

        // Increasing pattern
        while (i <= 9) {
            int j = 1;

            while (j <= i) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i = i + 2;
        }

        // Decreasing pattern
        i = 7;

        while (i >= 1) {
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