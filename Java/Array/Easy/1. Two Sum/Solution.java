/**
 * <pre>
 * 使用hashMap解Two Sum => O(n)
 * </pre>
 *
 * @author Shawn
 */

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        
        for(int i = 0; i < nums.length; i++) {
            // 如果有在hashMap中：表示找到相加的值並將index取出
            // 若沒有在hashMap中：將所需要的打值放入hashMap中
            if(hashMap.containsKey(nums[i])){
                int index = hashMap.get(nums[i]);
                result[0] = index;
                result[1] = i;
            }else{
                hashMap.put(target - nums[i], i);
            }
        }
        return result;
    }
}
