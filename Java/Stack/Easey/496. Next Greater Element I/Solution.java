/**
 * <pre> 
 * 解題思路 用hashMap存答案 根據hashMap找到答案 
 * 時間複雜度 應該是接近 O(n) 沒做細部分析
 * </pre>
 *
 * @author Shawn
 */

public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<Integer>();
        // 存答案
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(!map.containsKey(nums[i]) && nums[j] > nums[i]){
                   map.put(nums[i], nums[j]);
                   break;
                } 
            }
        }
        // 找最近比較大的
        for(int i = 0; i < findNums.length; i++){
            if(map.containsKey(findNums[i])) list.add(map.get(findNums[i]));
            else list.add(-1);
        }
        // 轉換成int[]
        int[] rs = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            rs[i] = list.get(i);
        }
        return rs;
    }
}
