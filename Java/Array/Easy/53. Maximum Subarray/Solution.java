/**
 * <pre>
 * 使用動態規劃
 * 先拆解題目Top-Down 
 * maxSubArray(nums, i) = maxSubArray(nums, i-1) > 0 ? maxSubArray(nums, i-1) + nums[i] : 0
 * 時間複雜度 => O(n)
 * </pre>
 *
 * @author Shawn
 */

public class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        
        for(int i=1; i<nums.length; i++){
            // 算每個子題的答案並存入cache
            dp[i] = dp[i-1] > 0 ? dp[i-1] + nums[i] : nums[i];
            // 每個子題最大的值
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
