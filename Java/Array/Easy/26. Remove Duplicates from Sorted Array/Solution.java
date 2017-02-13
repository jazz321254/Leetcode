/**
 * <pre>
 * 因為不能使用其他資料結構
 * 所以用一個i紀錄有幾個不重複的值並存在原有的array裡
 * ps: 有點看不懂題目 感覺只要return length 但好像原nums也要不重複排列
 * 時間複雜度 O(n) 空間複雜度 O(1)
 * </pre>
 *
 * @author Shawn
 */
 public class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int num : nums){
            if(i == 0 || num > nums[i-1])
                nums[i++] = num;
        }
        return i;
    }
}
