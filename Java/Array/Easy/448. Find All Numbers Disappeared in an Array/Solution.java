/**
 * <pre>
 * 使用取餘數的技巧 
 * 將值轉換成index並在原本的值上加上n表示出現過
 * 時間複雜度 => O(n)
 * </pre>
 *
 * @author Shawn
 */
 
public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();
        int n = nums.length;
        // 使用mod方法紀錄已經出現過的值並加上n的長度
        for(int i = 0; i < nums.length; i ++) nums[(nums[i]-1) % n] += n;
        // 若nums裡得值<=n表示沒有出現過
        for(int i = 0; i < nums.length; i ++) if(nums[i] <= n) ret.add(i+1);
        return ret;
    }
}
