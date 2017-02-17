/**
 * <pre> 
 * 解題技巧 用hashMap做一個對映表
 * 表結構 key 為str String or pattern Char
 *       value則為一個任意相同的數
 * 依序跑迴圈 若發現所對映的value不同即表示兩者不match
 * 時間複雜度 => O(n)
 * </pre>
 *
 * @author Shawn
 */

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strArray = str.split(" ");
        if(pattern.length() != strArray.length) return false;
        // 用統一個hashMap記錄對應的值
        Map map = new HashMap();
        for(Integer i=0;i<pattern.length();++i){
            if(map.put(strArray[i],i) != map.put(pattern.charAt(i),i))
                return false;
        }
        return true;
    }
}
