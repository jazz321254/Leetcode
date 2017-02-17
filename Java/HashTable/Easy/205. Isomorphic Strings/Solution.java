/**
 * <pre> 
 * 使用兩個hashMap來記錄是否想同
 * 但效率不高
 * 時間複雜對 => O(n)
 * </pre>
 *
 * @author Shawn
 */

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map map = new HashMap();
        Map map2 = new HashMap();
        for(Integer i = 0; i < s.length(); i++){
            if(map.put(s.charAt(i), i) != map2.put(t.charAt(i), i))
                return false;
        }
        return true;
    }
}
