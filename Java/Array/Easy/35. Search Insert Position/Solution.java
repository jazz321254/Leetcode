/**
 * <pre>
 * 可以使用二元搜尋數將時間複雜度降到O(logn).
 * </pre>
 *
 * @author Mog
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        // 因為是有序且不重複所以可以用二元搜尋樹
        int low = 0, hight = nums.length-1;
        while(low <= hight){
            int mid = (hight + low)/2;
            if(target == nums[mid]) return mid;
            else if(target > nums[mid]) low = mid+1;
            else hight = mid -1;
        }
        return low;
    }
}
