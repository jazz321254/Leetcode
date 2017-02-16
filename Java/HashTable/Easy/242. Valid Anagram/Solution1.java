/**
 * <pre> 
 * 參考leetCode的高竿解法
 * 思路是做出一個26字母的array 
 * 第一個String有出現就加1
 * 第二個String有出現就減1
 * 最後最後字母array總合為0則是Anagram
 * 時間複雜度 => O(n) 但比用hashMap快10倍 因此更加證明java hashMap效率不佳
 * 參閱題型 169. Majority Element
 * </pre>
 * 
 * @author Shawn
 */

public class Solution1 {
    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }
}
