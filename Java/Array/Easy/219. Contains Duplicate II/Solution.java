/**
 * <pre>
 * 使用hashMap做hashTable去查表算距離
 * 時間複雜度 O(n)
 * </pre>
 *
 * @author Shawn
 */

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // 使用hashMap 做個hashTable
        Map<Integer, Integer> hashTable = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++){
            if(hashTable.get(nums[i]) != null)
                if(Math.abs(hashTable.get(nums[i]) - i) <= k) 
                    return true;
            hashTable.put(nums[i], i);
        }
        return false;
    }
}
