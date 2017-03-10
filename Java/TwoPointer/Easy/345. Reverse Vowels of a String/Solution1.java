/**
 * <pre> 
 * 思路與solution一樣
 * 這是根據leetCode的答案改hashMap的解法 速度快一倍
 * </pre>
 *
 * @author Shawn
 */
 
public class Solution1 {
    public String reverseVowels(String s) {
        if(s == null || s.length()==0) return s;
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        HashSet<Character> set = new HashSet<Character>();
        for(Character c : vowels.toCharArray()){
            set.add(c);
        }
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            while(start<end && !set.contains(chars[start])){
                start++;
            }
            while(start<end && !set.contains(chars[end])){
                end--;
            }
            // 互換
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            // 移動指標
            start++;
            end--;
        }
        return new String(chars);
    }
}
