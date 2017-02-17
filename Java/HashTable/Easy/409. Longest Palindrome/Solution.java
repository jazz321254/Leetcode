/**
 * <pre> 
 * 用hashMap記錄每個字出現的次數
 * 在計算偶數的個數 若長度大於偶數的個數就加1反之回傳偶數個數
 * </pre>
 * 
 * @author Shawn
 */

public class Solution {
    public int longestPalindrome(String s) {
        Map map = new HashMap();
        int rs = 0;
        for(char s1 : s.toCharArray()){
            if(!map.containsKey(s1))
                map.put(s1, 1);
            else
                map.put(s1, (int) map.get(s1)+1);
            if((int) map.get(s1) % 2 == 0) rs+=2;
        }
        return (s.length() - rs > 0)?rs+1:rs;
    }
}
