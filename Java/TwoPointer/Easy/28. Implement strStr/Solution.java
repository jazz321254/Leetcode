/**
 * <pre> 
 * 解題思路 用雙指標 head表示開始的指標 tail表示需判斷的尾端指標
 * 時間複雜度 O(n) 也可以使用類似的邏輯用java api substring可以大大減少判斷與程式碼
 * </pre>
 *
 * @author Shawn
 */

public class Solution {
    public int strStr(String haystack, String needle) {
        if("".equals(needle)) return 0;
        if(haystack.equals(needle)) return 0;
        int head = 0;
        int tail = haystack.length()-1;
        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();
        while(head <= tail && head <= haystack.length()-1){
            // 若head與needle相同
            if(haystackChars[head] == needleChars[0]){
                // 從尾端判斷
                int needleEnd = needle.length() - 1;
                tail = head + needleEnd;
                // 要判斷的尾端已經大於要比對的字串
                if(tail > haystack.length()-1) return -1;
                while(haystackChars[tail] == needleChars[needleEnd]){
                    // 如果head == tail表示找到了
                    if(head == tail) return head;
                    needleEnd--;
                    tail--;
                } 
                head++;
            }else{
              head++;
              tail++;
            }
        }
        return -1;
    }
}
