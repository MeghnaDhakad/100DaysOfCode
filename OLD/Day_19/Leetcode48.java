//30 Sept 2026
//used ai, try again
package Day_19;
import java.util.*;
class Leetcode48 {
    public int[][] rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
        return matrix;
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
        Leetcode48 obj = new Leetcode48();
        System.out.println(Arrays.deepToString(obj.rotate(matrix)));
        sc.close();
    }
}