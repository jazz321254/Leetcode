/**
 * <pre>
 * 使用一個進位符 以下是通用解只要將up改成要加的值即可
 * 時間複雜度 O(n)
 * </pre>
 *
 * @author Shawn
 */
 
public class Solution {
    public int[] plusOne(int[] digits) {
        int up = 1, sum = 0;
        for(int i = digits.length-1; i >= 0; i-- ){
            // 是否有進位
            sum = (digits[i] + up);
            digits[i] = sum % 10;
            up = sum / 10;
        }
        if(up == 0) return digits;
        int[] upDigits = new int[digits.length+1];
        upDigits[0] = up;
        return upDigits;
    }
}
