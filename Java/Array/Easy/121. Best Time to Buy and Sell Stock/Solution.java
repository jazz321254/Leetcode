/**
 * <pre> 
 * 類似DP解法 
 * 不過不需記錄每次步驟結果 只需要紀錄一個目前最大獲利即可
 * 最後將每次最大獲利去最大就是總獲利 時間複雜度 O(n)
 * </pre>
 *
 * @author Shawn
 */
 
public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 0) return 0;
        int currentMax = 0, max = 0;
        
        for(int i = 1; i< prices.length; i++){
            currentMax = Math.max(0, currentMax + prices[i] - prices[i-1]);
            max = Math.max(max, currentMax);
        }
        
        return max;
    }
}
