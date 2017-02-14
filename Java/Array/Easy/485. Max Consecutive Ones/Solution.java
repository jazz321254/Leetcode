/**
 * <pre>
 * 先將連續的1累加在原本的nums
 * 在找最大值 時間複雜度 => O(n)
 * </pre>
 *
 * @author Shawn
 */
 
public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int rs = 0;
        for(int i=0;i< nums.length;i++){
            if(i>0 && nums[i] != 0) nums[i]+=nums[i-1];
        }
        // 找最大的
        for(int i=0;i< nums.length;i++){
            if(nums[i] > rs) rs = nums[i];
        }
        return rs;
    }
}
