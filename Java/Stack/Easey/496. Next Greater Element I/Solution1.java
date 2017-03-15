/**
 * <pre> 
 * 解題思路 與solution相似 
 * 不過用找對應答案的方式 是用steak存降序
 * 若是有比較大的就依序pop存入hashMap
 * </pre>
 *
 * @author Shawn
 */

public class Solution1 {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }   
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
    }
}
