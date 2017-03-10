/**
 * <pre> 
 * 利用雙指表 依序篩掉非字元及數字再做比對 
 * 時間複雜度 O(n)
 * </pre>
 *
 * @author Shawn
 */

public class Solution {
    public boolean isPalindrome(String s) {
        int head = 0, tail = s.length()-1;
        while(head < tail){
            // head pointer
            while(!Character.isLetter(s.charAt(head)) && !(s.charAt(head) >= '0' && s.charAt(head) <= '9')){
                if(++head > s.length()-1) return true;
            }
            // tail pointer
            while(!Character.isLetter(s.charAt(tail)) && !(s.charAt(tail) >= '0' && s.charAt(tail) <= '9')){
                if(--tail < 0) return true;
            }
            // 比較
            if(Character.toLowerCase(s.charAt(head)) != Character.toLowerCase(s.charAt(tail))) return false;
            // 移動指標
            head++;
            tail--;
        }
        return true;
    }
}
