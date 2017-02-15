/**
 * <pre> 使用雙指標
 * 兩兩相加等於target就是答案
 * 時間複雜度 O(n)
 * </pre>
 *
 * @author Shawn
 */
 
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] rs = new int[2];
        int left = 0, right = numbers.length-1;
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(target > sum){
                left++; 
            }else if(target < sum){
                right--;
            }else{
                rs[0] = left+1; 
                rs[1] = right+1; 
                break;
            }
        }
        return rs;
    }
}
