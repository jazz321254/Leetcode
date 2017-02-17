/**
 * <pre> 
 * 解題要點用XOR a=a^b^b
 * 時間複雜度 O(n)
 * </pre>
 *
 * @author Shawn
 */

public class Solution {
    public int singleNumber(int[] nums) {
        int rs = 0;
        for(int num : nums){
            rs ^= num;
        }
        return rs;
    }
}
