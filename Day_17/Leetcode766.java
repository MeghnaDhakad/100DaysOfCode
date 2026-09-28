//28 Sept 2026
package Day_17;
import java.util.*;

public class Leetcode766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 1;i<n;i++){
            for(int j = 1;j<m;j++){
                if(matrix[i][j] != matrix[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
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
        Leetcode766 obj = new Leetcode766();
        System.out.println(obj.isToeplitzMatrix(matrix));
        sc.close();
    }
}
