/**
 * <pre>
 * 使用XOR還原的原理 ex:a^b^b=a
 * 也可使用 242.Valid Anagram 解題技巧會多一倍O(m)即一些空間複雜度
 * 時間複雜度 => O(n)
 * </pre>
 * 
 * @author Shawn
 */

public class Solution {
    public char findTheDifference(String s, String t) {
        int n = t.length();
        char c = t.charAt(n -1);
        
        for(int i = 0; i < n -1; i++){
            c ^= s.charAt(i);
            c ^= t.charAt(i);
        }
        return c;
    }
}
