//15 Sept 2026
////used ai assistance, get back in 10 days and try again
package Day_4;
import java.util.*;
public class Leetcode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        int n = strs.length;
        for (int i = 0;i < n ; i++){
            //covert to char because string is rigit and cant be sorted
            char[] b = strs[i].toCharArray();
            Arrays.sort(b);
            String signature = new String(b);

            if (!map.containsKey(signature)) {
                map.put(signature, new ArrayList<>());
            }

            map.get(signature).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        Leetcode49 obj = new Leetcode49();
        List<List<String>> result = obj.groupAnagrams(strs);
        System.out.println(result);
    }
}
