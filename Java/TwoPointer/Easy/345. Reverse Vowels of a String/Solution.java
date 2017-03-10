/**
 * <pre> 
 * 解題思路 用雙指標 不是母音就往下跑 若是是母音就互換 
 * 這是我的解法寫得比較累贅些 時間複雜度是可以的 O(n)
 * </pre>
 *
 * @author Shawn
 */

public class Solution {
    public String reverseVowels(String s) {
        if(s.length() == 1) return s;
        int head = 0, tail = s.length()-1;
        // 製作母音表
        boolean[] vowels = new boolean[255];
        for(char c : "aeiouAEIOU".toCharArray()){
            vowels[(int)c] = true;
        }
        LinkedList<Integer> headList = new LinkedList<Integer>();
        LinkedList<Integer> tailList = new LinkedList<Integer>();
        char[] rs = new char[s.length()];
        while(head <= tail){
            // 相等時
            if(head == tail){
               rs[head] = s.charAt(head); 
               break; 
            } 
            // head pointer
            int tmp = (int)s.charAt(head);
            if(vowels[tmp]){
                if(headList.peek() == null) headList.add(new Integer(tmp)); 
            }else{
                rs[head] = s.charAt(head);
                head++;
            }
            // tail pointer
            tmp = (int)s.charAt(tail);
            if(vowels[tmp]){
                if(tailList.peek() == null) tailList.add(new Integer(tmp));
            }else{
                rs[tail] = s.charAt(tail);
                tail--;
            }
            // 互換
            if(headList.peek() != null && tailList.peek() != null){
                rs[head] = (char) tailList.poll().intValue();
                rs[tail] = (char) headList.poll().intValue();
                head++;
                tail--;
            }
        }
        return String.valueOf(rs);
    }
}
