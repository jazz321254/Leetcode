/**
 * <pre>
 * 使用HashSet存入資料 若發現不能存即表示重複
 * 時間複雜度 => O(n)
 * </pre>
 *
 * @author Shawn
 */

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int num : nums){
            if(!set.add(num)) return true;
        }
        return false;
    }
}
