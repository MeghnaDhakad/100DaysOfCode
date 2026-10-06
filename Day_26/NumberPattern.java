package Day_26;

public class NumberPattern {
    public static void main(String[] args) {

        int i = 5;

        while (i >= 1) {
            int j = i;

            while (j <= 5) {
                System.out.print(j);
                j++;
            }

            System.out.println();
            i--;
        }
    }
}