/**
 * <pre>
 * 使用hashMap來記錄 每一個出現的次數
 * 時間複雜度 => O(n)
 * </pre>
 *
 * @author Shawn
 */

public class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0, count=0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i< nums.length; i++){
            if(!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else
                map.put(nums[i], map.get(nums[i])+1);
            // 判斷此數是否出現次數大於一半
            if(map.get(nums[i]) > nums.length/2){
                majority = nums[i];
                break;
            }             
        }
        return majority;
    }
}
