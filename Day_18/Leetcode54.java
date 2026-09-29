//29 Sept 2026
//used ai - try  again
package Day_18;
import java.util.*;

public class Leetcode54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ans = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            // Left to right
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            // Top to bottom
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            // Right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ans;
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
        Leetcode54 obj = new Leetcode54();
        System.out.println(obj.spiralOrder(matrix));
        sc.close();
    }
}
