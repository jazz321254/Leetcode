/**
 * <pre>
 * 一個for迴圈掃過 將非零的數與最左邊的靈互換即可
 * 時間複雜度 => O(n)
 * </pre>
 *
 * @author Shawn
 */

public class Solution {
    public void moveZeroes(int[] nums) {
        // j表示要換的index
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}
