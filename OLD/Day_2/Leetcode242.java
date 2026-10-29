//13 Sept 2026
package Day_2;
    
import java.util.*;

public class Leetcode242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int n = s.length();
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        for(int i = 0 ; i< s.length();i++){
            if (sArray[i] != tArray[i]) {
                return false; 
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first word:");
        String s = sc.nextLine();
        System.out.println("enter second word:");
        String t = sc.nextLine();
        
        Leetcode242 obj = new Leetcode242();
        System.out.println(obj.isAnagram(s,t));
        sc.close();
    }
}
