/**
 * <pre>
 * 簡單解法
 * 利用數學公式 時間複雜度 => O(n) 空間複雜度 => O(1)
 * </pre>
 *
 * @author Shawn
 */

public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        // 算陣列種和
        for(int i = 0; i < nums.length; i++)
            sum = sum + nums[i];
        // 計算缺值
        return ((1+nums.length)*nums.length/2)-sum;
    }
}
