/**
 * <pre>
 * 使用for迴圈 將不是val的值依序放回原先的nums
 * 最後return length 時間複雜度 O(n).
 * </pre>
 *
 * @author Shawn
 */
 
public class Solution {
    public int removeElement(int[] nums, int val) {
        int length = 0;
        for(int num : nums){
            if(num != val)
                nums[length++] = num;
        }
        return length;
    }
}
