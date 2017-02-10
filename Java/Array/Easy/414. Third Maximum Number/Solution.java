/**
 * <pre>
 * 第三大的解法 
 * 使用三個變數用for依序判斷是第幾大
 * 最後再將第三大回傳
 * 時間複雜度 => O(n)
 * </pre>
 *
 * @author Shawn
 */
 
 public class Solution {
    public int thirdMax(int[] nums) {
        Integer first = null, second = null, third = null;
        for(Integer num : nums){
            // 若是有重複就跳出
            if(num.equals(first) || num.equals(second) || num.equals(third)) continue;
            // 若為null就可以直接放入
            if(first == null || num > first){
                third = second;
                second = first;
                first = num;
            }else if(second == null || num > second){
                third = second;
                second = num;
            }else if(third == null || num > third ){
                third = num;
            }
        }
        return third != null ? third : first;
    }
}
