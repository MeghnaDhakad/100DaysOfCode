//used ai - try again
//1 Oct 2026

package Day_20;

import java.util.*;

public class Leetcode73 {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] rows = new boolean[m];
        boolean[] columns = new boolean[n];

        // Find zeroes and mark their rows and columns
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    columns[j] = true;
                }
            }
        }

        // Set marked rows and columns to zero
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (rows[i] || columns[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows:");
        int n = sc.nextInt();
        System.out.println("enter number of columns:");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for(int i = 0;i<n;i++){
            System.out.println("enter " + m + " numbers for row " + (i+1) + " :" );
            for(int j = 0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        Leetcode73 obj = new Leetcode73();
        obj.setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
        sc.close();
    }
}
