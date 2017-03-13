/**
 * <pre> 
 * 解題思路 先排序再比對 
 * 雖看起來效率不高 但速度跟用hashMap差不多
 * </pre>
 *
 * @author Shawn
 */

public class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums.length <= 1) return 0;
        // 先做sort
        java.util.Arrays.sort(nums);
        // 再依序比對
        int rs = 0;
        for(int i = 0; i < nums.length-1; i++){
            // 若i指摽重複兩次
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j < nums.length; j++){
                // 若j指摽重複兩次
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                if(nums[j] - nums[i] > k){
                    break; 
                }else if(nums[j] - nums[i] == k){
                    rs++;
                }  
            }
        }
        return rs;
    }
}
