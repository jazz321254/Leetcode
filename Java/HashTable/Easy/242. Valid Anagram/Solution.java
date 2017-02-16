/**
 * <pre> 
 * 使用hashMap存入第一個String
 * 比對第二個String若全部都在就是Anagram
 * 時間複雜度 => O(n)
 * </pre>
 * 
 * @author Shawn
 */
 
public class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int anagram = Math.max(s.length(),t.length());
        for(char s1 : s.toCharArray()){
            if(map.containsKey(s1))
                map.put(s1, map.get(s1)+1);
            else
                map.put(s1, 1);
        }
        for(char t1 : t.toCharArray()){
            if(map.containsKey(t1) && map.get(t1) > 0){
                map.put(t1, map.get(t1)-1);
                anagram--;
            }else{
                break;
            }
        }
        return (anagram==0)?true:false;
    }
}
