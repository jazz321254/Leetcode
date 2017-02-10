/**
 * <pre>
 * 這是一開始的想法非常簡單, O(n)
 * </pre>
 *
 * @author Shawn
 */
public class Solution1 {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(target <= nums[i]){
                index = i; 
                break;
            }
            index = i + 1;
        }
        return index;
    }
}
