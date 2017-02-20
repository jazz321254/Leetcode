/**
 * <pre> 
 * 思考方向 做一個n*n的矩陣
 * 預設都是質數
 * 裡面填入非質數的值 剩下的就是質數
 * 時間複雜度 =>  (N/2 - 2) + (N/3 - 3) + (N/5 - 5) + ... + (N/sqrtN - sqrtN) = O(NloglogN)
 * </pre>
 *
 * @author Shawn
 */

public class Solution {
    public int countPrimes(int n) {
        // 算出非質數
        boolean[] notPrimes = new boolean[n];
        int count = 0;
        for(int i = 2; i<n; i++){
            if(notPrimes[i] == false){
                count++;
                for(int j = 2; i*j<n; j++){
                    notPrimes[i*j] = true;
                }
            }
        }
        return count;
    }
}
