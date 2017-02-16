/**
 * <pre> 
 * 用所謂的 Moore voting algorithm
 * 假設第一個就是眾數 
 * 若下一個數一樣就加1反之減1
 * 若count為零 則恢復初始狀態
 * 最後在判斷count是否大於長度的一半
 * 這是一個我覺得蠻特別的演算法
 * 更特別的是在LeetCode他的執行速度比hashMap快10倍以上
 * 本人猜測可能是測試案例n沒有很大 所以hashMap反而比較慢
 * 若是有人能解我的疑問 歡迎跟我說 謝謝～
 * 時間複雜度 => O(n) 
 * </pre>
 *
 * @author Shawn
 */

public class Solution1 {
    public int majorityElement(int[] nums) {
        int majority = 0, count=0;
        // 假設第一個就是眾數
        for(int i = 0;i< nums.length; i++){ 
            if(count == 0){
                majority = nums[i];
                count = 1;
            }else{
                if(nums[i] == majority)
                    count++;
                else 
                    count--;
            }  
            if(count > nums.length/2)
                return majority;
        }
        return majority;
    }
}
