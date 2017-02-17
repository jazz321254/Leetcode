/**
 * <pre> 
 * 這是參考leetCode的解答 因為用array所以比hashMap快
 * 兩個陣列一個給大寫 一個給小寫 並在出現時作累加
 * 後面一樣是算偶數的個數
 * 時間複雜度 => O(n)
 * </pre>
 * 
 * @author Shawn
 */

public class Solution1 {
    public int longestPalindrome(String s) {
    int[] lowercase = new int[26];
    int[] uppercase = new int[26];
    int res = 0;
    for (int i = 0; i < s.length(); i++){
        char temp = s.charAt(i);
        if (temp >= 97) lowercase[temp-'a']++;
        else uppercase[temp-'A']++;
    }
    for (int i = 0; i < 26; i++){
        res+=(lowercase[i]/2)*2;
        res+=(uppercase[i]/2)*2;
    }
    return res == s.length() ? res : res+1;
    }
}
