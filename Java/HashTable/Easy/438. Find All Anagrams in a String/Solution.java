/**
 * <pre> 
 * 解題要點使用sliding window algorithm
 * 時間複雜度 O(n)
 * </pre>
 *
 * @author Shawn
 */

public class Solution {
    public List<Integer> findAnagrams(String s, String t) {
        List<Integer> result = new LinkedList<>();
        if(t.length()> s.length()) return result;
        // 先用hashMap存放欲找的string
        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        // 不重複的counter
        int counter = map.size();
        int begin = 0, end = 0;
        // end從頭走到尾巴
        while(end < s.length()){
            char c = s.charAt(end);
            // t存在
            if( map.containsKey(c) ){
                map.put(c, map.get(c)-1);
                if(map.get(c) == 0) counter--;
            }
            // end每次走一步
            end++;
            // 若有找到counter begin加一
            while(counter == 0){
                // 還原count
                char tempc = s.charAt(begin);
                if(map.containsKey(tempc)){
                    map.put(tempc, map.get(tempc) + 1);
                    if(map.get(tempc) > 0){
                        counter++;
                    }
                }
                // 找到放入result
                if(end-begin == t.length()){
                    result.add(begin);
                }
                // 移動begin
                begin++;
            }
        }
        return result;
    }
}
