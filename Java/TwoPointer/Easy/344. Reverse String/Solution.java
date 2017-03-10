/**
 * <pre> 
 * 利用雙指表前後互換即可
 * 時間複雜度 O(n)
 * </pre>
 *
 * @author Shawn
 */

public class Solution {
    public String reverseString(String s) {
        int head = 0, tail = s.length()-1;
        char[] rs = s.toCharArray();
        while(head < tail){
            // 互換
            char tmp = s.charAt(head);
            rs[head] = s.charAt(tail);
            rs[tail] = tmp;
            // 移動指標
            head++;
            tail--;
        }
        return new String(rs);
    }
}
