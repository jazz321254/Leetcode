/**
 * <pre>
 * rotate等價於操作三次reverse 
 * 時間複雜度 => O(n)
 * </pre>
 *
 * @author Shawn
 */

public class Solution {
    public void rotate(int[] nums, int k) {
        // 須注意若k>n取mod
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
