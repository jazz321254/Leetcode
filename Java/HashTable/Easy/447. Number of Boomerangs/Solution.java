/**
 * <pre> 
 * 解題要點用hashMap紀錄距離相同的點
 * 再利用n(n-1)去累加出可能的組合
 * 時間複雜度 O(n^2)
 * </pre>
 *
 * @author Shawn
 */

public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<points.length; i++){
            for(int j=0; j<points.length; j++){
                if(i == j) continue;
                // 算距離並將其存入hashMap 
                int d = getDistance(points[i], points[j]);
                map.put(d, map.getOrDefault(d, 0) + 1);
            }
            // 根據hashMap裡得值計算boomerrages次數
            for(int k : map.values()){
                res += k * (k - 1);
            }
            map.clear();
        }
        return res;
    }
    
    private int getDistance(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];
        return dx*dx + dy*dy;
    }
}
