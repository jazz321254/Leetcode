/**
 * <pre> 
 * 這題想了很久 後來才發現原來只需要從台累加到最後就是答案了
 * 時間複雜度 => O(n)
 * </pre>
 *
 * @author Shawn
 */

public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 0) return 0;
        int max = 0;
        
        for(int i = 1; i< prices.length; i++){
            if(prices[i] > prices[i-1]) max += prices[i] - prices[i-1];
        }
        return max;
    }
}
