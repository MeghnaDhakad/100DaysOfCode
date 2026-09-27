//27 Sept 2026

package Day_16;
import java.util.*;

public class Leetcode867 {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] flip = new int[m][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                flip[j][i] = matrix[i][j];
            }
        }
        return flip;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array and subarray:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for(int i = 0;i<n;i++){
            System.out.println("enter " + m + " numbers:");
            for(int j = 0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        Leetcode867 obj  = new Leetcode867();
        System.out.println(Arrays.deepToString(obj.transpose(matrix))); 
        //Arrays.toString for 1D array and Arrays.deepToString for nD array
        sc.close();
    }
}
