package Day_26;

public class StarPattern {
    public static void main(String[] args) {

        int[] rows = {4, 5, 3, 1};

        int i = 0;

        while (i < rows.length) {
            int j = 1;

            while (j <= rows[i]) {
                System.out.println("*");
                j++;
            }

            System.out.println();
            i++;
        }
    }
}